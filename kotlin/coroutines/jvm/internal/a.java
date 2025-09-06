package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.e0;
import kotlin.f0;
import kotlin.h0;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@h0(version = "1.3")
public abstract class a implements Serializable, d, e {
    @m
    private final d completion;

    public a(@m d d0) {
        this.completion = d0;
    }

    @l
    public d create(@m Object object0, @l d d0) {
        L.p(d0, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @l
    public d create(@l d d0) {
        L.p(d0, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    // 去混淆评级： 低(20)
    @Override  // kotlin.coroutines.jvm.internal.e
    @m
    public e getCallerFrame() {
        return this.completion instanceof e ? ((e)this.completion) : null;
    }

    @m
    public final d getCompletion() {
        return this.completion;
    }

    @Override  // kotlin.coroutines.jvm.internal.e
    @m
    public StackTraceElement getStackTraceElement() {
        return g.e(this);
    }

    @m
    protected abstract Object invokeSuspend(@l Object arg1);

    protected void releaseIntercepted() {
    }

    @Override  // kotlin.coroutines.d
    public final void resumeWith(@l Object object0) {
        d d1;
        for(d d0 = this; true; d0 = d1) {
            h.b(d0);
            a a0 = (a)d0;
            d1 = a0.completion;
            L.m(d1);
            try {
                Object object1 = a0.invokeSuspend(object0);
                if(object1 == b.l()) {
                    return;
                }
                object0 = object1;
            }
            catch(Throwable throwable0) {
                object0 = e0.b(f0.a(throwable0));
            }
            a0.releaseIntercepted();
            if(!(d1 instanceof a)) {
                break;
            }
        }
        d1.resumeWith(object0);
    }

    @Override
    @l
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("Continuation at ");
        StackTraceElement stackTraceElement0 = this.getStackTraceElement();
        if(stackTraceElement0 == null) {
            stackTraceElement0 = this.getClass().getName();
        }
        stringBuilder0.append(stackTraceElement0);
        return stringBuilder0.toString();
    }
}

