package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals(job1.getId(),job2.getId(),1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
        Job job=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testJobsForEquality(){
        Job job=new Job();
        Job difJob=new Job();
        assertNotEquals(job, difJob);
    }

   @Test
    public  void testJobsNewLineToString() {
        Job job = new Job();
        assertTrue(job.toString().startsWith("\n"));
        assertTrue(job.toString().endsWith("\n"));
    }

    @Test
    public void testJobLabelFieldToString(){
        Job job=new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.toString().contains("\nID: "+job.getId()));
        assertTrue(job.toString().contains("\nName: "+job.getName()));
        assertTrue(job.toString().contains("\nEmployer: "+job.getEmployer().getValue()));
        assertTrue(job.toString().contains("\nLocation: "+job.getLocation().getValue()));
        assertTrue(job.toString().contains("\nPosition Type: "+job.getPositionType().getValue()));
        assertTrue(job.toString().contains("\nCore Competency: "+job.getCoreCompetency().getValue()));
    }
    @Test
    public void testEmptyFieldToString(){
        Job job=new Job(null, new Employer(), new Location(), new PositionType(), new CoreCompetency());
        assertTrue(job.toString().contains("\nID: "+job.getId()));
        assertTrue(job.toString().contains("\nName: "+"Data not available"));
        assertTrue(job.toString().contains("\nEmployer: "+"Data not available"));
        assertTrue(job.toString().contains("\nLocation: "+"Data not available"));
        assertTrue(job.toString().contains("\nPosition Type: "+"Data not available"));
        assertTrue(job.toString().contains("\nCore Competency: "+"Data not available"));
    }
    @Test
    public void testOnlyIDToString(){
        Job job=new Job();
        assertTrue(job.toString().contains("\nOOPS! This job does not seem to exist.\n"));

    }

}
