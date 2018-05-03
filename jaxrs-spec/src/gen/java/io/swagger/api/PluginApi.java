package io.swagger.api;

import io.swagger.model.ChePlugin;
import io.swagger.model.Error;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/plugin")
@Api(description = "the plugin API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-05-03T08:34:18.241Z")
public class PluginApi {

    @DELETE
    @Path("/{name}/{version}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Removes ChePlugin by name and version", notes = "Removes ChePlugin by name and version", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The ChePlugin successfully removed", response = Void.class),
        @ApiResponse(code = 403, message = "403 The user does not have access to update resource", response = Error.class),
        @ApiResponse(code = 404, message = "404 The specified resource was not found", response = Error.class),
        @ApiResponse(code = 500, message = "500 Internal server error occurred", response = Error.class) })
    public Response deletePluginByNameAndVersion(@PathParam("name") @ApiParam("Service name.") String name,@PathParam("version") @ApiParam("Service version.") String version) {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Return list of latest version of all plugins", notes = "Return list of latest version of all plugins", response = ChePlugin.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The ChePlugin successfully fetched", response = ChePlugin.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "500 Internal server error occurred", response = Error.class) })
    public Response getChePlugins() {
        return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/{name}/{version}")
    @Produces({ "application/x-yaml", "application/json" })
    @ApiOperation(value = "Get ChePlugin by name and version", notes = "Get ChePlugin by name and version", response = ChePlugin.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The ChePlugin successfully fetched", response = ChePlugin.class),
        @ApiResponse(code = 500, message = "500 Internal server error occurred", response = Error.class) })
    public Response getPluginByNameAndVersion(@PathParam("name") @ApiParam("ChePlugin name.") String name,@PathParam("version") @ApiParam("ChePlugin version.") String version) {
        return Response.ok().entity("magic!").build();
    }
}
