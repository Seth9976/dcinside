package com.google.android.datatransport.cct.internal;

import androidx.annotation.Nullable;
import java.util.Arrays;

final class j extends t {
    static class a {
    }

    static final class b extends com.google.android.datatransport.cct.internal.t.a {
        private Long a;
        private Integer b;
        private p c;
        private Long d;
        private byte[] e;
        private String f;
        private Long g;
        private w h;
        private q i;

        @Override  // com.google.android.datatransport.cct.internal.t$a
        public t a() {
            String s = this.a == null ? " eventTimeMs" : "";
            if(this.d == null) {
                s = s + " eventUptimeMs";
            }
            if(this.g == null) {
                s = s + " timezoneOffsetSeconds";
            }
            if(!s.isEmpty()) {
                throw new IllegalStateException("Missing required properties:" + s);
            }
            return new j(((long)this.a), this.b, this.c, ((long)this.d), this.e, this.f, ((long)this.g), this.h, this.i, null);
        }

        @Override  // com.google.android.datatransport.cct.internal.t$a
        public com.google.android.datatransport.cct.internal.t.a b(@Nullable p p0) {
            this.c = p0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.t$a
        public com.google.android.datatransport.cct.internal.t.a c(@Nullable Integer integer0) {
            this.b = integer0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.t$a
        public com.google.android.datatransport.cct.internal.t.a d(long v) {
            this.a = v;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.t$a
        public com.google.android.datatransport.cct.internal.t.a e(long v) {
            this.d = v;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.t$a
        public com.google.android.datatransport.cct.internal.t.a f(@Nullable q q0) {
            this.i = q0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.t$a
        public com.google.android.datatransport.cct.internal.t.a g(@Nullable w w0) {
            this.h = w0;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.t$a
        com.google.android.datatransport.cct.internal.t.a h(@Nullable byte[] arr_b) {
            this.e = arr_b;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.t$a
        com.google.android.datatransport.cct.internal.t.a i(@Nullable String s) {
            this.f = s;
            return this;
        }

        @Override  // com.google.android.datatransport.cct.internal.t$a
        public com.google.android.datatransport.cct.internal.t.a j(long v) {
            this.g = v;
            return this;
        }
    }

    private final long a;
    private final Integer b;
    private final p c;
    private final long d;
    private final byte[] e;
    private final String f;
    private final long g;
    private final w h;
    private final q i;

    private j(long v, @Nullable Integer integer0, @Nullable p p0, long v1, @Nullable byte[] arr_b, @Nullable String s, long v2, @Nullable w w0, @Nullable q q0) {
        this.a = v;
        this.b = integer0;
        this.c = p0;
        this.d = v1;
        this.e = arr_b;
        this.f = s;
        this.g = v2;
        this.h = w0;
        this.i = q0;
    }

    j(long v, Integer integer0, p p0, long v1, byte[] arr_b, String s, long v2, w w0, q q0, a j$a0) {
        this(v, integer0, p0, v1, arr_b, s, v2, w0, q0);
    }

    @Override  // com.google.android.datatransport.cct.internal.t
    @Nullable
    public p b() {
        return this.c;
    }

    @Override  // com.google.android.datatransport.cct.internal.t
    @Nullable
    public Integer c() {
        return this.b;
    }

    @Override  // com.google.android.datatransport.cct.internal.t
    public long d() {
        return this.a;
    }

    @Override  // com.google.android.datatransport.cct.internal.t
    public long e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof t) {
            long v = ((t)object0).d();
            if(this.a == v) {
                Integer integer0 = this.b;
                if(integer0 != null) {
                    if(integer0.equals(((t)object0).c())) {
                    label_10:
                        p p0 = this.c;
                        if(p0 != null) {
                            if(p0.equals(((t)object0).b())) {
                            label_15:
                                long v1 = ((t)object0).e();
                                if(this.d == v1) {
                                    byte[] arr_b = ((t)object0) instanceof j ? ((j)(((t)object0))).e : ((t)object0).h();
                                    if(Arrays.equals(this.e, arr_b)) {
                                        String s = this.f;
                                        if(s != null) {
                                            if(s.equals(((t)object0).i())) {
                                            label_24:
                                                long v2 = ((t)object0).j();
                                                if(this.g == v2) {
                                                    w w0 = this.h;
                                                    if(w0 == null) {
                                                        if(((t)object0).g() == null) {
                                                            return this.i == null ? ((t)object0).f() == null : this.i.equals(((t)object0).f());
                                                        }
                                                    }
                                                    else if(w0.equals(((t)object0).g())) {
                                                        return this.i == null ? ((t)object0).f() == null : this.i.equals(((t)object0).f());
                                                    }
                                                }
                                            }
                                        }
                                        else if(((t)object0).i() == null) {
                                            goto label_24;
                                        }
                                    }
                                }
                            }
                        }
                        else if(((t)object0).b() == null) {
                            goto label_15;
                        }
                    }
                }
                else if(((t)object0).c() == null) {
                    goto label_10;
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.android.datatransport.cct.internal.t
    @Nullable
    public q f() {
        return this.i;
    }

    @Override  // com.google.android.datatransport.cct.internal.t
    @Nullable
    public w g() {
        return this.h;
    }

    @Override  // com.google.android.datatransport.cct.internal.t
    @Nullable
    public byte[] h() {
        return this.e;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = Arrays.hashCode(this.e);
        int v2 = (((((((((int)(this.a ^ this.a >>> 0x20)) ^ 1000003) * 1000003 ^ (this.b == null ? 0 : this.b.hashCode())) * 1000003 ^ (this.c == null ? 0 : this.c.hashCode())) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ v1) * 1000003 ^ (this.f == null ? 0 : this.f.hashCode())) * 1000003 ^ ((int)(this.g >>> 0x20 ^ this.g))) * 1000003;
        int v3 = this.h == null ? 0 : this.h.hashCode();
        q q0 = this.i;
        if(q0 != null) {
            v = q0.hashCode();
        }
        return (v2 ^ v3) * 1000003 ^ v;
    }

    @Override  // com.google.android.datatransport.cct.internal.t
    @Nullable
    public String i() {
        return this.f;
    }

    @Override  // com.google.android.datatransport.cct.internal.t
    public long j() {
        return this.g;
    }

    @Override
    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}

