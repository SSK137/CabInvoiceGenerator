package com.bridgelabz;

public class CabInvoiceGenerator {
        private static  int costPerMinute = 1;
        private static  double minimumCostPerKilometer = 10;
        private static  double minimumFare = 5;
        public double CalculateFare(double distance, int time) {
            double totalFare = distance * minimumCostPerKilometer + time * costPerMinute;
            if (totalFare < minimumFare) {
                return minimumFare;
            }
            return totalFare;
        }
}
