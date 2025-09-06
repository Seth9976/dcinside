package com.google.common.io;

import J1.a;
import J1.c;
import J1.d;
import java.io.Flushable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@c
@d
@q
public final class u {
    private static final Logger a;

    static {
        u.a = Logger.getLogger("com.google.common.io.u");
    }

    public static void a(Flushable flushable0, boolean z) throws IOException {
        try {
            flushable0.flush();
        }
        catch(IOException iOException0) {
            if(!z) {
                throw iOException0;
            }
            u.a.log(Level.WARNING, "IOException thrown while flushing Flushable.", iOException0);
        }
    }

    @a
    public static void b(Flushable flushable0) {
        try {
            u.a(flushable0, true);
        }
        catch(IOException iOException0) {
            u.a.log(Level.SEVERE, "IOException should not have been thrown.", iOException0);
        }
    }
}

