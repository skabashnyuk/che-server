package io.swagger.api;

import io.swagger.model.CheFeature;
import io.swagger.model.Error;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/feature")
@Api(description = "the feature API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-04-10T12:16:57.523Z")
public class FeatureApi {

    @POST
    @Consumes({ "application/json", "application/x-yaml" })
    @Produces({ "application/json", "application/x-yaml" })
    @ApiOperation(value = "Create a new CheFeature", notes = "Create a new CheFeature", response = CheFeature.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The CheFeature successfully created", response = CheFeature.class),
        @ApiResponse(code = 403, message = "403 The user does not have access to update resource", response = Error.class),
        @ApiResponse(code = 404, message = "404 The specified resource was not found", response = Error.class),
        @ApiResponse(code = 409, message = "409 Operation could not be performed because of conflict with prior state.", response = Error.class),
        @ApiResponse(code = 500, message = "500 Internal server error occurred", response = Error.class) })
    public Response addFeature(@Valid CheFeature cheFeatureItem) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{name}/{version}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Removes CheFeature by name and version", notes = "Removes CheFeature by name and version", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The CheFeature successfully removed", response = Void.class),
        @ApiResponse(code = 403, message = "403 The user does not have access to update resource", response = Error.class),
        @ApiResponse(code = 404, message = "404 The specified resource was not found", response = Error.class),
        @ApiResponse(code = 409, message = "409 Operation could not be performed because of conflict with prior state.", response = Error.class),
        @ApiResponse(code = 500, message = "500 Internal server error occurred", response = Error.class) })
    public Response deleteFeatureByNameAndVersion(@PathParam("name") @ApiParam("CheFeature name.") String name,@PathParam("version") @ApiParam("CheFeature version.") String version) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{name}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Searches latest CheFeature by name", notes = "Searches latest CheFeature by name", response = CheFeature.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The CheFeature successfully fetched", response = CheFeature.class),
        @ApiResponse(code = 500, message = "500 Internal server error occurred", response = Error.class) })
    public Response searchFeatureByName(@PathParam("name") @ApiParam("Numeric ID of the user to get.") String name) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{name}/{version}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Get CheFeature by name and version", notes = "Get CheFeature by name and version", response = CheFeature.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The CheFeature successfully fetched", response = CheFeature.class),
        @ApiResponse(code = 500, message = "500 Internal server error occurred", response = Error.class) })
    public Response searchFeatureByNameAndVersion(@PathParam("name") @ApiParam("CheFeature name.") String name,@PathParam("version") @ApiParam("CheFeature version.") String version) {
        return Response.ok().entity("magic!").build();
    }
}
