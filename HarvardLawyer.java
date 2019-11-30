//Jessica Sites, 11/30/19 
//Practice it Problem, Exercise 9.3: HarvardLawyer
public class HarvardLawyer extends Lawyer {

	public double getSalary() {
		return super.getSalary() * 1.2;
	}

	public int getVacationDays() {
		return super.getVacationDays() + 3;
	}

	public String getVacationForm() {
		String form = super.getVacationForm();
		return form + form + form + form;
	}
}
