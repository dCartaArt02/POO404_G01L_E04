package guia3;
import java.text.DecimalFormat;

    public class Tiempo1 extends Object{

        private int hora;
        private int minuto;
        private int segundo;

        public Tiempo1() {
            establecerHora(0, 0, 0);
        }

        public void establecerHora(int h, int m, int s) {
            int hora = ((h >= 0 && h < 24) ? h : 0);
            int minuto = ((m >= 0 && m < 60) ? m : 0);
            int segundo = ((s >= 0 && s < 60) ? s : 0);
        }

        public String aStringUniversal() {
            DecimalFormat dosDigitos = new DecimalFormat("00");
            return dosDigitos.format(hora)+":"+dosDigitos.format(minuto)+":"+dosDigitos.format(segundo);
        }

        public String aStringEstandar()
        {
            DecimalFormat dosDigitos = new DecimalFormat("00");
            return ( (hora == 12 || hora == 0) ? 12 : hora % 12 ) + ":" +dosDigitos.format( minuto ) + ":" + dosDigitos.format( segundo ) + ( hora <12 ? "AM" : "PM" );
        }
    }//main

