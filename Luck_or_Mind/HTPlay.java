import java.io.*;
class HTPlay
{
    void How_To_Play()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\u000C");
        System.out.println("                         The Game of LIFE");
        System.out.println("                                The unique game through the ups and downs of life.");
        System.out.println("TO START\n");
        System.out.println("Decide how many players are playing this game and enter the number.");
        System.out.println("At the starting of the game, you will have $10,000.");
        System.out.println("You have the choice whether you need an auto insurance or not.");
        System.out.println("Auto insurance is worth $1,000.\n");
        Thread.sleep(6000);
        System.out.println("PLAYING THE GAME\n");
        System.out.println("Moving requires spinning the wheel. For this, you need to just type \"Spin\" whenever we ask you to.");
        System.out.println("You may land on any of the following spaces:");
        System.out.println("\t1)Yellow Spaces-Default one, not specified on the board.");
        System.out.println("\t  Reward or penalty takes place when you LAND IN a yellow space.");
        System.out.println("\t2)Red Spaces-Specified on the board.");
        System.out.println("\t  The reward or penalty takes place whether you LAND IN OR PASS red spaces.");
        System.out.println("\t3)White Spaces-Specified on the board.");
        System.out.println("    When you LAND IN OR PASS a white OPTION space, you may choose to take advantage of the opportunity there\n    or let it go.");
        Thread.sleep(10000);
        System.out.println("\nPAY DAY");
        System.out.println("\nYour salary shall be decided by the job you get while you procced with your game.");
        System.out.println("Suppose you do not get any of the jobs, you get your job as University Degree.");
        System.out.println("You get your salary when you LAND IN OR PASS a red PAY DAY.");
        Thread.sleep(6000);
        System.out.println("\nGETTING MARRIED");
        System.out.println("\nYou must stop by the church in the GET MARRIED space. In this turn, you collect presents.");
        System.out.println("Spin the wheel again. Collect $10,000 for 6,7 or 8.");
        System.out.println("Collect $5,000 for 4 or 5. Collect nothing for 1,2 or 3.");
        System.out.println("You may then proceed with your journey of life.\n");
        Thread.sleep(7000);
        System.out.println("SONS AND DAUGHTERS");
        System.out.println("\nWhen you LAND IN one of the spaces where a child is born, you spin the wheel.");
        System.out.println("You then collect $2,000 for 6,7 or 8; $1,000 for 5 or 6; nothing for 1,2 or 3.");
        System.out.println("If you have two children, collect double the amount of what you collect for a single child.");
        Thread.sleep(6000);
        System.out.println("\nREVENGE");
        System.out.println("\nWhen you LAND IN a REVENGE space, you collect $100,000 from a player whom you wish to take from.");
        System.out.println("Exception is that you are forced to take the money from the only opponent in a two player game.");
        Thread.sleep(5000);
        System.out.println("\nLUCKY DAYS");
        System.out.println("\nWhen you LAND IN a LUCKY DAY space, you must enter any two values from 1 to 8 where you would like to stake\nyour $20,000 on.");
        System.out.println("Then you must decide if you would really like to stake your $20,000.");
        System.out.println("If you do not wish to, you get $20,000. If you wish to, you may get $300,000 or lose your $20,000 which you\nstaked.");
        Thread.sleep(7000);
        System.out.println("\nPLAYING THE MARKET");
        System.out.println("\nWhen you LAND IN OR PASS one of these white spaces, you may, if you own stock, wish to play the market in\nthat turn.");
        System.out.println("The number that you get after spinning the wheel decides your current status of your market.");
        System.out.println("If it points to 1,2 or 3, the market is down. You pay $60,000.");
        System.out.println("If it points to 4 or 5, the market remains stable; no gain or loss.");
        System.out.println("If it points to 6,7 or 8, the market is up. You collect $120,000.\n");
        Thread.sleep(7500);
        System.out.println("MILLIONAIRE");
        System.out.println("\nYou do not need an exact spin to reach MILLIONAIRE. You receive $240,000 bonus after every player reaches\nMILLIONAIRE.");
        Thread.sleep(4700);
        System.out.println("\nWINNING THE GAME");
        System.out.println("After every player reaches MILLIONAIRE, we decide the winner of the game and give awards.");
        System.out.println("Winner of the game is decided by how much amount he has after finishing the game.");
        Thread.sleep(5000);
        System.out.println("\nOTHERS");
        System.out.println("We update you with your amount balance. If it shows a negative value, it means that you are indebted to\nthe bank.");
        System.out.println("Many players can LAND ON the same space of others.");
        System.out.println("If there are more than 4 players, you can organise a tournament.");
        System.out.println("For example, if there are 9 players, make the first three players play first and then the next three players");
        System.out.println("and again the last three players. The winner of these players again play a final 3-player game and the\nchampion is decided.");
        System.out.println("Remember that it is just a game of luck. Decide at the first, the order of players.");
        System.out.println("Hope you enjoy playing our game.");
        Thread.sleep(10000);
        System.out.println("Press Enter to continue.");
        br.read();
        System.out.print("\u000C");
        Luck L1=new Luck();
        L1.menu();
    }
}