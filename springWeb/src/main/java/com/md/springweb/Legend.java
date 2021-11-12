package com.md.springweb;

public class Legend {

    private final long id;
    private final String name;

    public Legend(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
