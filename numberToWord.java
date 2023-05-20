/* Write a program in Java to convert number into words & print it */
// This code covert upto "99999"

import java.util.Scanner;

public class numberToWord {
    public static void main(String[] args) {
        int num, len = 0, digit, guessNumber = 0, mul = 1; // delclear all integer variable
        String resStr = "";
        // assign all word into an string array
        String[] oneDigit = new String[] { "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine" };
        String[] twoDigit = new String[] { "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eightty",
                "ninety" };
        String[] twoDigitSpecial = new String[] { "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                "seventeen", "eighteen", "nineteen" };

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = input.nextInt();

        // Write the logic to covert number to word
        while (num > 0) {
            digit = num % 10;
            len++;
            guessNumber = guessNumber + digit * mul;
            mul = mul * 10;
            if (digit > 0) {
                // use switch
                switch (len) {
                    case 1:
                        if (digit > 0) {
                            resStr = oneDigit[--digit];
                        }
                        break;
                    case 2:
                        if (guessNumber > 10 && guessNumber < 20) {
                            resStr = "";
                            resStr = twoDigitSpecial[(guessNumber % 10) - 1];
                        } else if (guessNumber % 10 == 0) {
                            resStr = "";
                            resStr = twoDigit[--digit];
                        } else {
                            resStr = String.format("%s %s", twoDigit[--digit], resStr);
                        }
                        break;
                    case 3:
                        if (guessNumber % 100 == 0) {
                            resStr = String.format("%s hundred ", oneDigit[--digit]);
                        } else {
                            resStr = String.format("%s hundred %s", oneDigit[--digit], resStr);
                        }
                        break;
                    case 4:
                        if (guessNumber % 1000 == 0) {
                            resStr = String.format("%s thousand ", oneDigit[--digit]);
                        } else {
                            resStr = String.format("%s thousand %s", oneDigit[--digit], resStr);
                        }
                        break;
                    case 5:
                        if (guessNumber / 1000 > 10 && guessNumber / 1000 < 20) {
                            resStr = resStr.replaceFirst(oneDigit[((guessNumber / 1000) % 10) - 1],
                                    twoDigitSpecial[((guessNumber / 1000) % 10) - 1]);

                        } else if (guessNumber % 10000 == 0) {
                            resStr = String.format("%s thousand", twoDigit[--digit]);
                        } else {
                            if (resStr.contains(" thousand ")) {
                                resStr = String.format("%s %s", twoDigit[--digit], resStr);
                            } else {
                                resStr = String.format("%s thousand %s", twoDigit[--digit], resStr);

                            }
                        }
                        break;
                    default:
                        break;

                }
            }
            num = num / 10;
        }
        input.close();
        System.out.print(resStr.toUpperCase());
    }
}
