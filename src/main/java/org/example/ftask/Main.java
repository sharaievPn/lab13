package org.example.ftask;

public class Main {
    public static void main(String[] args) {
        TwitterUser twitterUser = new TwitterUser("twitteruser@example.com",
                "USA", System.currentTimeMillis() / 1000);
        FacebookUser facebookUser = new FacebookUser(
                "facebookuser@example.com",
                "Canada", System.currentTimeMillis() / 1000 - 1800);

        UserAdapter twitterUserAdapter = new TwitterUserAdapter(twitterUser);
        UserAdapter facebookUserAdapter =
                new FacebookUserAdapter(facebookUser);

        MessageSender messageSender = new MessageSender();

        messageSender.send("Hello from the Adapter Pattern!"
                , twitterUserAdapter, "USA");
        messageSender.send("Hello from the Adapter Pattern!"
                , facebookUserAdapter, "USA");
    }
}

