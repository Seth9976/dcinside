package androidx.core.app;

import android.app.Activity;

public final class a implements Runnable {
    public final Activity a;

    public a(Activity activity0) {
        this.a = activity0;
    }

    @Override
    public final void run() {
        ActivityCompat.i(this.a);
    }
}

