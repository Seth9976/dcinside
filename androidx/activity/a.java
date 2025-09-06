package androidx.activity;

public final class a implements Runnable {
    public final ComponentActivity a;

    public a(ComponentActivity componentActivity0) {
        this.a = componentActivity0;
    }

    @Override
    public final void run() {
        ComponentActivity.w0(this.a);
    }
}

