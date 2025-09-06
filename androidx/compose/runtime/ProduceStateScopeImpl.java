package androidx.compose.runtime;

import A3.a;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.y;
import kotlinx.coroutines.p;
import y4.l;
import y4.m;

@s0({"SMAP\nProduceState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,224:1\n314#2,11:225\n*S KotlinDebug\n*F\n+ 1 ProduceState.kt\nandroidx/compose/runtime/ProduceStateScopeImpl\n*L\n51#1:225,11\n*E\n"})
final class ProduceStateScopeImpl implements MutableState, ProduceStateScope {
    @l
    private final g a;
    private final MutableState b;

    public ProduceStateScopeImpl(@l MutableState mutableState0, @l g g0) {
        L.p(mutableState0, "state");
        L.p(g0, "coroutineContext");
        super();
        this.a = g0;
        this.b = mutableState0;
    }

    @Override  // androidx.compose.runtime.ProduceStateScope
    @m
    public Object Y(@l a a0, @l d d0) {
        androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose.1 produceStateScopeImpl$awaitDispose$10;
        if(d0 instanceof androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose.1) {
            produceStateScopeImpl$awaitDispose$10 = (androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose.1)d0;
            int v = produceStateScopeImpl$awaitDispose$10.n;
            if((v & 0x80000000) == 0) {
                produceStateScopeImpl$awaitDispose$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    int n;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.l = object0;
                        this.n |= 0x80000000;
                        return d0.Y(null, this);
                    }
                };
            }
            else {
                produceStateScopeImpl$awaitDispose$10.n = v ^ 0x80000000;
            }
        }
        else {
            produceStateScopeImpl$awaitDispose$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                int n;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.l = object0;
                    this.n |= 0x80000000;
                    return d0.Y(null, this);
                }
            };
        }
        Object object0 = produceStateScopeImpl$awaitDispose$10.l;
        Object object1 = b.l();
        switch(produceStateScopeImpl$awaitDispose$10.n) {
            case 0: {
                f0.n(object0);
                try {
                    produceStateScopeImpl$awaitDispose$10.k = a0;
                    produceStateScopeImpl$awaitDispose$10.n = 1;
                    p p0 = new p(b.e(produceStateScopeImpl$awaitDispose$10), 1);
                    p0.c0();
                    Object object2 = p0.x();
                    if(object2 == b.l()) {
                        h.c(produceStateScopeImpl$awaitDispose$10);
                    }
                    if(object2 != object1) {
                        throw new y();
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 1: {
                a0 = (a)produceStateScopeImpl$awaitDispose$10.k;
                try {
                    f0.n(object0);
                    throw new y();
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        a0.invoke();
        throw throwable0;
    }

    @Override  // androidx.compose.runtime.MutableState
    @l
    public Function1 f() {
        return this.b.f();
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.a;
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object getValue() {
        return this.b.getValue();
    }

    @Override  // androidx.compose.runtime.MutableState
    public Object l() {
        return this.b.l();
    }

    @Override  // androidx.compose.runtime.MutableState
    public void setValue(Object object0) {
        this.b.setValue(object0);
    }
}

