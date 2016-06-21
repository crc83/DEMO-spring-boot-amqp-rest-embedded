package org.sbelei.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path("/status")
public class StatusController {

	@GET
	@Produces("application/json")
	public Status health() {
		return new Status("Jersey: Up and Running!");
	}
}
