package com.servermanager.ServerManager.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.servermanager.ServerManager.model.Server;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
