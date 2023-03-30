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
/*a constructor have no arguments called non parameterized constructor
Once a constructor is declared private, it cannot be accessed from outside the class. So, 
creating objects from outside the class is prohibited using the private constructor./*
