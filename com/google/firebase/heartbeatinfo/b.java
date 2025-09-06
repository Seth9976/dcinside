package com.google.firebase.heartbeatinfo;

final class b extends n {
    private final String a;
    private final long b;

    b(String s, long v) {
        if(s == null) {
            throw new NullPointerException("Null sdkName");
        }
        this.a = s;
        this.b = v;
    }

    @Override  // com.google.firebase.heartbeatinfo.n
    public long c() {
        return this.b;
    }

    @Override  // com.google.firebase.heartbeatinfo.n
    public String d() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof n) {
            String s = ((n)object0).d();
            if(this.a.equals(s)) {
                long v = ((n)object0).c();
                return this.b == v;
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ ((int)(this.b ^ this.b >>> 0x20));
    }

    @Override
    public String toString() {
        return "SdkHeartBeatResult{sdkName=" + this.a + ", millis=" + this.b + "}";
    }
}

