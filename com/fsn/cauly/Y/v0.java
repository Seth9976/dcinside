package com.fsn.cauly.Y;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class v0 extends r0 {
    Handler g;
    protected boolean h;
    protected int i;

    public v0() {
        this.h = false;
        this.i = -1;
    }

    public void a(int v) {
        this.i = v;
    }

    public abstract void c();

    @Override  // com.fsn.cauly.Y.s0
    public void cancel() {
        if(this.h) {
            return;
        }
        synchronized(this) {
            this.h = true;
        }
    }

    @Override  // com.fsn.cauly.Y.s0
    public void execute() {
        class a implements Runnable {
            final v0 a;

            @Override
            public void run() {
                class com.fsn.cauly.Y.v0.a.a implements Runnable {
                    final a a;

                    @Override
                    public void run() {
                        v0 v00 = v0.this;
                        if(!v00.h) {
                            v00.a();
                        }
                    }
                }

                if(v0.this.i != -1) {
                    Thread.currentThread().setPriority(v0.this.i);
                }
                v0.this.c();
                v0.this.g.post(new com.fsn.cauly.Y.v0.a.a(this));
            }
        }

        this.g = new Handler();
        ExecutorService executorService0 = Executors.newFixedThreadPool(10);
        executorService0.execute(new a(this));
        executorService0.shutdown();
    }
}

