package com.servermanager.ServerManager.service;


import java.util.Collection;

import com.servermanager.ServerManager.model.Server;

public interface ServerService {

    Server create(Server server);
    Server ping(String ipAddress);
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
   
}
