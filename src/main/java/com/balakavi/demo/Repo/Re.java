package com.balakavi.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.balakavi.demo.Entity.Enti;

public interface Re extends JpaRepository<Enti, Integer> {

}