/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        
        double rs = converterStringParaDouble(res);
        
        if ((rs > 18.7) && (rs < 23.7)) {
            
            return "Parabéns! Dá pra não morrer.";
            
        } else {
            
            return "Só lhe resta mais algumas horas.";
            
        }
    }
    
    private double converterStringParaDouble(String valorString) {
        // Substitui todas as vírgulas por pontos
        valorString = valorString.replace(',', '.');
        // Converte a string para double
        return Double.parseDouble(valorString);
    }
     
}
