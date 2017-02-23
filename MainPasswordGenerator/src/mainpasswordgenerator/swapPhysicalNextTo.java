/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpasswordgenerator;

import java.util.Random;

/**
 *
 * @author aa97339
 */
public class SwapPhysicalNextTo {
    static void useMethod (UserInput input, Password pass) {
        String textToReturn = "";
        int letterNumber;
        String direction = "";
        Random rnd = new Random();
        switch (rnd.nextInt(4)) {
            case 0:
                direction = "up";
                break;
            case 1:
                direction = "right";
                break;
            case 2:
                direction = "down";
                break;
            case 3:
                direction = "left";
                break;
        }
        char letter;
        for (int i = 0; i < input.getFirstText().length(); i++) {               //Get the first letter of the word and get the corresponding number, where "a" is 1 etc
            int uniNr = (int)input.getFirstText().charAt(i);
            if (uniNr<65 || uniNr>122 || (uniNr>90&&uniNr<97)) { //Add support for numbers?
                textToReturn += input.getFirstText().charAt(i);
                continue;
            }
            letter = input.getFirstText().charAt(i);
            letterNumber = (int)letter;
            switch (letterNumber) {
                case 65:
                case 97:
                    textToReturn+=letterA(direction, letterNumber, rnd.nextInt(5)+1);
                    break;
                case 2:
                    //letterB(pass);
                    break;
                case 3:
                    //letterC(pass);
                    break;
                case 4:
                    //letterD(pass);
                    break;
                case 5:
                    //letterE(pass);
                    break;
                case 6:
                    //letterF(pass);
                    break;
                case 7:
                    //letterG(pass);
                    break;
                case 8:
                    //letterH(pass);
                    break;
                case 9:
                    //letterI(pass);
                    break;
                case 10:
                    //letterJ(pass);
                    break;
                case 11:
                    //letterK(pass);
                    break;
                case 12:
                    //letterL(pass);
                    break;
                case 13:
                    //letterM(pass);
                    break;
                case 14:
                    //letterN(pass);
                    break;
                case 15:
                    //letterO(pass);
                    break;
                case 16:
                    //letterP(pass);
                    break;
                case 17:
                    //letterQ(pass);
                    break;
                case 18:
                    //letterR(pass);
                    break;
                case 19:
                    //letterS(pass);
                    break;
                case 20:
                    //letterT(pass);
                    break;
                case 21:
                    //letterU(pass);
                    break;
                case 22:
                    //letterV(pass);
                    break;
                case 23:
                    //letterW(pass);
                    break;
                case 24:
                    //letterX(pass);
                    break;
                case 25:
                    //letterY(pass);
                    break;
                case 26:
                    //letterZ(pass);
                    break;
                default:

            }
        }
        pass.addToPassword(textToReturn);
        //Add memory method
    }
    static String letterA (String direction, int letterNr, int steps) {
        String returnChar = "";
        if (steps==1) {
            switch (direction) {
                case "up":
                    returnChar = Character.toString((char)(letterNr+16));
                    break;
                case "right":
                    returnChar = Character.toString((char)(letterNr+18));
                    break;

                case "down":
                    returnChar = Character.toString((char)(letterNr+25));
                    break;

                case "left":
                    returnChar = Character.toString((char)(letterNr+11));
                    break;
            }
        }
        else if (steps==2) {
            switch (direction) {
                case "up":
                    returnChar = "1";
                    break;
                case "right":
                    returnChar = Character.toString((char)(letterNr+3));
                    break;

                case "down":
                    returnChar = "1";
                    break;

                case "left":
                    returnChar = Character.toString((char)(letterNr+10));
                    break;
            }
        }
        else if (steps==3) {
            switch (direction) {
                case "up":
                    returnChar = Character.toString((char)(letterNr+25));
                    break;
                case "right":
                    returnChar = Character.toString((char)(letterNr+5));
                    break;

                case "down":
                    returnChar = Character.toString((char)(letterNr+16));
                    break;

                case "left":
                    returnChar = Character.toString((char)(letterNr+9));
                    break;
            }
        }
        else if (steps==4) {
            switch (direction) {
                case "up":
                    returnChar = Character.toString((char)(letterNr));
                    break;
                case "right":
                    returnChar = Character.toString((char)(letterNr+6));
                    break;

                case "down":
                    returnChar = Character.toString((char)(letterNr));
                    break;

                case "left":
                    returnChar = Character.toString((char)(letterNr+7));
                    break;
            }
        }
        else if (steps==5) {
            switch (direction) {
                case "up":
                    returnChar = Character.toString((char)(letterNr+16));
                    break;
                case "right":
                    returnChar = Character.toString((char)(letterNr+7));
                    break;

                case "down":
                    returnChar = Character.toString((char)(letterNr+25));
                    break;

                case "left":
                    returnChar = Character.toString((char)(letterNr+6));
                    break;
            }
        }
        return returnChar;
    }
    static String letterB (String direction, int letterNr, int steps) {
        String returnChar = "";
        if (steps==1) {
            switch (direction) {
                case "up":
                    returnChar = Character.toString((char)(letterNr+5));
                    break;
                case "right":
                    returnChar = Character.toString((char)(letterNr+12));
                    break;

                case "down":
                    returnChar = "5";
                    break;

                case "left":
                    returnChar = Character.toString((char)(letterNr+20));
                    break;
            }
        }
        else if (steps==2) {
            switch (direction) {
                case "up":
                    returnChar = Character.toString((char)(letterNr+18));
                    break;
                case "right":
                    returnChar = Character.toString((char)(letterNr+11));
                    break;

                case "down":
                    returnChar = Character.toString((char)(letterNr+18));
                    break;

                case "left":
                    returnChar = Character.toString((char)(letterNr+1));
                    break;
            }
        }
        else if (steps==3) {
            switch (direction) {
                case "up":
                    returnChar = "5";
                    break;
                case "right":
                    returnChar = Character.toString((char)(letterNr+5));
                    break;

                case "down":
                    returnChar = Character.toString((char)(letterNr+16));
                    break;

                case "left":
                    returnChar = Character.toString((char)(letterNr+9));
                    break;
            }
        }
        else if (steps==4) {
            switch (direction) {
                case "up":
                    returnChar = Character.toString((char)(letterNr));
                    break;
                case "right":
                    returnChar = Character.toString((char)(letterNr+6));
                    break;

                case "down":
                    returnChar = Character.toString((char)(letterNr));;
                    break;

                case "left":
                    returnChar = Character.toString((char)(letterNr+7));
                    break;
            }
        }
        else if (steps==5) {
            switch (direction) {
                case "up":
                    returnChar = Character.toString((char)(letterNr+16));;
                    break;
                case "right":
                    returnChar = Character.toString((char)(letterNr+7));
                    break;

                case "down":
                    returnChar = Character.toString((char)(letterNr+25));;
                    break;

                case "left":
                    returnChar = Character.toString((char)(letterNr+6));
                    break;
            }
        }
        return returnChar;
    }
}
