package androidx.window.core;

import kotlin.J;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class FailedSpecification extends SpecificationComputer {
    public final class WhenMappings {
        public static final int[] a;

        static {
            int[] arr_v = new int[VerificationMode.values().length];
            arr_v[VerificationMode.a.ordinal()] = 1;
            arr_v[VerificationMode.b.ordinal()] = 2;
            arr_v[VerificationMode.c.ordinal()] = 3;
            WhenMappings.a = arr_v;
        }
    }

    @l
    private final Object b;
    @l
    private final String c;
    @l
    private final String d;
    @l
    private final Logger e;
    @l
    private final VerificationMode f;
    @l
    private final WindowStrictModeException g;

    public FailedSpecification(@l Object object0, @l String s, @l String s1, @l Logger logger0, @l VerificationMode specificationComputer$VerificationMode0) {
        L.p(object0, "value");
        L.p(s, "tag");
        L.p(s1, "message");
        L.p(logger0, "logger");
        L.p(specificationComputer$VerificationMode0, "verificationMode");
        super();
        this.b = object0;
        this.c = s;
        this.d = s1;
        this.e = logger0;
        this.f = specificationComputer$VerificationMode0;
        WindowStrictModeException windowStrictModeException0 = new WindowStrictModeException(this.b(object0, s1));
        StackTraceElement[] arr_stackTraceElement = windowStrictModeException0.getStackTrace();
        L.o(arr_stackTraceElement, "stackTrace");
        Object[] arr_object = kotlin.collections.l.l9(arr_stackTraceElement, 2).toArray(new StackTraceElement[0]);
        if(arr_object == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        windowStrictModeException0.setStackTrace(((StackTraceElement[])arr_object));
        this.g = windowStrictModeException0;
    }

    @Override  // androidx.window.core.SpecificationComputer
    @m
    public Object a() {
        switch(this.f) {
            case 1: {
                throw this.g;
            }
            case 2: {
                String s = this.b(this.b, this.d);
                this.e.a(this.c, s);
                break;
            }
            case 3: {
                break;
            }
            default: {
                throw new J();
            }
        }
        return null;
    }

    @Override  // androidx.window.core.SpecificationComputer
    @l
    public SpecificationComputer c(@l String s, @l Function1 function10) {
        L.p(s, "message");
        L.p(function10, "condition");
        return this;
    }

    @l
    public final WindowStrictModeException d() {
        return this.g;
    }

    @l
    public final Logger e() {
        return this.e;
    }

    @l
    public final String f() {
        return this.d;
    }

    @l
    public final String g() {
        return this.c;
    }

    @l
    public final Object h() {
        return this.b;
    }

    @l
    public final VerificationMode i() {
        return this.f;
    }
}

