import java.util.Scanner;

public class MarioGame {

    public static void main(String[]args){

        //Mario=rock
            //Beats Bowser
            //──────────────███████──███████
            //──────────████▓▓▓▓▓▓████░░░░░██
            //────────██▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██
            //──────██▓▓▓▓▓▓████████████░░░░██
            //────██▓▓▓▓▓▓████████████████░██
            //────██▓▓████░░░░░░░░░░░░██████
            //──████████░░░░░░██░░██░░██▓▓▓▓██
            //──██░░████░░░░░░██░░██░░██▓▓▓▓██
            //██░░░░██████░░░░░░░░░░░░░░██▓▓██
            //██░░░░░░██░░░░██░░░░░░░░░░██▓▓██
            //──██░░░░░░░░░███████░░░░██████
            //────████░░░░░░░███████████▓▓██
            //──────██████░░░░░░░░░░██▓▓▓▓██
            //────██▓▓▓▓██████████████▓▓██
            //──██▓▓▓▓▓▓▓▓████░░░░░░████
            //████▓▓▓▓▓▓▓▓██░░░░░░░░░░██
            //████▓▓▓▓▓▓▓▓██░░░░░░░░░░██
            //██████▓▓▓▓▓▓▓▓██░░░░░░████████
            //──██████▓▓▓▓▓▓████████████████
            //────██████████████████████▓▓▓▓██
            //──██▓▓▓▓████████████████▓▓▓▓▓▓██
            //████▓▓██████████████████▓▓▓▓▓▓██
            //██▓▓▓▓██████████████████▓▓▓▓▓▓██
            //██▓▓▓▓██████████──────██▓▓▓▓████
            //██▓▓▓▓████──────────────██████
            //──████
        //Luigi=paper
            //Beats Mario
                //──────────────█████──███████
            //──────────████▓▓▓▓████         ██
            //────────██▓▓▓▓▓▓▓▓▓▓██           ██
            //──────██▓▓▓▓▓▓██████████       ██
            //────██▓▓▓▓▓▓██████████████  ██
            //────██▓▓████                 ██████
            //──████████      ██   ██    ██▓▓▓▓██
            //──██   ████      ██   ██        ██▓▓▓▓██
            //██       ██████                   █▓▓██
            //██        ██   ██                 █▓▓██
            //──██          ███████       ██████
            //────████        ███████████▓▓██
            //──────██████            ██▓▓▓▓██
            //────██▓▓▓▓████████████▓▓██
            //──██▓▓▓▓▓▓▓▓██        ████
            //████▓▓▓▓▓▓██             ██
            //████▓▓▓▓▓▓██            ██
            //██████▓▓▓▓▓▓██      █████
            //──██████▓▓▓▓████████████████
            //────████████████████████▓▓▓▓██
            //──██▓▓▓▓██████████████▓▓▓▓▓▓██
            //████▓▓████████████████▓▓▓▓▓▓██
            //██▓▓▓▓████████████████▓▓▓▓▓▓██
            //██▓▓▓▓████████──────██▓▓▓▓████
            //██▓▓▓▓████──────────────██████
            //──████
        //Bowser=scissors
            //Beats Luigi
            //      ▄█       █            █
            //    ▐██      ▄█   ███    █▄        ██▌
            //    ▐██▀     █████████████    ▀██▌
            //   ▐██▌     ██████████████    ▐██▌
            //   ████   ███████████████    ████
            //  ▐█████  ███████████████  █████▌
            //   ███████████████████████████
            //   ██████████████████████████
            //     ████      ▀█████▀      █████
            //   ▄▄████▄     █████     ▄████▄▄
            //  ███████████████████████████
            // ████████████████████████████
            //▐██████████▀▄██▄▀████████████
            //▐██████   ███████████   ███████
            //▐██████    ███▀  ▀████   █████▌██
            // ██████▄    ███    ███   ▄███████
            //  ███████     █      █    ████████
            //   ██████                    ██████
            //     ██████                ██████
            //      █████   ▄        ▄   █████
            //       █████ ██       ██ █████
            //       ███████ ▄██▄ ███████
            //      █████████████████████
            //      █████████████████████
            //      ▀████████▀▀█████████▀
            //         ▀████▀      ▀█████▀







        //variables
        int score = 0;
        Scanner keyboard;
        boolean value = true;
        String choice;
        String mlb [] = new String [3];
            mlb[0] = "mario";
            mlb[1] = "luigi";
            mlb[2] = "bowser";

        keyboard = new Scanner(System.in);




        System.out.println("     MARIO\nLUIGI AND BOWSER");
        System.out.println("HELLO\nWELCOME TO MARIO LUIGI AND BOWSER");
        System.out.println("THE GAME IS SIMPLE");
        System.out.println("THERE ARE THREE OPTIONS TO CHOOSE FROM:\nMARIO\nLUIGI\nBOWSER");
        System.out.println("MARIO BEATS BOWSER, LUIGI BEATS MARIO, AND BOWSER BEATS LUIGI");
        System.out.println("YOU TYPE THE CHARACTER OF YOUR CHOICE AND I CHOOSE ONE, AND WHOMEVER WINS GETS A POINT.\n WHOEVER GETS THE MOST POINTS IN THE END WINS");
        System.out.println("READY?\nLET'S A GO");


        while (value){
            System.out.println("*take your pick (mario  luigi  bowser)*");
                choice = keyboard.nextLine();
                    if(choice.equals("mario")){
                                              }
















                    }



    }
}
