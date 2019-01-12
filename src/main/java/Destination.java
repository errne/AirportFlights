public enum Destination {
    EDINBURG("EDI"),
    GLASGOW("GLA"),
    MONTREAL("YUL"),
    NEWYORK("JFK"),
    TOKYO("NRT"),
    BOSTON("BOS"),
    VENICE("VCE"),
    BUENOSAIRES("EZE");

    private final String airportCode;

    Destination(String airportCode){
        this.airportCode = airportCode;
    }

    public String getAirportCode() {
        return airportCode;
    }
}
