package com.google.firebase.crashlytics.internal.common;

import java.io.File;

final class b extends F {
    private final com.google.firebase.crashlytics.internal.model.F a;
    private final String b;
    private final File c;

    b(com.google.firebase.crashlytics.internal.model.F f0, String s, File file0) {
        if(f0 == null) {
            throw new NullPointerException("Null report");
        }
        this.a = f0;
        if(s == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = s;
        if(file0 == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.c = file0;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.F
    public com.google.firebase.crashlytics.internal.model.F b() {
        return this.a;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.F
    public File c() {
        return this.c;
    }

    @Override  // com.google.firebase.crashlytics.internal.common.F
    public String d() {
        return this.b;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(object0 instanceof F) {
            com.google.firebase.crashlytics.internal.model.F f0 = ((F)object0).b();
            if(this.a.equals(f0)) {
                String s = ((F)object0).d();
                if(this.b.equals(s)) {
                    File file0 = ((F)object0).c();
                    return this.c.equals(file0);
                }
            }
            return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}

