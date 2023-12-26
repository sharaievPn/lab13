package org.example.ftask;

public class FacebookUserAdapter implements UserAdapter {
    private FacebookUser facebookUser;

    public FacebookUserAdapter(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getUserMail() {
        return facebookUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getCountry();
    }

    @Override
    public long getLastActiveTime() {
        return facebookUser.getLastActiveTime();
    }
}