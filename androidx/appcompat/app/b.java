package androidx.appcompat.app;

import android.content.Context;

public final class b implements Runnable {
    public final Context a;

    public b(Context context0) {
        this.a = context0;
    }

    @Override
    public final void run() {
        AppCompatDelegate.m0(this.a);
    }
}

