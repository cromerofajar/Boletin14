package boletin14;

import javax.swing.JOptionPane;

/**
 *
 * @author cromerofajar
 */
public class ConversorTemperaturas {
    private static float temp=80;
    float tempF, tempR;
    
    public float centigradosAFharenheit(float tempC)throws TemperaturaErradaExcepcion{
        if(tempC<temp){
            throw new TemperaturaErradaExcepcion("La temperatura para pasar a Fharenheit no puede ser superior a 80º");
        }
        else{
        tempF=9f/5f*tempC+32.4f;
        return tempF;
        }
    }
    public void centigradosAReamur(float tempC)throws TemperaturaErradaExcepcion{
        if(tempC<temp){
            throw new TemperaturaErradaExcepcion("La temperatura para pasar a Reamur no puede ser superior a 80º");
        }
        else{
            tempR=(4f/5f)*tempC;
            JOptionPane.showMessageDialog(null,"La temperatura en Reamur es: "+tempR);
        }
        
    }

}
