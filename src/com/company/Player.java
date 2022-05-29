package com.company;

import java.io.Serializable;
import java.util.Comparator;

public class Player implements Serializable {

    public static Comparator<Player> byName = Comparator.comparing(Player::getName);
    public static Comparator<Player> byFollowers = Comparator.comparingDouble(o -> Double.parseDouble(o.followers));
    public static Comparator<Player> byLast_online = (o1, o2) -> Long.compare(Long.parseLong(o1.last_online), Long.parseLong(o2.last_online));

    private String avatar;
    private String player_id;
    private String id;
    private String url;
    private String name;
    private String username;
    private String title;
    private String followers;
    private String country;
    private String location;
    private String last_online;
    private String joined;
    private String status;
    private Boolean is_streamer;
    private Boolean verified;

    Player(String avatar, String player_id, String id, String url, String name, String username, String title, String followers, String country, String location, String last_online, String joined, String status, Boolean isStreamer, Boolean verified) {
        super();
        this.avatar = avatar;
        this.player_id = player_id;
        this.id = id;
        this.url = url;
        this.name = name;
        this.username = username;
        this.title = title;
        this.followers = followers;
        this.country = country;
        this.location = location;
        this.last_online = last_online;
        this.joined = joined;
        this.status = status;
        this.is_streamer = isStreamer;
        this.verified = verified;

    }

    Player() {

    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLast_online() {
        return last_online;
    }

    public void setLast_online(String last_online) {
        this.last_online = last_online;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIs_streamer() {
        return is_streamer;
    }

    public void setIs_streamer(Boolean is_streamer) {
        this.is_streamer = is_streamer;
    }

    public Boolean getVerified() {
        return verified;
    }

    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @Override
    public String toString() {
        return "Player{" +
                "avatar=" + avatar +
                " ;playerId=" + player_id +
                " ;id=" + id +
                " ;url=" + url +
                " ;name=" + name +
                " ;username=" + username +
                " ;title=" + title +
                " ;followers=" + followers +
                " ;country=" + country +
                " ;location=" + location +
                " ;lastOnline=" + last_online +
                " ;joined=" + joined +
                " ;status=" + status +
                " ;isStreamer=" + is_streamer +
                " ;verified=" + verified +
                "}\n";
    }

}



