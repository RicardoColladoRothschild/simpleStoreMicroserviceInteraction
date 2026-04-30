package service;

import client.LogsClient;
import dto.PaymentRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@ApplicationScoped
public class PaymentService {

    @Inject
    @RestClient
    LogsClient logsClient;

    public void process(PaymentRequest request){

        //will change this later....
        System.out.println("PAYMENT HAS BEEN TAKING...");

        logsClient.createLog(request);

    }
}
