
package studentrecord;


public class StudentRecordModel 
{

  
    private int id;
    private String name;
    private int marks;

    // Constructor
    public StudentRecordModel ( int id,String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public StudentRecordModel (String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getMarks() { return marks; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setMarks(int marks) { this.marks = marks; }
}

