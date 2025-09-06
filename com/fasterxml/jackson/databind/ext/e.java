package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.r;

public abstract class e {
    private static final e a;

    static {
        e.a = new g();
    }

    public abstract Class a();

    public abstract n b(Class arg1);

    public abstract r c(Class arg1);

    public static e d() {
        return e.a;
    }
}

