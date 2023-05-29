package task.map;

public class Student {
	
	    private String stdId;
		private String stdName;
		private String address;
		private String dOB;
		private String eMail;
		private String gender;
		private String stdPhone;
		public Student(String stdId, String stdName, String stdPhone, String address, String dOB, String eMail,
			String gender) {
	    	  this.stdId = stdId;
		        this.stdName = stdName;
		        this.stdPhone = stdPhone;
		        this.address = address;
		        this.dOB = dOB;
		        this.eMail = eMail;
		        this.gender = gender;
	}
		public String toString() {
	        return "Emp{" +
	                "empId='" + stdId + '\'' +
	                ", name='" + stdName + '\'' +
	                ", phone='" + stdPhone + '\'' +
	                ", address='" + address + '\'' +
	                ", dob='" + dOB + '\'' +
	                ", eMail='" + eMail + '\'' +
	                ", gender='" + gender + '\'' +
	                '}';

	    }
	public static void main(String[] args) {
		  String stdId;
	    String stdName;
	    String stdPhone;
	    String address;
	    String dOB;
	    String eMail;
	    String gender;
	}

	 

	
}
	
	


