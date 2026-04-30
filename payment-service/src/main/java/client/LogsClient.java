package client;

import dto.PaymentRequest;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/logs")
@RegisterRestClient(configKey = "logs-api")
public interface LogsClient {

    @POST
    Response createLog(PaymentRequest request);
}
