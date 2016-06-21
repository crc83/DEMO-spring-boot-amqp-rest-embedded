package org.sbelei.rest;

import static org.junit.Assert.*;

import javax.ws.rs.core.Application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sbelei.DemoamqpApplication;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoamqpApplication.class)
@WebAppConfiguration
@IntegrationTest("server.port=9000")
public class StatusControllerIntegrationTest {

	private RestTemplate restTemplate = new TestRestTemplate();

	@Test
	public void statusIsOk() {
		ResponseEntity<Status> entity =
				restTemplate.getForEntity("http://localhost:9000/myservice/status", Status.class);

		assertTrue(entity.getStatusCode().is2xxSuccessful());
		assertEquals("Jersey: Up and Running!", entity.getBody().getStatus());
	}
}
