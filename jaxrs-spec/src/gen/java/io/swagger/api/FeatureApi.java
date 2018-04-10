package io.swagger.api;

import io.swagger.model.CheFeature;
import io.swagger.model.CheService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/feature")
@Api(description = "the feature API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-04-10T11:02:41.725Z")
public class FeatureApi {

    @POST
    @Consumes({ "application/json", "application/x-yaml" })
    @Produces({ "application/json", "application/x-yaml" })
    @ApiOperation(value = "Create a new CheFeature", notes = "Create a new CheFeature", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "The CheFeature successfully created", response = Void.class),
        @ApiResponse(code = 400, message = "Missed required parameters, parameters are not valid", response = Void.class),
        @ApiResponse(code = 403, message = "The user does not have access to create a new CheFeature", response = Void.class),
        @ApiResponse(code = 409, message = "Conflict error occurred during the CheFeature creation(e.g. The CheFeature with such name and version already exists)", response = Void.class) })
    public Response addFeature(@Valid CheFeature cheFeatureItem) {
        return Response.ok().entity("magic!").build();
    }

    @DELETE
    @Path("/{name}/{version}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Removes CheFeature by name and version", notes = "Removes CheFeature by name and version", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The CheFeature successfully removed", response = Void.class),
        @ApiResponse(code = 403, message = "The user does not have access to remove the CheFeature", response = Void.class),
        @ApiResponse(code = 404, message = "The CheFeature doesn't exist", response = Void.class),
        @ApiResponse(code = 500, message = "Internal server error occurred", response = Void.class) })
    public Response deleteFeatureByNameAndVersion(@PathParam("name") @ApiParam("CheFeature name.") String name,@PathParam("version") @ApiParam("CheFeature version.") String version) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{name}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Searches latest CheFeature by name", notes = "Searches latest CheFeature by name", response = CheFeature.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The CheFeature successfully fetched", response = CheFeature.class),
        @ApiResponse(code = 500, message = "Internal server error occurred during CheFeature fetching", response = Void.class) })
    public Response searchFeatureByName(@PathParam("name") @ApiParam("Numeric ID of the user to get.") String name) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{name}/{version}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Get CheFeature by name and version", notes = "Get CheFeature by name and version", response = CheFeature.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The CheFeature successfully fetched", response = CheFeature.class),
        @ApiResponse(code = 500, message = "Internal server error occurred during CheFeature fetching", response = Void.class) })
    public Response searchFeatureByNameAndVersion(@PathParam("name") @ApiParam("CheFeature name.") String name,@PathParam("version") @ApiParam("CheFeature version.") String version) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/resolve")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Searches list of CheServices by given list of features", notes = "Searches list of CheServices by given list of features", response = CheService.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The CheFeature successfully fetched", response = CheService.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "Internal server error occurred during CheFeature fetching", response = Void.class) })
    public Response searchServicesByFeatureList(@PathParam("name") @ApiParam("Numeric ID of the user to get.") String name) {
        return Response.ok().entity("magic!").build();
    }
}
