
// Kareem El Sayed 11D
import javax.swing.*;

public class Project0 {

  public static void main(String[] args) {

    String str1 = JOptionPane.showInputDialog("Enter a sentence");
    int counter1 = 0; // First counter for uppercase letters
    int counter2 = 0; // Second counter for lowercase letters
    String str2 = "Stop"; // Case 1
    String str3 = "STOP"; // Case 2

    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) == 'E') {
        counter1++; // Keeps count of uppercase 'E'
      }
      if (str1.charAt(i) == 'e') {
        counter2++; // Keeps count of lowercase 'e'
      } else if (str1.equalsIgnoreCase(str2)) { // Tests case 1
        break;
      } else if (str1.equalsIgnoreCase(str2)) { // Tests case 2
        break;
      }
    }

    JOptionPane.showMessageDialog(null,
        "Number of lower case e's: " + counter2 + " and the number of uppercase e's: " + counter1);

  }
}
