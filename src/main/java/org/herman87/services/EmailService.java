package org.herman87.services;

public class EmailService implements MessagingService{
    public String getMessageBody() {
        return "Email message body";
    };
    public String getInstanceName() {
        return "Email Service";
    };
}
