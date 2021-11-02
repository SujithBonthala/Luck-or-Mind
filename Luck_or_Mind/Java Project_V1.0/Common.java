import java.io.*;
class Common
{
    double Salary(int M, double Salary)throws Exception
    {
        if(Salary==0)
        {
            if(M==8)
            {
                System.out.println("You landed on \"Doctor! Salary $50,000. Go forward 6 spaces.\"");
                Salary=50000;
                Thread.sleep(5000);
            }
            else if(M==9)
            {
                System.out.println("You landed on \"Journalist! Salary $24,000. Go forward 5 spaces.\"");
                Salary=24000;
                Thread.sleep(5000);
            }
            else if(M==10)
            {
                System.out.println("You landed on\"Lawyer! Salary $50,000. Go forward 4 spaces.\"");
                Salary=50000;
                Thread.sleep(5000);
            }
            else if(M==11)
            {
                System.out.println("You landed on \"Teacher! Salary $20,000. Go forward 3 spaces.\"");
                Salary=20000;
                Thread.sleep(5000);
            }
            else if(M==12)
            {
                System.out.println("You landed on \"Physicist! Salary $30,000. Go forward 2 spaces.\"");
                Salary=30000;
                M+=2;
            }
        }
        if(M>=13&&Salary==0)
        {
            System.out.println("You get a job \"University Degree. Salary $16,000.\"");
            Salary=16000;
            Thread.sleep(5000);
        }
        return Salary;
    }
    int Salary2(int Move)
    {
        if(Move==8)
        {
            Move+=6;
        }
        else if(Move==9)
        {
            Move+=5;
        }
        else if(Move==10)
        {
            Move+=4;
        }
        else if(Move==11)
        {
            Move+=3;
        }
        else if(Move==12)
        {
            Move+=2;
        }
        return Move;
    }
    int LifeInsurance1(int M1, int M2, int Life)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(M1>19&&M2<19)
        {
            char che=' ';
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("Meanwhile you crossed a white space \"If you want life insurance, pay $10,000.\"");
                        System.out.println("Type Y if you want and N if you do not want.");
                        che=(char)br.read();
                    }
                    while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Type 'Y' or 'N'");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(4000);
            if(che=='Y'||che=='y')
            {
                 System.out.println("So, you continue your journey of life with life insurance. Best of luck.");
                 Thread.sleep(5000);
                 Life=1;
            }
            else
            {
                System.out.println("So, you continue your journey of life without life insurance. Best of luck.");
                Thread.sleep(5000);
            }
        }
        if(M1==19&&M2<19)
        {
            char che=' ';
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("You landed on a white space \"If you want life insurance, pay $10,000.\"");
                        System.out.println("Type Y if you want and N if you do not want.");
                        che=(char)br.read();
                    }
                    while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Type 'Y' or 'N'");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(4000);
            if(che=='Y'||che=='y')
            {   
                Life=1;
                System.out.println("So, you continue your journey of life with life insurance. Best of luck.");
                Thread.sleep(5000);
            }
            else
            {
                System.out.println("So, you continue your journey of life without life insurance. Best of luck.");
                Thread.sleep(5000);
            }
        }
        return Life;
    }
    int FireInsurance1(int M1, int M2, int Fire)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(M1>33&&M2<33)
        {
            char che=' ';
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("Meanwhile you crossed a white space \"If you want fire insurance, pay $10,000.\"");
                        System.out.println("Type Y if you want and N if you do not want.");
                        che=(char)br.read();
                    }
                    while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Type 'Y' or 'N'");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(4000);
            if(che=='Y'||che=='y')
            {   
                Fire=1;
                System.out.println("So, you continue your journey of life with fire insurance. Best of luck.");
                Thread.sleep(5000);
            }
            else
            {
                System.out.println("So, you continue your journey of life without fire insurance. Best of luck.");
                Thread.sleep(5000);
            }
        }
        if(M1==33&&M2<33)
        {
            char che=' ';
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("You landed on a white space \"If you want fire insurance, pay $10,000.\"");
                        System.out.println("Type Y if you want and N if you do not want.");
                        che=(char)br.read();
                    }
                    while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Type 'Y' or 'N'");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(4000);
            if(che=='Y'||che=='y')
            {   
                Fire=1;
                System.out.println("So, you continue your journey of life with fire insurance. Best of luck.");
                Thread.sleep(5000);
            }
            else
            {
                System.out.println("So, you continue your journey of life without fire insurance. Best of luck.");
                Thread.sleep(5000);
            }
        }
        return Fire;
    }
    int Stock1(int M1, int M2, int Stock)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(M1>44&&M2<44)
        {
            char che=' ';
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("Meanwhile you crossed a white space \"If you want stock, pay $50,000.\"");
                        System.out.println("Type Y if you want and N if you do not want.");
                        che=(char)br.read();
                    }
                    while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Type 'Y' or 'N'");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(4000);
            if(che=='Y'||che=='y')
            {   
                Stock=1;
                System.out.println("So, you continue your journey of life with stock certificate. Best of luck.");
                Thread.sleep(5000);
            }
            else
            {
                System.out.println("So, you continue your journey of life without stock certificate. Best of luck.");
                Thread.sleep(5000);
            }
        }
        if(M1==44&&M2<44)
        {
            char che=' ';
            int flag;
            do
            {
                flag=0;
                try
                {
                    do
                    {
                        System.out.println("You landed on a white space \"If you want stock, pay $50,000.\"");
                        System.out.println("Type Y if you want and N if you do not want.");
                        che=(char)br.read();
                    }
                    while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Typr 'Y' or 'N'");
                    flag=1;
                }
            }
            while(flag==1);
            Thread.sleep(4000);
            if(che=='Y'||che=='y')
            {   
                Stock=1;
                System.out.println("So, you continue your journey of life with stock certificate. Best of luck.");
                Thread.sleep(5000);
            }
            else
            {
                System.out.println("So, you continue your journey of life without stock certificate. Best of luck.");
                Thread.sleep(5000);
            }
        }
        return Stock;
    }
    double Stock3(double Amount, int Move, int Stock)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(Move==46)
        {
            if(Stock==1)
            {
                System.out.println("You landed on a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you have stock certificate, you have the choice of playing the market.");
                char che=' ';
                int flag;
                do
                {
                    flag=0;
                    try
                    {
                        do
                        {
                            System.out.println("Type Y if you wish to play the market or N if you do not.");
                            che=(char)br.read();
                        }
                        while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                    }
                    catch(Exception E)
                    {
                        System.out.println("Type 'Y' or 'N'");
                        flag=1;
                    }
                }
                while(flag==1);
                if(che=='Y'||che=='y')
                {
                    System.out.println("The spinner is spinning and the pointer points to...");
                    Thread.sleep(4000);
                    int e=(int)(Math.random()*7.9)+1;
                    System.out.println(e+"!!");
                    Thread.sleep(3000);
                    if(e==1||e==2||e==3)
                    {
                        System.out.println("Oh!!!You lose $60,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount-=60000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else if(e==4||e==5)
                    {
                        System.out.println("You neither have gains nor losses!");
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else
                    {
                        System.out.println("You are too lucky to have a gain of $120,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount+=120000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                }
            }
            else
            {
                System.out.println("You landed on a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you do not have stock certificate, you do not have the chance of playing the market.");
                System.out.println("Your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==48)
        {
            if(Stock==1)
            {
                System.out.println("You landed on \"Stock prices drop. Pay $36,000 if you own stock.\"");
                System.out.println("Since you have stock certificate, you will pay $36,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount-=36000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Stock prices drop. Pay $36,000 if you own stock.\"");
                System.out.println("Since you do not have stock certificate, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==59)
        {
            if(Stock==1)
            {
                System.out.println("You landed on \"Stocks are up! If you own stock, collect $240,000.\"");
                System.out.println("Since you have stock certificate, you will collect $240,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=240000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Stocks are up! If you own stock, collect $240,000.\"");
                System.out.println("Since you do not have stock certificate, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==61)
        {
            if(Stock==1)
            {
                System.out.println("You landed on \"Stock prices drop. Pay $16,000 if you own stock.\"");
                System.out.println("Since you have stock certificate, you will pay $16,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount-=16000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Stock prices drop. Pay $16,000 if you own stock.\"");
                System.out.println("Since you do not have stock certificate, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==62)
        {
            if(Stock==1)
            {
                System.out.println("You landed on \"Electronics stock skyrockets! Collect $120,000 if you own stock.\"");
                System.out.println("Since you have stock certificate, you will collect $120,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=120000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Electronics stock skyrockets! Collect $120,000 if you own stock.\"");
                System.out.println("Since you do not have stock certificate, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==71)
        {
            if(Stock==1)
            {
                System.out.println("You landed on a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you have stock certificate, you have the choice of playing the market.");
                char che=' ';
                int flag;
                do
                {
                    flag=0;
                    try
                    {
                        do
                        {
                            System.out.println("Type Y if you wish to play the market or N if you do not.");
                            che=(char)br.read();
                        }
                        while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                    }
                    catch(Exception E)
                    {
                        System.out.println("Type 'Y' or 'N'");
                        flag=1;
                    }
                }
                while(flag==1);
                if(che=='Y'||che=='y')
                {
                    System.out.println("The spinner is spinning and the pointer points to...");
                    Thread.sleep(4000);
                    int e=(int)(Math.random()*7.9)+1;
                    System.out.println(e+"!!");
                    Thread.sleep(3000);
                    if(e==1||e==2||e==3)
                    {
                        System.out.println("Oh!!!You lose $60,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount-=60000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else if(e==4||e==5)
                    {
                        System.out.println("You neither have gains nor losses!");
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else
                    {
                        System.out.println("You are too lucky to have a gain of $120,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount+=120000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                }
            }
            else
            {
                System.out.println("You landed on a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you do not have stock certificate, you do not have the chance of playing the market.");
                System.out.println("Your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==81)
        {
            if(Stock==1)
            {
                System.out.println("You landed on \"If you own stock, collect $18,000 dividend.\"");
                System.out.println("Since you have stock certificate, you will collect $18,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=18000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"If you own stock, collect $18,000 dividend.\"");
                System.out.println("Since you do not have stock certificate, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==87)
        {
            if(Stock==1)
            {
                System.out.println("You landed on \"Gold mine! Collect $360,000 if you own stock.\"");
                System.out.println("Since you have stock certificate, you will collect $360,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=360000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Gold mine! Collect $360,000 if you own stock.\"");
                System.out.println("Since you do not have stock certificate, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==99)
        {
            if(Stock==1)
            {
                System.out.println("You landed on a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you have stock certificate, you have the choice of playing the market.");
                char che=' ';
                int flag;
                do
                {
                    flag=0;
                    try
                    {
                        do
                        {
                            System.out.println("Type Y if you wish to play the market or N if you do not.");
                            che=(char)br.read();
                        }
                        while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                    }
                    catch(Exception E)
                    {
                        System.out.println("Type 'Y' or 'N'");
                        flag=1;
                    }
                }
                while(flag==1);
                if(che=='Y'||che=='y')
                {
                    System.out.println("The spinner is spinning and the pointer points to...");
                    Thread.sleep(4000);
                    int e=(int)(Math.random()*7.9)+1;
                    System.out.println(e+"!!");
                    Thread.sleep(3000);
                    if(e==1||e==2||e==3)
                    {
                        System.out.println("Oh!!!You lose $60,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount-=60000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else if(e==4||e==5)
                    {
                        System.out.println("You neither have gains nor losses!");
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else
                    {
                        System.out.println("You are too lucky to have a gain of $120,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount+=120000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                }
            }
            else
            {
                System.out.println("You landed on a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you do not have stock certificate, you do not have the chance of playing the market.");
                System.out.println("Your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==107)
        {
            if(Stock==1)
            {
                System.out.println("You landed on \"Stocks are up! If you own stock, collect $140,000.\"");
                System.out.println("Since you have stock certificate, you will collect $140,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=140000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Stocks are up! If you own stock, collect $140,000.\"");
                System.out.println("Since you do not have stock certificate, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==115)
        {
            if(Stock==1)
            {
                System.out.println("You landed on \"Strike Oil! Collect $480,000 if you own stock.\"");
                System.out.println("Since you have stock certificate, you will collect $480,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=480000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Strike Oil! Collect $480,000 if you own stock.\"");
                System.out.println("Since you do not have stock certificate, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==132)
        {
            if(Stock==1)
            {
                System.out.println("You landed on \"If you own stock, Collect $600,000!\"");
                System.out.println("Since you have stock certificate, you will collect $600,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=600000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"If you own stock, Collect $600,000!\"");
                System.out.println("Since you do not have stock certificate, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        return Amount;
    }
    double Stock4(int M1, int M2, double Amount, int Stock)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(M1>46&&M2<46)
        {
            if(Stock==1)
            {
                System.out.println("Meanwhile you crossed a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you have stock certificate, you have the choice of playing the market.");
                char che=' ';
                int flag;
                do
                {
                    flag=0;
                    try
                    {
                        do
                        {
                            System.out.println("Type Y if you wish to play the market or N if you do not.");
                            che=(char)br.read();
                        }
                        while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                    }
                    catch(Exception E)
                    {
                        System.out.println("Type 'Y' or 'N'");
                        flag=1;
                    }
                }
                while(flag==1);
                if(che=='Y'||che=='y')
                {
                    System.out.println("The spinner is spinning and the pointer points to...");
                    Thread.sleep(4000);
                    int e=(int)(Math.random()*7.9)+1;
                    System.out.println(e+"!!");
                    Thread.sleep(3000);
                    if(e==1||e==2||e==3)
                    {
                        System.out.println("Oh!!!You lose $60,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount-=60000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else if(e==4||e==5)
                    {
                        System.out.println("You neither have gains nor losses!");
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else
                    {
                        System.out.println("You are too lucky to have a gain of $120,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount+=120000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                }
            }
            else
            {
                System.out.println("Meanwhile you crossed a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you do not have stock certificate, you do not have the chance of playing the market.");
                System.out.println("Your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        if(M1>71&&M2<71)
        {
            if(Stock==1)
            {
                System.out.println("Meanwhile you crossed a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you have stock certificate, you have the choice of playing the market.");
                char che=' ';
                int flag;
                do
                {
                    flag=0;
                    try
                    {
                        do
                        {
                            System.out.println("Type Y if you wish to play the market or N if you do not.");
                            che=(char)br.read();
                        }
                        while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                    }
                    catch(Exception E)
                    {
                        System.out.println("Type 'Y' or 'N'");
                        flag=1;
                    }
                }
                while(flag==1);
                if(che=='Y'||che=='y')
                {
                    System.out.println("The spinner is spinning and the pointer points to...");
                    Thread.sleep(4000);
                    int e=(int)(Math.random()*7.9)+1;
                    System.out.println(e+"!!");
                    Thread.sleep(3000);
                    if(e==1||e==2||e==3)
                    {
                        System.out.println("Oh!!!You lose $60,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount-=60000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else if(e==4||e==5)
                    {
                        System.out.println("You neither have gains nor losses!");
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else
                    {
                        System.out.println("You are too lucky to have a gain of $120,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount+=120000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                }
            }
            else
            {
                System.out.println("Meanwhile you crossed a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you do not have stock certificate, you do not have the chance of playing the market.");
                System.out.println("Your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        if(M1>99&&M2<99)
        {
            if(Stock==1)
            {
                System.out.println("Meanwhile you crossed a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you have stock certificate, you have the choice of playing the market.");
                char che=' ';
                int flag;
                do
                {
                    flag=0;
                    try
                    {
                        do
                        {
                            System.out.println("Type Y if you wish to play the market or N if you do not.");
                            che=(char)br.read();
                        }
                        while(che!='Y'&&che!='y'&&che!='N'&&che!='n');
                    }
                    catch(Exception E)
                    {
                        System.out.println("Type 'Y' or 'N'");
                        flag=1;
                    }
                }
                while(flag==1);
                if(che=='Y'||che=='y')
                {
                    System.out.println("The spinner is spinning and the pointer points to...");
                    Thread.sleep(4000);
                    int e=(int)(Math.random()*7.9)+1;
                    System.out.println(e+"!!");
                    Thread.sleep(3000);
                    if(e==1||e==2||e==3)
                    {
                        System.out.println("Oh!!!You lose $60,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount-=60000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else if(e==4||e==5)
                    {
                        System.out.println("You neither have gains nor losses!");
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                    else
                    {
                        System.out.println("You are too lucky to have a gain of $120,000.");
                        System.out.println("Your amount balance was :"+Amount);
                        Amount+=120000;
                        System.out.println("Your amount balance is :"+Amount);
                        Thread.sleep(8000);
                    }
                }
            }
            else
            {
                System.out.println("Meanwhile you crossed a white space \"You may play the market if you own stock.\"");
                System.out.println("Since you do not have stock certificate, you do not have the chance of playing the market.");
                System.out.println("Your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        return Amount;
    }
    double LifeInsurance3(int Move, double Amount, int Life)throws Exception
    {
        if(Move==64)
        {
            if(Life==1)
            {
                System.out.println("You landed on \"If you have life insurance Collect $70,000.\"");
                System.out.println("Since you have life insurance, you may collect $70,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=70000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"If you have life insurance Collect $70,000.\"");
                System.out.println("Since you do not have life insurance, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==78)
        {
            if(Life==1)
            {
                System.out.println("You landed on \"If you have life insurance, collect $60,000.\"");
                System.out.println("Since you have life insurance, you may collect $60,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=60000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"If you have life insurance, collect $60,000.\"");
                System.out.println("Since you do not have life insurance, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==106)
        {
            if(Life==1)
            {
                System.out.println("You landed on \"If you have life insurance, collect $120,000.\"");
                System.out.println("Since you have life insurance, you may collect $120,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=120000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"If you have life insurance, collect $120,000.\"");
                System.out.println("Since you do not have life insurance, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==120)
        {
            if(Life==0)
            {
                System.out.println("You landed on \"Tornado hits home! Pay $100,000 if not insured.\"");
                System.out.println("Since you are not insured, you have to pay $100,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount-=100000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Tornado hits home! Pay $100,000 if not insured.\"");
                System.out.println("Since you have life insurance, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==124)
        {
            if(Life==1)
            {
                System.out.println("You landed on \"If you have life insurance, collect $240,000.\"");
                System.out.println("Since you have life insurance, you may collect $240,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=240000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"If you have life insurance, collect $240,000.\"");
                System.out.println("Since you do not have life insurance, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==133)
        {
            if(Life==1)
            {
                System.out.println("You landed on \"If you have life insurance, collect $240,000.\"");
                System.out.println("Since you have life insurance, you may collect $240,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=240000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"If you have life insurance, collect $240,000.\"");
                System.out.println("Since you do not have life insurance, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        return Amount;
    }
    double Auto(int Move, int Auto, double Amount)throws Exception
    {
        if(Move==26)
        {
            if(Auto==0)
            {
                System.out.println("You landed on \"Car accident. Pay $12,000 if not insured.\"");
                System.out.println("You are not insured, so you have to pay the amount.");
                System.out.println("Your amount balance was :"+Amount);
                Amount-=12000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Car accident. Pay $12,000 if not insured.\"");
                System.out.println("Since you are insured, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==52)
        {
            if(Auto==0)
            {
                System.out.println("You landed on \"Wrecked car! Pay $16,000 if not insured.\"");
                System.out.println("You are not insured, so you have to pay the amount.");
                System.out.println("Your amount balance was :"+Amount);
                Amount-=16000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Wrecked car! Pay $16,000 if not insured.\"");
                System.out.println("Since you are insured, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==73)
        {
            if(Auto==0)
            {
                System.out.println("You landed on \"Reckless driver! Pay $60,000 if not insured.\"");
                System.out.println("You are not insured, so you have to pay the amount.");
                System.out.println("Your amount balance was :"+Amount);
                Amount-=60000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Reckless driver! Pay $60,000 if not insured.\"");
                System.out.println("Since you are insured, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(Move==79)
        {
            if(Auto==0)
            {
                System.out.println("You landed on \"Car accident! Pay $50,000 if not insured.\"");
                System.out.println("You are not insured, so you have to pay the amount.");
                System.out.println("Your amount balance was :"+Amount);
                Amount-=50000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"Car accident! Pay $50,000 if not insured.\"");
                System.out.println("Since you are insured, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        return Amount;
    }
    double Fire3(int Move, double Amount, int Fire)throws Exception
    {
        if(Move==80)
        {
            if(Fire==0)
            {
                System.out.println("You landed on \"House on fire! Pay $60,000 if not insured.\"");
                System.out.println("You are not insured, so you must pay $60,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount-=60000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
            else
            {
                System.out.println("You landed on \"House on fire! Pay $60,000 if not insured.\"");
                System.out.println("Since you are insured, your amount balance remains as :"+Amount);
                Thread.sleep(8000);
            }
        }
        return Amount;
    }
    double Marry(int M1, int M2, double Amount)throws Exception
    {
        if(M1==23&&M2<23)
        {
            System.out.println("You landed on \"Get married! Collect presents.\" Congrats!!");
            Thread.sleep(4000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(3000);
            int g=(int)(Math.random()*7.9)+1;
            System.out.println(g+"!!");
            Thread.sleep(3000);
            if(g==1||g==2||g==3)
            {
                System.out.println("You get nothing as your present.");
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(5000);
            }
            else if(g==4||g==5)
            {
                System.out.println("You get $5,000 as your present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=5000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(5000);
            }
            else
            {
                System.out.println("You get $10,000 as your present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=10000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(5000);
            }
        }
        if(M1>23&&M2<23)
        {
            System.out.println("Meanwhile you crossed a red space \"Get married! Collect presents.\" Congrats!!");
            Thread.sleep(4000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(3000);
            int g=(int)(Math.random()*7.9)+1;
            System.out.println(g+"!!");
            Thread.sleep(3000);
            if(g==1||g==2||g==3)
            {
                System.out.println("You get nothing as your present.");
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(5000);
            }
            else if(g==4||g==5)
            {
                System.out.println("You get $5,000 as your present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=5000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(5000);
            }
            else
            {
                System.out.println("You get $10,000 as your present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=10000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(5000);
            }
        }
        return Amount;
    }
    double Payday2(double Amount, int M1, int M2, double Salary)throws Exception
    {
        if(M1==4&&M2<4)
        {
            System.out.println("You landed on a red space \"Collect $3,000 scholarship.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=3000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==5&&M2<5)
        {
            System.out.println("You landed on a red space \"Pay $5,000 tuition.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=5000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==14&&M2<14)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==21&&M2<21)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==29&&M2<29)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==32&&M2<32)
        {
            System.out.println("You landed on a red space \"Buy a house. Pay $40,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=40000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==34&&M2<34)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==40&&M2<40)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==43&&M2<43)
        {
            System.out.println("You landed on a red space \"Taxes due. Pay half of your salary.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=Salary/2;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==49&&M2<49)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==58&&M2<58)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==63&&M2<63)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==67&&M2<67)
        {
            System.out.println("You landed on a red space \"Taxes due. Pay half of your salary.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=Salary/2;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==70&&M2<70)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==77&&M2<77)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==83&&M2<83)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==91&&M2<91)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==98&&M2<98)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==101&&M2<101)
        {
            System.out.println("You landed on a red space \"Taxes due. Pay half of your salary.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=Salary/2;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==105&&M2<105)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==108&&M2<108)
        {
            System.out.println("You landed on a red space \"Help homeless children. Give $120,000 to orphanage.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=120000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==110&&M2<110)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==116&&M2<116)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==118&&M2<118)
        {
            System.out.println("You landed on a red space \"Property taxes! Pay $50,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=50000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==121&&M2<121)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1==129&&M2<129)
        {
            System.out.println("You landed on a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        return Amount;
    }
    double Payday(double Amount, int M1, int M2, double Salary)throws Exception
    {
        if(M1>4&&M2<4)
        {
            System.out.println("Meanwhile you crossed a red space \"Collect $3,000 scholarship.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=3000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>5&&M2<5)
        {
            System.out.println("Meanwhile you crossed a red space \"Pay $5,000 tuition.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=5000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>14&&M2<14)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>21&&M2<21)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>29&&M2<29)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>32&&M2<32)
        {
            System.out.println("Meanwhile you crossed a red space \"Buy a house. Pay $40,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=40000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>34&&M2<34)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>40&&M2<40)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>43&&M2<43)
        {
            System.out.println("Meanwhile you crossed a red space \"Taxes due. Pay half of your salary.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=Salary/2;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>49&&M2<49)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>58&&M2<58)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>63&&M2<63)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>67&&M2<67)
        {
            System.out.println("Meanwhile you crossed a red space \"Taxes due. Pay half of your salary.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=Salary/2;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>70&&M2<70)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>77&&M2<77)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>83&&M2<83)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>91&&M2<91)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>98&&M2<98)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>101&&M2<101)
        {
            System.out.println("Meanwhile you crossed a red space \"Taxes due. Pay half of your salary.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=Salary/2;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>105&&M2<105)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>108&&M2<108)
        {
            System.out.println("Meanwhile you crossed a red space \"Help homeless children. Give $120,000 to orphanage.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=120000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>110&&M2<110)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>116&&M2<116)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>118&&M2<118)
        {
            System.out.println("Meanwhile you crossed a red space \"Property taxes! Pay $50,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=50000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>121&&M2<121)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        if(M1>129&&M2<129)
        {
            System.out.println("Meanwhile you crossed a \"PAY DAY!\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=Salary;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        return Amount;
    }
    double Land(int M, double Amount)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        if(M==2)
        {
            System.out.println("You landed on \"Capture escaped lion! Collect $4,000.\"");
            System.out.println("Amount Balance was :"+Amount);
            Amount+=4000;
            System.out.println("Amount Balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==3)
        {
            System.out.println("You landed on \"Car repairs. Pay $2,000.\"");
            System.out.println("Amount Balance was :"+Amount);
            Amount-=2000;
            System.out.println("Amount Balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==6)
        {
            System.out.println("You landed on \"Collect $2,000 for prize photo.\"");
            System.out.println("Amount Balance was :"+Amount);
            Amount+=2000;
            System.out.println("Amount Balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==7)
        {
            System.out.println("You landed on \"Gambling loss! Pay $2,000.\"");
            System.out.println("Amount Balance was :"+Amount);
            Amount-=2000;
            System.out.println("Amount Balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==15)
        {
            System.out.println("You landed on \"It's your birthday! Collect $1,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=1000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==16)
        {
            System.out.println("You landed on \"Discover uranium! Collect $240,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=240000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==17)
        {
            System.out.println("You landed on \"Start a business. Pay $30,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=30000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==18)
        {
            System.out.println("You landed on \"Inheritance! Collect $300,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=300000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==20)
        {
            System.out.println("You landed on \"Find art treasure! Collect $120,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=120000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==22)
        {
            System.out.println("You landed on \"Uncle needs help. Pay $2,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=2000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==24)
        {
            System.out.println("You landed on \"Business Trip. Pay $3,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=3000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==25)
        {
            System.out.println("You landed on \"Buy furniture. Pay $6,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=6000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==27)
        {
            System.out.println("You landed on \"Business needs to advertise. Pay $60,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=60000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==28)
        {
            System.out.println("You landed on \"Buy two horses. Pay $60,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=60000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==30)
        {
            System.out.println("You landed on \"Help your father-in-law. Pay $20,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=20000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==31)
        {
            System.out.println("You landed on \"Win the lottery! Collect $96,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=96000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==35)
        {
            System.out.println("You landed on \"LUCKY DAY! Collect $20,000. Keep it or try for $300,000.\"");
            int s=0,t=0;
            int flag1,flag2;
            do
            {
                flag1=0;
                try
                {
                    while(s==t)
                    {
                        do
                        {
                            System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                            s=Integer.parseInt(br.readLine());
                            t=Integer.parseInt(br.readLine());
                        }
                        while((s<1||s>8)||(t<1||t>8));
                    }
                }
                catch(Exception E)
                {
                    System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                    flag1=1;
                }
            }
            while(flag1==1);
            Thread.sleep(2000);
            char q=' ';
            do
            {
                flag2=0;
                try
                {
                    do
                    {
                        System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                        q=(char)br.read();
                    }
                    while(q!='Y'&&q!='y'&&q!='N'&&q!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                    flag2=1;
                }
            }
            while(flag2==1);
            if(q=='Y'||q=='y')
            {
                System.out.println("The spinner is spinning and the pointer points to...");
                int z=(int)(Math.random()*7.9)+1;
                Thread.sleep(3000);
                System.out.println(z+"!!");
                if(z==s||z==t)
                {
                    System.out.println("Wow, you get $300,000.");
                    System.out.println("Your amount balance was :"+Amount);
                    Amount+=300000;
                    System.out.println("Your amount balance is :"+Amount);
                    Thread.sleep(8000);
                }
                else
                {
                    System.out.println("Oh no!! You do not get your $20,000.");
                    System.out.println("Your amount balance remains as :"+Amount);
                    Thread.sleep(5000);
                }
            }
            else
            {
                System.out.println("So, you get your $20,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=20000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(M==36)
        {
            System.out.println("You landed on \"A son is born! Collect presents.\"");
            Thread.sleep(3000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(4000);
            int y=(int)(Math.random()*7.9)+1;
            System.out.println(y+"!!");
            Thread.sleep(2500);
            if(y==1||y==2||y==3)
            {
                System.out.println("Sorry!! You do not get any present for your son.");
                System.out.println("Your amount balance is "+Amount);
            }
            else if(y==4||y==5)
            {
                System.out.println("Congrats!! You have got $1,000 as your son's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=1000;
                System.out.println("Your amount balance is :"+Amount);
            }
            else
            {
                System.out.println("Wow!! You have got $2,000 as your son's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=2000;
                System.out.println("Your amount balance is :"+Amount);
            }
            Thread.sleep(8000);
        }
        else if(M==37)
        {
            System.out.println("You landed on \"Aunt leaves you 50 cats. Pay $20,000 for their care.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=20000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==38)
        {
            System.out.println("You landed on \"A daughter is born! Collect presents.\"");
            Thread.sleep(3000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(4000);
            int y=(int)(Math.random()*7.9)+1;
            System.out.println(y+"!!");
            Thread.sleep(2500);
            if(y==1||y==2||y==3)
            {
                System.out.println("Sorry!! You do not get any present for your daughter.");
                System.out.println("Your amount balance is "+Amount);
            }
            else if(y==4||y==5)
            {
                System.out.println("Congrats!! You have got $1,000 as your daughter's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=1000;
                System.out.println("Your amount balance is :"+Amount);
            }
            else
            {
                System.out.println("Wow!! You have got $2,000 as your daughter's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=2000;
                System.out.println("Your amount balance is :"+Amount);
            }
            Thread.sleep(8000);
        }
        else if(M==39)
        {
            System.out.println("You landed on \"Win on horses! Collect $300,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=300000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==42)
        {
            System.out.println("You landed on \"Twin sons are born! Collect presents.\"");
            Thread.sleep(3000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(4000);
            int y=(int)(Math.random()*7.9)+1;
            System.out.println(y+"!!");
            Thread.sleep(2500);
            if(y==1||y==2||y==3)
            {
                System.out.println("Sorry!! You do not get any present for your sons.");
                System.out.println("Your amount balance is "+Amount);
            }
            else if(y==4||y==5)
            {
                System.out.println("Congrats!! You have got $2,000 as your sons' present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=2000;
                System.out.println("Your amount balance is :"+Amount);
            }
            else
            {
                System.out.println("Wow!! You have got $4,000 as your sons' present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=4000;
                System.out.println("Your amount balance is :"+Amount);
            }
            Thread.sleep(8000);
        }
        else if(M==45)
        {
            System.out.println("You landed on \"A son is born! Collect presents.\"");
            Thread.sleep(3000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(4000);
            int y=(int)(Math.random()*7.9)+1;
            System.out.println(y+"!!");
            Thread.sleep(2500);
            if(y==1||y==2||y==3)
            {
                System.out.println("Sorry!! You do not get any present for your son.");
                System.out.println("Your amount balance is "+Amount);
            }
            else if(y==4||y==5)
            {
                System.out.println("Congrats!! You have got $1,000 as your son's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=1000;
                System.out.println("Your amount balance is :"+Amount);
            }
            else
            {
                System.out.println("Wow!! You have got $2,000 as your son's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=2000;
                System.out.println("Your amount balance is :"+Amount);
            }
            Thread.sleep(8000);
        }
        else if(M==47)
        {
            System.out.println("You landed on \"Find famous paintings! Collect $480,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=480000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==50)
        {
            System.out.println("You landed on \"Business is booming! Collect $100,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=100000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==51)
        {
            System.out.println("You landed on \"A daughter is born! Collect presents.\"");
            Thread.sleep(3000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(4000);
            int y=(int)(Math.random()*7.9)+1;
            System.out.println(y+"!!");
            Thread.sleep(2500);
            if(y==1||y==2||y==3)
            {
                System.out.println("Sorry!! You do not get any present for your daughter.");
                System.out.println("Your amount balance is "+Amount);
            }
            else if(y==4||y==5)
            {
                System.out.println("Congrats!! You have got $1,000 as your daughter's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=1000;
                System.out.println("Your amount balance is :"+Amount);
            }
            else
            {
                System.out.println("Wow!! You have got $2,000 as your daughter's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=2000;
                System.out.println("Your amount balance is :"+Amount);
            }
            Thread.sleep(8000);
        }
        else if(M==53)
        {
            System.out.println("You landed on \"Invention pays off! Collect $50,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=50000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==54)
        {
            System.out.println("You landed on \"Buy office building. Pay $150,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=150000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==56)
        {
            System.out.println("You landed on \"A son is born! Collect presents.\"");
            Thread.sleep(3000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(4000);
            int y=(int)(Math.random()*7.9)+1;
            System.out.println(y+"!!");
            Thread.sleep(2500);
            if(y==1||y==2||y==3)
            {
                System.out.println("Sorry!! You do not get any present for your son.");
                System.out.println("Your amount balance is "+Amount);
            }
            else if(y==4||y==5)
            {
                System.out.println("Congrats!! You have got $1,000 as your son's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=1000;
                System.out.println("Your amount balance is :"+Amount);
            }
            else
            {
                System.out.println("Wow!! You have got $2,000 as your son's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=2000;
                System.out.println("Your amount balance is :"+Amount);
            }
            Thread.sleep(8000);
        }
        else if(M==57)
        {
            System.out.println("You landed on \"LUCKY DAY! Collect $20,000. Keep it or try for $300,000.\"");
            int s=0,t=0;
            int flag1,flag2;
            do
            {
                flag1=0;
                try
                {
                    while(s==t)
                    {
                        do
                        {
                            System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                            s=Integer.parseInt(br.readLine());
                            t=Integer.parseInt(br.readLine());
                        }
                        while((s<1||s>8)||(t<1||t>8));
                    }
                }
                catch(Exception E)
                {
                    System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                    flag1=1;
                }
            }
            while(flag1==1);
            Thread.sleep(2000);
            char q=' ';
            do
            {
                flag2=0;
                try
                {
                    do
                    {
                        System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                        q=(char)br.read();
                    }
                    while(q!='Y'&&q!='y'&&q!='N'&&q!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                    flag2=1;
                }
            }
            while(flag2==1);
            if(q=='Y'||q=='y')
            {
                System.out.println("The spinner is spinning and the pointer points to...");
                int z=(int)(Math.random()*7.9)+1;
                Thread.sleep(3000);
                System.out.println(z+"!!");
                if(z==s||z==t)
                {
                    System.out.println("Wow, you get $300,000.");
                    System.out.println("Your amount balance was :"+Amount);
                    Amount+=300000;
                    System.out.println("Your amount balance is :"+Amount);
                    Thread.sleep(8000);
                }
                else
                {
                    System.out.println("Oh no!! You do not get your $20,000.");
                    System.out.println("Your amount balance remains as :"+Amount);
                    Thread.sleep(5000);
                }
            }
            else
            {
                System.out.println("So, you get your $20,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=20000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(M==60)
        {
            System.out.println("You landed on \"Expand business. Pay $120,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=120000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==65)
        {
            System.out.println("You landed on \"Climb Mt. Everest! Collect $120,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=120000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==66)
        {
            System.out.println("You landed on \"A daughter is born! Collect presents.\"");
            Thread.sleep(3000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(4000);
            int y=(int)(Math.random()*7.9)+1;
            System.out.println(y+"!!");
            Thread.sleep(2500);
            if(y==1||y==2||y==3)
            {
                System.out.println("Sorry!! You do not get any present for your daughter.");
                System.out.println("Your amount balance is "+Amount);
            }
            else if(y==4||y==5)
            {
                System.out.println("Congrats!! You have got $1,000 as your daughter's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=1000;
                System.out.println("Your amount balance is :"+Amount);
            }
            else
            {
                System.out.println("Wow!! You have got $2,000 as your daughter's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=2000;
                System.out.println("Your amount balance is :"+Amount);
            }
            Thread.sleep(8000);
        }
        else if(M==68)
        {
            System.out.println("You landed on \"LUCKY DAY! Collect $20,000. Keep it or try for $300,000.\"");
            int s=0,t=0;
            int flag1,flag2;
            do
            {
                flag1=0;
                try
                {
                    while(s==t)
                    {
                        do
                        {
                            System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                            s=Integer.parseInt(br.readLine());
                            t=Integer.parseInt(br.readLine());
                        }
                        while((s<1||s>8)||(t<1||t>8));
                    }
                }
                catch(Exception E)
                {
                    System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                    flag1=1;
                }
            }
            while(flag1==1);
            Thread.sleep(2000);
            char q=' ';
            do
            {
                flag2=0;
                try
                {
                    do
                    {
                        System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                        q=(char)br.read();
                    }
                    while(q!='Y'&&q!='y'&&q!='N'&&q!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                    flag2=1;
                }
            }
            while(flag2==1);
            if(q=='Y'||q=='y')
            {
                System.out.println("The spinner is spinning and the pointer points to...");
                int z=(int)(Math.random()*7.9)+1;
                Thread.sleep(3000);
                System.out.println(z+"!!");
                if(z==s||z==t)
                {
                    System.out.println("Wow, you get $300,000.");
                    System.out.println("Your amount balance was :"+Amount);
                    Amount+=300000;
                    System.out.println("Your amount balance is :"+Amount);
                    Thread.sleep(8000);
                }
                else
                {
                    System.out.println("Oh no!! You do not get your $20,000.");
                    System.out.println("Your amount balance remains as :"+Amount);
                    Thread.sleep(5000);
                }
            }
            else
            {
                System.out.println("So, you get your $20,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=20000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(M==69)
        {
            System.out.println("You landed on \"Save polluted lake. Pay $240,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=240000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==74)
        {
            System.out.println("You landed on \"Win tennis tournament! Collect $100,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=100000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==75)
        {
            System.out.println("You landed on \"Adopt a son and a daughter! Collect presents.\"");
            Thread.sleep(3000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(4000);
            int y=(int)(Math.random()*7.9)+1;
            System.out.println(y+"!!");
            Thread.sleep(2500);
            if(y==1||y==2||y==3)
            {
                System.out.println("Sorry!! You do not get any present for your son and daughter.");
                System.out.println("Your amount balance is "+Amount);
            }
            else if(y==4||y==5)
            {
                System.out.println("Congrats!! You have got $2,000 as your son's and daughter's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=2000;
                System.out.println("Your amount balance is :"+Amount);
            }
            else
            {
                System.out.println("Wow!! You have got $4,000 as your son's and daughter's present.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=4000;
                System.out.println("Your amount balance is :"+Amount);
            }
            Thread.sleep(8000);
        }
        else if(M==76)
        {
            System.out.println("You landed on \"Polar expedition! Pay $100,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=100000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==82)
        {
            System.out.println("You landed on \"Win a case in court! Collect $240,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=240000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==84)
        {
            System.out.println("You landed on \"LUCKY DAY! Collect $20,000. Keep it or try for $300,000.\"");
            int s=0,t=0;
            int flag1,flag2;
            do
            {
                flag1=0;
                try
                {
                    while(s==t)
                    {
                        do
                        {
                            System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                            s=Integer.parseInt(br.readLine());
                            t=Integer.parseInt(br.readLine());
                        }
                        while((s<1||s>8)||(t<1||t>8));
                    }
                }
                catch(Exception E)
                {
                    System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                    flag1=1;
                }
            }
            while(flag1==1);
            Thread.sleep(2000);
            char q=' ';
            do
            {
                flag2=0;
                try
                {
                    do
                    {
                        System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                        q=(char)br.read();
                    }
                    while(q!='Y'&&q!='y'&&q!='N'&&q!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                    flag2=1;
                }
            }
            while(flag2==1);
            if(q=='Y'||q=='y')
            {
                System.out.println("The spinner is spinning and the pointer points to...");
                int z=(int)(Math.random()*7.9)+1;
                Thread.sleep(3000);
                System.out.println(z+"!!");
                if(z==s||z==t)
                {
                    System.out.println("Wow, you get $300,000.");
                    System.out.println("Your amount balance was :"+Amount);
                    Amount+=300000;
                    System.out.println("Your amount balance is :"+Amount);
                    Thread.sleep(8000);
                }
                else
                {
                    System.out.println("Oh no!! You do not get your $20,000.");
                    System.out.println("Your amount balance remains as :"+Amount);
                    Thread.sleep(5000);
                }
            }
            else
            {
                System.out.println("So, you get your $20,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=20000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(M==85)
        {
            System.out.println("You landed on \"Spin the wheel. Collect $1,000 times the number spun.\"");
            Thread.sleep(4000);
            System.out.println("The spinner is spinning and the pointer points to...");
            Thread.sleep(3000);
            int h=(int)(Math.random()*7.9)+1;
            System.out.println(h);
            Thread.sleep(4000);
            int o=h*1000;
            System.out.println("Your amount balance was :"+Amount);
            Amount+=o;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==86)
        {
            System.out.println("You landed on \"Uncle leaves you a skunk farm! Pay $20,000 to get rid of it.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=20000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==88)
        {
            System.out.println("You landed on \"Burglar strikes! Pay $10,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=10000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==90)
        {
            System.out.println("You landed on \"Take world cruise. Pay $20,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=20000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==92)
        {
            System.out.println("You landed on \"Uncle in jail! Pay $2,000 bail.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=2000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==93)
        {
            System.out.println("You landed on \"Buy new home. Pay $140,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=140000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==94)
        {
            System.out.println("You landed on \"Write a best seller. Collect $96,000 royalties.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=96000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==95)
        {
            System.out.println("You landed on \"Pipe bursts! Pay $20,000 water damage.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=20000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==96)
        {
            System.out.println("You landed on \"Buy a helicopter. Pay $100,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=100000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==97)
        {
            System.out.println("You landed on \"Goat eats prize orchids! Pay $3,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=3000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==100)
        {
            System.out.println("You landed on \"Buy a yacht! Pay $80,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=80000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==102)
        {
            System.out.println("You landed on \"Discover Atlantis while skin diving! Collect $12,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=12000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==104)
        {
            System.out.println("You landed on \"Give $10,000 to favourite charity.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=10000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==109)
        {
            System.out.println("You landed on \"LUCKY DAY! Collect $20,000. Keep it or try for $300,000.\"");
            int s=0,t=0;
            int flag1,flag2;
            do
            {
                flag1=0;
                try
                {
                    while(s==t)
                    {
                        do
                        {
                            System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                            s=Integer.parseInt(br.readLine());
                            t=Integer.parseInt(br.readLine());
                        }
                        while((s<1||s>8)||(t<1||t>8));
                    }
                }
                catch(Exception E)
                {
                    System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                    flag1=1;
                }
            }
            while(flag1==1);
            Thread.sleep(2000);
            char q=' ';
            do
            {
                flag2=0;
                try
                {
                    do
                    {
                        System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                        q=(char)br.read();
                    }
                    while(q!='Y'&&q!='y'&&q!='N'&&q!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                    flag2=1;
                }
            }
            while(flag2==1);
            if(q=='Y'||q=='y')
            {
                System.out.println("The spinner is spinning and the pointer points to...");
                int z=(int)(Math.random()*7.9)+1;
                Thread.sleep(3000);
                System.out.println(z+"!!");
                if(z==s||z==t)
                {
                    System.out.println("Wow, you get $300,000.");
                    System.out.println("Your amount balance was :"+Amount);
                    Amount+=300000;
                    System.out.println("Your amount balance is :"+Amount);
                    Thread.sleep(8000);
                }
                else
                {
                    System.out.println("Oh no!! You do not get your $20,000.");
                    System.out.println("Your amount balance remains as :"+Amount);
                    Thread.sleep(5000);
                }
            }
            else
            {
                System.out.println("So, you get your $20,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=20000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(M==111)
        {
            System.out.println("You landed on \"Inherit a cattle ranch! Collect $240,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=240000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==112)
        {
            System.out.println("You landed on \"Yacht rams iceberg! Sell ice cubes. Collect $10,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=10000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==113)
        {
            System.out.println("You landed on \"Buy a luxury car. Pay $40,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=40000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==114)
        {
            System.out.println("You landed on \"Noble Prize. Collect $120,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=120000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==117)
        {
            System.out.println("You landed on \"Royalties! Collect $120,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=120000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==119)
        {
            System.out.println("You landed on \"Sell cattle ranch. Collect $200,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=200000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==122)
        {
            System.out.println("You landed on \"TV game show winner! Collect $240,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=240000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==123)
        {
            System.out.println("You landed on \"Robbed! Pay $70,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=70000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==125)
        {
            System.out.println("You landed on \"LUCKY DAY! Collect $20,000. Keep it or try for $300,000.\"");
            int s=0,t=0;
            int flag1,flag2;
            do
            {
                flag1=0;
                try
                {
                    while(s==t)
                    {
                        do
                        {
                            System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                            s=Integer.parseInt(br.readLine());
                            t=Integer.parseInt(br.readLine());
                        }
                        while((s<1||s>8)||(t<1||t>8));
                    }
                }
                catch(Exception E)
                {
                    System.out.println("Enter the two values from 1 to 8 where you would keep your $20,000 on stake if you would wish to risk your $20,000.");
                    flag1=1;
                }
            }
            while(flag1==1);
            Thread.sleep(2000);
            char q=' ';
            do
            {
                flag2=0;
                try
                {
                    do
                    {
                        System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                        q=(char)br.read();
                    }
                    while(q!='Y'&&q!='y'&&q!='N'&&q!='n');
                }
                catch(Exception E)
                {
                    System.out.println("Now, type Y if you want to risk your $20,000 or N if you do not.");
                    flag2=1;
                }
            }
            while(flag2==1);
            if(q=='Y'||q=='y')
            {
                System.out.println("The spinner is spinning and the pointer points to...");
                int z=(int)(Math.random()*7.9)+1;
                Thread.sleep(3000);
                System.out.println(z+"!!");
                if(z==s||z==t)
                {
                    System.out.println("Wow, you get $300,000.");
                    System.out.println("Your amount balance was :"+Amount);
                    Amount+=300000;
                    System.out.println("Your amount balance is :"+Amount);
                    Thread.sleep(8000);
                }
                else
                {
                    System.out.println("Oh no!! You do not get your $20,000.");
                    System.out.println("Your amount balance remains as :"+Amount);
                    Thread.sleep(5000);
                }
            }
            else
            {
                System.out.println("So, you get your $20,000.");
                System.out.println("Your amount balance was :"+Amount);
                Amount+=20000;
                System.out.println("Your amount balance is :"+Amount);
                Thread.sleep(8000);
            }
        }
        else if(M==127)
        {
            System.out.println("You landed on \"European tour. Pay $20,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=20000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==128)
        {
            System.out.println("You landed on \"Collect $3,000 on old debts.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount+=3000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==130)
        {
            System.out.println("You landed on \"Buy rare coins. Pay $40,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=40000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==131)
        {
            System.out.println("You landed on \"World cruise. Pay $70,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=70000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        else if(M==134)
        {
            System.out.println("You landed on \"Buy phony diamond. Pay $20,000.\"");
            System.out.println("Your amount balance was :"+Amount);
            Amount-=20000;
            System.out.println("Your amount balance is :"+Amount);
            Thread.sleep(8000);
        }
        return Amount;
    }
    void Next(int Move)throws Exception
    {
        String V[]={" 0. Starting point."," 1. Slow Start! Spin again."," 2. Capture escaped lion! Collect $4,000.",
            " 3. Car repairs. Pay $2,000."," 4. Collect $3,000 scholarship.(Red space)"," 5. Pay $5,000 tuition.(Red space)",
            " 6. Collect $2,000 for prize photo."," 7. Gambling loss! Pay $2,000."," 8. Doctor! Salary $50,000. Go forward 6 spaces.",
            " 9. Journalist! Salary $24,000. Go forward 5 spaces.","10. Lawyer! Salary $50,000. Go forward 4 spaces.",
            "11. Teacher! Salary $20,000. Go forward 3 spaces.","12. Physicist! Salary $30,000. Go forward 2 spaces.",
            "13. University Degree. Salary $16,000.(Red space)","14. PAY DAY!(Red space)","15. It's your birthday! Collect $1,000.",
            "16. Discover uranium! Collect $240,000.","17. Start a business. Pay $30,000.","18. Inheritance! Collect $300,000.",
            "19. If you want life insurance, pay $10,000.(White space)","20. Find art treasure! Collect $120,000.","21. PAY DAY!(Red space)",
            "22. Uncle needs help. Pay $2,000.","23. Get married! Collect presents.(Red space)","24. Business Trip. Pay $3,000.",
            "25. Buy furniture. Pay $6,000.","26. Car accident. Pay $12,000 if not insured.","27. Business needs to advertise. Pay $60,000.",
            "28. Buy two horses. Pay $60,000.","29. PAY DAY!(Red space)","30. Help your father-in-law. Pay $20,000.",
            "31. Win the lottery! Collect $96,000.","32. Buy a house. Pay $40,000.(Red space)","33. If you want fire insurance, Pay $10,000.(White space)",
            "34. PAY DAY!(Red space)","35. LUCKY DAY! Collect $20,000. Keep it or try for $300,000.","36. A son is born! Collect presents.",
            "37. Aunt leaves you 50 cats. Pay $20,000 for their care.","38. A daughter is born! Collect presents.","39. Win on horses! Collect $300,000.",
            "40. PAY DAY!(Red space)","41. REVENGE! Sue for damages!","42. Twin sons are born! Collect presents.",
            "43. Taxes due. Pay half of your salary.(Red space)","44. If you want stock, Pay $50,000.(White space)","45. A son is born! Collect presents.",
            "46. You may play the market if you own stock.(White space)","47. Find famous paintings! Collect $480,000.",
            "48. Stock prices drop. Pay $36,000 if you own stock.","49. PAY DAY!(Red space)","50. Business is booming! Collect $100,000.",
            "51. A daughter is born! Collect presents.","52. Wrecked car! Pay $16,000 if not insured.","53. Invention pays off! Collect $50,000.",
            "54. Buy office building. Pay $150,000.","55. REVENGE! Sue for damages!","56. A son is born! Collect presents.",
            "57. LUCKY DAY! Collect $20,000. Keep it or try for $300,000.","58. PAY DAY!(Red space)","59. Stocks are up! If you own stock, collect $240,000.",
            "60. Expand business. Pay $120,000.","61. Stock prices drop. Pay $16,000 if you own stock.",
            "62. Electronics stock skyrockets! Collect $120,000 if you own stock.","63. PAY DAY!(Red space)",
            "64. If you have life insurance Collect $70,000.","65. Climb Mt. Everest! Collect $120,000.","66. A daughter is born! Collect presents.",
            "67. Taxes due. Pay half of your salary.(Red space)","68. LUCKY DAY! Collect $20,000. Keep it or try for $300,000.",
            "69. Save polluted lake. Pay $240,000.","70. PAY DAY!(Red space)","71. You may play the market if you own stock.(White space)",
            "72. REVENGE! Sue for damages.","73. Reckless driver! Pay $60,000 if not insured.","74. Win tennis tournament! Collect $100,000.",
            "75. Adopt a son and a daughter! Collect presents.","76. Polar expedition! Pay $100,000.","77. PAY DAY!(Red space)",
            "78. If you have life insurance, collect $60,000.","79. Car accident! Pay $50,000 if not insured.","80. House on fire! Pay $60,000 if not insured.",
            "81. If you own stock, collect $18,000 dividend.","82. Win a case in court! Collect $240,000.","83. PAY DAY!(Red space)",
            "84. LUCKY DAY! Collect $20,000. Keep it or try for $300,000.","85. Spin the wheel. Collect $1,000 times the number spun.",
            "86. Uncle leaves you a skunk farm! Pay $20,000 to get rid of it.","87. Gold mine! Collect $360,000 if you own stock.",
            "88. Burglar strikes! Pay $10,000.","89. If you just spun 3, collect $30,000.","90. Take world cruise. Pay $20,000.",
            "91. PAY DAY!(Red space)","92. Uncle in jail! Pay $2,000 bail.","93. Buy new home. Pay $140,000.",
            "94. Write a best seller. Collect $96,000 royalties.","95. Pipe bursts! Pay $20,000 water damage.","96. Buy a helicopter. Pay $100,000.",
            "97. Goat eats prize orchids! Pay $3,000.","98. PAY DAY!(Red space)","99. You may play the market if you own stock.(White space)",
            "100.Buy a yacht! Pay $80,000.","101.Taxes due. Pay half of your salary.(Red space)","102.Discover Atlantis while skin diving! Collect $12,000.",
            "103.REVENGE! Sue for damages!","104.Give $10,000 to favourite charity.","105.PAY DAY!(Red space)",
            "106.If you have life insurance, collect $120,000.","107.Stocks are up! If you own stock, collect $140,000.",
            "108.Help homeless children. Give $120,000 to orphanage.(Red space)","109.LUCKY DAY! Collect $20,000. Keep it or try for $300,000.",
            "110.PAY DAY!(Red space)","111.Inherit a cattle ranch! Collect $240,000.","112.Yacht rams iceberg! Sell ice cubes. Collect $10,000.",
            "113.Buy a luxury car. Pay $40,000.","114.Noble Prize. Collect $120,000.","115.Strike Oil! Collect $480,000 if you own stock.",
            "116.PAY DAY!(Red space)","117.Royalties! Collect $120,000.","118.Property taxes! Pay $50,000.(Red space)",
            "119.Sell cattle ranch. Collect $200,000.","120.Tornado hits home! Pay $100,000 if not insured.","121.PAY DAY!(Red space)",
            "122.TV game show winner! Collect $240,000.","123.Robbed! Pay $70,000.","124.If you have life insurance, collect $240,000.",
            "125.LUCKY DAY! Collect $20,000. Keep it or try for $300,000.","126.REVENGE! Sue for damages!","127.European tour. Pay $20,000.",
            "128.Collect $3,000 on old debts.","129.PAY DAY!(Red space)","130.Buy rare coins. Pay $40,000.",
            "131.World cruise. Pay $70,000.","132.If you own stock, sell! Collect $600,000.","133.If you have life insurance, collect $240,000.",
            "134.Buy phony diamond. Pay $20,000.","135.MILLIONAIRE! Retire in style."};
        System.out.println("The next tiles where you can land on are :");
        if(Move<128)
        {
            for(int i=Move+1;i<=Move+8;i++)
            {
                System.out.println(V[i]);
            }
        }
        else if(Move>=128&&Move<135)
        {
            for(int i=Move+1;i<=135;i++)
            {
                System.out.println(V[i]);
            }
        }
    }
}
