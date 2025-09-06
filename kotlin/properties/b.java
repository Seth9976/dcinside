package kotlin.properties;

import kotlin.jvm.internal.L;
import kotlin.reflect.o;
import y4.l;
import y4.m;

final class b implements f {
    @m
    private Object a;

    @Override  // kotlin.properties.f
    @l
    public Object getValue(@m Object object0, @l o o0) {
        L.p(o0, "property");
        Object object1 = this.a;
        if(object1 == null) {
            throw new IllegalStateException("Property " + o0.getName() + " should be initialized before get.");
        }
        return object1;
    }

    @Override  // kotlin.properties.f
    public void setValue(@m Object object0, @l o o0, @l Object object1) {
        L.p(o0, "property");
        L.p(object1, "value");
        this.a = object1;
    }

    @Override
    @l
    public String toString() {
        return "NotNullProperty(" + (this.a == null ? "value not initialized yet" : "value=" + this.a) + ')';
    }
}

