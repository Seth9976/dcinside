package com.google.firebase.heartbeatinfo;

import java.util.List;

final class a extends m {
    private final String a;
    private final List b;

    a(String s, List list0) {
        if(s == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = s;
        if(list0 == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.b = list0;
    }

    @Override  // com.google.firebase.heartbeatinfo.m
    public List b() {
        return this.b;
    }

    @Override  // com.google.firebase.heartbeatinfo.m
    public String c() {
        return this.a;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof m) {
            String s = ((m)object0).c();
            if(this.a.equals(s)) {
                List list0 = ((m)object0).b();
                return this.b.equals(list0);
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode();
    }

    @Override
    public String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}

