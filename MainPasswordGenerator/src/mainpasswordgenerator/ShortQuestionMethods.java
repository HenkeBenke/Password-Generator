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
public class ShortQuestionMethods {
    static void takeFirstCharacter (Password pass, int length, UserInput usIn) {
        String partToAdd = "";
        int charNr = 0;
        if (length==1) {
            while (usIn.getFirstText().charAt(charNr)==' ') {
                charNr++;
                if (charNr==usIn.getFirstText().length()) {
                    System.out.println("No signs in answer?");
                    charNr = usIn.getFirstText().length()-1;
                    break;
                }
            }
            partToAdd += usIn.getFirstText().charAt(charNr);
        }
        else if (length==2) {
            while (usIn.getFirstText().charAt(charNr+1)==' ' || usIn.getFirstText().charAt(charNr)==' ') {
                charNr++;
                if (charNr+1==usIn.getFirstText().length()) {
                    System.out.println("Never two signs next to each other in answer?");
                    charNr = 0;
                    while (usIn.getFirstText().charAt(charNr)==' ') {           //If can't find two signs in a row, try to find 1 sign
                        charNr++;
                        if (charNr+1==usIn.getFirstText().length()) {
                            System.out.println("No signs in answer?");
                            charNr = usIn.getFirstText().length()-2;
                            break;
                        }
                    }
                    break;
                }
            }
            partToAdd += usIn.getFirstText().charAt(charNr);
            partToAdd += usIn.getFirstText().charAt(charNr+1);
        }
        else if (length==3) {
            while (usIn.getFirstText().charAt(charNr+2)==' ' || usIn.getFirstText().charAt(charNr+1)==' ' || usIn.getFirstText().charAt(charNr)==' ') {
                charNr++;
                if (charNr+2==usIn.getFirstText().length()) {
                    System.out.println("Never three signs next to each other in answer?");
                    charNr = 0;
                    while (usIn.getFirstText().charAt(charNr+1)==' ' || usIn.getFirstText().charAt(charNr)==' ') {
                        charNr++;
                        if (charNr+2==usIn.getFirstText().length()) {
                            System.out.println("Never two signs next to each other in answer?");
                            charNr = 0;
                            while (usIn.getFirstText().charAt(charNr)==' ') {           //If can't find two signs in a row, try to find 1 sign
                                charNr++;
                                if (charNr+2==usIn.getFirstText().length()) {
                                    System.out.println("No signs in answer?");
                                    charNr = usIn.getFirstText().length()-3;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            partToAdd += usIn.getFirstText().charAt(charNr);
            partToAdd += usIn.getFirstText().charAt(charNr+1);
            partToAdd += usIn.getFirstText().charAt(charNr+2);
        }
        else {
            
        }
        pass.addToPassword(partToAdd);
        if (length==1) {
            pass.addToMemoryList(",the first character of the word "+usIn.getFirstText());
        }
        else {
            pass.addToMemoryList(", the first "+length+" characters of the word "+usIn.getFirstText());
        }
    }
    static void takeLastCharacterLast (Password pass, int length, UserInput usIn) {
        String partToAdd = "";
        int charNr = usIn.getFirstText().length()-1;
        if (length==1) {
            while (usIn.getFirstText().charAt(charNr)==' ') {
                charNr--;
                if (charNr==-1) {
                    System.out.println("No signs in answer?");
                    charNr = 0;
                    break;
                }
            }
            partToAdd += usIn.getFirstText().charAt(charNr);
        }
        else if (length==2) {
            while (usIn.getFirstText().charAt(charNr-1)==' ' || usIn.getFirstText().charAt(charNr)==' ') {
                charNr--;
                if (charNr-1==-1) {
                    System.out.println("Never two signs next to each other in answer?");
                    charNr = usIn.getFirstText().length()-1;
                    while (usIn.getFirstText().charAt(charNr)==' ') {           //If can't find two signs in a row, try to find 1 sign
                        charNr--;
                        if (charNr-1==-1) {
                            System.out.println("No signs in answer?");
                            charNr = 1;
                            break;
                        }
                    }
                    break;
                }
            }
            partToAdd += usIn.getFirstText().charAt(charNr-1);
            partToAdd += usIn.getFirstText().charAt(charNr);
        }
        else if (length==3) {
            while (usIn.getFirstText().charAt(charNr-2)==' ' || usIn.getFirstText().charAt(charNr-1)==' ' || usIn.getFirstText().charAt(charNr)==' ') {
                charNr--;
                if (charNr-2==-1) {
                    System.out.println("Never three signs next to each other in answer?");
                    charNr = usIn.getFirstText().length()-1;
                    while (usIn.getFirstText().charAt(charNr-1)==' ' || usIn.getFirstText().charAt(charNr)==' ') {
                        charNr--;
                        if (charNr-2==-1) {
                            System.out.println("Never two signs next to each other in answer?");
                            charNr = usIn.getFirstText().length()-1;
                            while (usIn.getFirstText().charAt(charNr)==' ') {           //If can't find two signs in a row, try to find 1 sign
                                charNr--;
                                if (charNr-2==usIn.getFirstText().length()) {
                                    System.out.println("No signs in answer?");
                                    charNr = 2;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                }
            }
            partToAdd += usIn.getFirstText().charAt(charNr-2);
            partToAdd += usIn.getFirstText().charAt(charNr-1);
            partToAdd += usIn.getFirstText().charAt(charNr);
        }
        else {
            
        }
        pass.addToPassword(partToAdd);
        if (length==1) {
            pass.addToMemoryList(",the last character of the word "+usIn.getFirstText());
        }
        else {
            pass.addToMemoryList(", the last "+length+" characters of the word "+usIn.getFirstText()+" with the last character of the word being the last to be added");
        }
    }
}