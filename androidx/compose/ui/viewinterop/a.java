package androidx.compose.ui.viewinterop;

public final class a implements Runnable {
    public final A3.a a;

    public a(A3.a a0) {
        this.a = a0;
    }

    @Override
    public final void run() {
        androidx.compose.ui.viewinterop.AndroidViewHolder.onCommitAffectingUpdate.1.c(this.a);
    }
}

