
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.awt.Font;

public class myFrame extends JFrame implements ActionListener,ChangeListener {

    JTextField text ;
    JButton button1 ;
    JCheckBox checkBox ;
    JButton button2 ;
    ImageIcon xIcon ;
    ImageIcon checkIcon ;
    JRadioButton radioButton1 ;
    JRadioButton radioButton2 ;
    JRadioButton radioButton3 ;
    ButtonGroup group;
    JComboBox comboBox ;
    JSlider slider ;
    JLabel label ;
    JPanel panel ;
    JProgressBar bar;
    JMenuBar menuBar;
    JMenuItem loaditem ;
    JMenuItem saveitem ;
    JMenuItem exititem ;

    myFrame() {
//----------------------------------------------------------
//frame
//----------------------------------------------------------

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setAlwaysOnTop(false);

//----------------------------------------------------------
//textfield
//----------------------------------------------------------

        button1 = new JButton("submit!");
        button1.setFocusable(false);
        button1.addActionListener(this);
        button1.setBounds(50, 50, 100, 40);

        text = new JTextField();
        text.setPreferredSize(new Dimension(300,80));
        text.setFont(new Font("consolas", Font.BOLD, 25));
        text.setForeground(Color.white);
        text.setBackground(Color.black);
        text.setCaretColor(Color.green);
        text.setText("username");
        text.setBounds(180, 50, 300, 40);

//----------------------------------------------------------
//checkbox
//----------------------------------------------------------
        
        xIcon = new ImageIcon("myltiply.png");
        checkIcon = new ImageIcon("check-mark.png");

        checkBox = new JCheckBox();
        checkBox.setText(" Im not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setBounds(180, 150, 300, 40);
        //checkBox.setIcon(xIcon);
        //checkBox.setSelectedIcon(checkIcon);

        button2 = new JButton("selected ??");
        button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setBounds(50, 150, 100, 40);

//----------------------------------------------------------
//radio buttons
//----------------------------------------------------------

        radioButton1 = new JRadioButton("pizza");
        radioButton1.setBounds(50, 220, 80, 40);
        radioButton1.addActionListener(this);

        radioButton2 = new JRadioButton("hotdog");
        radioButton2.setBounds(140, 220, 80, 40);
        radioButton2.addActionListener(this);

        radioButton3 = new JRadioButton("humberger");
        radioButton3.setBounds(230, 220, 80, 40);
        radioButton3.addActionListener(this);

        group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

//----------------------------------------------------------
//combobox
//----------------------------------------------------------

        String[] animals = {"dog","cat","bird"};
        comboBox = new JComboBox(animals);
        comboBox.setBounds(50, 320, 100, 30);
        comboBox.addActionListener(this);     
        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());  
        //comboBox.addItem("horse"); 
        //comboBox.insertItemAt("pig",0);
        //comboBox.setSelectedIndex(0);
        comboBox.removeItemAt(0);
        comboBox.removeAll();

//----------------------------------------------------------
//sliders
//----------------------------------------------------------

        slider = new JSlider(0,100,0);
        slider.setBounds(50,420,400,50);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,15));
        slider.setOrientation(SwingConstants.HORIZONTAL);
        //slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label = new JLabel(slider.getValue()+"°C");
        label.setFont(new Font("MV Boli",Font.PLAIN,15));
        label.setBounds(240,380,100,50);

//----------------------------------------------------------
//progress bar
//----------------------------------------------------------

        bar = new JProgressBar();
        bar.setValue(0);
        bar.setStringPainted(true);
        bar.setBounds(50,550,300,50);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.green);
        bar.setBackground(Color.black);

//----------------------------------------------------------
//menu bar
//----------------------------------------------------------
    
    menuBar = new JMenuBar();  

    JMenu menu1 = new JMenu("file");
    JMenu menu2 = new JMenu("edit");
    JMenu menu3 = new JMenu("help");  
    
    menu1.setMnemonic(KeyEvent.VK_F); //Alf + F
    menu2.setMnemonic(KeyEvent.VK_E); //Alt + E
    menu3.setMnemonic(KeyEvent.VK_H); //Alt + H

    loaditem = new JMenuItem("Load");
    saveitem = new JMenuItem("save");
    exititem = new JMenuItem("exit");

    loaditem.addActionListener(this);
    saveitem.addActionListener(this);
    exititem.addActionListener(this);

    loaditem.setMnemonic(KeyEvent.VK_L);
    saveitem.setMnemonic(KeyEvent.VK_S);
    exititem.setMnemonic(KeyEvent.VK_Q);

    menu1.add(loaditem);
    menu1.add(saveitem);
    menu1.add(exititem);
    
    menuBar.add(menu1);
    menuBar.add(menu2);
    menuBar.add(menu3);

//----------------------------------------------------------
//frame
//----------------------------------------------------------

        this.add(text);
        this.add(button1);
        this.add(checkBox);
        this.add(button2);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(comboBox);
        this.add(slider);
        this.add(label);
        this.add(bar);
        this.setSize(1000,800);
        this.setJMenuBar(menuBar);
        //this.pack();
        this.setVisible(true);

        fill();
    }

    public void fill () {
        int counter = 0;
        while(counter <= 100) {
            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter+=1;
        }
        bar.setString("Done ! :)");
    }

//----------------------------------------------------------
//actions !!
//----------------------------------------------------------

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == button1) {
            System.out.println(text.getText());
            text.setEditable(false);
            button1.setEnabled(false);
        }       
        if (e.getSource() == button2) {
            System.out.println(checkBox.isSelected());
        }
        if (e.getSource() == radioButton1) {
            System.out.println("you ordered pizza!");
        }
        if (e.getSource() == radioButton2) {
            System.out.println("you ordered hotdog!");
        }
        if (e.getSource() == radioButton3) {
            System.out.println("you ordered humberger!");
        }
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
            System.out.println(comboBox.getSelectedIndex());
        }
        
//--------------------------------------------
//filechooser
//--------------------------------------------
        if(e.getSource()==loaditem) {
			
			JFileChooser fileChooser = new JFileChooser();
			
			fileChooser.setCurrentDirectory(new File(".")); //sets current directory
			
			int response = fileChooser.showOpenDialog(null); //select file to open
			//int response = fileChooser.showSaveDialog(null); //select file to save
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
//-------------------------------------------
//-------------------------------------------
        
        if (e.getSource() == saveitem){
            System.out.println("file saved succesfully");
        }
        if (e.getSource() == exititem){
            System.out.println("exit");
            System.exit(0);
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        
        if (e.getSource() == slider) {
            label.setText(slider.getValue()+"°C");
        }
    } 
}
