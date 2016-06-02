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
    private int arabic_numeral = 0;
    private String text;
    private String roman_numeral = "";
    
    //constructor
    public RomanNumberConverter(){}
    
    //setter method for the arabic number
    public void setText(String text){
	this.text = text;
    }
    
    //Processing
    public void converterArabic(){
        //Converts string to integer
        int x = Integer.parseInt(text);
        
        //Test the arabic number
        while(x>=1000){
            //If the number is higher than or equals to the amount,
            //includes the equivalent roman number to the string
            roman_numeral = roman_numeral+"M";
            //and substracts the amount from the arabic number
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
    
    public void converterRoman(){
        //Same theory as above, but it tests the string
        while(text.startsWith("M")){
            //If the string starts with a given letter(s)
            //add to the arabic number the equivalent amount
            arabic_numeral = arabic_numeral+1000;
            //and deletes the letter(s) from the beggining of the string
            //according to the number of letters
            text = text.substring(1);
        }
        while(text.startsWith("CM")){
            arabic_numeral = arabic_numeral+900;
            text = text.substring(2);
        }
        while(text.startsWith("D")){
            arabic_numeral = arabic_numeral+500;
            text = text.substring(1);
        }
        while(text.startsWith("CD")){
            arabic_numeral = arabic_numeral+400;
            text = text.substring(2);
        }
        while(text.startsWith("C")){
            arabic_numeral = arabic_numeral+100;
            text = text.substring(1);
        }
        while(text.startsWith("XC")){
            arabic_numeral = arabic_numeral+90;
            text = text.substring(2);
        }
        while(text.startsWith("L")){
            arabic_numeral = arabic_numeral+50;
            text = text.substring(1);
        }
        while(text.startsWith("XL")){
            arabic_numeral = arabic_numeral+40;
            text = text.substring(2);
        }
        while(text.startsWith("X")){
            arabic_numeral = arabic_numeral+10;
            text = text.substring(1);
        }
        while(text.startsWith("IX")){
            arabic_numeral = arabic_numeral+9;
            text = text.substring(2);
        }
        while(text.startsWith("V")){
            arabic_numeral = arabic_numeral+5;
            text = text.substring(1);
        }
        while(text.startsWith("IV")){
            arabic_numeral = arabic_numeral+4;
            text = text.substring(2);
        }
        while(text.startsWith("I")){
            arabic_numeral = arabic_numeral+1;
            text = text.substring(1);
        }
    }
    
    //getter method for retrieving computation
    public String getRomanNumeral(){
        return roman_numeral;
    }
    public int getArabicNumeral(){
        return arabic_numeral;
    }
    
    //Reset Variables
    public void reset(){
        roman_numeral = " ";
        arabic_numeral = 0;
    }

   
    public static void main(String[] args) {
        //instance for the GUI
        ConverterRomanGUI gui = new ConverterRomanGUI();
        gui.setVisible(true); //if false, the gui does not appear
    }
    
}
