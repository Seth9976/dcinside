package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import y4.l;

@ExperimentalWindowApi
public interface EmbeddingInterfaceCompat {
    public interface EmbeddingCallbackInterface {
        void a(@l List arg1);
    }

    void a(@l Set arg1);

    void b(@l EmbeddingCallbackInterface arg1);
}

