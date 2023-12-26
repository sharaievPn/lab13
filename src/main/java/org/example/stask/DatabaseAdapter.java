package org.example.stask;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class DatabaseAdapter {
    private БазаДаних database;

    public String getUserData() {
        return database.отриматиДаніКористувача();
    }

    public String getStatisticalData() {
        return database.отриматиСтатистичніДані();
    }
}

