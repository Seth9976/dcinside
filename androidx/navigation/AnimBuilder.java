package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;

@NavOptionsDsl
public final class AnimBuilder {
    @AnimRes
    @AnimatorRes
    private int a;
    @AnimRes
    @AnimatorRes
    private int b;
    @AnimRes
    @AnimatorRes
    private int c;
    @AnimRes
    @AnimatorRes
    private int d;

    public AnimBuilder() {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final void e(int v) {
        this.a = v;
    }

    public final void f(int v) {
        this.b = v;
    }

    public final void g(int v) {
        this.c = v;
    }

    public final void h(int v) {
        this.d = v;
    }
}

