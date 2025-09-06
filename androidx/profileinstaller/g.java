package androidx.profileinstaller;

import android.content.Context;

public final class g implements Runnable {
    public final Context a;

    public g(Context context0) {
        this.a = context0;
    }

    @Override
    public final void run() {
        ProfileInstaller.l(this.a);
    }
}

