package helloworldinjava;// espace de nom (namespace)
// tout est classe en java 


// javax = executable de java
// utilisation de la classe jframe 
import javax.swing.JFrame; // c# = using windows.form par exemple

public class HelloWorldInJava 
{
    
    //static = pour pouvoir l'utiliser dans cette classe uniquement, j de java et frame le cadre 
   static JFrame window;
    
   static Window fenetre;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) // point d'entrée de l'application 
    {
        
        // instance de la classe jframe
        window = new JFrame();
        
        window.setVisible(true);// pour ne pas quelle soit visible mettre sur false 
        // TODO code application logic here
        
        // dimension de la fenetre par defaut 
        window.setSize(400,300);
        
        // definie le titre de l'application dans la barre de titre 
        window.setTitle("titre de l'application");
        
        // l'application est centrer au milieu de l'ecran au demarrage  
        window.setLocationRelativeTo(null);
      
        // cette ligne de code remplace tout le reste du bloc ! grace a la classe window 
        fenetre = new Window("je suis le titre",400,300);
        
    }
    
}
