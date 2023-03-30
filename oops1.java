class student{
    int age;
    String name;
    public void getinfo(){
        System.out.println("name is ->"+this.name);
        System.out.println("age is ->"+this.age);
    }
}
class oops{
    public static void main(String[] args){
        student s1 = new student();
        s1.name = "Akhil";
        s1.age = 19;

        s1.getinfo();
    }
}