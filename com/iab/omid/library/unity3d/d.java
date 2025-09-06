package com.iab.omid.library.unity3d;

import android.content.Context;
import com.iab.omid.library.unity3d.internal.b;
import com.iab.omid.library.unity3d.internal.f;
import com.iab.omid.library.unity3d.internal.h;
import com.iab.omid.library.unity3d.utils.a;
import com.iab.omid.library.unity3d.utils.c;
import com.iab.omid.library.unity3d.utils.e;
import com.iab.omid.library.unity3d.utils.g;

public class d {
    private boolean a;

    String a() [...] // Inlined contents

    void b(Context context0) {
        this.d(context0);
        if(!this.e()) {
            this.c(true);
            h.d().b(context0);
            b.k().a(context0);
            a.b(context0);
            c.d(context0);
            e.c(context0);
            f.c().b(context0);
            com.iab.omid.library.unity3d.internal.a.a().b(context0);
        }
    }

    void c(boolean z) {
        this.a = z;
    }

    private void d(Context context0) {
        g.d(context0, "Application Context cannot be null");
    }

    boolean e() {
        return this.a;
    }

    void f() {
        g.a();
        com.iab.omid.library.unity3d.internal.a.a().e();
    }
}

