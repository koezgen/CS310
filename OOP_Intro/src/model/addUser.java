package model;

public class addUser implements requestType{
    @Override
    public void sendQuery(String query) {
        System.out.println(endpointURL + query);
    }
}
