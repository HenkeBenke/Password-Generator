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
public class Password {
    int maxLength;
    int minLength;
    String passwordText = "";
    public Password (int passLength) {
        maxLength = passLength;
        minLength = passLength;
    }
    public Password (int min, int max) {
        minLength = min;
        maxLength = max;
    }
    int getEndLength () { //Should probably change
        return maxLength;
    }
    int getCurrentLength () {
        return passwordText.length();
    }
    void addToPassword (String text) {
        passwordText += text;
    }
}
