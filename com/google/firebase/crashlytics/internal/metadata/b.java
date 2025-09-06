package com.google.firebase.crashlytics.internal.metadata;

final class b extends i {
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final long g;

    b(String s, String s1, String s2, String s3, long v) {
        if(s == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.c = s;
        if(s1 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.d = s1;
        if(s2 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.e = s2;
        if(s3 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f = s3;
        this.g = v;
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.i
    public String c() {
        return this.d;
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.i
    public String d() {
        return this.e;
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.i
    public String e() {
        return this.c;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof i) {
            String s = ((i)object0).e();
            if(this.c.equals(s)) {
                String s1 = ((i)object0).c();
                if(this.d.equals(s1)) {
                    String s2 = ((i)object0).d();
                    if(this.e.equals(s2)) {
                        String s3 = ((i)object0).g();
                        if(this.f.equals(s3)) {
                            long v = ((i)object0).f();
                            return this.g == v;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.i
    public long f() {
        return this.g;
    }

    @Override  // com.google.firebase.crashlytics.internal.metadata.i
    public String g() {
        return this.f;
    }

    @Override
    public int hashCode() {
        return ((((this.c.hashCode() ^ 1000003) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ ((int)(this.g ^ this.g >>> 0x20));
    }

    @Override
    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.c + ", parameterKey=" + this.d + ", parameterValue=" + this.e + ", variantId=" + this.f + ", templateVersion=" + this.g + "}";
    }
}

