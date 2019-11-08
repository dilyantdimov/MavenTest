package managers;

import dataProviders.ConfigFileReader;

public class FileReaderManager {

    private static FileReaderManager fileReaderManager;
    private static ConfigFileReader configFileReader;

    private FileReaderManager() {
    }

    public static FileReaderManager getInstance( ) {

        return (fileReaderManager ==null) ? new FileReaderManager() : fileReaderManager;
    }

    public ConfigFileReader getConfigReader() {
        return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
    }
}