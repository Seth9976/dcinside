package androidx.core.widget;

public final class b implements Runnable {
    public final ContentLoadingProgressBar a;

    public b(ContentLoadingProgressBar contentLoadingProgressBar0) {
        this.a = contentLoadingProgressBar0;
    }

    @Override
    public final void run() {
        this.a.h();
    }
}

