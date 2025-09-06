package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.h;
import com.fasterxml.jackson.databind.n;
import java.io.IOException;

public class f extends n {
    private final Error a;

    public f(NoClassDefFoundError noClassDefFoundError0) {
        this.a = noClassDefFoundError0;
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(com.fasterxml.jackson.core.n n0, h h0) throws IOException {
        throw this.a;
    }
}

