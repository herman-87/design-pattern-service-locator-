package org.herman87;

import org.herman87.serviceLocator.ServiceLocator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ServiceLocator.getMessagingService("SMS Service");
        System.out.println(ServiceLocator.cache.getServiceByName("SMS Service").getInstanceName());
    }
}