
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Front_Page extends JFrame 
{
    Image img_back, sust, aq,background, fish1, fish1m, bud1, bud2;
    private Image dbImage;
    private Graphics dbg;
    int ai=-100, aj=100, si=1000, sj=200,i=0,j=0,x=0,y=700, ti=100, tj=400;
    int flag;
    boolean f=true;
    Front_Page()
    {
        super("Aquarium Animation");
        setSize(1000, 700);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        img_back = Toolkit.getDefaultToolkit().getImage("images/background2.jpg");
        aq = Toolkit.getDefaultToolkit().getImage("images/aqName.gif");
        sust = Toolkit.getDefaultToolkit().getImage("images/sust.gif");
        background= Toolkit.getDefaultToolkit().getImage("images/background2.gif");
        fish1= Toolkit.getDefaultToolkit().getImage("images/fish1.gif");
        fish1m= Toolkit.getDefaultToolkit().getImage("images/fish1m.gif");
        bud1= Toolkit.getDefaultToolkit().getImage("images/budbud.gif");
        bud2= Toolkit.getDefaultToolkit().getImage("images/budbud2.gif");
        flag=0;
        
    
    
    }
    public void paint(Graphics g)
    {
        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        paintComponent(dbg);
        g.drawImage(dbImage, 0, 0, this);
        
       //System.exit(0);
    }

    private void paintComponent(Graphics g) 
    {
        g.drawImage(img_back, i,j,getWidth(),getHeight(), this);
        g.drawImage(sust, ai, aj, this);
        g.drawImage(aq, si, sj, this);
        g.drawImage(background, 0, y,getWidth(),getHeight(), this);
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(Front_Page.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(flag==0)
        {
            if(ai<200)
                ai+=2;
            if(si>200)
                si-=5;
            else
            {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Front_Page.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                flag=1;
            }
            
        }
        else if(flag==1)
        {
            j-=5;
            aj-=5;
            sj-=5;
            y-=5;
            if(y==0)
                flag=3;
            
        }
        else if(flag==3)
        {
            /*g.drawImage(bud2, 500, 400, this);
            g.drawImage(bud2, 750, 150, this);
            g.drawImage(bud2, 200, 200, this);
            if(f==true)
            {
                g.drawImage(fish1, ti--,tj , this);
                if(ti<0)
                    f=false;
                
                
            }
            else
            {
                g.drawImage(fish1m, ti++,tj , this);
                if(ti>900)
                    f=true;
            }*/
            
            aquarium.frame2=new animation();
            aquarium.frame1.setVisible(false);
            
            
        }
            
        
        
       
        repaint();
        
    }
    
}
