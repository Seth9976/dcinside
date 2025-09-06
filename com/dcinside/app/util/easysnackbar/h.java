package com.dcinside.app.util.easysnackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class h {
    interface a {
        void a(int arg1);

        void show();
    }

    static class b {
        final WeakReference a;
        int b;
        boolean c;

        b(int v, a h$a0) {
            this.a = new WeakReference(h$a0);
            this.b = v;
        }

        boolean a(a h$a0) {
            return h$a0 != null && this.a.get() == h$a0;
        }
    }

    private final Object a;
    private final Handler b;
    private b c;
    private b d;
    static final int e = 0;
    private static final int f = 1500;
    private static final int g = 2750;
    private static h h;

    private h() {
        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), (Message message0) -> {
            if(message0.what == 0) {
                this.e(((b)message0.obj));
                return true;
            }
            return false;
        });
    }

    private boolean b(b h$b0, int v) {
        a h$a0 = (a)h$b0.a.get();
        if(h$a0 != null) {
            this.b.removeCallbacksAndMessages(h$b0);
            h$a0.a(v);
            return true;
        }
        return false;
    }

    public void c(a h$a0, int v) {
        synchronized(this.a) {
            if(this.h(h$a0)) {
                this.b(this.c, v);
            }
            else if(this.i(h$a0)) {
                this.b(this.d, v);
            }
        }
    }

    static h d() {
        if(h.h == null) {
            h.h = new h();
        }
        return h.h;
    }

    void e(b h$b0) {
        synchronized(this.a) {
            if(this.c == h$b0 || this.d == h$b0) {
                this.b(h$b0, 2);
            }
        }
    }

    public boolean f(a h$a0) {
        synchronized(this.a) {
        }
        return this.h(h$a0);
    }

    public boolean g(a h$a0) {
        synchronized(this.a) {
            return this.h(h$a0) || this.i(h$a0);
        }
    }

    private boolean h(a h$a0) {
        return this.c != null && this.c.a(h$a0);
    }

    private boolean i(a h$a0) {
        return this.d != null && this.d.a(h$a0);
    }

    // 检测为 Lambda 实现
    private boolean j(Message message0) [...]

    public void k(a h$a0) {
        synchronized(this.a) {
            if(this.h(h$a0)) {
                this.c = null;
                if(this.d != null) {
                    this.q();
                }
            }
        }
    }

    public void l(a h$a0) {
        synchronized(this.a) {
            if(this.h(h$a0)) {
                this.o(this.c);
            }
        }
    }

    public void m(a h$a0) {
        synchronized(this.a) {
            if(this.h(h$a0)) {
                b h$b0 = this.c;
                if(!h$b0.c) {
                    h$b0.c = true;
                    this.b.removeCallbacksAndMessages(h$b0);
                }
            }
        }
    }

    public void n(a h$a0) {
        synchronized(this.a) {
            if(this.h(h$a0)) {
                b h$b0 = this.c;
                if(h$b0.c) {
                    h$b0.c = false;
                    this.o(h$b0);
                }
            }
        }
    }

    private void o(b h$b0) {
        int v = h$b0.b;
        if(v == -2) {
            return;
        }
        if(v <= 0) {
            v = v == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(h$b0);
        Message message0 = Message.obtain(this.b, 0, h$b0);
        this.b.sendMessageDelayed(message0, ((long)v));
    }

    public void p(int v, a h$a0) {
        synchronized(this.a) {
            if(this.h(h$a0)) {
                this.c.b = v;
                this.b.removeCallbacksAndMessages(this.c);
                this.o(this.c);
                return;
            }
            if(this.i(h$a0)) {
                this.d.b = v;
            }
            else {
                this.d = new b(v, h$a0);
            }
            if(this.c != null && this.b(this.c, 4)) {
                return;
            }
            this.c = null;
            this.q();
        }
    }

    private void q() {
        b h$b0 = this.d;
        if(h$b0 != null) {
            this.c = h$b0;
            this.d = null;
            a h$a0 = (a)h$b0.a.get();
            if(h$a0 != null) {
                h$a0.show();
                return;
            }
            this.c = null;
        }
    }
}

