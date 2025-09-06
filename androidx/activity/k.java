package androidx.activity;

public final class k implements Runnable {
    public final ComponentActivity a;
    public final OnBackPressedDispatcher b;

    public k(ComponentActivity componentActivity0, OnBackPressedDispatcher onBackPressedDispatcher0) {
        this.a = componentActivity0;
        this.b = onBackPressedDispatcher0;
    }

    @Override
    public final void run() {
        androidx.activity.ComponentActivity.onBackPressedDispatcher.2.e(this.a, this.b);
    }
}

