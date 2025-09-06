package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.L;
import y4.l;

final class EmptyEmbeddingComponent implements ActivityEmbeddingComponent {
    public void a(@l Set set0) {
        L.p(set0, "splitRules");
    }

    public void b(@l Consumer consumer0) {
        L.p(consumer0, "consumer");
    }
}

