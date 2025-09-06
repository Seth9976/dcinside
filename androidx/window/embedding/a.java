package androidx.window.embedding;

import android.content.Intent;
import j..util.function.Predicate.-CC;
import java.util.Set;
import java.util.function.Predicate;

public final class a implements Predicate {
    public final Set a;

    public a(Set set0) {
        this.a = set0;
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
        return EmbeddingAdapter.r(this.a, ((Intent)object0));
    }
}

