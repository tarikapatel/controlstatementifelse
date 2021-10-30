public class NestedLoopPrint
{
    public static void main(String []args)
    {
        // it will go for i value loop then into j loop
        for(int i = 2; i<=5; i++)
        {
            //
            for(int j = 7; j<=9; j++ )
            {
                System.out.print(j);//not print ln hence in same line
            }
            System.out.println();
            // 7,8,9 = (i loop value 2 )
            // 7,8,9 = (i loop value 3)
            // 7,8,9 = (i loop value 4 )
            // 7,8,9 = (i loop value 5 )
        }

    }
}
