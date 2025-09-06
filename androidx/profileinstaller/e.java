package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer.FrameCallback;

public final class e implements Choreographer.FrameCallback {
    public final ProfileInstallerInitializer a;
    public final Context b;

    public e(ProfileInstallerInitializer profileInstallerInitializer0, Context context0) {
        this.a = profileInstallerInitializer0;
        this.b = context0;
    }

    @Override  // android.view.Choreographer$FrameCallback
    public final void doFrame(long v) {
        this.a.f(this.b, v);
    }
}

