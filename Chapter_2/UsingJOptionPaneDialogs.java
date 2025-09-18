import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
                     String name = JOptionPane.showInputDialog(null, "Enter your name:", "Name Input", JOptionPane.QUESTION_MESSAGE);

            if (name == null) {
                JOptionPane.showMessageDialog(null, "No name entered. Exiting program.", "Exit", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            int confirm = JOptionPane.showConfirmDialog(null,
                    "Do you want your name to be shown?\nName: " + name, "Confirm Name Display",JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                              JOptionPane.showMessageDialog(null, "Your name is: " + name, "Name Display", JOptionPane.INFORMATION_MESSAGE);
                break; 
            } else if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION)  {
               } 
                      }
    }
}
