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

    private void setUpPupilList() throws IOException
    {
        // first user message
        System.out.println("PupilMark School Pupil mark update");
        System.out.println("** preparing to read data file.");
        
        // read file, fetch data as string array containing the rows 
        String[] dataRows = markFile.readCSVtable();
        // calculate the number of number rows, skip headings
        noOFPupils = dataRows.length - 1;
        
        // update user with number of rows with pupil details
        System.out.println("**" + noOFPupils + " rows read./n/n");
    }

    public void countOKmark()
    {
        // placeholder
    }

}