package io.swagger.api.factories;

import io.swagger.api.ServiceApiService;
import io.swagger.api.impl.ServiceApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-10T10:58:20.768Z")
public class ServiceApiServiceFactory {
    private final static ServiceApiService service = new ServiceApiServiceImpl();

    public static ServiceApiService getServiceApi() {
        return service;
    }
}
