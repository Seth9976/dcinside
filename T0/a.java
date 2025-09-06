package t0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.properties.f;
import kotlin.reflect.o;
import y4.l;
import y4.m;

public class a implements f {
    @m
    private Object a;
    @l
    private final Function1 b;

    public a(@m Object object0, @l Function1 function10) {
        L.p(function10, "cleanupFunction");
        super();
        this.a = object0;
        this.b = function10;
    }

    public a(Object object0, Function1 function10, int v, w w0) {
        if((v & 1) != 0) {
            object0 = null;
        }
        this(object0, function10);
    }

    @Override  // kotlin.properties.f
    @m
    public Object getValue(@m Object object0, @l o o0) {
        L.p(o0, "property");
        return this.a;
    }

    @Override  // kotlin.properties.f
    public void setValue(@m Object object0, @l o o0, @m Object object1) {
        L.p(o0, "property");
        Object object2 = this.a;
        if(object2 != null && object2 != object1) {
            this.b.invoke(object2);
        }
        this.a = object1;
    }
}

