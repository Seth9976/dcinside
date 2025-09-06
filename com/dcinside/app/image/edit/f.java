package com.dcinside.app.image.edit;

import android.graphics.Rect;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;

class f implements View.OnTouchListener {
    final class a extends GestureDetector.SimpleOnGestureListener {
        final f a;

        private a() {
        }

        a(g g0) {
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public void onLongPress(MotionEvent motionEvent0) {
            super.onLongPress(motionEvent0);
            if(f.this.p != null) {
                f.this.p.a();
            }
        }

        @Override  // android.view.GestureDetector$SimpleOnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent0) {
            if(f.this.p != null) {
                f.this.p.onClick();
            }
            return true;
        }
    }

    interface b {
        void a();

        void onClick();
    }

    interface c {
        void a(View arg1);

        void b(String arg1, int arg2);
    }

    class d extends com.dcinside.app.image.edit.l.b {
        private float a;
        private float b;
        private Vector2D c;
        final f d;

        private d() {
            this.c = new Vector2D();
        }

        d(g g0) {
        }

        @Override  // com.dcinside.app.image.edit.l$b
        public boolean b(View view0, l l0) {
            this.a = l0.g();
            this.b = l0.h();
            this.c.set(l0.c());
            return f.this.q;
        }

        @Override  // com.dcinside.app.image.edit.l$b
        public boolean c(View view0, l l0) {
            e f$e0 = new e(f.this, null);
            f$e0.c = f.this.c ? l0.l() : 1.0f;
            float f = 0.0f;
            f$e0.d = f.this.b ? Vector2D.a(this.c, l0.c()) : 0.0f;
            f$e0.a = f.this.f ? l0.g() - this.a : 0.0f;
            if(f.this.f) {
                f = l0.h() - this.b;
            }
            f$e0.b = f;
            f$e0.e = this.a;
            f$e0.f = this.b;
            f$e0.g = f.this.d;
            f$e0.h = f.this.e;
            f.j(view0, f$e0);
            return !f.this.q;
        }
    }

    class e {
        float a;
        float b;
        float c;
        float d;
        float e;
        float f;
        float g;
        float h;

        private e() {
        }

        e(g g0) {
        }
    }

    private final GestureDetector a;
    boolean b;
    boolean c;
    float d;
    float e;
    private boolean f;
    private int g;
    private float h;
    private float i;
    private l j;
    private int[] k;
    private Rect l;
    private View m;
    private ImageView n;
    private c o;
    private b p;
    private boolean q;
    private h r;
    private static final int s = -1;

