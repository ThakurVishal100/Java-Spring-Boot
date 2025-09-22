package Interfaces;

public class EmailService implements NotificationService{
    private String email;
    public EmailService(String email){
        this.email=email;
    }
    @Override
    public void sendNotifications(String message) {
        System.out.println("Sending message notification");
    }

    @Override
    public void subscribeToTopic(String message) {
        System.out.println("Sending subscribing notification");
    }
}
