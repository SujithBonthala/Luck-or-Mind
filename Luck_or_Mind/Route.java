import java.io.*;
class Route
{
    void route()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\u000C");
        System.out.println("              ROUTE OF GAME OF LIFE");
        System.out.println(" 0. Starting point.");
        System.out.println(" 1. Slow Start! Spin again.");
        System.out.println(" 2. Capture escaped lion! Collect $4,000.");
        System.out.println(" 3. Car repairs. Pay $2,000.");
        System.out.println(" 4. Collect $3,000 scholarship.(Red space)");
        System.out.println(" 5. Pay $5,000 tuition.(Red space)");
        Thread.sleep(7000);
        System.out.println(" 6. Collect $2,000 for prize photo.");
        System.out.println(" 7. Gambling loss! Pay $2,000.");
        System.out.println(" 8. Doctor! Salary $50,000. Go forward 6 spaces.");
        System.out.println(" 9. Journalist! Salary $24,000. Go forward 5 spaces.");
        System.out.println("10. Lawyer! Salary $50,000. Go forward 4 spaces.");
        Thread.sleep(6500);
        System.out.println("11. Teacher! Salary $20,000. Go forward 3 spaces.");
        System.out.println("12. Physicist! Salary $30,000. Go forward 2 spaces.");
        System.out.println("13. University Degree. Salary $16,000.(Red space)");
        System.out.println("14. PAY DAY!(Red space)");
        System.out.println("15. It's your birthday! Collect $1,000.");
        Thread.sleep(6500);
        System.out.println("16. Discover uranium! Collect $240,000.");
        System.out.println("17. Start a business. Pay $30,000.");
        System.out.println("18. Inheritance! Collect $300,000.");
        System.out.println("19. If you want life insurance, pay $10,000.(White space)");
        System.out.println("20. Find art treasure! Collect $120,000.");
        Thread.sleep(6500);
        System.out.println("21. PAY DAY!(Red space)");
        System.out.println("22. Uncle needs help. Pay $2,000.");
        System.out.println("23. Get married! Collect presents.(Red space)");
        System.out.println("24. Business Trip. Pay $3,000.");
        System.out.println("25. Buy furniture. Pay $6,000.");
        Thread.sleep(6500);
        System.out.println("26. Car accident. Pay $12,000 if not insured.");
        System.out.println("27. Business needs to advertise. Pay $60,000.");
        System.out.println("28. Buy two horses. Pay $60,000.");
        System.out.println("29. PAY DAY!(Red space)");
        System.out.println("30. Help your father-in-law. Pay $20,000.");
        Thread.sleep(6500);
        System.out.println("31. Win the lottery! Collect $96,000.");
        System.out.println("32. Buy a house. Pay $40,000.(Red space)");
        System.out.println("33. If you want fire insurance, Pay $10,000.(White space)");
        System.out.println("34. PAY DAY!(Red space)");
        System.out.println("35. LUCKY DAY! Collect $20,000. Keep it or try for $300,000.");
        Thread.sleep(6500);
        System.out.println("36. A son is born! Collect presents.");
        System.out.println("37. Aunt leaves you 50 cats. Pay $20,000 for their care.");
        System.out.println("38. A daughter is born! Collect presents.");
        System.out.println("39. Win on horses! Collect $300,000.");
        System.out.println("40. PAY DAY!(Red space)");
        Thread.sleep(6500);
        System.out.println("41. REVENGE! Sue for damages!");
        System.out.println("42. Twin sons are born! Collect presents.");
        System.out.println("43. Taxes due. Pay half of your salary.(Red space)");
        System.out.println("44. If you want stock, Pay $50,000.(White space)");
        System.out.println("45. A son is born! Collect presents.");
        Thread.sleep(6800);
        System.out.println("46. You may play the market if you own stock.(White space)");
        System.out.println("47. Find famous paintings! Collect $480,000.");
        System.out.println("48. Stock prices drop. Pay $36,000 if you own stock.");
        System.out.println("49. PAY DAY!(Red space)");
        System.out.println("50. Business is booming! Collect $100,000.");
        Thread.sleep(6000);
        System.out.println("51. A daughter is born! Collect presents.");
        System.out.println("52. Wrecked car! Pay $16,000 if not insured.");
        System.out.println("53. Invention pays off! Collect $50,000.");
        System.out.println("54. Buy office building. Pay $150,000.");
        System.out.println("55. REVENGE! Sue for damages!");
        Thread.sleep(6300);
        System.out.println("56. A son is born! Collect presents.");
        System.out.println("57. LUCKY DAY! Collect $20,000. Keep it or try for $300,000.");
        System.out.println("58. PAY DAY!(Red space)");
        System.out.println("59. Stocks are up! If you own stock, collect $240,000.");
        System.out.println("60. Expand business. Pay $120,000.");
        Thread.sleep(6500);
        System.out.println("61. Stock prices drop. Pay $16,000 if you own stock.");
        System.out.println("62. Electronics stock skyrockets! Collect $120,000 if you own stock.");
        System.out.println("63. PAY DAY!(Red space)");
        System.out.println("64. If you have life insurance Collect $70,000.");
        System.out.println("65. Climb Mt. Everest! Collect $120,000.");
        Thread.sleep(6500);
        System.out.println("66. A daughter is born! Collect presents.");
        System.out.println("67. Taxes due. Pay half of your salary.(Red space)");
        System.out.println("68. LUCKY DAY! Collect $20,000. Keep it or try for $300,000.");
        System.out.println("69. Save polluted lake. Pay $240,000.");
        System.out.println("70. PAY DAY!(Red space)");
        Thread.sleep(6650);
        System.out.println("71. You may play the market if you own stock.(White space)");
        System.out.println("72. REVENGE! Sue for damages.");
        System.out.println("73. Reckless driver! Pay $60,000 if not insured.");
        System.out.println("74. Win tennis tournament! Collect $100,000.");
        System.out.println("75. Adopt a son and a daughter! Collect presents.");
        Thread.sleep(6500);
        System.out.println("76. Polar expedition! Pay $100,000.");
        System.out.println("77. PAY DAY!(Red space)");
        System.out.println("78. If you have life insurance, collect $60,000.");
        System.out.println("79. Car accident! Pay $50,000 if not insured.");
        System.out.println("80. House on fire! Pay $60,000 if not insured.");
        Thread.sleep(6500);
        System.out.println("81. If you own stock, collect $18,000 dividend.");
        System.out.println("82. Win a case in court! Collect $240,000.");
        System.out.println("83. PAY DAY!(Red space)");
        System.out.println("84. LUCKY DAY! Collect $20,000. Keep it or try for $300,000.");
        System.out.println("85. Spin the wheel. Collect $1,000 times the number spun.");
        Thread.sleep(6600);
        System.out.println("86. Uncle leaves you a skunk farm! Pay $20,000 to get rid of it.");
        System.out.println("87. Gold mine! Collect $360,000 if you own stock.");
        System.out.println("88. Burglar strikes! Pay $10,000.");
        System.out.println("89. If you just spun 3, collect $30,000.");
        System.out.println("90. Take world cruise. Pay $20,000.");
        Thread.sleep(6550);
        System.out.println("91. PAY DAY!(Red space)");
        System.out.println("92. Uncle in jail! Pay $2,000 bail.");
        System.out.println("93. Buy new home. Pay $140,000.");
        System.out.println("94. Write a best seller. Collect $96,000 royalties.");
        System.out.println("95. Pipe bursts! Pay $20,000 water damage.");
        Thread.sleep(6500);
        System.out.println("96. Buy a helicopter. Pay $100,000.");
        System.out.println("97. Goat eats prize orchids! Pay $3,000.");
        System.out.println("98. PAY DAY!(Red space)");
        System.out.println("99. You may play the market if you own stock.(White space)");
        System.out.println("100.Buy a yacht! Pay $80,000.");
        Thread.sleep(6500);
        System.out.println("101.Taxes due. Pay half of your salary.(Red space)");
        System.out.println("102.Discover Atlantis while skin diving! Collect $12,000.");
        System.out.println("103.REVENGE! Sue for damages!");
        System.out.println("104.Give $10,000 to favourite charity.");
        System.out.println("105.PAY DAY!(Red space)");
        Thread.sleep(6600);
        System.out.println("106.If you have life insurance, collect $120,000.");
        System.out.println("107.Stocks are up! If you own stock, collect $140,000.");
        System.out.println("108.Help homeless children. Give $120,000 to orphanage.(Red space)");
        System.out.println("109.LUCKY DAY! Collect $20,000. Keep it or try for $300,000.");
        System.out.println("110.PAY DAY!(Red space)");
        Thread.sleep(6800);
        System.out.println("111.Inherit a cattle ranch! Collect $240,000.");
        System.out.println("112.Yacht rams iceberg! Sell ice cubes. Collect $10,000.");
        System.out.println("113.Buy a luxury car. Pay $40,000.");
        System.out.println("114.Noble Prize. Collect $120,000.");
        System.out.println("115.Strike Oil! Collect $480,000 if you own stock.");
        Thread.sleep(6500);
        System.out.println("116.PAY DAY!(Red space)");
        System.out.println("117.Royalties! Collect $120,000.");
        System.out.println("118.Property taxes! Pay $50,000.(Red space)");
        System.out.println("119.Sell cattle ranch. Collect $200,000.");
        System.out.println("120.Tornado hits home! Pay $100,000 if not insured.");
        Thread.sleep(6650);
        System.out.println("121.PAY DAY!(Red space)");
        System.out.println("122.TV game show winner! Collect $240,000.");
        System.out.println("123.Robbed! Pay $70,000.");
        System.out.println("124.If you have life insurance, collect $240,000.");
        System.out.println("125.LUCKY DAY! Collect $20,000. Keep it or try for $300,000.");
        Thread.sleep(6550);
        System.out.println("126.REVENGE! Sue for damages!");
        System.out.println("127.European tour. Pay $20,000.");
        System.out.println("128.Collect $3,000 on old debts.");
        System.out.println("129.PAY DAY!(Red space)");
        System.out.println("130.Buy rare coins. Pay $40,000.");
        Thread.sleep(6400);
        System.out.println("131.World cruise. Pay $70,000.");
        System.out.println("132.If you own stock, sell! Collect $600,000.");
        System.out.println("133.If you have life insurance, collect $240,000.");
        System.out.println("134.Buy phony diamond. Pay $20,000.");
        System.out.println("135.MILLIONAIRE! Retire in style.");
        Thread.sleep(6600);
        System.out.println("Press Enter to continue.");
        br.read();
        System.out.print("\u000C");
        Luck L2=new Luck();
        L2.menu();
    }
}
        