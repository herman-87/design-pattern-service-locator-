package org.herman87.serviceLocator;

import org.herman87.cache.Cache;
import org.herman87.initialzr.Initializer;
import org.herman87.services.MessagingService;

import java.util.Objects;

public class ServiceLocator {
    public static final Cache cache = new Cache();
    public static MessagingService getMessagingService(String name) {
        MessagingService service = cache.getServiceByName(name);
        if (Objects.nonNull(service)) {
            return service;
        }
        Initializer initializer = new Initializer();
        MessagingService messagingService = initializer.lookUp(name);
        cache.addService(messagingService);
        return messagingService;
    }
}
