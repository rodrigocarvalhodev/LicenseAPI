package net.rodrigocarvalho.licenseserver.exception;

public class ResourceNotFoundDetails extends AbstractException {

    private ResourceNotFoundDetails() {

    }

    public static final class Builder {
        private String title;
        private String reason;
        private long timestamp;
        private int status;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public ResourceNotFoundDetails build() {
            ResourceNotFoundDetails resourceNotFoundDetails = new ResourceNotFoundDetails();
            resourceNotFoundDetails.setTitle(title);
            resourceNotFoundDetails.setReason(reason);
            resourceNotFoundDetails.setTimestamp(timestamp);
            resourceNotFoundDetails.setStatus(status);
            return resourceNotFoundDetails;
        }
    }
}