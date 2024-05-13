
package imc;

import java.text.DecimalFormat;

/**
 *
 * @author souza
 */

public class Calculo {
    
    public String calcularIMC(float altura, float peso) {
        
        float res = peso / (altura * altura);
        
        return formatar(res);
        
    }
    
    private String formatar(float imc) {
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        return df.format(imc);
        
    }
    
    public String mensagem(String res) {
        
        float rs = converterStringParaFloat(res);
        
        if ((rs > 18.7) && (rs < 23.7)) {
            
            return "Tá suave.";
            
        } else if (rs > 23.7) {
            
            return "Você está acima do peso.";
            
        } else {
            
            return "Você está abaixo do peso.";
            
        }
    }
    
    // CONVERTE UM VALOR STRING PARA FLOAT E TAMBÉM TROCA A VÍRGULA POR PONTO
    public float converterStringParaFloat(String valorString) {
        valorString = valorString.replace(',', '.');
        return Float.parseFloat(valorString);
    }
    
}
