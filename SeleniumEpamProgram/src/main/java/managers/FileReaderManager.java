package managers;

import dataProviders.ConfigFileReader;

public class FileReaderManager {
// Singleton pattern - private constructor with public getInstance() method
    private static FileReaderManager fileReaderManager;
    private static ConfigFileReader configFileReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance() {

        return (fileReaderManager ==null) ? new FileReaderManager() : fileReaderManager;
    }

    public static ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}