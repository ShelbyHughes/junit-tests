import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void testCreateStudent(){
        Student leslieKnope = new Student(1, "Leslie Knope");
        Student ronSwanson = null;
        assertNull(ronSwanson);
        assertNotNull(leslieKnope);
    }

    @Test
    public void testStudentFields(){
        Student benWyatt = new Student(2, "Ben Wyatt");
        assertSame(2, benWyatt.getId());
        assertSame("Ben Wyatt", benWyatt.getName());
        assertSame(0, benWyatt.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student annPerkins = new Student(3, "Ann Perkins");
        annPerkins.addGrade(100);
        assertSame(100, annPerkins.getGrades().get(0));
        annPerkins.addGrade(90);
        assertSame(90, annPerkins.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student andyDwyer = new Student(4, "Andy Dwyer");
        andyDwyer.addGrade(100);
        andyDwyer.addGrade(80);
        assertEquals(90, andyDwyer.getGradeAverage(), 0);
    }
}
