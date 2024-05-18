import java.applet.*;
import java.awt.*;
import java.awt.Button;
import java.awt.event.*;
public class PaintProject extends Applet implements MouseMotionListener,MouseListener,ActionListener {
	private int  x ,y , hx ,hy, hx1,hy1 ,x1 , y1  ;

	static int s ;
	
	Button o , r  , clr,ln,fh,ea,in,de;
	Button re ,	bl  , gr,ye,cy,ma;
	
	boolean key = true,ka = false,k= true;
   
  
	

	static boolean koval = false,kfree = false,kearse=false ,krect = false, kline = false,kre=false,kye=false,kcy=false,kbl=false,kgr=false , kma= false;  
	 
	
	CheckboxGroup cg = new CheckboxGroup();
	Label l = new Label("FILL");
	Checkbox c1 , c2 ;

	static class arr{
		public static int[] add7(int[] a ){

			 int[]  q=new int[a.length+7];
			for(int i = 0 ; i <a.length;i++){
				q[i]=a[i];
			}
			q[a.length]=0;
			q[a.length+1]=0;
			q[a.length+2]=0;
			q[a.length+3]=0;
			q[a.length+4]=0;
			q[a.length+5]=0;
			q[a.length+6]=0;
			return q ;
		}
		}
		
	static int[]  a = {0,0,0,0,0,0,0};
	public void init(){
		s= 5 ;
		
		//check box 
		s = 15 ;
		 c1 = new Checkbox("YES",cg,false);
		 c2 = new Checkbox("NO",cg,true);
		//set size
		this.setSize(1200,600);
		//oval buttom
		o = new Button("      OVAL      ");
		o.addActionListener(new Oval.setoval());
		add(o);
		//rect buttom
		r = new Button("        Rect      ");
		r.addActionListener(new Rect.setrect());
		add(r);
		//line buttom
		ln = new Button("      Line      ");
		ln.addActionListener(new line.setline());
		add(ln);
		////////freehand buttom
		fh = new Button("       Free Hand       ");
		fh.addActionListener(new freehand.setfree());
		add(fh);
		///////increse
				in = new Button("  +  ");
		in.addActionListener(new Strock.increse());
		add(in);
		
		///////decrse
				de = new Button("  -  ");
		de.addActionListener(new Strock.decrse());
		add(de);
		
		//////Eraser buttom
		ea = new Button("      earse    ");
		ea.addActionListener(new earse.setearse());
		add(ea);
		//clr buttom
		clr = new Button("      Clear All     ");
		clr.addActionListener(this);
		add(clr);
		
		
		
		
		
		/////
		
		/////re ,	bl  , gr,ye,cy,ma;
		re = new Button("   ");
		re.addActionListener(new colors.red());
		add(re);
		re.setBackground(Color.RED);
		///
		bl = new Button("   ");
		bl.addActionListener(new colors.blue());
		add(bl);
		bl.setBackground(Color.BLUE);
		////
		
		gr = new Button("   ");
		gr.addActionListener(new colors.green());
		add(gr);
		gr.setBackground(Color.GREEN);
		////
		ye = new Button("   ");
		ye.addActionListener(new colors.yellow());
		add(ye);
		ye.setBackground(Color.YELLOW);
		///
		cy = new Button("   ");
		cy.addActionListener(new colors.cyan());
		add(cy);
		cy.setBackground(Color.CYAN);
		////
		ma = new Button("   ");
		ma.addActionListener(new colors.magenta());
		add(ma);
		ma.setBackground(Color.MAGENTA);
		///
		
		add(l);
		add(c1);
		add(c2);
		addMouseMotionListener(this);
		addMouseListener(this);
		
		
	}
	static class colors{
		
