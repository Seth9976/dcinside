package com.fasterxml.jackson.core;

public class p extends f {
    protected l b;
    private static final long c = 0x7BL;

    protected p(String s) {
        super(s);
    }

    protected p(String s, l l0) {
        this(s, l0, null);
    }

    protected p(String s, l l0, Throwable throwable0) {
        super(s, throwable0);
        this.b = l0;
    }

    protected p(String s, Throwable throwable0) {
        this(s, null, throwable0);
    }

    protected p(Throwable throwable0) {
        this(null, null, throwable0);
    }

    @Override  // com.fasterxml.jackson.core.f
    public l a() {
        return this.b;
    }

    @Override  // com.fasterxml.jackson.core.f
    public String b() {
        return super.getMessage();
    }

    @Override  // com.fasterxml.jackson.core.f
    public Object c() {
        return null;
    }

    public void d() {
        this.b = null;
    }

    protected String e() {
        return null;
    }

    @Override
    public String getMessage() {
        String s = super.getMessage() == null ? "N/A" : super.getMessage();
        l l0 = this.a();
        String s1 = this.e();
        if(l0 != null || s1 != null) {
            StringBuilder stringBuilder0 = new StringBuilder(100);
            stringBuilder0.append(s);
            if(s1 != null) {
                stringBuilder0.append(s1);
            }
            if(l0 != null) {
                stringBuilder0.append('\n');
                stringBuilder0.append(" at ");
                stringBuilder0.append(l0.toString());
            }
            return stringBuilder0.toString();
        }
        return s;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": " + this.getMessage();
    }
}

