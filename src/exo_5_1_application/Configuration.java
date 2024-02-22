package exo_5_1_application;

// Singleton

public class Configuration {
    
    private static Configuration instance = null;

    public static Configuration getInstance(){
        if(instance == null)
            instance = new Configuration();
        return instance;
    }

    private Configuration() {
    }

    

}
