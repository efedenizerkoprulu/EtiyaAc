public class SQLDoctorDal implements IDoctorDal, IRepository {
    @Override
    public void Die() {
        System.out.println("You dead");
    }

    @Override
    public void Add() {
        System.out.println("SQL ile eklendi");
    }

    @Override
    public void Delete() {
        System.out.println("SQL ile silindi");
    }

    @Override
    public void Update() {
        System.out.println("SQL ile Güncellendi");

    }
}
