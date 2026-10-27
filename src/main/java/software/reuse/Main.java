/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software.reuse;

/**
 *
 * @author codez
 */
public class Main {
    
        public static void main(String[] args) {

        PaymentMethod creditCard =
                new CreditCardPayment();

        EcommerceCart cart1 =
                new EcommerceCart(creditCard);

        cart1.checkout(5000);

        System.out.println("-------------------");

        PaymentMethod jazzCash =
                (PaymentMethod) new JazzCashPayment();

        EcommerceCart cart2 =
                new EcommerceCart(jazzCash);

        cart2.checkout(2500);
    }
}
