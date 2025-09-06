package rx.exceptions;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import rx.plugins.f;

public final class h extends RuntimeException {
    public static class a extends RuntimeException {
        static final class rx.exceptions.h.a.a {
            static final Set a;

            static {
                rx.exceptions.h.a.a.a = rx.exceptions.h.a.a.a();
            }

            private static Set a() {
                Set set0 = new HashSet();
                set0.add(Boolean.class);
                set0.add(Character.class);
                set0.add(Byte.class);
                set0.add(Short.class);
                set0.add(Integer.class);
                set0.add(Long.class);
                set0.add(Float.class);
                set0.add(Double.class);
                return set0;
            }
        }

        private final Object a;
        private static final long b = 0xD00F486D07CC9535L;

        public a(Object object0) {
            super("OnError while emitting onNext value: " + a.b(object0));
            if(!(object0 instanceof Serializable)) {
                object0 = String.valueOf(object0);
            }
            this.a = object0;
        }

        public Object a() {
            return this.a;
        }

        static String b(Object object0) {
            if(object0 == null) {
                return "null";
            }
            Class class0 = object0.getClass();
            if(rx.exceptions.h.a.a.a.contains(class0)) {
                return object0.toString();
            }
            if(object0 instanceof String) {
                return (String)object0;
            }
            if(object0 instanceof Enum) {
                return ((Enum)object0).name();
            }
            String s = f.c().b().b(object0);
            return s == null ? object0.getClass().getName() + ".class" : s;
        }
    }

    private final boolean a;
    private final Object b;
    private static final long c = 0xF81885D29B9202C2L;

    private h(Throwable throwable0) {
        super(throwable0);
        this.a = false;
        this.b = null;
    }

    private h(Throwable throwable0, Object object0) {
        super(throwable0);
        this.a = true;
        if(!(object0 instanceof Serializable)) {
            object0 = String.valueOf(object0);
        }
        this.b = object0;
    }

    public static Throwable a(Throwable throwable0, Object object0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        Throwable throwable1 = c.b(throwable0);
        if(throwable1 instanceof a && ((a)throwable1).a() == object0) {
            return throwable0;
        }
        c.a(throwable0, new a(object0));
        return throwable0;
    }

    public static h b(Throwable throwable0) {
        if(throwable0 == null) {
            throwable0 = new NullPointerException();
        }
        Throwable throwable1 = c.b(throwable0);
        return throwable1 instanceof a ? new h(throwable0, ((a)throwable1).a()) : new h(throwable0);
    }

    public Object c() {
        return this.b;
    }

    public boolean d() {
        return this.a;
    }
}

