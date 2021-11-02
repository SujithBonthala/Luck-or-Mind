import java.io.*;
class Mind
{
    double S=0;
    void main()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to IQ Quiz");
        System.out.println("This happens in two stages - 1 and 2");
        System.out.println("In stage 1, ten multiple choice questions will be asked.");
        System.out.println("4 marks are awarded for the right answer. -1 marks will be given for the wrong answer.");
        System.out.println("You must get 30 or more percent in stage 1 to qualify for stage 2.");
        Thread.sleep(3000);
        System.out.println("Question 1.");
        System.out.println("What is the least number that should be added to 2800 such that the sum is divisible by 3,\n5, 7 and 9.");
        Thread.sleep(2000);
        System.out.println("A) 27");
        System.out.println("B) 32");
        System.out.println("C) 35");
        System.out.println("D) 40");
        System.out.println("E) Not attempting");
        System.out.println("Please enter A, B, C, D or E according to your choice.");
        char ch1='A';
        int flag1,flag2,flag3,flag4,flag5,flag6,flag7,flag8,flag9,flag10;
        do
        {
            flag1=0;
            try
            {
                for(int i=1;i<2;)
                {
                    ch1=(char)br.read();
                    char ch11=(char)br.read();
                    if(ch1!='A'&&ch1!='B'&&ch1!='C'&&ch1!='D'&&ch1!='E')
                    {
                        System.out.println("Please enter a valid character in uppercase.");
                    }
                    else
                    {
                        i=2;
                    }
                }
            }
            catch(Exception Q1)
            {
                System.out.println("Please enter a valid character in uppercase.");
                flag1=1;
            }
        }
        while(flag1==1);
        if(ch1=='C')
        {
            S+=4;
        }
        else if(ch1=='E')
        {
            S+=0;
        }
        else
        {
            S-=1;
        }
        Thread.sleep(3500);
        System.out.print("\u000C");
        System.out.println("Question 2.");
        System.out.println("Given below is a series. Find which number would replace the '?'.");
        System.out.println("1, 3, 9, 23, 53, ?, 241, 495");
        Thread.sleep(2000);
        System.out.println("A) 115");
        System.out.println("B) 100");
        System.out.println("C) 135");
        System.out.println("D) 124");
        System.out.println("E) Not attempting");
        System.out.println("Please enter A, B, C, D or E according to your choice.");
        char ch2='A';
        do
        {
            flag2=0;
            try
            {
                for(int i=1;i<2;)
                {
                    ch2=(char)br.read();
                    char ch11=(char)br.read();
                    if(ch2!='A'&&ch2!='B'&&ch2!='C'&&ch2!='D'&&ch2!='E')
                    {
                        System.out.println("Please enter a valid character in uppercase.");
                    }
                    else
                    {
                        i=2;
                    }
                }
            }
            catch(Exception Q2)
            {
                System.out.println("Please enter a valid character in uppercase.");
                flag2=1;
            }
        }
        while(flag2==1);
        if(ch2=='A')
        {
            S+=4;
        }
        else if(ch2=='E')
        {
            S+=0;
        }
        else
        {
            S-=1;
        }
        Thread.sleep(3500);
        System.out.print("\u000C");
        System.out.println("Question 3.");
        System.out.println("Find the missing number in the given analogy.");
        Thread.sleep(2000);
        System.out.println("2 : 9 :: 6 : ___");
        Thread.sleep(2000);
        System.out.println("A) 36");
        System.out.println("B) 37");
        System.out.println("C) 216");
        System.out.println("D) 217");
        System.out.println("E) Not attempting");
        System.out.println("Please enter A, B, C, D or E according to your choice.");
        char ch3='A';
        do
        {
            flag3=0;
            try
            {
                for(int i=1;i<2;)
                {
                    ch3=(char)br.read();
                    char ch11=(char)br.read();
                    if(ch3!='A'&&ch3!='B'&&ch3!='C'&&ch3!='D'&&ch3!='E')
                    {
                        System.out.println("Please enter a valid character in uppercase.");
                    }
                    else
                    {
                        i=2;
                    }
                }
            }
            catch(Exception Q3)
            {
                System.out.println("Please enter a valid character in uppercase.");
                flag3=1;
            }
        }
        while(flag3==1);
        if(ch3=='D')
        {
            S+=4;
        }
        else if(ch3=='E')
        {
            S+=0;
        }
        else
        {
            S-=1;
        }
        Thread.sleep(3500);
        System.out.print("\u000C");
        System.out.println("Question 4.");
        System.out.print("In a certain code, 'red' is called 'white', 'blue' is called 'red', 'white' is called 'green',\n'green' is called 'blue'.");
        System.out.println("According to the code, what is the colour of (i) blood , (ii) ink.");
        Thread.sleep(2000);
        System.out.println("A) (i)White (ii)Green");
        System.out.println("B) (i)Red (ii)Blue");
        System.out.println("C) (i)White (ii)Red");
        System.out.println("D) (i)Blue (ii)Red");
        System.out.println("E) Not attempting");
        System.out.println("Please enter A, B, C, D or E according to your choice.");
        char ch4='A';
        do
        {
            flag4=0;
            try
            {
                for(int i=1;i<2;)
                {
                    ch4=(char)br.read();
                    char ch11=(char)br.read();
                    if(ch4!='A'&&ch4!='B'&&ch4!='C'&&ch4!='D'&&ch4!='E')
                    {
                        System.out.println("Please enter a valid character in uppercase.");
                    }
                    else
                    {
                        i=2;
                    }
                }
            }
            catch(Exception Q4)
            {
                System.out.println("Please enter a valid character in uppercase.");
                flag4=1;
            }
        }
        while(flag4==1);
        if(ch4=='C')
        {
            S+=4;
        }
        else if(ch4=='E')
        {
            S+=0;
        }
        else
        {
            S-=1;
        }
        Thread.sleep(3500);
        System.out.print("\u000C");
        System.out.println("Question 5.");
        System.out.println("Pointing to an old man, Sohan said, \"His son is my son's uncle.\" How is the old man\nrelated to Sohan?");
        Thread.sleep(2000);
        System.out.println("A) Brother");
        System.out.println("B) Father");
        System.out.println("C) Uncle");
        System.out.println("D) Grandfather");
        System.out.println("E) Not attempting");
        System.out.println("Please enter A, B, C, D or E according to your choice.");
        char ch5='A';
        do
        {
            flag5=0;
            try
            {
                for(int i=1;i<2;)
                {
                    ch5=(char)br.read();
                    char ch11=(char)br.read();
                    if(ch5!='A'&&ch5!='B'&&ch5!='C'&&ch5!='D'&&ch5!='E')
                    {
                        System.out.println("Please enter a valid character in uppercase.");
                    }
                    else
                    {
                        i=2;
                    }
                }
            }
            catch(Exception Q5)
            {
                System.out.println("Please enter a valid character in uppercase.");
                flag5=1;
            }
        }
        while(flag5==1);
        if(ch5=='B')
        {
            S+=4;
        }
        else if(ch5=='E')
        {
            S+=0;
        }
        else
        {
            S-=1;
        }
        Thread.sleep(3500);
        System.out.print("\u000C");
        System.out.println("Question 6.");
        System.out.println("Six bells ring after every 2s, 3s, 6s, 8s, 10s, 12s respectively. How many times will all the\nbells ring at the same time in 30 minutes.");
        Thread.sleep(2000);
        System.out.println("A) 15");
        System.out.println("B) 20");
        System.out.println("C) 10");
        System.out.println("D) 25");
        System.out.println("E) Not attempting");
        System.out.println("Please enter A, B, C, D or E according to your choice.");
        char ch6='A';
        do
        {
            flag6=0;
            try
            {
                for(int i=1;i<2;)
                {
                    ch6=(char)br.read();
                    char ch11=(char)br.read();
                    if(ch6!='A'&&ch6!='B'&&ch6!='C'&&ch6!='D'&&ch6!='E')
                    {
                        System.out.println("Please enter a valid character in uppercase.");
                    }
                    else
                    {
                        i=2;
                    }
                }
            }
            catch(Exception Q6)
            {
                System.out.println("Please enter a valid character in uppercase.");
                flag6=1;
            }
        }
        while(flag6==1);
        if(ch6=='A')
        {
            S+=4;
        }
        else if(ch6=='E')
        {
            S+=0;
        }
        else
        {
            S-=1;
        }
        Thread.sleep(3500);
        System.out.print("\u000C");
        System.out.println("Queston 7.");
        System.out.print("A man starts walking from point A. He walks 3 km in the north direction and then turns towards\nthe east and walks 8 km.");
        System.out.println("He then turns towards the west and walks 3 km. How far is he from point A.");
        Thread.sleep(2000);
        System.out.println("A) 5 km");
        System.out.println("B) 7 cm");
        System.out.println("C) 7 km");
        System.out.println("D) 10 km");
        System.out.println("E) Not attempting");
        System.out.println("Please enter A, B, C, D or E according to your choice.");
        char ch7='A';
        do
        {
            flag7=0;
            try
            {
                for(int i=1;i<2;)
                {
                    ch7=(char)br.read();
                    char ch11=(char)br.read();
                    if(ch7!='A'&&ch7!='B'&&ch7!='C'&&ch7!='D'&&ch7!='E')
                    {
                        System.out.println("Please enter a valid character in uppercase.");
                    }
                    else
                    {
                        i=2;
                    }
                }
            }
            catch(Exception Q7)
            {
                System.out.println("Please enter a valid character in uppercase.");
                flag7=1;
            }
        }
        while(flag7==1);
        if(ch7=='D')
        {
            S+=4;
        }
        else if(ch7=='E')
        {
            S+=0;
        }
        else
        {
            S-=1;
        }
        Thread.sleep(3500);
        System.out.print("\u000C");
        System.out.println("Question 8.");
        System.out.print("If 'tee see pee' means 'Drink fruit juice'; 'see kee lee' means 'Juice is sweet' and\n'lee ree mee' means 'He is intelligent',");
        System.out.println("which word in that language means 'sweet'?");
        Thread.sleep(2000);
        System.out.println("A) see");
        System.out.println("B) kee");
        System.out.println("C) lee");
        System.out.println("D) pee");
        System.out.println("E) Not attempting");
        System.out.println("Please enter A, B, C, D or E according to your choice.");
        char ch8='A';
        do
        {
            flag8=0;
            try
            {
                for(int i=1;i<2;)
                {
                    ch8=(char)br.read();
                    char ch11=(char)br.read();
                    if(ch8!='A'&&ch8!='B'&&ch8!='C'&&ch8!='D'&&ch8!='E')
                    {
                        System.out.println("Please enter a valid character in uppercase.");
                    }
                    else
                    {
                        i=2;
                    }
                }
            }
            catch(Exception Q8)
            {
                System.out.println("Please enter a valid character in uppercase.");
                flag8=1;
            }
        }
        while(flag8==1);
        if(ch8=='B')
        {
            S+=4;
        }
        else if(ch8=='E')
        {
            S+=0;
        }
        else
        {
            S-=1;
        }
        Thread.sleep(3500);
        System.out.print("\u000C");
        System.out.println("Question 9.");
        System.out.println("If + means -, - means x, x means / and / means +, then 15 x 3 / 15 + 5 - 2 =");
        Thread.sleep(2000);
        System.out.println("A) 10");
        System.out.println("B) 6");
        System.out.println("C) 0");
        System.out.println("D) 20");
        System.out.println("E) Not attempting");
        System.out.println("Please enter A, B, C, D or E according to your choice.");
        char ch9='A';
        do
        {
            flag9=0;
            try
            {
                for(int i=1;i<2;)
                {
                    ch9=(char)br.read();
                    char ch11=(char)br.read();
                    if(ch9!='A'&&ch9!='B'&&ch9!='C'&&ch9!='D'&&ch9!='E')
                    {
                        System.out.println("Please enter a valid character in uppercase.");
                    }
                    else
                    {
                        i=2;
                    }
                }
            }
            catch(Exception Q9)
            {
                System.out.println("Please enter a valid character in uppercase.");
                flag9=1;
            }
        }
        while(flag9==1);
        if(ch9=='A')
        {
            S+=4;
        }
        else if(ch9=='E')
        {
            S+=0;
        }
        else
        {
            S-=1;
        }
        Thread.sleep(3500);
        System.out.print("\u000C");
        System.out.println("Question 10.");
        System.out.print("Pramod and Praveen are the sons of Prakash. The present age of Prakash is 4 times the age of\nPramod and 6 times the age of Praveen.");
        System.out.println("If the sum of their ages is equal to 51 years, the present\nages of Pramod and Praveen are :");
        Thread.sleep(2000);
        System.out.println("A) 6 years, 9 years");
        System.out.println("B) 9 years, 6 years");
        System.out.println("C) 9 years, 4 years");
        System.out.println("D) 12 years, 6 years");
        System.out.println("E) Not attempting");
        System.out.println("Please enter A, B, C, D or E according to your choice.");
        char ch10='A';
        do
        {
            flag10=0;
            try
            {
                for(int i=1;i<2;)
                {
                    ch10=(char)br.read();
                    char ch11=(char)br.read();
                    if(ch10!='A'&&ch10!='B'&&ch10!='C'&&ch10!='D'&&ch10!='E')
                    {
                        System.out.println("Please enter a valid character in uppercase.");
                    }
                    else
                    {
                        i=2;
                    }
                }
            }
            catch(Exception Q10)
            {
                System.out.println("Please enter a valid character in uppercase.");
                flag10=1;
            }
        }
        while(flag10==1);
        if(ch10=='B')
        {
            S+=4;
        }
        else if(ch10=='E')
        {
            S+=0;
        }
        else
        {
            S-=1;
        }
        Thread.sleep(2500);
        System.out.print("\u000C");
        System.out.println("Loading your results");
        for(int i=1;i<=10;i++)
        {
            System.out.print("*");
            Thread.sleep(600);
        }
        System.out.print("\u000C");
        String M1,M2,M3,M4,M5,M6,M7,M8,M9,M10;
        if(ch1=='C')
        {
            M1="+4";
        }
        else if(ch1=='E')
        {
            M1=" 0";
        }
        else
        {
            M1="-1";
        }
        if(ch2=='A')
        {
            M2="+4";
        }
        else if(ch2=='E')
        {
            M2=" 0";
        }
        else
        {
            M2="-1";
        }
        if(ch3=='D')
        {
            M3="+4";
        }
        else if(ch3=='E')
        {
            M3=" 0";
        }
        else
        {
            M3="-1";
        }
        if(ch4=='C')
        {
            M4="+4";
        }
        else if(ch4=='E')
        {
            M4=" 0";
        }
        else
        {
            M4="-1";
        }
        if(ch5=='B')
        {
            M5="+4";
        }
        else if(ch5=='E')
        {
            M5=" 0";
        }
        else
        {
            M5="-1";
        }
        if(ch6=='A')
        {
            M6="+4";
        }
        else if(ch6=='E')
        {
            M6=" 0";
        }
        else
        {
            M6="-1";
        }
        if(ch7=='D')
        {
            M7="+4";
        }
        else if(ch7=='E')
        {
            M7=" 0";
        }
        else
        {
            M7="-1";
        }
        if(ch8=='B')
        {
            M8="+4";
        }
        else if(ch8=='E')
        {
            M8=" 0";
        }
        else
        {
            M8="-1";
        }
        if(ch9=='A')
        {
            M9="+4";
        }
        else if(ch9=='E')
        {
            M9=" 0";
        }
        else
        {
            M9="-1";
        }
        if(ch10=='B')
        {
            M10="+4";
        }
        else if(ch10=='E')
        {
            M10=" 0";
        }
        else
        {
            M10="-1";
        }
        System.out.println(" ---------------------------------------");
        System.out.println("| Question |  Your  | Correct |  Marks  |");
        System.out.println("|  Number  | Answer | Answer  | Awarded |");
        System.out.println(" ---------------------------------------");
        System.out.println("|    1     |   "+ch1+"    |    C    |   "+M1+"    |");
        System.out.println(" ---------------------------------------");
        System.out.println("|    2     |   "+ch2+"    |    A    |   "+M2+"    |");
        System.out.println(" ---------------------------------------");
        System.out.println("|    3     |   "+ch3+"    |    D    |   "+M3+"    |");
        System.out.println(" ---------------------------------------");
        System.out.println("|    4     |   "+ch4+"    |    C    |   "+M4+"    |");
        System.out.println(" ---------------------------------------");
        System.out.println("|    5     |   "+ch5+"    |    B    |   "+M5+"    |");
        System.out.println(" ---------------------------------------");
        System.out.println("|    6     |   "+ch6+"    |    A    |   "+M6+"    |");
        System.out.println(" ---------------------------------------");
        System.out.println("|    7     |   "+ch7+"    |    D    |   "+M7+"    |");
        System.out.println(" ---------------------------------------");
        System.out.println("|    8     |   "+ch8+"    |    B    |   "+M8+"    |");
        System.out.println(" ---------------------------------------");
        System.out.println("|    9     |   "+ch9+"    |    A    |   "+M9+"    |");
        System.out.println(" ---------------------------------------");
        System.out.println("|    10    |   "+ch10+"    |    B    |   "+M10+"    |");
        System.out.println(" ---------------------------------------");
        Thread.sleep(5000);
        System.out.println("                        Total Score="+S);
        Thread.sleep(2000);
        double Percent=(S*100)/40;
        System.out.println("                        Percentage achieved="+Percent);
        Thread.sleep(3000);
        System.out.println("Press Enter to continue");
        br.read();
        System.out.print("\u000C");
        Thread.sleep(1000);
        if(Percent>=30)
        {
            System.out.println("Congrats!!You have qualified for stage 2 of our IQ quiz");
            Thread.sleep(4500);
            System.out.print("\u000C");
            System.out.println("\t\t\t\t\t\tSTAGE 2 is");
            Thread.sleep(4000);
            Stage2 S2=new Stage2();
            S2.Puzzles();
        }
        else
        {
            System.out.println("Sorry, you have not qualified for stage 2 of our IQ quiz");
            Thread.sleep(4000);
        }
    }
}
