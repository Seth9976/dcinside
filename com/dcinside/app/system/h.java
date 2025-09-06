package com.dcinside.app.system;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import com.dcinside.app.type.P;
import com.dcinside.app.type.g;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

public final class h implements a {
    public static final class com.dcinside.app.system.h.a {
        private com.dcinside.app.system.h.a() {
        }

        public com.dcinside.app.system.h.a(w w0) {
        }
    }

    @l
    public static final com.dcinside.app.system.h.a a = null;
    public static final int b = 3;

    static {
        h.a = new com.dcinside.app.system.h.a(null);
    }

    @Override  // com.dcinside.app.util.ll$a
    public void a(@l SharedPreferences sharedPreferences0, int v, int v1) {
        L.p(sharedPreferences0, "sp");
        if(v < 1 && sharedPreferences0.getBoolean("ReadImageHide", false)) {
            SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
            sharedPreferences$Editor0.putInt("ReadImageHideCount", 0);
            sharedPreferences$Editor0.apply();
        }
        if(v < 2) {
            int v2 = sharedPreferences0.getInt("Theme", 0);
            boolean z = g.a.c(v2).m();
            sharedPreferences0.edit().putBoolean("isDarkModeEnable", z).apply();
            if(z) {
                dl.a.f6(v2);
            }
            else {
                dl.a.g6(v2);
            }
        }
        if(v < 3) {
            if(sharedPreferences0.contains("isDarkModeEnable") && sharedPreferences0.getBoolean("isDarkModeEnable", false)) {
                dl.a.h6(P.d);
                return;
            }
            dl.a.h6(P.c);
        }
    }
}

