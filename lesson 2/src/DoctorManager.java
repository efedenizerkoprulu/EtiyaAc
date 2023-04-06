public class DoctorManager implements IDoktorService {
    IDoctorDal _doctorDal;

    public  DoctorManager(){
        System.out.println("bost Const çalıştı");
    }
    public DoctorManager(IDoctorDal doctorDal) {
        _doctorDal = doctorDal;
    }


    @Override
    public void Add(Doctor doctor) {
        if (doctor.get_name().startsWith("K")){
            _doctorDal.Add();
        }

    }

    @Override
    public void Update(Doctor doctor) {
     _doctorDal.Update();
    }

    @Override
    public void Delete(Doctor doctor) {
        _doctorDal.Delete();

    }

    @Override
    public void Die() {
        _doctorDal.Die();

    }
}
