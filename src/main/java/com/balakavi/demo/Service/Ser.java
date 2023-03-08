package com.balakavi.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.balakavi.demo.Entity.Enti;
import com.balakavi.demo.Repo.Re;


@Service

public class Ser {

@Autowired
Re r;

public String add(Enti m) {
r.save(m);
return "Added";
}

public List<Enti> getDetails() {
return r.findAll();
}
public Enti updateDetails(Enti e1) {
return r.saveAndFlush(e1);
}
public void deleteDetails(int id){
r.deleteById(id);
}
public List<Enti> getSorted(String field) {
return r.findAll(Sort.by(Sort.Direction.ASC,field));
}



public List<Enti> getWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
Page<Enti> page =r.findAll(PageRequest.of(offset, pageSize));
return page.getContent();
}

}