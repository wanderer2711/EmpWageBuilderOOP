public class EmpWageBuilderObject {


    public static void main (String[] args) {
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int TOTAL_WORKING_DAYS = 20;

        int empHrs = 0;
        int empWage = 0, totalEmpWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        for (int day = 0; day < TOTAL_WORKING_DAYS; day++) {
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
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        empWage = empHrs * EMP_RATE_PER_HOUR * TOTAL_WORKING_DAYS;
        System.out.println("Total Employee Wage: " + totalEmpWage);
    }
}