import com.mysql.cj.x.protobuf.MysqlxCrud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentUtils {
    private StudentUtils(){

    }

    public static void createTable() throws SQLException, RuntimeException {
       String createSql = "CREATE TABLE STUDENTS_TB" +
        "(ID INTEGER not NULL AUTO_INCREMENT, " +
                " First_Name VARCHAR(255), " +
                " Last_Name VARCHAR(255), " +
                " BIRTH_YEAR INTEGER NOT NULL, " +
                " PRIMARY KEY ( ID ))";


        JDBCUtil.getStatement().executeUpdate(createSql);

        System.out.println("Create Table in given database");
    }

    public static void insert(Student student) throws SQLException {
        String insertSQl = "INSERT INTO STUDENTS_TB(First_Name, Last_Name, BIRTH_YEAR) VALUES( " +
                "'"+student.getFirstname() + "', "+
                "'"+student.getLastname() + "', "+
                "'"+student.getBirtYear() + "') ";

        JDBCUtil.getStatement().executeUpdate(insertSQl);

        System.out.println("insert values in Table");

    }

    public static List<Student> getAllStudents() throws SQLException {
        String selectStu = "SELECT * FROM STUDENTS_TB";
        List<Student> students = new ArrayList<>();

        ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectStu);


        while(resultSet.next()){
            students.add(new Student(
                    resultSet.getLong("ID"),
                    resultSet.getString("First_Name"),
                    resultSet.getString("Last_Name"),
                    resultSet.getInt("BIRTH_YEAR")
            ));
        }

        return  students;
    }

    public static void updateStudent(long id, String newFirstName) throws SQLException {
        String updateSql = "UPDATE STUDENTS_TB SET FIRST_NAME =' "+ newFirstName+"' WHERE ID = "+id;

        JDBCUtil.getStatement().executeUpdate(updateSql);
        System.out.println("UPDATE Successfully");
    }


    // delete



    public static void  deleteStudent(long id) throws SQLException {
        String deleteStudent = "DELETE FROM STUDENTS_TB WHERE ID = "+id;

        JDBCUtil.getStatement().executeUpdate(deleteStudent);
        System.out.println("delete Successfully");
    }


    public static void deletAll(){
        String deleteAll = "Delete from STUDENTS_TB";

    }


}
