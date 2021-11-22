public class EmployeeWageUC6 {
         //constant
    static final int IS_FULLTIME_PRESENT = 1;
    static final int IS_PART_TIME =2;
    static final int SALARY_PER_HOUR = 20;
    static final int NUM_OF_WKR_DAYS= 20;
    static final int MAX_HRS_IN_MONTH= 100;
    public static void main(String[] args) {
        //variabble
        int empHour = 0, totalemphrs = 0, totalworkingdays = 0;
         while (totalemphrs <= MAX_HRS_IN_MONTH && totalworkingdays < NUM_OF_WKR_DAYS) {
		totalworkingdays++;
         int empCheck =(int)(Math.floor(Math.random() * 10) % 3);
	
         switch (empCheck) {
                case IS_FULLTIME_PRESENT :
                        empHour = 8;
                break;
                case IS_PART_TIME :
                        empHour = 4;
                break;
                default :
                        empHour =0;
                break;
                }
	totalemphrs += empHour;
	System.out.println("day#; " + totalworkingdays + "Emp Hr: " +empHour);
	}
	System.out.println("TOTAL EMP HOUR: " + totalemphrs);
   int totalEmpWage = totalemphrs * SALARY_PER_HOUR;
     System.out.println("total Employed wages: " +totalEmpWage);
   }

}
