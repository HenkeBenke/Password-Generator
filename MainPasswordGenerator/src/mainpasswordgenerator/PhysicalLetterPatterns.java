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
public class PhysicalLetterPatterns { //Has all qwerty same layout (åäö part)?
    static int letterNumber;    //Initialize in method instead?
    static int lengthToFill;    //Change to using parameters for letter methods instead?
    static String useMethod (UserInput input, int Length) {
        String partToAdd ="";
                                                                                //Get the first letter of the word and get the corresponding number, where "a" is 1 etc
        char letter = ' ';
        for (int i = 0; i < input.getFirstText().length(); i++) {
            int uniNr = (int)input.getFirstText().charAt(i);
            if (uniNr<65 || uniNr>122 || (uniNr>90&&uniNr<97)) {
                continue;
            }
            letter = input.getFirstText().toLowerCase().charAt(i);
            break;
        }
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
            case 4:
                partToAdd = letterD();
                break;
            case 5:
                partToAdd = letterE();
                break;
            case 6:
                partToAdd = letterF();
                break;
            case 7:
                //partToAdd = letterG();
                System.out.println("Not done yet");
                break;
            case 8:
                partToAdd = letterH();
                break;
            case 9:
                partToAdd = letterI();
                break;
            case 10:
                partToAdd = letterJ();
                break;
            case 11:
                partToAdd = letterK();
                break;
            case 12:
                partToAdd = letterL();
                break;
            case 13:
                partToAdd = letterM();
                break;
            case 14:
                partToAdd = letterN();
                break;
            case 15:
                partToAdd = letterO();
                break;
            case 16:
                //partToAdd = letterP();
                System.out.println("Not done yet");
                break;
            case 17:
                partToAdd = letterQ();
                break;
            case 18:
                partToAdd = letterR();
                break;
            case 19:
                //partToAdd = letterS();
                System.out.println("Not done yet");
                break;
            case 20:
                partToAdd = letterT();
                break;
            case 21:
                partToAdd = letterU();
                break;
            case 22:
                partToAdd = letterV();
                break;
            case 23:
                partToAdd = letterW();
                break;
            case 24:
                partToAdd = letterX();
                break;
            case 25:
                partToAdd = letterY();
                break;
            case 26:
                partToAdd = letterZ();
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
    static String letterD () {
        String passwordPart ="34etDgcv";
        if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "34etDf";
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }
            System.out.println(passwordPart + "; shape of the letter D on the keyboard where D is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the D being capitalized:\n");
            System.out.println("34\ne t\nDf");
            System.out.println();
        }
        else {
            System.out.println(passwordPart + "; shape of the letter D on the keyboard where D is the second lowest character to the "
                + "left with it starting at the top and moving left to right on each row with the D being capitalized:\n");
            System.out.println("34\ne t\nD g\ncv");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();     //Reason to keep?
        return passwordPart;
    }
    static String letterE () {
        String passwordPart ="Ertdfcvb";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter D on the keyboard where D is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the D being capitalized:\n");
            System.out.println("34\ne t\nDf");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter E on the keyboard where E is in the top "
                + "left of the shape starting at the top and moving left to right on each row with the E being capitalized:\n");
            System.out.println("Ert\ndf\ncvb"); //Too similar to C?
            System.out.println();
        }
        lengthToFill -= passwordPart.length();     //Reason to keep?
        return passwordPart;
    }
    static String letterF () {
        String passwordPart ="456rtF";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter D on the keyboard where D is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the D being capitalized:\n");
            System.out.println("34\ne t\nDf");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter F on the keyboard where F is in the bottom "
                + "of the shape starting at the top and moving left to right on each row with the F being capitalized:\n");
            System.out.println("456\nrt\nF");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();     //Reason to keep?
        return passwordPart;
    }
    static String letterG () {
        String passwordPart ="Ertdfcvb";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter D on the keyboard where D is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the D being capitalized:\n");
            System.out.println("34\ne t\nDf");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter E on the keyboard where E is in the top "
                + "left of the shape starting at the top and moving left to right on each row with the E being capitalized:\n");
            System.out.println("Ert\ndf\ncvb"); //Too similar to C?
            System.out.println();
        }
        lengthToFill -= passwordPart.length();     //Reason to keep?
        return passwordPart;
    }
    static String letterH () {
        String passwordPart ="68yuiHk";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter D on the keyboard where D is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the D being capitalized:\n");
            System.out.println("34\ne t\nDf");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter H on the keyboard where H is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the H being capitalized:\n");
            System.out.println("6 8\nyui\nH k");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();     //Reason to keep?
        return passwordPart;
    }
    static String letterI () { //Add i and/or remove some alternatives?
        String passwordPart ="8Ik,";
        if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "Ik,";
            if (lengthToFill-passwordPart.length()<0) {
                passwordPart = "Ik";
                if (lengthToFill-passwordPart.length()<0) {
                    return "";
                }
                System.out.println(passwordPart + "; shape of the letter I on the keyboard where I is in the top "
                + "of the shape starting at the top with the I being capitalized:\n");
                System.out.println("I\nk");
                System.out.println();
            }
            else {
            System.out.println(passwordPart + "; shape of the letter I on the keyboard where I is in the top "
                + "of the shape starting at the top with the I being capitalized:\n");
            System.out.println("I\nk\n,");
            System.out.println();
            }
        }
        else {
            System.out.println(passwordPart + "; shape of the letter I on the keyboard where I is  second from the top "
                + "in the shape starting at the top and moving left to right on each row with the I being capitalized:\n");
            System.out.println("8\nI\nk\n,");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();     //Reason to keep?
        return passwordPart;
    }
    static String letterJ () { //Change big J by removing . ?
        String passwordPart ="789oJlm,.";
        if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println(" 8\n i\nJk");
            System.out.println();
        }
        else {
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is on the tip "
                + "of the curving part, starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("789\n  o\nJ l\nm,.");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterK () {
        String passwordPart ="uojKm.";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter K on the keyboard where K is in the middle "
                + "of the shape starting at the top and moving left to right on each row with the K being capitalized:\n");
            System.out.println("u o\njK\nm .");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterL () {
        String passwordPart ="8ikL";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter L on the keyboard where L is in the bottom "
                + "right of the shape starting at the top and moving left to right on each row with the L being capitalized:\n");
            System.out.println("8\ni\nkL");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterM () {
        String passwordPart ="7ujMygr3edc";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter M on the keyboard where M is in the bottom "
                + "right of the shape starting right and moving top to bottom on each column with the M being capitalized:\n");
            System.out.println("3   7\ner yu\nd g j\nc   M");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterN () {
        String passwordPart ="6yhNgr3edc";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter N on the keyboard where N is in the bottom "
                + "right of the shape starting right and moving top to bottom on each column with the M being capitalized:\n");
            System.out.println("3  6\ner y\nd gh\nc  N");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterO () {
        String passwordPart ="uiOjlm,.";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter O on the keyboard where O is in the top "
                + "right of the shape starting at the top and moving left to right on each row with the O being capitalized:\n");
            System.out.println("uiO\nj l\nm,.");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterP () {
        String passwordPart ="uiOjlm,.";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter O on the keyboard where O is in the top "
                + "right of the shape starting at the top and moving left to right on each row with the O being capitalized:\n");
            System.out.println("uiO\nj l\nm,.");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterQ () {
        String passwordPart ="123Qeasdv";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter Q on the keyboard where Q is in the middle "
                + "left of the shape starting at the top and moving left to right on each row with the Q being capitalized:\n");
            System.out.println("123\nQ e\nasd\n   v");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterR () {
        String passwordPart ="456Ryfghvm";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter R on the keyboard where R is the second highest on the  "
                + "left of the shape starting at the top and moving left to right on each row with the R being capitalized:\n");
            System.out.println("456\nR y\nfgh\nv  m");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterS () {
        String passwordPart ="uiOjlm,.";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter O on the keyboard where O is in the top "
                + "right of the shape starting at the top and moving left to right on each row with the O being capitalized:\n");
            System.out.println("uiO\nj l\nm,.");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterT () {
        String passwordPart ="rTygb";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter T on the keyboard where T is in the top "
                + "middle of the shape starting at the top and moving left to right on each row with the T being capitalized:\n");
            System.out.println("rTy\n g\n b");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterU () {
        String passwordPart ="Uojlm,.";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter U on the keyboard where U is in the top "
                + "left of the shape starting at the top and moving left to right on each row with the U being capitalized:\n");
            System.out.println("U o\nj l\nm,.");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterV () {
        String passwordPart ="etdgV";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter V on the keyboard where V is in the bottom "
                + "of the shape starting at the top and moving left to right on each row with the V being capitalized:\n");
            System.out.println("e t\nd g\n V");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterW () {
        String passwordPart ="Wsxdrfv";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter W on the keyboard where W is in the top "
                + "left of the shape starting at the left and moving top to bottom on each column with the W being capitalized:\n");
            System.out.println("W r\nsdf\nx v");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterX () {
        String passwordPart ="wrdXv";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter X on the keyboard where X is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the X being capitalized:\n");
            System.out.println("w r\n d\nX v");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterY () {
        String passwordPart ="Yijm";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter Y on the keyboard where Y is in the top "
                + "left of the shape starting at the top and moving left to right on each row with the Y being capitalized:\n");
            System.out.println("Y i\n j\n m");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
    static String letterZ () {
        String passwordPart ="1234esZxcv";
        /*if (lengthToFill-passwordPart.length()<0) {
            passwordPart = "8iJk";*/
            if (lengthToFill-passwordPart.length()<0) {
                return "";
            }/*
            System.out.println(passwordPart + "; shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n");
            System.out.println("8\ni\nJk");
            System.out.println();
        }*/
        else {
            System.out.println(passwordPart + "; shape of the letter Z on the keyboard where Z is in the bottom "
                + "right of the shape starting at the top and moving left to right on each row with the Z being capitalized:\n");
            System.out.println("1234\n  e\n s\nZxcv");
            System.out.println();
        }
        lengthToFill -= passwordPart.length();
        return passwordPart;
    }
}
