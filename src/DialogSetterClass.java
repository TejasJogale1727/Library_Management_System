
/**
 *
 * @author tejas eknath jogale
 */
import javax.swing.*;
import javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;

public class DialogSetterClass {

    String mainPath = ".\\Images\\For_Dialog_Box\\";

    public void setEmptyFielidDialog(JFrame f, String msg, String title) {
        ImageIcon icon = new ImageIcon(mainPath + "warning.png");
        JOptionPane.showMessageDialog(f, msg, title, PLAIN_MESSAGE, icon);
    }

    public void setDuplicateDataDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "duplicate_files.png");
        JOptionPane.showMessageDialog(f,"Sorry,Librarian with this name already exist in our system." , "Duplicate Data Found", PLAIN_MESSAGE, icon);
    }
    
    public void setDuplicateBookDialog(JFrame f,String Btitle) {
        ImageIcon icon = new ImageIcon(mainPath + "not_avaible.png");
        JOptionPane.showMessageDialog(f, "Book ("+Btitle+") does not exist in our Library.", "Book Not Found", PLAIN_MESSAGE, icon);
    }
    
    public void setSuccessDialog(JFrame f,String msg,String title) {
        ImageIcon icon = new ImageIcon(mainPath + "successfull.png");
        JOptionPane.showMessageDialog(f, msg, title, PLAIN_MESSAGE, icon);
    }
    public void setReturnUnsuccessDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "error.png");
        JOptionPane.showMessageDialog(f, "Book returning was unsuccessfull.", "Return Unsucessfull", PLAIN_MESSAGE, icon);
    }
    public void setInvalidBookDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "invalid_book.png");
        JOptionPane.showMessageDialog(f,"This book does not belong to our library.","Invalid Book", PLAIN_MESSAGE, icon);
    }
    
    //Add,Delete,Login Dialogs
    public void setLoginSuccessDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "logged_in.png");
        JOptionPane.showMessageDialog(f, "Logged In Successfully.", "Successfull Login", PLAIN_MESSAGE, icon);
    }

    public void setLoginUnSuccessDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "id_not_verified.png");
        JOptionPane.showMessageDialog(f, "Please check your login-details.", "unsuccessfull Login", PLAIN_MESSAGE, icon);
    }

    public void setDatabaseErrorDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "database_error.png");
        JOptionPane.showMessageDialog(f, "Sorry for your inconvenince,\nWe will fix the error soon. ", "Server Side Error Occured", PLAIN_MESSAGE, icon);
    }

    public void setLibAddedDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "add_user.png");
        JOptionPane.showMessageDialog(f, "Librarian added to our Library system successfully.", "Librarian Added", PLAIN_MESSAGE, icon);
    }

    public void setAttemptsOverDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "user_blocked.png");
        JOptionPane.showMessageDialog(f, "Since, all your three attempts are finished.\nYou are not the authorized person.\nTherefore your to access the system now.", "Unauthorized Acess", PLAIN_MESSAGE, icon);
    }

    public void setLibDeletedDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "delete_user.png");
        JOptionPane.showMessageDialog(f, "Librarian Deleted/Removed from the system.", "Successfully Deleted", PLAIN_MESSAGE, icon);
    }

    public void setLibNotDeletedDialog(JFrame f,int id) {
        ImageIcon icon = new ImageIcon(mainPath + "invalid_user.png");
        JOptionPane.showMessageDialog(f, "Librarian with Id/Name "+id+" Does not exist.", "Librarian Not Found", PLAIN_MESSAGE, icon);
    }
    public void setBookAddedDialog(JFrame f,String title) {
        ImageIcon icon = new ImageIcon(mainPath + "add_book.png");
        JOptionPane.showMessageDialog(f, "Book with title :- "+title+" \nAdded successfully.", "Book Added Successfully", PLAIN_MESSAGE, icon);
    }
    public void setBookProblemDialog(JFrame f,String msg,String title) {
        ImageIcon icon = new ImageIcon(mainPath + "not_added_book.png");
        JOptionPane.showMessageDialog(f, msg, title, PLAIN_MESSAGE, icon);
    }
    public void setBookNotIssuedDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "not_issued_book.png");
        JOptionPane.showMessageDialog(f, "Book was not issued due to some error.", "Book Not Issued", PLAIN_MESSAGE, icon);
    }
    public void setBookIssuedDialog(JFrame f) {
        ImageIcon icon = new ImageIcon(mainPath + "issued_book.png");
        JOptionPane.showMessageDialog(f, "Book Issued Successfully.", "Succefull Issue", PLAIN_MESSAGE, icon);
    }
    
}