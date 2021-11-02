import java.io.*;
class Stage2
{
    public boolean CheckTen(long N)
    {
        int d,count0=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0;
        long n1=N;
        int count8=0,count9=0;
        while(n1>0)
        {
            d=(int)(n1%10);
            if(d==0)
            {
                count0++;
            }
            else if(d==1)
            {
                count1++;
            }
            else if(d==2)
            {
                count2++;
            }
            else if(d==3)
            {
                count3++;
            }
            else if(d==4)
            {
                count4++;
            }
            else if(d==5)
            {
                count5++;
            }
            else if(d==6)
            {
                count6++;
            }
            else if(d==7)
            {
                count7++;
            }
            else if(d==8)
            {
                count8++;
            }
            else
            {
                count9++;
            }
            n1/=10;
        }
        if(count9==N%10&&count8==N/10%10&&count7==N/100%10&&count6==N/1000%10&&count5==N/10000%10&&
           count4==N/100000%10&&count3==N/1000000%10&&count2==N/10000000%10&&count1==N/100000000%10
           &&count0==N/1000000000%10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    int cou1,cou2,cou4,cou8,cou9,cou10,cou11,cou13,cou15;
    public boolean checkValid(int n)
    {
        if(n==1)
        {
            cou1++;
        }
        else if(n==2)
        {
            cou2++;
        }
        else if(n==4)
        {
            cou4++;
        }
        else if(n==8)
        {
            cou8++;
        }
        else if(n==9)
        {
            cou9++;
        }
        else if(n==10)
        {
            cou10++;
        }
        else if(n==11)
        {
            cou11++;
        }
        else if(n==13)
        {
            cou13++;
        }
        else if(n==15)
        {
            cou15++;
        }
        else
        {
            return false;
        }
        if(cou1==1&&cou2==2&&cou4==1&&cou8==1&&cou9==1&&cou10==1&&cou11==1&&cou13==1&&cou15==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }   
    void CheckAnswers(int p, String S11, String S21, String S31, String S41, String S51)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String choice="";
        Array A1=new Array();
        int flag;
        do
        {
            flag=0;
            try
            {
                do
                {
                    System.out.println("Choose one of the following.");
                    System.out.println("1.Result and Answer for Question 1");
                    System.out.println("2.Result and Answer for Question 2");
                    System.out.println("3.Result and Answer for Question 3");
                    System.out.println("4.Result and Answer for Question 4");
                    System.out.println("5.Result and Answer for Question 5");
                    System.out.println("6.Exit");
                    choice=br.readLine();
                    choice=choice.trim();
                }
                while(!choice.equals("1")&&!choice.equals("2")&&!choice.equals("3")&&!choice.equals("4")&&!choice.equals("5")&&!choice.equals("6"));
            }
            catch(Exception E)
            {
                flag=1;
            }
        }
        while(flag==1);
        char cho=choice.charAt(0);
        switch(cho)
        {
            case '1':
            {
                System.out.print("\u000C");
                System.out.println(S11);
                Thread.sleep(5000);
                System.out.print("\u000C");
                CheckAnswers(p,S11,S21,S31,S41,S51);
            }
            break;
            case '2':
            {
                System.out.print("\u000C");
                System.out.println(S21);
                Thread.sleep(13000);
                System.out.print("\u000C");
                CheckAnswers(p,S11,S21,S31,S41,S51);
            }
            break;
            case '3':
            {
                System.out.print("\u000C");
                System.out.println(S31);
                System.out.println("Answer:");
                System.out.println(" __ __ __");
                System.out.println("|31|73|7 |");
                System.out.println("|__|__|__|");
                System.out.println("|13|37|61|");
                System.out.println("|__|__|__|");
                System.out.println("|67|1 |43|");
                System.out.println("|__|__|__|");
                Thread.sleep(10000);
                System.out.print("\u000C");
                CheckAnswers(p,S11,S21,S31,S41,S51);
            }
            break;
            case '4':
            {
                System.out.print("\u000C");
                System.out.println(S41);
                System.out.println("Answer:");
                A1.Answer_Puzzle4(p);
                Thread.sleep(7000);
                System.out.print("\u000C");
                CheckAnswers(p,S11,S21,S31,S41,S51);
            }
            break;
            case '5':
            {
                System.out.print("\u000C");
                System.out.println(S51);
                Thread.sleep(5000);
                System.out.print("\u000C");
                CheckAnswers(p,S11,S21,S31,S41,S51);
            }
            break;
            case '6':
            {
                System.out.print("\u000C");
            }
        }
    }
    void Puzzles()throws Exception 
    {
        Display d=new Display();
        d.display();
        System.out.println("We are going to ask you 5 mathematics puzzles.No time limit.Best of luck.");
        Thread.sleep(2000);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1.Find a 10-digit number where the first digit is how many 0s in");
        System.out.println("  the number, the second digit is how many 1s in the number etc. until");
        System.out.println("  the tenth digit which is how many 9s in the number."); 
        int Score=0,flag1;
        long Num=0;
        do
        {
            flag1=0;
            try
            {
                Num=Long.parseLong(br.readLine());
            }
            catch(Exception Q1)
            {
                System.out.println("Please enter a number.");
                flag1=1;
            }
        }
        while(flag1==1);
        int count=0;
        long n1=Num;
        String S1="",S2="",S3="",S4="",S5="";
        while(n1>0)
        {
            count++;
            n1/=10;
        }
        if(count==10)
        {
            boolean b=CheckTen(Num);
            if(b)
            {
                Score++;
                S1="Congrats.Your first answer was correct.\nYour answer was:"+Num;
            }
            else
            {
                S1="Sorry.Your first answer was wrong.\nYour answer:"+Num+"\nCorrect Answer:6210001000";
            }
        }
        else
        {
            S1="Sorry.Your first answer was wrong.\nYour answer:"+Num+"\nCorrect Answer:6210001000";
        }
        System.out.println("Press Enter to continue");
        br.read();
        System.out.print("\u000C");
        Thread.sleep(1000);
        System.out.println("2.I have ten boxes which I want to pack into crates. Each crate can carry");
        System.out.println("  a maximum of 25 kg. But I only have three crates, and the total weight");
        System.out.print("  of the boxes is 75kg:\n15 kg, 13kg, 11 kg, 10 kg, 9 kg, 8 kg, 4 kg, 2 kg");
        System.out.println(", 2 kg, 1 kg\n  How can I pack the boxes into the crates?");
        System.out.println("Rules : The number of weights you have to pick in the first, second and");
        System.out.println("        third crates are 3, 3 and 4 respectively.");
        int flag2,flag3,flag4,W1=0,W2=0,W3=0,W4=0,W5=0,W6=0,W7=0,W8=0,W9=0,W10=0;
        do
        {
            flag2=0;
            try
            {
                System.out.println("Weights in crate 1(type the weights separately without using comma)");
                W1=Integer.parseInt(br.readLine());
                W2=Integer.parseInt(br.readLine());
                W3=Integer.parseInt(br.readLine());
            }
            catch(Exception Q2)
            {
                System.out.println("Invalid Entry");
                flag2=1;
            }
        }
        while(flag2==1);
        do
        {
            flag3=0;
            try
            {
                System.out.println("Weights in crate 2(type the weights separately without using comma)");
                W4=Integer.parseInt(br.readLine());
                W5=Integer.parseInt(br.readLine());
                W6=Integer.parseInt(br.readLine());
            }
            catch(Exception Q2)
            {
                System.out.println("Invalid Entry");
                flag3=1;
            }
        }
        while(flag3==1);
        do
        {
            flag4=0;
            try
            {
                System.out.println("Weights in crate 3(type the weights separately without using comma)");
                W7=Integer.parseInt(br.readLine());
                W8=Integer.parseInt(br.readLine());
                W9=Integer.parseInt(br.readLine());
                W10=Integer.parseInt(br.readLine());
            }
            catch(Exception Q2)
            {
                System.out.println("Invalid Entry");
                flag4=1;
            }
        }
        while(flag4==1);
        int a[]={W1,W2,W3,W4,W5,W6,W7,W8,W9,W10};
        boolean b1=false;
        for(int i=0;i<=a.length-1;i++)
        {
            b1=checkValid(a[i]);
        }
        if(b1)
        {
            if((W1+W2+W3)==25&&(W4+W5+W6)==25&&(W7+W8+W9+W10)==25)
            {
                Score++;
                S2+="Congrats.Your second answer was right.\nYour answer was "+W1+", "+W2+" and "+W3+" in";
                S2+=" the first crate; "+W4+", "+W5+"\nand "+W6+" in the second crate and "+W7+", "+W8;
                S2+=", "+W9+"\nand "+W10+" in the third crate.";
                S2+="\nCorrect answer could have been 15kg, 1kg ";
                S2+="and 9kg in the first crate; 13kg, 10kg and 2kg in the second crate and 2kg, 4kg, ";
                S2+="8kg and 11kg in the third crate.";
            }
            else
            {
                S2+="\nSorry.Your second answer was wrong.\nYour answer was "+W1+", "+W2+" and "+W3+"in";
                S2+=" the first crate, "+W4+", "+W5+"\nand "+W6+" in the second crate and "+W7+", "+W8;
                S2+=", "+W9+" and "+W10+" in the third crate.\nCorrect answer could have been 15kg, 1kg ";
                S2+="and 9kg in the first crate; 13kg, 10kg and 2kg\nin the second crate and 2kg, 4kg, ";
                S2+="8kg and 11kg in the third crate.";
            }
        }
        else
        {
            S2+="\nSorry.Your second answer was wrong.\nYou did not follow the rules.\nYour answer was "+W1;
            S2+=", "+W2+" and "+W3+" in the first crate, "+W4+", "+W5+" and "+W6+"\nin the second crate and "+W7;
            S2+=", "+W8+", "+W9+" and "+W10+" in the third crate.\nCorrect answer could have been 15kg, 1kg ";
            S2+="and 9kg in the first crate; 13kg, 10kg and 2kg\nin the second crate and 2kg, 4kg, ";
            S2+="8kg and 11kg in the third crate.";
        }
        System.out.println("Press Enter to continue");
        br.read();
        System.out.print("\u000C");
        System.out.println("3.The box below is a Magic Square. This means that the numbers add up to the");
        System.out.println("  same total in every direction.");
        System.out.println(" __ __ __");
        System.out.println("|  |  |7 |");
        System.out.println("|__|__|__|");
        System.out.println("|13|37|  |");
        System.out.println("|__|__|__|");
        System.out.println("|  |  |  |");
        System.out.println("|__|__|__|");
        System.out.println("Every row, column and diagonal adds up to 111. But there are some numbers");
        System.out.println("missing! Fill in the missing numbers. They are all different.");
        System.out.println("Clues:\n1)No value in the magic square is zero. You must change the value of zero");
        System.out.println("present in the magic square.");
        System.out.println("2)Every value in the magic square ranges from 1 to 99");
        Array A=new Array();
        boolean b2=A.Puzzle3();
        if(b2)
        {
            Score++;
            S3="Congrats.Your third answer was right.";
        }
        else
        {
            S3="Sorry.Your third answer was wrong.";
        }
        System.out.println("Press Enter to continue.");
        br.read();
        System.out.print("\u000C");
        System.out.println("4.Here's a newspaper made of 8 large sheets of paper folded in half. The");
        System.out.println("  The newspaper has 32 pages altogether.The first sheet contains pages");
        System.out.println("  1, 2, 31 and 32.");
        int x=(int)(Math.random()*(27))+3;
        int flag5,No1=0,No2=0,No3=0;
        do
        {
            flag5=0;
            try
            {
                System.out.println("  I pick up a sheet containing page "+x+". What are the other 3 pages that this");
                System.out.println("  sheet contains.");
                No1=Integer.parseInt(br.readLine());
                No2=Integer.parseInt(br.readLine());
                No3=Integer.parseInt(br.readLine());
            }
            catch(Exception Q4)
            {
                System.out.println("Invalid Entry");
                flag5=1;
            }
        }
        while(flag5==1);
        boolean b3=A.Puzzle4(x,No1,No2,No3);
        if(b3)
        {
            Score++;
            S4="Congrats. Your fourth answer was right.";
        }
        else
        {
            S4="Sorry. Your fourth answer was wrong.";
        }
        System.out.println("Press Enter to continue.");
        br.read();
        System.out.print("\u000C");
        System.out.println("5.Ludwig Bump runs the bank in Mathsville. You have to help him, though, because");
        System.out.println("  he has forgotten the combination number of the safe.");
        System.out.println("  Fortunately, he does remember some things about the number which may");
        System.out.println("  help you to help him.\n");
        System.out.println("* The number has four digits (eg.1234 or 9876).");
        System.out.println("* All the digits are different.");
        System.out.println("* It begins and ends with an odd number and has two even numbers in the middle.");
        System.out.println("* 19 and 519 go into it exactly.\n");
        int flag6,No=0;
        do
        {
            flag6=0;
            try
            {
                System.out.println("     WHAT IS THE NUMBER WHICH WILL OPEN THE SAFE?");
                No=Integer.parseInt(br.readLine());
            }
            catch(Exception Q5)
            {
                System.out.println("Please enter a NUMBER.");
                flag6=1;
            }
        }
        while(flag6==1);
        int n2=No;
        int c=0;
        while(n2>0)
        {
            c++;
            n2/=10;
        }
        int z,n3=No;
        boolean b4=false,b5=false,b6=false;
        int c1=0,c2=0,c3=0,c4=0,c5=0,c6=0,c7=0,c8=0,c9=0,c0=0;
        while(n3>0)
        {
            z=n3%10;
            if(z==0)
            {
                c0++;
            }
            if(z==1)
            {
                c1++;
            }
            if(z==2)
            {
                c2++;
            }
            if(z==3)
            {
                c3++;
            }
            if(z==4)
            {
                c4++;
            }
            if(z==5)
            {
                c5++;
            }
            if(z==6)
            {
                c6++;
            }
            if(z==7)
            {
                c7++;
            }
            if(z==8)
            {
                c8++;
            }
            if(z==9)
            {
                c9++;
            }
            if(c0>1||c1>1||c2>1||c3>1||c4>1||c5>1||c6>1||c7>1||c8>1||c9>1)
            {
                b4=false;
            }
            else
            {
                b4=true;
            }
            n3/=10;
        }
        int n4=No;
        b5=(No%10)%2!=0&&((No/10)%10)%2==0&&((No/100)%10)%2==0&&((No/1000)%10)%2!=0?true:false;
        if(n4%19.0==0&&n4%519.0==0.0)
        {
            b6=true;
        }
        if(c==4&&b4==true&&b5==true&&b6==true)
        {
            Score++;
            S5="Congrats.Your fifth answer was right.You helped Ludwig Bump to open his safe by using the correct code 9861!!!";
        }
        else
        {
            S5="Sorry.Your fifth answer was wrong.You failed to open Ludwig Bump's safe. The correct code was 9861.";
        }
        System.out.println("Press Enter to continue.");
        br.read();
        System.out.print("\u000C");
        for(int i=10;i>=1;i--)
        {
            System.out.println("Your result will be declared in "+i+" seconds.");
            Thread.sleep(1000);
            System.out.print("\u000C");
        }
        System.out.println("Your score, out of 5, is "+Score);
        if(Score==0)
        {
            System.out.println("Your performance was very poor. You are mentally weak.");
            System.out.println("You must improve your IQ by reading a lot of books.");
        }
        else if(Score==1)
        {
            System.out.println("Your performance was poor. You must improve your IQ power.");
        }
        else if(Score==2)
        {
            System.out.println("Your performance was average but you must work continually to further improve your IQ.");
        }
        else if(Score==3)
        {
            System.out.println("Your performance was good. You must retain your IQ and try to further improve it.");
        }
        else if(Score==4)
        {
            System.out.println("Your performance was very good. Keep it up.");
        }
        else
        {
            System.out.println("Your performance was excellent. You are one among the millions.");
        }
        Thread.sleep(7500);
        System.out.print("\u000C");
        CheckAnswers(x,S1,S2,S3,S4,S5);
    }
}
        