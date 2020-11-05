package bootCampMoney;

import java.text.NumberFormat;

public class BootCampCalculations {

    static int rent = 2_850;
    static int monthlyExpenses_Fixed = 500;
    static int monthlyExpenses_Variable = 3000;
    static final int mammaBuwaMonthly = 1500;
    static int anshuSalary = 4000;

    public static void main(String[] args) {

        calcSavingsAmountNeeded(6, false);


    }


    public static void calcSavingsAmountNeeded(int numberOfMonthsOut, boolean onlySwaroop) {
        if (!onlySwaroop) {
            anshuSalary = 0;
        }


        System.out.println("Anshu Salary: " + anshuSalary);

        int totalExpenses = numberOfMonthsOut * (rent + monthlyExpenses_Fixed + monthlyExpenses_Variable);
        System.out.println("Total Home Expenses for " + numberOfMonthsOut + " months: " + totalExpenses);
        int totalCashAvailable = numberOfMonthsOut * (anshuSalary + mammaBuwaMonthly);
        System.out.println("Total Cash Supplement " + numberOfMonthsOut + " months: " + totalCashAvailable);

        System.out.println("************************************************");

        String inDollars = NumberFormat.getCurrencyInstance().format(totalExpenses - totalCashAvailable);
        System.out.println("Total cash used from Savings: " + inDollars);

    }

}
