
package mainpasswordgenerator;

import java.util.Random;
/**
 *
 * @author aa97339
 */
public class Encryptor {
    Random random = new Random();
    int availableEncryptionMethods = 1;                                         //Number of methods that can be used
    //public Encryptor () {}
    void makePassword (UserInput input, Password pass) { //Add non-repeating of methods option; only using different methods when going multiple times?
        int lengthLeftToMin = pass.getMinLength();  //Remove later
        int i = 0;             //Remove later
        //while (pass.getMinLength() > pass.getCurrentLength()) { 
        while (lengthLeftToMin>0) { // Swap for above later
            switch (random.nextInt(availableEncryptionMethods)) { //Follow questions if long rest bit that cant be filled with encryption
                case 0: //Ask about qwerty layout first probably
                    pass.addToPassword(PhysicalLetterPatterns.useMethod(input, pass.getMaxLength()- pass.getCurrentLength()));
                    break;
                case 1:
                    pass.addToPassword(LetterSwap.stepsInAlphabet(input, 1));  //Set steps to random? Or let user choose between specified and random?
                    break;
                default:
                    System.out.println("Error choosing encryption method");
            }
            lengthLeftToMin = pass.getMinLength() - pass.getCurrentLength() - i;    //Remove later
            i++; // Remove later
            lengthLeftToMin = 0; //To test only once, remove later obviously
        }
    }
    void test (String name) {                                                   //First letter of every word + signs except spaces
        int amountOfDifferentSentences = 3;
        String sentence;
        String password = "";
        switch (random.nextInt(amountOfDifferentSentences)) {
            case 0:
                sentence = "Your name is " + name + " !";
                break;
            case 1:
                sentence = "Welcome " + name + " 2 your \"program\" of choice";
                break;
            case 2:
                sentence = "I, " + name + ", have been enlightened; I now know how 2 get awesome passwords #password-generator";
                break;
            default:
                sentence = "";
                System.out.println("Error 2");
        }
        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);
            if (i==0 && letter!=' ') {                                          //Add if first sign isn't a space
                password = password + sentence.charAt(i);
            }
            else if (((letter<65 || letter>122) || (letter>90 && letter<97)) && letter!=' ') { //Add if it isn't a letter and isn't space
                password = password + sentence.charAt(i);
                //System.out.println("2");
            }
            else if ((i-1>=0) && ((sentence.charAt(i-1)<65 || sentence.charAt(i-1)>122) || (sentence.charAt(i-1)>90 && sentence.charAt(i-1)<97)) && letter!=' ') { //Add if it is a letter after another type of sign UNCOMPLETE?
                password = password + sentence.charAt(i);
                //System.out.println("3");
             }
        }
        if (password.length()==0) {
            System.out.println("Inget lösenord skapades");
        }
        else {
            System.out.println("Your password is: " + password);
            System.out.println("The memory method to use is to take the first letter of every word and additional signs (except spaces) from the following sentence:");
            System.out.println(sentence);
            System.out.println();
        }
    } 
}