    f(@Nullable View view0, ImageView imageView0, boolean z, h h0) {
        this.b = true;
        this.c = true;
        this.d = 0.5f;
        this.e = 10.0f;
        this.f = true;
        this.g = -1;
        this.k = new int[2];
        this.q = z;
        this.j = new l(new d(this, null));
        this.a = new GestureDetector(imageView0.getContext(), new a(this, null));
        this.m = view0;
        this.n = imageView0;
        this.r = h0;
        if(view0 != null) {
            this.l = new Rect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom());
            return;
        }
        this.l = new Rect(0, 0, 0, 0);
    }

    private static float e(float f) {
        if(f > 180.0f) {
            return f - 360.0f;
        }
        return f < -180.0f ? f + 360.0f : f;
    }

    private static void f(View view0, float f, float f1) {
        float[] arr_f = {f, f1};
        view0.getMatrix().mapVectors(arr_f);
        view0.setTranslationX(view0.getTranslationX() + arr_f[0]);
        view0.setTranslationY(view0.getTranslationY() + arr_f[1]);
    }

    private static void g(View view0, float f, float f1) {
        if(view0.getPivotX() == f && view0.getPivotY() == f1) {
            return;
        }
        float[] arr_f = {0.0f, 0.0f};
        view0.getMatrix().mapPoints(arr_f);
        view0.setPivotX(f);
        view0.setPivotY(f1);
        float[] arr_f1 = {0.0f, 0.0f};
        view0.getMatrix().mapPoints(arr_f1);
        float f2 = arr_f1[0] - arr_f[0];
        float f3 = arr_f1[1] - arr_f[1];
        view0.setTranslationX(view0.getTranslationX() - f2);
        view0.setTranslationY(view0.getTranslationY() - f3);
    }

    private void h(View view0, boolean z) {
        Object object0 = view0.getTag();
        h h0 = this.r;
        if(h0 != null && object0 instanceof com.dcinside.app.image.edit.b) {
            if(z) {
                h0.I(((com.dcinside.app.image.edit.b)view0.getTag()));
                return;
            }
            h0.P(((com.dcinside.app.image.edit.b)view0.getTag()));
        }
    }

    private boolean i(View view0, int v, int v1) {
        view0.getDrawingRect(this.l);
        view0.getLocationOnScreen(this.k);
        this.l.offset(this.k[0], this.k[1]);
        return this.l.contains(v, v1);
    }

    private static void j(View view0, e f$e0) {
        f.g(view0, f$e0.e, f$e0.f);
        f.f(view0, f$e0.a, f$e0.b);
        float f = view0.getScaleX();
        float f1 = Math.max(f$e0.g, Math.min(f$e0.h, f * f$e0.c));
        view0.setScaleX(f1);
        view0.setScaleY(f1);
        view0.setRotation(f.e(view0.getRotation() + f$e0.d));
    }

    void k(b f$b0) {
        this.p = f$b0;
    }

    void l(c f$c0) {
        this.o = f$c0;
    }

    @Override  // android.view.View$OnTouchListener
    public boolean onTouch(View view0, MotionEvent motionEvent0) {
        this.j.o(view0, motionEvent0);
        this.a.onTouchEvent(motionEvent0);
        if(!this.f) {
            return true;
        }
        int v = motionEvent0.getAction();
        int v1 = (int)motionEvent0.getRawX();
        int v2 = (int)motionEvent0.getRawY();
        int v3 = 0;
        switch(motionEvent0.getActionMasked() & v) {
            case 0: {
                this.h = motionEvent0.getX();
                this.i = motionEvent0.getY();
                this.g = motionEvent0.getPointerId(0);
                View view2 = this.m;
                if(view2 != null) {
                    view2.setVisibility(0);
                }
                view0.bringToFront();
                this.h(view0, true);
                break;
            }
            case 1: {
                this.g = -1;
                if(this.m != null && this.i(this.m, v1, v2)) {
                    c f$c0 = this.o;
                    if(f$c0 != null) {
                        f$c0.a(view0);
                    }
                }
                else if(!this.i(this.n, v1, v2)) {
                    view0.animate().translationY(0.0f).translationY(0.0f);
                }
                View view1 = this.m;
                if(view1 != null) {
                    view1.setVisibility(8);
                }
                this.h(view0, false);
                return true;
            }
            case 2: {
                int v5 = motionEvent0.findPointerIndex(this.g);
                if(v5 != -1) {
                    float f = motionEvent0.getX(v5);
                    float f1 = motionEvent0.getY(v5);
                    if(!this.j.n()) {
                        f.f(view0, f - this.h, f1 - this.i);
                        return true;
                    }
                }
                break;
            }
            case 3: {
                this.g = -1;
                return true;
            }
            case 6: {
                int v4 = (0xFF00 & v) >> 8;
                if(motionEvent0.getPointerId(v4) == this.g) {
                    if(v4 == 0) {
                        v3 = 1;
                    }
                    this.h = motionEvent0.getX(v3);
                    this.i = motionEvent0.getY(v3);
                    this.g = motionEvent0.getPointerId(v3);
                    return true;
                }
                break;
            }
            default: {
                return true;
            }
        }
        return true;
    }
}

