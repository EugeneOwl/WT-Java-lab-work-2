package service.impl;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import service.JsonService;

import java.io.File;
import java.io.FileReader;

import static constant.JsonKeys.JSON_KEY_ARRAY;

public class JsonServiceImpl implements JsonService {

    @Override
    public JSONArray getJsonArray(String filePath) throws Exception {
        if (new File(filePath).length() == 0) {
            return new JSONArray();
        }
        Object obj = new JSONParser().parse(new FileReader(filePath));
        JSONObject jo = (JSONObject) obj;
        return (JSONArray) jo.get(JSON_KEY_ARRAY);
    }
}
