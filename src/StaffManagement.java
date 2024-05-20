import javax.swing.*;
import java.util.Scanner;

public class StaffManagement {
    private static Staff[] staffList;
    private static int amountStaff = 0;

    public StaffManagement(int amount) {
        staffList = new Staff[amount];
    }

    public void addStaff(Staff staffs) {
        if (amountStaff < staffList.length) {
            staffList[amountStaff] = staffs;
            amountStaff++;
        }else {
            System.out.println("List is full. Can't add new staff");
        }
    }

    public static double averageSalary(){
        double sumSalary = 0;
        for (int i = 0; i < amountStaff; i++) {
            sumSalary+= staffList[i].finalSalary();
        }
        return sumSalary/amountStaff;
    }

    public static StaffFulltime[] salaryBelowAvr(){
        double aveSalary = averageSalary();
        StaffFulltime[] ftLowSalary = new StaffFulltime[amountStaff];
        int count = 0;
        for (int i = 0; i < amountStaff; i++) {
            if (staffList[i] instanceof StaffFulltime &&staffList[i].finalSalary() < aveSalary ) {
                ftLowSalary[count] = (StaffFulltime) staffList[i];
                count++;
            }
        }
        return ftLowSalary;
    }


    public static double sumSalaryParttime(){
        double sumSalaryParttime = 0;
        for (int i = 0; i < amountStaff; i++) {
            if(staffList[i] instanceof StaffParttime){
                sumSalaryParttime += staffList[i].finalSalary();
            }
        }
        return sumSalaryParttime;
    }

    public static StaffFulltime[] sortFulltimebySalary(){
        StaffFulltime[] fulltimeList = new StaffFulltime[amountStaff];
        int count = 0;
        for (int i = 0; i < amountStaff; i++) {
            if(staffList[i] instanceof StaffFulltime){
                fulltimeList[count] = (StaffFulltime) staffList[i];
                count++;
            }
        }
        for (int i = 0; i < count-1; i++) {
            for (int j = i+1; j < count ; j++) {
                if(fulltimeList[i].finalSalary() > fulltimeList[j].finalSalary()){
                    StaffFulltime temp = fulltimeList[i];
                    fulltimeList[i] = fulltimeList[j];
                    fulltimeList[j] = temp;
                }
            }
        }
        return fulltimeList;
    }



}
