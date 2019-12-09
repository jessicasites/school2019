
public class EmployeesMain {
    	    public static void main(String[] args) {
    	    	Janitor jan1 = new Janitor(); 
    	        HarvardLawyer hav1 = new HarvardLawyer();  
    	        
    	        System.out.println("Janitor: ");
    	        System.out.println(jan1.getHours());
    			System.out.println(jan1.getSalary());
    			System.out.println(jan1.getVacationDays());
    			System.out.println();
    			System.out.println("Harvard Lawyer: ");
    			System.out.println(hav1.getSalary());
    			System.out.println(hav1.getVacationDays());
    			System.out.println(hav1.getVacationForm());
    			
    			
    	    }
}
    	   