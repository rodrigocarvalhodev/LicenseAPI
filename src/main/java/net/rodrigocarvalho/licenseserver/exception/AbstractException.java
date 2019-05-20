package net.rodrigocarvalho.licenseserver.exception;

import lombok.Data;

@Data
public class AbstractException {

    private String title;
    private String reason;
    private long timestamp;
    private int status;


}