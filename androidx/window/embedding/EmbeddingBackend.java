package androidx.window.embedding;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import java.util.Set;
import java.util.concurrent.Executor;
import y4.l;

@ExperimentalWindowApi
public interface EmbeddingBackend {
    void a(@l Set arg1);

    @l
    Set b();

    void c(@l Activity arg1, @l Executor arg2, @l Consumer arg3);

    void d(@l Consumer arg1);

    boolean e();

    void f(@l EmbeddingRule arg1);

    void g(@l EmbeddingRule arg1);
}

