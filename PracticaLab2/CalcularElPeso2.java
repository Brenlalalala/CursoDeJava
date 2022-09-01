package Ejercicio9;

import javax.swing.*;

public class CalcularElPeso2 {
    public static void main(String[] args) {
    int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura en cm: "));
    String genero = JOptionPane.showInputDialog("Eres mujer u hombre?");
        if (genero.equals("mujer")) {
        JOptionPane.showMessageDialog(null, "Peso ideal: " + (altura - 120));
    }else{
        JOptionPane.showMessageDialog(null, "Peso ideal: " + (altura - 110));
    }
}
}