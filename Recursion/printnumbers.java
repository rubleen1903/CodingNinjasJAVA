import java.util.*;
public class printnumbers {
    public static void print(int n){
        if(n == 1){
       System.out.print(n + " ");
       return;
   }
   
   print(n - 1);
   System.out.print(n+" ");
  
}
   public static void main(String[] args)
   {   Scanner sc = new Scanner(System.in);
       System.out.println("Enter n : ");
       int num = sc.nextInt();
       print(num);sc.close();


}
}
