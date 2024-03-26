package Singleton;

public class DB
{
    private static DB instance;
    private boolean isConnected = false;
    private DB()
    {}
    public static DB getInstance()
    {
        if(instance == null)
        {
            instance = new DB();
        }
        return instance;
    }
    public void connect()
    {
        if(isConnected)
        {
            System.out.println("Deja e");
        }
        else
        {
            this.isConnected = true;
            System.out.println("Success");
        }
    }
    public void disconnect()
    {
        if(isConnected)
        {
            System.out.println("Oprita");
            this.isConnected = false;
        }
        else
        {

            System.out.println("Deja oprita");
        }
    }
}