package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        JSONGetter jsonGetter = new JSONGetter();
        String jsonString = jsonGetter.getJson("https://api.chess.com/pub/titled/GM");//Получаю строку json с никнеймами игроков у которых титул GM
        String[] plaersName = parseJsonStringToArrayStr(jsonString);//парсю строку json  массив строк
        int numberPlayers=5;
        Players players=new Players();
        //В ArrayList players записываю player
        for (int i = 0; i < numberPlayers; i++) {
            players.add(jsonGetter.getPlayer(jsonGetter.getJson("https://api.chess.com/pub/player/"+plaersName[i])));
        }




        System.out.println("Массив игроков");
        System.out.println(players);


        players.getPlayers().sort(Player.byName);
        System.out.println("После сортировки по имени");
        System.out.println(players);

        players.getPlayers().sort(Player.byFollowers);
        System.out.println("После сортировки по количевству фоловеров");
        System.out.println(players);

        players.getPlayers().sort(Player.byLast_online);
        System.out.println("После сортировки по последнему заходу в игру(последний тот кто был онлайн позже от остальных)");
        System.out.println(players);


    }

    /**
     * Из Строки json создаю массим строк
     */
    private static String[] parseJsonStringToArrayStr(String jsonString) {
        String result;
        result = jsonString.substring(jsonString.lastIndexOf('[')+1);
        result=result.substring(0,result.lastIndexOf(']'));
        result=result.replaceAll("\"","");
        return result.split(",");
    }
}
