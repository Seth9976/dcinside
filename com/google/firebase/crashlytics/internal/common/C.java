package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class c extends a {
    private final String a;
    private final String b;
    private final String c;

    c(String s, @Nullable String s1, @Nullable String s2) {
        if(s == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.O$a
    @NonNull
    public String c() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.O$a
    @Nullable
    public String d() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.O$a
    @Nullable
    public String e() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof a) {
            String s = ((a)object0).c();
            if(this.a.equals(s)) {
                String s1 = this.b;
                if(s1 == null) {
                    if(((a)object0).e() == null) {
                        return this.c == null ? ((a)object0).d() == null : this.c.equals(((a)object0).d());
                    }
                }
                else if(s1.equals(((a)object0).e())) {
                    return this.c == null ? ((a)object0).d() == null : this.c.equals(((a)object0).d());
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        String s = this.c;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v ^ 1000003) * 1000003 ^ v2) * 1000003 ^ v1;
    }

    @Override
    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.a + ", firebaseInstallationId=" + this.b + ", firebaseAuthenticationToken=" + this.c + "}";
    }
}

