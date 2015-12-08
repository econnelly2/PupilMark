import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    // array of PUPIL objest
    private PUPIL pupilList[];
    // number of puils to be calculated 
    int noOFPupils;
    FILEREADCSV markFile; //to read file from storage
    FILEWRITECSV resultFile; // to write data to storage

    public SCHOOL()
    {
        // create file handler objects
        markFile = new FILEREADCSV();
        resultFile = new FILEWRITECSV() ;

    }

    // top level algorithm
    public void processPupil() throws IOException
    {
        setUpPupilList();
        countOKmark();

    }

    public void setUpPupilList() throws IOException
    {
        // first user message
        System.out.println("PupilMark School Pupil mark update");
        System.out.println("** preparing to read data file.");

        // read file, fetch data as string array containing the rows 
        String[] dataRows = markFile.readCSVtable();
        // calculate the number of pupil rows
        noOFPupils = dataRows.length;

        // update user with number of rows with pupil details
        System.out.println("**" + noOFPupils + " rows read./n/n");

        // prepare array for pupils
        pupilList = new PUPIL[noOFPupils];
        // create pupil objects and copy data from
        for (int i = 0; i < noOFPupils; i++) {
            pupilList[i] = new PUPIL();
            // adjust to skip headings
            pupilList[i].readPupilsMark(dataRows[i]);
        }
    }

    public void countOKmark() throws IOException 
    {
        // prepare a string to write data to disc
        String fileContent = "";

        System.out.println("A report of pupils with the highest mark\n");

        int topmark = 0;
        //start the count
        //int count = 0;
        // loop for each item : pupil
        for (int i = 0; i < noOFPupils; i++)
        {
            // decide if current item: pupil matches target: mark
            if ((pupilList[i].getmark() > pupilList[topmark].getmark())){
            {
                // add 1 to count: for highest mark
                topmark = pupilList[i].getmark();
                // *display the details for the pupil
                pupilList[i].displayDetails();
                // *join on next line of data for writing to file
                fileContent =
                fileContent.concat(pupilList[i].writeDetails());
            }
        }
        //display the final count: mark
        System.out.println("the name is: " + pupilList+ ", top mark is:" + topmark);
        // a blank line to seperate this report from others.
        pupilList[topmark].displayDetails();
        System.out.println();

        // *send for writing to file as a string containing all data 
        System.out.println("** preparing to write data file.");
        resultFile.writeCSVtable(fileContent);
        System.out.println("** File written and closed.");
    }
}
}