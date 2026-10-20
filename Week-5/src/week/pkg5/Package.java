/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week.pkg5;

/**
 *
 * @author LARTEK
 */
public class Package {
      private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZIP;

    private String recipientName;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private String recipientZIP;

    private double weight;
    private double costPerOunce;

    public Package(
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
            double costPerOunce) {

        if (weight <= 0 || costPerOunce <= 0) {
            throw new IllegalArgumentException(
                "Weight and cost per ounce must be positive."
            );
        }

        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZIP = senderZIP;

        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZIP = recipientZIP;

        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Package{" + "senderName=" + senderName + ", senderAddress=" + senderAddress + ", senderCity=" + senderCity + ", senderState=" + senderState + ", senderZIP=" + senderZIP + ", recipientName=" + recipientName + ", recipientAddress=" + recipientAddress + ", recipientCity=" + recipientCity + ", recipientState=" + recipientState + ", recipientZIP=" + recipientZIP + ", weight=" + weight + ", costPerOunce=" + costPerOunce + '}';
    }
    

}
