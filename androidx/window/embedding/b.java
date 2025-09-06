package androidx.window.embedding;

import android.view.WindowMetrics;
import j..util.function.Predicate.-CC;
import java.util.function.Predicate;

public final class b implements Predicate {
    public final SplitRule a;

    public b(SplitRule splitRule0) {
        this.a = splitRule0;
    }

    @Override
    public Predicate and(Predicate predicate0) {
        return Predicate.-CC.$default$and(this, predicate0);
    }

    @Override
    public Predicate negate() {
        return Predicate.-CC.$default$negate(this);
    }

    @Override
    public Predicate or(Predicate predicate0) {
        return Predicate.-CC.$default$or(this, predicate0);
    }

    @Override
    public final boolean test(Object object0) {
        return EmbeddingAdapter.t(this.a, ((WindowMetrics)object0));
    }
}

