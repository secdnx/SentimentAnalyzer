package ui;

import java.awt.Font;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class UIFrame extends JFrame{
	
	private UIPane ui_pane;
	
	public UIFrame() throws IOException {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		setContentPane(ui_pane = new UIPane());
		setLocation(ALLBITS, ALLBITS);
		setSize(400,550);
		setUndecorated(true);
		setVisible(true);
	}
	
	public static void main(String[] args) throws IOException {
		UIFrame ui_frame = new UIFrame();
		setUIFont(new javax.swing.plaf.FontUIResource("微軟正黑體", Font.BOLD, 16));
	}
	
	public static void setUIFont(javax.swing.plaf.FontUIResource f) {
		java.util.Enumeration keys = UIManager.getLookAndFeelDefaults().keys();
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value != null && value instanceof javax.swing.plaf.FontUIResource)
				UIManager.put(key, f);
		}
	}
}
