package org.herman87.cache;

import org.herman87.services.MessagingService;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    List<MessagingService> messagingServices = new ArrayList<>();

    public MessagingService getServiceByName(String name) {
        return messagingServices.stream()
                .filter(messagingService -> name.equals(messagingService.getInstanceName()))
                .findFirst()
                .orElse(null);
    }

    public void addService(MessagingService messagingService) {
        messagingServices.add(messagingService);
    }

}
