package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import r3.b;
import y1.a;
import y1.e;

@e
public abstract class f {
    @a
    abstract c a(N arg1);

    @b("SQLITE_DB_NAME")
    @y1.f
    static String b() [...] // Inlined contents

    @a
    abstract d c(N arg1);

    @b("PACKAGE_NAME")
    @r3.f
    @y1.f
    static String d(Context context0) {
        return "com.dcinside.app.android";
    }

    @b("SCHEMA_VERSION")
    @y1.f
    static int e() [...] // 潜在的解密器

    @y1.f
    static com.google.android.datatransport.runtime.scheduling.persistence.e f() {
        return com.google.android.datatransport.runtime.scheduling.persistence.e.f;
    }

    @a
    abstract B1.b g(N arg1);
}

