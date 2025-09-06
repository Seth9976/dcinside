package androidx.work;

import A3.a;
import kotlin.jvm.internal.L;
import y4.l;

public final class TracerKt {
    public static final Object a(@l Tracer tracer0, @l String s, @l a a0) {
        Object object0;
        L.p(tracer0, "<this>");
        L.p(s, "label");
        L.p(a0, "block");
        boolean z = tracer0.isEnabled();
        try {
            if(z) {
                tracer0.a(s);
            }
            object0 = a0.invoke();
            goto label_12;
        label_9:
            if(!z) {
                throw throwable0;
            }
        }
        catch(Throwable throwable0) {
            goto label_9;
        }
        tracer0.b();
        throw throwable0;
    label_12:
        if(z) {
            tracer0.b();
        }
        return object0;
    }
}

