package com.facebook.common.internal;

import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import k1.n.a;
import k1.n;
import o3.h;

@n(a.a)
public final class d {
    @VisibleForTesting
    static final Logger a;

    static {
        d.a = Logger.getLogger("com.facebook.common.internal.d");
    }

    public static void a(@h Closeable closeable0, boolean z) throws IOException {
        if(closeable0 == null) {
            return;
        }
        try {
            closeable0.close();
        }
        catch(IOException iOException0) {
            if(!z) {
                throw iOException0;
            }
            d.a.log(Level.WARNING, "IOException thrown while closing Closeable.", iOException0);
        }
    }

    public static void b(@h InputStream inputStream0) {
        try {
            d.a(inputStream0, true);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    public static void c(@h Reader reader0) {
        try {
            d.a(reader0, true);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

