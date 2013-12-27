package org.ahedstrom;

import org.ahedstrom.resources.Resource;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.assets.AssetsBundle;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class DwAngularJSService extends Service<DwAngularJSConfiguration> {

    @Override
    public void initialize(Bootstrap<DwAngularJSConfiguration> bootstrap) {
        bootstrap.setName("Dropwizard-Backbone-Project-Template");
        bootstrap.addBundle(new AssetsBundle("/assets/", "/"));
    }

    @Override
    public void run(DwAngularJSConfiguration configuration, Environment environment) throws Exception {
        environment.addResource(new Resource());
    }

    public static void main(String[] args) throws Exception {
        new DwAngularJSService().run(args);
    }
}
