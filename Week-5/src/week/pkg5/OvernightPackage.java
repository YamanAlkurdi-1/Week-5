/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg5;

/**
 *
 * @author LARTEK
 */
public class OvernightPackage extends Package{
     private double additionalFeePerOunce;

    public OvernightPackage(
            String senderName,
            String senderAddress,
            String senderCity,
            String senderState,
            String senderZIP,
            String recipientName,
            String recipientAddress,
            String recipientCity,
            String recipientState,
            String recipientZIP,
            double weight,
            double costPerOunce,
            double additionalFeePerOunce) {

        super(senderName, senderAddress, senderCity, senderState,
              senderZIP, recipientName, recipientAddress,
              recipientCity, recipientState, recipientZIP,
              weight, costPerOunce);

        if (additionalFeePerOunce < 0) {
            throw new IllegalArgumentException(
                "Additional fee cannot be negative."
            );
        }

        this.additionalFeePerOunce = additionalFeePerOunce;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost()
                + (additionalFeePerOunce * getWeight());
    }

    // Getter needed to calculate the overnight fee.
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public String toString() {
     
        return super.toString()+ "OvernightPackage{" + "additionalFeePerOunce=" + additionalFeePerOunce + '}';
    }
    
    
}
