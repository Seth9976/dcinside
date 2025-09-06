package androidx.core.widget;

public final class c implements Runnable {
    public final ContentLoadingProgressBar a;

    public c(ContentLoadingProgressBar contentLoadingProgressBar0) {
        this.a = contentLoadingProgressBar0;
    }

    @Override
    public final void run() {
        this.a.k();
    }
}

