package androidx.window.embedding;

import android.annotation.SuppressLint;
import androidx.window.core.ExperimentalWindowApi;
import j..util.function.Consumer.-CC;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.L;
import y4.l;

@SuppressLint({"NewApi"})
@ExperimentalWindowApi
public final class EmbeddingTranslatingCallback implements Consumer {
    @l
    private final EmbeddingCallbackInterface a;
    @l
    private final EmbeddingAdapter b;

    public EmbeddingTranslatingCallback(@l EmbeddingCallbackInterface embeddingInterfaceCompat$EmbeddingCallbackInterface0, @l EmbeddingAdapter embeddingAdapter0) {
        L.p(embeddingInterfaceCompat$EmbeddingCallbackInterface0, "callback");
        L.p(embeddingAdapter0, "adapter");
        super();
        this.a = embeddingInterfaceCompat$EmbeddingCallbackInterface0;
        this.b = embeddingAdapter0;
    }

    public void a(@l List list0) {
        L.p(list0, "splitInfoList");
        List list1 = this.b.i(list0);
        this.a.a(list1);
    }

    @Override
    public void accept(Object object0) {
        this.a(((List)object0));
    }

    @Override
    public Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

