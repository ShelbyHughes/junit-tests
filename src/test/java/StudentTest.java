import org.junit.*;
import static org.junit.Assert.*;

public class StudentTest {
    Student emptyStudent;
    Student studentWithOne;
    Student studentWithMany;

    @Before
    public void setUp(){
        emptyStudent = new Student("Jane Doe", 1);

        studentWithOne = new Student("John Deer", 2);
        studentWithOne.addGrade(98);

        studentWithMany = new Student("Leslie Knope", 3);
        studentWithMany.addGrade(100);
        studentWithMany.addGrade(100);
        studentWithMany.addGrade(100);
        studentWithMany.addGrade(100);
    }

    @Test
    public void testIsEmpty(){
        assertTrue(emptyStudent.isEmpty());
        assertFalse(studentWithOne.isEmpty());
    }

    @Test
    public void testIfNameIsEmpty(){
        assertNotNull("Student 1's name is not null", emptyStudent.getName());
        assertNotNull("Student 2's name is not null", studentWithOne.getName());
        assertNotNull("Student 3's name is not null", studentWithMany.getName());
    }

}
