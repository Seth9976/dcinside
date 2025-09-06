package androidx.compose.animation.core;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nComplexDouble.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,112:1\n35#1,2:113\n66#1,3:115\n40#1,3:118\n*S KotlinDebug\n*F\n+ 1 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n46#1:113,2\n50#1:115,3\n50#1:118,3\n*E\n"})
public final class ComplexDouble {
    private double a;
    private double b;

    public ComplexDouble(double f, double f1) {
        this.a = f;
        this.b = f1;
    }

    private final double e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ComplexDouble)) {
            return false;
        }
        return Double.compare(this.a, ((ComplexDouble)object0).a) == 0 ? Double.compare(this.b, ((ComplexDouble)object0).b) == 0 : false;
    }

    private final double f() {
        return this.b;
    }

    @l
    public final ComplexDouble g(double f, double f1) {
        return new ComplexDouble(f, f1);
    }

    public static ComplexDouble h(ComplexDouble complexDouble0, double f, double f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = complexDouble0.a;
        }
        if((v & 2) != 0) {
            f1 = complexDouble0.b;
        }
        return complexDouble0.g(f, f1);
    }

    @Override
    public int hashCode() {
        return b.a(this.a) * 0x1F + b.a(this.b);
    }

    @l
    public final ComplexDouble i(double f) {
        this.a /= f;
        this.b /= f;
        return this;
    }

    public final double j() {
        return this.b;
    }

    public final double k() {
        return this.a;
    }

    @l
    public final ComplexDouble l(double f) {
        this.a += -f;
        return this;
    }

    @l
    public final ComplexDouble m(@l ComplexDouble complexDouble0) {
        L.p(complexDouble0, "other");
        complexDouble0.a *= -1.0;
        complexDouble0.b *= -1.0;
        this.a += complexDouble0.k();
        this.b += complexDouble0.j();
        return this;
    }

    @l
    public final ComplexDouble n(double f) {
        this.a += f;
        return this;
    }

    @l
    public final ComplexDouble o(@l ComplexDouble complexDouble0) {
        L.p(complexDouble0, "other");
        this.a += complexDouble0.k();
        this.b += complexDouble0.j();
        return this;
    }

    @l
    public final ComplexDouble p(double f) {
        this.a *= f;
        this.b *= f;
        return this;
    }

    @l
    public final ComplexDouble q(@l ComplexDouble complexDouble0) {
        L.p(complexDouble0, "other");
        this.a = this.k() * complexDouble0.k() - this.j() * complexDouble0.j();
        this.b = this.k() * complexDouble0.j() + complexDouble0.k() * this.j();
        return this;
    }

    @l
    public final ComplexDouble r() {
        this.a *= -1.0;
        this.b *= -1.0;
        return this;
    }

    @Override
    @l
    public String toString() {
        return "ComplexDouble(_real=" + this.a + ", _imaginary=" + this.b + ')';
    }
}

