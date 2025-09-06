package androidx.activity;

import android.content.IntentSender.SendIntentException;

public final class i implements Runnable {
    public final androidx.activity.ComponentActivity.activityResultRegistry.1 a;
    public final int b;
    public final IntentSender.SendIntentException c;

    public i(androidx.activity.ComponentActivity.activityResultRegistry.1 componentActivity$activityResultRegistry$10, int v, IntentSender.SendIntentException intentSender$SendIntentException0) {
        this.a = componentActivity$activityResultRegistry$10;
        this.b = v;
        this.c = intentSender$SendIntentException0;
    }

    @Override
    public final void run() {
        androidx.activity.ComponentActivity.activityResultRegistry.1.t(this.a, this.b, this.c);
    }
}

