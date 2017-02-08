
package mainpasswordgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author aa97339
 */
public class Encryptor { //Seems to stop too early sometimes; length is static 10, password is currently 8 chars and it doesn't ask another question
    Random random = new Random();
    int availableEncryptionMethods = 3;                                         //Number of methods that can be used
    int availableEncryptAgainMethods = 2;                                       //Number of methods that can be used to encrypt a password again 
    void makePassword (UserInput input, Password pass, javax.swing.JLabel questionfield, javax.swing.JComboBox<String> passComboBox, javax.swing.JPanel quesPan, javax.swing.JButton startBut, javax.swing.JButton printBut, javax.swing.JButton encryptAgainBut, javax.swing.JButton makeLongerBut) {
        if (pass.getMinLength()-pass.getCurrentLength()<1) {
            System.out.println("Trying to make password when it's already done");
            return;
        }
        else {  //Need to add follow questions if long rest bit that cant be filled with encryption
            int priorLength = pass.getCurrentLength();
            switch (pass.getLastMethodUsed()) {
                case 0: //Maybe make better memory methods text
                    PhysicalLetterPatterns.useMethod(input, pass);
                    break;
                case 1:
                    LetterSwap.stepsInAlphabet(input, pass, 1);  //Set steps to random? Or let user choose between specified and random? Set different random based on complexity chosen?
                    break;
                case 2:
                    LetterSwap.incrementingStepsInAlphabet(input, pass, 1, 1); //Set steps to random? Or let user choose between specified and random? Set different random based on complexity chosen?
                    break;
                default:
                    System.out.println("Error picking encryption method");
            }
            if (priorLength==pass.getCurrentLength()) {
                switch (pass.getLastMethodUsed()) {
                    case 1:
                        tryOtherSingleNounBased(input, pass);
                        break;
                    case 0:
                        tryOtherSingleNounBased(input, pass);
                        break;
                    case 2:
                        tryOtherSingleNounBased(input, pass);
                        break;
                }
                if (priorLength==pass.getCurrentLength()) {
                    //Move below line to the place where remaining pass length == 0
                    passComboBox.addItem(MainPasswordGenerator.listOfPasswords.get(MainPasswordGenerator.listOfPasswords.size()-1).getPasswordText());
                    quesPan.setVisible(false);
                    startBut.setEnabled(true);
                    printBut.setEnabled(true);
                    encryptAgainBut.setEnabled(true);
                    makeLongerBut.setEnabled(true);
                    return; //Swap for short questions
                }
            }
        }
        if (pass.getMinLength()-pass.getCurrentLength()>1) {
            methodPicker(input, pass, questionfield);
        }
        else {
            passComboBox.addItem(MainPasswordGenerator.listOfPasswords.get(MainPasswordGenerator.listOfPasswords.size()-1).getPasswordText());
            quesPan.setVisible(false);
            startBut.setEnabled(true);
            printBut.setEnabled(true);
            encryptAgainBut.setEnabled(true);
            makeLongerBut.setEnabled(true);
        }
    }
    void methodPicker (UserInput input, Password pass, javax.swing.JLabel questionField) {
        while (true) { 
            int methodNr = random.nextInt(availableEncryptionMethods);
            if (methodNr == pass.getLastMethodUsed()) {                         //Don't use same method twice in a row during one encryption
                continue;
            }
            pass.setLastMethodUsed(methodNr);
            switch (methodNr) {
                case 0:
                    if (!input.getQwerty()) {
                        continue;
                    }
                    while (true) {
                        if (pass.getAmountOfSingleNounQuestionsUsed()>=QuestionCollection.singleNounBased.length) {
                            System.out.println("Slut på frågor?");
                            break;   //What to do if out of questions?
                        }
                        int questionNr = random.nextInt(QuestionCollection.singleNounBased.length); //Use different random?
                        boolean used = false;
                        for (int i = 0; i < pass.getAmountOfSingleNounQuestionsUsed(); i++) {
                            if (pass.getSingleNounQuestionUsed(i)==questionNr) {
                                used = true;
                                break;
                            }
                        }
                        if (used) {
                            continue;
                        }
                        questionField.setText(QuestionCollection.singleNounBased[questionNr]);
                        pass.addSingleNounUsed(questionNr);
                        break;
                    }
                    break;
                case 1:
                    while (true) {
                        if (pass.getAmountOfSingleNounQuestionsUsed()>=QuestionCollection.singleNounBased.length) {
                            System.out.println("Slut på frågor?");
                            break;   //What to do if out of questions?
                        }
                        int questionNr = random.nextInt(QuestionCollection.singleNounBased.length); //Use different random?
                        boolean used = false;
                        for (int i = 0; i < pass.getAmountOfSingleNounQuestionsUsed(); i++) {
                            if (pass.getSingleNounQuestionUsed(i)==questionNr) {
                                used = true;
                                break;
                            }
                        }
                        if (used) {
                            continue;
                        }
                        questionField.setText(QuestionCollection.singleNounBased[questionNr]);
                        pass.addSingleNounUsed(questionNr);
                        break;
                    }
                    break;
                case 2:
                    while (true) {
                        if (pass.getAmountOfSingleNounQuestionsUsed()>=QuestionCollection.singleNounBased.length) {
                            System.out.println("Slut på frågor?");
                            break;   //What to do if out of questions?
                        }
                        int questionNr = random.nextInt(QuestionCollection.singleNounBased.length); //Use different random?
                        boolean used = false;
                        for (int i = 0; i < pass.getAmountOfSingleNounQuestionsUsed(); i++) {
                            if (pass.getSingleNounQuestionUsed(i)==questionNr) {
                                used = true;
                                break;
                            }
                        }
                        if (used) {
                            continue;
                        }
                        questionField.setText(QuestionCollection.singleNounBased[questionNr]);
                        pass.addSingleNounUsed(questionNr);
                        break;
                    }
                    break;
                default:
                    System.out.println("Error choosing encryption method");
            }
            break;
        }
    }
    void tryOtherSingleNounBased (UserInput input, Password pass) {
        List<Integer> methodNumbers = new ArrayList<>();
        for (int i = 0; i < availableEncryptionMethods; i++) {
            methodNumbers.add(i, i);
        }
        for (int i = 0; i < availableEncryptionMethods; i++) {
            int methodToTry = methodNumbers.remove(random.nextInt(methodNumbers.size())); //Use differnet random?
            if (methodToTry==pass.getLastMethodUsed()) {
                continue;
            }
            switch (i) {
                case 0: //Maybe make better memory methods text
                    PhysicalLetterPatterns.useMethod(input, pass);
                    break;
                case 1:
                    LetterSwap.stepsInAlphabet(input, pass, 1);  //Set steps to random? Or let user choose between specified and random? Set different random based on complexity chosen?
                    break;
                case 2:
                    LetterSwap.incrementingStepsInAlphabet(input, pass, 1, 1); //Set steps to random? Or let user choose between specified and random? Set different random based on complexity chosen?
                    break;
                default:
                    
            }
        }
        
    }
    /*void encryptAgain (UserInput input, int passNr, int maxLength, int interval) {
        Password pass = MainPasswordGenerator.listOfPasswords.get(passNr);
        Password passToMakeEncryptionOn = new Password (pass,passNr);
        passToMakeEncryptionOn.makeLonger(maxLength, interval);
        MainPasswordGenerator.listOfPasswords.add(MainPasswordGenerator.listOfPasswords.size(), passToMakeEncryptionOn);
        input.setPassToEncryptAgain(passToMakeEncryptionOn.getPasswordText());
        MainPasswordGenerator.listOfInputs.add(MainPasswordGenerator.listOfInputs.size(),input);
        switch (availableEncryptAgainMethods) {
            case 0:
                LetterSwap.stepsInAlphabet(input, pass, 1);  //Set steps to random? Or let user choose between specified and random? Set different random based on complexity chosen?
                break;
            case 1:
                LetterSwap.incrementingStepsInAlphabet(input, pass, 1, 1); //Set steps to random? Or let user choose between specified and random? Set different random based on complexity chosen?
                break;
            default:
                System.out.println("Error choosing encrypt again method");
        }
        
    }*/
    void encryptAgain (int passNr, javax.swing.JComboBox passComboBox) {
        Password passToMakeEncryptionOn = new Password (MainPasswordGenerator.listOfPasswords.get(passNr));
        UserInput usIn = new UserInput(MainPasswordGenerator.listOfInputs.get(passNr));
        usIn.setFirstText(passToMakeEncryptionOn.getPasswordText());
        MainPasswordGenerator.listOfPasswords.add(MainPasswordGenerator.listOfPasswords.size(), passToMakeEncryptionOn);
        MainPasswordGenerator.listOfInputs.add(MainPasswordGenerator.listOfInputs.size(),usIn);
        passToMakeEncryptionOn.wipePassText();
        switch (random.nextInt(availableEncryptAgainMethods)) {
            case 0:
                LetterSwap.stepsInAlphabet(usIn, passToMakeEncryptionOn, 1);  //Set steps to random? Or let user choose between specified and random? Set different random based on complexity chosen?
                break;
            case 1:
                LetterSwap.incrementingStepsInAlphabet(usIn, passToMakeEncryptionOn, 1, 1); //Set steps to random? Or let user choose between specified and random? Set different random based on complexity chosen?
                break;
            default:
                System.out.println("Error choosing encrypt again method");
        }
        passComboBox.addItem(passToMakeEncryptionOn.getPasswordText());
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