package model;

public class dbHelper {

    private Boolean connectionStatus;

    // Internal method to run the observer pattern within the class instance.
    public dbHelper()
    {
        statusChecker status = new statusChecker();

        while (true)
        {
            this.connectionStatus = status.checkStatus();
        }
    }

    // Dependency injection
    public void requestSender(requestType req, String request)
    {
        if (this.connectionStatus)
        {
            req.sendQuery(request);
        }

        else
        {
            System.out.println("Address cannot be resolved.");
        }
    }

    private void dbStatusObserver(statusChecker status)
    {
        while (true)
        {
            connectionStatus = status.checkStatus();
        }
    }
}
