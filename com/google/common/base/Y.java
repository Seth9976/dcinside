package com.google.common.base;

import J1.b;
import j..util.Objects;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

@b
@k
public class y {
    public static final class d {
        private final y a;
        private final String b;

        private d(y y0, String s) {
            this.a = y0;
            this.b = (String)H.E(s);
        }

        d(y y0, String s, a y$a0) {
            this(y0, s);
        }

        @O1.a
        public Appendable a(Appendable appendable0, Iterable iterable0) throws IOException {
            return this.b(appendable0, iterable0.iterator());
        }

        @O1.a
        public Appendable b(Appendable appendable0, Iterator iterator0) throws IOException {
            H.E(appendable0);
            if(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                Object object1 = ((Map.Entry)object0).getKey();
                appendable0.append(this.a.r(object1));
                appendable0.append(this.b);
                Object object2 = ((Map.Entry)object0).getValue();
                appendable0.append(this.a.r(object2));
                while(iterator0.hasNext()) {
                    appendable0.append(this.a.a);
                    Object object3 = iterator0.next();
                    Object object4 = ((Map.Entry)object3).getKey();
                    appendable0.append(this.a.r(object4));
                    appendable0.append(this.b);
                    Object object5 = ((Map.Entry)object3).getValue();
                    appendable0.append(this.a.r(object5));
                }
            }
            return appendable0;
        }

        @O1.a
        public Appendable c(Appendable appendable0, Map map0) throws IOException {
            return this.a(appendable0, map0.entrySet());
        }

        @O1.a
        public StringBuilder d(StringBuilder stringBuilder0, Iterable iterable0) {
            return this.e(stringBuilder0, iterable0.iterator());
        }

        @O1.a
        public StringBuilder e(StringBuilder stringBuilder0, Iterator iterator0) {
            try {
                this.b(stringBuilder0, iterator0);
                return stringBuilder0;
            }
            catch(IOException iOException0) {
                throw new AssertionError(iOException0);
            }
        }

        @O1.a
        public StringBuilder f(StringBuilder stringBuilder0, Map map0) {
            return this.d(stringBuilder0, map0.entrySet());
        }

        public String g(Iterable iterable0) {
            return this.h(iterable0.iterator());
        }

        public String h(Iterator iterator0) {
            return this.e(new StringBuilder(), iterator0).toString();
        }

        public String i(Map map0) {
            return this.g(map0.entrySet());
        }

        public d j(String s) {
            return new d(this.a.s(s), this.b);
        }
    }

    private final String a;

    private y(y y0) {
        this.a = y0.a;
    }

    y(y y0, a y$a0) {
        this(y0);
    }

    private y(String s) {
        this.a = (String)H.E(s);
    }

    @O1.a
    public Appendable b(Appendable appendable0, Iterable iterable0) throws IOException {
        return this.d(appendable0, iterable0.iterator());
    }

    @O1.a
    public final Appendable c(Appendable appendable0, @o3.a Object object0, @o3.a Object object1, Object[] arr_object) throws IOException {
        return this.b(appendable0, y.j(object0, object1, arr_object));
    }

    @O1.a
    public Appendable d(Appendable appendable0, Iterator iterator0) throws IOException {
        H.E(appendable0);
        if(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            appendable0.append(this.r(object0));
            while(iterator0.hasNext()) {
                appendable0.append(this.a);
                Object object1 = iterator0.next();
                appendable0.append(this.r(object1));
            }
        }
        return appendable0;
    }

    @O1.a
    public final Appendable e(Appendable appendable0, Object[] arr_object) throws IOException {
        return this.b(appendable0, Arrays.asList(arr_object));
    }

    @O1.a
    public final StringBuilder f(StringBuilder stringBuilder0, Iterable iterable0) {
        return this.h(stringBuilder0, iterable0.iterator());
    }

    @O1.a
    public final StringBuilder g(StringBuilder stringBuilder0, @o3.a Object object0, @o3.a Object object1, Object[] arr_object) {
        return this.f(stringBuilder0, y.j(object0, object1, arr_object));
    }

    @O1.a
    public final StringBuilder h(StringBuilder stringBuilder0, Iterator iterator0) {
        try {
            this.d(stringBuilder0, iterator0);
            return stringBuilder0;
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
    }

    @O1.a
    public final StringBuilder i(StringBuilder stringBuilder0, Object[] arr_object) {
        return this.f(stringBuilder0, Arrays.asList(arr_object));
    }

    private static Iterable j(@o3.a Object object0, @o3.a Object object1, Object[] arr_object) {
        class c extends AbstractList {
            final Object[] a;
            final Object b;
            final Object c;

            c(Object[] arr_object, Object object0, Object object1) {
                this.b = object0;
                this.c = object1;
                super();
            }

            @Override
            @o3.a
            public Object get(int v) {
                switch(v) {
                    case 0: {
                        return this.b;
                    }
                    case 1: {
                        return this.c;
                    }
                    default: {
                        return this.a[v - 2];
                    }
                }
            }

            @Override
            public int size() {
                return this.a.length + 2;
            }
        }

        H.E(arr_object);
        return new c(arr_object, object0, object1);
    }

    public final String k(Iterable iterable0) {
        return this.m(iterable0.iterator());
    }

    public final String l(@o3.a Object object0, @o3.a Object object1, Object[] arr_object) {
        return this.k(y.j(object0, object1, arr_object));
    }

    public final String m(Iterator iterator0) {
        return this.h(new StringBuilder(), iterator0).toString();
    }

    public final String n(Object[] arr_object) {
        return this.k(Arrays.asList(arr_object));
    }

    public static y o(char c) {
        return new y(String.valueOf(c));
    }

    public static y p(String s) {
        return new y(s);
    }

    public y q() {
        class com.google.common.base.y.b extends y {
            final y b;

            com.google.common.base.y.b(y y1) {
                super(y1, null);
            }

            @Override  // com.google.common.base.y
            public Appendable d(Appendable appendable0, Iterator iterator0) throws IOException {
                H.F(appendable0, "appendable");
                H.F(iterator0, "parts");
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(object0 != null) {
                        appendable0.append(y.this.r(object0));
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                while(iterator0.hasNext()) {
                    Object object1 = iterator0.next();
                    if(object1 != null) {
                        appendable0.append(y.this.a);
                        appendable0.append(y.this.r(object1));
                    }
                }
                return appendable0;
            }

            @Override  // com.google.common.base.y
            public y s(String s) {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            @Override  // com.google.common.base.y
            public d u(String s) {
                throw new UnsupportedOperationException("can\'t use .skipNulls() with maps");
            }
        }

        return new com.google.common.base.y.b(this, this);
    }

    CharSequence r(@o3.a Object object0) {
        Objects.requireNonNull(object0);
        return object0 instanceof CharSequence ? ((CharSequence)object0) : object0.toString();
    }

    public y s(String s) {
        class a extends y {
            final String b;
            final y c;

            a(y y1, String s) {
                this.b = s;
                super(y1, null);
            }

            @Override  // com.google.common.base.y
            public y q() {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            @Override  // com.google.common.base.y
            CharSequence r(@o3.a Object object0) {
                return object0 == null ? this.b : y.this.r(object0);
            }

            @Override  // com.google.common.base.y
            public y s(String s) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        }

        H.E(s);
        return new a(this, this, s);
    }

    public d t(char c) {
        return this.u(String.valueOf(c));
    }

    public d u(String s) {
        return new d(this, s, null);
    }
}

