package com.facebook.soloader;

import java.util.List;
import o3.h;

public abstract class u {
    private final Object a;
    @h
    private List b;
    private Boolean c;
    private boolean d;
    @h
    private volatile UnsatisfiedLinkError e;
    private static final String f = "com.facebook.soloader.u";

    static {
    }

    protected u(List list0) {
        this.a = new Object();
        this.c = Boolean.TRUE;
        this.d = false;
        this.e = null;
        this.b = list0;
    }

    public void a() throws UnsatisfiedLinkError {
        if(!this.d()) {
            throw this.e;
        }
    }

    @h
    public UnsatisfiedLinkError b() {
        return this.e;
    }

    protected void c() throws UnsatisfiedLinkError {
    }

    @h
    public boolean d() {
        synchronized(this.a) {
            if(!this.c.booleanValue()) {
                return this.d;
            }
            try {
                List list0 = this.b;
                if(list0 != null) {
                    for(Object object1: list0) {
                        SoLoader.H(((String)object1));
                    }
                }
                this.d = true;
                this.b = null;
                this.c = Boolean.FALSE;
                return this.d;
            }
            catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
            }
            catch(Throwable throwable0) {
                goto label_25;
            }
            p.d("com.facebook.soloader.u", "Failed to load native lib (initial check): ", unsatisfiedLinkError0);
            this.e = unsatisfiedLinkError0;
            this.d = false;
            this.c = Boolean.FALSE;
            return this.d;
        label_25:
            p.d("com.facebook.soloader.u", "Failed to load native lib (other error): ", throwable0);
            this.e = new UnsatisfiedLinkError("Failed loading libraries");
            this.e.initCause(throwable0);
            this.d = false;
            this.c = Boolean.FALSE;
            return this.d;
        }
    }
}

