import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;
public class Spammer{
    public static void main(String[] args) throws AWTException, InterruptedException {


        int i = 0;
       Robot robot = new Robot();
       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter your text: ");
       String text = scanner.nextLine(); 
       int size = scanner.nextInt();

       StringSelection stringSelection  = new StringSelection(text);
       Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
       clipboard.setContents(stringSelection, null);

       System.out.println("Wait for 3 seconds " );
       Thread.sleep(3000);
        scanner.close();

        while(i < size){
            Thread.sleep(500);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
                i++;


        }
       
    }
}
