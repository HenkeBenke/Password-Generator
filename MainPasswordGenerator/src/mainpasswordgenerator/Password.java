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
    List<Integer> usedSingleNounQuestions = new ArrayList<>();
    List<Integer> skippedSingleNounQuestions = new ArrayList<>();
    int lastMethodUsed = -1;
    int lastShortMethodUsed = -1;
    int nextShortLength = 0;
    public Password (int passLength) {
        maxLength = passLength;
        minLength = passLength;
    }
    public Password (int min, int max) {
        minLength = min;
        maxLength = max;
    }
    public Password (Password pass) {    //Is passNR needed?                           //For copying another password
        maxLength = pass.getMaxLength();
        minLength = pass.getMinLength();
        passwordText = pass.getPasswordText();
        for (int i = 0; i < pass.getAmountOfMemoryMethods(); i++) { //Should suffice with one loop for both parts and methods
            passwordParts.add(i, pass.getPasswordPart(i));
            memoryMethods.add(i, pass.getMemoryMethod(i));
        }
        for (int i = 0; i < pass.getAmountOfSingleNounQuestionsUsed(); i++) {
            usedSingleNounQuestions.add(i, pass.getSingleNounQuestionUsed(i));
        }
        formerVersions.add(formerVersions.size(), pass);
        for (int i = 0; i < pass.getSkippedSingleNounAmount(); i++) {
            skippedSingleNounQuestions.add(i, pass.getSkippedSingleNoun(i));
        }
        lastMethodUsed = pass.getLastMethodUsed();
        lastShortMethodUsed = pass.getLastShortMethodUsed();
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
    void setLastMethodUsed (int index) {
        lastMethodUsed = index;
    }
    int getLastMethodUsed () {
        return lastMethodUsed;
    }
    void setLastShortMethodUsed (int index) {
        lastShortMethodUsed = index;
    }
    int getLastShortMethodUsed () {
        return lastShortMethodUsed;
    }
    int getSingleNounQuestionUsed (int index) {
        return usedSingleNounQuestions.get(index);
    }
    int getAmountOfSingleNounQuestionsUsed () {
        return usedSingleNounQuestions.size();
    }
    void addSingleNounUsed (int nr) {
        usedSingleNounQuestions.add(usedSingleNounQuestions.size(), nr);
    }
    int removeLastUsedNoun () {                                                 //Utilized when skip button is used
        return usedSingleNounQuestions.remove(usedSingleNounQuestions.size()-1);
    }
    int getSkippedSingleNoun (int index) {
        return skippedSingleNounQuestions.get(index);
    }
    int getSkippedSingleNounAmount () {
        return skippedSingleNounQuestions.size();
    }
    void addSkippedSingleNoun (int nr) {
        skippedSingleNounQuestions.add(skippedSingleNounQuestions.size(),nr);
    }
    void clearSkippedSingleNoun () {
        int amountToRemove = skippedSingleNounQuestions.size()-1;
        for (int i = 0; i < amountToRemove ; i++) {
            skippedSingleNounQuestions.remove(0);
            System.out.println("Skipped left: " + skippedSingleNounQuestions.size());
        }
    }
    void wipePassText () {                                                      //For encryptagain
        passwordText = "";
    }
    void setNextShortLength (int length) {
        nextShortLength = length;
    }
    int getNextSHortLength () {
        return nextShortLength;
    }
}
