class main{
    String name;

    public main(){
        name="ASRNindustry";
        System.out.println("constructor called");
    } 
}
class company{
    public static void main(String args[]){
        main obj=new main();
        System.out.println("The company name is ->"+obj.name);
    }
}

//we can access the constructor outside of the class by the help of public
