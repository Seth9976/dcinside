package com.google.android.material.snackbar;

import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

class e {
    interface b {
        void a(int arg1);

        void show();
    }

    static class c {
        @NonNull
        final WeakReference a;
        int b;
        boolean c;

        c(int v, b e$b0) {
            this.a = new WeakReference(e$b0);
            this.b = v;
        }

        boolean a(@Nullable b e$b0) {
            return e$b0 != null && this.a.get() == e$b0;
        }
    }

    @NonNull
    private final Object a;
    @NonNull
    private final Handler b;
    @Nullable
    private c c;
    @Nullable
    private c d;
    static final int e = 0;
    private static final int f = 1500;
    private static final int g = 2750;
    private static e h;

    private e() {
        class a implements Handler.Callback {
            final e a;

            @Override  // android.os.Handler$Callback
            public boolean handleMessage(@NonNull Message message0) {
                if(message0.what != 0) {
                    return false;
                }
                e.this.d(((c)message0.obj));
                return true;
            }
        }

        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper(), new a(this));
    }

    private boolean a(@NonNull c e$c0, int v) {
        b e$b0 = (b)e$c0.a.get();
        if(e$b0 != null) {
            this.b.removeCallbacksAndMessages(e$c0);
            e$b0.a(v);
            return true;
        }
        return false;
    }

    public void b(b e$b0, int v) {
        synchronized(this.a) {
            if(this.g(e$b0)) {
                this.a(this.c, v);
            }
            else if(this.h(e$b0)) {
                this.a(this.d, v);
            }
        }
    }

    static e c() {
        if(e.h == null) {
            e.h = new e();
        }
        return e.h;
    }

    void d(@NonNull c e$c0) {
        synchronized(this.a) {
            if(this.c == e$c0 || this.d == e$c0) {
                this.a(e$c0, 2);
            }
        }
    }

    public boolean e(b e$b0) {
        synchronized(this.a) {
        }
        return this.g(e$b0);
    }

    public boolean f(b e$b0) {
        synchronized(this.a) {
            return this.g(e$b0) || this.h(e$b0);
        }
    }

    private boolean g(b e$b0) {
        return this.c != null && this.c.a(e$b0);
    }

    private boolean h(b e$b0) {
        return this.d != null && this.d.a(e$b0);
    }

    public void i(b e$b0) {
        synchronized(this.a) {
            if(this.g(e$b0)) {
                this.c = null;
                if(this.d != null) {
                    this.o();
                }
            }
        }
    }

    public void j(b e$b0) {
        synchronized(this.a) {
            if(this.g(e$b0)) {
                this.m(this.c);
            }
        }
    }

    public void k(b e$b0) {
        synchronized(this.a) {
            if(this.g(e$b0)) {
                c e$c0 = this.c;
                if(!e$c0.c) {
                    e$c0.c = true;
                    this.b.removeCallbacksAndMessages(e$c0);
                }
            }
        }
    }

    public void l(b e$b0) {
        synchronized(this.a) {
            if(this.g(e$b0)) {
                c e$c0 = this.c;
                if(e$c0.c) {
                    e$c0.c = false;
                    this.m(e$c0);
                }
            }
        }
    }

    private void m(@NonNull c e$c0) {
        int v = e$c0.b;
        if(v == -2) {
            return;
        }
        if(v <= 0) {
            v = v == -1 ? 1500 : 2750;
        }
        this.b.removeCallbacksAndMessages(e$c0);
        Message message0 = Message.obtain(this.b, 0, e$c0);
        this.b.sendMessageDelayed(message0, ((long)v));
    }

    public void n(int v, b e$b0) {
        synchronized(this.a) {
            if(this.g(e$b0)) {
                this.c.b = v;
                this.b.removeCallbacksAndMessages(this.c);
                this.m(this.c);
                return;
            }
            if(this.h(e$b0)) {
                this.d.b = v;
            }
            else {
                this.d = new c(v, e$b0);
            }
            if(this.c != null && this.a(this.c, 4)) {
                return;
            }
            this.c = null;
            this.o();
        }
    }

    private void o() {
        c e$c0 = this.d;
        if(e$c0 != null) {
            this.c = e$c0;
            this.d = null;
            b e$b0 = (b)e$c0.a.get();
            if(e$b0 != null) {
                e$b0.show();
                return;
            }
            this.c = null;
        }
    }
}

