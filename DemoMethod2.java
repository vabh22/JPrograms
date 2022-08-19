class EmployeeData{
    String Empid,Empname,Empdes;
    void setEmployeeData(String a,String b, String c){
        Empid=a;
        Empname=b;
        Empdes=c;
    }
    void getEmployeeData(){
        System.out.println("Employee Data====================");
        System.out.println("Employee Id :" +Empid);
        System.out.println("Employee Name :" +Empname);
        System.out.println("Employee des :" +Empdes);
        System.out.println("**********************");
        }   
}
 class EmployeeAddress{
    String hno;
    String StNo;
    String city;
    int pincode;

    void setEmployeeAddress(String a,String b,String c,int d){
        hno=a;
        StNo=b;
        city=c;
        pincode=d;
    }
    void getEmployeeAddress(){
        System.out.println("Employee Address================");
        System.out.println("House number :"+hno);
        System.out.println("Street No :"+StNo);
        System.out.println("City Name :"+city);
        System.out.println("PinCode :" +pincode);
        System.out.println("*******************************");
    }

}
class EmployeeContact{
    String Email;
    long phoneNo;
    void setEmployeeContact(String a,long b){
        Email=a;
        phoneNo=b;
    }
    void getEmployeeContact(){
        System.out.println("Employee Contact=================");
        System.out.println("Email Id :" +Email);
        System.out.println("Phone Number :" +phoneNo);
        System.out.println("*****************************");
    }
}
public class DemoMethod2 {
    public static void main(String[] args){
        EmployeeData ed=new EmployeeData();
        EmployeeAddress ea=new EmployeeAddress();
        EmployeeContact ec=new EmployeeContact();
        ed.setEmployeeData("000E1","Sohan Sharma","IT");
        ed.getEmployeeData();
        ea.setEmployeeAddress("001A","Street-95","Kolkata",750008);
        ea.getEmployeeAddress();
        ec.setEmployeeContact("sohansharma98@gmail.com",969000007l);
        ec.getEmployeeContact();
    }
    
}
