/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumberconverter;

/**
 * Roman Number Converter converts Roman Number to Decimals.
 * @studentNumber x14127733
 * @author Talita Silva Lima
 * @date 01/06/2016
 */
public class RomanNumberConverter {

    /**
     * @param args the command line arguments
     */
    //instance variables
    private int x;
    private String roman_numeral = "";
    
    //constructor
    public RomanNumberConverter(){}
    
    //setter method for the arabic number
    public void setX(int x){
	this.x = x;
        System.out.println(x);
    }
    
    //Processing
    public void converterArabic(){
        while(x>=1000){
            roman_numeral = roman_numeral+"M";
            x = x-1000;
        }
        while(x>=900){
            roman_numeral = roman_numeral+"CM";
            x = x-900;
        }
        while(x>=500){
            roman_numeral = roman_numeral+"D";
            x=x-500;
        }
        while(x>=400){
            roman_numeral = roman_numeral+"CD";
            x=x-400;
        }
        while(x>=100){
            roman_numeral = roman_numeral+"C";
            x=x-100;
        }
        while(x>=90){
            roman_numeral = roman_numeral+"XC";
            x=x-90;
        }
        while(x>=50){
            roman_numeral = roman_numeral+"L";
            x=x-50;
        }
        while(x>=40){
            roman_numeral = roman_numeral+"XL";
            x=x-40;
        }
        while(x>=10){
            roman_numeral = roman_numeral+"X";
            x=x-10;
        }
        while(x>=9){
            roman_numeral = roman_numeral+"IX";
            x=x-9;
        }
        while(x>=5){
            roman_numeral = roman_numeral+"V";
            x=x-5;
        }
        while(x>=4){
            roman_numeral = roman_numeral+"IV";
            x=x-4;
        }
        while(x>=1){
            roman_numeral = roman_numeral+"I";
            x=x-1;
        }
    }
    
    //getter method for retrieving computation
    public String getRomanNumeral(){
        return roman_numeral;
    }
   
    public static void main(String[] args) {
        //instance for the GUI
        ConverterRomanGUI gui = new ConverterRomanGUI();
        gui.setVisible(true); //if false, the gui does not appear
    }
    
}
