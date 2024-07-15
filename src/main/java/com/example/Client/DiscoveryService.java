package com.example.Client;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscoveryService {

    private final EurekaClient eurekaClient;

    @Autowired
    public DiscoveryService(EurekaClient eurekaClient) {
        this.eurekaClient = eurekaClient;
    }

    public Applications getApplications() {
        return eurekaClient.getApplications();
    }
}

