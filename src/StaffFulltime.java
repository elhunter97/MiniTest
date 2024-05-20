public class StaffFulltime extends Staff {
    private double bonusMoney;
    private double fineMoney;
    private double fixedSalary;

    public StaffFulltime(double bonusMoney, double fineMoney, double fixedSalary) {
        this.bonusMoney = bonusMoney;
        this.fineMoney = fineMoney;
        this.fixedSalary = fixedSalary;
    }

    public StaffFulltime(String name, int age, String email, String phone, int id, double bonusMoney, double fineMoney, double fixedSalary) {
        super(name, age, email, phone, id);
        this.bonusMoney = bonusMoney;
        this.fineMoney = fineMoney;
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double finalSalary() {
        return fixedSalary + (bonusMoney - fineMoney);
    }
}
