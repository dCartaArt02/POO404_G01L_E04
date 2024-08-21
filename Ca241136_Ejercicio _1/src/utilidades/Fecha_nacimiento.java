package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Fecha_nacimiento {
    private String Fechacumple;

        private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

}