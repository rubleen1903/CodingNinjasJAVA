import java.util.*;
public class sumofn {
    public static int sum(int x) {
        if(x==0)
        {
            return 0;
        }
        else if(x==1)
        {
            return 1 ;
        }
        int ans = sum(x-1);
        return x+ans;
    }
    public static void main(String[] args)
    {   Scanner s = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = s.nextInt(); 
        int ans = sum(n);
        System.out.println(ans);


    }
}

