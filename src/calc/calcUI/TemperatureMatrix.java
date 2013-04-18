/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calc.calcUI;

/**
 *
 * @author alex
 */
public class TemperatureMatrix {   
    final static double TempCff [][] = { 
 // Conversion Factor,Celsius,Fahrenheit,Kelvin,Rankine,Réaumur
/*Celsius,*/    {1,   0.555555555555556,1,  0.555555555555556,1.25},
/*Fahrenheit,*/ {1.8, 1,                1.8,1,                2.25},
/*Kelvin,*/     {1,   0.555555555555556,1,  0.555555555555556,1.25},
/*Rankine,*/    {1.8, 1,                1.8,1,                2.25},
/*Réaumur,*/    {0.8, 0.444444444444444,0.8,0.444444444444444,1}
}; 
}