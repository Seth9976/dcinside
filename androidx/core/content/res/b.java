package androidx.core.content.res;

public final class b implements Runnable {
    public final FontCallback a;
    public final int b;

    public b(FontCallback resourcesCompat$FontCallback0, int v) {
        this.a = resourcesCompat$FontCallback0;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.f(this.b);
    }
}

