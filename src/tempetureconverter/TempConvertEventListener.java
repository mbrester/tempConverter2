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
import javax.swing.JOptionPane;

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
            try {
                
                window.getLblNewTemp().setText("" + df.format(tcs.convertTempFromFerienhight(Double.valueOf(window.getTxtInput().getText()))));
            } catch(Exception e){
                 JOptionPane.showMessageDialog(window, "You Did Not Enter A Number.");
                 return;
            }
        } else {
            try {
               
                window.getLblNewTemp().setText("" + df.format(tcs.convertTempFromCelsius(Double.valueOf(window.getTxtInput().getText()))));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(window, "You Did Not Enter A Number.");
                return;
            }
        }
    }

}
