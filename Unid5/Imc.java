package unid5ativ;

import javax.swing.JOptionPane;
import java.text.DecimalFormat; 

/**
 *
 * @author guilherme
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String readMassa, readAltura, resImc;
        String classification = "";
        Double imc, massa, altura;
        
        readMassa = JOptionPane.showInputDialog("Peso(kg): ");
        massa = Double.parseDouble(readMassa);
        readAltura = JOptionPane.showInputDialog("Altura(cm): ");
        altura = Double.parseDouble(readAltura);

        imc = massa / (Math.pow(altura/100,2));
        DecimalFormat df = new DecimalFormat("0.00");
        resImc = df.format(imc);

        if(imc < 16){
           classification = "Magreza Grave"; 
        }else if((imc >= 16) && (imc < 17)){
             classification = "Magreza Moderada"; 
        }else if((imc >= 17) && (imc < 18.5)){
             classification = "Magreza Leve"; 
        }else if((imc >= 18.5) && (imc < 25)){
            classification = "Saudável"; 
        }else if((imc >= 25) && (imc < 30)){
             classification = "Sobrepeso"; 
        }else if((imc >= 30) && (imc < 35)){
             classification = "Obesidade Grau I"; 
        }else if((imc >= 35) && (imc < 40)){
            classification = "Obesidade Grau II"; 
        }else if(imc > 40){
            classification = "Obesidade Grau III"; 
        }
        
        JOptionPane.showMessageDialog(null, "IMC: " + resImc + ". Classificação: " + classification,"IMC" ,JOptionPane.INFORMATION_MESSAGE);
    }
  
}
