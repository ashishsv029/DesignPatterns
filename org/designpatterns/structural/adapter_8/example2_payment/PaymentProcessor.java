package org.designpatterns.structural.adapter_8.example2_payment;

public class PaymentProcessor {
    public GatewayAdapter gatewayAdapter;

    public PaymentProcessor(GatewayAdapter gw) {
        this.gatewayAdapter = gw;
    }
    public void processPayment() {
        gatewayAdapter.makePayment();
        gatewayAdapter.getStatus("paymentId");
    }
}
