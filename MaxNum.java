class Number{
    int a,b,c,d,e;
    void max(int i,int j,int k)
    {
        a=i;
        b=j;
        c=k;
        if((a>b)&&(a>c)){
            System.out.println(" maximum number:"+a);
         }
         else if((b>a)&&(b>c))
         {
             System.out.println( "Maximum number:"+b);
         }
         else{
             System.out.println("Maximum number:"+c);
         }
    }
    void max(int m,int n){
        d=m;
        e=n;
        if(b>e){
            System.out.println("Maximum number:"+d);
        }
        else{
            System.out.println("Maximum number:"+e);
        }
    }
   
}
class MaxNum{
    public static void main(String[] args){
        Number num=new Number();
        num.max(10,20,30);
        num.max(50,70);
        
    }
}
