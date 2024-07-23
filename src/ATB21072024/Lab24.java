package ATB21072024;

public class Lab24 {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i%2 ==0)
            {
                System.out.println("Even is"  + i);

                continue;
            }
           System.out.println( "Odd is"  + i);
        }
    }
}
