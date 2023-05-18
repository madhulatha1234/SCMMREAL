package Practice;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import javax.swing.plaf.ToolTipUI;

public class newww {
	public static void main(String[] args) {
		StringSelection sec=new StringSelection("path");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sec, null);
	}
}


