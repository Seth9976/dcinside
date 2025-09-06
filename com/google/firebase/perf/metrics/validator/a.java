package com.google.firebase.perf.metrics.validator;

public class a extends e {
    private final com.google.firebase.perf.v1.e a;
    private static final com.google.firebase.perf.logging.a b;

    static {
        a.b = com.google.firebase.perf.logging.a.e();
    }

    a(com.google.firebase.perf.v1.e e0) {
        this.a = e0;
    }

    @Override  // com.google.firebase.perf.metrics.validator.e
    public boolean c() {
        if(!this.g()) {
            a.b.l("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }

    private boolean g() {
        com.google.firebase.perf.v1.e e0 = this.a;
        if(e0 == null) {
            a.b.l("ApplicationInfo is null");
            return false;
        }
        if(!e0.r5()) {
            a.b.l("GoogleAppId is null");
            return false;
        }
        if(!this.a.G5()) {
            a.b.l("AppInstanceId is null");
            return false;
        }
        if(!this.a.fb()) {
            a.b.l("ApplicationProcessState is null");
            return false;
        }
        if(this.a.C9()) {
            if(!this.a.a8().f3()) {
                a.b.l("AndroidAppInfo.packageName is null");
                return false;
            }
            if(!this.a.a8().I1()) {
                a.b.l("AndroidAppInfo.sdkVersion is null");
                return false;
            }
        }
        return true;
    }
}

