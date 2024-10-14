package app;

//Intet security tilføjet
//Ingen populator til test
//Ingen test der skal testes for daos og routes
//Service klasserne skal laves udefra hvordan de er implementeret i de movie projektet
//DAO metoderne returnere "void" kig på hvordan det lavet andre steder

import app.config.AppConfig;

public class Main {
    public static void main(String[] args) {
        AppConfig.startServer();
    }
}
