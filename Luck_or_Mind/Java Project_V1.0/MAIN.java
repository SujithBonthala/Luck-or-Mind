import java.io.*;
class MAIN
{
    void main()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\t\t\t\t\tWELCOME TO LUCK OR MIND\n\n");
        Thread.sleep(3000);
        System.out.println("\t\t\t\t\t          /\\");
        System.out.println("\t\t\t\t\t         /  \\");
        System.out.println("\t\t\t\t\t        /    \\");
        System.out.println("\t\t\t\t\t       / |    \\");
        System.out.println("\t\t\t\t\t      /  |     \\");
        System.out.println("\t\t\t\t\t     /   |      \\");
        System.out.println("\t\t\t\t\t    /    |____   \\");
        System.out.println("\t\t\t\t\t    \\     OR     /");
        System.out.println("\t\t\t\t\t     \\  |\\  /|  /");
        System.out.println("\t\t\t\t\t      \\ | \\/ | /");
        System.out.println("\t\t\t\t\t       \\|    |/");
        System.out.println("\t\t\t\t\t        \\    /");
        System.out.println("\t\t\t\t\t         \\  /");
        System.out.println("\t\t\t\t\t          \\/");
        Thread.sleep(5000);
        System.out.print("\u000C");
        int C=0,flag;
        do
        {
            flag=0;
            try
            {
                System.out.println("Choose one of the following.");
                System.out.println("1. Luck(The Game of Life)");
                System.out.println("2. Mind(IQ Quiz)");
                System.out.println("3. Exit");
                System.out.println("Choose 1, 2 or 3");
                C=Integer.parseInt(br.readLine());
                if(C>3||C<1)
                {
                    throw new Exception();
                }
                else
                {
                    if(C==1)
                    {
                        System.out.print("\u000C");
                        Luck L=new Luck();
                        L.main();
                    }
                    else if(C==2)
                    {
                        System.out.print("\u000C");
                        Mind M=new Mind();
                        M.main();
                    }
                    else
                    {
                        System.out.print("\u000C");
                        System.out.println("Press X on the window");
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid number(1, 2 or 3)");
                flag=1;
            }
        }
        while(flag==1||C==1||C==2);
    }
}
        