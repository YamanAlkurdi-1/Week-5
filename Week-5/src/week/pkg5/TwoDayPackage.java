/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg5;

/**
 *
 * @author LARTEK
 */
public class TwoDayPackage extends Package {
        private double flatFee;

    public TwoDayPackage(
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
            double flatFee) {

        super(senderName, senderAddress, senderCity, senderState,
              senderZIP, recipientName, recipientAddress,
              recipientCity, recipientState, recipientZIP,
              weight, costPerOunce);

        if (flatFee < 0) {
            throw new IllegalArgumentException(
                "Flat fee cannot be negative."
            );
        }

        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }

    @Override
    public String toString() {
        return super.toString() + "TwoDayPackage{" + "flatFee=" + flatFee + '}';
    }
    
    



}
