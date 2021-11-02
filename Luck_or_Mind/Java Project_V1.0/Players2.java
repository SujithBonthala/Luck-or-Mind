import java.io.*;
class Players2
{
    int Auto=0, Life=0, Stock=0, Fire=0;
    double Amount,Salary;
    void Result(double Amount1, double Amount2, String Name1, String Name2)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("                     AWARD CEREMONY");
        if(Amount1>Amount2)
        {
            System.out.println("Gold Medal. "+Name1);
            System.out.println("Silver Medal. "+Name2);
        }
        else if(Amount2>Amount1)
        {
            System.out.println("Gold Medal. "+Name2);
            System.out.println("Silver Medal. "+Name1);
        }
        else
        {
            System.out.println("Gold Medal. "+Name1+" and "+Name2);
        }
        System.out.println("Press Enter to continue");
        br.read();
        System.out.print("\u000C");
    }
    double Revenge1(int Move, double Amount, String Name)throws Exception
    {
        if(Move==41)
        {
            System.out.println("You landed on \"REVENGE! Sue for damages!\"");
            System.out.println("You should take revenge on "+Name);
            System.out.println("Your amount balance was :"+Amount);
            Amount+=100000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(6000);
        }
        else if(Move==55)
        {
            System.out.println("You landed on \"REVENGE! Sue for damages!\"");
            System.out.println("You should take revenge on "+Name);
            System.out.println("Your amount balance was :"+Amount);
            Amount+=100000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(6000);
        }
        else if(Move==72)
        {
            System.out.println("You landed on \"REVENGE! Sue for damages!\"");
            System.out.println("You should take revenge on "+Name);
            System.out.println("Your amount balance was :"+Amount);
            Amount+=100000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(6000);
        }
        else if(Move==103)
        {
            System.out.println("You landed on \"REVENGE! Sue for damages!\"");
            System.out.println("You should take revenge on "+Name);
            System.out.println("Your amount balance was :"+Amount);
            Amount+=100000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(6000);
        }
        else if(Move==126)
        {
            System.out.println("You landed on \"REVENGE! Sue for damages!\"");
            System.out.println("You should take revenge on "+Name);
            System.out.println("Your amount balance was :"+Amount);
            Amount+=100000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(6000);
        }
        return Amount;
    }
    void P2()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Players2 p2[]=new Players2[2];
        String Names1="",Names2="";
        p2[0]=new Players2();
        p2[1]=new Players2();
        int flag1,flag2;
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
        String C="",C2="";
        System.out.println(Names1+", you start your journey of life with $10,000.");
        char ch1=' ';
        p2[0].Amount=10000;
        p2[1].Amount=10000;
        int flag3,flag4;
        do
        {
            flag3=0;
            try
            {
                do
                {
                    System.out.println("Decide if you want auto insurance, which is of $1,000. Type 'Y' if you want or 'N' if you do not want.");
                    ch1=(char)br.read();
                    char ch3=(char)br.read();
                }
                while(ch1!='Y'&&ch1!='y'&&ch1!='N'&&ch1!='n');
            }
            catch(Exception P1)
            {
                System.out.println("Type 'Y' or 'N'");
                flag3=1;
            }
        }
        while(flag3==1);
        if(ch1=='Y'||ch1=='y')
        {
            p2[0].Auto=1;
            System.out.println("So, you continue your game of life with auto insurance. Best of luck.");
            System.out.println("Your amount balance was :"+p2[0].Amount);
            p2[0].Amount-=1000;
            System.out.println("Your amount balance is :"+p2[0].Amount);
            Thread.sleep(6000);
        }
        else
        {
            p2[0].Auto=0;
            System.out.println("So, you continue your game of life without auto insurance. Best of luck.");
            System.out.println("Your amount balance is :"+p2[0].Amount);
            Thread.sleep(6000);
        }
        System.out.println(Names2+", you start your journey of life with $10,000.");
        char ch2=' ';
        do
        {
            flag4=0;
            try
            {
                while(ch2!='Y'&&ch2!='y'&&ch2!='N'&&ch2!='n')
                {
                    System.out.println("Decide if you want auto insurance, which is of $1,000. Type 'Y' if you want or 'N' if you do not want.");
                    ch2=(char)br.read();
                    char ch3=(char)br.read();
                }
            }
            catch(Exception P2)
            {
                System.out.println("Type 'Y' or 'N'");
                flag4=1;
            }
        }
        while(flag4==1);
        if(ch2=='Y'||ch2=='y')
        {
            p2[1].Auto=1;
            System.out.println("So, you continue your journey of life with auto insurance. Best of luck.");
            System.out.println("Your amount balance was :"+p2[1].Amount);
            p2[1].Amount-=1000;
            System.out.println("Your amount balance is :"+p2[1].Amount);
            Thread.sleep(6000);
        }
        else
        {
            p2[1].Auto=0;
            System.out.println("So, you continue your journey of life without auto insurance. Best of luck.");
            System.out.println("Your amount balance is :"+p2[1].Amount);
            Thread.sleep(6000);
        }
        System.out.print("\u000C");
        p2[0].Salary=0;
        p2[1].Salary=0;
        int Move1=0;
        int Move2=0;
        Common C1=new Common();
        int flag5,flag6;
        for(int i=1;i<=2;)
        {
            if(Move1<135)
            {
                C="";
                do
                {
                    flag5=0;
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
                        flag5=1;
                    }
                }
                while(flag5==1);
                Thread.sleep(1500);
                System.out.print("\t\t  Spinning...\n\t\t");
                Thread.sleep(2800);
                int z=Move1;
                int r1=(int)(Math.random()*7.9)+1;
                if(r1==1)
                {
                    System.out.println("You just got 1!!!!");
                    C1.Next(Move1);
                    Thread.sleep(4000);
                    Move1+=1;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    if(Move1==1)
                    {
                        System.out.println("You landed on \"Slow Start! Spin again.\"");
                        System.out.println("Amount Balance is :"+p2[0].Amount);
                        Thread.sleep(5000);
                        System.out.println("The spinner is spinning and the pointer points to...");
                        int t=(int)(Math.random()*7.9)+1;
                        Thread.sleep(6000);
                        System.out.println(t+"!!");
                        Thread.sleep(4000);
                        Move1+=t;
                    }
                    p2[0].Salary=C1.Salary(Move1,p2[0].Salary);
                    Move1=C1.Salary2(Move1);
                    p2[0].Amount=C1.Land(Move1,p2[0].Amount);
                    p2[0].Amount=C1.Auto(Move1,p2[0].Auto,p2[0].Amount);
                    double a1=p2[0].Amount;
                    p2[0].Amount=Revenge1(Move1, p2[0].Amount, Names2);
                    if(a1!=p2[0].Amount)
                    {
                        System.out.println(Names2 +",your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Fire3(Move1,p2[0].Amount,p2[0].Fire);
                    int a=p2[0].Life;
                    p2[0].Life=C1.LifeInsurance1(Move1,z,p2[0].Life);
                    if(p2[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p2[0].Fire;
                    p2[0].Fire=C1.FireInsurance1(Move1,z,p2[0].Fire);
                    if(p2[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p2[0].Stock;
                    p2[0].Stock=C1.Stock1(Move1,z,p2[0].Stock);
                    if(p2[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Payday2(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Stock3(p2[0].Amount,Move1,p2[0].Stock);
                    p2[0].Amount=C1.LifeInsurance3(Move1,p2[0].Amount,p2[0].Life);
                    p2[0].Amount=C1.Stock4(Move1,z,p2[0].Amount,p2[0].Stock);
                    p2[0].Amount=C1.Payday(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Marry(Move1,z,p2[0].Amount);
                    if(p2[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r1==2)
                {
                    System.out.println("The pointer of spinner is pointing towards 2.");
                    C1.Next(Move1);
                    Thread.sleep(4000);
                    Move1+=2;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Salary=C1.Salary(Move1,p2[0].Salary);
                    Move1=C1.Salary2(Move1);
                    p2[0].Amount=C1.Land(Move1,p2[0].Amount);
                    p2[0].Amount=C1.Auto(Move1,p2[0].Auto,p2[0].Amount);
                    double a1=p2[0].Amount;
                    p2[0].Amount=Revenge1(Move1, p2[0].Amount, Names2);
                    if(a1!=p2[0].Amount)
                    {
                        System.out.println(Names2 +",your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Fire3(Move1,p2[0].Amount,p2[0].Fire);
                    int a=p2[0].Life;
                    p2[0].Life=C1.LifeInsurance1(Move1,z,p2[0].Life);
                    if(p2[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p2[0].Fire;
                    p2[0].Fire=C1.FireInsurance1(Move1,z,p2[0].Fire);
                    if(p2[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p2[0].Stock;
                    p2[0].Stock=C1.Stock1(Move1,z,p2[0].Stock);
                    if(p2[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Payday2(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Stock3(p2[0].Amount,Move1,p2[0].Stock);
                    p2[0].Amount=C1.LifeInsurance3(Move1,p2[0].Amount,p2[0].Life);
                    p2[0].Amount=C1.Stock4(Move1,z,p2[0].Amount,p2[0].Stock);
                    p2[0].Amount=C1.Payday(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Marry(Move1,z,p2[0].Amount);
                    if(p2[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r1==3)
                {
                    System.out.println("The pointer of spinner is pointing towards 3.");
                    C1.Next(Move1);
                    Thread.sleep(4000);
                    Move1+=3;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount+=30000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Salary=C1.Salary(Move1,p2[0].Salary);
                    Move1=C1.Salary2(Move1);
                    p2[0].Amount=C1.Land(Move1,p2[0].Amount);
                    p2[0].Amount=C1.Auto(Move1,p2[0].Auto,p2[0].Amount);
                    double a1=p2[0].Amount;
                    p2[0].Amount=Revenge1(Move1, p2[0].Amount, Names2);
                    if(a1!=p2[0].Amount)
                    {
                        System.out.println(Names2 +",your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Fire3(Move1,p2[0].Amount,p2[0].Fire);
                    int a=p2[0].Life;
                    p2[0].Life=C1.LifeInsurance1(Move1,z,p2[0].Life);
                    if(p2[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p2[0].Fire;
                    p2[0].Fire=C1.FireInsurance1(Move1,z,p2[0].Fire);
                    if(p2[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p2[0].Stock;
                    p2[0].Stock=C1.Stock1(Move1,z,p2[0].Stock);
                    if(p2[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Payday2(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Stock3(p2[0].Amount,Move1,p2[0].Stock);
                    p2[0].Amount=C1.LifeInsurance3(Move1,p2[0].Amount,p2[0].Life);
                    p2[0].Amount=C1.Stock4(Move1,z,p2[0].Amount,p2[0].Stock);
                    p2[0].Amount=C1.Payday(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Marry(Move1,z,p2[0].Amount);
                    if(p2[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r1==4)
                {
                    System.out.println("The pointer of spinner is pointing towards 4. Not bad.");
                    C1.Next(Move1);
                    Thread.sleep(4000);
                    Move1+=4;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Salary=C1.Salary(Move1,p2[0].Salary);
                    Move1=C1.Salary2(Move1);
                    p2[0].Amount=C1.Land(Move1,p2[0].Amount);
                    p2[0].Amount=C1.Auto(Move1,p2[0].Auto,p2[0].Amount);
                    double a1=p2[0].Amount;
                    p2[0].Amount=Revenge1(Move1, p2[0].Amount, Names2);
                    if(a1!=p2[0].Amount)
                    {
                        System.out.println(Names2 +",your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Fire3(Move1,p2[0].Amount,p2[0].Fire);
                    int a=p2[0].Life;
                    p2[0].Life=C1.LifeInsurance1(Move1,z,p2[0].Life);
                    if(p2[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p2[0].Fire;
                    p2[0].Fire=C1.FireInsurance1(Move1,z,p2[0].Fire);
                    if(p2[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p2[0].Stock;
                    p2[0].Stock=C1.Stock1(Move1,z,p2[0].Stock);
                    if(p2[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Payday2(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Stock3(p2[0].Amount,Move1,p2[0].Stock);
                    p2[0].Amount=C1.LifeInsurance3(Move1,p2[0].Amount,p2[0].Life);
                    p2[0].Amount=C1.Stock4(Move1,z,p2[0].Amount,p2[0].Stock);
                    p2[0].Amount=C1.Payday(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Marry(Move1,z,p2[0].Amount);
                    if(p2[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r1==5)
                {
                    System.out.println("The pointer of spinner is pointing towards 5.");
                    C1.Next(Move1);
                    Thread.sleep(4000);
                    Move1+=5;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Salary=C1.Salary(Move1,p2[0].Salary);
                    Move1=C1.Salary2(Move1);
                    p2[0].Amount=C1.Land(Move1,p2[0].Amount);
                    p2[0].Amount=C1.Auto(Move1,p2[0].Auto,p2[0].Amount);
                    double a1=p2[0].Amount;
                    p2[0].Amount=Revenge1(Move1, p2[0].Amount, Names2);
                    if(a1!=p2[0].Amount)
                    {
                        System.out.println(Names2 +",your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Fire3(Move1,p2[0].Amount,p2[0].Fire);
                    int a=p2[0].Life;
                    p2[0].Life=C1.LifeInsurance1(Move1,z,p2[0].Life);
                    if(p2[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p2[0].Fire;
                    p2[0].Fire=C1.FireInsurance1(Move1,z,p2[0].Fire);
                    if(p2[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p2[0].Stock;
                    p2[0].Stock=C1.Stock1(Move1,z,p2[0].Stock);
                    if(p2[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Payday2(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Stock3(p2[0].Amount,Move1,p2[0].Stock);
                    p2[0].Amount=C1.LifeInsurance3(Move1,p2[0].Amount,p2[0].Life);
                    p2[0].Amount=C1.Stock4(Move1,z,p2[0].Amount,p2[0].Stock);
                    p2[0].Amount=C1.Payday(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Marry(Move1,z,p2[0].Amount);
                    if(p2[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }  
                else if(r1==6)
                {
                    System.out.println("The pointer of spinner is pointing towards 6. Good spin.");
                    C1.Next(Move1);
                    Thread.sleep(4000);
                    Move1+=6;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Salary=C1.Salary(Move1,p2[0].Salary);
                    Move1=C1.Salary2(Move1);
                    p2[0].Amount=C1.Land(Move1,p2[0].Amount);
                    p2[0].Amount=C1.Auto(Move1,p2[0].Auto,p2[0].Amount);
                    double a1=p2[0].Amount;
                    p2[0].Amount=Revenge1(Move1, p2[0].Amount, Names2);
                    if(a1!=p2[0].Amount)
                    {
                        System.out.println(Names2 +",your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Fire3(Move1,p2[0].Amount,p2[0].Fire);
                    int a=p2[0].Life;
                    p2[0].Life=C1.LifeInsurance1(Move1,z,p2[0].Life);
                    if(p2[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p2[0].Fire;
                    p2[0].Fire=C1.FireInsurance1(Move1,z,p2[0].Fire);
                    if(p2[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p2[0].Stock;
                    p2[0].Stock=C1.Stock1(Move1,z,p2[0].Stock);
                    if(p2[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Payday2(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Stock3(p2[0].Amount,Move1,p2[0].Stock);
                    p2[0].Amount=C1.LifeInsurance3(Move1,p2[0].Amount,p2[0].Life);
                    p2[0].Amount=C1.Stock4(Move1,z,p2[0].Amount,p2[0].Stock);
                    p2[0].Amount=C1.Payday(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Marry(Move1,z,p2[0].Amount);
                    if(p2[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if (r1==7)
                {
                    System.out.println("The pointer of spinner is pointing towards 7. Very good spin.");
                    C1.Next(Move1);
                    Thread.sleep(4000);
                    Move1+=7;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Salary=C1.Salary(Move1,p2[0].Salary);
                    Move1=C1.Salary2(Move1);
                    p2[0].Amount=C1.Land(Move1,p2[0].Amount);
                    p2[0].Amount=C1.Auto(Move1,p2[0].Auto,p2[0].Amount);
                    double a1=p2[0].Amount;
                    p2[0].Amount=Revenge1(Move1, p2[0].Amount, Names2);
                    if(a1!=p2[0].Amount)
                    {
                        System.out.println(Names2 +",your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Fire3(Move1,p2[0].Amount,p2[0].Fire);
                    int a=p2[0].Life;
                    p2[0].Life=C1.LifeInsurance1(Move1,z,p2[0].Life);
                    if(p2[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p2[0].Fire;
                    p2[0].Fire=C1.FireInsurance1(Move1,z,p2[0].Fire);
                    if(p2[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p2[0].Stock;
                    p2[0].Stock=C1.Stock1(Move1,z,p2[0].Stock);
                    if(p2[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Payday2(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Stock3(p2[0].Amount,Move1,p2[0].Stock);
                    p2[0].Amount=C1.LifeInsurance3(Move1,p2[0].Amount,p2[0].Life);
                    p2[0].Amount=C1.Stock4(Move1,z,p2[0].Amount,p2[0].Stock);
                    p2[0].Amount=C1.Payday(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Marry(Move1,z,p2[0].Amount);
                    if(p2[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else
                {
                    System.out.println("What a spin!!! You got 8!!!");
                    C1.Next(Move1);
                    Thread.sleep(4000);
                    Move1+=8;
                    if(Move1==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Salary=C1.Salary(Move1,p2[0].Salary);
                    Move1=C1.Salary2(Move1);
                    p2[0].Amount=C1.Land(Move1,p2[0].Amount);
                    p2[0].Amount=C1.Auto(Move1,p2[0].Auto,p2[0].Amount);
                    double a1=p2[0].Amount;
                    p2[0].Amount=Revenge1(Move1, p2[0].Amount, Names2);
                    if(a1!=p2[0].Amount)
                    {
                        System.out.println(Names2 +",your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Fire3(Move1,p2[0].Amount,p2[0].Fire);
                    int a=p2[0].Life;
                    p2[0].Life=C1.LifeInsurance1(Move1,z,p2[0].Life);
                    if(p2[0].Life==1&&a==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int g=p2[0].Fire;
                    p2[0].Fire=C1.FireInsurance1(Move1,z,p2[0].Fire);
                    if(p2[0].Fire==1&&g==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    int j=p2[0].Stock;
                    p2[0].Stock=C1.Stock1(Move1,z,p2[0].Stock);
                    if(p2[0].Stock==1&&j==0)
                    {
                        System.out.println("Your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[0].Amount=C1.Payday2(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Stock3(p2[0].Amount,Move1,p2[0].Stock);
                    p2[0].Amount=C1.LifeInsurance3(Move1,p2[0].Amount,p2[0].Life);
                    p2[0].Amount=C1.Stock4(Move1,z,p2[0].Amount,p2[0].Stock);
                    p2[0].Amount=C1.Payday(p2[0].Amount,Move1,z,p2[0].Salary);
                    p2[0].Amount=C1.Marry(Move1,z,p2[0].Amount);
                    if(p2[0].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[0].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
            }
            if(Move1>=135&&Move2<135)
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
                    flag6=0;
                    try
                    {
                        do
                        {
                            System.out.println(Names2+", it's your turn!!!Come on, spin the wheel!");
                            C2=br.readLine();
                        }
                        while(!C2.equalsIgnoreCase("Spin"));
                    }
                    catch(Exception P2)
                    {
                        System.out.println("Type 'Spin'");
                        flag6=1;
                    }
                }
                while(flag6==1);
                Thread.sleep(1500);
                System.out.print("\t\t  Spinning...\n\t\t");
                Thread.sleep(2800);
                int r2=(int)(Math.random()*7.9)+1;
                if(r2==1)
                {
                    System.out.println("You just got 1!!!");
                    C1.Next(Move2);
                    Thread.sleep(4000);
                    Move2+=1;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    if(Move2==1)
                    {
                        System.out.println("You landed on \"Slow Start! Spin again.\"");
                        System.out.println("Amount Balance is :"+p2[1].Amount);
                        Thread.sleep(5000);
                        System.out.println("The spinner is spinning and the pointer points to...");
                        int s=(int)(Math.random()*7.9)+1;
                        Thread.sleep(6000);
                        System.out.println(s+"!!");
                        Thread.sleep(4000);
                        Move2+=s;
                    }
                    p2[1].Salary=C1.Salary(Move2,p2[1].Salary);
                    Move2=C1.Salary2(Move2);
                    p2[1].Amount=C1.Land(Move2,p2[1].Amount);
                    p2[1].Amount=C1.Auto(Move2,p2[1].Auto,p2[1].Amount);
                    double a2=p2[1].Amount;
                    p2[1].Amount=Revenge1(Move2, p2[1].Amount, Names1);
                    if(a2!=p2[1].Amount)
                    {
                        System.out.println(Names1 +",your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Fire3(Move2,p2[1].Amount,p2[1].Fire);
                    int m=p2[1].Life;
                    p2[1].Life=C1.LifeInsurance1(Move2,l,p2[1].Life);
                    if(p2[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p2[1].Fire;
                    p2[1].Fire=C1.FireInsurance1(Move2,l,p2[1].Fire);
                    if(p2[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p2[1].Stock;
                    p2[1].Stock=C1.Stock1(Move2,l,p2[1].Stock);
                    if(p2[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Payday2(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Stock3(p2[1].Amount,Move2,p2[1].Stock);
                    p2[1].Amount=C1.LifeInsurance3(Move2,p2[1].Amount,p2[1].Life);
                    p2[1].Amount=C1.Stock4(Move2,l,p2[1].Amount,p2[1].Stock);
                    p2[1].Amount=C1.Payday(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Marry(Move2,l,p2[1].Amount);
                    if(p2[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r2==2)
                {
                    System.out.println("The pointer of spinner is pointing towards 2. Tough luck.");
                    C1.Next(Move2);
                    Thread.sleep(4000);
                    Move2+=2;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Salary=C1.Salary(Move2,p2[1].Salary);
                    Move2=C1.Salary2(Move2);
                    p2[1].Amount=C1.Land(Move2,p2[1].Amount);
                    p2[1].Amount=C1.Auto(Move2,p2[1].Auto,p2[1].Amount);
                    double a2=p2[1].Amount;
                    p2[1].Amount=Revenge1(Move2, p2[1].Amount, Names1);
                    if(a2!=p2[1].Amount)
                    {
                        System.out.println(Names1 +",your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Fire3(Move2,p2[1].Amount,p2[1].Fire);
                    int m=p2[1].Life;
                    p2[1].Life=C1.LifeInsurance1(Move2,l,p2[1].Life);
                    if(p2[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p2[1].Fire;
                    p2[1].Fire=C1.FireInsurance1(Move2,l,p2[1].Fire);
                    if(p2[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p2[1].Stock;
                    p2[1].Stock=C1.Stock1(Move2,l,p2[1].Stock);
                    if(p2[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Payday2(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Stock3(p2[1].Amount,Move2,p2[1].Stock);
                    p2[1].Amount=C1.LifeInsurance3(Move2,p2[1].Amount,p2[1].Life);
                    p2[1].Amount=C1.Stock4(Move2,l,p2[1].Amount,p2[1].Stock);
                    p2[1].Amount=C1.Payday(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Marry(Move2,l,p2[1].Amount);
                    if(p2[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }  
                else if(r2==3)
                {
                    System.out.println("The pointer of spinner is pointing towards 3.");
                    C1.Next(Move2);
                    Thread.sleep(4000);
                    Move2+=3;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount+=30000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Salary=C1.Salary(Move2,p2[1].Salary);
                    Move2=C1.Salary2(Move2);
                    p2[1].Amount=C1.Land(Move2,p2[1].Amount);
                    p2[1].Amount=C1.Auto(Move2,p2[1].Auto,p2[1].Amount);
                    double a2=p2[1].Amount;
                    p2[1].Amount=Revenge1(Move2, p2[1].Amount, Names1);
                    if(a2!=p2[1].Amount)
                    {
                        System.out.println(Names1 +",your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Fire3(Move2,p2[1].Amount,p2[1].Fire);
                    int m=p2[1].Life;
                    p2[1].Life=C1.LifeInsurance1(Move2,l,p2[1].Life);
                    if(p2[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p2[1].Fire;
                    p2[1].Fire=C1.FireInsurance1(Move2,l,p2[1].Fire);
                    if(p2[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p2[1].Stock;
                    p2[1].Stock=C1.Stock1(Move2,l,p2[1].Stock);
                    if(p2[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Payday2(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Stock3(p2[1].Amount,Move2,p2[1].Stock);
                    p2[1].Amount=C1.LifeInsurance3(Move2,p2[1].Amount,p2[1].Life);
                    p2[1].Amount=C1.Stock4(Move2,l,p2[1].Amount,p2[1].Stock);
                    p2[1].Amount=C1.Payday(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Marry(Move2,l,p2[1].Amount);
                    if(p2[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r2==4)
                {
                    System.out.println("The pointer of spinner is pointing towards 4. Not bad.");
                    C1.Next(Move2);
                    Thread.sleep(4000);
                    Move2+=4;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Salary=C1.Salary(Move2,p2[1].Salary);
                    Move2=C1.Salary2(Move2);
                    p2[1].Amount=C1.Land(Move2,p2[1].Amount);
                    p2[1].Amount=C1.Auto(Move2,p2[1].Auto,p2[1].Amount);
                    double a2=p2[1].Amount;
                    p2[1].Amount=Revenge1(Move2, p2[1].Amount, Names1);
                    if(a2!=p2[1].Amount)
                    {
                        System.out.println(Names1 +",your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Fire3(Move2,p2[1].Amount,p2[1].Fire);
                    int m=p2[1].Life;
                    p2[1].Life=C1.LifeInsurance1(Move2,l,p2[1].Life);
                    if(p2[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p2[1].Fire;
                    p2[1].Fire=C1.FireInsurance1(Move2,l,p2[1].Fire);
                    if(p2[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p2[1].Stock;
                    p2[1].Stock=C1.Stock1(Move2,l,p2[1].Stock);
                    if(p2[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Payday2(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Stock3(p2[1].Amount,Move2,p2[1].Stock);
                    p2[1].Amount=C1.LifeInsurance3(Move2,p2[1].Amount,p2[1].Life);
                    p2[1].Amount=C1.Stock4(Move2,l,p2[1].Amount,p2[1].Stock);
                    p2[1].Amount=C1.Payday(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Marry(Move2,l,p2[1].Amount);
                    if(p2[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if(r2==5)
                {
                    System.out.println("The pointer of spinner is pointing towards 5.");
                    C1.Next(Move2);
                    Thread.sleep(4000);
                    Move2+=5;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Salary=C1.Salary(Move2,p2[1].Salary);
                    Move2=C1.Salary2(Move2);
                    p2[1].Amount=C1.Land(Move2,p2[1].Amount);
                    p2[1].Amount=C1.Auto(Move2,p2[1].Auto,p2[1].Amount);
                    double a2=p2[1].Amount;
                    p2[1].Amount=Revenge1(Move2, p2[1].Amount, Names1);
                    if(a2!=p2[1].Amount)
                    {
                        System.out.println(Names1 +",your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Fire3(Move2,p2[1].Amount,p2[1].Fire);
                    int m=p2[1].Life;
                    p2[1].Life=C1.LifeInsurance1(Move2,l,p2[1].Life);
                    if(p2[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p2[1].Fire;
                    p2[1].Fire=C1.FireInsurance1(Move2,l,p2[1].Fire);
                    if(p2[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p2[1].Stock;
                    p2[1].Stock=C1.Stock1(Move2,l,p2[1].Stock);
                    if(p2[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Payday2(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Stock3(p2[1].Amount,Move2,p2[1].Stock);
                    p2[1].Amount=C1.LifeInsurance3(Move2,p2[1].Amount,p2[1].Life);
                    p2[1].Amount=C1.Stock4(Move2,l,p2[1].Amount,p2[1].Stock);
                    p2[1].Amount=C1.Payday(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Marry(Move2,l,p2[1].Amount);
                    if(p2[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }  
                else if(r2==6)
                {
                    System.out.println("The pointer of spinner is pointing towards 6. Good spin.");
                    C1.Next(Move2);
                    Thread.sleep(4000);
                    Move2+=6;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Salary=C1.Salary(Move2,p2[1].Salary);
                    Move2=C1.Salary2(Move2);
                    p2[1].Amount=C1.Land(Move2,p2[1].Amount);
                    p2[1].Amount=C1.Auto(Move2,p2[1].Auto,p2[1].Amount);
                    double a2=p2[1].Amount;
                    p2[1].Amount=Revenge1(Move2, p2[1].Amount, Names1);
                    if(a2!=p2[1].Amount)
                    {
                        System.out.println(Names1 +",your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Fire3(Move2,p2[1].Amount,p2[1].Fire);
                    int m=p2[1].Life;
                    p2[1].Life=C1.LifeInsurance1(Move2,l,p2[1].Life);
                    if(p2[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p2[1].Fire;
                    p2[1].Fire=C1.FireInsurance1(Move2,l,p2[1].Fire);
                    if(p2[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p2[1].Stock;
                    p2[1].Stock=C1.Stock1(Move2,l,p2[1].Stock);
                    if(p2[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Payday2(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Stock3(p2[1].Amount,Move2,p2[1].Stock);
                    p2[1].Amount=C1.LifeInsurance3(Move2,p2[1].Amount,p2[1].Life);
                    p2[1].Amount=C1.Stock4(Move2,l,p2[1].Amount,p2[1].Stock);
                    p2[1].Amount=C1.Payday(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Marry(Move2,l,p2[1].Amount);
                    if(p2[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else if (r2==7)
                {
                    System.out.println("The pointer of spinner is pointing towards 7. Very good spin.");
                    C1.Next(Move2);
                    Thread.sleep(4000);
                    Move2+=7;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Salary=C1.Salary(Move2,p2[1].Salary);
                    Move2=C1.Salary2(Move2);
                    p2[1].Amount=C1.Land(Move2,p2[1].Amount);
                    p2[1].Amount=C1.Auto(Move2,p2[1].Auto,p2[1].Amount);
                    double a2=p2[1].Amount;
                    p2[1].Amount=Revenge1(Move2, p2[1].Amount, Names1);
                    if(a2!=p2[1].Amount)
                    {
                        System.out.println(Names1 +",your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Fire3(Move2,p2[1].Amount,p2[1].Fire);
                    int m=p2[1].Life;
                    p2[1].Life=C1.LifeInsurance1(Move2,l,p2[1].Life);
                    if(p2[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p2[1].Fire;
                    p2[1].Fire=C1.FireInsurance1(Move2,l,p2[1].Fire);
                    if(p2[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p2[1].Stock;
                    p2[1].Stock=C1.Stock1(Move2,l,p2[1].Stock);
                    if(p2[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Payday2(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Stock3(p2[1].Amount,Move2,p2[1].Stock);
                    p2[1].Amount=C1.LifeInsurance3(Move2,p2[1].Amount,p2[1].Life);
                    p2[1].Amount=C1.Stock4(Move2,l,p2[1].Amount,p2[1].Stock);
                    p2[1].Amount=C1.Payday(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Marry(Move2,l,p2[1].Amount);
                    if(p2[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
                else
                {
                    System.out.println("What a spin!!! You got 8!!!");
                    C1.Next(Move2);
                    Thread.sleep(4000);
                    Move2+=8;
                    if(Move2==89)
                    {
                        System.out.println("You landed on \"If you just spun 3, collect $30,000.\"");
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Salary=C1.Salary(Move2,p2[1].Salary);
                    Move2=C1.Salary2(Move2);
                    p2[1].Amount=C1.Land(Move2,p2[1].Amount);
                    p2[1].Amount=C1.Auto(Move2,p2[1].Auto,p2[1].Amount);
                    double a2=p2[1].Amount;
                    p2[1].Amount=Revenge1(Move2, p2[1].Amount, Names1);
                    if(a2!=p2[1].Amount)
                    {
                        System.out.println(Names1 +",your amount balance was :"+p2[0].Amount);
                        p2[0].Amount-=100000;
                        System.out.println("Now your amount balance is :"+p2[0].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Fire3(Move2,p2[1].Amount,p2[1].Fire);
                    int m=p2[1].Life;
                    p2[1].Life=C1.LifeInsurance1(Move2,l,p2[1].Life);
                    if(p2[1].Life==1&&m==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int b=p2[1].Fire;
                    p2[1].Fire=C1.FireInsurance1(Move2,l,p2[1].Fire);
                    if(p2[1].Fire==1&&b==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=10000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    int y=p2[1].Stock;
                    p2[1].Stock=C1.Stock1(Move2,l,p2[1].Stock);
                    if(p2[1].Stock==1&&y==0)
                    {
                        System.out.println("Your amount balance was :"+p2[1].Amount);
                        p2[1].Amount-=50000;
                        System.out.println("Your amount balance is :"+p2[1].Amount);
                        Thread.sleep(6000);
                    }
                    p2[1].Amount=C1.Payday2(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Stock3(p2[1].Amount,Move2,p2[1].Stock);
                    p2[1].Amount=C1.LifeInsurance3(Move2,p2[1].Amount,p2[1].Life);
                    p2[1].Amount=C1.Stock4(Move2,l,p2[1].Amount,p2[1].Stock);
                    p2[1].Amount=C1.Payday(p2[1].Amount,Move2,l,p2[1].Salary);
                    p2[1].Amount=C1.Marry(Move2,l,p2[1].Amount);
                    if(p2[1].Amount<0)
                    {
                        System.out.println("You are indebted to the bank by $"+Math.abs(p2[1].Amount));
                        Thread.sleep(5000);
                    }
                    System.out.print("\u000C");
                }
            }
            if(Move2>=135&&Move1<135)
            {
                 System.out.println("You have completed the game. Wait till "+Names1+" completes the game.");
                 Thread.sleep(4000);
                 System.out.print("\u000C");
            }
            if(Move2>=135&&Move1>=135)
            {
                System.out.println("Both have completed the game. Congrats!!");
                Thread.sleep(4500);
                System.out.print("\u000C");
                i=3;
            }
        }
        System.out.println(Names1+", you will collect $240,000 when you retire.");
        System.out.println("Hence, your total amount will be "+(p2[0].Amount+240000));
        Thread.sleep(6000);
        System.out.print("\u000C");
        System.out.println(Names2+", you will collect $240,000 when you retire.");
        System.out.println("Hence, your total amount will be "+(p2[1].Amount+240000));
        Thread.sleep(6000);
        System.out.print("\u000C");
        Result(p2[0].Amount+240000,p2[1].Amount+240000,Names1,Names2);
    }
}
        