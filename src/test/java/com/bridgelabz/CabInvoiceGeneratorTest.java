package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class CabInvoiceGeneratorTest {
    @Test
    public void GivenDistanceAndTime_ShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = cabInvoiceGenerator.CalculateFare(distance, time);
        Assertions.assertEquals(25, fare);
    }
    @Test
    public void givenLessDistanceAndTime_shouldReturnMinFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = cabInvoiceGenerator.CalculateFare(distance, time);
        System.out.println(fare);
        Assertions.assertEquals(5, fare);
    }
    @Test
    public void givenMultipleRide_ShouldReturnInvoiceSummary() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.11, 1)
        };
        InvoiceSummary summary = cabInvoiceGenerator.CalculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assertions.assertEquals(expectedInvoiceSummary, summary);
    }
    @Test
    public void GivenDistanceAndTimeForUserId_ShouldReturnTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        String userId = "SSK";
        Rides[] rides = {new Rides(2.0, 5),
                new Rides(0.11, 1)
        };
        UserID.AddRide(userId, List.of(rides));
        InvoiceSummary summary = cabInvoiceGenerator.CalculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assertions.assertEquals(expectedInvoiceSummary, summary);
    }
    @Test
    public void GivenDistanceAndTimeForPremium_ShouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = TypesOfRides.CalculateFarePremium(distance, time);
        Assertions.assertEquals(40, fare,0.0);
    }
    @Test
    public void GivenDistanceAndTimeNormal_ShouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double fare = TypesOfRides.CalculateFareNormal(distance, time);
        Assertions.assertEquals(25, fare, 0.0);
    }
}
