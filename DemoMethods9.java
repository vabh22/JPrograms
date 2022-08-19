import java.util.Scanner;
class WithDraw
{
    void wDraw(int amt,double balance){
        if(amt<balance){
            System.out.println("Amount withdraw:"+amt);
            balance=balance-amt;
            System.out.println("Balance amount :" +balance);
            System.out.println("Transaction completed");
        }
        else{
            System.out.println("Not founded");
        }
    }
}
class Deposit{
    void deposit(int damt,double balance){
        System.out.println("Amount Deposit:"+damt);       
        balance = balance+damt;
        System.out.println("Balance amount:"+balance);
        System.out.println("Successful Deposit");
        
    }
}
public class DemoMethods9 {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        double balance=2000.0;
        System.out.println("Enter your pin");
        int pin=s.nextInt();
        if(pin==1111 || pin==2222 || pin==3333){
            System.out.println("Select anyone 1.WithDraw 2.Deposit");
            int choice=s.nextInt();
            switch(choice){
                    case 1:
                    System.out.println("Enter the amount:");
                    int amt=s.nextInt();
                    if(amt>0&&amt%100==0){
                        WithDraw wd=new WithDraw();
                        wd.wDraw(amt,balance);
                    }
                    else{
                        System.out.println("Invalied input Please check and try agian");
                    }
                    break;
                    case 2:
                        System.out.println("Enter the amount:");
                        int damt=s.nextInt();
                        if(damt>0 && damt%100==0){
                            Deposit d=new Deposit();
                            d.deposit(damt, balance);
                        }
                        else{
                            System.out.println("Invalied amount");
                        }
                        break;
                        default:
                            System.out.println("Invalied choice");
                    }
                
        }  
                else {
                    System.out.println("Wrong pin please try again");
                }

                        

            
        
    }

    
}
