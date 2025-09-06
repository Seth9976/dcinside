package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.p;
import com.google.firebase.remoteconfig.w;

public class y implements w {
    private final String a;
    private final int b;
    private static final String c = "[Value: %s] cannot be converted to a %s.";

    y(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override  // com.google.firebase.remoteconfig.w
    public int N() {
        return this.b;
    }

    @Override  // com.google.firebase.remoteconfig.w
    public byte[] a() {
        return this.b == 0 ? p.r : this.a.getBytes(com.google.firebase.remoteconfig.internal.p.e);
    }

    @Override  // com.google.firebase.remoteconfig.w
    public String asString() {
        if(this.b == 0) {
            return "";
        }
        this.f();
        return this.a;
    }

    @Override  // com.google.firebase.remoteconfig.w
    public long b() {
        if(this.b == 0) {
            return 0L;
        }
        String s = this.e();
        try {
            return (long)Long.valueOf(s);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", s, "long"), numberFormatException0);
        }
    }

    @Override  // com.google.firebase.remoteconfig.w
    public double c() {
        if(this.b == 0) {
            return 0.0;
        }
        String s = this.e();
        try {
            return (double)Double.valueOf(s);
        }
        catch(NumberFormatException numberFormatException0) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", s, "double"), numberFormatException0);
        }
    }

    @Override  // com.google.firebase.remoteconfig.w
    public boolean d() throws IllegalArgumentException {
        if(this.b == 0) {
            return false;
        }
        String s = this.e();
        if(com.google.firebase.remoteconfig.internal.p.f.matcher(s).matches()) {
            return true;
        }
        if(!com.google.firebase.remoteconfig.internal.p.g.matcher(s).matches()) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", s, "boolean"));
        }
        return false;
    }

    private String e() {
        return this.asString().trim();
    }

    private void f() {
        if(this.a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }
}

