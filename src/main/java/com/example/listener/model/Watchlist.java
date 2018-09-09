package com.example.listener.model;

public class Watchlist {
    private String title;
    private String version;
    private String id;

    /**
     * Sets new id.
     *
     * @param id New value of id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets new version.
     *
     * @param version New value of version.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Gets version.
     *
     * @return Value of version.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Gets id.
     *
     * @return Value of id.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets new title.
     *
     * @param title New value of title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets title.
     *
     * @return Value of title.
     */
    public String getTitle() {
        return title;
    }
}
