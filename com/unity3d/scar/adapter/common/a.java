package com.unity3d.scar.adapter.common;

public class a {
    private int a;
    private Runnable b;

    public a() {
        this.a = 0;
    }

    public void a() {
        synchronized(this) {
            ++this.a;
        }
    }

    public void b() {
        synchronized(this) {
            --this.a;
            this.d();
        }
    }

    public void c(Runnable runnable0) {
        this.b = runnable0;
        this.d();
    }

    private void d() {
        if(this.a <= 0) {
            Runnable runnable0 = this.b;
            if(runnable0 != null) {
                runnable0.run();
            }
        }
    }
}

