package kotlin.properties;

import A3.p;
import kotlin.jvm.internal.L;
import kotlin.reflect.o;
import y4.l;

public final class a {
    @l
    public static final a a;

    static {
        a.a = new a();
    }

    @l
    public final f a() {
        return new b();
    }

    @l
    public final f b(Object object0, @l p p0) {
        public static final class kotlin.properties.a.a extends c {
            final p b;

            public kotlin.properties.a.a(Object object0, p p0) {
                this.b = p0;
                super(object0);
            }

            @Override  // kotlin.properties.c
            protected void afterChange(o o0, Object object0, Object object1) {
                L.p(o0, "property");
                this.b.invoke(o0, object0, object1);
            }
        }

        L.p(p0, "onChange");
        return new kotlin.properties.a.a(object0, p0);
    }

    @l
    public final f c(Object object0, @l p p0) {
        public static final class kotlin.properties.a.b extends c {
            final p b;

            public kotlin.properties.a.b(Object object0, p p0) {
                this.b = p0;
                super(object0);
            }

            @Override  // kotlin.properties.c
            protected boolean beforeChange(o o0, Object object0, Object object1) {
                L.p(o0, "property");
                return ((Boolean)this.b.invoke(o0, object0, object1)).booleanValue();
            }
        }

        L.p(p0, "onChange");
        return new kotlin.properties.a.b(object0, p0);
    }
}

