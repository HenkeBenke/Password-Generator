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
    public UserInput (boolean qwe, boolean varMet, String text1) {
        qwerty = qwe;
        variedMethods = varMet;
        firstText = text1;
    }
    String getFirstText () {
        return firstText;
    }
}
