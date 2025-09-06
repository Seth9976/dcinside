package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;

final class k extends c {
    static class a {
    }

    static final class b extends com.google.firebase.crashlytics.internal.model.F.f.c.a {
        private int a;
        private String b;
        private int c;
        private long d;
        private long e;
        private boolean f;
        private int g;
        private String h;
        private String i;
        private byte j;

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$c$a
        public c a() {
            if(this.j == 0x3F) {
                String s = this.b;
                if(s != null) {
                    String s1 = this.h;
                    if(s1 != null) {
                        String s2 = this.i;
                        if(s2 != null) {
                            return new k(this.a, s, this.c, this.d, this.e, this.f, this.g, s1, s2, null);
                        }
                    }
                }
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            if((this.j & 1) == 0) {
                stringBuilder0.append(" arch");
            }
            if(this.b == null) {
                stringBuilder0.append(" model");
            }
            if((this.j & 2) == 0) {
                stringBuilder0.append(" cores");
            }
            if((this.j & 4) == 0) {
                stringBuilder0.append(" ram");
            }
            if((this.j & 8) == 0) {
                stringBuilder0.append(" diskSpace");
            }
            if((this.j & 16) == 0) {
                stringBuilder0.append(" simulator");
            }
            if((this.j & 0x20) == 0) {
                stringBuilder0.append(" state");
            }
            if(this.h == null) {
                stringBuilder0.append(" manufacturer");
            }
            if(this.i == null) {
                stringBuilder0.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + stringBuilder0);
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.c.a b(int v) {
            this.a = v;
            this.j = (byte)(this.j | 1);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.c.a c(int v) {
            this.c = v;
            this.j = (byte)(this.j | 2);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.c.a d(long v) {
            this.e = v;
            this.j = (byte)(this.j | 8);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.c.a e(String s) {
            if(s == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.h = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.c.a f(String s) {
            if(s == null) {
                throw new NullPointerException("Null model");
            }
            this.b = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.c.a g(String s) {
            if(s == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.i = s;
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.c.a h(long v) {
            this.d = v;
            this.j = (byte)(this.j | 4);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.c.a i(boolean z) {
            this.f = z;
            this.j = (byte)(this.j | 16);
            return this;
        }

        @Override  // com.google.firebase.crashlytics.internal.model.F$f$c$a
        public com.google.firebase.crashlytics.internal.model.F.f.c.a j(int v) {
            this.g = v;
            this.j = (byte)(this.j | 0x20);
            return this;
        }
    }

    private final int a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;
    private final int g;
    private final String h;
    private final String i;

    private k(int v, String s, int v1, long v2, long v3, boolean z, int v4, String s1, String s2) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = v2;
        this.e = v3;
        this.f = z;
        this.g = v4;
        this.h = s1;
        this.i = s2;
    }

    k(int v, String s, int v1, long v2, long v3, boolean z, int v4, String s1, String s2, a k$a0) {
        this(v, s, v1, v2, v3, z, v4, s1, s2);
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$c
    @NonNull
    public int b() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$c
    public int c() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$c
    public long d() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$c
    @NonNull
    public String e() {
        return this.h;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof c) {
            int v = ((c)object0).b();
            if(this.a == v) {
                String s = ((c)object0).f();
                if(this.b.equals(s)) {
                    int v1 = ((c)object0).c();
                    if(this.c == v1) {
                        long v2 = ((c)object0).h();
                        if(this.d == v2) {
                            long v3 = ((c)object0).d();
                            if(this.e == v3) {
                                boolean z = ((c)object0).j();
                                if(this.f == z) {
                                    int v4 = ((c)object0).i();
                                    if(this.g == v4) {
                                        String s1 = ((c)object0).e();
                                        if(this.h.equals(s1)) {
                                            String s2 = ((c)object0).g();
                                            return this.i.equals(s2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$c
    @NonNull
    public String f() {
        return this.b;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$c
    @NonNull
    public String g() {
        return this.i;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$c
    public long h() {
        return this.d;
    }

    @Override
    public int hashCode() {
        int v = (((((this.a ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ ((int)(this.d ^ this.d >>> 0x20))) * 1000003 ^ ((int)(this.e ^ this.e >>> 0x20))) * 1000003;
        return this.f ? (((v ^ 0x4CF) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode() : (((v ^ 0x4D5) * 1000003 ^ this.g) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode();
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$c
    public int i() {
        return this.g;
    }

    @Override  // com.google.firebase.crashlytics.internal.model.F$f$c
    public boolean j() {
        return this.f;
    }

    @Override
    public String toString() {
        return "Device{arch=" + this.a + ", model=" + this.b + ", cores=" + this.c + ", ram=" + this.d + ", diskSpace=" + this.e + ", simulator=" + this.f + ", state=" + this.g + ", manufacturer=" + this.h + ", modelClass=" + this.i + "}";
    }
}

