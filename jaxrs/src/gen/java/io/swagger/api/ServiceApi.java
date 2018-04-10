package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.ServiceApiService;
import io.swagger.api.factories.ServiceApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.CheService;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/service")


@io.swagger.annotations.Api(description = "the service API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-10T10:58:20.768Z")
public class ServiceApi  {
   private final ServiceApiService delegate;

   public ServiceApi(@Context ServletConfig servletContext) {
      ServiceApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ServiceApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ServiceApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ServiceApiServiceFactory.getServiceApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json", "application/x-yaml" })
    @Produces({ "application/json", "application/x-yaml" })
    @io.swagger.annotations.ApiOperation(value = "Create a new CheService", notes = "Create a new CheService", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "The CheService successfully created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Missed required parameters, parameters are not valid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user does not have access to create a new CheService", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict error occurred during the CheService creation(e.g. The CheService with such name and version already exists)", response = Void.class) })
    public Response addCheService(@ApiParam(value = "CheFeature item to add" ) CheService cheServiceItem
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addCheService(cheServiceItem,securityContext);
    }
    @DELETE
    @Path("/{name}/{version}")
    
    @Produces({ "application/x-yaml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Removes CheService by name and version", notes = "Removes CheService by name and version", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The CheService successfully removed", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user does not have access to remove the CheService", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The CheService doesn't exist", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error occurred", response = Void.class) })
    public Response deleteServiceByNameAndVersion(@ApiParam(value = "Service name.",required=true) @PathParam("name") String name
,@ApiParam(value = "Service version.",required=true) @PathParam("version") String version
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteServiceByNameAndVersion(name,version,securityContext);
    }
    @GET
    @Path("/{name}")
    
    @Produces({ "application/x-yaml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Searches latest CheService by name", notes = "Searches latest CheService by name", response = CheService.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The CheService successfully fetched", response = CheService.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error occurred during CheService fetching", response = Void.class) })
    public Response getServiceByName(@ApiParam(value = "Numeric ID of the user to get.",required=true) @PathParam("name") String name
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getServiceByName(name,securityContext);
    }
    @GET
    @Path("/{name}/{version}")
    
    @Produces({ "application/x-yaml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get CheService by name and version", notes = "Get CheService by name and version", response = CheService.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The CheService successfully fetched", response = CheService.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error occurred during CheService fetching", response = Void.class) })
    public Response getServiceByNameAndVersion(@ApiParam(value = "CheService name.",required=true) @PathParam("name") String name
,@ApiParam(value = "CheService version.",required=true) @PathParam("version") String version
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getServiceByNameAndVersion(name,version,securityContext);
    }
}
