class Box{
    int width;int height;int length;int volume;
    Box(){
        width=5;height=5;length =6;

    }
    void volume(){
        volume=width*height*length;
    }
}
class Main {
    public static void main(String[] args){
        Box ob=new Box();
        System.out.println(ob.volume);
    }
}


