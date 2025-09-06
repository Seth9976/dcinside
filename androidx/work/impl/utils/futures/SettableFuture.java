package androidx.work.impl.utils.futures;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.t0;

@RestrictTo({Scope.b})
public final class SettableFuture extends AbstractFuture {
    @Override  // androidx.work.impl.utils.futures.AbstractFuture
    public boolean p(@Nullable Object object0) {
        return super.p(object0);
    }

    @Override  // androidx.work.impl.utils.futures.AbstractFuture
    public boolean q(Throwable throwable0) {
        return super.q(throwable0);
    }

    @Override  // androidx.work.impl.utils.futures.AbstractFuture
    public boolean r(t0 t00) {
        return super.r(t00);
    }

    public static SettableFuture u() {
        return new SettableFuture();
    }
}

