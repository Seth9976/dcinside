package androidx.work;

import A3.a;
import androidx.concurrent.futures.CallbackToFutureAdapter.Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.concurrent.futures.ListenableFutureKt;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt\n+ 2 Tracer.kt\nandroidx/work/TracerKt\n*L\n1#1,71:1\n53#2,9:72\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/work/OperationKt\n*L\n48#1:72,9\n*E\n"})
public final class OperationKt {
    @m
    public static final Object c(@l Operation operation0, @l d d0) {
        androidx.work.OperationKt.await.1 operationKt$await$10;
        if(d0 instanceof androidx.work.OperationKt.await.1) {
            operationKt$await$10 = (androidx.work.OperationKt.await.1)d0;
            int v = operationKt$await$10.l;
            if((v & 0x80000000) == 0) {
                operationKt$await$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                    Object k;
                    int l;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.k = object0;
                        this.l |= 0x80000000;
                        return OperationKt.c(null, this);
                    }
                };
            }
            else {
                operationKt$await$10.l = v ^ 0x80000000;
            }
        }
        else {
            operationKt$await$10 = new kotlin.coroutines.jvm.internal.d(d0) {
                Object k;
                int l;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.k = object0;
                    this.l |= 0x80000000;
                    return OperationKt.c(null, this);
                }
            };
        }
        Object object0 = operationKt$await$10.k;
        Object object1 = b.l();
        switch(operationKt$await$10.l) {
            case 0: {
                f0.n(object0);
                t0 t00 = operation0.getResult();
                L.o(t00, "result");
                operationKt$await$10.l = 1;
                object0 = ListenableFutureKt.a(t00, operationKt$await$10);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        L.o(object0, "result.await()");
        return object0;
    }

    private static final Object d(Operation operation0, d d0) {
        t0 t00 = operation0.getResult();
        L.o(t00, "result");
        Object object0 = ListenableFutureKt.a(t00, d0);
        L.o(object0, "result.await()");
        return object0;
    }

    @l
    public static final Operation e(@l Tracer tracer0, @l String s, @l Executor executor0, @l a a0) {
        L.p(tracer0, "tracer");
        L.p(s, "label");
        L.p(executor0, "executor");
        L.p(a0, "block");
        MutableLiveData mutableLiveData0 = new MutableLiveData(Operation.b);
        t0 t00 = CallbackToFutureAdapter.a((Completer callbackToFutureAdapter$Completer0) -> {
            L.p(callbackToFutureAdapter$Completer0, "completer");
            executor0.execute(() -> {
                boolean z = tracer0.isEnabled();
                try {
                    if(z) {
                        tracer0.a(s);
                    }
                    try {
                        a0.invoke();
                        mutableLiveData0.o(Operation.a);
                        callbackToFutureAdapter$Completer0.c(Operation.a);
                    }
                    catch(Throwable throwable0) {
                        mutableLiveData0.o(new FAILURE(throwable0));
                        callbackToFutureAdapter$Completer0.f(throwable0);
                    }
                }
                finally {
                    if(z) {
                        tracer0.b();
                    }
                }
            });
            return S0.a;
        });
        L.o(t00, "getFuture { completer ->…}\n            }\n        }");
        return new OperationImpl(mutableLiveData0, t00);
    }

    // 检测为 Lambda 实现
    private static final S0 f(Executor executor0, Tracer tracer0, String s, a a0, MutableLiveData mutableLiveData0, Completer callbackToFutureAdapter$Completer0) [...]

    // 检测为 Lambda 实现
    private static final void g(Tracer tracer0, String s, a a0, MutableLiveData mutableLiveData0, Completer callbackToFutureAdapter$Completer0) [...]
}

