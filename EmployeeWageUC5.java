public class EmployeeWageUC5 {
	 //constant
	 static final int IS_FULLTIME_PRESENT = 1;
    static final int IS_PART_TIME =2;
    static final int SALARY_PER_HOUR = 20;
    static final int TOTAL_MONTH_DAYS =20;
    public static void main(String[] args) { 

    int empCheck =(int)(Math.floor(Math.random() * 10) % 3);
	 int empHour = 0;
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
	 double empsalary = empHour * SALARY_PER_HOUR;
	 double totalsalary = empsalary * TOTAL_MONTH_DAYS; 

         System.out.println("Employed wages for "+totalsalary+"dollar");
		
	}

}
