package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class VerbatimTtsAnnotation extends TtsAnnotation {
    @l
    private final String b;
    public static final int c;

    static {
    }

    public VerbatimTtsAnnotation(@l String s) {
        L.p(s, "verbatim");
        super(null);
        this.b = s;
    }

    @l
    public final String a() {
        return this.b;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof VerbatimTtsAnnotation ? L.g(this.b, ((VerbatimTtsAnnotation)object0).b) : false;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.b + ')';
    }
}

