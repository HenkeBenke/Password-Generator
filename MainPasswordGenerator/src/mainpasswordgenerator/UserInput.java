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
public class UserInput {
    boolean qwerty;
    boolean variedMethods;
    String firstText = "";
    String passToEncryptAgain;
    public UserInput (boolean qwe, boolean varMet) {
        qwerty = qwe;
        variedMethods = varMet;
    }
    public UserInput (UserInput usIn) {
        qwerty = usIn.getQwerty();
        //Varied methods
        firstText = usIn.getFirstText();
        //Is pass to encrypt again needed?
    }
    String getFirstText () {
        return firstText;
    }
    void setFirstText (String text) {
        firstText = text;
    }
    void setPassToEncryptAgain (String passText) {
        passToEncryptAgain = passText;
    }
    boolean getQwerty () {
        return qwerty;
    }
}
