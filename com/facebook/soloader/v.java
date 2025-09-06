package com.facebook.soloader;

import java.io.IOException;
import o1.b;

public class v implements b {
    @Override  // o1.b
    public boolean a(String s, int v) {
        return (v & 1) == 0 ? SoLoader.I(s, 0) : SoLoader.I(s, 16);
    }

    @Override  // o1.b
    public int b() {
        return SoLoader.y();
    }

    @Override  // o1.b
    public String c(String s) throws IOException {
        return SoLoader.u(s);
    }
}

