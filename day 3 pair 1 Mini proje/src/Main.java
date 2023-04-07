public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Efe", "Deniz", 1, "12564789", "Yazılım");
        Student student2 = new Student("Esma", "Kıvanç", 3, "hbhajbha", "Yazılım");
        Student student3 = new Student("Esma", "Kıvanç", 3, "hbhajbha", "Yazılım");
        StudentManager studentManager = new StudentManager();


        studentManager.CreateStudent(student1);
        studentManager.CreateStudent(student2);
        studentManager.ListStudent();


        System.out.println("------------------------------");
        studentManager.DeleteStudent(student1);
        studentManager.ListStudent();

        System.out.println("------------------------------");
        studentManager.CreateStudent(student3);
        studentManager.ListStudent();


    }
}