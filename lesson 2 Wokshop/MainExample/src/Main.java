public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.set_name("Kaya");
        doctor.set_Id(1);
        doctor.set_salary("2000");
        doctor.set_surname("Ay");
        doctor.setGander('E');

        DoctorManager manager = new DoctorManager();
      DoctorManager doctorManager = new DoctorManager(new SQLDoctorDal());
        doctorManager.Add(doctor);
    }
}