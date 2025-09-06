package org.jsoup.nodes;

import j..util.DesugarCollections;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jsoup.helper.i;
import org.jsoup.internal.g;
import org.jsoup.parser.f;

public class b implements Cloneable, Iterable {
    static class org.jsoup.nodes.b.b extends AbstractMap {
        class a implements Iterator {
            private Iterator a;
            private org.jsoup.nodes.a b;
            final org.jsoup.nodes.b.b c;

            private a() {
                this.a = b$b0.a.iterator();
            }

            a(org.jsoup.nodes.b.a b$a0) {
            }

            public Map.Entry a() {
                return new org.jsoup.nodes.a(this.b.c().substring(5), this.b.e());
            }

            @Override
            public boolean hasNext() {
                while(this.a.hasNext()) {
                    Object object0 = this.a.next();
                    this.b = (org.jsoup.nodes.a)object0;
                    if(((org.jsoup.nodes.a)object0).m()) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                return false;
            }

            @Override
            public Object next() {
                return this.a();
            }

            @Override
            public void remove() {
                org.jsoup.nodes.b.b.this.a.N(this.b.c());
            }
        }

        class org.jsoup.nodes.b.b.b extends AbstractSet {
            final org.jsoup.nodes.b.b a;

            private org.jsoup.nodes.b.b.b() {
            }

            org.jsoup.nodes.b.b.b(org.jsoup.nodes.b.a b$a0) {
            }

            @Override
            public Iterator iterator() {
                return new a(org.jsoup.nodes.b.b.this, null);
            }

            @Override
            public int size() {
                int v = 0;
                a b$b$a0 = new a(org.jsoup.nodes.b.b.this, null);
                while(b$b$a0.hasNext()) {
                    ++v;
                }
                return v;
            }
        }

        private final b a;

        private org.jsoup.nodes.b.b(b b0) {
            this.a = b0;
        }

        org.jsoup.nodes.b.b(b b0, org.jsoup.nodes.b.a b$a0) {
            this(b0);
        }

        public String b(String s, String s1) {
            String s2 = b.c(s);
            String s3 = this.a.y(s2) ? this.a.r(s2) : null;
            this.a.H(s2, s1);
            return s3;
        }

        @Override
        public Set entrySet() {
            return new org.jsoup.nodes.b.b.b(this, null);
        }

        @Override
        public Object put(Object object0, Object object1) {
            return this.b(((String)object0), ((String)object1));
        }
    }

    private int a;
    String[] b;
    Object[] c;
    static final char d = '/';
    protected static final String e = "data-";
    private static final int f = 3;
    private static final int g = 2;
    static final int h = -1;
    private static final String i = "";

    public b() {
        this.a = 0;
        this.b = new String[3];
        this.c = new Object[3];
    }

    public String A() [...] // 潜在的解密器

