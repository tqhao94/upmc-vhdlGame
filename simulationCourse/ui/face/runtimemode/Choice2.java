package ui.face.runtimemode;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Choice2 implements ActionListener, Choices {

	private ChooseCars cc;
	
	public Choice2(ChooseCars cc){
		this.cc = cc;
	}
	
	public void actionPerformed(ActionEvent e) {
		cc.set("car2.jpg");
	}

}