package dao.impl;

import dao.BookDao;
import entity.book.Book;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import service.JsonService;
import service.ParseService;
import service.impl.JsonServiceImpl;
import service.impl.ParseServiceImpl;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import static constant.Files.BOOKS_FILE_PATH;
import static constant.Files.RESOURCES_PATH;
import static constant.JsonKeys.JSON_KEY_ARRAY;

public class BookDaoImpl implements BookDao {

    private JsonService jsonService = new JsonServiceImpl();
    private ParseService parseService = new ParseServiceImpl();

    @Override
    public List<Book> getAll() throws Exception {
        JSONArray jsonArray = jsonService.getJsonArray(BOOKS_FILE_PATH);
        List<Book> books = new ArrayList<>();
        jsonArray.forEach(it -> books.add(getBookFromJsonObject(it)));
        return books;
    }

    @Override
    public void saveAll(List<Book> books) throws Exception {
        FileWriter fileWriter = new FileWriter(RESOURCES_PATH + "/books.json");
        JSONArray jsonArray = new JSONArray();
        books.forEach(it -> jsonArray.add(getJsonObjectFromBook(it)));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(JSON_KEY_ARRAY, jsonArray);
        fileWriter.write(jsonObject.toJSONString());
        fileWriter.flush();
        fileWriter.close();
    }

    private Book getBookFromJsonObject(Object object) {
        JSONObject jsonObject = (JSONObject) object;
        return new Book(
                parseService.getInt((String) jsonObject.get("id")),
                parseService.getString((String) jsonObject.get("title")),
                parseService.getBookType((String) jsonObject.get("type")),
                parseService.getString((String) jsonObject.get("description"))
        );
    }

    private JSONObject getJsonObjectFromBook(Book book) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", Integer.toString(book.getId()));
        jsonObject.put("title", book.getTitle());
        jsonObject.put("type", book.getType().getLabel());
        jsonObject.put("description", book.getDescription());
        return jsonObject;
    }
}