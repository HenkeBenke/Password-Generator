
package mainpasswordgenerator;

import java.util.Random;
/**
 *
 * @author aa97339
 */
public class Encryptor { //Add cancel button for use during creation?
    Random random = new Random();
    int availableEncryptionMethods = 1;                                         //Number of methods that can be used
    int availableEncryptAgainMethods = 1;                                       //Number of methods that can be used to encrypt a password again 
    //public Encryptor () {}
    /*void makePassword (UserInput input, Password pass, javax.swing.JLabel questionField) { //Add non-repeating of methods option; only using different methods when going multiple times?
        int lengthLeftToMin = pass.getMinLength();  //Remove later
        int i = 0;             //Remove later
        int lastMethodUsed = -1;
        //while (pass.getMinLength() > pass.getCurrentLength()) { 
        while (lengthLeftToMin>0) { // Swap for above later
            int methodPicker = random.nextInt(availableEncryptionMethods);
            if (methodPicker == lastMethodUsed) {                               //Don't use same method in a row during one encryption
                continue;
            }
            lastMethodUsed = methodPicker;
            switch (methodPicker) { //Follow questions if long rest bit that cant be filled with encryption
                case 1:
                    if (!input.getQwerty()) { //Fix memory methods, and finish the uncompleted ones
                        continue;
                    }
                    pass.addToPassword(PhysicalLetterPatterns.useMethod(input, pass.getMaxLength()- pass.getCurrentLength()));
                    break;
                case 0:     //Need to fix when going past the alpahbet (currently only accouning for a few chars past)
                    String question = QuestionCollection.singelNounBased[random.nextInt(QuestionCollection.singelNounBased.length)]; //Use different random?
                    questionField.setText(question);
                    LetterSwap.stepsInAlphabet(input, pass, 1);  //Set steps to random? Or let user choose between specified and random?
                    break;
                case 2:     //Need to fix when going past the alpahbet (currently only accouning for a few chars past)
                    LetterSwap.incrementingStepsInAlphabet(input, pass, 1, 1); //Set steps to random? Or let user choose between specified and random?
                    break;
                default:
                    System.out.println("Error choosing encryption method");
            }
            lengthLeftToMin = pass.getMinLength() - pass.getCurrentLength() - i;    //Remove later
            i++; // Remove later
            lengthLeftToMin = 0; //To test only once, remove later obviously
        }
    }*/
    void makePassword (UserInput input, Password pass) {
        if (pass.getMinLength()-pass.getCurrentLength()<1) {
            return;
        }
        else {  //Need to add follow questions if long rest bit that cant be filled with encryption
            switch (pass.getLastMethodUsed()) {
                case 1: //Fix memory methods, and finish the uncompleted ones
                    PhysicalLetterPatterns.useMethod(input, pass);
                    break;
                case 0:     //Need to fix when going past the alpahbet (currently only accouning for a few chars past)
                    LetterSwap.stepsInAlphabet(input, pass, 1);  //Set steps to random? Or let user choose between specified and random?
                    break;
                case 2:     //Need to fix when going past the alpahbet (currently only accouning for a few chars past)
                    LetterSwap.incrementingStepsInAlphabet(input, pass, 1, 1); //Set steps to random? Or let user choose between specified and random?
                    break;
                default:
                    System.out.println("Error picking encryption method");
            }
        }
        if (pass.getMinLength()-pass.getCurrentLength()>1) {
            return;
        }
    }
    void methodPicker (UserInput input, Password pass, javax.swing.JLabel questionField) { //Remove input?
        while (true) { 
            int methodNr = random.nextInt(availableEncryptionMethods);
            if (methodNr == pass.getLastMethodUsed()) {                     //Don't use same method in a row during one encryption
                continue;
            }
            pass.setLastMethodUsed(methodNr);
            String question;
            switch (methodNr) {
                case 1:
                    if (!input.getQwerty()) {
                        continue;
                    }
                    question = QuestionCollection.singelNounBased[random.nextInt(QuestionCollection.singelNounBased.length)]; //Use different random?
                    questionField.setText(question);
                    break;
                case 0:
                    question = QuestionCollection.singelNounBased[random.nextInt(QuestionCollection.singelNounBased.length)]; //Use different random?
                    questionField.setText(question);
                    break;
                case 2:
                    question = QuestionCollection.singelNounBased[random.nextInt(QuestionCollection.singelNounBased.length)]; //Use different random?
                    questionField.setText(question);
                    break;
                default:
                    System.out.println("Error choosing encryption method");
            }
            break;
        }
    }
    void encryptAgain (UserInput input, int passNr, int maxLength, int interval) {
        Password pass = MainPasswordGenerator.listOfPasswords.get(passNr);
        Password passToMakeEncryptionOn = new Password (pass,passNr);
        passToMakeEncryptionOn.makeLonger(maxLength, interval);
        MainPasswordGenerator.listOfPasswords.add(MainPasswordGenerator.listOfPasswords.size(), passToMakeEncryptionOn);
        input.setPassToEncryptAgain(passToMakeEncryptionOn.getPasswordText());
        MainPasswordGenerator.listOfInputs.add(MainPasswordGenerator.listOfInputs.size(),input);
        switch (availableEncryptAgainMethods) {
            case 0:
                LetterSwap.stepsInAlphabet(input, pass, 1);  //Set steps to random? Or let user choose between specified and random?
                break;
            case 1:
                LetterSwap.incrementingStepsInAlphabet(input, pass, 1, 1); //Set steps to random? Or let user choose between specified and random?
                break;
            default:
                System.out.println("Error choosing encrypt again method");
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