package com.google.firebase.perf.util;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class l {
    private final URL a;

    public l(URL uRL0) {
        this.a = uRL0;
    }

    public URLConnection a() throws IOException {
        return this.a.openConnection();
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

