
package helloworldinjava;

import javax.swing.JFrame;

// window qui herite de la classe 
public class Window extends JFrame
{
    
    public Window(String _title,int _width,int _height)
    {
        
        this.setTitle(_title);
        
        this.setSize(_width,_height);
        
        this.setVisible(true);
        
    }
    
}
