package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@ExperimentalTextApi
public final class UrlAnnotation {
    @l
    private final String a;
    public static final int b;

    static {
    }

    public UrlAnnotation(@l String s) {
        L.p(s, "url");
        super();
        this.a = s;
    }

    @l
    public final String a() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof UrlAnnotation ? L.g(this.a, ((UrlAnnotation)object0).a) : false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "UrlAnnotation(url=" + this.a + ')';
    }
}

