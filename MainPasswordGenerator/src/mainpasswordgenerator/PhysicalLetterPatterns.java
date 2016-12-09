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
public class PhysicalLetterPatterns {
    static int letterNumber;
    static int lengthToFill;    //Change to using parameters for letter methods instead?
    static String useMethod (UserInput input, int Length) {
        String partToAdd ="";
        char letter = input.getFirstText().toLowerCase().charAt(0);
        letterNumber = (int)letter;
        letterNumber -= 96;
        lengthToFill = Length;
        switch (letterNumber) {
            case 1:
                partToAdd = letterA();
                break;
            case 2:
                partToAdd = letterB();
                break;
            case 3:
                partToAdd = letterC();
                break;
            default:
                
        }
        return partToAdd;
    }
    static String letterA () {
        String passwordPart ="23qweAd";
        if (lengthToFill-passwordPart.length()<0) {
            return "";
        }
        System.out.println(passwordPart + "; shape of the letter A on the keyboard where A is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the A being capitalized:\n");
        System.out.println("  23\n qwe\nA   d");
        System.out.println();
        lengthToFill -= passwordPart.length();  //Reason to keep?
        return passwordPart;
    }
    static String letterB () {
        String passwordPart ="5tyugjBnm";
        if (lengthToFill-passwordPart.length()<0) {
            return "";
        }
        System.out.println(passwordPart + "; shape of the letter b on the keyboard where b is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the b being capitalized:\n");
        System.out.println("5\ntyu\ng j\nBnm");
        System.out.println();
        lengthToFill -= passwordPart.length();  //Reason to keep?
        return passwordPart;
    }
    static String letterC () {
        String passwordPart ="ertdCvb";
        if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "ersxC";
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }
            System.out.println(passwordPart + "; shape of the letter C on the keyboard where C is in the bottom "
                + "right of the shape starting at the top and moving left to right on each row with the C being capitalized:\n");
            System.out.println(" er\ns\n xC");
            System.out.println();
        }
        else {
            System.out.println(passwordPart + "; shape of the letter C on the keyboard where C is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the C being capitalized:\n");
            System.out.println("ert\nd\nCvb");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();     //Reason to keep?
        return passwordPart;
    }
}
