
import javax.swing.JOptionPane;
class areaRectangle{
  public static  void main(String args[]){
    String L =JOptionPane.showInputDialog("Enter the length");
    double l=Double.parseDouble(L);
    
    String W=JOptionPane.showInputDialog("Enter the Width");
    double w =Double.parseDouble(W);
    
    double a =(l*w);    
    
   JOptionPane.showMessageDialog(null,"The area is"+a);
    
     
     
  }
}