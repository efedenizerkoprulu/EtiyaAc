import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<Student> students = new ArrayList<Student>();

    public void CreateStudent(Student student) {
        if (ControlNationalityId(student.getNationalityId(), student.getStudentNo())) {
            students.add(student);
        } else {
            System.out.println("Böyle bir öğrenci var.");
        }

    }

    public void ListStudent() {

        for (Student student : students) {
            System.out.println("Öğrenci adı: " + student.getFirstName() + " Öğrenci Soyadı: " + student.getLastName() + " Öğrenci No " + student.getStudentNo() + " Öğrenci Kimlik No: " + student.getNationalityId() + " Öğrenci Grubu: " + student.getGroup());
        }
    }

    public void DeleteStudent(Student student) {
        students.remove(student);
    }

    public boolean ControlNationalityId(String id, int studentNo) {
        for (Student student1 : students) {
            if (student1.getNationalityId() == id && student1.getStudentNo() == studentNo) {
                return false;
            }

        }
        return true;
    }
}
