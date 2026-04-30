package resource;

import dto.PaymentLogRequest;
import entity.PaymentLog;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.LogService;

import java.util.List;

@Path("/logs")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class LogResource {

    @Inject
    LogService service;

    @POST
    public Response create(PaymentLogRequest request){
        service.save(request);
        return Response.status(201).build();
    }

    @GET
    public List<PaymentLog> getAll(){
        return service.listAllPaymentLogs();
    }

}
