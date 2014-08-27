package org.knittingpatterndesigner.incubator.occlusion.backend;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TaskTest {

    @Test
    public void testCanConstructTask() {

        Task task = new Task("Just a test");
        assertEquals("Wrong text stored", "Just a test", task.getOriginalLine());
    }

    @Test
    public void testMatchingContext(){

        Task task = new Task("@Home just a test");
        assertTrue(task.isContext("@Home"));
    }

    @Test
    public void testNonMatchingContext(){
        Task task = new Task("@Home just a test");
        assertFalse(task.isContext("@Work"));
    }
}