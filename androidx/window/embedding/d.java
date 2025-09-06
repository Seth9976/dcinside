package androidx.window.embedding;

import android.util.Pair;
import j..util.function.Predicate.-CC;
import java.util.Set;
import java.util.function.Predicate;

public final class d implements Predicate {
    public final EmbeddingAdapter a;
    public final Set b;

    public d(EmbeddingAdapter embeddingAdapter0, Set set0) {
        this.a = embeddingAdapter0;
        this.b = set0;
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
        return EmbeddingAdapter.l(this.a, this.b, ((Pair)object0));
    }
}