		//kre=false,kye=false,kcy=false,kbl=false,kgr=false , kma= false;  
		public static class red implements ActionListener{
		public void actionPerformed(ActionEvent eve){
			kre=true;
			kye=false;
			kcy=false;
			kbl=false;
			kgr=false;
			kma= false;  
			

		}
	}
	public static class yellow implements ActionListener{
		public void actionPerformed(ActionEvent eve){
			kre=false;
			kye=true;
			kcy=false;
			kbl=false;
			kgr=false;
			kma= false;  
			

		}
	}
	public static class green implements ActionListener{
		public void actionPerformed(ActionEvent eve){
			kre=false;
			kye=false;
			kcy=false;
			kbl=false;
			kgr=true;
			kma= false;  
			

		}
	}
	public static class blue implements ActionListener{
		public void actionPerformed(ActionEvent eve){
			kre=false;
			kye=false;
			kcy=false;
			kbl=true;
			kgr=false;
			kma= false;  
			

		}
	}
	public static class cyan implements ActionListener{
		public void actionPerformed(ActionEvent eve){
			kre=false;
			kye=false;
			kcy=true;
			kbl=false;
			kgr=false;
			kma= false;  
			

		}
	}
	public static class magenta implements ActionListener{
		public void actionPerformed(ActionEvent eve){
			kre=false;
			kye=false;
			kcy=false;
			kbl=false;
			kgr=false;
			kma= true;  
			

		}
	}
	}
	static class Strock{
	public static class increse implements ActionListener{
		public void actionPerformed(ActionEvent eve){
			if(s<=50){
				s+=5;
			}

		}
	}
	public static class decrse implements ActionListener{
		public void actionPerformed(ActionEvent eve){
			if(s>5){
				s-=5;
			}


		}
	}
	}
	public void  actionPerformed(ActionEvent eve){
		s=15;
	int[] h = {0,0,0,0,0,0,0};
	a = h ;
	  
	repaint();
}
	static class line{
	public static void draw(Graphics g,int x , int y ,int x1, int y2){
					g.drawLine(x,y,x1,y2);				
		}
	public static class setline implements ActionListener{
		public void actionPerformed(ActionEvent eve){
			koval = false; 
		krect = false; 
		kline = true; 
		kearse  = false ;
	kfree = false ;
		}
	}
}
	static class freehand{
	public static void draw(Graphics g,int x , int y,int s ){
		
				
					g.fillOval(x,y,s,s);
		}
	public static class setfree implements ActionListener{
		public void actionPerformed(ActionEvent eve){
			koval = false; 
		krect = false; 
		kline = false; 
		kearse  = false ;
		kfree = true;

		}
	}
}
	static class earse{	
	public static void draw(Graphics g,int x , int y,int s){
		
				
					g.fillOval(x,y,s,s);
		}
	public static class setearse implements ActionListener{
		public void actionPerformed(ActionEvent eve){
		koval = false; 
		krect = false; 
		kline = false; 
		kfree = false;
		kearse= true;
	System.out.println("earse");
		}
	}
}
	static class Oval{
		static class setoval implements ActionListener{
			public void actionPerformed(ActionEvent eve){
			koval = true; 
		krect = false; 
		kline = false; 
		kfree = false ;
		kearse  = false ;
		System.out.println("oval");
		}
	}
		public static void draw(Graphics g,int x , int y ,int x1, int y2){
					g.drawOval(x,y,x1,y2);
		}public static void drawF(Graphics g,int x , int y ,int x1, int y2){
					g.fillOval(x,y,x1,y2);
		}
	}
	static class Rect{
		static class setrect implements ActionListener{
			public void actionPerformed(ActionEvent eve){
			koval = false; 
		krect = true; 
		kline = false; 
		kfree = false ;
		kearse  = false ;
		System.out.println("rec");
		}
		
	}
		public static void draw(Graphics g,int x , int y ,int x1, int y2){
					g.drawRect(x,y,x1,y2);
		}
		public static void drawF(Graphics g,int x , int y ,int x1, int y2){
					g.fillRect(x,y,x1,y2);			
		}
	}
		public void paint(Graphics g){	
					
					for(int i = 0 ; i < a.length;i+=7){
					if(a[i+2]==-5){
						g.setColor(Color.WHITE);
					}else if(a[i]==1){
						g.setColor(Color.RED);
					}else if(a[i]==2){
						g.setColor(Color.YELLOW);
					}else if(a[i]==3){
						g.setColor(Color.GREEN);
					}else if(a[i]==4){
						g.setColor(Color.BLUE);
					}else if(a[i]==5){
						g.setColor(Color.CYAN);
					}else if(a[i]==6){
						g.setColor(Color.MAGENTA);
					}else{
						g.setColor(Color.BLACK);
					}
					 Graphics2D d2 = (Graphics2D) g;
				
					d2.setStroke(new BasicStroke(a[i+1]));
					if(a[i+2]==-5){
						earse.draw(g,a[i+3],a[i+4],a[i+1]);
					}else if(a[i+2]==-2){
						System.out.println("rec");
						Rect.draw(g,a[i+3],a[i+4],a[i+5]-a[i+3],a[i+6]-a[i+4]);
					}else if(a[i+2]==-3){
						
						Oval.draw(g,a[i+3],a[i+4],a[i+5]-a[i+3],a[i+6]-a[i+4]);
					}else if(a[i+2]==-4){
						
						freehand.draw(g,a[i+3],a[i+4],a[i+1]);
					}else if(a[i+2]==-6){
						
						Oval.drawF(g,a[i+3],a[i+4],a[i+5]-a[i+3],a[i+6]-a[i+4]);
					}else if(a[i+2]==-7){
						
						Rect.drawF(g,a[i+3],a[i+4],a[i+5]-a[i+3],a[i+6]-a[i+4]);
					}	else if(a[i+2]<=-1){
						// Graphics2D g2d = (Graphics2D)g;
						//g2d.setStroke(new BasicStroke(-1*a[i]-10));
						line.draw(g,a[i+3],a[i+4],a[i+5],a[i+6]);
					}
				}			
		}
    public void mouseDragged(MouseEvent e) {
		//for\line -1 \ rect -2 \ oval -3,\ free hand -4 \\ filrec -7 \\ filloval -6 \\ a[i] color \\ a[i+1] strock ;
		//setkeys
		if(kre){
			a[a.length-7]=1;
		}else if(kye){
			a[a.length-7]=2;
		} else if(kgr){
			a[a.length-7]=3;
		} else if(kbl){
			a[a.length-7]=4;
		} else if(kcy){
			a[a.length-7]=5;
		} else if(kma){
			a[a.length-7]=6;
		} 
		a[a.length-6] = s ;
		if (kearse){
			a[a.length-5]=-5;
		}else if(koval&&c1.getState()){
			a[a.length-5]=-6;
		}else if(krect&&c1.getState()){
			a[a.length-5]=-7;
		}else if(koval){
			a[a.length-5]=-3;
		}else if(krect){
			a[a.length-5]=-2;
		}else if(kline){
			a[a.length-5]=-1;
		}else if (kfree){
			a[a.length-5]=-4;
		}else {}
		//draw
			if(k||kfree||kearse){
				
		hx= e.getX();
		hy=e.getY();
		a[a.length-4]=e.getX();
		a[a.length-3]=e.getY();
		repaint();
		if(kfree||kearse){
			a =	arr.add7(a);
		}
		k=false;
			}else{
				
			if(e.getX()>=hx&&e.getY()>=hy||kline){//right down
				if(key){
				x = e.getX();
				a[a.length-4]=x;
				hx = x;
				y = e.getY();
				a[a.length-3]=y;
				hy= y ;
				key = false ;
				ka = true;
				repaint();
			}else{
				x1 = e.getX();
				a[a.length-2]=x1;
				y1 = e.getY();
				a[a.length-1]=y1;
				repaint();
			}
			}else if(e.getX()<hx&&e.getY()>=hy){//left down
				if(key){
				x1 = e.getX();
				hx = x1 ;
				a[a.length-2]=x1;
				y = e.getY();
				hy = y ;
				a[a.length-3]=y;
				ka = true;
				key = false ;
				repaint();
			}else{
				x = e.getX();
				
				a[a.length-4]=x;
				y1 = e.getY();
				
				a[a.length-1]=y1;
				repaint();
				
			}}else if(e.getX()>=hx&&e.getY()<hy){//right top
				if(key){
				x = e.getX();
				a[a.length-4]=x;
				hx= x ;
				y1 = e.getY();
				a[a.length-1]=y1;
				hy = y1 ;
				key = false ;
				ka = true;
				repaint();
			}else{	///////////////////////////left top
				
			
				a[a.length-2]=e.getX();
				y = e.getY();
			
				a[a.length-3]=y;
				repaint();
				
			}}else {//left top
				if(key){
				x1 = e.getX();
				a[a.length-2]=x1;
				hx = x1 ;
				y1 = e.getY();
				a[a.length-1]=y1;
				hy = y1 ;
				repaint();
				key = false ;
				ka = true;
			}else{
				x = e.getX();
		
			a[a.length-4]=x;
			y = e.getY();
		
			a[a.length-3]=y;
			repaint();
					
			}
			}
			
			}
    }
    public void mouseMoved(MouseEvent e){}	
	public void mousePressed(MouseEvent e){}
	public void  mouseExited(MouseEvent e){}
	 public void  mouseEntered(MouseEvent e){}
	 public void  mouseReleased(MouseEvent e){
		 //save the shape and reset keys
	if(ka){
	a =	arr.add7(a);
		ka = false ;
		key = true ; 
		k= true ;
			}
	}
	 public void   mouseClicked(MouseEvent e){
		
	 }
}