package Interfaces;

public class SMSNotificationService implements NotificationService{
    public String phoneNumber;
    SMSNotificationService(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }

    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending notification to "+phoneNumber);
    }

    @Override
    public void subscribeToTopic(String message) {
        System.out.println("Sending subscribed notification to "+phoneNumber);
    }
}
