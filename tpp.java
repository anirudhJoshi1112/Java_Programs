class demo{
    private int l,h,w;
    demo(int x,int y,int z){
        l=x;
        h=y;
        w=z;
    }
    void set(int x,int y,int z){
        l=x;
        h=y;
        w=z;
    }
    void get(){
        System.out.println("abe input daal to "+l);
         System.out.println("ek baar aur daal c "+h);
          System.out.println("fir daal itna bhi nhi aata "+w);
    }
    void volume(){
        System.out.println("the output is "+l*h*w);
    }
}
class abechlto{
    public static void main(String arg[]){
        demo obj1,obj2;
        obj1=new demo(10,20,30);
        obj2=new demo(1,2,3);
        obj1.get();
        obj1.volume();
        obj2.get();
        obj2.volume();
    }
}   