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
    public Password (int passLength) {
        maxLength = passLength;
        minLength = passLength;
    }
    public Password (int min, int max) {
        minLength = min;
        maxLength = max;
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
    void addToPassword (String text) {
        passwordText += text;
        passwordParts.add(passwordParts.size(), text);
    }
    void addToMemoryList (String textToAdd) {
        memoryMethods.add(memoryMethods.size(), textToAdd);
    }
}
