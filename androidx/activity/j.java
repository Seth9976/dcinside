package androidx.activity;

public final class j implements Runnable {
    public final ComponentActivity a;

    public j(ComponentActivity componentActivity0) {
        this.a = componentActivity0;
    }

    @Override
    public final void run() {
        androidx.activity.ComponentActivity.onBackPressedDispatcher.2.d(this.a);
    }
}

