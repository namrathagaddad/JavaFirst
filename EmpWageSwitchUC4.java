public class EmpWageSwitchUC4 {

  // Constants
       int IS_PART_TIME = 1;
       int IS_FULL_TIME = 2;
       int EMP_RATE_PER_HOUR = 20;

public static void main (String[] args) {

       //variables
       int empHrs = 0;
       int empWage = 0;

       // Computation

       double empCheck = Math.floor(Math.random( ) * 10) % 3;
       switch ((int)empCheck) {
        case IS_FULL_TIME:
             empHrs= 8;
            break;
       case IS_PART_TIME:
              empHrs= 4;
               break;
            default:
                empHrs=0;
}
             empWage = empHrs * EMP_RATE_PER_HOUR;
System.out.println("Emp Wage: " + empWage);

                }
}

