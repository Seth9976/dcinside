package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import com.facebook.common.memory.j;
import com.facebook.imagepipeline.request.d;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class n0 extends N {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final ContentResolver c;
    @l
    public static final a d = null;
    @l
    public static final String e = "QualifiedResourceFetchProducer";

    static {
        n0.d = new a(null);
    }

    public n0(@l Executor executor0, @l j j0, @l ContentResolver contentResolver0) {
        L.p(executor0, "executor");
        L.p(j0, "pooledByteBufferFactory");
        L.p(contentResolver0, "contentResolver");
        super(executor0, j0);
        this.c = contentResolver0;
    }

    @Override  // com.facebook.imagepipeline.producers.N
    @l
    protected com.facebook.imagepipeline.image.l d(@l d d0) throws IOException {
        L.p(d0, "imageRequest");
        InputStream inputStream0 = this.c.openInputStream(d0.z());
        if(inputStream0 == null) {
            throw new IllegalStateException("ContentResolver returned null InputStream");
        }
        com.facebook.imagepipeline.image.l l0 = this.e(inputStream0, -1);
        L.o(l0, "getEncodedImage(...)");
        return l0;
    }

    @Override  // com.facebook.imagepipeline.producers.N
    @l
    protected String f() {
        return "QualifiedResourceFetchProducer";
    }
}

