package androidx.core.view;

import android.content.ClipData.Item;
import androidx.core.util.Predicate;
import androidx.core.util.i;

public final class b implements Predicate {
    public final java.util.function.Predicate a;

    public b(java.util.function.Predicate predicate0) {
        this.a = predicate0;
    }

    @Override  // androidx.core.util.Predicate
    public Predicate a(Predicate predicate0) {
        return i.a(this, predicate0);
    }

    @Override  // androidx.core.util.Predicate
    public Predicate b(Predicate predicate0) {
        return i.c(this, predicate0);
    }

    @Override  // androidx.core.util.Predicate
    public Predicate negate() {
        return i.b(this);
    }

    @Override  // androidx.core.util.Predicate
    public final boolean test(Object object0) {
        return this.a.test(((ClipData.Item)object0));
    }
}

