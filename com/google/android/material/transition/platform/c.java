package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
class c {
    final int a;
    final int b;
    final boolean c;

    private c(int v, int v1, boolean z) {
        this.a = v;
        this.b = v1;
        this.c = z;
    }

    static c a(int v, int v1) {
        return new c(v, v1, true);
    }

    static c b(int v, int v1) {
        return new c(v, v1, false);
    }
}

