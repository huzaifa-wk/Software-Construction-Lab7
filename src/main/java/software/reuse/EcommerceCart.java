/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.reuse;

/**
 *
 * @author codez
 */
public class EcommerceCart {

    private final PaymentMethod paymentMethod;

    public EcommerceCart(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void checkout(double amount) {
        boolean success = paymentMethod.pay(amount);

        if (success) {
            System.out.println("Checkout successful!");
        } else {
            System.out.println("Payment failed!");
        }
    }
}
