package com.google.firebase.remoteconfig;

public class s extends r {
    private final long b;

    public s(long v) {
        this("Fetch was throttled.", v);
    }

    public s(String s, long v) {
        super(s);
        this.b = v;
    }

    public long b() {
        return this.b;
    }
}

