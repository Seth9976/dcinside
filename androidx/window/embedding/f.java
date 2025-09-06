package androidx.window.embedding;

import java.util.List;

public final class f implements Runnable {
    public final SplitListenerWrapper a;
    public final List b;

    public f(SplitListenerWrapper extensionEmbeddingBackend$SplitListenerWrapper0, List list0) {
        this.a = extensionEmbeddingBackend$SplitListenerWrapper0;
        this.b = list0;
    }

    @Override
    public final void run() {
        SplitListenerWrapper.c(this.a, this.b);
    }
}

