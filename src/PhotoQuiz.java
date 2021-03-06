 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String URL = "http://ichef.bbci.co.uk/childrens-responsive-ichef/r/400/1x/cbeebies/teletibbies-title.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component images;
		// 3. use the "createImage()" method below to initialize your Component
images = createImage(URL);
		// 4. add the image to the quiz window
quizWindow.add(images);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String Hollow = JOptionPane.showInputDialog(null, "What T.V show are these protagonists from?");
		// 7. print "CORRECT" if the user gave the right answer
if (Hollow.equals("TeleTubbies")){
	JOptionPane.showMessageDialog(null, "Correct!!!");
}
else {
	JOptionPane.showMessageDialog(null, "Sorry the correct answer is Sleepy Hollow");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(images);
		// 10. find another image and create it (might take more than one line of code)
String url ="https://s-media-cache-ak0.pinimg.com/236x/1e/33/cf/1e33cf415b561e42a32cbc99d31c5d27.jpg";
		// 11. add the second image to the quiz window
Component dino;
		// 12. pack the quiz window
dino = createImage(url);
quizWindow.add(dino);
quizWindow.pack();
		// 13. ask another question
String Diego = JOptionPane.showInputDialog(null,"Who is this?");
if (Diego.equals("Diego")){
	JOptionPane.showMessageDialog(null, "Your completely correct!!! ");
}
else {
	JOptionPane.showMessageDialog(null, "Sorry the correct answer was Diego");
}
quizWindow.remove(dino);
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}















