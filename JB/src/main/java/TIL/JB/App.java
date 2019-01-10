package TIL.JB;

public class App 
{

    public static void main( String[] args )
    {
        int yr = Integer.parseInt(args[0]);
        if(yr%4 == 0 && yr%100!=0)
        	System.out.println("YES");
        else if(yr%400 == 0)
        	System.out.println("YES");
        else
        	System.out.println("NO");
        
    }
}
