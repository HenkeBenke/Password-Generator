
package mainpasswordgenerator;

import java.util.Random;
/**
 *
 * @author aa97339
 */
public class Encryptor {
    Random random = new Random();
    int availableEncryptionMethods = 1; //Number of methods that can be used
    int amountOfEncryptionMethodsToUse; //Number of methods to use
    int[] encryptionMethods; //Which methods will be used
    //int randomNumber = random.nextInt(availableEncryptionMethods);
    public Encryptor () {
        //First constructor, encrypt with only one method
        amountOfEncryptionMethodsToUse = 1;
        encryptionMethods = new int[amountOfEncryptionMethodsToUse];
        for (int i = 0; i < amountOfEncryptionMethodsToUse; i++) {
            encryptionMethods[i] = random.nextInt(availableEncryptionMethods); //Put switch-statement directly instead?
        }
        /*switch (randomNumber) {
        case 1:
            
            break;
        default:
            System.out.println("Error 1");    
        } */
    }
    void test (String name) {
        int amountOfDifferentSentences = 1;
        String sentence;
        String memoryMethod;
        //char firstLetter;
        /*for (int i = 0; i < name.length(); i++) {
            if (!(name.charAt(i)== ' ')) {
                firstLetter = name.charAt(amountOfDifferentSentences);
                break;
            }
        }*/
        switch (random.nextInt(1)) {
            case 0:
                sentence = "Your name is " + name + " !";
                memoryMethod = "First letter of every word and additional signs";
            default:
                System.out.println("Error 2");
        }
        
    }
    
}