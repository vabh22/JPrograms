class Book {
    String B_code,B_author,B_Name;
    float  B_price;
    int B_Quntity;
    void setBook(String a,String b,String c,float d,int e)
    {
        B_code=a;
        B_author=b;
        B_Name=c;
        B_price=d;
        B_Quntity=e;

    }
    void getBook()
    {
        System.out.println("=====Book Details=====");
        System.out.println("Book code :" +B_code);
        System.out.println("Book Author :" +B_author);
        System.out.println("Book Name :" +B_Name);
        System.out.println("Book Price :" +B_price);
        System.out.println("Book Quntity :" +B_Quntity);
        System.out.println("************************");
    }

}

public class BookDetails {
    public static void main(String[] args)
    {
        Book bo= new Book();
        bo.setBook("00012R","SK Husain","Core JAVA",96.4f,56);
        bo.getBook();

    }

    
}
