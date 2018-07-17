public enum HTTPerrors {

    H400("Bad request"),
    H401("Unauthorized"),
    H402("Payment Required"),
    H403("Forbidden"),
    H404("Not Found "),
    H405("Method Not Allowed"),
    H406("Not Acceptable"),
    H407("Proxy Authentication Required"),
    H408("Request Timeout"),
    H409("Conflict");

private final String s;
    HTTPerrors(String s) {
        this.s = s;
    }
    public String getS() {
        return s;
    }
}
