import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        System.out.println("text...");
      //  StudentUtils.createTable();
  //      StudentUtils.insert(new Student("abbbb", "bbbb", 15));
   //     StudentUtils.insert(new Student("eka", "gvari1", 20));

     //   StudentUtils.updateStudent(3, "Ekaterine");

        StudentUtils.getAllStudents()
                .stream()
                .forEach(System.out::println);

        System.out.println();

       // StudentUtils.deleteStudent(5);
        System.out.println();

        StudentUtils.getAllStudents()
                .stream()
                .forEach(System.out::println);



    }
}
// add framework _


//  https://codeshare.io/java1
//Host: sql7.freesqldatabase.com
//        Database name: sql7583723
//        Database user: sql7583723
//        Database password: d1LUQ8I3MD
//        Port number: 3306