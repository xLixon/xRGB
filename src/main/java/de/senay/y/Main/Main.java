package de.senay.y.Main;

public class Main {

    public String version = "v1.0";


    public static void main(String[] args) {


        if (VersionControl.versionControl() == "vNoProblems") {
            System.exit(1);
        } else {
            System.exit(0);
        }


    }
}
