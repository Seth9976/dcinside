package androidx.core.util;

import android.annotation.SuppressLint;

@SuppressLint({"UnknownNullness"})
public interface Predicate {
    @SuppressLint({"MissingNullability"})
    Predicate a(@SuppressLint({"MissingNullability"}) Predicate arg1);

    @SuppressLint({"MissingNullability"})
    Predicate b(@SuppressLint({"MissingNullability"}) Predicate arg1);

    @SuppressLint({"MissingNullability"})
    Predicate negate();

    boolean test(Object arg1);
}

