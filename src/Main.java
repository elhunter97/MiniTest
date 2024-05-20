public class Main {
    public static void main(String[] args) {
        StaffManagement manage = new StaffManagement(10);
        manage.addStaff(new StaffFulltime("Han Bao Ngoc",27,"hbn@gmail.com","0921312435",1,100000,20000,500000));
        manage.addStaff(new StaffFulltime("Tran Khanh Linh",27,"tkl@gmail.com","0921344331",2,50000,140000,600000));
        manage.addStaff(new StaffParttime("Nguyen Van Khanh",35,"nk@gmail.com","092131789",3,8));
        manage.addStaff(new StaffParttime("Tran Trung Quan",20,"ttq@gmail.com","092137893",4,7));

        System.out.println("Averager Salary: "+ StaffManagement.averageSalary());

        StaffFulltime[] ftLowSalary = StaffManagement.salaryBelowAvr();
        System.out.println("List staff have salary smaller than Avr: ");
        for(StaffFulltime staff : ftLowSalary) {
            if(staff!=null){
                System.out.println(staff.getName()+" - "+staff.finalSalary());
            }
        }

        System.out.println("Sum salary of staff partime: "+StaffManagement.sumSalaryParttime());

        StaffFulltime[] sortStaff = StaffManagement.sortFulltimebySalary();
        for(StaffFulltime staff : sortStaff) {
            if(staff!=null){
                System.out.println(staff.getName()+" - "+staff.finalSalary());
            }
        }

    }
}
