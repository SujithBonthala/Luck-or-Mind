import java.io.*;
class Players3
{
    int Auto=0, Life=0, Stock=0, Fire=0;
    double Amount,Salary;
    void Result3(double Amount1, double Amount2, double Amount3, String Name1, String Name2, String Name3)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("                     AWARD CEREMONY");
        if(Amount1==Amount2&&Amount1==Amount3)
        {
            System.out.println("Gold Medal. "+Name1+", "+Name2+" and "+Name3);
        }
        else if(Amount1==Amount2&&Amount1>Amount3)
        {
            System.out.println("Gold Medal. "+Name1+" and "+Name2);
            System.out.println("Silver Medal. "+Name3);
        }
        else if(Amount1==Amount3&&Amount1>Amount2)
        {
            System.out.println("Gold Medal. "+Name1+" and "+Name3);
            System.out.println("Silver Medal. "+Name2);
        }
        else if(Amount2==Amount3&&Amount2>Amount1)
        {
            System.out.println("Gold Medal. "+Name2+" and "+Name3);
            System.out.println("Silver Medal. "+Name1);
        }
        else if(Amount1>Amount2&&Amount2>Amount3)
        {
            System.out.println("Gold Medal. "+Name1);
            System.out.println("Silver Medal. "+Name2);
            System.out.println("Bronze Medal. "+Name3);
        }
        else if(Amount1>Amount3&&Amount3>Amount2)
        {
            System.out.println("Gold Medal. "+Name1);
            System.out.println("Silver Medal. "+Name3);
            System.out.println("Bronze Medal. "+Name2);
        }
        else if(Amount2>Amount1&&Amount1>Amount3)
        {
            System.out.println("Gold Medal. "+Name2);
            System.out.println("Silver Medal. "+Name1);
            System.out.println("Bronze Medal. "+Name3);
        }
        else if(Amount2>Amount3&&Amount3>Amount1)
        {
            System.out.println("Gold Medal. "+Name2);
            System.out.println("Silver Medal. "+Name3);
            System.out.println("Bronze Medal. "+Name1);
        }
        else if(Amount3>Amount1&&Amount1>Amount2)
        {
            System.out.println("Gold Medal. "+Name3);
            System.out.println("Silver Medal. "+Name1);
            System.out.println("Bronze Medal. "+Name2);
        }
        else if(Amount3>Amount2&&Amount2>Amount1)
        {
            System.out.println("Gold Medal. "+Name3);
            System.out.println("Silver Medal. "+Name2);
            System.out.println("Bronze Medal. "+Name1);
        }
        System.out.println("Press Enter to continue");
        br.read();
        System.out.print("\u000C");
    }
    String Revenge2(int Move, double Amount, String Name1, String Name2)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String S="";
        if(Move==41)
        {
            S="";
            System.out.println("You landed on \"REVENGE! Sue for damages!\"");
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("Decide whether you want to take revenge on "+Name1+" or "+Name2);
                        S=br.readLine();
                    }
                    while(!S.equalsIgnoreCase(Name1)&&!S.equalsIgnoreCase(Name2));
                }
                catch(Exception e)
                {
                    System.out.println("Type "+Name1+" or "+Name2+" based on whom you want to take revenge on");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(5000);
        }
        else if(Move==55)
        {
            S="";
            System.out.println("You landed on \"REVENGE! Sue for damages!\"");
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("Decide whether you want to take revenge on "+Name1+" or "+Name2);
                        S=br.readLine();
                    }
                    while(!S.equalsIgnoreCase(Name1)&&!S.equalsIgnoreCase(Name2));
                }
                catch(Exception e)
                {
                    System.out.println("Type "+Name1+" or "+Name2+" based on whom you want to take revenge on");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(5000);
        }
        else if(Move==72)
        {
            S="";
            System.out.println("You landed on \"REVENGE! Sue for damages!\"");
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("Decide whether you want to take revenge on "+Name1+" or "+Name2);
                        S=br.readLine();
                    }
                    while(!S.equalsIgnoreCase(Name1)&&!S.equalsIgnoreCase(Name2));
                }
                catch(Exception e)
                {
                    System.out.println("Type "+Name1+" or "+Name2+" based on whom you want to take revenge on");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(5000);
        }
        else if(Move==103)
        {
            S="";
            System.out.println("You landed on \"REVENGE! Sue for damages!\"");
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("Decide whether you want to take revenge on "+Name1+" or "+Name2);
                        S=br.readLine();
                    }
                    while(!S.equalsIgnoreCase(Name1)&&!S.equalsIgnoreCase(Name2));
                }
                catch(Exception e)
                {
                    System.out.println("Type "+Name1+" or "+Name2+" based on whom you want to take revenge on");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(5000);
        }
        else if(Move==126)
        {
            S="";
            System.out.println("You landed on \"REVENGE! Sue for damages!\"");
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("Decide whether you want to take revenge on "+Name1+" or "+Name2);
                        S=br.readLine();
                    }
                    while(!S.equalsIgnoreCase(Name1)&&!S.equalsIgnoreCase(Name2));
                }
                catch(Exception e)
                {
                    System.out.println("Type "+Name1+" or "+Name2+" based on whom you want to take revenge on");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(5000);
        }
        return S;
    }
    void P3()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Players3 p3[]=new Players3[3];
        String Names1="",Names2="",Names3="";
        p3[0]=new Players3();
        p3[1]=new Players3();
        p3[2]=new Players3();
        int flag1,flag2,flag3;
        do
        {
            flag1=0;
            try
            {
                System.out.println("Enter Player1's Name.");
                Names1=br.readLine();
            }
            catch(Exception P1)
            {
                System.out.println("Please enter a valid name.");
                flag1=1;
            }
        }
        while(flag1==1);
        do
        {
            flag2=0;
            try
            {
                System.out.println("Enter Player2's Name.");
                Names2=br.readLine();
            }
            catch(Exception P2)
            {
                System.out.println("Please enter a valid name.");
                flag2=1;
            }
        }
        while(flag2==1);
        do
        {
            flag3=0;
            try
            {
                System.out.println("Enter Player3's Name.");
                Names3=br.readLine();
            }
            catch(Exception P3)
            {
                System.out.println("Please enter a valid name.");
                flag3=1;
            }
        }
        while(flag3==1);
        String C="",C1="",C11="";
        System.out.println(Names1+", you start your journey of life with $10,000.");
        char ch1=' ';
        p3[0].Amount=10000;
        p3[1].Amount=10000;
        p3[2].Amount=10000;
        int flag4,flag5,flag6;
        do
        {
            flag4=0;
            try
            {
                do
                {
                    System.out.println("Decide if you want auto insurance, which is of $1,000. Type 'Y' if you want or 'N' if you do not want.");
                    ch1=(char)br.read();
                    char ch4=(char)br.read();
                }
                while(ch1!='Y'&&ch1!='y'&&ch1!='N'&&ch1!='n');
            }
            catch(Exception P1)
            {
                System.out.println("Type 'Y' or 'N'");
                flag4=1;
            }
        }
        while(flag4==1);
        if(ch1=='Y'||ch1=='y')
        {
            p3[0].Auto=1;
            System.out.println("So, you continue your game of life with auto insurance. Best of luck.");
            System.out.println("Your amount balance was :"+p3[0].Amount);
            p3[0].Amount-=1000;
            System.out.println("Your amount balance is :"+p3[0].Amount);
            Thread.sleep(6000);
        }
        else
        {
            p3[0].Auto=0;
            System.out.println("So, you continue your game of life without auto insurance. Best of luck.");
            System.out.println("Your amount balance is :"+p3[0].Amount);
            Thread.sleep(6000);
        }
        System.out.println(Names2+", you start your journey of life with $10,000.");
        char ch2=' ';
        do
        {
            flag5=0;
            try
            {
                do
                {
                    System.out.println("Decide if you want auto insurance, which is of $1,000. Type 'Y' if you want or 'N' if you do not want.");
                    ch2=(char)br.read();
                    char ch4=(char)br.read();
                }
                while(ch2!='Y'&&ch2!='y'&&ch2!='N'&&ch2!='n');
            }
            catch(Exception P2)
            {
                System.out.println("Type 'Y' or 'N'");
                flag5=1;
            }
        }
        while(flag5==1);
        if(ch2=='Y'||ch2=='y')
        {
            p3[1].Auto=1;
            System.out.println("So, you continue your journey of life with auto insurance. Best of luck.");
            System.out.println("Your amount balance was :"+p3[1].Amount);
            p3[1].Amount-=1000;
            System.out.println("Your amount balance is :"+p3[1].Amount);
            Thread.sleep(6000);
        }
        else
        {
            p3[1].Auto=0;
            System.out.println("So, you continue your journey of life without auto insurance. Best of luck.");
            System.out.println("Your amount balance is :"+p3[1].Amount);
            Thread.sleep(6000);
        }
        char ch3=' ';
        System.out.println(Names3+", you start your journey of life with $10,000.");
        do
        {
            flag6=0;
            try
            {
                while(ch3!='Y'&&ch3!='y'&&ch3!='N'&&ch3!='n')
                {
                    System.out.println("Decide if you want auto insurance, which is of $1,000. Type 'Y' if you want or 'N' if you do not want.");
                    ch3=(char)br.read();
                    char ch4=(char)br.read();
                }
            }
            catch(Exception P3)
            {
                System.out.println("Type 'Y' or 'N'");
                flag6=1;
            }
        }
        while(flag6==1);
        if(ch3=='Y'||ch3=='y')
        {
            p3[2].Auto=1;
            System.out.println("So, you continue your journey of life with auto insurance. Best of luck.");
            System.out.println("Your amount balance was :"+p3[2].Amount);
            p3[2].Amount-=1000;
            System.out.println("Your amount balance is :"+p3[2].Amount);
            Thread.sleep(6000);
        }
        else
        {
            p3[2].Auto=0;
            System.out.println("So, you continue your journey of life without auto insurance. Best of luck.");
            System.out.println("Your amount balance is :"+p3[2].Amount);
            Thread.sleep(6000);
        }
        System.out.print("\u000C");
        p3[0].Salary=0;
        p3[1].Salary=0;
        p3[2].Salary=0;
        int Move1=0;
        int Move2=0;
        int Move3=0;
        Common C2=new Common();
        int flag7,flag8,flag9;
        for(int i=1;i<=2;)
        {
            if(Move1<135)
            {
                C="";
                do
                {
                    flag7=0;
                    try
                    {
                        while(!C.equalsIgnoreCase("Spin"))
                        {
                            System.out.println(Names1+", it's your turn!!!Come on, spin the wheel.");
                            C=br.readLine();
                        }
                    }
                    catch(Exception P1)
                    {
                        System.out.println("Type 'Spin'");
                        flag7=1;
                    }
                }
                while(flag7==1);
                Thread.sleep(1500);
                System.out.print("\t\t  Spinning...\n\t\t");
                Thread.sleep(2800);
                int z=Move1;
                int r1=(int)(Math.random()*7.9)+1;
                if(r1==1)
                {
                    C2.Next(Move1);
                    Thread.sleep(3000);
                    System.out.println("You just got 1!!!!");
                    Thread.sleep(4000);
                    Move1+=1;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    if(Move1==1)
                    {
                        System.out.println("You landed on \"Slow Start! Spin again.\"");
                        System.out.println("Amount Balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println("The spinner is spinning and the pointer points to...");
                        int t=(int)(Math.random()*7.9)+1;
                        Thread.sleep(6000);
                        System.out.println(t+"!!");
                        Thread.sleep(4000);
                        Move1+=t;
                    }
                    p3[0].Salary=C2.Salary(Move1,p3[0].Salary);
                    Move1=C2.Salary2(Move1);
                    p3[0].Amount=C2.Land(Move1,p3[0].Amount);
                    p3[0].Amount=C2.Auto(Move1,p3[0].Auto,p3[0].Amount);
                    String U=Revenge2(Move1, p3[0].Amount, Names2, Names3);
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[0].Amount=C2.Fire3(Move1,p3[0].Amount,p3[0].Fire);
                    int a=p3[0].Life;
                    p3[0].Life=C2.LifeInsurance1(Move1,z,p3[0].Life);
                    if(p3[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p3[0].Fire;
                    p3[0].Fire=C2.FireInsurance1(Move1,z,p3[0].Fire);
                    if(p3[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p3[0].Stock;
                    p3[0].Stock=C2.Stock1(Move1,z,p3[0].Stock);
                    if(p3[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Amount=C2.Payday2(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Stock3(p3[0].Amount,Move1,p3[0].Stock);
                    p3[0].Amount=C2.LifeInsurance3(Move1,p3[0].Amount,p3[0].Life);
                    p3[0].Amount=C2.Stock4(Move1,z,p3[0].Amount,p3[0].Stock);
                    p3[0].Amount=C2.Payday(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Marry(Move1,z,p3[0].Amount);
                    if(p3[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r1==2)
                {
                    C2.Next(Move1);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 2.");
                    Thread.sleep(4000);
                    Move1+=2;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Salary=C2.Salary(Move1,p3[0].Salary);
                    Move1=C2.Salary2(Move1);
                    p3[0].Amount=C2.Land(Move1,p3[0].Amount);
                    p3[0].Amount=C2.Auto(Move1,p3[0].Auto,p3[0].Amount);
                    String U=Revenge2(Move1, p3[0].Amount, Names2, Names3);
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[0].Amount=C2.Fire3(Move1,p3[0].Amount,p3[0].Fire);
                    int a=p3[0].Life;
                    p3[0].Life=C2.LifeInsurance1(Move1,z,p3[0].Life);
                    if(p3[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p3[0].Fire;
                    p3[0].Fire=C2.FireInsurance1(Move1,z,p3[0].Fire);
                    if(p3[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p3[0].Stock;
                    p3[0].Stock=C2.Stock1(Move1,z,p3[0].Stock);
                    if(p3[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Amount=C2.Payday2(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Stock3(p3[0].Amount,Move1,p3[0].Stock);
                    p3[0].Amount=C2.LifeInsurance3(Move1,p3[0].Amount,p3[0].Life);
                    p3[0].Amount=C2.Stock4(Move1,z,p3[0].Amount,p3[0].Stock);
                    p3[0].Amount=C2.Payday(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Marry(Move1,z,p3[0].Amount);
                    if(p3[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r1==3)
                {
                    C2.Next(Move1);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 3.");
                    Thread.sleep(4000);
                    Move1+=3;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=30000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Salary=C2.Salary(Move1,p3[0].Salary);
                    Move1=C2.Salary2(Move1);
                    p3[0].Amount=C2.Land(Move1,p3[0].Amount);
                    p3[0].Amount=C2.Auto(Move1,p3[0].Auto,p3[0].Amount);
                    String U=Revenge2(Move1, p3[0].Amount, Names2, Names3);
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[0].Amount=C2.Fire3(Move1,p3[0].Amount,p3[0].Fire);
                    int a=p3[0].Life;
                    p3[0].Life=C2.LifeInsurance1(Move1,z,p3[0].Life);
                    if(p3[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p3[0].Fire;
                    p3[0].Fire=C2.FireInsurance1(Move1,z,p3[0].Fire);
                    if(p3[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p3[0].Stock;
                    p3[0].Stock=C2.Stock1(Move1,z,p3[0].Stock);
                    if(p3[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Amount=C2.Payday2(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Stock3(p3[0].Amount,Move1,p3[0].Stock);
                    p3[0].Amount=C2.LifeInsurance3(Move1,p3[0].Amount,p3[0].Life);
                    p3[0].Amount=C2.Stock4(Move1,z,p3[0].Amount,p3[0].Stock);
                    p3[0].Amount=C2.Payday(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Marry(Move1,z,p3[0].Amount);
                    if(p3[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r1==4)
                {
                    C2.Next(Move1);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 4. Not bad.");
                    Thread.sleep(4000);
                    Move1+=4;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Salary=C2.Salary(Move1,p3[0].Salary);
                    Move1=C2.Salary2(Move1);
                    p3[0].Amount=C2.Land(Move1,p3[0].Amount);
                    p3[0].Amount=C2.Auto(Move1,p3[0].Auto,p3[0].Amount);
                    String U=Revenge2(Move1, p3[0].Amount, Names2, Names3);
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[0].Amount=C2.Fire3(Move1,p3[0].Amount,p3[0].Fire);
                    int a=p3[0].Life;
                    p3[0].Life=C2.LifeInsurance1(Move1,z,p3[0].Life);
                    if(p3[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p3[0].Fire;
                    p3[0].Fire=C2.FireInsurance1(Move1,z,p3[0].Fire);
                    if(p3[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p3[0].Stock;
                    p3[0].Stock=C2.Stock1(Move1,z,p3[0].Stock);
                    if(p3[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Amount=C2.Payday2(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Stock3(p3[0].Amount,Move1,p3[0].Stock);
                    p3[0].Amount=C2.LifeInsurance3(Move1,p3[0].Amount,p3[0].Life);
                    p3[0].Amount=C2.Stock4(Move1,z,p3[0].Amount,p3[0].Stock);
                    p3[0].Amount=C2.Payday(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Marry(Move1,z,p3[0].Amount);
                    if(p3[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r1==5)
                {
                    C2.Next(Move1);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 5.");
                    Thread.sleep(4000);
                    Move1+=5;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Salary=C2.Salary(Move1,p3[0].Salary);
                    Move1=C2.Salary2(Move1);
                    p3[0].Amount=C2.Land(Move1,p3[0].Amount);
                    p3[0].Amount=C2.Auto(Move1,p3[0].Auto,p3[0].Amount);
                    String U=Revenge2(Move1, p3[0].Amount, Names2, Names3);
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[0].Amount=C2.Fire3(Move1,p3[0].Amount,p3[0].Fire);
                    int a=p3[0].Life;
                    p3[0].Life=C2.LifeInsurance1(Move1,z,p3[0].Life);
                    if(p3[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p3[0].Fire;
                    p3[0].Fire=C2.FireInsurance1(Move1,z,p3[0].Fire);
                    if(p3[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p3[0].Stock;
                    p3[0].Stock=C2.Stock1(Move1,z,p3[0].Stock);
                    if(p3[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Amount=C2.Payday2(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Stock3(p3[0].Amount,Move1,p3[0].Stock);
                    p3[0].Amount=C2.LifeInsurance3(Move1,p3[0].Amount,p3[0].Life);
                    p3[0].Amount=C2.Stock4(Move1,z,p3[0].Amount,p3[0].Stock);
                    p3[0].Amount=C2.Payday(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Marry(Move1,z,p3[0].Amount);
                    if(p3[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }  
                else if(r1==6)
                {
                    C2.Next(Move1);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 6. Good spin.");
                    Thread.sleep(4000);
                    Move1+=6;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Salary=C2.Salary(Move1,p3[0].Salary);
                    Move1=C2.Salary2(Move1);
                    p3[0].Amount=C2.Land(Move1,p3[0].Amount);
                    p3[0].Amount=C2.Auto(Move1,p3[0].Auto,p3[0].Amount);
                    String U=Revenge2(Move1, p3[0].Amount, Names2, Names3);
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[0].Amount=C2.Fire3(Move1,p3[0].Amount,p3[0].Fire);
                    int a=p3[0].Life;
                    p3[0].Life=C2.LifeInsurance1(Move1,z,p3[0].Life);
                    if(p3[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p3[0].Fire;
                    p3[0].Fire=C2.FireInsurance1(Move1,z,p3[0].Fire);
                    if(p3[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p3[0].Stock;
                    p3[0].Stock=C2.Stock1(Move1,z,p3[0].Stock);
                    if(p3[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Amount=C2.Payday2(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Stock3(p3[0].Amount,Move1,p3[0].Stock);
                    p3[0].Amount=C2.LifeInsurance3(Move1,p3[0].Amount,p3[0].Life);
                    p3[0].Amount=C2.Stock4(Move1,z,p3[0].Amount,p3[0].Stock);
                    p3[0].Amount=C2.Payday(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Marry(Move1,z,p3[0].Amount);
                    if(p3[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if (r1==7)
                {
                    C2.Next(Move1);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 7. Very good spin.");
                    Thread.sleep(4000);
                    Move1+=7;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Salary=C2.Salary(Move1,p3[0].Salary);
                    Move1=C2.Salary2(Move1);
                    p3[0].Amount=C2.Land(Move1,p3[0].Amount);
                    p3[0].Amount=C2.Auto(Move1,p3[0].Auto,p3[0].Amount);
                    String U=Revenge2(Move1, p3[0].Amount, Names2, Names3);
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[0].Amount=C2.Fire3(Move1,p3[0].Amount,p3[0].Fire);
                    int a=p3[0].Life;
                    p3[0].Life=C2.LifeInsurance1(Move1,z,p3[0].Life);
                    if(p3[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p3[0].Fire;
                    p3[0].Fire=C2.FireInsurance1(Move1,z,p3[0].Fire);
                    if(p3[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p3[0].Stock;
                    p3[0].Stock=C2.Stock1(Move1,z,p3[0].Stock);
                    if(p3[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Amount=C2.Payday2(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Stock3(p3[0].Amount,Move1,p3[0].Stock);
                    p3[0].Amount=C2.LifeInsurance3(Move1,p3[0].Amount,p3[0].Life);
                    p3[0].Amount=C2.Stock4(Move1,z,p3[0].Amount,p3[0].Stock);
                    p3[0].Amount=C2.Payday(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Marry(Move1,z,p3[0].Amount);
                    if(p3[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else
                {
                    C2.Next(Move1);
                    Thread.sleep(3000);
                    System.out.println("What a spin!!! You got 8!!!");
                    Thread.sleep(4000);
                    Move1+=8;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Salary=C2.Salary(Move1,p3[0].Salary);
                    Move1=C2.Salary2(Move1);
                    p3[0].Amount=C2.Land(Move1,p3[0].Amount);
                    p3[0].Amount=C2.Auto(Move1,p3[0].Auto,p3[0].Amount);
                    String U=Revenge2(Move1, p3[0].Amount, Names2, Names3);
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names1+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[0].Amount=C2.Fire3(Move1,p3[0].Amount,p3[0].Fire);
                    int a=p3[0].Life;
                    p3[0].Life=C2.LifeInsurance1(Move1,z,p3[0].Life);
                    if(p3[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p3[0].Fire;
                    p3[0].Fire=C2.FireInsurance1(Move1,z,p3[0].Fire);
                    if(p3[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p3[0].Stock;
                    p3[0].Stock=C2.Stock1(Move1,z,p3[0].Stock);
                    if(p3[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(6000);
                    }
                    p3[0].Amount=C2.Payday2(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Stock3(p3[0].Amount,Move1,p3[0].Stock);
                    p3[0].Amount=C2.LifeInsurance3(Move1,p3[0].Amount,p3[0].Life);
                    p3[0].Amount=C2.Stock4(Move1,z,p3[0].Amount,p3[0].Stock);
                    p3[0].Amount=C2.Payday(p3[0].Amount,Move1,z,p3[0].Salary);
                    p3[0].Amount=C2.Marry(Move1,z,p3[0].Amount);
                    if(p3[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
            }
            else if(Move1>=135&&Move2<135&&Move3<135)
            {
                System.out.println("You have completed the game. Wait aside till "+Names2+" and "+Names3+" completes the game.");
                Thread.sleep(4000);
                System.out.print("\u000C");
            }
            else if(Move1>=135&&Move2>=135&&Move3<135)
            {
                System.out.println("You have completed the game. Wait aside till "+Names3+" completes the game.");
                Thread.sleep(4000);
                System.out.print("\u000C");
            }
            else if(Move1>=135&&Move2<135&&Move3>=135)
            {
                System.out.println("You have completed the game. Wait aside till "+Names2+" completes the game.");
                Thread.sleep(4000);
                System.out.print("\u000C");
            }
            int l=Move2;
            if(Move2<135)
            {
                do
                {
                    flag8=0;
                    try
                    {
                        do
                        {
                            System.out.println(Names2+", it's your turn!!!Come on, spin the wheel!");
                            C1=br.readLine();
                        }
                        while(!C1.equalsIgnoreCase("Spin"));
                    }
                    catch(Exception P2)
                    {
                        System.out.println("Type 'Spin'");
                        flag8=1;
                    }
                }
                while(flag8==1);
                Thread.sleep(1500);
                System.out.print("\t\t  Spinning...\n\t\t");
                Thread.sleep(2800);
                int r2=(int)(Math.random()*7.9)+1;
                if(r2==1)
                {
                    C2.Next(Move2);
                    Thread.sleep(3000);
                    System.out.println("You just got 1!!!");
                    Thread.sleep(4000);
                    Move2+=1;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    if(Move2==1)
                    {
                        System.out.println("You landed on \"Slow Start! Spin again.\"");
                        System.out.println("Amount Balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println("The spinner is spinning and the pointer points to...");
                        int s=(int)(Math.random()*7.9)+1;
                        Thread.sleep(6000);
                        System.out.println(s+"!!");
                        Thread.sleep(4000);
                        Move2+=s;
                    }
                    p3[1].Salary=C2.Salary(Move2,p3[1].Salary);
                    Move2=C2.Salary2(Move2);
                    p3[1].Amount=C2.Land(Move2,p3[1].Amount);
                    p3[1].Amount=C2.Auto(Move2,p3[1].Auto,p3[1].Amount);
                    String U=Revenge2(Move2, p3[1].Amount, Names1, Names3);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[1].Amount=C2.Fire3(Move2,p3[1].Amount,p3[1].Fire);
                    int m=p3[1].Life;
                    p3[1].Life=C2.LifeInsurance1(Move2,l,p3[1].Life);
                    if(p3[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p3[1].Fire;
                    p3[1].Fire=C2.FireInsurance1(Move2,l,p3[1].Fire);
                    if(p3[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p3[1].Stock;
                    p3[1].Stock=C2.Stock1(Move2,l,p3[1].Stock);
                    if(p3[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Amount=C2.Payday2(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Stock3(p3[1].Amount,Move2,p3[1].Stock);
                    p3[1].Amount=C2.LifeInsurance3(Move2,p3[1].Amount,p3[1].Life);
                    p3[1].Amount=C2.Stock4(Move2,l,p3[1].Amount,p3[1].Stock);
                    p3[1].Amount=C2.Payday(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Marry(Move2,l,p3[1].Amount);
                    if(p3[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r2==2)
                {
                    C2.Next(Move2);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 2. Tough luck.");
                    Thread.sleep(4000);
                    Move2+=2;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Salary=C2.Salary(Move2,p3[1].Salary);
                    Move2=C2.Salary2(Move2);
                    p3[1].Amount=C2.Land(Move2,p3[1].Amount);
                    p3[1].Amount=C2.Auto(Move2,p3[1].Auto,p3[1].Amount);
                    String U=Revenge2(Move2, p3[1].Amount, Names1, Names3);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[1].Amount=C2.Fire3(Move2,p3[1].Amount,p3[1].Fire);
                    int m=p3[1].Life;
                    p3[1].Life=C2.LifeInsurance1(Move2,l,p3[1].Life);
                    if(p3[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p3[1].Fire;
                    p3[1].Fire=C2.FireInsurance1(Move2,l,p3[1].Fire);
                    if(p3[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p3[1].Stock;
                    p3[1].Stock=C2.Stock1(Move2,l,p3[1].Stock);
                    if(p3[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Amount=C2.Payday2(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Stock3(p3[1].Amount,Move2,p3[1].Stock);
                    p3[1].Amount=C2.LifeInsurance3(Move2,p3[1].Amount,p3[1].Life);
                    p3[1].Amount=C2.Stock4(Move2,l,p3[1].Amount,p3[1].Stock);
                    p3[1].Amount=C2.Payday(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Marry(Move2,l,p3[1].Amount);
                    if(p3[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }  
                else if(r2==3)
                {
                    C2.Next(Move2);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 3.");
                    Thread.sleep(4000);
                    Move2+=3;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=30000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Salary=C2.Salary(Move2,p3[1].Salary);
                    Move2=C2.Salary2(Move2);
                    p3[1].Amount=C2.Land(Move2,p3[1].Amount);
                    p3[1].Amount=C2.Auto(Move2,p3[1].Auto,p3[1].Amount);
                    String U=Revenge2(Move2, p3[1].Amount, Names1, Names3);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[1].Amount=C2.Fire3(Move2,p3[1].Amount,p3[1].Fire);
                    int m=p3[1].Life;
                    p3[1].Life=C2.LifeInsurance1(Move2,l,p3[1].Life);
                    if(p3[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p3[1].Fire;
                    p3[1].Fire=C2.FireInsurance1(Move2,l,p3[1].Fire);
                    if(p3[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p3[1].Stock;
                    p3[1].Stock=C2.Stock1(Move2,l,p3[1].Stock);
                    if(p3[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Amount=C2.Payday2(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Stock3(p3[1].Amount,Move2,p3[1].Stock);
                    p3[1].Amount=C2.LifeInsurance3(Move2,p3[1].Amount,p3[1].Life);
                    p3[1].Amount=C2.Stock4(Move2,l,p3[1].Amount,p3[1].Stock);
                    p3[1].Amount=C2.Payday(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Marry(Move2,l,p3[1].Amount);
                    if(p3[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r2==4)
                {
                    C2.Next(Move2);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 4. Not bad.");
                    Thread.sleep(4000);
                    Move2+=4;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Salary=C2.Salary(Move2,p3[1].Salary);
                    Move2=C2.Salary2(Move2);
                    p3[1].Amount=C2.Land(Move2,p3[1].Amount);
                    p3[1].Amount=C2.Auto(Move2,p3[1].Auto,p3[1].Amount);
                    String U=Revenge2(Move2, p3[1].Amount, Names1, Names3);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[1].Amount=C2.Fire3(Move2,p3[1].Amount,p3[1].Fire);
                    int m=p3[1].Life;
                    p3[1].Life=C2.LifeInsurance1(Move2,l,p3[1].Life);
                    if(p3[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p3[1].Fire;
                    p3[1].Fire=C2.FireInsurance1(Move2,l,p3[1].Fire);
                    if(p3[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p3[1].Stock;
                    p3[1].Stock=C2.Stock1(Move2,l,p3[1].Stock);
                    if(p3[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Amount=C2.Payday2(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Stock3(p3[1].Amount,Move2,p3[1].Stock);
                    p3[1].Amount=C2.LifeInsurance3(Move2,p3[1].Amount,p3[1].Life);
                    p3[1].Amount=C2.Stock4(Move2,l,p3[1].Amount,p3[1].Stock);
                    p3[1].Amount=C2.Payday(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Marry(Move2,l,p3[1].Amount);
                    if(p3[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r2==5)
                {
                    C2.Next(Move2);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 5.");
                    Thread.sleep(4000);
                    Move2+=5;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Salary=C2.Salary(Move2,p3[1].Salary);
                    Move2=C2.Salary2(Move2);
                    p3[1].Amount=C2.Land(Move2,p3[1].Amount);
                    p3[1].Amount=C2.Auto(Move2,p3[1].Auto,p3[1].Amount);
                    String U=Revenge2(Move2, p3[1].Amount, Names1, Names3);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[1].Amount=C2.Fire3(Move2,p3[1].Amount,p3[1].Fire);
                    int m=p3[1].Life;
                    p3[1].Life=C2.LifeInsurance1(Move2,l,p3[1].Life);
                    if(p3[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p3[1].Fire;
                    p3[1].Fire=C2.FireInsurance1(Move2,l,p3[1].Fire);
                    if(p3[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p3[1].Stock;
                    p3[1].Stock=C2.Stock1(Move2,l,p3[1].Stock);
                    if(p3[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Amount=C2.Payday2(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Stock3(p3[1].Amount,Move2,p3[1].Stock);
                    p3[1].Amount=C2.LifeInsurance3(Move2,p3[1].Amount,p3[1].Life);
                    p3[1].Amount=C2.Stock4(Move2,l,p3[1].Amount,p3[1].Stock);
                    p3[1].Amount=C2.Payday(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Marry(Move2,l,p3[1].Amount);
                    if(p3[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }  
                else if(r2==6)
                {
                    C2.Next(Move2);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 6. Good spin.");
                    Thread.sleep(4000);
                    Move2+=6;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Salary=C2.Salary(Move2,p3[1].Salary);
                    Move2=C2.Salary2(Move2);
                    p3[1].Amount=C2.Land(Move2,p3[1].Amount);
                    p3[1].Amount=C2.Auto(Move2,p3[1].Auto,p3[1].Amount);
                    String U=Revenge2(Move2, p3[1].Amount, Names1, Names3);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[1].Amount=C2.Fire3(Move2,p3[1].Amount,p3[1].Fire);
                    int m=p3[1].Life;
                    p3[1].Life=C2.LifeInsurance1(Move2,l,p3[1].Life);
                    if(p3[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p3[1].Fire;
                    p3[1].Fire=C2.FireInsurance1(Move2,l,p3[1].Fire);
                    if(p3[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p3[1].Stock;
                    p3[1].Stock=C2.Stock1(Move2,l,p3[1].Stock);
                    if(p3[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Amount=C2.Payday2(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Stock3(p3[1].Amount,Move2,p3[1].Stock);
                    p3[1].Amount=C2.LifeInsurance3(Move2,p3[1].Amount,p3[1].Life);
                    p3[1].Amount=C2.Stock4(Move2,l,p3[1].Amount,p3[1].Stock);
                    p3[1].Amount=C2.Payday(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Marry(Move2,l,p3[1].Amount);
                    if(p3[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if (r2==7)
                {
                    C2.Next(Move2);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 7. Very good spin.");
                    Thread.sleep(4000);
                    Move2+=7;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Salary=C2.Salary(Move2,p3[1].Salary);
                    Move2=C2.Salary2(Move2);
                    p3[1].Amount=C2.Land(Move2,p3[1].Amount);
                    p3[1].Amount=C2.Auto(Move2,p3[1].Auto,p3[1].Amount);
                    String U=Revenge2(Move2, p3[1].Amount, Names1, Names3);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[1].Amount=C2.Fire3(Move2,p3[1].Amount,p3[1].Fire);
                    int m=p3[1].Life;
                    p3[1].Life=C2.LifeInsurance1(Move2,l,p3[1].Life);
                    if(p3[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p3[1].Fire;
                    p3[1].Fire=C2.FireInsurance1(Move2,l,p3[1].Fire);
                    if(p3[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p3[1].Stock;
                    p3[1].Stock=C2.Stock1(Move2,l,p3[1].Stock);
                    if(p3[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Amount=C2.Payday2(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Stock3(p3[1].Amount,Move2,p3[1].Stock);
                    p3[1].Amount=C2.LifeInsurance3(Move2,p3[1].Amount,p3[1].Life);
                    p3[1].Amount=C2.Stock4(Move2,l,p3[1].Amount,p3[1].Stock);
                    p3[1].Amount=C2.Payday(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Marry(Move2,l,p3[1].Amount);
                    if(p3[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else
                {
                    C2.Next(Move2);
                    Thread.sleep(3000);
                    System.out.println("What a spin!!! You got 8!!!");
                    Thread.sleep(4000);
                    Move2+=8;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Salary=C2.Salary(Move2,p3[1].Salary);
                    Move2=C2.Salary2(Move2);
                    p3[1].Amount=C2.Land(Move2,p3[1].Amount);
                    p3[1].Amount=C2.Auto(Move2,p3[1].Auto,p3[1].Amount);
                    String U=Revenge2(Move2, p3[1].Amount, Names1, Names3);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names3))
                    {
                        System.out.println("So "+Names2+", you are taking revenge on "+Names3);
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names3+", your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                    }
                    p3[1].Amount=C2.Fire3(Move2,p3[1].Amount,p3[1].Fire);
                    int m=p3[1].Life;
                    p3[1].Life=C2.LifeInsurance1(Move2,l,p3[1].Life);
                    if(p3[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p3[1].Fire;
                    p3[1].Fire=C2.FireInsurance1(Move2,l,p3[1].Fire);
                    if(p3[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p3[1].Stock;
                    p3[1].Stock=C2.Stock1(Move2,l,p3[1].Stock);
                    if(p3[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[1].Amount=C2.Payday2(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Stock3(p3[1].Amount,Move2,p3[1].Stock);
                    p3[1].Amount=C2.LifeInsurance3(Move2,p3[1].Amount,p3[1].Life);
                    p3[1].Amount=C2.Stock4(Move2,l,p3[1].Amount,p3[1].Stock);
                    p3[1].Amount=C2.Payday(p3[1].Amount,Move2,l,p3[1].Salary);
                    p3[1].Amount=C2.Marry(Move2,l,p3[1].Amount);
                    if(p3[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
            }
            else if(Move2>=135&&Move1<135&&Move3<135)
            {
                 System.out.println("You have completed the game. Wait till "+Names1+" and "+Names3+" completes the game.");
                 Thread.sleep(4000);
                 System.out.print("\u000C");
            }
            else if(Move2>=135&&Move1>=135&&Move3<135)
            {
                System.out.println("You have completed the game. Wait till "+Names3+" completes the game.");
                Thread.sleep(4000);
                System.out.print("\u000C");
            }
            else if(Move2>=135&&Move1<135&&Move3>=135)
            {
                System.out.println("You have completed the game. Wait till "+Names1+" completes the game.");
                Thread.sleep(4000);
                System.out.print("\u000C");
            }
            if(Move3<135)
            {
                do
                {
                    flag9=0;
                    try
                    {
                        do
                        {
                            System.out.println(Names3+", it's your turn!!!Come on, spin the wheel!");
                            C11=br.readLine();
                        }
                        while(!C11.equalsIgnoreCase("Spin"));
                    }
                    catch(Exception P3)
                    {
                        System.out.println("Type 'Spin'");
                        flag9=1;
                    }
                }
                while(flag9==1);
                Thread.sleep(1500);
                System.out.print("\t\t  Spinning...\n\t\t");
                Thread.sleep(2800);
                int j=Move3;
                int r3=(int)(Math.random()*7.9)+1;
                if(r3==1)
                {
                    C2.Next(Move3);
                    Thread.sleep(3000);
                    System.out.println("You just got 1!!!");
                    Thread.sleep(4000);
                    Move3+=1;
                    if(Move3==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    if(Move3==1)
                    {
                        System.out.println("You landed on \"Slow Start! Spin again.\"");
                        System.out.println("Amount Balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println("The spinner is spinning and the pointer points to...");
                        int s=(int)(Math.random()*7.9)+1;
                        Thread.sleep(6000);
                        System.out.println(s+"!!");
                        Thread.sleep(4000);
                        Move3+=s;
                    }
                    p3[2].Salary=C2.Salary(Move3,p3[2].Salary);
                    Move3=C2.Salary2(Move3);
                    p3[2].Amount=C2.Land(Move3,p3[2].Amount);
                    p3[2].Amount=C2.Auto(Move3,p3[2].Auto,p3[2].Amount);
                    String U=Revenge2(Move3, p3[2].Amount, Names1, Names2);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    p3[2].Amount=C2.Fire3(Move3,p3[2].Amount,p3[2].Fire);
                    int t=p3[2].Life;
                    p3[2].Life=C2.LifeInsurance1(Move3,j,p3[2].Life);
                    if(p3[2].Life==1&&t==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int c=p3[2].Fire;
                    p3[2].Fire=C2.FireInsurance1(Move3,j,p3[2].Fire);
                    if(p3[2].Fire==1&&c==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int f=p3[2].Stock;
                    p3[2].Stock=C2.Stock1(Move3,j,p3[2].Stock);
                    if(p3[2].Stock==1&&f==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Amount=C2.Payday2(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Stock3(p3[2].Amount,Move3,p3[2].Stock);
                    p3[2].Amount=C2.LifeInsurance3(Move3,p3[2].Amount,p3[2].Life);
                    p3[2].Amount=C2.Stock4(Move3,j,p3[2].Amount,p3[2].Stock);
                    p3[2].Amount=C2.Payday(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Marry(Move3,j,p3[2].Amount);
                    if(p3[2].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[2].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r3==2)
                {
                    C2.Next(Move3);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 2. Tough luck.");
                    Thread.sleep(4000);
                    Move3+=2;
                    if(Move3==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Salary=C2.Salary(Move3,p3[2].Salary);
                    Move3=C2.Salary2(Move3);
                    p3[2].Amount=C2.Land(Move3,p3[2].Amount);
                    p3[2].Amount=C2.Auto(Move3,p3[2].Auto,p3[2].Amount);
                    String U=Revenge2(Move3, p3[2].Amount, Names1, Names2);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    p3[2].Amount=C2.Fire3(Move3,p3[2].Amount,p3[2].Fire);
                    int t=p3[2].Life;
                    p3[2].Life=C2.LifeInsurance1(Move3,j,p3[2].Life);
                    if(p3[2].Life==1&&t==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int c=p3[2].Fire;
                    p3[2].Fire=C2.FireInsurance1(Move3,j,p3[2].Fire);
                    if(p3[2].Fire==1&&c==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int f=p3[2].Stock;
                    p3[2].Stock=C2.Stock1(Move3,j,p3[2].Stock);
                    if(p3[2].Stock==1&&f==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Amount=C2.Payday2(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Stock3(p3[2].Amount,Move3,p3[2].Stock);
                    p3[2].Amount=C2.LifeInsurance3(Move3,p3[2].Amount,p3[2].Life);
                    p3[2].Amount=C2.Stock4(Move3,j,p3[2].Amount,p3[2].Stock);
                    p3[2].Amount=C2.Payday(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Marry(Move3,j,p3[2].Amount);
                    if(p3[2].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[2].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }  
                else if(r3==3)
                {
                    C2.Next(Move3);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 3.");
                    Thread.sleep(4000);
                    Move3+=3;
                    if(Move3==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance was :"+p3[1].Amount);
                        p3[1].Amount+=30000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Salary=C2.Salary(Move3,p3[2].Salary);
                    Move3=C2.Salary2(Move3);
                    p3[2].Amount=C2.Land(Move3,p3[2].Amount);
                    p3[2].Amount=C2.Auto(Move3,p3[2].Auto,p3[2].Amount);
                    String U=Revenge2(Move3, p3[2].Amount, Names1, Names2);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    p3[2].Amount=C2.Fire3(Move3,p3[2].Amount,p3[2].Fire);
                    int t=p3[2].Life;
                    p3[2].Life=C2.LifeInsurance1(Move3,j,p3[2].Life);
                    if(p3[2].Life==1&&t==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int c=p3[2].Fire;
                    p3[2].Fire=C2.FireInsurance1(Move3,j,p3[2].Fire);
                    if(p3[2].Fire==1&&c==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int f=p3[2].Stock;
                    p3[2].Stock=C2.Stock1(Move3,j,p3[2].Stock);
                    if(p3[2].Stock==1&&f==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Amount=C2.Payday2(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Stock3(p3[2].Amount,Move3,p3[2].Stock);
                    p3[2].Amount=C2.LifeInsurance3(Move3,p3[2].Amount,p3[2].Life);
                    p3[2].Amount=C2.Stock4(Move3,j,p3[2].Amount,p3[2].Stock);
                    p3[2].Amount=C2.Payday(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Marry(Move3,j,p3[2].Amount);
                    if(p3[2].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[2].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r3==4)
                {
                    C2.Next(Move3);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 4. Not bad.");
                    Thread.sleep(4000);
                    Move3+=4;
                    if(Move3==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Salary=C2.Salary(Move3,p3[2].Salary);
                    Move3=C2.Salary2(Move3);
                    p3[2].Amount=C2.Land(Move3,p3[2].Amount);
                    p3[2].Amount=C2.Auto(Move3,p3[2].Auto,p3[2].Amount);
                    String U=Revenge2(Move3, p3[2].Amount, Names1, Names2);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    p3[2].Amount=C2.Fire3(Move3,p3[2].Amount,p3[2].Fire);
                    int t=p3[2].Life;
                    p3[2].Life=C2.LifeInsurance1(Move3,j,p3[2].Life);
                    if(p3[2].Life==1&&t==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int c=p3[2].Fire;
                    p3[2].Fire=C2.FireInsurance1(Move3,j,p3[2].Fire);
                    if(p3[2].Fire==1&&c==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int f=p3[2].Stock;
                    p3[2].Stock=C2.Stock1(Move3,j,p3[2].Stock);
                    if(p3[2].Stock==1&&f==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Amount=C2.Payday2(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Stock3(p3[2].Amount,Move3,p3[2].Stock);
                    p3[2].Amount=C2.LifeInsurance3(Move3,p3[2].Amount,p3[2].Life);
                    p3[2].Amount=C2.Stock4(Move3,j,p3[2].Amount,p3[2].Stock);
                    p3[2].Amount=C2.Payday(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Marry(Move3,j,p3[2].Amount);
                    if(p3[2].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[2].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r3==5)
                {
                    C2.Next(Move3);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 5.");
                    Thread.sleep(4000);
                    Move3+=5;
                    if(Move3==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Salary=C2.Salary(Move3,p3[2].Salary);
                    Move3=C2.Salary2(Move3);
                    p3[2].Amount=C2.Land(Move3,p3[2].Amount);
                    p3[2].Amount=C2.Auto(Move3,p3[2].Auto,p3[2].Amount);
                    String U=Revenge2(Move3, p3[2].Amount, Names1, Names2);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    p3[2].Amount=C2.Fire3(Move3,p3[2].Amount,p3[2].Fire);
                    int t=p3[2].Life;
                    p3[2].Life=C2.LifeInsurance1(Move3,j,p3[2].Life);
                    if(p3[2].Life==1&&t==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int c=p3[2].Fire;
                    p3[2].Fire=C2.FireInsurance1(Move3,j,p3[2].Fire);
                    if(p3[2].Fire==1&&c==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int f=p3[2].Stock;
                    p3[2].Stock=C2.Stock1(Move3,j,p3[2].Stock);
                    if(p3[2].Stock==1&&f==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Amount=C2.Payday2(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Stock3(p3[2].Amount,Move3,p3[2].Stock);
                    p3[2].Amount=C2.LifeInsurance3(Move3,p3[2].Amount,p3[2].Life);
                    p3[2].Amount=C2.Stock4(Move3,j,p3[2].Amount,p3[2].Stock);
                    p3[2].Amount=C2.Payday(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Marry(Move3,j,p3[2].Amount);
                    if(p3[2].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[2].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }  
                else if(r3==6)
                {
                    C2.Next(Move3);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 6. Good spin.");
                    Thread.sleep(4000);
                    Move3+=6;
                    if(Move3==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Salary=C2.Salary(Move3,p3[2].Salary);
                    Move3=C2.Salary2(Move3);
                    p3[2].Amount=C2.Land(Move3,p3[2].Amount);
                    p3[2].Amount=C2.Auto(Move3,p3[2].Auto,p3[2].Amount);
                    String U=Revenge2(Move3, p3[2].Amount, Names1, Names2);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    p3[2].Amount=C2.Fire3(Move3,p3[2].Amount,p3[2].Fire);
                    int t=p3[2].Life;
                    p3[2].Life=C2.LifeInsurance1(Move3,j,p3[2].Life);
                    if(p3[2].Life==1&&t==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int c=p3[2].Fire;
                    p3[2].Fire=C2.FireInsurance1(Move3,j,p3[2].Fire);
                    if(p3[2].Fire==1&&c==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int f=p3[2].Stock;
                    p3[2].Stock=C2.Stock1(Move3,j,p3[2].Stock);
                    if(p3[2].Stock==1&&f==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Amount=C2.Payday2(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Stock3(p3[2].Amount,Move3,p3[2].Stock);
                    p3[2].Amount=C2.LifeInsurance3(Move3,p3[2].Amount,p3[2].Life);
                    p3[2].Amount=C2.Stock4(Move3,j,p3[2].Amount,p3[2].Stock);
                    p3[2].Amount=C2.Payday(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Marry(Move3,j,p3[2].Amount);
                    if(p3[2].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[2].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if (r3==7)
                {
                    C2.Next(Move3);
                    Thread.sleep(3000);
                    System.out.println("The pointer of spinner is pointing towards 7. Very good spin.");
                    Thread.sleep(4000);
                    Move3+=7;
                    if(Move3==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Salary=C2.Salary(Move3,p3[2].Salary);
                    Move3=C2.Salary2(Move3);
                    p3[2].Amount=C2.Land(Move3,p3[2].Amount);
                    p3[2].Amount=C2.Auto(Move3,p3[2].Auto,p3[2].Amount);
                    String U=Revenge2(Move3, p3[2].Amount, Names1, Names2);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    p3[2].Amount=C2.Fire3(Move3,p3[2].Amount,p3[2].Fire);
                    int t=p3[2].Life;
                    p3[2].Life=C2.LifeInsurance1(Move3,j,p3[2].Life);
                    if(p3[2].Life==1&&t==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int c=p3[2].Fire;
                    p3[2].Fire=C2.FireInsurance1(Move3,j,p3[2].Fire);
                    if(p3[2].Fire==1&&c==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int f=p3[2].Stock;
                    p3[2].Stock=C2.Stock1(Move3,j,p3[2].Stock);
                    if(p3[2].Stock==1&&f==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Amount=C2.Payday2(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Stock3(p3[2].Amount,Move3,p3[2].Stock);
                    p3[2].Amount=C2.LifeInsurance3(Move3,p3[2].Amount,p3[2].Life);
                    p3[2].Amount=C2.Stock4(Move3,j,p3[2].Amount,p3[2].Stock);
                    p3[2].Amount=C2.Payday(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Marry(Move3,j,p3[2].Amount);
                    if(p3[2].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[2].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else
                {
                    C2.Next(Move3);
                    Thread.sleep(3000);
                    System.out.println("What a spin!!! You got 8!!!");
                    Thread.sleep(4000);
                    Move3+=8;
                    if(Move3==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Salary=C2.Salary(Move3,p3[2].Salary);
                    Move3=C2.Salary2(Move3);
                    p3[2].Amount=C2.Land(Move3,p3[2].Amount);
                    p3[2].Amount=C2.Auto(Move3,p3[2].Auto,p3[2].Amount);
                    String U=Revenge2(Move3, p3[2].Amount, Names1, Names2);
                    if(U.equalsIgnoreCase(Names1))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names1);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names1+", your amount balance was :"+p3[0].Amount);
                        p3[0].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[0].Amount);
                        Thread.sleep(5000);
                    }
                    if(U.equalsIgnoreCase(Names2))
                    {
                        System.out.println("So "+Names3+", you are taking revenge on "+Names2);
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount+=100000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(5000);
                        System.out.println(Names2+", your amount balance was :"+p3[1].Amount);
                        p3[1].Amount-=100000;
                        System.out.println("Your amount balance is :"+p3[1].Amount);
                        Thread.sleep(5000);
                    }
                    p3[2].Amount=C2.Fire3(Move3,p3[2].Amount,p3[2].Fire);
                    int t=p3[2].Life;
                    p3[2].Life=C2.LifeInsurance1(Move3,j,p3[2].Life);
                    if(p3[2].Life==1&&t==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int c=p3[2].Fire;
                    p3[2].Fire=C2.FireInsurance1(Move3,j,p3[2].Fire);
                    if(p3[2].Fire==1&&c==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=10000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    int f=p3[2].Stock;
                    p3[2].Stock=C2.Stock1(Move3,j,p3[2].Stock);
                    if(p3[2].Stock==1&&f==0)
                    {
                        System.out.println("Your amount balance was :"+p3[2].Amount);
                        p3[2].Amount-=50000;
                        System.out.println("Your amount balance is :"+p3[2].Amount);
                        Thread.sleep(6000);
                    }
                    p3[2].Amount=C2.Payday2(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Stock3(p3[2].Amount,Move3,p3[2].Stock);
                    p3[2].Amount=C2.LifeInsurance3(Move3,p3[2].Amount,p3[2].Life);
                    p3[2].Amount=C2.Stock4(Move3,j,p3[2].Amount,p3[2].Stock);
                    p3[2].Amount=C2.Payday(p3[2].Amount,Move3,j,p3[2].Salary);
                    p3[2].Amount=C2.Marry(Move3,j,p3[2].Amount);
                    if(p3[2].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p3[2].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
            }
            else if(Move3>=135&&Move1<135&&Move2<135)
            {
                 System.out.println(Names3+", you have completed the game. Wait till "+Names1+" and "+Names2+" completes the game.");
                 Thread.sleep(4000);
                 System.out.print("\u000C");
            }
            else if(Move3>=135&&Move1>=135&&Move2<135)
            {
                System.out.println(Names3+", you have completed the game. Wait till "+Names2+" completes the game.");
                Thread.sleep(4000);
                System.out.print("\u000C");
            }
            else if(Move3>=135&&Move2>=135&&Move2<135)
            {
                System.out.println(Names3+", you have completed the game. Wait till "+Names1+" completes the game.");
                Thread.sleep(4000);
                System.out.print("\u000C");
            }
            if(Move2>=135&&Move1>=135&&Move3>=135)
            {
                System.out.println("All have completed the game. Congrats!!");
                Thread.sleep(4500);
                System.out.print("\u000C");
                i=3;
            }
        }
        System.out.println(Names1+", you will collect $240,000 when you retire.");
        System.out.println("Hence, your total amount will be "+(p3[0].Amount+240000));
        Thread.sleep(6000);
        System.out.print("\u000C");
        System.out.println(Names2+", you will collect $240,000 when you retire.");
        System.out.println("Hence, your total amount will be "+(p3[1].Amount+240000));
        Thread.sleep(6000);
        System.out.print("\u000C");
        System.out.println(Names3+", you will collect $240,000 when you retire.");
        System.out.println("Hence, your total amount will be "+(p3[2].Amount+240000));
        Thread.sleep(6000);
        System.out.print("\u000C");
        Result3(p3[0].Amount+240000,p3[1].Amount+240000,p3[2].Amount+240000,Names1,Names2,Names3);
    }
}