
package mainpasswordgenerator;

import java.util.List;
import java.util.ArrayList;
/**
 * @author aa97339
 */
public class MainPasswordGenerator {
    //public static int passwordLength;    Probaby only use password class instead
    //public static String foreName;
    static List<Password> listOfPasswords = new ArrayList<>();
    public static void main(String[] args) {
        //Encryptor encrypt = new Encryptor();          Remove encryptor class altogether?
        //String password = PhysicalLetterPatterns.useMethod("C",20);
        //System.out.println("password:" + password);
        
           /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicGUI().setVisible(true);
            }
        });
    }
    static void encrypt (Password pass, String userText) {
        pass.passwordText += PhysicalLetterPatterns.useMethod(userText, pass.getLength());
    }
    
}
