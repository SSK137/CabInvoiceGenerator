package com.bridgelabz;

public class TypesOfRides {
    private static final double NORMAL_MINIMUN_COST_PER_KM = 10.0;
    private static final int NORMAL_COST_PER_MINUTE = 1;
    private static final double NORMAL_MINIMUN_FARE = 5;

    private static final double PREMIUM_MINIMUN_COST_PER_KM = 15.0;
    private static final int PREMIUM_COST_PER_MINUTE = 2;
    private static final double PREMIUM_MINIMUN_FARE = 20;

    public static double CalculateFareNormal(double distance, int time) {
        double totalFare = distance * NORMAL_MINIMUN_COST_PER_KM + time * NORMAL_COST_PER_MINUTE;
        if(totalFare<NORMAL_MINIMUN_FARE)
            return NORMAL_MINIMUN_FARE;
        else
            return totalFare;
    }
    public static double CalculateFarePremium(double distance, int time) {
        double totalFare = distance * PREMIUM_MINIMUN_COST_PER_KM + time * PREMIUM_COST_PER_MINUTE;
        if(totalFare<PREMIUM_MINIMUN_FARE)
            return PREMIUM_MINIMUN_FARE;
        else
            return totalFare;
    }
}
