package io.swagger.api.factories;

import io.swagger.api.FeatureApiService;
import io.swagger.api.impl.FeatureApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-04-10T10:58:20.768Z")
public class FeatureApiServiceFactory {
    private final static FeatureApiService service = new FeatureApiServiceImpl();

    public static FeatureApiService getFeatureApi() {
        return service;
    }
}
