package pl.pkopy.firstApp.models;

public class LoanForm {
    private double salary;
    private double valueOfLoan;
    private int months;
    private int monthlyExpenses;

    public LoanForm(){

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getValueOfLoan() {
        return valueOfLoan;
    }

    public void setValueOfLoan(double valueOfLoan) {
        this.valueOfLoan = valueOfLoan;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(int monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }
}
