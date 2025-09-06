package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.type.a;
import com.fasterxml.jackson.core.type.b;
import java.io.IOException;
import java.util.Iterator;

public abstract class u extends F implements I {
    @Override  // com.fasterxml.jackson.core.F
    public abstract G a();

    @Override  // com.fasterxml.jackson.core.F
    public abstract G b();

    @Override  // com.fasterxml.jackson.core.F
    public abstract G e(n arg1) throws IOException;

    @Override  // com.fasterxml.jackson.core.F
    public abstract n f(G arg1);

    @Override  // com.fasterxml.jackson.core.F
    public abstract void g(k arg1, G arg2) throws IOException;

    public h h() {
        return this.i();
    }

    @Deprecated
    public h i() {
        return this.h();
    }

    public abstract Object j(n arg1, a arg2) throws IOException;

    public abstract Object k(n arg1, b arg2) throws IOException;

    public abstract Object l(n arg1, Class arg2) throws IOException;

    public abstract Iterator m(n arg1, a arg2) throws IOException;

    public abstract Iterator n(n arg1, b arg2) throws IOException;

    public abstract Iterator o(n arg1, Class arg2) throws IOException;

    public abstract Object p(G arg1, Class arg2) throws p;

    public abstract void q(k arg1, Object arg2) throws IOException;

    @Override  // com.fasterxml.jackson.core.I
    public abstract H version();
}

