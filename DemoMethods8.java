
import java.util.Scanner;
class CourseDetails{
    String CourseId,CourseName,CourseDuration;
    int Coursefee;
    void setCourseDetails(String a, String b, String c, int d){
        CourseId=a;
        CourseName=b;
        CourseDuration=c;
        Coursefee=d;
    }
    void getCourseDetails(){
        System.out.println("Course id :" +CourseId);
        System.out.println("Course Name:" +CourseName);
        System.out.println("Course Duration :" +CourseDuration);
        System.out.println("Course fees :" +Coursefee);
        
    }
}

public class DemoMethods8 {
     public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("Enter Course id");
         String ci=s.nextLine();
         System.out.println("Enter Course Name");
         String cn=s.nextLine();
         System.out.println("Enter Course Duration");
         String cd=s.nextLine();
         System.out.println("Enter Course fees");
         int cf=s.nextInt();
         CourseDetails cod=new CourseDetails();
         cod.setCourseDetails(ci,cn,cd,cf);
         cod.getCourseDetails();
        
    }
    
}
