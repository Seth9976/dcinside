package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import java.util.Locale;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
@InternalPlatformTextApi
public final class WordBoundary {
    @l
    private final WordIterator a;
    public static final int b = 8;

    static {
    }

    public WordBoundary(@l Locale locale0, @l CharSequence charSequence0) {
        L.p(locale0, "locale");
        L.p(charSequence0, "text");
        super();
        this.a = new WordIterator(charSequence0, 0, charSequence0.length(), locale0);
    }

    public final int a(int v) {
        int v1 = this.a.n(v);
        int v2 = this.a.i(v1) ? this.a.g(v) : this.a.d(v);
        return v2 == -1 ? v : v2;
    }

    public final int b(int v) {
        int v1 = this.a.o(v);
        int v2 = this.a.k(v1) ? this.a.f(v) : this.a.e(v);
        return v2 == -1 ? v : v2;
    }
}

