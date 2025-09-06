package org.jsoup.parser;

import java.util.ArrayList;

public class e extends ArrayList {
    private final int a;
    private final int b;
    private static final int c = 16;

    e(int v, int v1) {
        super(v);
        this.a = v;
        this.b = v1;
    }

    e(e e0) {
        this(e0.a, e0.b);
    }

    boolean a() {
        return this.size() < this.b;
    }

    int b() {
        return this.b;
    }

    public static e c() {
        return new e(0, 0);
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    public static e d(int v) {
        return new e(16, v);
    }
}

