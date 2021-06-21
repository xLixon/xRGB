package de.senay.y.Main;

public class Main {


    public static void main(String[] args) {


        if (VersionControl.versionControl() == "vNoProblems") {
            System.exit(1);
        } else {
            System.exit(0);
        }


    }
}
