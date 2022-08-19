class ProductDetails {
    String pcode;
    String pName;
    float price;
    int pQty;
    void setProductDetails(String a,String b,float c,int d )
    {
        pcode=a;
        pName=b;
        price=c;
        pQty=d;
    }
    void getProductDetails()
    {
        System.out.println("====Details===");
        System.out.println("Product code :" +pcode);
        System.out.println("Product Name :" +pName);
        System.out.println("Product price :" +price);
        System.out.println("Product quntity :" +pQty);

    }
}
public class Product {
    public static void main(String[] args)
    {
        ProductDetails pd = new ProductDetails();
        pd.setProductDetails("0043A","faircream",86.5f,12);
        pd.getProductDetails();


    }
    
}
