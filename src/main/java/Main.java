

import java.awt.EventQueue;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author gersc
 */
public class Main extends JFrame {
    
        public Main() {
            try {
                this.add( new Board());
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.pack();
            this.setResizable(false);
            this.setTitle( "CHESS" );
            this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            this.setLocationRelativeTo( null );
        }
    
        public static void main(String[] args) {
            
            EventQueue.invokeLater(() -> {
                Main main = new Main();
                main.setVisible( true );
            });
            
        }
    
}
