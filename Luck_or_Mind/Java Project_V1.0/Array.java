import java.io.*;
class Array
{
    int r,c,input;
    int b[][]=new int[3][3];
    String S1,S2,S3,S4,S5,S6;
    void Spaces(int d[][])
    {
        int e=0,l1;
        if(d[0][0]==0)
        {
            l1=1;
        }
        else
        {
            l1=d[0][0];
        }
        while(l1>0)
        {
            e++;
            l1/=10;
        }
        if(e==1)
        {
            S1=" ";
        }
        else
        {
            S1="";
        }
        int l2,a=0;
        if(d[0][1]==0)
        {
            l2=1;
        }
        else
        {
            l2=d[0][1];
        }
        while(l2>0)
        {
            a++;
            l2/=10;
        }
        if(a==1)
        {
            S2=" ";
        }
        else
        {
            S2="";
        }
        int l3,f=0;
        if(d[1][2]==0)
        {
            l3=1;
        }
        else
        {
            l3=d[1][2];
        }
        while(l3>0)
        {
            f++;
            l3/=10;
        }
        if(f==1)
        {
            S3=" ";
        }
        else
        {
            S3="";
        }
        int l4,p=0;
        if(d[2][0]==0)
        {
            l4=1;
        }
        else
        {
            l4=d[2][0];
        }
        while(l4>0)
        {
            p++;
            l4/=10;
        }
        if(p==1)
        {
            S4=" ";
        }
        else
        {
            S4="";
        }
        int l5,q=0;
        if(d[2][1]==0)
        {
            l5=1;
        }
        else
        {
            l5=d[2][1];
        }
        while(l5>0)
        {
            q++;
            l5/=10;
        }
        if(q==1)
        {
            S5=" ";
        }
        else
        {
            S5="";
        }
        int l6,n=0;
        if(d[2][2]==0)
        {
            l6=1;
        }
        else
        {
            l6=d[2][2];
        }
        while(l6>0)
        {
            n++;
            l6/=10;
        }
        if(n==1)
        {
            S6=" ";
        }
        else
        {
            S6="";
        }
    }
    void display()
    {
        b[r][c]=input;
        System.out.println(" ___ ___ ___");
        System.out.println("|"+S1+b[0][0]+" |"+S2+b[0][1]+" | 7 |");
        System.out.println("|___|___|___|");
        System.out.println("|13 |37 |"+S3+b[1][2]+" |");
        System.out.println("|___|___|___|");
        System.out.println("|"+S4+b[2][0]+" |"+S5+b[2][1]+" |"+S6+b[2][2]+" |");
        System.out.println("|___|___|___|");
    }
    boolean Puzzle3()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a[][]=new int[3][3];
        int k=0;
        for(int i=1;i<2;)
        {
            int row=0,col=0,flag1,flag2,flag3;
            do
            {
                flag1=0;
                try
                {
                    System.out.println("Enter the row number where you are entering the number.");
                    row=Integer.parseInt(br.readLine());
                }
                catch(Exception Q3)
                {
                    System.out.println("Invalid Entry");
                    flag1=1;
                }
            }
            while(flag1==1);
            do
            {
                flag2=0;
                try
                {
                    System.out.println("Enter the column number where you are entering the number.");
                    col=Integer.parseInt(br.readLine());
                }
                catch(Exception Q3)
                {
                    System.out.println("Invalid Entry");
                    flag2=1;
                }
            }
            while(flag2==1);
            a[0][2]=7;
            a[1][0]=13;
            a[1][1]=37;
            if((row>3||row<=0)||(col>3||col<=0))
            {
                System.out.println("Invalid Entry");
            }
            else
            {                
                if(a[row-1][col-1]!=0)
                {
                    System.out.println("There is already a number present here.");
                }
                else
                {
                    int r=0;
                    do
                    {
                        flag3=0;
                        try
                        {
                            System.out.println("Enter the value you are inserting.");
                            r=Integer.parseInt(br.readLine());
                        }
                        catch(Exception Q3)
                        {
                            System.out.println("Invalid Entry");
                            flag3=1;
                        }
                    }
                    while(flag3==1);
                    int f=r,d=0;
                    while(f>0)
                    {
                        d++;
                        f/=10;
                    }
                    if(r==0||d>2)
                    {
                        System.out.println("Invalid Entry(Read the clues carefully)");
                    }
                    else
                    {
                        r=row-1;
                        c=col-1;
                        input=a[row-1][col-1];
                        k++;
                    }
                }
            }
            Spaces(a);
            display();
            if(k==6)
            {
                i=2;
            }
            Thread.sleep(750);
        }
        if(a[0][0]==31&&a[0][1]==73&&a[1][2]==61&&a[2][0]==67&&a[2][1]==1&&a[2][2]==43)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    boolean Puzzle4(int n1, int n2, int n3, int n4)
    {
        boolean b3=false;
        if(n1==3)
        {
            if((n2==4||n2==29||n2==30)&&(n3==4||n3==29||n3==30)&&(n4==4||n4==29||n4==30))
            {
                b3=true;
            }
        }
        else if(n1==4)
        {
            if((n2==3||n2==29||n2==30)&&(n3==3||n3==29||n3==30)&&(n4==3||n4==29||n4==30))
            {
                b3=true;
            }
        }
        else if(n1==5)
        {
            if((n2==6||n2==27||n2==28)&&(n3==6||n3==27||n3==28)&&(n4==6||n4==27||n4==28))
            {
                b3=true;
            }
        }
        else if(n1==6)
        {
            if((n2==5||n2==27||n2==28)&&(n3==5||n3==27||n3==28)&&(n4==5||n4==27||n4==28))
            {
                b3=true;
            }
        }
        else if(n1==7)
        {
            if((n2==8||n2==25||n2==26)&&(n3==8||n3==25||n3==26)&&(n4==8||n4==25||n4==26))
            {
                b3=true;
            }
        }
        else if(n1==8)
        {
            if((n2==7||n2==25||n2==26)&&(n3==7||n3==25||n3==26)&&(n4==7||n4==25||n4==26))
            {
                b3=true;
            }
        }
        else if(n1==9)
        {
            if((n2==10||n2==23||n2==24)&&(n3==10||n3==23||n3==24)&&(n4==10||n4==23||n4==24))
            {
                b3=true;
            }
        }
        else if(n1==10)
        {
            if((n2==9||n2==23||n2==24)&&(n3==9||n3==23||n3==24)&&(n4==9||n4==23||n4==24))
            {
                b3=true;
            }
        }
        else if(n1==11)
        {
            if((n2==12||n2==21||n2==22)&&(n3==12||n3==21||n3==22)&&(n4==12||n4==21||n4==22))
            {
                b3=true;
            }
        }
        else if(n1==12)
        {
            if((n2==11||n2==21||n2==22)&&(n3==11||n3==21||n3==22)&&(n4==11||n4==21||n4==22))
            {
                b3=true;
            }
        }
        else if(n1==13)
        {
            if((n2==14||n2==19||n2==20)&&(n3==14||n3==19||n3==20)&&(n4==14||n4==19||n4==20))
            {
                b3=true;
            }
        }
        else if(n1==14)
        {
            if((n2==13||n2==19||n2==20)&&(n3==13||n3==19||n3==20)&&(n4==13||n4==19||n4==20))
            {
                b3=true;
            }
        }
        else if(n1==15)
        {
            if((n2==16||n2==17||n2==18)&&(n3==16||n3==17||n3==18)&&(n4==16||n4==17||n4==18))
            {
                b3=true;
            }
        }
        else if(n1==16)
        {
            if((n2==15||n2==17||n2==18)&&(n3==15||n3==17||n3==18)&&(n4==15||n4==17||n4==18))
            {
                b3=true;
            }
        }
        else if(n1==17)
        {
            if((n2==15||n2==16||n2==18)&&(n3==15||n3==16||n3==18)&&(n4==15||n4==16||n4==18))
            {
                b3=true;
            }
        }
        else if(n1==18)
        {
            if((n2==15||n2==16||n2==17)&&(n3==15||n3==16||n3==17)&&(n4==15||n4==16||n4==17))
            {
                b3=true;
            }
        }
        else if(n1==19)
        {
            if((n2==20||n2==13||n2==14)&&(n3==20||n3==13||n3==14)&&(n4==20||n4==13||n4==14))
            {
                b3=true;
            }
        }
        else if(n1==20)
        {
            if((n2==19||n2==13||n2==14)&&(n3==19||n3==13||n3==14)&&(n4==19||n4==13||n4==14))
            {
                b3=true;
            }
        }
        else if(n1==21)
        {
            if((n2==22||n2==11||n2==12)&&(n3==22||n3==11||n3==12)&&(n4==22||n4==11||n4==12))
            {
                b3=true;
            }
        }
        else if(n1==22)
        {
            if((n2==21||n2==11||n2==12)&&(n3==21||n3==11||n3==12)&&(n4==21||n4==11||n4==12))
            {
                b3=true;
            }
        }
        else if(n1==23)
        {
            if((n2==24||n2==9||n2==10)&&(n3==24||n3==9||n3==10)&&(n4==24||n4==9||n4==10))
            {
                b3=true;
            }
        }
        else if(n1==24)
        {
            if((n2==23||n2==9||n2==10)&&(n3==23||n3==9||n3==10)&&(n4==23||n4==9||n4==10))
            {
                b3=true;
            }
        }
        else if(n1==25)
        {
            if((n2==26||n2==7||n2==8)&&(n3==26||n3==7||n3==8)&&(n4==26||n4==7||n4==8))
            {
                b3=true;
            }
        }
        else if(n1==26)
        {
            if((n2==25||n2==7||n2==8)&&(n3==25||n3==7||n3==8)&&(n4==25||n4==7||n4==8))
            {
                b3=true;
            }
        }
        else if(n1==27)
        {
            if((n2==28||n2==5||n2==6)&&(n3==28||n3==5||n3==6)&&(n4==28||n4==5||n4==6))
            {
                b3=true;
            }
        }
        else if(n1==28)
        {
            if((n2==27||n2==5||n2==6)&&(n3==27||n3==5||n3==6)&&(n4==27||n4==5||n4==6))
            {
                b3=true;
            }
        }
        else if(n1==29)
        {
            if((n2==30||n2==3||n2==4)&&(n3==30||n3==3||n3==4)&&(n4==30||n4==3||n4==4))
            {
                b3=true;
            }
        }
        else if(n1==30)
        {
            if((n2==29||n2==3||n2==4)&&(n3==29||n3==3||n3==4)&&(n4==29||n4==3||n4==4))
            {
                b3=true;
            }
        }
        return b3;
    }
    void Answer_Puzzle4(int n2)
    {
        if(n2==3)
        {
            System.out.println("4,29 and 30");
        }
        else if(n2==4)
        {
            System.out.println("3,29 and 30");
        }
        else if(n2==5)
        {
            System.out.println("6,27 and 28");
        }
        else if(n2==6)
        {
            System.out.println("5,27 and 28");
        }
        else if(n2==7)
        {
            System.out.println("8,25 and 26");
        }
        else if(n2==8)
        {
            System.out.println("7,25 and 26");
        }
        else if(n2==9)
        {
            System.out.println("10,23 and 24");
        }
        else if(n2==10)
        {
            System.out.println("9,23 and 24");
        }
        else if(n2==11)
        {
            System.out.println("12,21 and 22");
        }
        else if(n2==12)
        {
            System.out.println("11,21 and 22");
        }
        else if(n2==13)
        {
            System.out.println("14,19 and 20");
        }
        else if(n2==14)
        {
            System.out.println("13,19 and 20");
        }
        else if(n2==15)
        {
            System.out.println("16,17 and 18");
        }
        else if(n2==16)
        {
            System.out.println("15,17 and 18");
        }
        else if(n2==17)
        {
            System.out.println("15,16 and 18");
        }
        else if(n2==18)
        {
            System.out.println("15,16 and 17");
        }
        else if(n2==19)
        {
            System.out.println("13,14 and 20");
        }
        else if(n2==20)
        {
            System.out.println("13,14 and 19");
        }
        else if(n2==21)
        {
            System.out.println("11,12 and 22");
        }
        else if(n2==22)
        {
            System.out.println("11,12 and 21");
        }
        else if(n2==23)
        {
            System.out.println("9,10 and 24");
        }
        else if(n2==24)
        {
            System.out.println("9,10 and 23");
        }
        else if(n2==25)
        {
            System.out.println("7,8 and 26");
        }
        else if(n2==26)
        {
            System.out.println("7,8 and 25");
        }
        else if(n2==27)
        {
            System.out.println("5,6 and 28");
        }
        else if(n2==28)
        {
            System.out.println("5,6 and 27");
        }
        else if(n2==29)
        {
            System.out.println("3,4 and 30");
        }
        else if(n2==30)
        {
            System.out.println("3,4 and 29");
        }
    }
}
        