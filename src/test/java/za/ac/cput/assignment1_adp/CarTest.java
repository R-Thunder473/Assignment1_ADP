/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment1_adp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Mogammad Faeedh Daniels
 * @studentNumber 219174288
 */
public class CarTest {
    
    public CarTest() {
    }
    private Car car1;
    private Car car2;
    private Car car3;
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        car1 = new Car();
        car2 = new Car();
        car1 = car3;
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testEquality() {
        assertEquals(car1,car3);
    }
    
    @Test
    public void testIdentity(){
        assertNotSame(car1,car2);
    }
    
    @Test
    public void testFail(){
        assertEquals(car1,car3);
        fail("This test will deliberately fail");
    }
    
    @Test
    public void testWithTimeout() throws InterruptedException{
        Thread.sleep(5000);
    }
    
    @Disabled("This is disabled for now")
    @Test
    public void testDisability(){
        assertEquals(car1,car3);
    }
}

