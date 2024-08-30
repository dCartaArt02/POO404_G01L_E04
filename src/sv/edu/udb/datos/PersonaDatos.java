package sv.edu.udb.datos;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import sv.edu.udb.util.conexion;
import sv.edu.udb.beans.PersonaBeans;
public class PersonaDatos {
    private final String SQL_INSERT
            = "INSERT INTO persona id_persona,nombre_persona,edad_persona,telefono_persona,sexo_persona,id_ocupacion,fecha_nac)VALUES(?,?,?,?,?,?,?)";
    private final String SQL_UPDATE
            = "UPDATE persona SET nombre_persona=?, edad_persona=?,telefono_persona=?, sexo_persona=?, id_ocupacion=?,telefono_persona=?, sexo_persona=?, id_ocupacion=?,";
    private final String SQL_DELETE
            = "DELETE FROM persona WHERE id_persona = ?";
    private final String SQL_SELECT
            = "SELECT p.id_persona,p.nombre_persona , p.edad_persona,p.telefono_persona ," + "p.sexo_persona, o.ocupacion, p.fecha_nac" + "FROM persona p INNER JOIN ocupaciones o ON p.id_ocupacion = o.id_ocupacion";

    public int insert(PersonaBeans personaBeans) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int rows = 0;
        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, personaBeans.getNombrePersona());
            stmt.setInt(index++, personaBeans.getEdadPersona());
            stmt.setString(index++, personaBeans.getTelefonoPersona());
            stmt.setString(index++, personaBeans.getSexoPersona());
            stmt.setInt(index++, personaBeans.getIdOcupacion());
            stmt.setString(index++, personaBeans.getFechaNacimiento());
            stmt.setInt(index, personaBeans.getIdPersona());
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados:" + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.close(stmt);
            conexion.close(conn);
        }
        return rows;

    }
    public int update(PersonaBeans personaBeans) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, personaBeans.getNombrePersona());
            stmt.setInt(index++, personaBeans.getEdadPersona());
            stmt.setString(index++, personaBeans.getTelefonoPersona());
            stmt.setString(index++, personaBeans.getSexoPersona());
            stmt.setInt(index++, personaBeans.getIdOcupacion());
            stmt.setString(index++, personaBeans.getFechaNacimiento());
            stmt.setInt(index, personaBeans.getIdPersona());
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados:" + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.close(stmt);
            conexion.close(conn);
        }
        return rows;
    }
    public int delete(int idPersona) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, idPersona);
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.close(stmt);
            conexion.close(conn);
        }
        return rows;
    }
    public DefaultTableModel selectPersona(){
        DefaultTableModel dtm = new DefaultTableModel();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            ResultSetMetaData meta = rs.getMetaData();
            int numberOfColumns = meta.getColumnCount();

            for (int i = 1; i <= numberOfColumns; i++) {
                dtm.addColumn(meta.getColumnLabel(i));
            }

            while (rs.next()) {
                Object[] fila = new Object[numberOfColumns];
                for (int i = 0; i < numberOfColumns; i++) {
                    fila[i]=rs.getObject(i+1);
                }
                dtm.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
           conexion.close(rs);
            conexion.close(stmt);
            conexion.close(conn);
        }
        return dtm;
    }
    }