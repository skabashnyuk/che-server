package io.swagger.api;

import io.swagger.model.CheService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/service")
@Api(description = "the service API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-04-10T11:02:41.725Z")
public class ServiceApi {

    @POST
    @Consumes({ "application/json", "application/x-yaml" })
    @Produces({ "application/json", "application/x-yaml" })
    @ApiOperation(value = "Create a new CheService", notes = "Create a new CheService", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The CheService successfully created", response = Void.class),
        @ApiResponse(code = 400, message = "Missed required parameters, parameters are not valid", response = Void.class),
        @ApiResponse(code = 403, message = "The user does not have access to create a new CheService", response = Void.class),
        @ApiResponse(code = 409, message = "Conflict error occurred during the CheService creation(e.g. The CheService with such name and version already exists)", response = Void.class) })
    public Response addCheService(@Valid CheService cheServiceItem) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{name}/{version}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Removes CheService by name and version", notes = "Removes CheService by name and version", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The CheService successfully removed", response = Void.class),
        @ApiResponse(code = 403, message = "The user does not have access to remove the CheService", response = Void.class),
        @ApiResponse(code = 404, message = "The CheService doesn't exist", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server error occurred", response = Void.class) })
    public Response deleteServiceByNameAndVersion(@PathParam("name") @ApiParam("Service name.") String name,@PathParam("version") @ApiParam("Service version.") String version) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{name}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Searches latest CheService by name", notes = "Searches latest CheService by name", response = CheService.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The CheService successfully fetched", response = CheService.class),
        @ApiResponse(code = 500, message = "Internal server error occurred during CheService fetching", response = Void.class) })
    public Response getServiceByName(@PathParam("name") @ApiParam("Numeric ID of the user to get.") String name) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{name}/{version}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Get CheService by name and version", notes = "Get CheService by name and version", response = CheService.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The CheService successfully fetched", response = CheService.class),
        @ApiResponse(code = 500, message = "Internal server error occurred during CheService fetching", response = Void.class) })
    public Response getServiceByNameAndVersion(@PathParam("name") @ApiParam("CheService name.") String name,@PathParam("version") @ApiParam("CheService version.") String version) {
        return Response.ok().entity("magic!").build();
    }
}
