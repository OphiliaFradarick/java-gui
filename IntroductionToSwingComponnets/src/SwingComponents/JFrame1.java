package SwingComponents;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class JFrame1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField field;
	private JButton closeButton;
	private JButton pressMe;
	private JLabel response;
	private JRadioButton bad;
	private JRadioButton good;
	private final ButtonGroup radioBtngroup = new ButtonGroup();
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame1 frame = new JFrame1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame1() {
		buildComponents();
		addEventHandling();
		
	}
	
	public void buildComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel aFrame = new JPanel();
		aFrame.setBackground(new Color(250, 165, 173));
		aFrame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Frame with components");
		aFrame.setVisible(true);

		setContentPane(aFrame);
		
		JLabel lblName = new JLabel("What is your name ?");
		lblName.setForeground(new Color(151, 0, 4));
		lblName.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		
		field = new JTextField();
		field.setColumns(12);
		
		pressMe = new JButton("Press me");
		
		pressMe.setBackground(new Color(255, 255, 0));
		
		closeButton = new JButton("");
		closeButton.setBackground(new Color(250, 165, 173));
		closeButton.setIcon(new ImageIcon(JFrame1.class.getResource("/Resources/close.png")));
		closeButton.setSelectedIcon(new ImageIcon(JFrame1.class.getResource("/Resources/close.png")));
		
		response = new JLabel("New label");
		response.setFont(new Font("Tahoma", Font.BOLD, 15));
		response.setBackground(new Color(162, 9, 23));
		response.setVisible(false);
		
		good = new JRadioButton("Good");
		good.setBackground(new Color(204, 204, 0));
		radioBtngroup.add(good);
		good.setSelected(true);
		
		bad = new JRadioButton("Bad");
		radioBtngroup.add(bad);
		bad.setBackground(new Color(204, 204, 0));
		
		JCheckBox chkBox = new JCheckBox("Click Here You are Enjoying The Weather");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Summer", "Winter", "Fall", "Spring"}));
		comboBox.setSelectedIndex(0);
		comboBox.setMaximumRowCount(3);
		GroupLayout gl_aFrame = new GroupLayout(aFrame);
		gl_aFrame.setHorizontalGroup(
			gl_aFrame.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_aFrame.createSequentialGroup()
					.addGap(125)
					.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
					.addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_aFrame.createSequentialGroup()
					.addGap(91)
					.addGroup(gl_aFrame.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_aFrame.createSequentialGroup()
							.addGap(15)
							.addComponent(response, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addGroup(gl_aFrame.createParallelGroup(Alignment.LEADING, false)
								.addComponent(good)
								.addComponent(bad, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_aFrame.createSequentialGroup()
							.addComponent(field, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(33)
							.addComponent(pressMe)))
					.addContainerGap(72, Short.MAX_VALUE))
				.addGroup(gl_aFrame.createSequentialGroup()
					.addGap(35)
					.addComponent(chkBox)
					.addContainerGap(179, Short.MAX_VALUE))
		);
		gl_aFrame.setVerticalGroup(
			gl_aFrame.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_aFrame.createSequentialGroup()
					.addGroup(gl_aFrame.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_aFrame.createSequentialGroup()
							.addGap(5)
							.addComponent(lblName, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_aFrame.createParallelGroup(Alignment.BASELINE)
								.addComponent(pressMe)
								.addComponent(field, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
							.addGap(33)
							.addGroup(gl_aFrame.createParallelGroup(Alignment.LEADING)
								.addComponent(response, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_aFrame.createSequentialGroup()
									.addComponent(good)
									.addGap(18)
									.addComponent(bad))))
						.addComponent(closeButton, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addGroup(gl_aFrame.createParallelGroup(Alignment.BASELINE)
						.addComponent(chkBox)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(112, Short.MAX_VALUE))
		);
		aFrame.setLayout(gl_aFrame);
	}
	
	public void addEventHandling() {
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		pressMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				response.setText(field.getText()+ ", Have a good day!!");
				response.setVisible(true);
			}
		});
		
		
	
	}
}
