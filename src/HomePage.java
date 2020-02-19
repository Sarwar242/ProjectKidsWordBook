import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;


public class HomePage  extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel jlb1,logo;
	private ImageIcon img,imgkwb,imgacnmnts,imgxit,imglogo,imgveg,imgani,imgbody,imgbird,imgflow;
	private Container c;
	public JButton btnkwb,btnacnmnts,btnxit,veg,ani,body,bird,flow;
	private Cursor c1,c2;
	private JTextArea ta1;
	private JScrollPane sp1;
	private Font banglaFont;
	
	private Reader reader = null;
	
	public HomePage() {
		getContentPane().setMinimumSize(new Dimension(820, 700));
		setMinimumSize(new Dimension(820, 700));
		initComponents();
	}
	
	Action act = new Action();


	public void initComponents() {
		//cursor
		c1 = new Cursor(Cursor.HAND_CURSOR);
		c2 = new Cursor(Cursor.DEFAULT_CURSOR);
		banglaFont=new Font("Arial Unicode MS", Font.BOLD,15);
		c = this.getContentPane();
		c.setLayout(null);
		//background
		img = new ImageIcon("kwb2.png");
		jlb1 = new JLabel("", img, JLabel.CENTER);
		jlb1.setBounds(0, 0, 820, 700);
		c.add(jlb1);
		//logo
		imglogo = new ImageIcon("logo.png");
		logo = new JLabel(imglogo);
		logo.setBounds(0, 0, imglogo.getIconWidth(), imglogo.getIconHeight());
		jlb1.add(logo);
		
		//button kwb
		imgkwb = new ImageIcon("btnkwb.png");
		btnkwb = new JButton(imgkwb);
		btnkwb.setBounds(0, 700-imgkwb.getIconHeight()-28, imgkwb.getIconWidth(), imgkwb.getIconHeight());
		btnkwb.setCursor(c1);
		//btnkwb.addActionListener(act);
		jlb1.add(btnkwb);
		
		//button acnmnts
		imgacnmnts = new ImageIcon("btnacnmnts.png");
		btnacnmnts = new JButton(imgacnmnts);
		btnacnmnts.setBounds(imgkwb.getIconWidth(), 700-imgkwb.getIconHeight()-28, imgacnmnts.getIconWidth(), imgacnmnts.getIconHeight());
		btnacnmnts.setCursor(c1);
		//btnkwb.addActionListener(act);
		jlb1.add(btnacnmnts);
		
		//button exit
		imgxit = new ImageIcon("btnxit.png");
		btnxit = new JButton(imgxit);
		btnxit.setBounds(imgkwb.getIconWidth()+imgacnmnts.getIconWidth(), 700-imgkwb.getIconHeight()-28, imgxit.getIconWidth(), imgxit.getIconHeight());
		btnxit.setCursor(c1);
		btnxit.addActionListener(act);
		jlb1.add(btnxit);
		
		//text area
		GraphicsEnvironment.getLocalGraphicsEnvironment();
	   
		ta1 = new JTextArea();
		ta1.setBackground(Color.LIGHT_GRAY);
		ta1.setFont(banglaFont);
		ta1.setCursor(c2);
		ta1.setLineWrap(true);
		ta1.setEditable(false);
		ta1.setBorder(new EmptyBorder(10, 10, 10, 10));
		ta1.setWrapStyleWord(true);
		sp1 = new JScrollPane(ta1);
		sp1.setBounds(imglogo.getIconWidth()-550, imglogo.getIconHeight(), 540, 480);
		jlb1.add(sp1);
		
		//veg
		imgveg = new ImageIcon("veg.jpg");
		veg = new JButton(imgveg);
		veg.setBounds(20, imglogo.getIconHeight()+10, imgveg.getIconWidth()-15, imgveg.getIconHeight()-15);
		veg.setCursor(c1);
		veg.addActionListener(act);
		veg.setFocusable(false);
		veg.setBorder(null);
		jlb1.add(veg);
		
		//animal
		imgani = new ImageIcon("ani.jpg");
		ani = new JButton(imgani);
		ani.setBounds(20, imglogo.getIconHeight()+90, imgani.getIconWidth()-15, imgani.getIconHeight()-15);
		ani.setCursor(c1);
		ani.addActionListener(act);
		ani.setFocusable(false);
		ani.setBorder(null);
		jlb1.add(ani);
				
		//body
		imgbody = new ImageIcon("body.jpg");
		body = new JButton(imgbody);
		body.setBounds(20, imglogo.getIconHeight()+170, imgbody.getIconWidth()-15, imgbody.getIconHeight()-15);
		body.setCursor(c1);
		body.addActionListener(act);
		body.setFocusable(false);
		body.setBorder(null);
		jlb1.add(body);
		
		//Bird
		imgbird = new ImageIcon("bird.jpg");
		bird = new JButton(imgbird);
		bird.setBounds(20, imglogo.getIconHeight()+250, imgbird.getIconWidth()-15, imgbird.getIconHeight()-15);
		bird.setCursor(c1);
		bird.addActionListener(act);
		bird.setFocusable(false);
		bird.setBorder(null);
		jlb1.add(bird);		
		
		//flower
		imgflow = new ImageIcon("veg.jpg");
		flow = new JButton(imgflow);
		flow.setBounds(20, imglogo.getIconHeight()+330, imgflow.getIconWidth()-15, imgflow.getIconHeight()-15);
		flow.setCursor(c1);
		flow.addActionListener(act);
		flow.setFocusable(false);
		flow.setBorder(null);
		jlb1.add(flow);
				
	
	}


	public static void main(String[] args) {
		HomePage frame = new HomePage();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(820, 700);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

	}
	class Action  implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if(e.getSource()== btnxit) {
				int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit ?", null, JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION);
				if(choice == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}else if (e.getSource() == veg) {
				ta1.setText(" ");
				try {
					reader = new FileReader("file" + File.separator + "vegetable.txt");
					int c;
					while ((c = reader.read()) != -1) {
						char ch = (char) c;
						ta1.append(ch + "");
					}
				} catch (IOException ex) {
					ta1.setText("Error");
				} finally {
					try {
						if (reader != null) {
							reader.close();
						}
					} catch (IOException ex) {

					}
				}
			}
			
			else if (e.getSource() == ani) {
				ta1.setText(" ");
				try {
					reader = new FileReader("file" + File.separator + "Animal.txt");
					int c;
					while ((c = reader.read()) != -1) {
						char ch = (char) c;
						ta1.append(ch + "");
					}
				} catch (IOException ex) {
					ta1.setText("Error");
				} finally {
					try {
						if (reader != null) {
							reader.close();
						}
					} catch (IOException ex) {

					}
				}
			}
			
			else if (e.getSource() == body) {
				ta1.setText(" ");
				try {
					reader = new FileReader("file" + File.separator + "bodyparts.txt");
					int c;
					while ((c = reader.read()) != -1) {
						char ch = (char) c;
						ta1.append(ch + "");
					}
				} catch (IOException ex) {
					ta1.setText("Error");
				} finally {
					try {
						if (reader != null) {
							reader.close();
						}
					} catch (IOException ex) {

					}
				}
			}
			
			else if (e.getSource() == bird) {
				ta1.setText(" ");
				try {
					reader = new FileReader("file" + File.separator + "bird.txt");
					int c;
					while ((c = reader.read()) != -1) {
						char ch = (char) c;
						ta1.append(ch + "");
					}
				} catch (IOException ex) {
					ta1.setText("Error");
				} finally {
					try {
						if (reader != null) {
							reader.close();
						}
					} catch (IOException ex) {

					}
				}
			}
			
			else if (e.getSource() == flow) {
				ta1.setText(" ");
				try {
					reader = new FileReader("file" + File.separator + "flower.txt");
					int c;
					while ((c = reader.read()) != -1) {
						char ch = (char) c;
						ta1.append(ch + "");
					}
				} catch (IOException ex) {
					ta1.setText("Error");
				} finally {
					try {
						if (reader != null) {
							reader.close();
						}
					} catch (IOException ex) {

					}
				}
			}
			
			else if (e.getSource() == veg) {
				ta1.setText(" ");
				try {
					reader = new FileReader("file" + File.separator + "vegetable.txt");
					int c;
					while ((c = reader.read()) != -1) {
						char ch = (char) c;
						ta1.append(ch + "");
					}
				} catch (IOException ex) {
					ta1.setText("Error");
				} finally {
					try {
						if (reader != null) {
							reader.close();
						}
					} catch (IOException ex) {

					}
				}
			}
		}
	}

}
