package org.designpatterns.structural.adapter_8.example2_payment.gateway_adapters;

import org.designpatterns.structural.adapter_8.example2_payment.GatewayAdapter;
import org.designpatterns.structural.adapter_8.example2_payment.gateway_apis.PaypalSDK;

public class PaypalAdapter implements GatewayAdapter {
    public final PaypalSDK paypalApi = new PaypalSDK();
    @Override
    public void makePayment() {
        paypalApi.makePayment();
    }
    @Override
    public void getStatus(String paymentId) {
        paypalApi.getStatus(paymentId);

    }
}
