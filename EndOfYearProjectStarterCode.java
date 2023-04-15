import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;

//The most random and advanced game of pong....
//By: Marco Ngai
public class EndOfYearProjectStarterCode extends JPanel implements KeyListener,Runnable
{
	private int x,x1,x2;
	private int y,y1,y2;
	private int velocityX, velocityY, bounce, random;
	private int p1score, p2score, seconds, ms, minutes;
	//private int[] velocity;
	private String zero;
	private int a;
	private int b;
	private Rectangle ball, r2, p1, p2;
	private Polygon poly;
	private JFrame frame;
	private Thread t;
	private boolean gameOn, left, right, timer;
	private Font f;
	private Color color;
	public EndOfYearProjectStarterCode()
	{
		frame=new JFrame("Pong");
		x=375;
		y=250;
		y1=250;
		y2=250;
		a = 400;
		b = 200;
		seconds = 0;
		ms = 0;
		minutes = 0;
		zero = "";
		p1score = 0;
		p2score = 0;
		bounce = 0;
		random = (int)(Math.random()*2)+1;
		velocityX = 1;
		if (random == 1)
			velocityY = (int)(Math.random()*5);
		else
			velocityY = (int)(-Math.random()*5);
		gameOn=true;
		left = false;
		right = false;
		timer = false;
		ball = new Rectangle(x,y,25,25);
		r2 = new Rectangle(a,b,50,50);
		p1 = new Rectangle(10,y2,10, 25);
		p2 = new Rectangle(765,y2,10,25);
/*		int[] xPoints = {100, 150, 150, 200, 200, 100};
		int[] yPoints = {100, 100, 200, 200, 250, 250};
		poly = new Polygon(xPoints, yPoints, xPoints.length); */
		//int[] velocity = new int[] {(int)(Math.random()*10)+1, (int)(Math.random()*10)+1};
		f=new Font("TIMES NEW ROMAN",Font.PLAIN,25);
		frame.addKeyListener(this);
		frame.add(this);
		frame.setSize(800,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t=new Thread(this);
		t.start();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;

		//all painting (AND ONLY PAINTING) happens here!
		//Don't use this method to deal with mathematics
		//The painting imps aren't fond of math.
		//fill background
		g2d.setPaint(Color.BLACK);
		g2d.fillRect(0,0,800,500);

		//draw scoreboard
		g2d.setColor(Color.WHITE);
		g2d.setFont(f);
		g2d.drawString("PONG:" + " Player 1: " + p1score + " Player 2: " + p2score + " TIMER: " + minutes + ":" + zero + seconds,50,50);

/*		//enemy
		g2d.setColor(Color.GREEN);
		g2d.fillRect(a,b,50,50);

		//polygon
		g2d.setColor(Color.MAGENTA);
		g2d.fill(poly); */

		//player 1
		g2d.setColor(Color.WHITE);
		g2d.fillRect(10, y1, 10, 50);

		//player 2
		g2d.setColor(Color.WHITE);
		g2d.fillRect(765, y2, 10, 50);

		//ball
		g2d.setColor(Color.YELLOW);
		g2d.fillOval(x,y,20,20);

		if (p2score==5 && gameOn==false)
		{
			g2d.setColor(Color.RED);
			g2d.drawString("PLAYER 2 WINS!",300,200);
		}
		if (p1score==5 && gameOn==false)
		{
			g2d.setColor(Color.BLUE);
			g2d.drawString("PLAYER 1 WINS!",300,200);
		}

	}
	public void run()
	{
		while(true)
		{
			if(gameOn)
			{
				//MATH HAPPENS HERE!!!!
				//keep count of steps
				//modify points

				//intersection is true if even one point is shared
				ball = new Rectangle(x,y,20,20);
				p1 = new Rectangle(10,y1,10, 25);
				p2 = new Rectangle(765,y2,10,25);
				random = (int)(Math.random()*2)+1;
				timer = true;
				if (timer)
				{
					ms++;
					if (ms!=0 && ms%100==0)
						seconds++;
					if (seconds%60==0 && seconds!=0)
					{
						seconds=0;
						minutes++;
					}
					if (seconds<10)
					{
						zero="0";
					}
					else
					{
						zero="";
					}
				}
				if (left==true)
				{
					x+=velocityX;
					left = false;
				}
				else if (right==true)
				{
					velocityX*=-1;
					x+=velocityX;
					right = false;
				}
				else
				{
					x+=velocityX;
				}
				y+=velocityY;
				//prevents player 2 from going below the game
				if (y2>=415)
					y2 = 415;
				//prevents player 2 from going above the game
				if (y2 <=0)
					y2 = 0;
				//prevents player 1 from going below the game
				if (y1>=415)
					y1 = 415;
				//prevents player 1 from going above the game
				if (y1<=0)
					y1 =0;
				//bounce off the top and bottom
				if (y >= 445 || y <= 0)
					velocityY*=-1;
				//left wall ball hit
				if (x <= 0)
				{
					p2score++;
					bounce = 0;
					velocityX = 1;
					random = (int)(Math.random()*2)+1;
					if (random == 1)
						velocityY = (int)(Math.random()*5);
					else
						velocityY = (int)(-Math.random()*5);
					x=375;
					y=250;
					left = true;
				}
				//right wall ball hit
				if (x >= 800)
				{
					p1score++;
					bounce = 0;
					velocityX = 1;
					random = (int)(Math.random()*2)+1;
					if (random == 1)
						velocityY = (int)(Math.random()*5);
					else
						velocityY = (int)(-Math.random()*5);
					x=375;
					y=250;
					right = true;
				}
				if (ball.intersects(p1)||ball.intersects(p2))
				{
					if (ball.intersects(p1))
					{
						x=20;
						velocityX*=-1;
						bounce++;
						random = (int)(Math.random()*2)+1;
						if (random == 1)
							velocityY = (int)(Math.random()*5);
						else
							velocityY = (int)(-Math.random()*5);
					}
					if (ball.intersects(p2))
					{
						x=745;
						velocityX*=-1;
						bounce++;
						random = (int)(Math.random()*2)+1;
						if (random == 1)
							velocityY = (int)(Math.random()*5);
						else
							velocityY = (int)(-Math.random()*5);
					}
					x+=velocityX;
					y+=velocityY;
				}
				if(bounce!=0 && bounce%10==0)
				{
					velocityX++;
				}
				if (p2score == 5 || p1score == 5)
				{
					gameOn = false;
					timer = false;
				}
/*				if (ball.intersects(r2))
					System.out.println("OUCH");

				//must be entirely inside for contains to be true
				if (poly.contains(ball))
					System.out.println("INSIDE"); */

				//this is the code for delay
				try
				{
					t.sleep(10);
				}catch(InterruptedException e)
				{
				}
				repaint();
			}
		}
	}

	public void keyPressed(KeyEvent ke)
	{
		//look up keycodes online.  39 is right arrow key
		System.out.println(ke.getKeyCode());
		//right arrow
/*		if(ke.getKeyCode()==39)
			x++;
		//d
		if(ke.getKeyCode()==68)
			x++; */
		//up arrow (player two)
		if(ke.getKeyCode()==38)
			y2-=10;
		//w (player one)
		if(ke.getKeyCode()==87)
			y1-=10;
		//down arrow (player two)
		if(ke.getKeyCode()==40)
			y2+=10;
		//s (player one)
		if(ke.getKeyCode()==83)
			y1+=10;
/*		//left arrow
		if(ke.getKeyCode()==37)
			x--;
		//a
		if(ke.getKeyCode()==65)
			x--; */
	}
	public void keyReleased(KeyEvent ke)
	{
		//right arrow
		if(ke.getKeyCode()==39)
			x+=0;
		//d
		if(ke.getKeyCode()==68)
			x+=0;
		//up arrow
		if(ke.getKeyCode()==38)
			y+=0;
		//w
		if(ke.getKeyCode()==87)
			y+=0;
		//down arrow
		if(ke.getKeyCode()==40)
			y+=0;
		//s
		if(ke.getKeyCode()==83)
			y+=0;
		//left arrow
		if(ke.getKeyCode()==37)
			x+=0;
		//a
		if(ke.getKeyCode()==65)
			x+=0;
	}
	public void keyTyped(KeyEvent ke)
	{
	}
	public static void main(String args[])
	{
		EndOfYearProjectStarterCode app=new EndOfYearProjectStarterCode();
	}
}
