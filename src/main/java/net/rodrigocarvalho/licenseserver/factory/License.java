package net.rodrigocarvalho.licenseserver.factory;

import javax.persistence.Entity;

@Entity
public class License extends AbstractEntity {

    private String clientName;
    private String pluginName;
    private String address;
    private int port;

    public String getClientName() {
        return clientName;
    }

    public String getPluginName() {
        return pluginName;
    }

    public String getAddress() {
        return address;
    }

    public int getPort() {
        return port;
    }
}