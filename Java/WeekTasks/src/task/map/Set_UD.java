package task.map;
class Set_UD{
private int id;
private String name;
private String phone;
private String address;
private String dob;
private String email;
private String gender;

public Set_UD(int id, String name, String phone, String address, String dob, String email, String gender) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.address = address;
    this.dob = dob;
    this.email = email;
    this.gender = gender;
}


public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", phone='" + phone + '\'' +
            ", address='" + address + '\'' +
            ", dob='" + dob + '\'' +
            ", email='" + email + '\'' +
            ", gender='" + gender + '\'' +
            '}';
}
}