public abstract class Staff {
    private int id;
    private String name;
    private int age;
    private String phone;
    private String email;

    public Staff() {
    }

    public Staff(String name, int age, String email, String phone, int id) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double finalSalary();
}
