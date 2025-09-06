package com.google.common.io;

import J1.c;
import J1.d;
import J1.e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import o3.a;

@c
@d
@q
public final class m {
    @e
    static final Logger a;

    static {
        m.a = Logger.getLogger("com.google.common.io.m");
    }

    public static void a(@a Closeable closeable0, boolean z) throws IOException {
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
            m.a.log(Level.WARNING, "IOException thrown while closing Closeable.", iOException0);
        }
    }

    public static void b(@a InputStream inputStream0) {
        try {
            m.a(inputStream0, true);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    public static void c(@a Reader reader0) {
        try {
            m.a(reader0, true);
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }
}

