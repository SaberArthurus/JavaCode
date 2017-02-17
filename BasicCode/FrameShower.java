import java.awt.*;
public class FrameShower{
	public static void main(String args[]){
		Frame f = new Frame("hello");
		f.add(new Button("Press me"));
		f.setSize(100, 100);
		f.setVisible(true);

	}
}