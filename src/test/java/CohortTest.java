import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student lizLemon = new Student(1, "Liz Lemon");
        lizLemon.addGrade(90);

        Student tracyMorgan = new Student(2, "Tracy Morgan");
        tracyMorgan.addGrade(100);
        tracyMorgan.addGrade(100);
        tracyMorgan.addGrade(100);

        cohortWithOne.addStudent(lizLemon);
        cohortWithMany.addStudent(lizLemon);
        cohortWithMany.addStudent(tracyMorgan);
    }

    @Test
    public void testAddStudentAndGetStudentsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
    }

    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
    }

}