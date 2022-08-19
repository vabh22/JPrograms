class StudentData
{
    String StuName, S_branch ;
    int roll;
    void setStudentData(String a,String b,int c)
    {
        StuName = a;
        S_branch = b;
        roll = c;
     }
     void getStudentData()
     {
        System.out.println("======Student Data===");
         System.out.println("Student Name :" +StuName);
         System.out.println("Student Branch :" +S_branch);
         System.out.println("Student Roll Number :" +roll);
         System.out.println("************************");
     }
}
class StudentAddress
{
    String hno,sName,city;
    long pin;

    void setStudentAddress(String a,String b,String c,long d)
    {
        hno=a;
        sName=b;
        city=c;
        pin=d;
    }
    void getStudentAddress()
    {
        System.out.println("=====Student Address====");
        System.out.println("Student House Number :" +hno);
        System.out.println("Student Street Name :" +sName);
        System.out.println("Student City :" +city);
        System.out.println("Student Pin :" +pin);
        System.out.println("***********************");
    }

}
class StudentContact
{
    String email;
    long Mob;
    void setStudentContact(String a,long b)
    {
        email=a;
        Mob=b;
    }
    void getStudentContact()
    {
        System.out.println("====Student Contact====");
        System.out.println("Student Email_Id :" +email);
        System.out.println("Student Mobile Number :" +Mob);
        System.out.println("**********************");
    }
}

class StudentResult
{
    int tot;
    float per;
    void setStudentResult(int s1,int s2,int s3,int s4,int s5,int s6)
    {
        tot=s1+s2+s3+s4+s5+s6;
        per=(float)tot/6;
    }
    void getStudentResult()
    {
        System.out.println("Student Total Marks :" +tot);
        System.out.println("Student percentage :" +per);
    }
}
public class StudentDetails {
    public static void main(String[] args)
    {
        StudentData sd=new StudentData();
        sd.setStudentData("Rohan raj","B-Tech.CSE",40);
        sd.getStudentData();
        StudentAddress sa=new StudentAddress();
        sa.setStudentAddress("31A","street97","Patna",844114);
        sa.getStudentAddress();
        StudentContact sc=new StudentContact();
        sc.setStudentContact("rohanraj123@gmail.com",9822322L);
        sc.getStudentContact();
        StudentResult sr=new StudentResult();
        sr.setStudentResult(50,64,54,94,52,83);
        sr.getStudentResult();
    }
    
}
