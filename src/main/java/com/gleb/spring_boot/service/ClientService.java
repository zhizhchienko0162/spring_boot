package com.gleb.spring_boot.service;

import com.gleb.spring_boot.model.Client;

import java.util.List;

public interface ClientService {
    void create(Client client);

    List<Client> readAll();

    Client read(int id);

    boolean delete(int id);
}
