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
public class AddLetterInPattern {
    static void addABC (Password pass, UserInput usIn, int interval) { //Currently only capital letters, maybe add non-capital as well?
        if (interval<2) { //Need to fix, currently an interval of 2 doesn't make every second sign a letter from beginning of alphabet SHOULD BE FIXED I THINK
            System.out.println("You fucked up letter pattern interval");
        }
        String partToAdd = "";
        int currentLetterPosition = 1;
        int letterNrInAlphabet = 1;
        int endLength = usIn.getFirstText().length();
        while (true) {
            if (currentLetterPosition%interval==0) {
                partToAdd += String.valueOf((char)(64+letterNrInAlphabet));
                currentLetterPosition++;
                endLength++;
                letterNrInAlphabet++;
            }
            partToAdd += usIn.firstText.charAt(currentLetterPosition-letterNrInAlphabet);//Should work I think?
            if (currentLetterPosition == endLength) {
                break;
            }
            currentLetterPosition++;
        }
        if (partToAdd.length()>(pass.getMaxLength()-pass.getCurrentLength())) {
          return;  
        }
        pass.addToPassword(partToAdd);
        pass.addToMemoryList(", the word "+usIn.getFirstText()+" but with letters from the beginning of the alphabet inserted with a "+interval+ " step interval");
    }
    static void banditLanguage (Password pass, UserInput usIn) {
        String partToAdd = "";
        for (int i = 0; i < usIn.getFirstText().length(); i++) {
            boolean skip = false;
            char letter = usIn.getFirstText().charAt(i);
            partToAdd += String.valueOf(letter);
            switch ((int)letter) { //Can probably remove skip
                case 65:
                    skip = true;
                    break;
                case 69:
                    skip = true;
                    break;
                case 73:
                    skip = true;
                    break;
                case 79:
                    skip = true;
                    break;
                case 85:
                    skip = true;
                    break;
                case 89:
                    skip = true;
                    break;
                case 97:
                    skip = true;
                    break;
                case 101:
                    skip = true;
                    break;
                case 105:
                    skip = true;
                    break;
                case 111:
                    skip = true;
                    break;
                case 117:
                    skip = true;
                    break;
                case 121:
                    skip = true;
                    break;
                default:
                    if ((int)letter>64 && (int)letter<91) {
                        partToAdd += "O" + String.valueOf(usIn.getFirstText().charAt(i));
                    }
                    else if ((int)letter>96 && (int)letter<123) {
                        partToAdd += "o" + String.valueOf(usIn.getFirstText().charAt(i));
                    }
            }
        }
        if (partToAdd.length()>(pass.getMaxLength()-pass.getCurrentLength())) {
          return;  
        }
        pass.addToPassword(partToAdd);
        pass.addToMemoryList(", the word "+usIn.getFirstText()+" but where every letter except for the vowels a, e, i, o, u and y are written twice but with an case sensative o in between");
    }
}
