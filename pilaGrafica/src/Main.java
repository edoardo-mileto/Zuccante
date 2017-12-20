
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.text.Text;

/**
 *
 * @author edoardo.mileto & giacomo.ravagnan
 *				
 */
public class Main {
	public static ActionListener pushes;
	public static ActionListener pophes;
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.err.println("sfondato lo stack !!");
		Frame f=new Frame("milex Gay");
		f.setBounds(100, 100, 300, 300);
		f.setVisible(true);
		AscoltatoreWin windC=new AscoltatoreWin();
		f.addWindowListener(windC);
		
		Button push =new Button("push");
		Button pop=new Button("pop corn");
		Button capo=new Button("<<");
		Button next=new Button(">");
		
		TextField text=new TextField();
		text.setBounds(50, 34, 100, 30);
	
		pophes=new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				if(true/*stack non vuoto togli elemento*/){
				System.out.println("rimosso elemento");
				}else{/*non faccio niente stack vuoto*/	}
			}
		};
		
		pushes=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("addato elemento "+text.getText());
			}
		};
		pop.setBounds(190, 75, 100, 30);
		push.setBounds(190, 34, 100, 30);
		capo.setBounds(20, 250, 100, 30);
		next.setBounds(180, 250, 100, 30);
		
		
		capo.setBackground(Color.GRAY);
		next.setBackground(Color.GRAY);
		pop.setBackground(Color.GRAY);
		push.setBackground(Color.GRAY);
		
		pop.addActionListener(pophes);
		push.addActionListener(pushes);
		Button c=new Button("nullo");
		
		f.add(capo);
		f.add(next);
		f.add(pop);
		f.add(text);
		f.add(push);
		f.add(c);
	}
	
	
	
	
}
