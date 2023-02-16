
package org.programacion.calculadora;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Operaciones {
    
    private Double numero;
    private Double numeroAux;
    private Double resultado;
    private String binario="";
    private String octal="";
    private String Hex ="";
    private String dec;
    
    
    public void setNumero(Double numero) {
        this.numero = numero;
    }
    public Double getNumeroAux() {
        return numeroAux;
    }
    public void setNumeroAux(Double numeroAux) {
        this.numeroAux = numeroAux;
    }
    public Double getResultado() {
        return resultado;
    }
    public void Procesos(String operador) {
       switch(operador){
           case "+": this.resultado=this.numero+this.numeroAux;break;
           case "-": this.resultado=this.numero-this.numeroAux;break;
           case "*": this.resultado=this.numero*this.numeroAux;break;
           case "/": this.resultado=this.numero/this.numeroAux;break;
           case "^": this.resultado = Math.pow(this.numero,this.numeroAux);break;
           case "n!":this.resultado = Double.parseDouble(String.valueOf(factorial(this.numero.intValue()))); break;
           case "%": this.resultado = (this.numero *this.numeroAux /100); break;
       }
    }
    public int factorial(int numero){
        try{
            if(numero == 0){
            return 1;
        }
            return numero * factorial(numero-1);
        }catch(Exception Ex){
            return 0;
        }
    }

    public Double getNumero() {
        return numero;
    }
    public void DecBin(double numero){
       int cociente=0,residuo=0;
       this.binario="";
       while(numero/2>=1){
           cociente=(int)numero/2;
           residuo=(int)numero%2;
           numero=cociente;
           this.binario=residuo+this.binario;
       }
        this.binario=cociente+this.binario;
    }
     
    public String getBinario(){
        return this.binario;
    }
    
    
    public void decoct(Double numero){
        this.octal = "";
        int res = 0;
        int dec = numero.intValue();
        char[] numoct = {'0','1','2','3','4','5','6','7'};
        do{
           res = dec %8;
           char temp = numoct[res];
           this.octal = temp + this.octal;
           dec = dec/8;
        }while(dec >0);
    }
    
    public String getOctal(){
        return this.octal;
    }
    public void DecHex(Double numero){
        this.Hex = "";
        char[] caracteres = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int res = 0,temp = numero.intValue();
        while(temp>0){
            res = temp % 16;
            char c = caracteres[res];
            temp = temp/16;
            this.Hex =c + this.Hex;
        }
    }
    
    public String getHex(){
        return this.Hex;
    }
    
    public boolean esBinario(String num) {
        if(num == null){
                return false;
            }
        try{
            for (int i = 0; i < num.length(); i++) {
                if (num.charAt(i) != '0' && num.charAt(i) != '1') {
                    return false;
                }
            }
            return true;    
        }catch(Exception Ex){
            return false;
        }
}

    
    public boolean esOctal(String numero) {
    try{
        if(numero == null){
            return false;
        }
        if(this.esBinario(numero)){
            return false;
        }
        Double numeros = Double.parseDouble(numero);
        int octal = numeros.intValue();
        String octalComoCadena = String.valueOf(octal);
        String caracteresOctales = "01234567";
        for (int i = 0; i < octalComoCadena.length(); i++) {
            char caracter = octalComoCadena.charAt(i);
            if (caracteresOctales.indexOf(caracter) == -1) {
                return false;
            }
        }
        return true;
    }catch(Exception Ex){
        return false;
    }
}
    
    public  boolean esHexa(String hexadecimal) {
        if(hexadecimal == null){
            return false;
        }
        if(this.esBinario(hexadecimal)){
        return false;
        }
        if(this.esOctal(hexadecimal)){
            return false;
        }
        if(this.esDec(hexadecimal)){
            return false;
        }
        String caracteresHexadecimales = "0123456789ABCDEF";
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = hexadecimal.charAt(i);
            if (caracteresHexadecimales.indexOf(caracter) == -1) {
                return false;
            }
        }
    
    return true;
}
    public boolean esDec(String num){
        if(num == null){
            return false;
        }
        try{
            double numeros = Double.parseDouble(num);
        }catch(Exception Ex){
            return false;
        }
        if(this.esOctal(num)){
            return false;
        }
        if(this.esBinario(num)){
            return false;
        }
        return true;
    }
 
    
    public void bindec(String numero){
        int x=0,y=numero.length()-1;
        this.resultado=0.0;
        while(x<=numero.length()-1){
            char bit=numero.charAt(y);
            if(bit=='1'){
               this.resultado+=Math.pow(2, x);
            }
            x++;
            y--;
        }
    }
    
    public void octDec(String numeros) {
    this.dec ="";
    Double numero = Double.parseDouble(numeros);
    int decimal = 0;
    int potencia = 0;
    int octal = numero.intValue();
    while (true) {
        if (octal == 0) {
            break;
        } else {
            int temp = octal % 10;
            decimal += temp * Math.pow(8, potencia);
            octal = octal / 10;
            potencia++;
        }
    }
    this.dec = String.valueOf(decimal);
}
    public void hexDec(String nume) {
    this.dec = "";
    String hexadecimal = nume;
    String caracteresHexadecimales = "0123456789ABCDEF";
    hexadecimal = hexadecimal.toUpperCase();
    int decimal = 0;
    for (int i = 0; i < hexadecimal.length(); i++) {
        char caracter = hexadecimal.charAt(i);
        int posicionEnCaracteres = caracteresHexadecimales.indexOf(caracter);
        decimal = 16 * decimal + posicionEnCaracteres;
    }
    this.dec = String.valueOf(decimal);
}
    
    public String getDec(){
        return this.dec;
    }
    
    public int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }
}
