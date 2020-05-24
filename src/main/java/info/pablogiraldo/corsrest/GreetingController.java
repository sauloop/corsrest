package info.pablogiraldo.corsrest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello %s";
	private final AtomicLong counter = new AtomicLong();

	@CrossOrigin(origins = "https://corsrest.herokuapp.com:9000")
	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(required = false, defaultValue = "World") String name) {
		System.out.println("==== in greeting ====");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/test")
	public Greeting test(@RequestParam(required = false, defaultValue = "Test") String name) {
		System.out.println("==== in greeting ====");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

}
