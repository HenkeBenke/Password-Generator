
package mainpasswordgenerator;

import java.util.Random;
/**
 *
 * @author aa97339
 */
public class Encryptor {
    Random random = new Random();
    int availableEncryptionMethods = 1; //Number of methods that can be used
    /*int amountOfEncryptionMethodsToUse; //Number of methods to use
    int[] encryptionMethods; //Which methods will be used
    //int randomNumber = random.nextInt(availableEncryptionMethods);
    public Encryptor () {
        //First constructor, encrypt with only one method
        amountOfEncryptionMethodsToUse = 1;
        encryptionMethods = new int[amountOfEncryptionMethodsToUse];
        for (int i = 0; i < amountOfEncryptionMethodsToUse; i++) { //Choose random encryption methods
            encryptionMethods[i] = random.nextInt(availableEncryptionMethods); //Put switch-statement directly instead?
        }
        switch (randomNumber) {
        case 1:
            
            break;
        default:
            System.out.println("Error 1");    
        } 
    }*/
    void makePassword (String userText, Password pass) {
        int lengthLeft = pass.getEndLength();
        //while (pass.getEndLength() > pass.getCurrentLength()) {
        while (lengthLeft>0) { // Swap for above later
            switch (random.nextInt(availableEncryptionMethods)) {
                case 0:
                    pass.addToPassword(PhysicalLetterPatterns.useMethod(userText, lengthLeft));
                    break;
                case 1:
                    
                    break;
                default:
                    System.out.println("Error choosing encryption method");
            }
            lengthLeft = pass.getEndLength() - pass.getCurrentLength();
            
            lengthLeft--; // Remove later
        }
    }
    void test (String name) { //First letter of every word + signs except spaces
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
            if (i==0 && letter!=' ') { //Add if first sign isn't a space
                password = password + sentence.charAt(i);
            }
            else if (((letter<65 || letter>122) || (letter>90 && letter<97)) && letter!=' ') { //Add if it sin't a letter and isn't space
                password = password + sentence.charAt(i);
                //System.out.println("2");
            }
            else if ((i-1>=0) && ((sentence.charAt(i-1)<65 || sentence.charAt(i-1)>122) || (sentence.charAt(i-1)>90 && sentence.charAt(i-1)<97)) && letter!=' ') { //Add if it is a letter after another type of sign UNCOMPLETE
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