package org.example.stask;

public class Main {
    public static void main(String[] args) {
        БазаДаних db = new БазаДаних();
        Авторизація авторизація = new Авторизація();

        DatabaseAdapter databaseAdapter = new DatabaseAdapter(db);
        AuthorizationAdapter authorizationAdapter =
                new AuthorizationAdapter(авторизація);

        if (authorizationAdapter.authenticate(databaseAdapter)) {
            ReportBuilder br = new ReportBuilder(databaseAdapter);
        }
    }
}
