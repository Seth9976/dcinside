package com.google.android.datatransport.runtime;

import com.google.android.datatransport.e;
import com.google.android.datatransport.f;
import com.google.android.datatransport.k;

final class c extends q {
    static class a {
    }

    static final class b extends com.google.android.datatransport.runtime.q.a {
        private r a;
        private String b;
        private f c;
        private k d;
        private e e;

        @Override  // com.google.android.datatransport.runtime.q$a
        public q a() {
            String s = this.a == null ? " transportContext" : "";
            if(this.b == null) {
                s = s + " transportName";
            }
            if(this.c == null) {
                s = s + " event";
            }
            if(this.d == null) {
                s = s + " transformer";
            }
            if(this.e == null) {
                s = s + " encoding";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new c(this.a, this.b, this.c, this.d, this.e, null);
        }

        @Override  // com.google.android.datatransport.runtime.q$a
        com.google.android.datatransport.runtime.q.a b(e e0) {
            if(e0 == null) {
                throw new NullPointerException("Null encoding");
            }
            this.e = e0;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.q$a
        com.google.android.datatransport.runtime.q.a c(f f0) {
            if(f0 == null) {
                throw new NullPointerException("Null event");
            }
            this.c = f0;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.q$a
        com.google.android.datatransport.runtime.q.a e(k k0) {
            if(k0 == null) {
                throw new NullPointerException("Null transformer");
            }
            this.d = k0;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.q$a
        public com.google.android.datatransport.runtime.q.a f(r r0) {
            if(r0 == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.a = r0;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.q$a
        public com.google.android.datatransport.runtime.q.a g(String s) {
            if(s == null) {
                throw new NullPointerException("Null transportName");
            }
            this.b = s;
            return this;
        }
    }

    private final r a;
    private final String b;
    private final f c;
    private final k d;
    private final e e;

    private c(r r0, String s, f f0, k k0, e e0) {
        this.a = r0;
        this.b = s;
        this.c = f0;
        this.d = k0;
        this.e = e0;
    }

    c(r r0, String s, f f0, k k0, e e0, a c$a0) {
        this(r0, s, f0, k0, e0);
    }

    @Override  // com.google.android.datatransport.runtime.q
    public e b() {
        return this.e;
    }

    @Override  // com.google.android.datatransport.runtime.q
    f c() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.runtime.q
    k e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof q) {
            r r0 = ((q)object0).f();
            if(this.a.equals(r0)) {
                String s = ((q)object0).g();
                if(this.b.equals(s)) {
                    f f0 = ((q)object0).c();
                    if(this.c.equals(f0)) {
                        k k0 = ((q)object0).e();
                        if(this.d.equals(k0)) {
                            e e0 = ((q)object0).b();
                            return this.e.equals(e0);
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.runtime.q
    public r f() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.q
    public String g() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }

    @Override
    public String toString() {
        return "SendRequest{transportContext=" + this.a + ", transportName=" + this.b + ", event=" + this.c + ", transformer=" + this.d + ", encoding=" + this.e + "}";
    }
}

