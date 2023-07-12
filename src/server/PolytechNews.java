package server;

import service.UserManager;

import javax.xml.ws.Endpoint;

public class PolytechNews {
    public static void main(String[] args) {
        String url = "http://localhost:8081/soap";
        Endpoint.publish(url, new UserManager());
        System.out.println("Service web SOAP disponible à l'adresse : " +url);
    }
}
    