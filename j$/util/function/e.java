package j$.util.function;

import j..com.android.tools.r8.a;
import java.util.function.IntConsumer;

public final class e implements IntConsumer {
    public final IntConsumer a;
    public final IntConsumer b;

    public e(IntConsumer intConsumer0, IntConsumer intConsumer1) {
        this.a = intConsumer0;
        this.b = intConsumer1;
    }

    @Override
    public final void accept(int v) {
        this.a.accept(v);
        this.b.accept(v);
    }

    @Override
    public final IntConsumer andThen(IntConsumer intConsumer0) {
        return a.b(this, intConsumer0);
    }
}

