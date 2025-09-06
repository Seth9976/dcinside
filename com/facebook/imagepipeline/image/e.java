package com.facebook.imagepipeline.image;

import com.facebook.common.references.d;
import java.io.Closeable;
import k1.n.a;
import k1.n;

@n(a.a)
public interface e extends d, com.facebook.fresco.middleware.a, o, Closeable {
    o D1();

    @Override  // com.facebook.imagepipeline.image.o
    r I();

    boolean V3();

    @Override
    void close();

    @Override  // com.facebook.imagepipeline.image.o
    int getHeight();

    @Override  // com.facebook.imagepipeline.image.o
    int getWidth();

    boolean isClosed();

    @Override  // com.facebook.imagepipeline.image.o
    int z();
}

