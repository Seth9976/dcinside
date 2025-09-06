package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import java.util.List;

final class k extends u {
    static class a {
    }

    static final class b extends com.google.android.datatransport.cct.internal.u.a {
        private Long a;
        private Long b;
        private o c;
        private Integer d;
        private String e;
        private List f;
        private x g;

        @Override  // com.google.android.datatransport.cct.internal.u$a
        public u a() {
            String s = this.a == null ? " requestTimeMs" : "";
            if(this.b == null) {
                s = s + " requestUptimeMs";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new k(((long)this.a), ((long)this.b), this.c, this.d, this.e, this.f, this.g, null);
        }

        @Override  // com.google.android.datatransport.cct.internal.u$a
        public com.google.android.datatransport.cct.internal.u.a b(@Nullable o o0) {
            this.c = o0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.u$a
        public com.google.android.datatransport.cct.internal.u.a c(@Nullable List list0) {
            this.f = list0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.u$a
        com.google.android.datatransport.cct.internal.u.a d(@Nullable Integer integer0) {
            this.d = integer0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.u$a
        com.google.android.datatransport.cct.internal.u.a e(@Nullable String s) {
            this.e = s;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.u$a
        public com.google.android.datatransport.cct.internal.u.a f(@Nullable x x0) {
            this.g = x0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.u$a
        public com.google.android.datatransport.cct.internal.u.a g(long v) {
            this.a = v;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.u$a
        public com.google.android.datatransport.cct.internal.u.a h(long v) {
            this.b = v;
            return this;
        }
    }

    private final long a;
    private final long b;
    private final o c;
    private final Integer d;
    private final String e;
    private final List f;
    private final x g;

    private k(long v, long v1, @Nullable o o0, @Nullable Integer integer0, @Nullable String s, @Nullable List list0, @Nullable x x0) {
        this.a = v;
        this.b = v1;
        this.c = o0;
        this.d = integer0;
        this.e = s;
        this.f = list0;
        this.g = x0;
    }

    k(long v, long v1, o o0, Integer integer0, String s, List list0, x x0, a k$a0) {
        this(v, v1, o0, integer0, s, list0, x0);
    }

    @Override  // com.google.android.datatransport.cct.internal.u
    @Nullable
    public o b() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.cct.internal.u
    @Nullable
    @c2.a.a(name = "logEvent")
    public List c() {
        return this.f;
    }

    @Override  // com.google.android.datatransport.cct.internal.u
    @Nullable
    public Integer d() {
        return this.d;
    }

    @Override  // com.google.android.datatransport.cct.internal.u
    @Nullable
    public String e() {
        return this.e;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof u) {
            long v = ((u)object0).g();
            if(this.a == v) {
                long v1 = ((u)object0).h();
                if(this.b == v1) {
                    o o0 = this.c;
                    if(o0 != null) {
                        if(o0.equals(((u)object0).b())) {
                        label_12:
                            Integer integer0 = this.d;
                            if(integer0 != null) {
                                if(integer0.equals(((u)object0).d())) {
                                label_17:
                                    String s = this.e;
                                    if(s != null) {
                                        if(s.equals(((u)object0).e())) {
                                        label_22:
                                            List list0 = this.f;
                                            if(list0 == null) {
                                                if(((u)object0).c() == null) {
                                                    return this.g == null ? ((u)object0).f() == null : this.g.equals(((u)object0).f());
                                                }
                                            }
                                            else if(list0.equals(((u)object0).c())) {
                                                return this.g == null ? ((u)object0).f() == null : this.g.equals(((u)object0).f());
                                            }
                                        }
                                    }
                                    else if(((u)object0).e() == null) {
                                        goto label_22;
                                    }
                                }
                            }
                            else if(((u)object0).d() == null) {
                                goto label_17;
                            }
                        }
                    }
                    else if(((u)object0).b() == null) {
                        goto label_12;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.cct.internal.u
    @Nullable
    public x f() {
        return this.g;
    }

    @Override  // com.google.android.datatransport.cct.internal.u
    public long g() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.cct.internal.u
    public long h() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = ((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ ((int)(this.b >>> 0x20 ^ this.b))) * 1000003;
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        int v4 = this.e == null ? 0 : this.e.hashCode();
        int v5 = this.f == null ? 0 : this.f.hashCode();
        x x0 = this.g;
        if(x0 != null) {
            v1 = x0.hashCode();
        }
        return ((((v ^ v2) * 1000003 ^ v3) * 1000003 ^ v4) * 1000003 ^ v5) * 1000003 ^ v1;
    }

    @Override
    public String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}

