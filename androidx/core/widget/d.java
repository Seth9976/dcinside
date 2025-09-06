package androidx.core.widget;

public final class d implements Runnable {
    public final ContentLoadingProgressBar a;

    public d(ContentLoadingProgressBar contentLoadingProgressBar0) {
        this.a = contentLoadingProgressBar0;
    }

    @Override
    public final void run() {
        this.a.f();
    }
}

