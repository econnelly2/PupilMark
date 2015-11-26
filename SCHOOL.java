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
    public void processPupil()
    {
        setUpPupilList();
        countOKmark();

    }

    private void setUpPupilList()
    {
        // placeholder
    }

    public void countOKmark()
    {
        // placeholder
    }

}