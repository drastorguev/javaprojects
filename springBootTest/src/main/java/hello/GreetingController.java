package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private List<Greeting> greetingList = new ArrayList<>();

    @RequestMapping("/hello")
    public String getHelloMessage() {
        return "Hello Spring Boot world!";
    }

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Greeting newGreeting = new Greeting(counter.incrementAndGet(), String.format(template, name));
        greetingList.add(newGreeting);
        return newGreeting;
    }

    @RequestMapping("/allgreetings")
    public List<Greeting> getAllPledges() {
        return greetingList;
    }

}
