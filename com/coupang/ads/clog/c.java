package com.coupang.ads.clog;

import android.util.Log;
import java.io.File;
import kotlin.jvm.internal.L;
import y4.l;

public interface c extends a {
    public static final class com.coupang.ads.clog.c.a {
        public static void a(@l c c0) {
            L.p(c0, "this");
            Log.d("CLogInstaller", L.C("install ", c0));
            b.a.e().add(c0);
        }

        public static void b(@l c c0) {
            L.p(c0, "this");
            Log.d("CLogInstaller", "uninstall " + c0);
            b.a.e().remove(c0);
        }
    }

    void b();

    @l
    File[] c();

    void d();
}

