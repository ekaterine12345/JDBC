import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtil {
    //
    private static final String Db_URL="jdbc:mysql://sql7.freesqldatabase.com:3306/sql7583723";
    private static final String Db_USER="sql7583723";
    private static final String Db_PASSWORD="d1LUQ8I3MD";
    private static Connection connection;
    private static Statement statement;
    public JDBCUtil() {
    }

    static {
        try {
            connection = DriverManager.getConnection(Db_URL, Db_USER, Db_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static Statement getStatement(){
        if (statement == null){
            try{
                statement = connection.createStatement();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return statement;
    }


}
