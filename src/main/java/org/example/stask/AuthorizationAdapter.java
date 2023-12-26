package org.example.stask;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AuthorizationAdapter {
    private Авторизація authorization;

    public boolean authenticate(DatabaseAdapter db) {
        db.getUserData();
        return true;
    }
}
