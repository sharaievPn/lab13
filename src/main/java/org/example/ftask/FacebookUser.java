package org.example.ftask;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FacebookUser {
    private String userMail;
    private String country;
    private long lastActiveTime;
}
