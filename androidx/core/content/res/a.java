package androidx.core.content.res;

import android.graphics.Typeface;

public final class a implements Runnable {
    public final FontCallback a;
    public final Typeface b;

    public a(FontCallback resourcesCompat$FontCallback0, Typeface typeface0) {
        this.a = resourcesCompat$FontCallback0;
        this.b = typeface0;
    }

    @Override
    public final void run() {
        this.a.g(this.b);
    }
}

