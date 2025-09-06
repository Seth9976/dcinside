package androidx.core.util;

import android.annotation.SuppressLint;
import j..util.Objects;

public final class i {
    @SuppressLint({"MissingNullability"})
    public static Predicate a(Predicate predicate0, @SuppressLint({"MissingNullability"}) Predicate predicate1) {
        Objects.requireNonNull(predicate1);
        return new g(predicate0, predicate1);
    }

    @SuppressLint({"MissingNullability"})
    public static Predicate b(Predicate predicate0) {
        return new h(predicate0);
    }

    @SuppressLint({"MissingNullability"})
    public static Predicate c(Predicate predicate0, @SuppressLint({"MissingNullability"}) Predicate predicate1) {
        Objects.requireNonNull(predicate1);
        return new d(predicate0, predicate1);
    }

    // 去混淆评级： 低(20)
    public static boolean d(Predicate predicate0, Predicate predicate1, Object object0) {
        return predicate0.test(object0) && predicate1.test(object0);
    }

    public static boolean e(Predicate predicate0, Object object0) {
        return !predicate0.test(object0);
    }

    // 去混淆评级： 低(20)
    public static boolean f(Predicate predicate0, Predicate predicate1, Object object0) {
        return predicate0.test(object0) || predicate1.test(object0);
    }

    @SuppressLint({"MissingNullability"})
    public static Predicate g(@SuppressLint({"MissingNullability"}) Object object0) {
        return object0 == null ? new e() : new f(object0);
    }

    @SuppressLint({"MissingNullability"})
    public static Predicate j(@SuppressLint({"MissingNullability"}) Predicate predicate0) {
        Objects.requireNonNull(predicate0);
        return predicate0.negate();
    }
}

