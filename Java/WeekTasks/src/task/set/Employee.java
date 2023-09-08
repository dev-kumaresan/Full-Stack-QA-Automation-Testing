package task.set;
public class Employee {
    private int empId;
    private String name;
    private String phone;
    private String address;
    private String dob;
    private String doj;
    private String email;
    private String gender;
    private double salary;

    public Employee(int empId, String name, String phone, String address, String dob, String doj, String email, String gender, double salary) {
        this.empId = empId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dob = dob;
        this.doj = doj;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", phone=" + phone + ", address=" + address + ", dob="
				+ dob + ", doj=" + doj + ", email=" + email + ", gender=" + gender + ", salary=" + salary + "]";
	}

   
}