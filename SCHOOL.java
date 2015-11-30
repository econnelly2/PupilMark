import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    // array of PUPIL objest
    private PUPIL pupilList[];
    // number of puils to be calculated 
    int noOFPupils;
    FILEREADCSV markFile;

    public SCHOOL()
    {
        markFile = new FILEREADCSV();

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

    public void countOKmark()
    {
        // placeholder
    }

}