package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.I;
import com.fasterxml.jackson.databind.jsontype.j;
import com.fasterxml.jackson.databind.p;
import com.fasterxml.jackson.databind.q;
import com.fasterxml.jackson.databind.y;
import com.fasterxml.jackson.databind.z;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;

final class k {
    static final class a {
        private Iterator[] a;
        private int b;
        private int c;

        public Iterator a() {
            int v = this.b;
            if(v == 0) {
                return null;
            }
            this.b = v - 1;
            return this.a[v - 1];
        }

        public void b(Iterator iterator0) {
            int v = this.b;
            int v1 = this.c;
            if(v < v1) {
                this.b = v + 1;
                this.a[v] = iterator0;
                return;
            }
            if(this.a == null) {
                this.c = 10;
                this.a = new Iterator[10];
            }
            else {
                int v2 = v1 + Math.min(4000, Math.max(20, v1 >> 1));
                this.c = v2;
                this.a = (Iterator[])Arrays.copyOf(this.a, v2);
            }
            int v3 = this.b;
            this.b = v3 + 1;
            this.a[v3] = iterator0;
        }
    }

    public static class b extends com.fasterxml.jackson.databind.q.a {
        protected final com.fasterxml.jackson.databind.node.b a;
        protected I b;

        public b(com.fasterxml.jackson.databind.node.b b0) {
            this.a = b0;
        }

        @Override  // com.fasterxml.jackson.databind.q
        public void H(com.fasterxml.jackson.core.k k0, I i0, j j0) throws IOException {
            this.P(k0, i0);
        }

        @Override  // com.fasterxml.jackson.databind.q
        public void P(com.fasterxml.jackson.core.k k0, I i0) throws IOException {
            this.b = i0;
            this.V(k0, this.a);
        }

        protected void V(com.fasterxml.jackson.core.k k0, p p0) throws IOException {
            if(p0 instanceof u) {
                k0.F4(this, p0.size());
                this.W(k0, new a(), p0.A0());
                return;
            }
            if(p0 instanceof com.fasterxml.jackson.databind.node.a) {
                k0.C4(this, p0.size());
                this.W(k0, new a(), p0.y0());
                return;
            }
            p0.P(k0, this.b);
        }

        protected void W(com.fasterxml.jackson.core.k k0, a k$a0, Iterator iterator0) throws IOException {
            p p0;
            while(true) {
                if(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(object0 instanceof Map.Entry) {
                        k0.v3(((String)((Map.Entry)object0).getKey()));
                        p0 = (p)((Map.Entry)object0).getValue();
                    }
                    else {
                        p0 = (p)object0;
                    }
                    if(p0 instanceof u) {
                        k$a0.b(iterator0);
                        iterator0 = p0.A0();
                        k0.F4(p0, p0.size());
                    }
                    else if(p0 instanceof com.fasterxml.jackson.databind.node.a) {
                        k$a0.b(iterator0);
                        iterator0 = p0.y0();
                        k0.C4(p0, p0.size());
                    }
                    else if(p0 instanceof v) {
                        try {
                            p0.P(k0, this.b);
                        }
                        catch(IOException | RuntimeException iOException0) {
                            k0.d(String.format("[ERROR: (%s) %s]", iOException0.getClass().getName(), iOException0.getMessage()));
                        }
                    }
                    else {
                        p0.P(k0, this.b);
                    }
                }
                else {
                    if(k0.T0().l()) {
                        k0.n3();
                    }
                    else {
                        k0.p3();
                    }
                    iterator0 = k$a0.a();
                    if(iterator0 == null) {
                        break;
                    }
                }
            }
        }
    }

    private static final com.fasterxml.jackson.databind.json.a a;
    private static final z b;
    private static final z c;
    private static final y d;

    static {
        com.fasterxml.jackson.databind.json.a a0 = new com.fasterxml.jackson.databind.json.a();
        k.a = a0;
        k.b = a0.f4();
        k.c = a0.f4().b0();
        k.d = a0.P2(p.class);
    }

    private static q a(com.fasterxml.jackson.databind.node.b b0) {
        return new b(b0);
    }

    public static p b(byte[] arr_b) throws IOException {
        return (p)k.d.c1(arr_b);
    }

    public static String c(com.fasterxml.jackson.databind.node.b b0) {
        try {
            q q0 = k.a(b0);
            return k.c.J0(q0);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    public static String d(com.fasterxml.jackson.databind.node.b b0) {
        try {
            q q0 = k.a(b0);
            return k.b.J0(q0);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(iOException0);
        }
    }

    public static byte[] e(Object object0) throws IOException {
        return k.a.d4(object0);
    }
}

