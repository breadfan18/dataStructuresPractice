package bootCampMoney;


public class BootCampCalculations {

    static int rent = 2_850;
    static int monthlyExpenses_Fixed = 500;
    static int monthlyExpenses_Variable = 3000;
    int totalMonthlyExpenses = rent + monthlyExpenses_Fixed + monthlyExpenses_Variable;


    public static void main(String[] args) {

        BootCampCalculations bb = new BootCampCalculations();

        bb.calcSavingsAmountNeeded();


    }


    public void calcSavingsAmountNeeded() {
        BasePage bp = new BasePage();
        int swaroopNumberOfMonthsOut = bp.getIntFromScanner("Swaroop out for (Months): ");
        int anshuNumberOfMonthsOut = bp.getIntFromScanner("Anshu out for (Months):  ");
        int anshuMonthlySalary = bp.getIntFromScanner("Anshu Monthly Salary: ");
        int monthsAnshuMakesSalary = swaroopNumberOfMonthsOut - anshuNumberOfMonthsOut;
        int mammaBuwaMonthly = bp.getIntFromScanner("Monthly cash from MammaBuwa Account: ");

        int totalHomeExpensesForThatTime = swaroopNumberOfMonthsOut * totalMonthlyExpenses;
        int totatMammaBuwaCashForThatTime = swaroopNumberOfMonthsOut * mammaBuwaMonthly;
        int totalAnshuSalaryInThatTime = (monthsAnshuMakesSalary)*anshuMonthlySalary;
        int totalCashProceedsInThatTime = totatMammaBuwaCashForThatTime + totalAnshuSalaryInThatTime;

        String totalUsedFromSavings = bp.currencize(totalHomeExpensesForThatTime - totalCashProceedsInThatTime);

        System.out.println("We will need to use " + totalUsedFromSavings + " from our savings account");

    }

}
