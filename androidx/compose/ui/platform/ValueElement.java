package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class ValueElement {
    @l
    private final String a;
    @m
    private final Object b;
    public static final int c = 8;

    static {
    }

    public ValueElement(@l String s, @m Object object0) {
        L.p(s, "name");
        super();
        this.a = s;
        this.b = object0;
    }

    @l
    public final String a() {
        return this.a;
    }

    @m
    public final Object b() {
        return this.b;
    }

    @l
    public final ValueElement c(@l String s, @m Object object0) {
        L.p(s, "name");
        return new ValueElement(s, object0);
    }

    public static ValueElement d(ValueElement valueElement0, String s, Object object0, int v, Object object1) {
        if((v & 1) != 0) {
            s = valueElement0.a;
        }
        if((v & 2) != 0) {
            object0 = valueElement0.b;
        }
        return valueElement0.c(s, object0);
    }

    @l
    public final String e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ValueElement)) {
            return false;
        }
        return L.g(this.a, ((ValueElement)object0).a) ? L.g(this.b, ((ValueElement)object0).b) : false;
    }

    @m
    public final Object f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "ValueElement(name=" + this.a + ", value=" + this.b + ')';
    }
}

