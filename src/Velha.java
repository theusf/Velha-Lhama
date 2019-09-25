import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
//import net.miginfocom.swing.MigLayout;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;



public class Velha {

	private JFrame frmLhamavelha;
	private JButton B_1_1 = new JButton("1");
	private JButton B_1_2 = new JButton("2");
	private JButton B_1_3 = new JButton("3");
	private JButton B_2_1 = new JButton("4");
	private JButton B_2_2 = new JButton("5");
	private JButton B_2_3 = new JButton("6");
	private JButton B_3_1 = new JButton("7");
	private JButton B_3_2 = new JButton("8");
	private JButton B_3_3 = new JButton("9");
	private JOptionPane test = new JOptionPane();
	private Clip clip = null;
	

	
			
			
	public void ClickBotao(JButton botao, JogadorAutomatico jogadorA, Tabuleiro tabDoJogo ) throws Exception 
	{
		AnalistaSituacional analista = new AnalistaSituacional(tabDoJogo);
		
		
	if ( botao.getText() == "1") 
	{ tabDoJogo.setMarcaNaPosicao ( jogadorH.getMarca() ,1,1);
		botao.setText( tabDoJogo.getMarcaNaPosicao(1,1).toString() ); }
	
	if ( botao.getText() == "2") 
	{ tabDoJogo.setMarcaNaPosicao ( jogadorH.getMarca() ,1,2);
		botao.setText( tabDoJogo.getMarcaNaPosicao(1,2).toString() ); }
	
	if ( botao.getText() == "3") 
	{ tabDoJogo.setMarcaNaPosicao ( jogadorH.getMarca() ,1,3);
		botao.setText( tabDoJogo.getMarcaNaPosicao(1,3).toString() ); }
	
	if ( botao.getText() == "4") 
	{ tabDoJogo.setMarcaNaPosicao ( jogadorH.getMarca() ,2,1);
		botao.setText( tabDoJogo.getMarcaNaPosicao(2,1).toString() ); }
	
	if ( botao.getText() == "5") 
	{ tabDoJogo.setMarcaNaPosicao ( jogadorH.getMarca() ,2,2);
		botao.setText( tabDoJogo.getMarcaNaPosicao(2,2).toString() ); }
	
	if ( botao.getText() == "6") 
	{ tabDoJogo.setMarcaNaPosicao ( jogadorH.getMarca() ,2,3);
		botao.setText( tabDoJogo.getMarcaNaPosicao(2,3).toString() ); }
	
	if ( botao.getText() == "7") 
	{ tabDoJogo.setMarcaNaPosicao ( jogadorH.getMarca() ,3,1);
		botao.setText( tabDoJogo.getMarcaNaPosicao(3,1).toString() ); }
	
	if ( botao.getText() == "8") 
	{ tabDoJogo.setMarcaNaPosicao ( jogadorH.getMarca() ,3,2);
		botao.setText( tabDoJogo.getMarcaNaPosicao(3,2).toString() ); }
	
	if ( botao.getText() == "9") 
	{ tabDoJogo.setMarcaNaPosicao ( jogadorH.getMarca() ,3,3);
		botao.setText( tabDoJogo.getMarcaNaPosicao(3,3).toString() ); }
	
	
	
	ImageIcon img = new ImageIcon(Velha.class.getResource("/llama-icon2.png"));
	
	if ( botao.getText() != jogadorA.getMarca().toString() ) 
		img = new ImageIcon(Velha.class.getResource("/llama-icon.png"));
		
	botao.setIcon(img);
	botao.setDisabledIcon(img);
	
	String a = "";
	botao.setEnabled(false);
	
	
	
	if (!(analista.fimDeJogo()))
	{
		a = jogadorA.facaSuaJogada();
		img = new ImageIcon(Velha.class.getResource("/llama-icon2.png"));
		
	}
		
		if ( a.equals("1,1" ) )
		 { 
		 	botao = B_1_1 ;
			botao.setText( tabDoJogo.getMarcaNaPosicao(1,1).toString() ); 
		 }
		
		if (a.equals("1,2") )
		{ 
			botao = B_1_2 ;
			botao.setText( tabDoJogo.getMarcaNaPosicao(1,2).toString() ); 
		}
		
		if (a.equals("1,3") )
		{ 
			botao = B_1_3 ;
			botao.setText( tabDoJogo.getMarcaNaPosicao(1,3).toString() ); 
		}
		
		
		
		if (a.equals("2,1") )
		{ 
			botao = B_2_1 ;
			botao.setText( tabDoJogo.getMarcaNaPosicao(2,1).toString() ); 
		}
		
		if (a.equals("2,2") )
		{ 
			botao = B_2_2 ;
			botao.setText( tabDoJogo.getMarcaNaPosicao(2,2).toString() ); 
		}
		
		if (a.equals("2,3") )
		{ 
			botao = B_2_3 ;
			botao.setText( tabDoJogo.getMarcaNaPosicao(2,3).toString() ); 
		}
		
		
		
		if (a.equals("3,1") )
		{ 
			botao = B_3_1 ;
			botao.setText( tabDoJogo.getMarcaNaPosicao(3,1).toString() ); 
		}
		
		if (a.equals("3,2") )
		{ 
			botao = B_3_2 ;
			botao.setText( tabDoJogo.getMarcaNaPosicao(3,2).toString() ); 
		}
		
		if (a.equals("3,3") )
		{ 
			botao = B_3_3 ;
			botao.setText( tabDoJogo.getMarcaNaPosicao(3,3).toString() ); 
		}
		
		botao.setIcon(img);
		botao.setDisabledIcon(img);
		botao.setEnabled(false);
		
		
		if (analista.fimDeJogo())
		{
			if (analista.getMarcaDoVencedor() == jogadorA.getMarca())
			test.showMessageDialog(frmLhamavelha, "Fim de Jogo, a Lhama ganhou");
			else
				if (analista.getMarcaDoVencedor() == null )
				test.showMessageDialog(frmLhamavelha, "Deu lhama!");	
				else
					test.showMessageDialog(frmLhamavelha, "VOCÊ GANHOU MT PARABENS VEI :d");	
			
			        int dialogResult = test.showConfirmDialog(frmLhamavelha, "Desaja jogar novamente?");
					
			        frmLhamavelha.dispose();
			        if( dialogResult == JOptionPane.YES_OPTION)
					{
						
						Velha window = new Velha();
						window.frmLhamavelha.setVisible(true); 
						clip.stop();
					}
		}
		
		String soundName = "llama.wav";    
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getClassLoader().getResource(soundName));
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		
	
