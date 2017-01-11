/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpasswordgenerator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aa97339
 */
public class Password {
    int maxLength;
    int minLength;
    String passwordText = "";
    List<String> passwordParts = new ArrayList<>();
    List<String> memoryMethods = new ArrayList<>();
    List<Password> formerVersions = new ArrayList<>();
    public Password (int passLength) {
        maxLength = passLength;
        minLength = passLength;
    }
    public Password (int min, int max) {
        minLength = min;
        maxLength = max;
    }
    public Password (Password pass, int passNr) {                                           //For copying another password
        maxLength = pass.getMaxLength();
        minLength = pass.getMinLength();
        passwordText = pass.getPasswordText();
        for (int i = 0; i < pass.getAmountOfMemoryMethods(); i++) { //Should suffice with one loop for both
            passwordParts.add(i, pass.getPasswordPart(i));
            memoryMethods.add(i, pass.getMemoryMethod(i));
        }
        formerVersions.add(formerVersions.size(), pass);
    }
    int getMaxLength () {
        return maxLength;
    }
    int getMinLength () {
        return minLength;
    }
    int getCurrentLength () {
        return passwordText.length();
    }
    String getPasswordText () {
    return passwordText;
}
    String getPasswordPart (int index) {
        return passwordParts.get(index);
    }
    String getMemoryMethod (int index) {
        return memoryMethods.get(index);
    }
    int getAmountOfMemoryMethods () {
        return memoryMethods.size();
    }
    void addToPassword (String text) {
        passwordText += text;
        passwordParts.add(passwordParts.size(), text);
    }
    void addToMemoryList (String textToAdd) {
        memoryMethods.add(memoryMethods.size(), textToAdd);
    }
    void makeLonger (int max, int interval) {
        if (max<maxLength) {}
        else {
            maxLength = max;
            minLength = maxLength-interval;
            if (minLength<0) {
                minLength = 1;         //Maybe make higher
            }
        }
    }
}
