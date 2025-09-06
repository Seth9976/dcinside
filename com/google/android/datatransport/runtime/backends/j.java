package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.a;
import com.google.android.datatransport.runtime.time.b;
import com.google.android.datatransport.runtime.time.h;

class j {
    private final Context a;
    private final a b;
    private final a c;

    @r3.a
    j(Context context0, @h a a0, @b a a1) {
        this.a = context0;
        this.b = a0;
        this.c = a1;
    }

    i a(String s) {
        return i.b(this.a, this.b, this.c, s);
    }
}

