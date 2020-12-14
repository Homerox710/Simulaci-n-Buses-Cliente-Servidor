
package Clases;

import javax.swing.JLabel;

/**
 *
 * @author Elias
 */
public class Reloj extends Thread {//reloj que controlará los tiempos y el final de la ejecución del programa

    private String hora, minutos, segundos, ampm;
    private int minutes;
    private JLabel labelHora;
    private boolean fin = false;

    public Reloj(String hora, String minutos, String segundos, String ampm) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.ampm = ampm;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }

    @Override
    public String toString() {
        return hora + ":" + minutos + ":" + segundos + " " + ampm;
    }

    public Reloj() {
    }

    public JLabel getLabelHora() {
        return labelHora;
    }

    public void setLabelHora(JLabel labelHora) {
        this.labelHora = labelHora;
    }

    public boolean finDia() {

        return Integer.parseInt(hora) > 23;
    }

    @Override
    public void run() {

        while (true) {

            if ("60".equals(minutos)) {
                hora = String.valueOf(Integer.parseInt(hora) + 1);
                minutes = 0;
                minutos = String.valueOf(minutes)+"0";
                labelHora.setText(this.toString());
            }
            if ("24".equals(hora)) {
                this.ampm = "MN";
                fin = true;
                minutes = 0;
                minutos = String.valueOf(minutes)+"0";
                labelHora.setText(this.toString());
            } else {
                minutes += 2;
                if(minutes < 10){
                    minutos = "0"+String.valueOf(minutes);
                    labelHora.setText(this.toString());
                }else{
                minutos = String.valueOf(minutes);
                labelHora.setText(this.toString());}
            }
            if ("12".equals(hora)) {
                this.ampm = "PM";

            }

            try {
                Thread.sleep(200);//tiempo que dura para volver a actualizar
            } catch (InterruptedException e) {
            }
        }
    }

}
