/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempetureconverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author mbrester1
 */
public class TempConvertEventListener implements ActionListener {

    private double temperature;
    private double newTemperature;

    public MainWindow window;

    public TempConvertEventListener(MainWindow window) {
        this.window = window;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent t) throws IllegalArgumentException {

        NumberFormat df = new DecimalFormat("#.##");
        TempConverterService tcs = new TempConverterService();

        if (window.getRdoFahrenheit().isSelected()) {
            
                temperature = Double.valueOf(window.getTxtInput().getText());
                window.getLblNewTemp().setText("" + df.format(tcs.convertTempFromFerienhight(temperature)));
        } else {
            try {
                temperature = Double.valueOf(window.getTxtInput().getText());
                newTemperature = temperature * 9 / 5 + 32;
                window.getLblNewTemp().setText("" + df.format(tcs.convertTempFromCelsius(temperature)));
            } catch (IllegalArgumentException e) {
                window.getLblNewTemp().setText("You Did Not Enter A Number");
                return;
            }
        }
    }

}
