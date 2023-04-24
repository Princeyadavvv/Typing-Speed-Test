import java.awt.*;
import javax.swing.*;

public class Main extends JWindow {
     new Frame();
     JFrame frame = new JFrame("Career Selection");
     Object[] options = {"Content Writer",
                         "Blog Writer",
                         "Copywriter",
                         "Data Entry Operator",
                         "Programmer"};
     int choice = JOptionPane.showOptionDialog(frame,
             "What do you want to become?",
             "Career Selection",
             JOptionPane.YES_NO_CANCEL_OPTION,
             JOptionPane.QUESTION_MESSAGE,
             null,
             options,
             options[4]);

     int typingSpeedRequirement = 0;
     switch (choice) {
         case 0:
             typingSpeedRequirement = 40;
             break;
         case 1:
             typingSpeedRequirement = 30;
             break;
         case 2:
             typingSpeedRequirement = 45;
             break;
         case 3:
             typingSpeedRequirement = 50;
             break;
         case 4:
             typingSpeedRequirement = 60;
             break;
         default:
             System.exit(0);
     }
     JOptionPane.showMessageDialog(frame, "To become " + options[choice] + ", your typing speed must be " + typingSpeedRequirement + " WPM."+"\nBest of Luck");
   }
}
