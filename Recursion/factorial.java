import java.util.*;
public class factorial{
    public static int fact(int num)
    {
        if(num == 0) {return 1;}
        else
        {
            while(num> 0)
            {
                int ans = fact(num-1);
                return num*ans;
            }

        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = s.nextInt();
        int ans = fact(n);
        System.out.println("Factorial is : "+ ans );
        s.close();
    }
}