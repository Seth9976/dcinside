package androidx.compose.foundation.text.selection;

import A3.o;
import java.util.Comparator;

public final class b implements Comparator {
    public final o a;

    public b(o o0) {
        this.a = o0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        return SelectionRegistrarImpl.F(this.a, object0, object1);
    }
}

