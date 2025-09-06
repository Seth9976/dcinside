package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.c.b;
import android.support.customtabs.c;
import android.util.Log;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.a})
final class EngagementSignalsCallbackRemote implements EngagementSignalsCallback {
    private final c a;
    private static final String b = "EngagementSigsCallbkRmt";

    private EngagementSignalsCallbackRemote(@NonNull c c0) {
        this.a = c0;
    }

    @NonNull
    static EngagementSignalsCallbackRemote a(@NonNull IBinder iBinder0) {
        return new EngagementSignalsCallbackRemote(b.i1(iBinder0));
    }

    @Override  // androidx.browser.customtabs.EngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(@IntRange(from = 1L, to = 100L) int v, @NonNull Bundle bundle0) {
        try {
            this.a.onGreatestScrollPercentageIncreased(v, bundle0);
        }
        catch(RemoteException unused_ex) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override  // androidx.browser.customtabs.EngagementSignalsCallback
    public void onSessionEnded(boolean z, @NonNull Bundle bundle0) {
        try {
            this.a.onSessionEnded(z, bundle0);
        }
        catch(RemoteException unused_ex) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override  // androidx.browser.customtabs.EngagementSignalsCallback
    public void onVerticalScrollEvent(boolean z, @NonNull Bundle bundle0) {
        try {
            this.a.onVerticalScrollEvent(z, bundle0);
        }
        catch(RemoteException unused_ex) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}

