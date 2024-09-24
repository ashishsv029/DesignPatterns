package org.designpatterns.structural.adapter_8.example2_payment.gateway_adapters;

import org.designpatterns.structural.adapter_8.example2_payment.GatewayAdapter;
import org.designpatterns.structural.adapter_8.example2_payment.gateway_apis.StripeSDK;

public class StripeAdapter implements GatewayAdapter {
    private final StripeSDK stripeApi = new StripeSDK();

    @Override
    public void makePayment() {
        stripeApi.createPayment();
    }
    @Override
    public void getStatus(String paymentId) {
        stripeApi.checkStatus(paymentId);
    }
}
