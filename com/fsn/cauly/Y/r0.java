package com.fsn.cauly.Y;

import android.os.Handler;
import android.os.Message;

public abstract class r0 implements s0 {
    class a extends Handler {
        a() {
            super();
        }

        @Override  // android.os.Handler
        public void handleMessage(Message message0) {
            ((r0)message0.obj).a(message0);
        }
    }

    static int a = 1;
    static Handler b;
    protected int c;
    protected com.fsn.cauly.Y.s0.a d;
    protected Object e;
    protected int f;

    static {
        r0.b = new a();
    }

    public r0() {
        this.c = 0;
        this.e = null;
        this.f = 0;
    }

    public void a() {
        try {
            com.fsn.cauly.Y.s0.a s0$a0 = this.d;
            if(s0$a0 != null) {
                s0$a0.a(this);
            }
        }
        catch(Exception unused_ex) {
        }
    }

    protected void a(Message message0) {
    }

    @Override  // com.fsn.cauly.Y.s0
    public void a(com.fsn.cauly.Y.s0.a s0$a0) {
        this.d = s0$a0;
    }

    protected int b() {
        int v;
        synchronized(r0.class) {
            v = r0.a;
            r0.a = v + 1;
        }
        return v;
    }

    @Override  // com.fsn.cauly.Y.s0
    public int getErrorCode() {
        return this.c;
    }

    @Override  // com.fsn.cauly.Y.s0
    public int getTag() {
        return this.f;
    }

    @Override  // com.fsn.cauly.Y.s0
    public void setTag(int v) {
        this.f = v;
    }
}

