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
    
    static String stepsInAlphabet (UserInput usIn) {
        String textToChange = usIn.firstText;
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
        return returnText;
    }
    static String stepsInAlphabet (UserInput usIn, int steps) {
        String textToChange = usIn.firstText;
        String returnText = "";
        char returnTextChars[] = new char [textToChange.length()];
        for (int i = 0; i < textToChange.length(); i++) {
            if (((int)textToChange.charAt(i)<91 && (int)textToChange.charAt(i)+steps>90)||(int)textToChange.charAt(i)+steps>122) {
                returnTextChars[i] = (char)((int)textToChange.charAt(i)+steps-26);
            }
            else {
                returnTextChars[i] = (char)((int)textToChange.charAt(i)+steps);
            }
        }
        for (int i = 0; i < textToChange.length(); i++) {//Merge with prior loop?
            returnText+= returnTextChars[i];
        }
        return returnText;
    }
    static String incrementingStepsInAlphabet (UserInput usIn, int incSize, int startStep) {
        String textToChange = usIn.firstText;
        String returnText = "";
        char returnTextChars[] = new char [textToChange.length()];
        for (int i = 0; i < textToChange.length(); i++) {
            if (((int)textToChange.charAt(i)<91 && (int)textToChange.charAt(i)+(incSize*i + startStep)>90)||(int)textToChange.charAt(i)+(incSize*i + startStep)>122) {
                returnTextChars[i] = (char)((int)textToChange.charAt(i)+(incSize*i + startStep)-26);
            }
            else {
                returnTextChars[i] = (char)((int)textToChange.charAt(i)+(incSize*i + startStep));
            }
        }
        for (int i = 0; i < textToChange.length(); i++) {//Merge with prior loop?
            returnText+= returnTextChars[i];
        }
        return returnText;
    }
}
