package org.designpatterns.structural.adapter_8.example2_payment;

public interface GatewayAdapter {
    void makePayment();
    void getStatus(String paymentId);
}
