
package com.mycompany.bmi;
public class Bmi {

    public static void main(String[] args) {
        Scaner alim = new Scanner (System.in);
        int berat;
        double tinggi;
        double bmi;
        


        System.out.printin ("masykkan berat badan")
        berat = alim.nextin();
        System.out.printin("masukan tinggi badan");
        tinggi = alim.nextDouble();
        tinggi/=100;
        bmi = berat/(tinggi*tinggi);
        System.out.printin("Bmi mu adalah"+ bmi);
        
       if(bmi<18.5){
           System.out.printin("kurang berat badan");
       }
       else if(bmi<24.9){
           System.out.printin("normal");
       }    
       }
       }