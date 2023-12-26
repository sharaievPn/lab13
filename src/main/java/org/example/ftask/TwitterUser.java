package org.example.ftask;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TwitterUser {
    private String userMail;
    private String country;
    private long lastActiveTime;
}
