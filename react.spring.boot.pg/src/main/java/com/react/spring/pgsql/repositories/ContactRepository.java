package com.react.spring.pgsql.repositories;

import org.springframework.data.repository.CrudRepository;

import com.react.spring.pgsql.models.Contact;

public interface ContactRepository extends CrudRepository<Contact, String> {
    @Override
    void delete(Contact deleted);
}
