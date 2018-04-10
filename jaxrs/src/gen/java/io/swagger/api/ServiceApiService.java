package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.CheService;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-10T10:58:20.768Z")
public abstract class ServiceApiService {
    public abstract Response addCheService(CheService cheServiceItem,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteServiceByNameAndVersion(String name,String version,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getServiceByName(String name,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getServiceByNameAndVersion(String name,String version,SecurityContext securityContext) throws NotFoundException;
}
