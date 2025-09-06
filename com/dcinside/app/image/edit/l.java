package com.dcinside.app.image.edit;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

class l {
    interface a {
        void a(View arg1, l arg2);

        boolean b(View arg1, l arg2);

        boolean c(View arg1, l arg2);
    }

    static class b implements a {
        @Override  // com.dcinside.app.image.edit.l$a
        public void a(View view0, l l0) {
        }

        @Override  // com.dcinside.app.image.edit.l$a
        public boolean b(View view0, l l0) {
            return true;
        }

        @Override  // com.dcinside.app.image.edit.l$a
        public boolean c(View view0, l l0) {
            return false;
        }
    }

    private final a a;
    private boolean b;
    private MotionEvent c;
    private MotionEvent d;
    private Vector2D e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private long q;
    private boolean r;
    private int s;
    private int t;
    private boolean u;
    private static final String v = "ScaleGestureDetector";
    private static final float w = 0.67f;

    l(a l$a0) {
        this.a = l$a0;
        this.e = new Vector2D();
    }

    private int a(MotionEvent motionEvent0, int v, int v1) {
        int v2 = motionEvent0.getPointerCount();
        int v3 = motionEvent0.findPointerIndex(v);
        for(int v4 = 0; v4 < v2; ++v4) {
            if(v4 != v1 && v4 != v3) {
                return v4;
            }
        }
        return -1;
    }

    private float b() {
        if(this.l == -1.0f) {
            this.l = (float)Math.sqrt(this.j * this.j + this.k * this.k);
        }
        return this.l;
    }

    Vector2D c() {
        return this.e;
    }

    public float d() {
        return this.j;
    }

    public float e() {
        return this.k;
    }

    public long f() {
        return this.d.getEventTime();
    }

    float g() {
        return this.f;
    }

    float h() {
        return this.g;
    }

    private float i() {
        if(this.m == -1.0f) {
            this.m = (float)Math.sqrt(this.h * this.h + this.i * this.i);
        }
        return this.m;
    }

    public float j() {
        return this.h;
    }

    public float k() {
        return this.i;
    }

    public float l() {
        if(this.n == -1.0f) {
            this.n = this.b() / this.i();
        }
        return this.n;
    }

    public long m() {
        return this.q;
    }

    boolean n() {
        return this.b;
    }

