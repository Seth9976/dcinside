package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.Nullable;

final class u extends c {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.d.c.a {
        private Double a;
        private int b;
        private boolean c;
        private int d;
        private long e;
        private long f;
        private byte g;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c$a
        public c a() {
            if(this.g != 0x1F) {
                StringBuilder stringBuilder0 = new StringBuilder();
                if((this.g & 1) == 0) {
                    stringBuilder0.append(" batteryVelocity");
                }
                if((this.g & 2) == 0) {
                    stringBuilder0.append(" proximityOn");
                }
                if((this.g & 4) == 0) {
                    stringBuilder0.append(" orientation");
                }
                if((this.g & 8) == 0) {
                    stringBuilder0.append(" ramUsed");
                }
                if((this.g & 16) == 0) {
                    stringBuilder0.append(" diskUsed");
                }
                throw new IllegalStateException("Missing required properties:" + stringBuilder0);
            }
            return new u(this.a, this.b, this.c, this.d, this.e, this.f, null);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.c.a b(Double double0) {
            this.a = double0;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.c.a c(int v) {
            this.b = v;
            this.g = (byte)(this.g | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.c.a d(long v) {
            this.f = v;
            this.g = (byte)(this.g | 16);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.c.a e(int v) {
            this.d = v;
            this.g = (byte)(this.g | 4);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.c.a f(boolean z) {
            this.c = z;
            this.g = (byte)(this.g | 2);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.d.c.a g(long v) {
            this.e = v;
            this.g = (byte)(this.g | 8);
            return this;
        }
    }

    private final Double a;
    private final int b;
    private final boolean c;
    private final int d;
    private final long e;
    private final long f;

    private u(@Nullable Double double0, int v, boolean z, int v1, long v2, long v3) {
        this.a = double0;
        this.b = v;
        this.c = z;
        this.d = v1;
        this.e = v2;
        this.f = v3;
    }

    u(Double double0, int v, boolean z, int v1, long v2, long v3, a u$a0) {
        this(double0, v, z, v1, v2, v3);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c
    @Nullable
    public Double b() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c
    public int c() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c
    public long d() {
        return this.f;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c
    public int e() {
        return this.d;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof c) {
            Double double0 = this.a;
            if(double0 != null) {
                if(double0.equals(((c)object0).b())) {
                label_8:
                    int v = ((c)object0).c();
                    if(this.b == v) {
                        boolean z = ((c)object0).g();
                        if(this.c == z) {
                            int v1 = ((c)object0).e();
                            if(this.d == v1) {
                                long v2 = ((c)object0).f();
                                if(this.e == v2) {
                                    long v3 = ((c)object0).d();
                                    return this.f == v3;
                                }
                            }
                        }
                    }
                }
            }
            else if(((c)object0).b() == null) {
                goto label_8;
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c
    public long f() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$d$c
    public boolean g() {
        return this.c;
    }

    @Override
    public int hashCode() {
        int v = (((this.a == null ? 0 : this.a.hashCode()) ^ 1000003) * 1000003 ^ this.b) * 1000003;
        return this.c ? (((v ^ 0x4CF) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20)) : (((v ^ 0x4D5) * 1000003 ^ this.d) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003 ^ ((int)(this.f ^ this.f >>> 0x20));
    }

    @Override
    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.d + ", ramUsed=" + this.e + ", diskUsed=" + this.f + "}";
    }
}

