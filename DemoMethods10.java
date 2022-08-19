import java.util.Scanner;

class StudentDetails
{
    String studName,studBranch;
    long studRoll;
    void StudentDetails(String a, String b,long c)
    {
        studName=a;
        studBranch=b;
        studRoll=c;
    }
    void getStudentDetails();
    {
        System.out.println("=======================");
        System.out.println("Student Name:"+studName);
        System.out.println("Student Branch:"+studBranch);
        System.out.println("Student Roll Number:"+studRoll);
    }
}
class StudentResult{
        
    
}
public class DemoMethods10 {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Student Name ");
        String Sname=s.nextLine();
        System.out.println("Enter Student branch");
        String Sbranch=s.nextLine();
        boolean b1=false;
        switch(Sbranch)
        {
            case "cse":b1=true;
            break;
            case "ECE":b1=true;
            break;
            case "EEE":b1=true;
            break;
        }//end of switch
        if(b1)
        {
            System.out.println("Enter Roll number");
            long Sroll=s.nextLong();
            if(Sroll==10)
            {
                System.out.println("Roll number is validated:"+Sroll);
            }
            else{
                System.out.println("Invalied roll number");
            }
        }
        if(b2)
        {
            StudentDetails sd=new StudentDetails();
            sd.StudentDetails(Sname,Sbranch,Sroll);
            sd.getStudentDetails();
            System.out.println("Student Result:");
            int sResult=s.nextInt();
            

        }

    }
    
}
