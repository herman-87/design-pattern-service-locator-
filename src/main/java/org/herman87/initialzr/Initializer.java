package org.herman87.initialzr;

import org.herman87.services.EmailService;
import org.herman87.services.MessagingService;
import org.herman87.services.SmsService;

public class Initializer {
    public MessagingService lookUp(String name) {
        if ("Email Service".equals(name)) {
            return new EmailService();
        } else if ("SMS Service".equals(name)) {
            return new SmsService();
        }
        return null;
    }
}
