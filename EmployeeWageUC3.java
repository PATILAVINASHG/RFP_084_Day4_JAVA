public class EmployeeWageUC3 {

     public static void main(String[] args) {
        //constant
    int IS_FULLTIME_PRESENT = 1;
	 int IS_PART_TIME =2;
	 int SALARY_PER_HOUR = 20;
	//variabble
    double empCheck = Math.floor(Math.random() * 10) % 3;
	 int empHour = 0;
	 if (empCheck == IS_FULLTIME_PRESENT) {
		empHour = 8;
	  }
	 else if (empCheck == IS_PART_TIME) {
		empHour = 4;
	  }
	  else {
			empHour = 0;
		}
	 double empsalary = empHour * SALARY_PER_HOUR;
         System.out.println("Employed wages"+empsalary+"dollar");
	 }


}
