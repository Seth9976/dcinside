package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.L;
import y4.l;

public final class TreeSet extends java.util.TreeSet {
    public TreeSet(@l Comparator comparator0) {
        L.p(comparator0, "comparator");
        super(comparator0);
    }

    public int a() {
        return super.size();
    }

    @Override
    public final int size() {
        return this.a();
    }
}

