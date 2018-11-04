import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CyclicAndOscillatingMotionDemo  extends JPanel implements ActionListener{
	public void drawFrame(Graphics g, int frameNumber, int width, int height) {
		int cyclicFrameNum;
		cyclicFrameNum = frameNumber%300;
		g.setColor(Color.RED);
		g.fillRect(1*cyclicFrameNum, 0, 20, 20);
		cyclicFrameNum = frameNumber%150;
		g.setColor(Color.GREEN);
		g.fillRect(2*cyclicFrameNum, 20, 20, 20);
		cyclicFrameNum = frameNumber%100;
		g.setColor(Color.BLUE);
		g.fillRect(3*cyclicFrameNum, 40, 20, 20);
		int oscillationFrameNum;
		oscillationFrameNum = frameNumber%600;
		if(oscillationFrameNum>300)
			oscillationFrameNum = 600 - oscillationFrameNum;
		g.setColor(Color.CYAN);
		g.fillRect(oscillationFrameNum, 60, 20, 20);
		oscillationFrameNum = frameNumber%300;
		if(oscillationFrameNum>150)
			oscillationFrameNum = 300 - oscillationFrameNum;
		g.setColor(Color.MAGENTA);
		g.fillRect(2*oscillationFrameNum, 80, 20, 20);
		oscillationFrameNum = frameNumber%200;
		if(oscillationFrameNum>100)
			oscillationFrameNum = 200 - oscillationFrameNum;
		g.setColor(Color.YELLOW);
		g.fillRect(3*oscillationFrameNum, 100, 20, 20);
		int y;
		g.setColor(Color.BLACK);
		for(y=20; y<240 ; y+=20)
			g.drawLine(0, y, 320, y);
		g.drawRect(0, 0, 319, 119);
		
	}
public static void main(String[] args) {
	JFrame window = new JFrame("Cyclic and Oscillating Motion");
	CyclicAndOscillatingMotionDemo drawingErea = new CyclicAndOscillatingMotionDemo();
	drawingErea.setBackground(Color.WHITE);
	window.setContentPane(drawingErea);
	drawingErea.setPreferredSize(new Dimension(320,120));
	window.pack();
	window.setLocation(100, 50);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setResizable(false);
	Timer frameTimer = new Timer(20,drawingErea);
	window.setVisible(true);
	frameTimer.start();
}
private int frameNum;
public void actionPerformed(ActionEvent evt) {
	frameNum++;
	repaint();
}
protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	drawFrame(g, frameNum, getWidth(), getHeight());
}
}