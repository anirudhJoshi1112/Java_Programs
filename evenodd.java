import java.util.*;
class main{
    public static void evenodd(int n){
         
         if(n%2==0){
            System.out.println("even no.");
         }
         else
         System.out.println("odd no.");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        evenodd(n);
    }
}
