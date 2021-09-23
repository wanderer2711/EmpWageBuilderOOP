public class EmpWageBuilderObject {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmpWageBuilderObject (String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company =company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public static void main (String[] args){
        EmpWageBuilderObject dMart = new EmpWageBuilderObject("Dmart", 20, 2, 10);

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= dMart.maxHoursPerMonth && totalWorkingDays <= dMart.numOfWorkingDays) {
            totalWorkingDays ++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * dMart.empRatePerHour;
        System.out.println("Total Employee Wage for : " + totalEmpWage);
    }

}