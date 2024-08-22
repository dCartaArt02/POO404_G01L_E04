package utilidades;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Fecha_nacimiento {
    private String Fechacumple;

        private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
    private static final Map<DayOfWeek, String> DiasEspañol = new HashMap<>();
    static
    {
        DiasEspañol.put(DayOfWeek.MONDAY, "Lunes");
        DiasEspañol.put(DayOfWeek.TUESDAY, "Martes");
        DiasEspañol.put(DayOfWeek.WEDNESDAY, "Miercoles");
        DiasEspañol.put(DayOfWeek.THURSDAY, "Jueves");
        DiasEspañol.put(DayOfWeek.FRIDAY, "Viernes");
        DiasEspañol.put(DayOfWeek.SATURDAY, "Sabado");
        DiasEspañol.put(DayOfWeek.SUNDAY, "Domingo");
    }
        public long calcularEdad(String fechaNacimiento) {
            try {
                LocalDate fecha = LocalDate.parse(fechaNacimiento, formatter);
                LocalDate hoy = LocalDate.now();
                return ChronoUnit.YEARS.between(fecha, hoy);
            } catch (Exception e) {

                throw new IllegalArgumentException("Formato de fecha incorrecto. Use dd/MM/yyyy.");
            }
        }
            public int obteneranio(String fechaNacimiento)
            {
                try {
                    LocalDate fecha = LocalDate.parse(fechaNacimiento, formatter);
                    return fecha.getYear();

                } catch (Exception e)
                {
                    throw new IllegalArgumentException("Formato de fecha incorrecto. Use dd/MM/yyyy.");
                }
            }

           public String AlgoritmoZeller(String fechaNacimiento)
           {
               try {
                   LocalDate Fecha = LocalDate.parse(fechaNacimiento, formatter);
                   DayOfWeek DiaSemana = Fecha.getDayOfWeek();
                   return DiasEspañol.get(DiaSemana);
               }catch (Exception e)
               {
                   throw new IllegalArgumentException("Formato no permitido");
               }
           }

           public static void main(String[]args)
           {

           }





}