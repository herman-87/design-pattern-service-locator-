package org.herman87.services;

public class SmsService implements MessagingService{
    public String getMessageBody() {
        return "SMS message body";
    };
    public String getInstanceName() {
        return "SMS Service";
    };
}
