package supermarket;
/**
 *
 * @author haris
 */
public class SuperMarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Loading l = new Loading();
        l.setVisible(true);
        try {
        for(int i=0 ; i<=100;i++){
        Thread.sleep(40);
        l.load.setText(Integer.toString(i)+"%");
        Login log = new Login();
        if (i==100)
        {
        l.dispose();
        log.show();
        
        }
            }
        } 
        catch (Exception e){
        
        }
    }
    
}
