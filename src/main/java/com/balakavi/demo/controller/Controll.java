package com.balakavi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.balakavi.demo.Entity.Enti;
import com.balakavi.demo.Service.Ser;
@CrossOrigin
@RestController
public class Controll {
@Autowired
Ser s;

@GetMapping("/get")
public List<Enti> showDetails() {
return s.getDetails();
}

@PostMapping("p")
public String addDetails(@RequestBody Enti m) {
s.add(m);
return "Added product " + m.getId();
}


@DeleteMapping("/delete/{id}")

public String deleteInfo(@PathVariable("id") int id) {

s.deleteDetails(id);

return "Deleted Details";

}

@PutMapping("/update")
public Enti updateInfo(@RequestBody Enti m) {
return s.updateDetails(m);
}

// pagination
@GetMapping("/product/{offset}/{pageSize}")
public List<Enti> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
return s.getWithPagination(offset, pageSize);
}
}