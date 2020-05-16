package Clases;

import java.awt.Component;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActualizadorDePosiciones extends Thread {
    JLabel sol, planeta, venus, tierra, marte, jupiter, saturno, urano, neptuno;
    JPanel sistemaSolar;
    double angulo = 180;
    double velocidadPlaneta;
    double radioPlaneta;
    static boolean parar = false;
    final int SOLX = 420, SOLY = 320;

    public ActualizadorDePosiciones(JPanel sistemaSolar, double radioPlaneta, int indice, double velocidadPlaneta) {
        this.planeta = (JLabel) sistemaSolar.getComponent(indice);
        this.radioPlaneta = radioPlaneta;
        this.velocidadPlaneta = velocidadPlaneta;
        this.sistemaSolar = sistemaSolar;
    }

    @Override
    public void run() {
        while (!parar) {
            avanzarPlaneta(planeta, radioPlaneta);
            try {
                Thread.sleep((long) (1000/velocidadPlaneta));
            } catch (InterruptedException ex) {
                Logger.getLogger(ActualizadorDePosiciones.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void avanzarPlaneta(JLabel planeta, double radio) {
        int x = (int) ((radio * (Math.cos(Math.toRadians(this.angulo)))) + SOLX);
        int y = (int) ((-radio * (Math.sin(Math.toRadians(this.angulo)))) + SOLY);
        if (radio != 274.0072991728505) {
            if (radio > 200) {
                x -= 20;
                y -= 20;
            } else {
                x -= 12;
                y -= 12;
            }
        } else {
            x -= 30;
            y -= 20;
        }
        this.angulo++;
        if (this.angulo == 360) {
            this.angulo = 0;
        }
        planeta.setLocation(x, y);
    }

    public double getRadio(JLabel planeta) {
        double x = getXActual(planeta);
        double y = getYActual(planeta);
        double radio = Math.sqrt(Math.pow(Math.abs(SOLX - x), 2)
                + Math.pow(Math.abs(SOLY - y), 2));
        return radio;
    }

    public double getXActual(JLabel planeta) {
        double x;
        x = (planeta.getX() + (planeta.getSize().getWidth() / 2));
        return x;
    }

    public double getYActual(JLabel planeta) {
        double y;
        y = (planeta.getY() + (planeta.getSize().getHeight() / 2));
        return y;
    }

    public void detener() {
        parar = true;
    }

    public void continuar() {
        parar = false;
    }
}
