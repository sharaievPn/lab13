package org.example.ftask;

public class TwitterUserAdapter implements UserAdapter {
    private TwitterUser twitterUser;

    public TwitterUserAdapter(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getUserMail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public long getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
