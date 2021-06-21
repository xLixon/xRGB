package de.senay.y.Main;

import javax.swing.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class VersionControl {

    public static String versionControl() {
        try {

            String version = "v1.0";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://kappagames.de/xRGBversion.html"))
                    .build();

            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString());


            System.out.println(response.body());
            System.out.println(version);
            System.out.println(response.body().contains(version));

            if (response.body().contains(version)) {
                JOptionPane pane1 = new JOptionPane();
                pane1.createDialog("Software Version Control");
                JOptionPaneAPI.optionPane("xRGB Version Control", "Software is Up-To-Date\n (Version: " + version + ")");

                return "vNoProblems";
            } else {
                JOptionPaneAPI.optionPane("xRGB Version Control", "Version Error! Outdated Software. Please Upgrade at DOMAIN!\n\nInstalled Version: " + version + " \nNewest Version: " + response.body().replace("\n", ""));
                return "vError";
            }


            // System.out.println(out == version);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Error";
    }

    public static void returnCode(String returnMSG) {
        versionControl();
    }
}