		clip.setMicrosecondPosition(400000 );
		clip.start();
		
		
		
	}
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Velha window = new Velha();
					window.frmLhamavelha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Velha() {
		
	 

        try {	

				tabDoJogo = new Tabuleiro()									;
				Marca X   = new Marca ('X');	
				Marca O   = new Marca ('O');
				analista  = new AnalistaSituacional(tabDoJogo)				;
				jogadorH  = new JogadorHumano(tabDoJogo,O)	;
				jogadorA  = new JogadorAutomatico(tabDoJogo,X) 				;	
		
				 boolean jogadorHumanoComeca = (int)(Math.random()*2) == 0;
			     boolean vezDojogadorHumano  = jogadorHumanoComeca;

	
			     	
			     	String soundName = "fundo.wav";    
					AudioInputStream audioInputStreamm = AudioSystem.getAudioInputStream(this.getClass().getClassLoader().getResource(soundName));
					clip = AudioSystem.getClip();
					clip.open(audioInputStreamm);
					
					clip.start();
					clip.loop(Clip.LOOP_CONTINUOUSLY); 
			     
			     
				initialize();
		
    	} catch (Exception e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
						
		
	}

	
	Tabuleiro           tabDoJogo = null;
	 JogadorHumano       jogadorH  = null;
     JogadorAutomatico   jogadorA  = null;
     AnalistaSituacional analista  = null;
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		


		
		frmLhamavelha = new JFrame();
		frmLhamavelha.getContentPane().setForeground(new Color(124, 252, 0));
		frmLhamavelha.getContentPane().setBackground(new Color(124, 252, 0));
		frmLhamavelha.setTitle("LhamaVelha");
		frmLhamavelha.setBounds(100, 100, 410, 410);
		frmLhamavelha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLhamavelha.getContentPane().setLayout(new GridLayout(3, 0, 0, 0));
		
		
		
		
		B_1_1.setDisabledIcon(null);
		B_1_1.setForeground(new Color(255, 255, 255));
		B_1_1.setBackground(new Color(154, 205, 50));
		B_1_1.setFont(new Font("Arial", Font.PLAIN, 6));
		B_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JButton Botao =  (JButton) arg0.getSource();
					try {
						ClickBotao( Botao , jogadorA, tabDoJogo );
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				
				
			}
		});
		frmLhamavelha.getContentPane().add(B_1_1);
		

		B_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JButton Botao =  (JButton) arg0.getSource();
				try {
					ClickBotao( Botao , jogadorA, tabDoJogo );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		B_1_2.setForeground(new Color(255, 255, 255));
		B_1_2.setBackground(new Color(154, 205, 50));
		B_1_2.setFont(new Font("Arial", Font.PLAIN, 6));
		frmLhamavelha.getContentPane().add(B_1_2);
		B_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JButton Botao =  (JButton) arg0.getSource();
				try {
					ClickBotao( Botao , jogadorA, tabDoJogo );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		B_1_3.setForeground(new Color(255, 255, 255));
		

		B_1_3.setBackground(new Color(154, 205, 50));
		B_1_3.setFont(new Font("Arial", Font.PLAIN, 6));
		frmLhamavelha.getContentPane().add(B_1_3);
		B_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JButton Botao =  (JButton) arg0.getSource();
				try {
					ClickBotao( Botao , jogadorA, tabDoJogo );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		B_2_1.setForeground(new Color(255, 255, 255));
		
	
		B_2_1.setBackground(new Color(154, 205, 50));
		B_2_1.setFont(new Font("Arial", Font.PLAIN, 6));
		frmLhamavelha.getContentPane().add(B_2_1);
		B_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JButton Botao =  (JButton) arg0.getSource();
				try {
					ClickBotao( Botao , jogadorA, tabDoJogo );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		B_2_2.setForeground(new Color(255, 255, 255));
		
		
		B_2_2.setBackground(new Color(154, 205, 50));
		B_2_2.setFont(new Font("Arial", Font.PLAIN, 6));
		frmLhamavelha.getContentPane().add(B_2_2);
		B_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JButton Botao =  (JButton) arg0.getSource();
				try {
					ClickBotao( Botao , jogadorA, tabDoJogo );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		B_2_3.setForeground(new Color(255, 255, 255));
		
		
		B_2_3.setBackground(new Color(154, 205, 50));
		B_2_3.setFont(new Font("Arial", Font.PLAIN, 6));
		frmLhamavelha.getContentPane().add(B_2_3);
		B_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JButton Botao =  (JButton) arg0.getSource();
				try {
					ClickBotao( Botao , jogadorA, tabDoJogo );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		B_3_1.setForeground(new Color(255, 255, 255));
		
		
		B_3_1.setBackground(new Color(154, 205, 50));
		B_3_1.setFont(new Font("Arial", Font.PLAIN, 6));
		frmLhamavelha.getContentPane().add(B_3_1);
		B_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JButton Botao =  (JButton) arg0.getSource();
				try {
					ClickBotao( Botao , jogadorA, tabDoJogo );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		B_3_2.setForeground(new Color(255, 255, 255));
		
	
		B_3_2.setBackground(new Color(154, 205, 50));
		B_3_2.setFont(new Font("Arial", Font.PLAIN, 6));
		frmLhamavelha.getContentPane().add(B_3_2);
		B_3_3.setForeground(new Color(255, 255, 255));
		
		
		B_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JButton Botao =  (JButton) arg0.getSource();
				try {
					ClickBotao( Botao , jogadorA, tabDoJogo );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		B_3_3.setBackground(new Color(154, 205, 50));
		B_3_3.setFont(new Font("Arial", Font.PLAIN, 6));
		frmLhamavelha.getContentPane().add(B_3_3);
		

	
		
	}

}
