public class StaffParttime extends Staff {
    private int workHours;

    public StaffParttime(int workHours) {
        this.workHours = workHours;
    }

    public StaffParttime(String name, int age, String email, String phone, int id, int workHours) {
        super(name, age, email, phone, id);
        this.workHours = workHours;
    }

    @Override
    public double finalSalary() {
        return 100000*workHours;
    }
}
