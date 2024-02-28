package model;

public class statusChecker implements requestType
{
    public void sendQuery(String query)
    {
        System.out.println("request sent for status checking.");
    }

    public Boolean checkStatus()
    {
        return true;
    }
}
