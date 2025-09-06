package kotlinx.coroutines.future;

import j..util.function.BiFunction.-CC;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.S0;
import kotlin.coroutines.g;
import kotlinx.coroutines.a;
import y4.l;
import y4.m;

final class c extends a implements BiFunction {
    @l
    private final CompletableFuture d;

    public c(@l g g0, @l CompletableFuture completableFuture0) {
        super(g0, true, true);
        this.d = completableFuture0;
    }

    @Override  // kotlinx.coroutines.a
    protected void N1(@l Throwable throwable0, boolean z) {
        this.d.completeExceptionally(throwable0);
    }

    @Override  // kotlinx.coroutines.a
    protected void O1(Object object0) {
        this.d.complete(object0);
    }

    public void Q1(@m Object object0, @m Throwable throwable0) {
        kotlinx.coroutines.I0.a.b(this, null, 1, null);
    }

    @Override
    public BiFunction andThen(Function function0) {
        return BiFunction.-CC.$default$andThen(this, function0);
    }

    @Override
    public Object apply(Object object0, Object object1) {
        this.Q1(object0, ((Throwable)object1));
        return S0.a;
    }
}

