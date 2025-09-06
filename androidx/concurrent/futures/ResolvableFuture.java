package androidx.concurrent.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.t0;

@RestrictTo({Scope.c})
public final class ResolvableFuture extends AbstractResolvableFuture {
    @Override  // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean r(@Nullable Object object0) {
        return super.r(object0);
    }

    @Override  // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean s(@NonNull Throwable throwable0) {
        return super.s(throwable0);
    }

    @Override  // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean t(@NonNull t0 t00) {
        return super.t(t00);
    }

    @NonNull
    public static ResolvableFuture w() {
        return new ResolvableFuture();
    }
}

