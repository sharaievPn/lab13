package org.example.ftask;

public class MessageSender {
    public void send(String text, UserAdapter user, String country) {
        if (user.getCountry().equals(country)
                && isActiveRecently(user.getLastActiveTime())) {
            System.out.println("The message is good to be sent");
            sendEmail(text, user.getUserMail());
        } else {
            System.out.println("This message cannot be sent\n");
        }
    }

    private boolean isActiveRecently(long lastActiveTime) {
        long currentTime = System.currentTimeMillis() / 1000;
        return (currentTime - lastActiveTime) <= 3600;
    }

    private void sendEmail(String text, String email) {
        System.out.println("Sending to: " + email);
        System.out.println("Text message is: " + text + "\n");
    }
}

