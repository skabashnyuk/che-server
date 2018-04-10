package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.FeatureApiService;
import io.swagger.api.factories.FeatureApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.CheFeature;
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

@Path("/feature")


@io.swagger.annotations.Api(description = "the feature API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-10T10:58:20.768Z")
public class FeatureApi  {
   private final FeatureApiService delegate;

   public FeatureApi(@Context ServletConfig servletContext) {
      FeatureApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("FeatureApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (FeatureApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = FeatureApiServiceFactory.getFeatureApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json", "application/x-yaml" })
    @Produces({ "application/json", "application/x-yaml" })
    @io.swagger.annotations.ApiOperation(value = "Create a new CheFeature", notes = "Create a new CheFeature", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "The CheFeature successfully created", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Missed required parameters, parameters are not valid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user does not have access to create a new CheFeature", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 409, message = "Conflict error occurred during the CheFeature creation(e.g. The CheFeature with such name and version already exists)", response = Void.class) })
    public Response addFeature(@ApiParam(value = "CheFeature item to add" ) CheFeature cheFeatureItem
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addFeature(cheFeatureItem,securityContext);
    }
    @DELETE
    @Path("/{name}/{version}")
    
    @Produces({ "application/x-yaml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Removes CheFeature by name and version", notes = "Removes CheFeature by name and version", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The CheFeature successfully removed", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The user does not have access to remove the CheFeature", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "The CheFeature doesn't exist", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error occurred", response = Void.class) })
    public Response deleteFeatureByNameAndVersion(@ApiParam(value = "CheFeature name.",required=true) @PathParam("name") String name
,@ApiParam(value = "CheFeature version.",required=true) @PathParam("version") String version
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteFeatureByNameAndVersion(name,version,securityContext);
    }
    @GET
    @Path("/{name}")
    
    @Produces({ "application/x-yaml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Searches latest CheFeature by name", notes = "Searches latest CheFeature by name", response = CheFeature.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The CheFeature successfully fetched", response = CheFeature.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error occurred during CheFeature fetching", response = Void.class) })
    public Response searchFeatureByName(@ApiParam(value = "Numeric ID of the user to get.",required=true) @PathParam("name") String name
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchFeatureByName(name,securityContext);
    }
    @GET
    @Path("/{name}/{version}")
    
    @Produces({ "application/x-yaml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get CheFeature by name and version", notes = "Get CheFeature by name and version", response = CheFeature.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The CheFeature successfully fetched", response = CheFeature.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error occurred during CheFeature fetching", response = Void.class) })
    public Response searchFeatureByNameAndVersion(@ApiParam(value = "CheFeature name.",required=true) @PathParam("name") String name
,@ApiParam(value = "CheFeature version.",required=true) @PathParam("version") String version
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchFeatureByNameAndVersion(name,version,securityContext);
    }
    @GET
    @Path("/resolve")
    
    @Produces({ "application/x-yaml", "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Searches list of CheServices by given list of features", notes = "Searches list of CheServices by given list of features", response = CheService.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The CheFeature successfully fetched", response = CheService.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal server error occurred during CheFeature fetching", response = Void.class) })
    public Response searchServicesByFeatureList(@ApiParam(value = "Numeric ID of the user to get.",required=true) @PathParam("name") String name
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.searchServicesByFeatureList(name,securityContext);
    }
}
