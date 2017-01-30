/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpasswordgenerator;

/**
 *
 * @author aa97339
 */
public class LetterSwap {
    
    static void stepsInAlphabet (UserInput usIn, Password pass) {               //Not accounting for non-letters
        String textToChange = usIn.firstText;
        if (textToChange.length()>(pass.getMaxLength()-pass.getCurrentLength())) {
           return; 
        }
        String returnText = "";
        char returnTextChars[] = new char [textToChange.length()];
        for (int i = 0; i < textToChange.length(); i++) {
            returnTextChars[i] = (char)((int)textToChange.charAt(i)+1);
            if ((int)textToChange.charAt(i)+1==91) {
                returnTextChars[i] = 'A';
            }
            else if ((int)textToChange.charAt(i)+1==123) {
                returnTextChars[i] = 'a';
            }
        }
        for (int i = 0; i < textToChange.length(); i++) {
            returnText+= returnTextChars[i];
        }
        pass.addToPassword(returnText);
        pass.addToMemoryList(" the word " + textToChange + " but with every letter changed to the letter next in the alphabet");
    }
    static void stepsInAlphabet (UserInput usIn, Password pass, int steps) {
        String textToChange = usIn.firstText;
        if (textToChange.length()>(pass.getMaxLength()-pass.getCurrentLength())) {
           return; 
        }
        String returnText = "";
        char returnTextChars[] = new char [textToChange.length()];
        for (int i = 0; i < textToChange.length(); i++) {
            if ((int)textToChange.charAt(i)>64 && (int)textToChange.charAt(i)<91) {
                returnTextChars[i] = (char)((int)textToChange.charAt(i)+steps);
                while(returnTextChars[i]>90) {
                    returnTextChars[i] = (char)((int)returnTextChars[i]-26);
                }
            }
            else if ((int)textToChange.charAt(i)>96 && (int)textToChange.charAt(i)<123) {
                returnTextChars[i] = (char)((int)textToChange.charAt(i)+steps);
                while(returnTextChars[i]>122) {
                    returnTextChars[i] = (char)((int)returnTextChars[i]-26);
                }
            }
            else {
                returnTextChars[i] = textToChange.charAt(i);
            }
            returnText += returnTextChars[i];
        }
        pass.addToPassword(returnText);
        pass.addToMemoryList(", the word " + textToChange + " but with every letter changed to the letter " + steps + " steps later in the alphabet");
    }
    static void incrementingStepsInAlphabet (UserInput usIn, Password pass, int incSize, int startStep) {
        String textToChange = usIn.firstText;
        if (textToChange.length()>(pass.getMaxLength()-pass.getCurrentLength())) {
           return; 
        }
        String returnText = "";
        char returnTextChars[] = new char [textToChange.length()];
        for (int i = 0; i < textToChange.length(); i++) {
            if ((int)textToChange.charAt(i)>64 && (int)textToChange.charAt(i)<91) {
                returnTextChars[i] = (char)((int)textToChange.charAt(i)+startStep+incSize*i);
                while(returnTextChars[i]>90) {
                    returnTextChars[i] = (char)((int)returnTextChars[i]-26);
                }
            }
            else if ((int)textToChange.charAt(i)>96 && (int)textToChange.charAt(i)<123) {
                returnTextChars[i] = (char)((int)textToChange.charAt(i)+startStep+incSize*i);
                while(returnTextChars[i]>122) {
                    returnTextChars[i] = (char)((int)returnTextChars[i]-26);
                }
            }
            else {
                returnTextChars[i] = textToChange.charAt(i);
            }
            returnText += returnTextChars[i];
        }
        pass.addToPassword(returnText);
        pass.addToMemoryList(", the word " + textToChange + " but with every letter changed to a letter later in the alphabet, the first one being " + startStep
        + " later, the second one being " + (startStep + incSize) + " later, the thrid one being " + (startStep+2*incSize) + " later, and so on");
    }
}
