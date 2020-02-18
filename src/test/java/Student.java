import java.util.ArrayList;

public class Student {
   private long id;
   private String name;
   private ArrayList<Integer> grades;

    public Student(String name, long id){
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<Integer>();
    }

    public boolean isEmpty(){
        return grades.size() == 0;
    }

    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
       return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
       grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

}
