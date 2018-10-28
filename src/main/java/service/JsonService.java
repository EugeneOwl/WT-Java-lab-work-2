package service;

import org.json.simple.JSONArray;

public interface JsonService {
    JSONArray getJsonArray(String filePath) throws Exception;
}
