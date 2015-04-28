/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempetureconverter;

/**
 *
 * @author mbrester1
 */
public class TempConverterService {
    
    
    public double convertTempFromFerienhight(double temp){
        return ((temp - 32) * 5) / 9;
    }
    public double convertTempFromCelsius(double temp){
        return ((temp * 9 / 5) + 32);
    }
}
