public class PUPIL 
{
    //list of properties 
    private String fname;
    private String sname;
    private int mark;

    public PUPIL()
    {
        //constructor
        //initialise instance vars
        fname = "";
        sname = "";
        mark = 0;
    }

    public void readPupilsMark(String dataItems)
    {
        //unoaxk string of row data into fields 
        String[] rowItems = dataItems.split(",");

        // store each data item as instance property 
        fname = rowItems [0];
        sname = rowItems [1];
        mark = Integer.parseInt(rowItems [2]);

        // produce name & mark of highest mark; 
    }

    public String writeDetails ()
    {
        //join up data into a string to output as a row 
        // use "," to separate csv columns 
        String memberData = "";
        memberData = memberData.concat(fname);
        memberData = memberData.concat(",");
        memberData = memberData.concat(sname);
        memberData = memberData.concat(",");
        memberData = memberData.concat(Float.toString(mark));
        return memberData;
    }   

    public int getdata()
    {
        return mark;
    }

    public String getDetails()
    {
        return "pupil; " + fname +" " + sname;
    }

    public void displayDetails()
    {
        //output basic details
        System.out.print("pupil: " + fname + " " + sname);
        System.out.print(", mark is ");
        System.out.println();
    }

}