import java.util.*;
class arrays{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int coln = sc.nextInt();
        in t[][] nums = new int[row][coln];

        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                nums[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<coln;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}