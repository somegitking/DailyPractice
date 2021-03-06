/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package mylist.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App122101 {

  public static void main(String[] args) {
    SpringApplication.run(App122101.class, args);
  }

  @RequestMapping("/hello")
  String hello() {
    return "Hello World!";
  }

}
