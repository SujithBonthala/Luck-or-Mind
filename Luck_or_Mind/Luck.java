import java.io.*;
class Luck
{
    void main()throws Exception
    {
        Design D=new Design();
        D.display_design();
        menu();
    }
    void menu()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Play p=new Play();
        HTPlay htp=new HTPlay();
        Route R=new Route();
        String x="";
        int flag;
        do
        {
            flag=0;
            try
            {
                do
                {
                    System.out.println("Choose one of the following.(Press Number)");
                    System.out.println("1. Play(It is better if you know how to play before playing)");
                    System.out.println("2. How to play");
                    System.out.println("3. Route of Game of Life");
                    System.out.println("4. Exit");
                    x=br.readLine();
                    x=x.trim();
                }
                while(!x.equals("1")&&!x.equals("2")&&!x.equals("3")&&!x.equals("4"));
            }
            catch(Exception e)
            {
                System.out.println("Choose a valid number(1, 2, 3 or 4)");
                flag=1;
            }
        }
        while(flag==1);
        char y=x.charAt(0);
        switch(y)
        {
            case '1':
            {
                p.play();
            }
            break;
            case '2':
            {
                htp.How_To_Play();
            }
            break;
            case '3':
            {
                R.route();
            }
            break;
            case '4':
            {
                System.out.print("\u000C");
            }
        }
    }
}