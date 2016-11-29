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
    int length;
    String passwordText = "";
    public Password (int passLength) {
        length = passLength;
    }
    int getLength () {
        return length;
    }
    void addToPassword (String text) {
        passwordText += text;
    }
}
