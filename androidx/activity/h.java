package androidx.activity;

import androidx.activity.result.contract.ActivityResultContract.SynchronousResult;

public final class h implements Runnable {
    public final androidx.activity.ComponentActivity.activityResultRegistry.1 a;
    public final int b;
    public final SynchronousResult c;

    public h(androidx.activity.ComponentActivity.activityResultRegistry.1 componentActivity$activityResultRegistry$10, int v, SynchronousResult activityResultContract$SynchronousResult0) {
        this.a = componentActivity$activityResultRegistry$10;
        this.b = v;
        this.c = activityResultContract$SynchronousResult0;
    }

    @Override
    public final void run() {
        androidx.activity.ComponentActivity.activityResultRegistry.1.s(this.a, this.b, this.c);
    }
}

