/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.text.DecimalFormat;

/**
 *
 * @author Kiq3712
 */

public class Calculo {
    

    // CALCULA O VALOR DE RETORNO PARA O USUARIO
    public String calcularIMC(float altura, float peso) {
        
        float res = peso / (altura * altura);
        
        return formatar(res);
        
    }
    

    // FORMATA O VALOR DE RETORNO PARA O USUARIO
    private String formatar(float imc) {
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        return df.format(imc);
        
    }
    

    // RECEBE O VALOR DE RETORNO PARA VER QUAL MENSAGEM DEVE SER IMPRESSA
    public String mensagem(String res) {
        
        double rs = converterStringParaDouble(res);
        
        if ((rs < 18.5){
            
            return "Você está abaixo do peso.";

        } else if (rs >= 18.5 && rs < 25) {

            return "seu peso está normal.";

        } else if ( rs >= 25 && rs < 30) {

            return "Você está com sobrepeso.";

        } else {

            return "Você está com obesidade.";

        }

    }
    

    // 
    private double converterStringParaDouble(String valorString) {
        // Substitui todas as vírgulas por pontos
        valorString = valorString.replace(',', '.');
        // Converte a string para double
        return Double.parseDouble(valorString);
    }
     
}
