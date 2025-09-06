package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.w;
import y4.m;
import z3.j;

public final class NavAction {
    @IdRes
    private final int a;
    @m
    private NavOptions b;
    @m
    private Bundle c;

    @j
    public NavAction(@IdRes int v) {
        this(v, null, null, 6, null);
    }

    @j
    public NavAction(@IdRes int v, @m NavOptions navOptions0) {
        this(v, navOptions0, null, 4, null);
    }

    @j
    public NavAction(@IdRes int v, @m NavOptions navOptions0, @m Bundle bundle0) {
        this.a = v;
        this.b = navOptions0;
        this.c = bundle0;
    }

    public NavAction(int v, NavOptions navOptions0, Bundle bundle0, int v1, w w0) {
        if((v1 & 2) != 0) {
            navOptions0 = null;
        }
        if((v1 & 4) != 0) {
            bundle0 = null;
        }
        this(v, navOptions0, bundle0);
    }

    @m
    public final Bundle a() {
        return this.c;
    }

    public final int b() {
        return this.a;
    }

    @m
    public final NavOptions c() {
        return this.b;
    }

    public final void d(@m Bundle bundle0) {
        this.c = bundle0;
    }

    public final void e(@m NavOptions navOptions0) {
        this.b = navOptions0;
    }
}

