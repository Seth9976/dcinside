package com.google.firebase.sessions;

import com.google.firebase.d;
import com.google.firebase.q;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface z {
    public static final class a {
        static final a a;

        static {
            a.a = new a();
        }

        @l
        public final z a() {
            Object object0 = q.c(d.a).l(z.class);
            L.o(object0, "Firebase.app[SessionDatastore::class.java]");
            return (z)object0;
        }
    }

    @l
    public static final a a;

    static {
        z.a = a.a;
    }

    void a(@l String arg1);

    @m
    String b();
}

