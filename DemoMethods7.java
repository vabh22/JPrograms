import java.util.Scanner;
class CustomerDetails{
    String custName,accNo,accType,Email;
    double balance;
    long PhoNo;
    void setCustomerDetails(String a,String b,String c,String d,double e,long f){
        custName=a;
        accNo=b;
        accType=c;
        Email=d;
        balance=e;
        PhoNo=f;
    }
    void getCustomerDetails(){
        System.out.println("====Customer Details====");
        System.out.println("Account Holder Name :" +custName);
        System.out.println("Account Number :" +accNo);
        System.out.println("Account Type :" +accType);
        System.out.println("Account Holder Email Id :" +Email);
        System.out.println("Balance :" +balance);
        System.out.println("Account Holder phone number :" +PhoNo);
        System.out.println("=============================");
    }

}
public class DemoMethods7 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Customer Name");
        String cn= s.nextLine();
        System.out.println("Enter Account Number");
        String ac= s.nextLine();
        System.out.println("Enter Account Type");
        String at= s.nextLine();
        System.out.println("Enter Holder Email id");
        String ei= s.nextLine();
        System.out.println("Enter balance");
        double bal= s.nextDouble();
        System.out.println("Enter holder mobile number");
        long mob= s.nextLong();
        System.out.println("======================");

        CustomerDetails cd=new CustomerDetails();
        cd.setCustomerDetails(cn,ac,at,ei,bal,mob);
        cd.getCustomerDetails();


    }    
}
