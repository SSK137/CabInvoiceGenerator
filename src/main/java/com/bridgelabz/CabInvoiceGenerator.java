package com.bridgelabz;

public class CabInvoiceGenerator {
    private static int costPerMinute = 1;
    private static double minimumCostPerKilometer = 10;
    private static double minimumFare = 5;

    public double CalculateFare(double distance, int time) {
        double totalFare = distance * minimumCostPerKilometer + time * costPerMinute;
        if (totalFare < minimumFare) {
            return minimumFare;
        }
        return totalFare;
    }

    public double CalculateFare(Rides[] rides) {
        double totalFare = 0;
        for (Rides ride : rides) {
            totalFare += this.CalculateFare(ride.distance, (int) ride.time);
        }
        return totalFare;
    }
}

