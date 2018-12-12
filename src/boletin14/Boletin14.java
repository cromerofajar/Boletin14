package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class Boletin14 {

    public static void main(String[] args) {
        float tempC1,tempC2;
        ConversorTemperaturas obx=new ConversorTemperaturas();
        tempC1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la temperatura en Cº para pasar a Fharenheit"));
        tempC2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la temperatura en Cº para pasar a Reamur"));
        try{
            JOptionPane.showMessageDialog(null, obx.centigradosAFharenheit(tempC1));
            }
        catch(TemperaturaErradaExcepcion e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            }
        try{
            obx.centigradosAReamur(tempC2);
        }
        catch(TemperaturaErradaExcepcion e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
    }
    
}
