package Singleton;

import java.util.HashMap;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private HashMap<String,String> configuration;

    private ConfigurationManager(){
        configuration = new HashMap<>();
    }

    public static synchronized ConfigurationManager getInstance(){
        if(instance==null){
            instance=new ConfigurationManager();
        }
        return instance;
    }

    public void setConfig(String key,String value){
        configuration.put(key,value);
    }

    public String getConfig(String key){
        return configuration.get(key);
    }

    public static void main(String[] args) {
        ConfigurationManager configurationManager= new ConfigurationManager();
        configurationManager.setConfig("theme","dArk");
        ConfigurationManager configurationManager1= ConfigurationManager.getInstance();
        System.out.println(configurationManager1.getConfig("theme"));
    }
}
