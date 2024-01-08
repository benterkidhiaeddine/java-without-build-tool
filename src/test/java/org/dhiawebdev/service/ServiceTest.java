package org.dhiawebdev.app.service;

import static org.junit.Assert.assertEquals;

import org.dhiawebdev.app.service.Service;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void evaluateService() {
        Service service = new Service();
        int sum = service.addNumber(5, 6);
        assertEquals(11, sum);
    }

    @Test
    public void evaluateServiceWrong() {
        Service service = new Service();
        int sum = service.addNumber(7, 5);
        assertEquals(5, sum);
    }

}
