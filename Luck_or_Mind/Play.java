import java.io.*;
class Play
{
    void play()throws Exception
    {
        System.out.print("\u000C");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int Num=0,flag;
        do
        {
            flag=0;
            try
            {
                do
                {
                    System.out.println("Enter the number of players.(Players cannot be lesser than 2 and greater than 4)");
                    Num=Integer.parseInt(br.readLine());
                }
                while(Num>4||Num<2);
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid number for the number of players");
                flag=1;
            }
        }
        while(flag==1);
        if(Num==2)
        {
            Players2 p2=new Players2();
            p2.P2();
        }
        if(Num==3)
        {
            Players3 p3=new Players3();
            p3.P3();
        }
        if(Num==4)
        {
            Players4 p4=new Players4();
            p4.P4();
        }
    }
}
        