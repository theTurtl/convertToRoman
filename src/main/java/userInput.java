import java.io.Console;
import java.util.Scanner;

public class userInput {
        public void inputField() {

            System.out.println("Skriv inn et tall: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            System.out.println("Tallet " + "er " + romanConverter(number) + " i romerske numre.");

        }

        public String romanConverter(int number){
            String result = "";
            int input = number;

            while(input > 0){
                if (input < 10) {
                    if(input <= 3) {
                        for (int i = 0; i < input; i++) {
                            result += "I";
                            input -= 1;
                        }
                    }else if (input == 4) {
                        result += "IV";
                        input -= 4;
                    } else if (input >= 5 && input < 9) {
                        result += "V";
                        input -= 5;
                    } else if (input == 9) {
                        result += "IX";
                        input -= 9;
                    }
                }
                if (input >= 10 && input < 50) {
                    result += "X";
                    input -= 10;
                }
                if (input >= 50 && input < 90) {
                    result += "L";
                    input -= 50;
                }
                if (input >= 90 && input < 100) {
                    result += "XC";
                    input -= 90;
                }
                if (input >= 100 && input < 500) {
                    result += "C";
                    input -= 100;
                }
                if (input >= 500 && input < 900) {
                    result += "D";
                    input -= 500;
                }
                if (input >= 900 && input < 1000) {
                    result += "CM";
                    input -= 900;
                }
                if (input >= 1000) {
                    result += "M";
                    input -= 1000;
                }
            }
            return result;
        }
}
