package androidx.appcompat.app;

import android.content.Context;

public final class a implements Runnable {
    public final Context a;

    public a(Context context0) {
        this.a = context0;
    }

    @Override
    public final void run() {
        AppCompatDelegate.K(this.a);
    }
}

