package task.map;

class Emp {
    public String empId;
    public String name;
    public String phone;
    public String address;
    public String dob;
    public String doj;
    public String eMail;
    public String gender;
    public String Sal;

    public Emp(String empId, String name, String phone, String address, String dob, String doj, String eMail,
            String gender, String Sal) {
        this.empId = empId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dob = dob;
        this.doj = doj;
        this.eMail = eMail;
        this.gender = gender;
        this.Sal = Sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", doj='" + doj + '\'' +
                ", eMail='" + eMail + '\'' +
                ", gender='" + gender + '\'' +
                ", Sal='" + Sal + '\'' +
                '}';
    }
}