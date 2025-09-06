package com.google.firebase.platforminfo;

import o3.g;

final class a extends f {
    private final String a;
    private final String b;

    a(String s, String s1) {
        if(s == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.a = s;
        if(s1 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = s1;
    }

    @Override  // com.google.firebase.platforminfo.f
    @g
    public String b() {
        return this.a;
    }

    @Override  // com.google.firebase.platforminfo.f
    @g
    public String c() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof f) {
            String s = ((f)object0).b();
            if(this.a.equals(s)) {
                String s1 = ((f)object0).c();
                return this.b.equals(s1);
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
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }
}

