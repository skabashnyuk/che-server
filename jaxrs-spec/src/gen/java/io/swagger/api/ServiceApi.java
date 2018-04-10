package io.swagger.api;

import io.swagger.model.CheService;
import io.swagger.model.Error;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/service")
@Api(description = "the service API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-04-10T12:16:57.523Z")
public class ServiceApi {

    @POST
    @Consumes({ "application/json", "application/x-yaml" })
    @Produces({ "application/json", "application/x-yaml" })
    @ApiOperation(value = "Create a new CheService", notes = "Create a new CheService", response = CheService.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The CheService successfully created", response = CheService.class),
        @ApiResponse(code = 400, message = "400 Server receives invalid input parameter", response = Error.class),
        @ApiResponse(code = 403, message = "403 The user does not have access to update resource", response = Error.class),
        @ApiResponse(code = 409, message = "409 Operation could not be performed because of conflict with prior state.", response = Error.class) })
    public Response addCheService(@Valid CheService cheServiceItem) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{name}/{version}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Removes CheService by name and version", notes = "Removes CheService by name and version", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The CheService successfully removed", response = Void.class),
        @ApiResponse(code = 403, message = "403 The user does not have access to update resource", response = Error.class),
        @ApiResponse(code = 404, message = "404 The specified resource was not found", response = Error.class),
        @ApiResponse(code = 500, message = "500 Internal server error occurred", response = Error.class) })
    public Response deleteServiceByNameAndVersion(@PathParam("name") @ApiParam("Service name.") String name,@PathParam("version") @ApiParam("Service version.") String version) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{name}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Searches latest CheService by name", notes = "Searches latest CheService by name", response = CheService.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The CheService successfully fetched", response = CheService.class),
        @ApiResponse(code = 500, message = "500 Internal server error occurred", response = Error.class) })
    public Response getServiceByName(@PathParam("name") @ApiParam("Numeric ID of the user to get.") String name) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{name}/{version}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Get CheService by name and version", notes = "Get CheService by name and version", response = CheService.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The CheService successfully fetched", response = CheService.class),
        @ApiResponse(code = 500, message = "500 Internal server error occurred", response = Error.class) })
    public Response getServiceByNameAndVersion(@PathParam("name") @ApiParam("CheService name.") String name,@PathParam("version") @ApiParam("CheService version.") String version) {
        return Response.ok().entity("magic!").build();
    }
}
