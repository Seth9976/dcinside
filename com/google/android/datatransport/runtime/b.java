package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

final class b extends j {
    static class a {
    }

    static final class com.google.android.datatransport.runtime.b.b extends com.google.android.datatransport.runtime.j.a {
        private String a;
        private Integer b;
        private i c;
        private Long d;
        private Long e;
        private Map f;
        private Integer g;
        private String h;
        private byte[] i;
        private byte[] j;

        @Override  // com.google.android.datatransport.runtime.j$a
        public j d() {
            String s = this.a == null ? " transportName" : "";
            if(this.c == null) {
                s = s + " encodedPayload";
            }
            if(this.d == null) {
                s = s + " eventMillis";
            }
            if(this.e == null) {
                s = s + " uptimeMillis";
            }
            if(this.f == null) {
                s = s + " autoMetadata";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new b(this.a, this.b, this.c, ((long)this.d), ((long)this.e), this.f, this.g, this.h, this.i, this.j, null);
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        protected Map e() {
            Map map0 = this.f;
            if(map0 == null) {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            return map0;
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        protected com.google.android.datatransport.runtime.j.a f(Map map0) {
            if(map0 == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f = map0;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        public com.google.android.datatransport.runtime.j.a g(Integer integer0) {
            this.b = integer0;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        public com.google.android.datatransport.runtime.j.a h(i i0) {
            if(i0 == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.c = i0;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        public com.google.android.datatransport.runtime.j.a i(long v) {
            this.d = v;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        public com.google.android.datatransport.runtime.j.a j(byte[] arr_b) {
            this.i = arr_b;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        public com.google.android.datatransport.runtime.j.a k(byte[] arr_b) {
            this.j = arr_b;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        public com.google.android.datatransport.runtime.j.a l(Integer integer0) {
            this.g = integer0;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        public com.google.android.datatransport.runtime.j.a m(String s) {
            this.h = s;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        public com.google.android.datatransport.runtime.j.a n(String s) {
            if(s == null) {
                throw new NullPointerException("Null transportName");
            }
            this.a = s;
            return this;
        }

        @Override  // com.google.android.datatransport.runtime.j$a
        public com.google.android.datatransport.runtime.j.a o(long v) {
            this.e = v;
            return this;
        }
    }

    private final String a;
    private final Integer b;
    private final i c;
    private final long d;
    private final long e;
    private final Map f;
    private final Integer g;
    private final String h;
    private final byte[] i;
    private final byte[] j;

    private b(String s, @Nullable Integer integer0, i i0, long v, long v1, Map map0, @Nullable Integer integer1, @Nullable String s1, @Nullable byte[] arr_b, @Nullable byte[] arr_b1) {
        this.a = s;
        this.b = integer0;
        this.c = i0;
        this.d = v;
        this.e = v1;
        this.f = map0;
        this.g = integer1;
        this.h = s1;
        this.i = arr_b;
        this.j = arr_b1;
    }

    b(String s, Integer integer0, i i0, long v, long v1, Map map0, Integer integer1, String s1, byte[] arr_b, byte[] arr_b1, a b$a0) {
        this(s, integer0, i0, v, v1, map0, integer1, s1, arr_b, arr_b1);
    }

    @Override  // com.google.android.datatransport.runtime.j
    protected Map c() {
        return this.f;
    }

    @Override  // com.google.android.datatransport.runtime.j
    @Nullable
    public Integer d() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.runtime.j
    public i e() {
        return this.c;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof j) {
            String s = ((j)object0).p();
            if(this.a.equals(s)) {
                Integer integer0 = this.b;
                if(integer0 != null) {
                    if(integer0.equals(((j)object0).d())) {
                    label_10:
                        i i0 = ((j)object0).e();
                        if(this.c.equals(i0)) {
                            long v = ((j)object0).f();
                            if(this.d == v) {
                                long v1 = ((j)object0).q();
                                if(this.e == v1) {
                                    Map map0 = ((j)object0).c();
                                    if(this.f.equals(map0)) {
                                        Integer integer1 = this.g;
                                        if(integer1 != null) {
                                            if(integer1.equals(((j)object0).n())) {
                                            label_23:
                                                String s1 = this.h;
                                                if(s1 != null) {
                                                    if(s1.equals(((j)object0).o())) {
                                                    label_28:
                                                        byte[] arr_b = ((j)object0) instanceof b ? ((b)(((j)object0))).i : ((j)object0).g();
                                                        if(Arrays.equals(this.i, arr_b)) {
                                                            byte[] arr_b1 = ((j)object0) instanceof b ? ((b)(((j)object0))).j : ((j)object0).h();
                                                            return Arrays.equals(this.j, arr_b1);
                                                        }
                                                    }
                                                }
                                                else if(((j)object0).o() == null) {
                                                    goto label_28;
                                                }
                                            }
                                        }
                                        else if(((j)object0).n() == null) {
                                            goto label_23;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else if(((j)object0).d() == null) {
                    goto label_10;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.runtime.j
    public long f() {
        return this.d;
    }

    @Override  // com.google.android.datatransport.runtime.j
    @Nullable
    public byte[] g() {
        return this.i;
    }

    @Override  // com.google.android.datatransport.runtime.j
    @Nullable
    public byte[] h() {
        return this.j;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = ((((((this.a.hashCode() ^ 1000003) * 1000003 ^ (this.b == null ? 0 : this.b.hashCode())) * 1000003 ^ this.c.hashCode()) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ this.f.hashCode()) * 1000003;
        int v2 = this.g == null ? 0 : this.g.hashCode();
        String s = this.h;
        if(s != null) {
            v = s.hashCode();
        }
        return (((v1 ^ v2) * 1000003 ^ v) * 1000003 ^ Arrays.hashCode(this.i)) * 1000003 ^ Arrays.hashCode(this.j);
    }

    @Override  // com.google.android.datatransport.runtime.j
    @Nullable
    public Integer n() {
        return this.g;
    }

    @Override  // com.google.android.datatransport.runtime.j
    @Nullable
    public String o() {
        return this.h;
    }

    @Override  // com.google.android.datatransport.runtime.j
    public String p() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.runtime.j
    public long q() {
        return this.e;
    }

    @Override
    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}

