package me.afua.subscriptiontest;

public class Subscription {
    private int price ; // subscription total price in cents
    private int length ; // length of subscription in months

    // constructor :
    public Subscription(int p, int n) {
        price = p ;
        length = n ;
    }

    /**
     * Calculate the monthly subscription price in dollars,
     * rounded up to the nearest cent.
     */
    public double pricePerMonth() {
        double r = (double) price / (double) length ;
        return Math.round(r) ;
    }

    /**
     * Call this to cancel/nulify this subscription.
     */
    public void cancel() { length = 0 ; }

}
