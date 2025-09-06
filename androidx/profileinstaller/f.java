package androidx.profileinstaller;

import android.content.Context;

public final class f implements Runnable {
    public final Context a;

    public f(Context context0) {
        this.a = context0;
    }

    @Override
    public final void run() {
        ProfileInstallerInitializer.i(this.a);
    }
}

