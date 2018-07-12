public enum HTTPError {
    BadRequest(400),
    Unauthorized(401),
    PaymentRequired(402),
    Forbidden(403),
    NotFound(404),
    ItIsNotHTTPStatusCode();

    private Integer variable;

    HTTPError() {}
    HTTPError(Integer variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return this.name();
    }
}