package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;

public class JSONGetter extends Thread {
    /**
     * Считываю все с сайта
     */
    private String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    /**
     * Вытаскиваю json с сайта
     */
    public String getJson(String url) {
        String jsonIn = "";
        InputStream is = null;
        try {
            is = new URL(url).openStream();
            try {
                BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
                try {
                    jsonIn = readAll(rd);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        jsonIn=jsonIn.replace("@","");
        return jsonIn;
    }

    /**
     *Создаю Player и заполняю поля класса
     */
    public Player getPlayer(String result) throws IOException
    {
        return new ObjectMapper().readValue(result, Player.class);

    }
}