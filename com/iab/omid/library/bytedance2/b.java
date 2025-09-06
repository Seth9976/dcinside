package com.iab.omid.library.bytedance2;

import android.content.Context;
import com.iab.omid.library.bytedance2.internal.g;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.utils.a;
import com.iab.omid.library.bytedance2.utils.c;
import com.iab.omid.library.bytedance2.utils.e;

public class b {
    private boolean a;

    String a() [...] // Inlined contents

    void a(Context context0) {
        this.b(context0);
        if(!this.b()) {
            this.a(true);
            i.c().a(context0);
            com.iab.omid.library.bytedance2.internal.b.g().a(context0);
            a.a(context0);
            c.a(context0);
            e.a(context0);
            g.b().a(context0);
            com.iab.omid.library.bytedance2.internal.a.a().a(context0);
        }
    }

    void a(boolean z) {
        this.a = z;
    }

    private void b(Context context0) {
        com.iab.omid.library.bytedance2.utils.g.a(context0, "Application Context cannot be null");
    }

    boolean b() {
        return this.a;
    }

    void c() {
        com.iab.omid.library.bytedance2.utils.g.a();
        com.iab.omid.library.bytedance2.internal.a.a().d();
    }
}