    final void B(Appendable appendable0, org.jsoup.nodes.f.a f$a0) throws IOException {
        int v = this.a;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!b.F(this.b[v1])) {
                String s = org.jsoup.nodes.a.d(this.b[v1], f$a0.r());
                if(s != null) {
                    org.jsoup.nodes.a.k(s, ((String)this.c[v1]), appendable0.append(' '), f$a0);
                }
            }
        }
    }

    int C(String s) {
        i.o(s);
        for(int v = 0; v < this.a; ++v) {
            if(s.equals(this.b[v])) {
                return v;
            }
        }
        return -1;
    }

    private int D(String s) {
        i.o(s);
        for(int v = 0; v < this.a; ++v) {
            if(s.equalsIgnoreCase(this.b[v])) {
                return v;
            }
        }
        return -1;
    }

    static String E(String s) [...] // Inlined contents

    static boolean F(String s) {
        return s != null && s.length() > 1 && s.charAt(0) == 0x2F;
    }

    public void G() {
        for(int v = 0; v < this.a; ++v) {
            if(!b.F(this.b[v])) {
                this.b[v] = g.a(this.b[v]);
            }
        }
    }

    public b H(String s, String s1) {
        i.o(s);
        int v = this.C(s);
        if(v != -1) {
            this.c[v] = s1;
            return this;
        }
        this.d(s, s1);
        return this;
    }

    public b I(String s, boolean z) {
        if(z) {
            this.K(s, null);
            return this;
        }
        this.N(s);
        return this;
    }

    public b J(org.jsoup.nodes.a a0) {
        i.o(a0);
        this.H(a0.c(), a0.e());
        a0.c = this;
        return this;
    }

    void K(String s, String s1) {
        int v = this.D(s);
        if(v == -1) {
            this.d(s, s1);
        }
        else {
            this.c[v] = s1;
            if(!this.b[v].equals(s)) {
                this.b[v] = s;
            }
        }
    }

    private void M(int v) {
        i.f(v >= this.a);
        int v1 = this.a - v - 1;
        if(v1 > 0) {
            System.arraycopy(this.b, v + 1, this.b, v, v1);
            System.arraycopy(this.c, v + 1, this.c, v, v1);
        }
        int v2 = this.a - 1;
        this.a = v2;
        this.b[v2] = null;
        this.c[v2] = null;
    }

    public void N(String s) {
        int v = this.C(s);
        if(v != -1) {
            this.M(v);
        }
    }

    public void O(String s) {
        int v = this.D(s);
        if(v != -1) {
            this.M(v);
        }
    }

    public org.jsoup.nodes.x.a P(String s) {
        if(!this.y(s)) {
            return org.jsoup.nodes.x.a.c;
        }
        Map map0 = this.u();
        if(map0 == null) {
            return org.jsoup.nodes.x.a.c;
        }
        org.jsoup.nodes.x.a x$a0 = (org.jsoup.nodes.x.a)map0.get(s);
        return x$a0 == null ? org.jsoup.nodes.x.a.c : x$a0;
    }

    public Object Q(String s) {
        i.o(s);
        return this.y("/jsoup.userdata") ? this.R().get(s) : null;
    }

    Map R() {
        int v = this.C("/jsoup.userdata");
        if(v == -1) {
            Map map0 = new HashMap();
            this.h("/jsoup.userdata", map0);
            return map0;
        }
        return (Map)this.c[v];
    }

    public b S(String s, Object object0) {
        i.o(s);
        this.R().put(s, object0);
        return this;
    }

    static String c(String s) {
        return "data-" + s;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.n();
    }

    public b d(String s, String s1) {
        this.h(s, s1);
        return this;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || this.a != ((b)object0).a) {
            return false;
        }
        for(int v = 0; v < this.a; ++v) {
            int v1 = ((b)object0).C(this.b[v]);
            if(v1 == -1) {
                return false;
            }
            Object object1 = this.c[v];
            Object object2 = ((b)object0).c[v1];
            if(object1 == null) {
                if(object2 != null) {
                    return false;
                }
            }
            else if(!object1.equals(object2)) {
                return false;
            }
        }
        return true;
    }

    public void g(b b0) {
        if(b0.size() == 0) {
            return;
        }
        this.l(this.a + b0.a);
        boolean z = this.a != 0;
        for(Object object0: b0) {
            org.jsoup.nodes.a a0 = (org.jsoup.nodes.a)object0;
            if(z) {
                this.J(a0);
            }
            else {
                this.d(a0.c(), a0.e());
            }
        }
    }

    private void h(String s, Object object0) {
        this.l(this.a + 1);
        int v = this.a;
        this.b[v] = s;
        this.c[v] = object0;
        this.a = v + 1;
    }

    @Override
    public int hashCode() {
        return (this.a * 0x1F + Arrays.hashCode(this.b)) * 0x1F + Arrays.hashCode(this.c);
    }

    public boolean isEmpty() {
        return this.a == 0;
    }

    @Override
    public Iterator iterator() {
        class org.jsoup.nodes.b.a implements Iterator {
            int a;
            int b;
            final b c;

            org.jsoup.nodes.b.a() {
                this.a = b0.a;
                this.b = 0;
            }

            private void a() {
                if(b.this.a != this.a) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
            }

            public org.jsoup.nodes.a b() {
                this.a();
                if(this.b >= b.this.a) {
                    throw new NoSuchElementException();
                }
                org.jsoup.nodes.a a0 = new org.jsoup.nodes.a(b.this.b[this.b], ((String)b.this.c[this.b]), b.this);
                ++this.b;
                return a0;
            }

            @Override
            public boolean hasNext() {
                this.a();
                while(this.b < b.this.a && b.F(b.this.b[this.b])) {
                    ++this.b;
                }
                return this.b < b.this.a;
            }

            @Override
            public Object next() {
                return this.b();
            }

            @Override
            public void remove() {
                int v = this.b - 1;
                this.b = v;
                b.this.M(v);
                --this.a;
            }
        }

        return new org.jsoup.nodes.b.a(this);
    }

    public List j() {
        ArrayList arrayList0 = new ArrayList(this.a);
        for(int v = 0; v < this.a; ++v) {
            if(!b.F(this.b[v])) {
                arrayList0.add(new org.jsoup.nodes.a(this.b[v], ((String)this.c[v]), this));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    public org.jsoup.nodes.a k(String s) {
        int v = this.C(s);
        return v == -1 ? null : new org.jsoup.nodes.a(s, b.m(this.c[v]), this);
    }

    private void l(int v) {
        int v1 = 3;
        i.h(v >= this.a);
        String[] arr_s = this.b;
        if(arr_s.length >= v) {
            return;
        }
        if(arr_s.length >= 3) {
            v1 = this.a * 2;
        }
        if(v <= v1) {
            v = v1;
        }
        this.b = (String[])Arrays.copyOf(arr_s, v);
        this.c = Arrays.copyOf(this.c, v);
    }

    static String m(Object object0) {
        return object0 == null ? "" : ((String)object0);
    }

    public b n() {
        b b0;
        try {
            b0 = (b)super.clone();
        }
        catch(CloneNotSupportedException cloneNotSupportedException0) {
            throw new RuntimeException(cloneNotSupportedException0);
        }
        b0.a = this.a;
        b0.b = (String[])Arrays.copyOf(this.b, this.a);
        b0.c = Arrays.copyOf(this.c, this.a);
        return b0;
    }

    private static String o(String s) [...] // Inlined contents

    public Map p() {
        return new org.jsoup.nodes.b.b(this, null);
    }

    public int q(f f0) {
        if(this.isEmpty()) {
            return 0;
        }
        boolean z = f0.e();
        int v1 = 0;
        for(int v = 0; v < this.b.length; ++v) {
            for(int v2 = v + 1; true; ++v2) {
                String[] arr_s = this.b;
                if(v2 >= arr_s.length) {
                    break;
                }
                String s = arr_s[v2];
                if(s == null) {
                    break;
                }
                if(z && arr_s[v].equals(s) || !z && this.b[v].equalsIgnoreCase(this.b[v2])) {
                    ++v1;
                    this.M(v2);
                    --v2;
                }
            }
        }
        return v1;
    }

    public String r(String s) [...] // 潜在的解密器

    public int size() {
        return this.a;
    }

    public String t(String s) [...] // 潜在的解密器

    // 去混淆评级： 低(20)
    @Override
    public String toString() [...] // 潜在的解密器

    Map u() {
        return (Map)this.Q("jsoup.attrs");
    }

    public boolean v(String s) {
        int v = this.C(s);
        return v != -1 && this.c[v] != null;
    }

    public boolean x(String s) {
        int v = this.D(s);
        return v != -1 && this.c[v] != null;
    }

    public boolean y(String s) {
        return this.C(s) != -1;
    }

    public boolean z(String s) {
        return this.D(s) != -1;
    }
}

