import java.util.Scanner;

class Cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for( ; ;){
            System.out.println();
            System.out.println("	GAME START!!! ");
            System.out.println();
            System.out.println("1. FOUR		2. SIX		3. WICKET");
            System.out.println();
            System.out.print("Enter your response: ");

            int response1 = sc.nextInt();
            String userRes = "";

            if (response1 == 1) {
                userRes = "FOUR";
            } else if (response1 == 2) {
                userRes = "SIX";
            } else if (response1 == 3) {
                userRes = "WICKET";
            } else {
                System.out.println("INVALID RESPONSE!!!");
                continue;
            }

            
            int botResp = 1 + (int)(Math.random() * 3);
            String response2 = "";

            if (botResp == 1) {
                response2 = "FOUR";
            } else if (botResp == 2) {
                response2 = "SIX";
            } else {
                response2 = "WICKET";
            }

            System.out.println();
            System.out.println("	USER		BOT");
            System.out.println("	" + userRes + "		" + response2);
            System.out.println();

            if ((userRes.equals("FOUR") && response2.equals("WICKET")) ||
                (userRes.equals("SIX") && response2.equals("FOUR")) ||
                (userRes.equals("WICKET") && response2.equals("SIX"))) {
                System.out.println("USER WON!!!");
            } else if ((userRes.equals("FOUR") && response2.equals("SIX")) ||
                       (userRes.equals("SIX") && response2.equals("WICKET")) ||
                       (userRes.equals("WICKET") && response2.equals("FOUR"))) {
                System.out.println("BOT WON!!!");
            } else {
                System.out.println("DRAW");
            }
        }
    }
}