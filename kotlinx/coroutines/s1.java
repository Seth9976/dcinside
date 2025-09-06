package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nkotlinx/coroutines/TimeoutCancellationException\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class s1 extends CancellationException implements I {
    @m
    @f
    public final transient I0 a;

    public s1(@l String s) {
        this(s, null);
    }

    public s1(@l String s, @m I0 i00) {
        super(s);
        this.a = i00;
    }

    @Override  // kotlinx.coroutines.I
    public Throwable a() {
        return this.b();
    }

    @l
    public s1 b() {
        s1 s10 = new s1((this.getMessage() == null ? "" : this.getMessage()), this.a);
        s10.initCause(this);
        return s10;
    }
}

