package org.fmunera.example.jdbc.repository;

import org.fmunera.example.jdbc.model.User;

import java.util.List;

public interface Repository<T> {

    List<T> list();
    void save(User user);
    void delete(Long id);

}
