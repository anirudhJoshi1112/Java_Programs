import java.util.*;
class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("adult you can vote");
        }
        else{
            System.out.println("not adult you cant vote");
        }
    }
}