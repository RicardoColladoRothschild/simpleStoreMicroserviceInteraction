package resource;


import dto.PaymentRequest;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.PaymentService;

@Path("/payments")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PaymentResource {


    @Inject
    PaymentService service;

    @POST
    public Response pay(PaymentRequest request){
        service.process(request);
        return Response.ok("Pago procesado").build();
    }
}
