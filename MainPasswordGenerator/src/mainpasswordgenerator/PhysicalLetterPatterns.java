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
    static void useMethod (UserInput input, Password pass) {
        int letterNumber;                                                  
        char letter = ' ';
        for (int i = 0; i < input.getFirstText().length(); i++) {               //Get the first letter of the word and get the corresponding number, where "a" is 1 etc
            int uniNr = (int)input.getFirstText().charAt(i);
            if (uniNr<65 || uniNr>122 || (uniNr>90&&uniNr<97)) {
                continue;
            }
            letter = input.getFirstText().toLowerCase().charAt(i);
            break;
        }
        letterNumber = (int)letter;
        letterNumber -= 96;
        switch (letterNumber) {
            case 1:
                letterA(pass);
                break;
            case 2:
                letterB(pass);
                break;
            case 3:
                letterC(pass);
                break;
            case 4:
                letterD(pass);
                break;
            case 5:
                letterE(pass);
                break;
            case 6:
                letterF(pass);
                break;
            case 7:
                letterG(pass);
                break;
            case 8:
                letterH(pass);
                break;
            case 9:
                letterI(pass);
                break;
            case 10:
                letterJ(pass);
                break;
            case 11:
                letterK(pass);
                break;
            case 12:
                letterL(pass);
                break;
            case 13:
                letterM(pass);
                break;
            case 14:
                letterN(pass);
                break;
            case 15:
                letterO(pass);
                break;
            case 16:
                letterP(pass);
                break;
            case 17:
                letterQ(pass);
                break;
            case 18:
                letterR(pass);
                break;
            case 19:
                letterS(pass);
                break;
            case 20:
                letterT(pass);
                break;
            case 21:
                letterU(pass);
                break;
            case 22:
                letterV(pass);
                break;
            case 23:
                letterW(pass);
                break;
            case 24:
                letterX(pass);
                break;
            case 25:
                letterY(pass);
                break;
            case 26:
                letterZ(pass);
                break;
            default:
                
        }
    }
    static void letterA (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="23qweAd";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter A on the keyboard where A is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the A being capitalized:\n\n  23\n qwe\nA   d\n");
    }
    static void letterB (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="5tyugjBnm";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter b on the keyboard where b is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the b being capitalized:\n\n5\ntyu\ng j\nBnm");
    }
    static void letterC (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="ertdCvb";
        if (length-passwordPart.length()<0) {
            passwordPart = "ersxC";
            if (length-passwordPart.length()<0) {
                return;
            }
            pass.addToPassword(passwordPart);
            pass.addToMemoryList("shape of the letter C on the keyboard where C is in the bottom "
                + "right of the shape starting at the top and moving left to right on each row with the C being capitalized:\n\n er\ns\n xC");
        }
        else {
            pass.addToPassword(passwordPart);
            pass.addToMemoryList("shape of the letter C on the keyboard where C is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the C being capitalized:\n\nert\nd\nCvb");
        }
    }
    static void letterD (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="34etDgcv";
        if (length-passwordPart.length()<0) {
            passwordPart = "34etDf";
            if (length-passwordPart.length()<0) {
                return;
            }
            pass.addToPassword(passwordPart);
            pass.addToMemoryList("shape of the letter D on the keyboard where D is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the D being capitalized:\n\n34\ne t\nDf");
        }
        else {
            pass.addToPassword(passwordPart);
            pass.addToMemoryList("shape of the letter D on the keyboard where D is the second lowest character to the "
                + "left with it starting at the top and moving left to right on each row with the D being capitalized:\n\n34\ne t\nD g\ncv");
        }
    }
    static void letterE (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="Ertdfcvb";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter E on the keyboard where E is in the top "
                + "left of the shape starting at the top and moving left to right on each row with the E being capitalized:\n\nErt\ndf\ncvb");
    }
    static void letterF (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="456rtF";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter F on the keyboard where F is in the bottom "
                + "of the shape starting at the top and moving left to right on each row with the F being capitalized:\n\n456\nrt\nF");
    }
    static void letterG (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="Gbvcde456";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter G on the keyboard where G is in the middle right "
                + "of the shape starting at G and moving in a outwards spiral with the G being capitalized:\n\n 456\ne\nd G\ncvb");
    }
    static void letterH (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="68yuiHk";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter H on the keyboard where H is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the H being capitalized:\n\n6 8\nyui\nH k");
    }
    static void letterI (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="68yuiHk";
        if (length-passwordPart.length()<0) {
            passwordPart = "Ik,";
            if (length-passwordPart.length()<0) {
                passwordPart = "Ik";
                if (length-passwordPart.length()<0) {
                    return;
                }
                pass.addToPassword(passwordPart);
                pass.addToMemoryList("shape of the letter I on the keyboard where I is in the top "
                + "of the shape starting at the top with the I being capitalized:\n\nI\nk");
            }
            else {
                pass.addToPassword(passwordPart);
                pass.addToMemoryList("shape of the letter I on the keyboard where I is in the top "
                + "of the shape starting at the top with the I being capitalized:\n\nI\nk\n,");
            }
        }
        else {
            pass.addToPassword(passwordPart);
            pass.addToMemoryList("shape of the letter I on the keyboard where I is second from the top "
                + "in the shape starting at the top with the I being capitalized:\n\n8\nI\nk\n,");
        }
    }
    static void letterJ (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="789oJlm,.";
        if (length-passwordPart.length()<0) {
            passwordPart = "8iJk";
            if (length-passwordPart.length()<0) {
                return;
            }
            pass.addToPassword(passwordPart);
            pass.addToMemoryList("shape of the letter J on the keyboard where J is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the J being capitalized:\n\n 8\n i\nJk");
        }
        else {
            pass.addToPassword(passwordPart);
            pass.addToMemoryList("shape of the letter J on the keyboard where J is on the tip "
                + "of the curving part, starting at the top and moving left to right on each row with the J being capitalized:\n\n789\n  o\nJ l\nm,.");
        }
    }
    static void letterK (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="uojKm.";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter K on the keyboard where K is in the middle "
                + "of the shape starting at the top and moving left to right on each row with the K being capitalized:\n\nu o\njK\nm .");
    }
    static void letterL (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="8ikL";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter L on the keyboard where L is in the bottom "
                + "right of the shape starting at the top and moving left to right on each row with the L being capitalized:\n\n8\ni\nkL");
    }
    static void letterM (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="7ujMygr3edc";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter M on the keyboard where M is in the bottom "
                + "right of the shape starting right and moving top to bottom on each column with the M being capitalized:\n\n3   7\ner yu\nd g j\nc   M");
    }
    static void letterN (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="6yhNgr3edc";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter N on the keyboard where N is in the bottom "
                + "right of the shape starting right and moving top to bottom on each column with the N being capitalized:\n\n3  6\ner y\nd gh\nc  N");
    }
    static void letterO (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="uiOjlm,.";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter O on the keyboard where O is in the top "
                + "right of the shape starting at the top and moving left to right on each row with the O being capitalized:\n\nuiO\nj l\nm,.");
    }
    static void letterP (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="yuioPhknm,";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter P lying down and mirrored on the keyboard where P is on the far "
                + "right of the shape starting at the top and moving left to right on each row with the P being capitalized:\n\nyuioP\nh k\nnm,");
    }
    static void letterQ (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="123Qeasdv";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter Q on the keyboard where Q is in the middle "
                + "left of the shape starting at the top and moving left to right on each row with the Q being capitalized:\n\n123\nQ e\nasd\n   v");
    }
    static void letterR (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="456Ryfghvm";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter R on the keyboard where R is the second highest on the  "
                + "left of the shape starting at the top and moving left to right on each row with the R being capitalized:\n\n456\nR y\nfgh\nv  m");
    }
    static void letterS (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="Sxcfgb";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter S on the keyboard where S is in the far left "
                + "of the shape starting at the S following it's shape with the S being capitalized:\n\ns fg\nxc b");
    }
    static void letterT (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="rTygb";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter T on the keyboard where T is in the top "
                + "middle of the shape starting at the top and moving left to right on each row with the T being capitalized:\n\nrTy\n g\n b");
    }
    static void letterU (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="Uojlm,.";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter U on the keyboard where U is in the top "
                + "left of the shape starting at the top and moving left to right on each row with the U being capitalized:\n\nU o\nj l\nm,.");
    }
    static void letterV (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="etdgV";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter V on the keyboard where V is in the bottom "
                + "of the shape starting at the top and moving left to right on each row with the V being capitalized:\n\ne t\nd g\n V");
    }
    static void letterW (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="Wsxdrfv";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter W on the keyboard where W is in the top "
                + "left of the shape starting at the left and moving top to bottom on each column with the W being capitalized:\n\nW r\nsdf\nx v");
    }
    static void letterX (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="wrdXv";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter X on the keyboard where X is in the bottom "
                + "left of the shape starting at the top and moving left to right on each row with the X being capitalized:\n\nw r\n d\nX v");
    }
    static void letterY (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="Yijm";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter Y on the keyboard where Y is in the top "
                + "left of the shape starting at the top and moving left to right on each row with the Y being capitalized:\n\nY i\n j\n m");
    }
    static void letterZ (Password pass) {
        int length =  pass.getMaxLength()- pass.getCurrentLength();
        String passwordPart ="1234esZxcv";
        if (length-passwordPart.length()<0) {
            return;
        }
        pass.addToPassword(passwordPart);
        pass.addToMemoryList("shape of the letter Z on the keyboard where Z is in the bottom "
                + "right of the shape starting at the top and moving left to right on each row with the Z being capitalized:\n\n1234\n  e\n s\nZxcv");
    }
}
