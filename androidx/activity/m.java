package androidx.activity;

public final class m implements Runnable {
    public final ComponentDialog a;

    public m(ComponentDialog componentDialog0) {
        this.a = componentDialog0;
    }

    @Override
    public final void run() {
        ComponentDialog.e(this.a);
    }
}

