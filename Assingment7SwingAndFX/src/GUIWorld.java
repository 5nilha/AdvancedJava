import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIWorld extends JFrame {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setTitle("Hello World");
		frame.setSize(500, 500);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JButton button = new JButton("Click Here!");
		JTextField textField = new JTextField();

		frame.setLayout(new FlowLayout());

		frame.getContentPane().add(textField);
		frame.getContentPane().add(button);

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setForeground(Color.blue);

			}
		});

		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textField.setText("Hello GUI World");

			}
		});

	}

}
