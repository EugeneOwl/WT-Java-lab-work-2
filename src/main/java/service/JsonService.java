package service;

import org.json.simple.JSONArray;

public interface JsonService {

    /**
     * Returns JSONArray object extracted from file.
     *
     * @param filePath - path to file
     * @return JSONArray object extracted from file
     */
    JSONArray getJsonArray(String filePath) throws Exception;
}
