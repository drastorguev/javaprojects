import javax.swing.*;

class helloComponent extends JComponent {
    public void paintComponent( java.awt.Graphics g ) {
        g.drawString( "Hello, Java! its been a long", 125, 95 );
    }
}
