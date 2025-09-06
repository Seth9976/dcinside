package androidx.window.core;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

final class ValidSpecification extends SpecificationComputer {
    @l
    private final Object b;
    @l
    private final String c;
    @l
    private final VerificationMode d;
    @l
    private final Logger e;

    public ValidSpecification(@l Object object0, @l String s, @l VerificationMode specificationComputer$VerificationMode0, @l Logger logger0) {
        L.p(object0, "value");
        L.p(s, "tag");
        L.p(specificationComputer$VerificationMode0, "verificationMode");
        L.p(logger0, "logger");
        super();
        this.b = object0;
        this.c = s;
        this.d = specificationComputer$VerificationMode0;
        this.e = logger0;
    }

    @Override  // androidx.window.core.SpecificationComputer
    @l
    public Object a() {
        return this.b;
    }

    @Override  // androidx.window.core.SpecificationComputer
    @l
    public SpecificationComputer c(@l String s, @l Function1 function10) {
        L.p(s, "message");
        L.p(function10, "condition");
        return ((Boolean)function10.invoke(this.b)).booleanValue() ? this : new FailedSpecification(this.b, this.c, s, this.e, this.d);
    }

    @l
    public final Logger d() {
        return this.e;
    }

    @l
    public final String e() {
        return this.c;
    }

    @l
    public final Object f() {
        return this.b;
    }

    @l
    public final VerificationMode g() {
        return this.d;
    }
}

