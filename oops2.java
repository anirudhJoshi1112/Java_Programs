class main{
    int i;

    private main(){
        i=10;
        System.out.println("constructor called");
    }
    public static void main(String args[]){
        main obj=new main();
        System.out.println("the number is ->"+obj.i);
    }
}