    boolean o(View view0, MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            this.p();
        }
        boolean z = false;
        if(!this.r) {
            if(!this.b) {
                switch(v) {
                    case 0: {
                        this.s = motionEvent0.getPointerId(0);
                        this.u = true;
                        return true;
                    }
                    case 1: {
                        this.p();
                        return true;
                    }
                    case 5: {
                        MotionEvent motionEvent1 = this.c;
                        if(motionEvent1 != null) {
                            motionEvent1.recycle();
                        }
                        this.c = MotionEvent.obtain(motionEvent0);
                        this.q = 0L;
                        int v1 = motionEvent0.getActionIndex();
                        int v2 = motionEvent0.findPointerIndex(this.s);
                        int v3 = motionEvent0.getPointerId(v1);
                        this.t = v3;
                        if(v2 < 0 || v2 == v1) {
                            this.s = motionEvent0.getPointerId(this.a(motionEvent0, v3, -1));
                        }
                        this.u = false;
                        this.q(view0, motionEvent0);
                        this.b = this.a.b(view0, this);
                        return true;
                    }
                    default: {
                        return true;
                    }
                }
            }
            switch(v) {
                case 1: {
                    this.p();
                    return true;
                }
                case 2: {
                    this.q(view0, motionEvent0);
                    if(this.o / this.p > 0.67f && this.a.c(view0, this)) {
                        this.c.recycle();
                        this.c = MotionEvent.obtain(motionEvent0);
                        return true;
                    }
                    break;
                }
                case 3: {
                    this.a.a(view0, this);
                    this.p();
                    return true;
                }
                case 5: {
                    this.a.a(view0, this);
                    int v4 = this.s;
                    int v5 = this.t;
                    this.p();
                    this.c = MotionEvent.obtain(motionEvent0);
                    if(!this.u) {
                        v4 = v5;
                    }
                    this.s = v4;
                    this.t = motionEvent0.getPointerId(motionEvent0.getActionIndex());
                    this.u = false;
                    if(motionEvent0.findPointerIndex(this.s) < 0 || this.s == this.t) {
                        this.s = motionEvent0.getPointerId(this.a(motionEvent0, this.t, -1));
                    }
                    this.q(view0, motionEvent0);
                    this.b = this.a.b(view0, this);
                    return true;
                label_50:
                    if(v == 6) {
                        int v6 = motionEvent0.getPointerCount();
                        int v7 = motionEvent0.getActionIndex();
                        int v8 = motionEvent0.getPointerId(v7);
                        if(v6 > 2) {
                            int v9 = this.s;
                            if(v8 == v9) {
                                int v10 = this.a(motionEvent0, this.t, v7);
                                if(v10 >= 0) {
                                    this.a.a(view0, this);
                                    this.s = motionEvent0.getPointerId(v10);
                                    this.u = true;
                                    this.c = MotionEvent.obtain(motionEvent0);
                                    this.q(view0, motionEvent0);
                                    this.b = this.a.b(view0, this);
                                }
                                else {
                                    z = true;
                                }
                            }
                            else if(v8 == this.t) {
                                int v11 = this.a(motionEvent0, v9, v7);
                                if(v11 >= 0) {
                                    this.a.a(view0, this);
                                    this.t = motionEvent0.getPointerId(v11);
                                    this.u = false;
                                    this.c = MotionEvent.obtain(motionEvent0);
                                    this.q(view0, motionEvent0);
                                    this.b = this.a.b(view0, this);
                                }
                                else {
                                    z = true;
                                }
                            }
                            this.c.recycle();
                            this.c = MotionEvent.obtain(motionEvent0);
                            this.q(view0, motionEvent0);
                        }
                        else {
                            z = true;
                        }
                        if(z) {
                            this.q(view0, motionEvent0);
                            int v12 = v8 == this.s ? this.t : this.s;
                            int v13 = motionEvent0.findPointerIndex(v12);
                            this.f = motionEvent0.getX(v13);
                            this.g = motionEvent0.getY(v13);
                            this.a.a(view0, this);
                            this.p();
                            this.s = v12;
                            this.u = true;
                            return true;
                        }
                    }
                    break;
                }
                default: {
                    goto label_50;
                }
            }
            return true;
        }
        return false;
    }

    private void p() {
        MotionEvent motionEvent0 = this.c;
        if(motionEvent0 != null) {
            motionEvent0.recycle();
            this.c = null;
        }
        MotionEvent motionEvent1 = this.d;
        if(motionEvent1 != null) {
            motionEvent1.recycle();
            this.d = null;
        }
        this.b = false;
        this.s = -1;
        this.t = -1;
        this.r = false;
    }

    private void q(View view0, MotionEvent motionEvent0) {
        MotionEvent motionEvent1 = this.d;
        if(motionEvent1 != null) {
            motionEvent1.recycle();
        }
        this.d = MotionEvent.obtain(motionEvent0);
        this.l = -1.0f;
        this.m = -1.0f;
        this.n = -1.0f;
        this.e.set(0.0f, 0.0f);
        MotionEvent motionEvent2 = this.c;
        int v = motionEvent2.findPointerIndex(this.s);
        int v1 = motionEvent2.findPointerIndex(this.t);
        int v2 = motionEvent0.findPointerIndex(this.s);
        int v3 = motionEvent0.findPointerIndex(this.t);
        if(v >= 0 && v1 >= 0 && v2 >= 0 && v3 >= 0) {
            float f = motionEvent2.getX(v);
            float f1 = motionEvent2.getY(v);
            float f2 = motionEvent2.getX(v1);
            float f3 = motionEvent2.getY(v1);
            float f4 = motionEvent0.getX(v2);
            float f5 = motionEvent0.getY(v2);
            float f6 = motionEvent0.getX(v3) - f4;
            float f7 = motionEvent0.getY(v3) - f5;
            this.e.set(f6, f7);
            this.h = f2 - f;
            this.i = f3 - f1;
            this.j = f6;
            this.k = f7;
            this.f = f4 + f6 * 0.5f;
            this.g = f5 + f7 * 0.5f;
            this.q = motionEvent0.getEventTime() - motionEvent2.getEventTime();
            this.o = motionEvent0.getPressure(v2) + motionEvent0.getPressure(v3);
            this.p = motionEvent2.getPressure(v) + motionEvent2.getPressure(v1);
            return;
        }
        this.r = true;
        Log.e("ScaleGestureDetector", "Invalid MotionEvent stream detected.", new Throwable());
        if(this.b) {
            this.a.a(view0, this);
        }
    }
}

