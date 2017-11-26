import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class MouseEvents extends JFrame {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextArea textArea = new JTextArea();
		textArea.setText("Click Here!");

		textArea.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				textArea.setBackground(Color.YELLOW);
				System.out.println("Mouse Clicked");
			}
		});

		textArea.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				textArea.setText("Editing the text");
				System.out.println("Mouse Pressed");
			}
		});

		textArea.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				textArea.setText("Edited Text");
				System.out.println("Mouse Released");
			}
		});

		frame.getContentPane().add(textArea);

		frame.setVisible(true);

	}

}
