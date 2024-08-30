package sv.edu.udb.util;
import java.sql.*;
public class conexion {
    private static String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
    private static String JDBC_URL = "jdbc:mysql://localhost:3308/personabdd";
    private static String JDBC_USER = "root";
    private static String JDBC_PASS = "";
    private static Driver driver = null;

    public static synchronized Connection getConnection()
            throws SQLException {
        Connection con = null;
        if (driver == null)
            try {
                Class.forName(JDBC_Driver);
            } catch (Exception e) {
                System.out.println("Fallo al cargar el driver JDBC");
                e.printStackTrace();
            }
    return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);}
    public static void close (ResultSet rs)
    {
        try {
            if (rs != null)
            {
                rs.close();
            }
        }catch (SQLException sqle)
        {
            sqle.printStackTrace();
        }
    }
    public static void close(PreparedStatement stmt)
    {
        try {
            if(stmt != null);
            {
                stmt.close();
            }
        }catch (SQLException sqle)
        {
            sqle.printStackTrace();
        }
    }
    public static void close(Connection conn)
    {
        try
        {
            if (conn!=null)
            {
                conn.close();
            }
        }catch (SQLException sqle)
        {
            sqle.printStackTrace();
        }
    }

}



