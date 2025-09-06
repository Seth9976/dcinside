package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class t extends ObjectInputStream {
    @m
    private final List allowed;

    public t(@m InputStream inputStream0, @m List list0) {
        super(inputStream0);
        this.allowed = list0;
    }

    @Override
    @l
    protected Class resolveClass(@l ObjectStreamClass objectStreamClass0) throws ClassNotFoundException, IOException {
        L.p(objectStreamClass0, "desc");
        Class class0 = super.resolveClass(objectStreamClass0);
        if(this.allowed != null && !Number.class.isAssignableFrom(class0) && !L.g(String.class, class0) && !L.g(Boolean.class, class0) && !class0.isArray() && !this.allowed.contains(class0)) {
            throw new IOException("Deserialization is not allowed for " + objectStreamClass0.getName());
        }
        L.o(class0, "c");
        return class0;
    }
}

