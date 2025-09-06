package com.google.android.datatransport.runtime;

import c2.a;
import com.google.firebase.encoders.proto.h;
import java.io.IOException;
import java.io.OutputStream;

@a
public abstract class n {
    private static final h a;

    static {
        n.a = h.a().e(com.google.android.datatransport.runtime.a.b).d();
    }

    public static void a(Object object0, OutputStream outputStream0) throws IOException {
        n.a.b(object0, outputStream0);
    }

    public static byte[] b(Object object0) {
        return n.a.c(object0);
    }

    public abstract com.google.android.datatransport.runtime.firebase.transport.a c();
}

