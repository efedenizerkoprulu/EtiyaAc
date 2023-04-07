import DataAccess.StudentDao;
import Entity.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Efe", "Deniz", 1, "12564789", "Yazılım");
        Student student2 = new Student("Esma", "Kıvanç", 3, "hbhajbha", "Yazılım");
        Student student3 = new Student("Esma", "Kıvanç", 3, "hbhajbha", "Yazılım");
        StudentDao studentDao = new StudentDao();

        studentDao.CreateStudent(student1);
        studentDao.CreateStudent(student2);
        studentDao.ListStudent();


        System.out.println("------------------------------");
        studentDao.DeleteStudent(student1);
        studentDao.ListStudent();

        System.out.println("------------------------------");
        studentDao.CreateStudent(student3);
        studentDao.ListStudent();

    }
}