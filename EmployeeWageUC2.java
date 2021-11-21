public class EmployeeWageUC2 {

     public static void main(String[] args) {
        //constant
         int IS_PRESENT = 1;
	 int SALARY_PER_HOUR = 20;
	//variabble
         double empCheck = Math.floor(Math.random() * 10) % 2;
	 int workingHour = 0;
	 if (empCheck == IS_PRESENT) {
		workingHour = 8;
	 }
	 double empsalary = workingHour * SALARY_PER_HOUR;
         System.out.println("Employed has earned "+ empsalary +" dollar today");
      	
	 }


}
