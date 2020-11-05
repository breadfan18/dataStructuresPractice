package bootCampMoney;

import java.text.NumberFormat;

public class BootCampCalculations {

    static int rent = 2_850;
    static int monthlyExpenses_Fixed = 500;
    static int monthlyExpenses_Variable = 3000;
    static final int mammaBuwaMonthly = 1500;
    int totalMonthlyExpenses = rent + monthlyExpenses_Fixed + monthlyExpenses_Variable;

    BasePage bp = new BasePage();

    public static void main(String[] args) {

        BootCampCalculations bb = new BootCampCalculations();

        bb.calcSavingsAmountNeeded();


    }


    public void calcSavingsAmountNeeded() {
        int swaroopNumberOfMonthsOut = bp.getIntFromScanner("Swaroop out for (Months): ");
        int anshuNumberOfMonthsOut = bp.getIntFromScanner("Anshu out for (Months):  ");

        int monthsAnshuMakesSalary = swaroopNumberOfMonthsOut - anshuNumberOfMonthsOut;
        int anshuMonthlySalary = bp.getIntFromScanner("Anshu Monthly Salary: ");







    }

}
