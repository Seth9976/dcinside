package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.G;
import com.fasterxml.jackson.databind.c;
import com.fasterxml.jackson.databind.cfg.t;
import com.fasterxml.jackson.databind.g;
import com.fasterxml.jackson.databind.m;

public abstract class w {
    public interface a {
        a a();

        Class b(Class arg1);
    }

    public abstract w a();

    public abstract c b(t arg1, m arg2, a arg3);

    public abstract c c(g arg1, m arg2, a arg3);

    public abstract c d(g arg1, m arg2, a arg3);

    @Deprecated
    public abstract c e(g arg1, m arg2, a arg3);

    public abstract c f(g arg1, m arg2, a arg3, c arg4);

    public abstract c g(t arg1, m arg2, a arg3);

    public abstract c h(G arg1, m arg2, a arg3);
}

