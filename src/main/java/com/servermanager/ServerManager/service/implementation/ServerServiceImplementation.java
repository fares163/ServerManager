package com.servermanager.ServerManager.service.implementation;

import java.util.List;

import com.servermanager.ServerManager.model.Server;
import com.servermanager.ServerManager.service.ServerService;

public class ServerServiceImplementation implements ServerService{
    
    @Override
    public Server create(Server server) {
        // Implement your create logic here
        return null;
    }

    @Override  
    public Server ping(String ipAddress) {
        return null;
    //  Iplement  code 
    }

    @Override
    public Boolean delete(Long id) {
      return null;
        // Implement your delete logic here
    }

    @Override
    public List<Server> list(int pageSize) {
        // Implement your list logic here
        return null;
    }

    @Override
    public Server update(Server server) {
        // Implement your update logic here
        return null;
    }

    @Override
    public Server get(Long id) {
        // Implement your get logic here
        return null;
    }
}


