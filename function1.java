import java.util.*;
class function{
    public static void gamefun(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        gamefun(name); //function calling
    }
}