package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.sequences.m;
import y4.l;

@StabilityInferred(parameters = 0)
public final class ValueElementSequence implements m {
    @l
    private final List a;
    public static final int b = 8;

    static {
    }

    public ValueElementSequence() {
        this.a = new ArrayList();
    }

    public final void c(@l String s, @y4.m Object object0) {
        L.p(s, "name");
        ValueElement valueElement0 = new ValueElement(s, object0);
        this.a.add(valueElement0);
    }

    @Override  // kotlin.sequences.m
    @l
    public Iterator iterator() {
        return this.a.iterator();
    }
}

