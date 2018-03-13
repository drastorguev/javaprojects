import javax.swing.*;

public class HelloWorld4 {
    public static void main( String[] args ) {
        JFrame frame = new JFrame( "Hello, Java!" );
        frame.add( new helloComponent() );
        frame.setSize( 300, 300 );
        frame.setVisible( true );
    }
}