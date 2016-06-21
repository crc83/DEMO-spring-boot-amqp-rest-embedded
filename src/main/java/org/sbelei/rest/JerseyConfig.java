package org.sbelei.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/myservice")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(StatusController.class);
	}
}
