package task.map;
import java.util.HashSet;
import java.util.Set;
class MapSet
{
public static void main(String[] args) {

    Set<Set_UD> students = new HashSet();


    students.add(new Set_UD(1, "John Doe", "123-456-7890", "123 Main Street", "1990-01-01", "john.doe@email.com", "Male"));
    students.add(new Set_UD(2, "Jane Doe", "555-555-5555", "456 Elm Street", "1991-02-02", "jane.doe@email.com", "Female"));
    students.add(new Set_UD(3, "Peter Smith", "987-654-3210", "789 Oak Street", "1992-03-03", "peter.smith@email.com", "Male"));
    students.add(new Set_UD(4, "Sarah Jones", "321-098-7654", "101 Pine Street", "1993-04-04", "sarah.jones@email.com", "Female"));
    students.add(new Set_UD(5, "David Brown", "765-432-1098", "202 Maple Street", "1994-05-05", "david.brown@email.com", "Male"));
    students.add(new Set_UD(6, "Emily White", "109-876-5432", "303 Elm Street", "1995-06-06", "emily.white@email.com", "Female"));
    students.add(new Set_UD(7, "Michael Green", "543-210-9876", "404 Oak Street", "1996-07-07", "michael.green@email.com", "Male"));
    students.add(new Set_UD(8, "Laura Black", "987-654-3210", "505 Pine Street", "1997-08-08", "laura.black@email.com", "Female"));
    students.add(new Set_UD(9, "Ryan Blue", "321-098-7654", "606 Maple Street", "1998-09-09", "ryan.blue@email.com", "Male"));


    for (Set_UD s : students) {
        System.out.println(s);
    }
}
}