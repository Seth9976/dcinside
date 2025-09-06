package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.n;
import com.fasterxml.jackson.databind.r;
import java.nio.file.Path;

public class g extends e {
    private final Class b;

    public g() {
        this.b = Path.class;
    }

    @Override  // com.fasterxml.jackson.databind.ext.e
    public Class a() {
        return this.b;
    }

    @Override  // com.fasterxml.jackson.databind.ext.e
    public n b(Class class0) {
        return class0 == this.b ? new p() : null;
    }

    @Override  // com.fasterxml.jackson.databind.ext.e
    public r c(Class class0) {
        return this.b.isAssignableFrom(class0) ? new com.fasterxml.jackson.databind.ext.r() : null;
    }
}

