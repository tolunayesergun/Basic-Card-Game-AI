package Game;

import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;


public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnComp = new javax.swing.JLabel();
        ImageLogo = new javax.swing.JLabel();
        BtnPlyr = new javax.swing.JLabel();
        Gifground = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(980, 580));
        setResizable(false);
        setSize(new java.awt.Dimension(980, 580));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        BtnComp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnCompVsComp.png"))); // NOI18N
        BtnComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCompMouseClicked(evt);
            }
        });
        getContentPane().add(BtnComp);
        BtnComp.setBounds(300, 390, 380, 100);

        ImageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N
        ImageLogo.setMaximumSize(new java.awt.Dimension(1000, 736));
        ImageLogo.setMinimumSize(new java.awt.Dimension(1000, 736));
        getContentPane().add(ImageLogo);
        ImageLogo.setBounds(190, 20, 630, 210);

        BtnPlyr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btnPlayerVsComp.png"))); // NOI18N
        BtnPlyr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPlyrMouseClicked(evt);
            }
        });
        getContentPane().add(BtnPlyr);
        BtnPlyr.setBounds(300, 270, 380, 100);

        Gifground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/starting.gif"))); // NOI18N
        Gifground.setMaximumSize(new java.awt.Dimension(1200, 800));
        Gifground.setMinimumSize(new java.awt.Dimension(1200, 800));
        Gifground.setPreferredSize(new java.awt.Dimension(1200, 800));
        Gifground.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GifgroundMouseClicked(evt);
            }
        });
        getContentPane().add(Gifground);
        Gifground.setBounds(0, 0, 960, 540);
        Gifground.getAccessibleContext().setAccessibleName("btnpc");

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/background.jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1200, 800));
        Background.setMinimumSize(new java.awt.Dimension(1200, 800));
        Background.setPreferredSize(new java.awt.Dimension(1200, 800));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 960, 540);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPlyrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPlyrMouseClicked

        
      Selection st = new Selection();
      
      st.setSelectedGameType(1);
      
        
        this.setVisible(false);
        
    
    GameBoard Gb = new GameBoard();
      Gb.setVisible(true);
     


    }//GEN-LAST:event_BtnPlyrMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        BtnComp.setVisible(false);
        BtnPlyr.setVisible(false);
        ImageLogo.setVisible(false);

        gizleme(0);


    }//GEN-LAST:event_formWindowOpened

    private void GifgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GifgroundMouseClicked
                     
            
                   
                    Gifground.setVisible(false);
                    BtnComp.setVisible(true);
                    BtnPlyr.setVisible(true);
                    ImageLogo.setVisible(true);   
                
                     gizleme(1);
                     
    }//GEN-LAST:event_GifgroundMouseClicked

    private void BtnCompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCompMouseClicked


      Selection st = new Selection();
      
      st.setSelectedGameType(2);
      
        
        this.setVisible(false);
      GameBoard GB = new GameBoard();
        GB.setVisible(true);



     
    }//GEN-LAST:event_BtnCompMouseClicked

    public void gizleme(int x) {
        Timer myTimer = new Timer();
        TimerTask gorev = new TimerTask() {

            @Override
            public void run() {
if(x==1)
{
 myTimer.cancel();
 sayac = 0;
}
                sayac++;
                if (sayac == 2) {
                    myTimer.cancel();
                    Gifground.setVisible(false);
                    BtnComp.setVisible(true);
                    BtnPlyr.setVisible(true);
                    ImageLogo.setVisible(true);
                   sayac = 0;
                }
            }

        };

        myTimer.schedule(gorev, 0, 2200);

    }

    static int sayac = 0;

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BtnComp;
    private javax.swing.JLabel BtnPlyr;
    private javax.swing.JLabel Gifground;
    private javax.swing.JLabel ImageLogo;
    // End of variables declaration//GEN-END:variables
}
