package com.iab.omid.library.vungle;

import android.content.Context;
import com.iab.omid.library.vungle.internal.b;
import com.iab.omid.library.vungle.internal.g;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.internal.j;
import com.iab.omid.library.vungle.utils.a;
import com.iab.omid.library.vungle.utils.c;
import com.iab.omid.library.vungle.utils.e;

public class d {
    private boolean a;

    String a() [...] // Inlined contents

    void b(Context context0) {
        this.d(context0);
        if(!this.e()) {
            this.c(true);
            i.d().b(context0);
            b.k().a(context0);
            a.b(context0);
            c.d(context0);
            e.c(context0);
            g.c().b(context0);
            com.iab.omid.library.vungle.internal.a.a().b(context0);
            j.f().b(context0);
        }
    }

    void c(boolean z) {
        this.a = z;
    }

    private void d(Context context0) {
        com.iab.omid.library.vungle.utils.g.d(context0, "Application Context cannot be null");
    }

    boolean e() {
        return this.a;
    }

    void f() {
        com.iab.omid.library.vungle.utils.g.a();
        com.iab.omid.library.vungle.internal.a.a().e();
    }
}

