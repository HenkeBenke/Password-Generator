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
    boolean higherComplexity;
    String firstText = "";
    String passToEncryptAgain;
    public UserInput (boolean qwe, boolean complexity) {
        qwerty = qwe;
        higherComplexity = complexity;
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
    boolean getComplexity () {
        return higherComplexity;
    }
}
