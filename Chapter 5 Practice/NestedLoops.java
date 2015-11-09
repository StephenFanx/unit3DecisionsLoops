public class NestedLoops
{
    public static void main(String[] args)
    {
        int x = 1;
        int y = 0;
        int z = 0;
        for (int i=1; i<5; i++)
        {
            y = y + 1;
            System.out.println(x + " " + y);
            z++;
            while (z<8 && z>=4)
            {
                x = 2;
                y = z-3;
                System.out.println(x + " " + y);
                z++;
            }
        }
    }
}
            