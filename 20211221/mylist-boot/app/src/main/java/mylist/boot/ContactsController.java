package mylist.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ContactsController {
  String[] contacts = new String[5];
  int size = 0;

  @RequestMapping("/contact/list")
  public Object list() {

    return contacts;
  }



  @RequestMapping("/contact/add")
  public Object add(String name, String age, String address) {

    contacts[size] = name +"," + age +"," + address;
    size++;
    return contacts;
  }



}
