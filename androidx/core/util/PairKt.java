package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import kotlin.V;
import y4.l;

public final class PairKt {
    @SuppressLint({"UnknownNullness"})
    public static final Object a(@l Pair pair0) {
        return pair0.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final Object b(@l androidx.core.util.Pair pair0) {
        return pair0.a;
    }

    @SuppressLint({"UnknownNullness"})
    public static final Object c(@l Pair pair0) {
        return pair0.second;
    }

    @SuppressLint({"UnknownNullness"})
    public static final Object d(@l androidx.core.util.Pair pair0) {
        return pair0.b;
    }

    @l
    public static final Pair e(@l V v0) {
        return new Pair(v0.e(), v0.f());
    }

    @l
    public static final androidx.core.util.Pair f(@l V v0) {
        return new androidx.core.util.Pair(v0.e(), v0.f());
    }

    @l
    public static final V g(@l Pair pair0) {
        return new V(pair0.first, pair0.second);
    }

    @l
    public static final V h(@l androidx.core.util.Pair pair0) {
        return new V(pair0.a, pair0.b);
    }
}

