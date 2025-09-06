package androidx.constraintlayout.motion.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.utils.ViewState;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.view.NestedScrollingParent3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    class DecelerateInterpolator extends MotionInterpolator {
        float a;
        float b;
        float c;
        final MotionLayout d;

        DecelerateInterpolator() {
            this.a = 0.0f;
            this.b = 0.0f;
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float a() {
            return MotionLayout.this.d;
        }

        public void b(float f, float f1, float f2) {
            this.a = f;
            this.b = f1;
            this.c = f2;
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getInterpolation(float f) {
            float f1 = this.a;
            if(f1 > 0.0f) {
                float f2 = this.c;
                if(f1 / f2 < f) {
                    f = f1 / f2;
                }
                MotionLayout.this.d = f1 - f2 * f;
                return f1 * f - f2 * f * f / 2.0f + this.b;
            }
            float f3 = this.c;
            if(-f1 / f3 < f) {
                f = -f1 / f3;
            }
            MotionLayout.this.d = f3 * f + f1;
            return f1 * f + f3 * f * f / 2.0f + this.b;
        }
    }

    class DevModeDraw {
        float[] a;
        int[] b;
        float[] c;
        Path d;
        Paint e;
        Paint f;
        Paint g;
        Paint h;
        Paint i;
        private float[] j;
        final int k;
        final int l;
        final int m;
        final int n;
        final int o;
        DashPathEffect p;
        int q;
        Rect r;
        boolean s;
        int t;
        final MotionLayout u;
        private static final int v = 16;

        DevModeDraw() {
            this.k = 0xFFFFAA33;
            this.l = -2067046;
            this.m = 0xFF33AA00;
            this.n = 0x77000000;
            this.o = 10;
            this.r = new Rect();
            this.s = false;
            this.t = 1;
            Paint paint0 = new Paint();
            this.e = paint0;
            paint0.setAntiAlias(true);
            this.e.setColor(0xFFFFAA33);
            this.e.setStrokeWidth(2.0f);
            Paint.Style paint$Style0 = Paint.Style.STROKE;
            this.e.setStyle(paint$Style0);
            Paint paint1 = new Paint();
            this.f = paint1;
            paint1.setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(paint$Style0);
            Paint paint2 = new Paint();
            this.g = paint2;
            paint2.setAntiAlias(true);
            this.g.setColor(0xFF33AA00);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(paint$Style0);
            Paint paint3 = new Paint();
            this.h = paint3;
            paint3.setAntiAlias(true);
            this.h.setColor(0xFF33AA00);
            this.h.setTextSize(motionLayout0.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint4 = new Paint();
            this.i = paint4;
            paint4.setAntiAlias(true);
            DashPathEffect dashPathEffect0 = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.p = dashPathEffect0;
            this.g.setPathEffect(dashPathEffect0);
            this.c = new float[100];
            this.b = new int[50];
            if(this.s) {
                this.e.setStrokeWidth(8.0f);
                this.i.setStrokeWidth(8.0f);
                this.f.setStrokeWidth(8.0f);
                this.t = 4;
            }
        }

        public void a(Canvas canvas0, HashMap hashMap0, int v, int v1) {
            if(hashMap0 != null && hashMap0.size() != 0) {
                canvas0.save();
                if(!MotionLayout.this.isInEditMode() && (v1 & 1) == 2) {
                    String s = MotionLayout.this.getContext().getResources().getResourceName(MotionLayout.this.g) + ":" + MotionLayout.this.getProgress();
                    canvas0.drawText(s, 10.0f, ((float)(MotionLayout.this.getHeight() - 30)), this.h);
                    canvas0.drawText(s, 11.0f, ((float)(MotionLayout.this.getHeight() - 29)), this.e);
                }
                for(Object object0: hashMap0.values()) {
                    MotionController motionController0 = (MotionController)object0;
                    int v2 = motionController0.q();
                    if(v1 > 0 && v2 == 0) {
                        v2 = 1;
                    }
                    if(v2 != 0) {
                        this.q = motionController0.e(this.c, this.b);
                        if(v2 >= 1) {
                            if(this.a == null || this.a.length != v / 16 * 2) {
                                this.a = new float[v / 16 * 2];
                                this.d = new Path();
                            }
                            canvas0.translate(((float)this.t), ((float)this.t));
                            this.e.setColor(0x77000000);
                            this.i.setColor(0x77000000);
                            this.f.setColor(0x77000000);
                            this.g.setColor(0x77000000);
                            motionController0.f(this.a, v / 16);
                            this.b(canvas0, v2, this.q, motionController0);
                            this.e.setColor(0xFFFFAA33);
                            this.f.setColor(-2067046);
                            this.i.setColor(-2067046);
                            this.g.setColor(0xFF33AA00);
                            canvas0.translate(((float)(-this.t)), ((float)(-this.t)));
                            this.b(canvas0, v2, this.q, motionController0);
                            if(v2 == 5) {
                                this.j(canvas0, motionController0);
                            }
                        }
                    }
                }
                canvas0.restore();
            }
        }

        public void b(Canvas canvas0, int v, int v1, MotionController motionController0) {
            if(v == 4) {
                this.d(canvas0);
            }
            if(v == 2) {
                this.g(canvas0);
            }
            if(v == 3) {
                this.e(canvas0);
            }
            this.c(canvas0);
            this.k(canvas0, v, v1, motionController0);
        }

        private void c(Canvas canvas0) {
            canvas0.drawLines(this.a, this.e);
        }

        private void d(Canvas canvas0) {
            boolean z = false;
            boolean z1 = false;
            for(int v = 0; v < this.q; ++v) {
                int v1 = this.b[v];
                if(v1 == 1) {
                    z = true;
                }
                if(v1 == 0) {
                    z1 = true;
                }
            }
            if(z) {
                this.g(canvas0);
            }
            if(z1) {
                this.e(canvas0);
            }
        }

        private void e(Canvas canvas0) {
            float[] arr_f = this.a;
            float f = arr_f[0];
            float f1 = arr_f[1];
            float f2 = arr_f[arr_f.length - 2];
            float f3 = arr_f[arr_f.length - 1];
            canvas0.drawLine(Math.min(f, f2), Math.max(f1, f3), Math.max(f, f2), Math.max(f1, f3), this.g);
            canvas0.drawLine(Math.min(f, f2), Math.min(f1, f3), Math.min(f, f2), Math.max(f1, f3), this.g);
        }

        private void f(Canvas canvas0, float f, float f1) {
            float[] arr_f = this.a;
            float f2 = arr_f[0];
            float f3 = arr_f[1];
            float f4 = arr_f[arr_f.length - 2];
            float f5 = arr_f[arr_f.length - 1];
            float f6 = f - Math.min(f2, f4);
            float f7 = Math.max(f3, f5) - f1;
            String s = "" + ((float)(((int)(((double)(f6 * 100.0f / Math.abs(f4 - f2))) + 0.5)))) / 100.0f;
            this.m(s, this.h);
            canvas0.drawText(s, f6 / 2.0f - ((float)(this.r.width() / 2)) + Math.min(f2, f4), f1 - 20.0f, this.h);
            canvas0.drawLine(f, f1, Math.min(f2, f4), f1, this.g);
            String s1 = "" + ((float)(((int)(((double)(f7 * 100.0f / Math.abs(f5 - f3))) + 0.5)))) / 100.0f;
            this.m(s1, this.h);
            canvas0.drawText(s1, f + 5.0f, Math.max(f3, f5) - (f7 / 2.0f - ((float)(this.r.height() / 2))), this.h);
            canvas0.drawLine(f, f1, f, Math.max(f3, f5), this.g);
        }

        private void g(Canvas canvas0) {
            canvas0.drawLine(this.a[0], this.a[1], this.a[this.a.length - 2], this.a[this.a.length - 1], this.g);
        }

        private void h(Canvas canvas0, float f, float f1) {
            float[] arr_f = this.a;
            float f2 = arr_f[0];
            float f3 = arr_f[1];
            float f4 = arr_f[arr_f.length - 2];
            float f5 = arr_f[arr_f.length - 1];
            float f6 = (float)Math.hypot(f2 - f4, f3 - f5);
            float f7 = f4 - f2;
            float f8 = f5 - f3;
            float f9 = ((f - f2) * f7 + (f1 - f3) * f8) / (f6 * f6);
            float f10 = f2 + f7 * f9;
            float f11 = f3 + f9 * f8;
            Path path0 = new Path();
            path0.moveTo(f, f1);
            path0.lineTo(f10, f11);
            float f12 = (float)Math.hypot(f10 - f, f11 - f1);
            String s = "" + ((float)(((int)(f12 * 100.0f / f6)))) / 100.0f;
            this.m(s, this.h);
            canvas0.drawTextOnPath(s, path0, f12 / 2.0f - ((float)(this.r.width() / 2)), -20.0f, this.h);
            canvas0.drawLine(f, f1, f10, f11, this.g);
        }

        private void i(Canvas canvas0, float f, float f1, int v, int v1) {
            String s = "" + ((float)(((int)(((double)((f - ((float)(v / 2))) * 100.0f / ((float)(MotionLayout.this.getWidth() - v)))) + 0.5)))) / 100.0f;
            this.m(s, this.h);
            canvas0.drawText(s, f / 2.0f - ((float)(this.r.width() / 2)) + 0.0f, f1 - 20.0f, this.h);
            canvas0.drawLine(f, f1, 0.0f, f1, this.g);
            String s1 = "" + ((float)(((int)(((double)((f1 - ((float)(v1 / 2))) * 100.0f / ((float)(MotionLayout.this.getHeight() - v1)))) + 0.5)))) / 100.0f;
            this.m(s1, this.h);
            canvas0.drawText(s1, f + 5.0f, 0.0f - (f1 / 2.0f - ((float)(this.r.height() / 2))), this.h);
            canvas0.drawLine(f, f1, f, 1.0f, this.g);
        }

        private void j(Canvas canvas0, MotionController motionController0) {
            this.d.reset();
            for(int v = 0; v <= 50; ++v) {
                motionController0.g(((float)v) / 50.0f, this.j, 0);
                this.d.moveTo(this.j[0], this.j[1]);
                this.d.lineTo(this.j[2], this.j[3]);
                this.d.lineTo(this.j[4], this.j[5]);
                this.d.lineTo(this.j[6], this.j[7]);
                this.d.close();
            }
            this.e.setColor(0x44000000);
            canvas0.translate(2.0f, 2.0f);
            canvas0.drawPath(this.d, this.e);
            canvas0.translate(-2.0f, -2.0f);
            this.e.setColor(0xFFFF0000);
            canvas0.drawPath(this.d, this.e);
        }

        private void k(Canvas canvas0, int v, int v1, MotionController motionController0) {
            float f3;
            float f2;
            int v3;
            int v2;
            View view0 = motionController0.b;
            if(view0 == null) {
                v2 = 0;
                v3 = 0;
            }
            else {
                v2 = view0.getWidth();
                v3 = motionController0.b.getHeight();
            }
            int v4 = 1;
            while(v4 < v1 - 1) {
                if(v != 4 || this.b[v4 - 1] != 0) {
                    float[] arr_f = this.c;
                    float f = arr_f[v4 * 2];
                    float f1 = arr_f[v4 * 2 + 1];
                    this.d.reset();
                    this.d.moveTo(f, f1 + 10.0f);
                    this.d.lineTo(f + 10.0f, f1);
                    this.d.lineTo(f, f1 - 10.0f);
                    this.d.lineTo(f - 10.0f, f1);
                    this.d.close();
                    motionController0.w(v4 - 1);
                    if(v == 4) {
                        int v5 = this.b[v4 - 1];
                        if(v5 == 1) {
                            this.h(canvas0, f - 0.0f, f1 - 0.0f);
                        }
                        else if(v5 == 0) {
                            this.f(canvas0, f - 0.0f, f1 - 0.0f);
                        }
                        else if(v5 == 2) {
                            f2 = f1;
                            f3 = f;
                            this.i(canvas0, f - 0.0f, f1 - 0.0f, v2, v3);
                            goto label_35;
                        }
                        f2 = f1;
                        f3 = f;
                    label_35:
                        canvas0.drawPath(this.d, this.i);
                    }
                    else {
                        f2 = f1;
                        f3 = f;
                    }
                    if(v == 2) {
                        this.h(canvas0, f3 - 0.0f, f2 - 0.0f);
                    }
                    if(v == 3) {
                        this.f(canvas0, f3 - 0.0f, f2 - 0.0f);
                    }
                    if(v == 6) {
                        this.i(canvas0, f3 - 0.0f, f2 - 0.0f, v2, v3);
                    }
                    canvas0.drawPath(this.d, this.i);
                }
                ++v4;
            }
            float[] arr_f1 = this.a;
            if(arr_f1.length > 1) {
                canvas0.drawCircle(arr_f1[0], arr_f1[1], 8.0f, this.f);
                canvas0.drawCircle(this.a[this.a.length - 2], this.a[this.a.length - 1], 8.0f, this.f);
            }
        }

        private void l(Canvas canvas0, float f, float f1, float f2, float f3) {
            canvas0.drawRect(f, f1, f2, f3, this.g);
            canvas0.drawLine(f, f1, f2, f3, this.g);
        }

        void m(String s, Paint paint0) {
            paint0.getTextBounds(s, 0, s.length(), this.r);
        }
    }

    class Model {
        ConstraintWidgetContainer a;
        ConstraintWidgetContainer b;
        ConstraintSet c;
        ConstraintSet d;
        int e;
        int f;
        final MotionLayout g;

        Model() {
            this.a = new ConstraintWidgetContainer();
            this.b = new ConstraintWidgetContainer();
            this.c = null;
            this.d = null;
        }

        public void a() {
            int v = MotionLayout.this.getChildCount();
            MotionLayout.this.k.clear();
            SparseArray sparseArray0 = new SparseArray();
            int[] arr_v = new int[v];
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = MotionLayout.this.getChildAt(v1);
                MotionController motionController0 = new MotionController(view0);
                int v2 = view0.getId();
                arr_v[v1] = v2;
                sparseArray0.put(v2, motionController0);
                MotionLayout.this.k.put(view0, motionController0);
            }
            for(int v3 = 0; v3 < v; ++v3) {
                View view1 = MotionLayout.this.getChildAt(v3);
                MotionController motionController1 = (MotionController)MotionLayout.this.k.get(view1);
                if(motionController1 != null) {
                    if(this.c != null) {
                        ConstraintWidget constraintWidget0 = this.g(this.a, view1);
                        if(constraintWidget0 != null) {
                            motionController1.W(MotionLayout.this.T0(constraintWidget0), this.c, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        }
                        else if(MotionLayout.this.x != 0) {
                            Log.e("MotionLayout", ".(null:-1)no widget for  " + Debug.k(view1) + " (" + view1.getClass().getName() + ")");
                        }
                    }
                    else if(MotionLayout.this.h9) {
                        motionController1.X(((ViewState)MotionLayout.this.j9.get(view1)), view1, MotionLayout.this.i9, MotionLayout.this.k9, MotionLayout.this.l9);
                    }
                    if(this.d != null) {
                        ConstraintWidget constraintWidget1 = this.g(this.b, view1);
                        if(constraintWidget1 != null) {
                            motionController1.T(MotionLayout.this.T0(constraintWidget1), this.d, MotionLayout.this.getWidth(), MotionLayout.this.getHeight());
                        }
                        else if(MotionLayout.this.x != 0) {
                            Log.e("MotionLayout", ".(null:-1)no widget for  " + Debug.k(view1) + " (" + view1.getClass().getName() + ")");
                        }
                    }
                }
            }
            for(int v4 = 0; v4 < v; ++v4) {
                MotionController motionController2 = (MotionController)sparseArray0.get(arr_v[v4]);
                int v5 = motionController2.k();
                if(v5 != -1) {
                    motionController2.b0(((MotionController)sparseArray0.get(v5)));
                }
            }
        }

        private void b(int v, int v1) {
            int v2 = MotionLayout.this.getOptimizationLevel();
            if(MotionLayout.this.f == MotionLayout.this.getStartState()) {
                MotionLayout.this.resolveSystem(this.b, v2, (this.d == null || this.d.e == 0 ? v : v1), (this.d == null || this.d.e == 0 ? v1 : v));
                ConstraintSet constraintSet0 = this.c;
                if(constraintSet0 != null) {
                    MotionLayout motionLayout0 = MotionLayout.this;
                    ConstraintWidgetContainer constraintWidgetContainer0 = this.a;
                    int v3 = constraintSet0.e == 0 ? v : v1;
                    if(constraintSet0.e == 0) {
                        v = v1;
                    }
                    motionLayout0.resolveSystem(constraintWidgetContainer0, v2, v3, v);
                }
            }
            else {
                ConstraintSet constraintSet1 = this.c;
                if(constraintSet1 != null) {
                    MotionLayout.this.resolveSystem(this.a, v2, (constraintSet1.e == 0 ? v : v1), (constraintSet1.e == 0 ? v1 : v));
                }
                MotionLayout motionLayout1 = MotionLayout.this;
                ConstraintWidgetContainer constraintWidgetContainer1 = this.b;
                int v4 = this.d == null || this.d.e == 0 ? v : v1;
                if(this.d == null || this.d.e == 0) {
                    v = v1;
                }
                motionLayout1.resolveSystem(constraintWidgetContainer1, v2, v4, v);
            }
        }

        void c(ConstraintWidgetContainer constraintWidgetContainer0, ConstraintWidgetContainer constraintWidgetContainer1) {
            ConstraintWidget constraintWidget1;
            ArrayList arrayList0 = constraintWidgetContainer0.m2();
            HashMap hashMap0 = new HashMap();
            hashMap0.put(constraintWidgetContainer0, constraintWidgetContainer1);
            constraintWidgetContainer1.m2().clear();
            constraintWidgetContainer1.n(constraintWidgetContainer0, hashMap0);
            for(Object object0: arrayList0) {
                ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
                if(constraintWidget0 instanceof Barrier) {
                    constraintWidget1 = new Barrier();
                }
                else if(constraintWidget0 instanceof Guideline) {
                    constraintWidget1 = new Guideline();
                }
                else if(constraintWidget0 instanceof Flow) {
                    constraintWidget1 = new Flow();
                }
                else if(constraintWidget0 instanceof Placeholder) {
                    constraintWidget1 = new Placeholder();
                }
                else if(constraintWidget0 instanceof Helper) {
                    constraintWidget1 = new HelperWidget();
                }
                else {
                    constraintWidget1 = new ConstraintWidget();
                }
                constraintWidgetContainer1.a(constraintWidget1);
                hashMap0.put(constraintWidget0, constraintWidget1);
            }
            for(Object object1: arrayList0) {
                ((ConstraintWidget)hashMap0.get(((ConstraintWidget)object1))).n(((ConstraintWidget)object1), hashMap0);
            }
        }

        @SuppressLint({"LogConditional"})
        private void d(String s, ConstraintWidgetContainer constraintWidgetContainer0) {
            String s1 = s + " " + Debug.k(((View)constraintWidgetContainer0.w()));
            Log.v("MotionLayout", s1 + "  ========= " + constraintWidgetContainer0);
            int v = constraintWidgetContainer0.m2().size();
            for(int v1 = 0; v1 < v; ++v1) {
                ConstraintWidget constraintWidget0 = (ConstraintWidget)constraintWidgetContainer0.m2().get(v1);
                String s2 = "_";
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append("" + (constraintWidget0.R.f == null ? "_" : "T") + (constraintWidget0.T.f == null ? "_" : "B") + (constraintWidget0.Q.f == null ? "_" : "L"));
                if(constraintWidget0.S.f != null) {
                    s2 = "R";
                }
                stringBuilder0.append(s2);
                String s3 = stringBuilder0.toString();
                View view0 = (View)constraintWidget0.w();
                String s4 = Debug.k(view0);
                if(view0 instanceof TextView) {
                    s4 = s4 + "(" + ((TextView)view0).getText() + ")";
                }
                Log.v("MotionLayout", s1 + "[" + v1 + "] " + "  " + s4 + " " + constraintWidget0 + " " + s3);
            }
            Log.v("MotionLayout", s1 + " done. ");
        }

        @SuppressLint({"LogConditional"})
        private void e(String s, LayoutParams constraintLayout$LayoutParams0) {
            String s1 = "|__";
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(" " + (constraintLayout$LayoutParams0.t == -1 ? "__" : "SS") + (constraintLayout$LayoutParams0.s == -1 ? "|__" : "|SE") + (constraintLayout$LayoutParams0.u == -1 ? "|__" : "|ES") + (constraintLayout$LayoutParams0.v == -1 ? "|__" : "|EE") + (constraintLayout$LayoutParams0.e == -1 ? "|__" : "|LL") + (constraintLayout$LayoutParams0.f == -1 ? "|__" : "|LR") + (constraintLayout$LayoutParams0.g == -1 ? "|__" : "|RL") + (constraintLayout$LayoutParams0.h == -1 ? "|__" : "|RR") + (constraintLayout$LayoutParams0.i == -1 ? "|__" : "|TT") + (constraintLayout$LayoutParams0.j == -1 ? "|__" : "|TB") + (constraintLayout$LayoutParams0.k == -1 ? "|__" : "|BT"));
            if(constraintLayout$LayoutParams0.l != -1) {
                s1 = "|BB";
            }
            stringBuilder0.append(s1);
            Log.v("MotionLayout", s + stringBuilder0.toString());
        }

        @SuppressLint({"LogConditional"})
        private void f(String s, ConstraintWidget constraintWidget0) {
            String s3;
            String s1 = "B";
            String s2 = "__";
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(" " + (constraintWidget0.R.f == null ? "__" : "T" + (constraintWidget0.R.f.e == Type.c ? "T" : "B")));
            if(constraintWidget0.T.f == null) {
                s3 = "__";
            }
            else {
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append("B");
                if(constraintWidget0.T.f.e == Type.c) {
                    s1 = "T";
                }
                stringBuilder1.append(s1);
                s3 = stringBuilder1.toString();
            }
            stringBuilder0.append(s3);
            String s4 = "R";
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(stringBuilder0.toString() + (constraintWidget0.Q.f == null ? "__" : "L" + (constraintWidget0.Q.f.e == Type.b ? "L" : "R")));
            if(constraintWidget0.S.f != null) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("R");
                if(constraintWidget0.S.f.e == Type.b) {
                    s4 = "L";
                }
                stringBuilder3.append(s4);
                s2 = stringBuilder3.toString();
            }
            stringBuilder2.append(s2);
            Log.v("MotionLayout", s + stringBuilder2.toString() + " ---  " + constraintWidget0);
        }

        ConstraintWidget g(ConstraintWidgetContainer constraintWidgetContainer0, View view0) {
            if(constraintWidgetContainer0.w() == view0) {
                return constraintWidgetContainer0;
            }
            ArrayList arrayList0 = constraintWidgetContainer0.m2();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ConstraintWidget constraintWidget0 = (ConstraintWidget)arrayList0.get(v1);
                if(constraintWidget0.w() == view0) {
                    return constraintWidget0;
                }
            }
            return null;
        }

        void h(ConstraintWidgetContainer constraintWidgetContainer0, ConstraintSet constraintSet0, ConstraintSet constraintSet1) {
            this.c = constraintSet0;
            this.d = constraintSet1;
            this.a = new ConstraintWidgetContainer();
            this.b = new ConstraintWidgetContainer();
            this.a.V2(MotionLayout.this.mLayoutWidget.H2());
            this.b.V2(MotionLayout.this.mLayoutWidget.H2());
            this.a.q2();
            this.b.q2();
            this.c(MotionLayout.this.mLayoutWidget, this.a);
            this.c(MotionLayout.this.mLayoutWidget, this.b);
            if(((double)MotionLayout.this.o) > 0.5) {
                if(constraintSet0 != null) {
                    this.m(this.a, constraintSet0);
                }
                this.m(this.b, constraintSet1);
            }
            else {
                this.m(this.b, constraintSet1);
                if(constraintSet0 != null) {
                    this.m(this.a, constraintSet0);
                }
            }
            this.a.Z2(MotionLayout.this.isRtl());
            this.a.b3();
            this.b.Z2(MotionLayout.this.isRtl());
            this.b.b3();
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = MotionLayout.this.getLayoutParams();
            if(viewGroup$LayoutParams0 != null) {
                if(viewGroup$LayoutParams0.width == -2) {
                    this.a.E1(DimensionBehaviour.b);
                    this.b.E1(DimensionBehaviour.b);
                }
                if(viewGroup$LayoutParams0.height == -2) {
                    this.a.Z1(DimensionBehaviour.b);
                    this.b.Z1(DimensionBehaviour.b);
                }
            }
        }

        public boolean i(int v, int v1) {
            return v != this.e || v1 != this.f;
        }

        public void j(int v, int v1) {
            int v2 = View.MeasureSpec.getMode(v);
            int v3 = View.MeasureSpec.getMode(v1);
            MotionLayout.this.Y8 = v2;
            MotionLayout.this.Z8 = v3;
            this.b(v, v1);
            if(!(MotionLayout.this.getParent() instanceof MotionLayout) || v2 != 0x40000000 || v3 != 0x40000000) {
                this.b(v, v1);
                MotionLayout.this.U8 = this.a.m0();
                MotionLayout.this.V8 = this.a.D();
                MotionLayout.this.W8 = this.b.m0();
                MotionLayout.this.X8 = this.b.D();
                MotionLayout.this.T8 = MotionLayout.this.U8 != MotionLayout.this.W8 || MotionLayout.this.V8 != MotionLayout.this.X8;
            }
            MotionLayout motionLayout0 = MotionLayout.this;
            int v4 = motionLayout0.U8;
            int v5 = motionLayout0.V8;
            if(motionLayout0.Y8 == 0x80000000 || motionLayout0.Y8 == 0) {
                v4 = (int)(((float)v4) + motionLayout0.a9 * ((float)(motionLayout0.W8 - v4)));
            }
            if(motionLayout0.Z8 == 0x80000000 || motionLayout0.Z8 == 0) {
                v5 = (int)(((float)v5) + motionLayout0.a9 * ((float)(motionLayout0.X8 - v5)));
            }
            MotionLayout.this.resolveMeasuredDimension(v, v1, v4, v5, this.a.Q2() || this.b.Q2(), this.a.O2() || this.b.O2());
        }

        public void k() {
            this.j(MotionLayout.this.h, MotionLayout.this.i);
            MotionLayout.this.S0();
        }

        public void l(int v, int v1) {
            this.e = v;
            this.f = v1;
        }

        private void m(ConstraintWidgetContainer constraintWidgetContainer0, ConstraintSet constraintSet0) {
            SparseArray sparseArray0 = new SparseArray();
            androidx.constraintlayout.widget.Constraints.LayoutParams constraints$LayoutParams0 = new androidx.constraintlayout.widget.Constraints.LayoutParams(-2, -2);
            sparseArray0.clear();
            sparseArray0.put(0, constraintWidgetContainer0);
            sparseArray0.put(MotionLayout.this.getId(), constraintWidgetContainer0);
            if(constraintSet0 != null && constraintSet0.e != 0) {
                ConstraintWidgetContainer constraintWidgetContainer1 = this.b;
                int v = MotionLayout.this.getOptimizationLevel();
                int v1 = View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 0x40000000);
                int v2 = View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 0x40000000);
                MotionLayout.this.resolveSystem(constraintWidgetContainer1, v, v1, v2);
            }
            for(Object object0: constraintWidgetContainer0.m2()) {
                ((ConstraintWidget)object0).g1(true);
                sparseArray0.put(((View)((ConstraintWidget)object0).w()).getId(), ((ConstraintWidget)object0));
            }
            for(Object object1: constraintWidgetContainer0.m2()) {
                ConstraintWidget constraintWidget0 = (ConstraintWidget)object1;
                View view0 = (View)constraintWidget0.w();
                constraintSet0.u(view0.getId(), constraints$LayoutParams0);
                constraintWidget0.d2(constraintSet0.v0(view0.getId()));
                constraintWidget0.z1(constraintSet0.n0(view0.getId()));
                if(view0 instanceof ConstraintHelper) {
                    constraintSet0.s(((ConstraintHelper)view0), constraintWidget0, constraints$LayoutParams0, sparseArray0);
                    if(view0 instanceof androidx.constraintlayout.widget.Barrier) {
                        ((androidx.constraintlayout.widget.Barrier)view0).K();
                    }
                }
                constraints$LayoutParams0.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout.this.applyConstraintsFromLayoutParams(false, view0, constraintWidget0, constraints$LayoutParams0, sparseArray0);
                if(constraintSet0.u0(view0.getId()) == 1) {
                    constraintWidget0.c2(view0.getVisibility());
                }
                else {
                    constraintWidget0.c2(constraintSet0.t0(view0.getId()));
                }
            }
            for(Object object2: constraintWidgetContainer0.m2()) {
                ConstraintWidget constraintWidget1 = (ConstraintWidget)object2;
                if(constraintWidget1 instanceof VirtualLayout) {
                    ((ConstraintHelper)constraintWidget1.w()).I(constraintWidgetContainer0, ((Helper)constraintWidget1), sparseArray0);
                    ((VirtualLayout)(((Helper)constraintWidget1))).o2();
                }
            }
        }
    }

    public interface MotionTracker {
        float a(int arg1);

        void b(MotionEvent arg1);

        float c();

        void clear();

        void d(int arg1, float arg2);

        void e(int arg1);

        float f();

        float g(int arg1);

        void recycle();
    }

    static class MyTracker implements MotionTracker {
        VelocityTracker a;
        private static MyTracker b;

        static {
            MyTracker.b = new MyTracker();
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
        public float a(int v) {
            return this.a == null ? 0.0f : this.a(v);
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
        public void b(MotionEvent motionEvent0) {
            VelocityTracker velocityTracker0 = this.a;
            if(velocityTracker0 != null) {
                velocityTracker0.addMovement(motionEvent0);
            }
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
        public float c() {
            return this.a == null ? 0.0f : this.a.getYVelocity();
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
        public void clear() {
            VelocityTracker velocityTracker0 = this.a;
            if(velocityTracker0 != null) {
                velocityTracker0.clear();
            }
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
        public void d(int v, float f) {
            VelocityTracker velocityTracker0 = this.a;
            if(velocityTracker0 != null) {
                velocityTracker0.computeCurrentVelocity(v, f);
            }
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
        public void e(int v) {
            VelocityTracker velocityTracker0 = this.a;
            if(velocityTracker0 != null) {
                velocityTracker0.computeCurrentVelocity(v);
            }
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
        public float f() {
            return this.a == null ? 0.0f : this.a.getXVelocity();
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
        public float g(int v) {
            return this.a == null ? 0.0f : this.a.getXVelocity(v);
        }

        public static MyTracker h() {
            MyTracker motionLayout$MyTracker0 = MyTracker.b;
            motionLayout$MyTracker0.a = VelocityTracker.obtain();
            return MyTracker.b;
        }

        @Override  // androidx.constraintlayout.motion.widget.MotionLayout$MotionTracker
        public void recycle() {
            VelocityTracker velocityTracker0 = this.a;
            if(velocityTracker0 != null) {
                velocityTracker0.recycle();
                this.a = null;
            }
        }
    }

    class StateCache {
        float a;
        float b;
        int c;
        int d;
        final String e;
        final String f;
        final String g;
        final String h;
        final MotionLayout i;

        StateCache() {
            this.a = NaNf;
            this.b = NaNf;
            this.c = -1;
            this.d = -1;
            this.e = "motion.progress";
            this.f = "motion.velocity";
            this.g = "motion.StartState";
            this.h = "motion.EndState";
        }

        void a() {
            int v = this.c;
            if(v != -1 || this.d != -1) {
                if(v == -1) {
                    MotionLayout.this.a1(this.d);
                }
                else {
                    int v1 = this.d;
                    if(v1 == -1) {
                        MotionLayout.this.setState(v, -1, -1);
                    }
                    else {
                        MotionLayout.this.R0(v, v1);
                    }
                }
                MotionLayout.this.setState(TransitionState.b);
            }
            if(Float.isNaN(this.b)) {
                if(Float.isNaN(this.a)) {
                    return;
                }
                MotionLayout.this.setProgress(this.a);
                return;
            }
            MotionLayout.this.Q0(this.a, this.b);
            this.a = NaNf;
            this.b = NaNf;
            this.c = -1;
            this.d = -1;
        }

        public Bundle b() {
            Bundle bundle0 = new Bundle();
            bundle0.putFloat("motion.progress", this.a);
            bundle0.putFloat("motion.velocity", this.b);
            bundle0.putInt("motion.StartState", this.c);
            bundle0.putInt("motion.EndState", this.d);
            return bundle0;
        }

        public void c() {
            this.d = MotionLayout.this.g;
            this.c = MotionLayout.this.e;
            this.b = MotionLayout.this.getVelocity();
            this.a = MotionLayout.this.getProgress();
        }

        public void d(int v) {
            this.d = v;
        }

        public void e(float f) {
            this.a = f;
        }

        public void f(int v) {
            this.c = v;
        }

        public void g(Bundle bundle0) {
            this.a = bundle0.getFloat("motion.progress");
            this.b = bundle0.getFloat("motion.velocity");
            this.c = bundle0.getInt("motion.StartState");
            this.d = bundle0.getInt("motion.EndState");
        }

        public void h(float f) {
            this.b = f;
        }
    }

    public interface TransitionListener {
        void g(MotionLayout arg1, int arg2, int arg3, float arg4);

        void i(MotionLayout arg1, int arg2);

        void j(MotionLayout arg1, int arg2, int arg3);

        void k(MotionLayout arg1, int arg2, boolean arg3, float arg4);
    }

    static enum TransitionState {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED;

        private static TransitionState[] a() [...] // Inlined contents
    }

    private StopLogic A;
    public static final int A9 = 4;
    private DecelerateInterpolator B;
    public static final int B9 = 5;
    private DesignTool C;
    public static final int C9 = 6;
    boolean D;
    public static final int D9 = 7;
    int E;
    static final String E9 = "MotionLayout";
    int F;
    private static final boolean F9 = false;
    int G;
    public static boolean G9 = false;
    int H;
    public static final int H9 = 0;
    boolean I;
    public static final int I9 = 1;
    float J;
    public static final int J9 = 2;
    float K;
    static final int K9 = 50;
    long L;
    public static final int L9 = 0;
    float M;
    private CopyOnWriteArrayList M8;
    public static final int M9 = 1;
    private boolean N;
    private int N8;
    public static final int N9 = 2;
    private ArrayList O;
    private long O8;
    public static final int O9 = 3;
    private ArrayList P;
    private float P8;
    private static final float P9 = 0.00001f;
    private ArrayList Q;
    private int Q8;
    private float R8;
    boolean S8;
    protected boolean T8;
    int U8;
    int V8;
    int W8;
    int X8;
    int Y8;
    int Z8;
    MotionScene a;
    float a9;
    Interpolator b;
    private KeyCache b9;
    Interpolator c;
    private boolean c9;
    float d;
    private StateCache d9;
    private int e;
    private Runnable e9;
    int f;
    private int[] f9;
    private int g;
    int g9;
    private int h;
    private boolean h9;
    private int i;
    int i9;
    private boolean j;
    HashMap j9;
    HashMap k;
    private int k9;
    private long l;
    private int l9;
    private float m;
    private int m9;
    float n;
    Rect n9;
    float o;
    private boolean o9;
    private long p;
    TransitionState p9;
    float q;
    Model q9;
    private boolean r;
    private boolean r9;
    boolean s;
    private RectF s9;
    boolean t;
    private View t9;
    private TransitionListener u;
    private Matrix u9;
    private float v;
    ArrayList v9;
    private float w;
    public static final int w9 = 0;
    int x;
    public static final int x9 = 1;
    DevModeDraw y;
    public static final int y9 = 2;
    private boolean z;
    public static final int z9 = 3;

    public MotionLayout(@NonNull Context context0) {
        super(context0);
        this.c = null;
        this.d = 0.0f;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = new HashMap();
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.t = false;
        this.x = 0;
        this.z = false;
        this.A = new StopLogic();
        this.B = new DecelerateInterpolator(this);
        this.D = true;
        this.I = false;
        this.N = false;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.M8 = null;
        this.N8 = 0;
        this.O8 = -1L;
        this.P8 = 0.0f;
        this.Q8 = 0;
        this.R8 = 0.0f;
        this.S8 = false;
        this.T8 = false;
        this.b9 = new KeyCache();
        this.c9 = false;
        this.e9 = null;
        this.f9 = null;
        this.g9 = 0;
        this.h9 = false;
        this.i9 = 0;
        this.j9 = new HashMap();
        this.n9 = new Rect();
        this.o9 = false;
        this.p9 = TransitionState.a;
        this.q9 = new Model(this);
        this.r9 = false;
        this.s9 = new RectF();
        this.t9 = null;
        this.u9 = null;
        this.v9 = new ArrayList();
        this.B0(null);
    }

    public MotionLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c = null;
        this.d = 0.0f;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = new HashMap();
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.t = false;
        this.x = 0;
        this.z = false;
        this.A = new StopLogic();
        this.B = new DecelerateInterpolator(this);
        this.D = true;
        this.I = false;
        this.N = false;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.M8 = null;
        this.N8 = 0;
        this.O8 = -1L;
        this.P8 = 0.0f;
        this.Q8 = 0;
        this.R8 = 0.0f;
        this.S8 = false;
        this.T8 = false;
        this.b9 = new KeyCache();
        this.c9 = false;
        this.e9 = null;
        this.f9 = null;
        this.g9 = 0;
        this.h9 = false;
        this.i9 = 0;
        this.j9 = new HashMap();
        this.n9 = new Rect();
        this.o9 = false;
        this.p9 = TransitionState.a;
        this.q9 = new Model(this);
        this.r9 = false;
        this.s9 = new RectF();
        this.t9 = null;
        this.u9 = null;
        this.v9 = new ArrayList();
        this.B0(attributeSet0);
    }

    public MotionLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c = null;
        this.d = 0.0f;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = true;
        this.k = new HashMap();
        this.l = 0L;
        this.m = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0.0f;
        this.s = false;
        this.t = false;
        this.x = 0;
        this.z = false;
        this.A = new StopLogic();
        this.B = new DecelerateInterpolator(this);
        this.D = true;
        this.I = false;
        this.N = false;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.M8 = null;
        this.N8 = 0;
        this.O8 = -1L;
        this.P8 = 0.0f;
        this.Q8 = 0;
        this.R8 = 0.0f;
        this.S8 = false;
        this.T8 = false;
        this.b9 = new KeyCache();
        this.c9 = false;
        this.e9 = null;
        this.f9 = null;
        this.g9 = 0;
        this.h9 = false;
        this.i9 = 0;
        this.j9 = new HashMap();
        this.n9 = new Rect();
        this.o9 = false;
        this.p9 = TransitionState.a;
        this.q9 = new Model(this);
        this.r9 = false;
        this.s9 = new RectF();
        this.t9 = null;
        this.u9 = null;
        this.v9 = new ArrayList();
        this.B0(attributeSet0);
    }

    private boolean A0(float f, float f1, View view0, MotionEvent motionEvent0) {
        boolean z = false;
        if(view0 instanceof ViewGroup) {
            for(int v = ((ViewGroup)view0).getChildCount() - 1; v >= 0; --v) {
                View view1 = ((ViewGroup)view0).getChildAt(v);
                if(this.A0(((float)view1.getLeft()) + f - ((float)view0.getScrollX()), ((float)view1.getTop()) + f1 - ((float)view0.getScrollY()), view1, motionEvent0)) {
                    z = true;
                    break;
                }
            }
        }
        if(!z) {
            this.s9.set(f, f1, ((float)view0.getRight()) + f - ((float)view0.getLeft()), ((float)view0.getBottom()) + f1 - ((float)view0.getTop()));
            return (motionEvent0.getAction() != 0 || this.s9.contains(motionEvent0.getX(), motionEvent0.getY())) && this.c0(view0, motionEvent0, -f, -f1);
        }
        return true;
    }

    private void B0(AttributeSet attributeSet0) {
        MotionLayout.G9 = this.isInEditMode();
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.MotionLayout);
            int v = typedArray0.getIndexCount();
            boolean z = true;
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.MotionLayout_layoutDescription) {
                    int v3 = typedArray0.getResourceId(v2, -1);
                    this.a = new MotionScene(this.getContext(), this, v3);
                }
                else if(v2 == styleable.MotionLayout_currentState) {
                    this.f = typedArray0.getResourceId(v2, -1);
                }
                else if(v2 == styleable.MotionLayout_motionProgress) {
                    this.q = typedArray0.getFloat(v2, 0.0f);
                    this.s = true;
                }
                else if(v2 == styleable.MotionLayout_applyMotionScene) {
                    z = typedArray0.getBoolean(v2, z);
                }
                else if(v2 != styleable.MotionLayout_showPaths) {
                    if(v2 == styleable.MotionLayout_motionDebug) {
                        this.x = typedArray0.getInt(v2, 0);
                    }
                }
                else if(this.x == 0) {
                    this.x = typedArray0.getBoolean(v2, false) ? 2 : 0;
                }
            }
            typedArray0.recycle();
            if(this.a == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if(!z) {
                this.a = null;
            }
        }
        if(this.x != 0) {
            this.d0();
        }
        if(this.f == -1) {
            MotionScene motionScene0 = this.a;
            if(motionScene0 != null) {
                this.f = motionScene0.O();
                this.e = this.a.O();
                this.g = this.a.u();
            }
        }
    }

    public boolean C0() {
        return this.o9;
    }

    public boolean D0() {
        return this.h9;
    }

    public boolean E0() {
        return this.j;
    }

    public boolean F0(int v) {
        return this.a == null ? false : this.a.V(v);
    }

    public void G0(int v) {
        if(!this.isAttachedToWindow()) {
            this.f = v;
        }
        if(this.e == v) {
            this.setProgress(0.0f);
            return;
        }
        if(this.g == v) {
            this.setProgress(1.0f);
            return;
        }
        this.R0(v, v);
    }

    int H0(String s) {
        return this.a == null ? 0 : this.a.X(s);
    }

    protected MotionTracker I0() {
        return MyTracker.h();
    }

    void J0() {
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            return;
        }
        if(motionScene0.i(this, this.f)) {
            this.requestLayout();
            return;
        }
        int v = this.f;
        if(v != -1) {
            this.a.f(this, v);
        }
        if(this.a.s0()) {
            this.a.q0();
        }
    }

    private void K0() {
        if(this.u == null && (this.M8 == null || this.M8.isEmpty())) {
            return;
        }
        this.S8 = false;
        for(Object object0: this.v9) {
            Integer integer0 = (Integer)object0;
            TransitionListener motionLayout$TransitionListener0 = this.u;
            if(motionLayout$TransitionListener0 != null) {
                motionLayout$TransitionListener0.i(this, ((int)integer0));
            }
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.M8;
            if(copyOnWriteArrayList0 != null) {
                for(Object object1: copyOnWriteArrayList0) {
                    ((TransitionListener)object1).i(this, ((int)integer0));
                }
            }
        }
        this.v9.clear();
    }

    @Deprecated
    public void L0() {
        Log.e("MotionLayout", "This method is deprecated. Please call rebuildScene() instead.");
        this.M0();
    }

    public void M0() {
        this.q9.k();
        this.invalidate();
    }

    public boolean N0(TransitionListener motionLayout$TransitionListener0) {
        return this.M8 == null ? false : this.M8.remove(motionLayout$TransitionListener0);
    }

    public void O0(int v, int v1) {
        int v2 = 1;
        this.h9 = true;
        this.k9 = this.getWidth();
        this.l9 = this.getHeight();
        int v3 = this.getDisplay().getRotation();
        if((v3 + 1) % 4 <= (this.m9 + 1) % 4) {
            v2 = 2;
        }
        this.i9 = v2;
        this.m9 = v3;
        int v4 = this.getChildCount();
        for(int v5 = 0; v5 < v4; ++v5) {
            View view0 = this.getChildAt(v5);
            ViewState viewState0 = (ViewState)this.j9.get(view0);
            if(viewState0 == null) {
                viewState0 = new ViewState();
                this.j9.put(view0, viewState0);
            }
            viewState0.a(view0);
        }
        this.e = -1;
        this.g = v;
        this.a.o0(-1, v);
        this.q9.h(this.mLayoutWidget, null, this.a.o(this.g));
        this.n = 0.0f;
        this.o = 0.0f;
        this.invalidate();
        this.X0(new Runnable() {
            final MotionLayout a;

            @Override
            public void run() {
                MotionLayout.this.h9 = false;
            }
        });
        if(v1 > 0) {
            this.m = ((float)v1) / 1000.0f;
        }
    }

    public void P0(int v) {
        if(this.getCurrentState() == -1) {
            this.a1(v);
            return;
        }
        int[] arr_v = this.f9;
        if(arr_v == null) {
            this.f9 = new int[4];
        }
        else if(arr_v.length <= this.g9) {
            this.f9 = Arrays.copyOf(arr_v, arr_v.length * 2);
        }
        int v1 = this.g9;
        this.g9 = v1 + 1;
        this.f9[v1] = v;
    }

    public void Q0(float f, float f1) {
        if(!this.isAttachedToWindow()) {
            if(this.d9 == null) {
                this.d9 = new StateCache(this);
            }
            this.d9.e(f);
            this.d9.h(f1);
            return;
        }
        this.setProgress(f);
        this.setState(TransitionState.c);
        this.d = f1;
        float f2 = 1.0f;
        int v = Float.compare(f1, 0.0f);
        if(v != 0) {
            if(v <= 0) {
                f2 = 0.0f;
            }
            this.a0(f2);
            return;
        }
        if(f != 0 && f != 0x3F800000) {
            if(f <= 0.5f) {
                f2 = 0.0f;
            }
            this.a0(f2);
        }
    }

    public void R0(int v, int v1) {
        if(!this.isAttachedToWindow()) {
            if(this.d9 == null) {
                this.d9 = new StateCache(this);
            }
            this.d9.f(v);
            this.d9.d(v1);
            return;
        }
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            this.e = v;
            this.g = v1;
            motionScene0.o0(v, v1);
            this.q9.h(this.mLayoutWidget, this.a.o(v), this.a.o(v1));
            this.M0();
            this.o = 0.0f;
            this.Y0();
        }
    }

    private void S0() {
        int v = this.getChildCount();
        this.q9.a();
        boolean z = true;
        this.s = true;
        SparseArray sparseArray0 = new SparseArray();
        int v1 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            View view0 = this.getChildAt(v2);
            sparseArray0.put(view0.getId(), ((MotionController)this.k.get(view0)));
        }
        int v3 = this.getWidth();
        int v4 = this.getHeight();
        int v5 = this.a.m();
        if(v5 != -1) {
            for(int v6 = 0; v6 < v; ++v6) {
                MotionController motionController0 = (MotionController)this.k.get(this.getChildAt(v6));
                if(motionController0 != null) {
                    motionController0.U(v5);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray0 = new SparseBooleanArray();
        int[] arr_v = new int[this.k.size()];
        int v8 = 0;
        for(int v7 = 0; v7 < v; ++v7) {
            View view1 = this.getChildAt(v7);
            MotionController motionController1 = (MotionController)this.k.get(view1);
            if(motionController1.k() != -1) {
                sparseBooleanArray0.put(motionController1.k(), true);
                arr_v[v8] = motionController1.k();
                ++v8;
            }
        }
        if(this.Q == null) {
            for(int v11 = 0; v11 < v8; ++v11) {
                MotionController motionController4 = (MotionController)this.k.get(this.findViewById(arr_v[v11]));
                if(motionController4 != null) {
                    this.a.z(motionController4);
                    motionController4.a0(v3, v4, this.m, 0x2FCEAF3831CL);
                }
            }
        }
        else {
            for(int v9 = 0; v9 < v8; ++v9) {
                MotionController motionController2 = (MotionController)this.k.get(this.findViewById(arr_v[v9]));
                if(motionController2 != null) {
                    this.a.z(motionController2);
                }
            }
            for(Object object0: this.Q) {
                ((MotionHelper)object0).b(this, this.k);
            }
            for(int v10 = 0; v10 < v8; ++v10) {
                MotionController motionController3 = (MotionController)this.k.get(this.findViewById(arr_v[v10]));
                if(motionController3 != null) {
                    motionController3.a0(v3, v4, this.m, 3285296354200L);
                }
            }
        }
        for(int v12 = 0; v12 < v; ++v12) {
            View view2 = this.getChildAt(v12);
            MotionController motionController5 = (MotionController)this.k.get(view2);
            if(!sparseBooleanArray0.get(view2.getId()) && motionController5 != null) {
                this.a.z(motionController5);
                motionController5.a0(v3, v4, this.m, 0x2FCEAFA753CL);
            }
        }
        float f = this.a.N();
        if(f != 0.0f) {
            if(((double)f) >= 0.0) {
                z = false;
            }
            float f1 = Math.abs(f);
            float f2 = -3.402823E+38f;
            float f3 = 3.402823E+38f;
            float f4 = 3.402823E+38f;
            float f5 = -3.402823E+38f;
            for(int v13 = 0; v13 < v; ++v13) {
                MotionController motionController6 = (MotionController)this.k.get(this.getChildAt(v13));
                if(!Float.isNaN(motionController6.m)) {
                    for(int v14 = 0; v14 < v; ++v14) {
                        MotionController motionController7 = (MotionController)this.k.get(this.getChildAt(v14));
                        if(!Float.isNaN(motionController7.m)) {
                            f3 = Math.min(f3, motionController7.m);
                            f2 = Math.max(f2, motionController7.m);
                        }
                    }
                    while(v1 < v) {
                        MotionController motionController8 = (MotionController)this.k.get(this.getChildAt(v1));
                        if(!Float.isNaN(motionController8.m)) {
                            motionController8.o = 1.0f / (1.0f - f1);
                            motionController8.n = z ? f1 - (f2 - motionController8.m) / (f2 - f3) * f1 : f1 - (motionController8.m - f3) * f1 / (f2 - f3);
                        }
                        ++v1;
                    }
                    return;
                }
                float f6 = motionController6.t();
                float f7 = motionController6.u();
                float f8 = z ? f7 - f6 : f7 + f6;
                f4 = Math.min(f4, f8);
                f5 = Math.max(f5, f8);
            }
            while(v1 < v) {
                MotionController motionController9 = (MotionController)this.k.get(this.getChildAt(v1));
                float f9 = motionController9.t();
                float f10 = motionController9.u();
                motionController9.o = 1.0f / (1.0f - f1);
                motionController9.n = f1 - ((z ? f10 - f9 : f10 + f9) - f4) * f1 / (f5 - f4);
                ++v1;
            }
        }
    }

    private Rect T0(ConstraintWidget constraintWidget0) {
        this.n9.top = constraintWidget0.p0();
        this.n9.left = constraintWidget0.o0();
        Rect rect0 = this.n9;
        this.n9.right = constraintWidget0.m0() + rect0.left;
        rect0.bottom = constraintWidget0.D() + this.n9.top;
        return this.n9;
    }

    public void U0(int v, float f, float f1) {
        if(this.a == null) {
            return;
        }
        if(this.o == f) {
            return;
        }
        this.z = true;
        this.l = 3286510530100L;
        this.m = ((float)this.a.t()) / 1000.0f;
        this.q = f;
        this.s = true;
        if(v == 0 || v == 1 || v == 2) {
        label_26:
            if(v == 1 || v == 7) {
                f = 0.0f;
            }
            else if(v == 2 || v == 6) {
                f = 1.0f;
            }
            if(this.a.n() == 0) {
                this.A.b(this.o, f, f1, this.m, this.a.C(), this.a.D());
            }
            else {
                this.A.f(this.o, f, f1, this.a.K(), this.a.L(), this.a.J(), this.a.M(), this.a.I());
            }
            this.q = f;
            this.f = this.f;
            this.b = this.A;
        }
        else if(v != 4) {
            switch(v) {
                case 5: {
                    if(MotionLayout.i1(f1, this.o, this.a.C())) {
                        this.B.b(f1, this.o, this.a.C());
                        this.b = this.B;
                    }
                    else {
                        this.A.b(this.o, f, f1, this.m, this.a.C(), this.a.D());
                        this.d = 0.0f;
                        this.q = f;
                        this.f = this.f;
                        this.b = this.A;
                    }
                    break;
                }
                case 6: 
                case 7: {
                    goto label_26;
                }
            }
        }
        else {
            this.B.b(f1, this.o, this.a.C());
            this.b = this.B;
        }
        this.r = false;
        this.l = 3286516873300L;
        this.invalidate();
    }

    public void V0(float f, float f1) {
        if(this.a == null) {
            return;
        }
        if(this.o == f) {
            return;
        }
        this.z = true;
        this.l = 0x2FD3420A7E0L;
        this.m = ((float)this.a.t()) / 1000.0f;
        this.q = f;
        this.s = true;
        this.A.f(this.o, f, f1, this.a.K(), this.a.L(), this.a.J(), this.a.M(), this.a.I());
        this.q = f;
        this.f = this.f;
        this.b = this.A;
        this.r = false;
        this.l = 0x2FD3452081CL;
        this.invalidate();
    }

    public void W0() {
        this.a0(1.0f);
        this.e9 = null;
    }

    public void X0(Runnable runnable0) {
        this.a0(1.0f);
        this.e9 = runnable0;
    }

    public void Y0() {
        this.a0(0.0f);
    }

    public void Z(TransitionListener motionLayout$TransitionListener0) {
        if(this.M8 == null) {
            this.M8 = new CopyOnWriteArrayList();
        }
        this.M8.add(motionLayout$TransitionListener0);
    }

    public void Z0(Runnable runnable0) {
        this.a0(0.0f);
        this.e9 = runnable0;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void a(@NonNull View view0, @NonNull View view1, int v, int v1) {
        this.L = 0x2FD52021CD0L;
        this.M = 0.0f;
        this.J = 0.0f;
        this.K = 0.0f;
    }

    void a0(float f) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            return;
        }
        float f1 = this.n;
        if(this.o != f1 && this.r) {
            this.o = f1;
        }
        float f2 = this.o;
        if(f2 == f) {
            return;
        }
        this.z = false;
        this.q = f;
        this.m = ((float)motionScene0.t()) / 1000.0f;
        this.setProgress(this.q);
        this.b = null;
        this.c = this.a.x();
        this.r = false;
        this.l = 3287032648500L;
        this.s = true;
        this.n = f2;
        this.o = f2;
        this.invalidate();
    }

    public void a1(int v) {
        if(!this.isAttachedToWindow()) {
            if(this.d9 == null) {
                this.d9 = new StateCache(this);
            }
            this.d9.d(v);
            return;
        }
        this.c1(v, -1, -1);
    }

    public boolean b0(int v, MotionController motionController0) {
        return this.a == null ? false : this.a.h(v, motionController0);
    }

    public void b1(int v, int v1) {
        if(!this.isAttachedToWindow()) {
            if(this.d9 == null) {
                this.d9 = new StateCache(this);
            }
            this.d9.d(v);
            return;
        }
        this.d1(v, -1, -1, v1);
    }

    private boolean c0(View view0, MotionEvent motionEvent0, float f, float f1) {
        Matrix matrix0 = view0.getMatrix();
        if(matrix0.isIdentity()) {
            motionEvent0.offsetLocation(f, f1);
            boolean z = view0.onTouchEvent(motionEvent0);
            motionEvent0.offsetLocation(-f, -f1);
            return z;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.offsetLocation(f, f1);
        if(this.u9 == null) {
            this.u9 = new Matrix();
        }
        matrix0.invert(this.u9);
        motionEvent1.transform(this.u9);
        boolean z1 = view0.onTouchEvent(motionEvent1);
        motionEvent1.recycle();
        return z1;
    }

    public void c1(int v, int v1, int v2) {
        this.d1(v, v1, v2, -1);
    }

    private void d0() {
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        this.e0(motionScene0.O(), this.a.o(this.a.O()));
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        SparseIntArray sparseIntArray1 = new SparseIntArray();
        for(Object object0: this.a.s()) {
            if(((Transition)object0) == this.a.c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            this.f0(((Transition)object0));
            int v = ((Transition)object0).I();
            int v1 = ((Transition)object0).B();
            String s = Debug.i(this.getContext(), v);
            String s1 = Debug.i(this.getContext(), v1);
            if(sparseIntArray0.get(v) == v1) {
                Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + s + "->" + s1);
            }
            if(sparseIntArray1.get(v1) == v) {
                Log.e("MotionLayout", "CHECK: you can\'t have reverse transitions" + s + "->" + s1);
            }
            sparseIntArray0.put(v, v1);
            sparseIntArray1.put(v1, v);
            if(this.a.o(v) == null) {
                Log.e("MotionLayout", " no such constraintSetStart " + s);
            }
            if(this.a.o(v1) == null) {
                Log.e("MotionLayout", " no such constraintSetEnd " + s);
            }
        }
    }

    public void d1(int v, int v1, int v2, int v3) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            StateSet stateSet0 = motionScene0.b;
            if(stateSet0 != null) {
                int v4 = stateSet0.a(this.f, v, ((float)v1), ((float)v2));
                if(v4 != -1) {
                    v = v4;
                }
            }
        }
        int v5 = this.f;
        if(v5 == v) {
            return;
        }
        if(this.e == v) {
            this.a0(0.0f);
            if(v3 > 0) {
                this.m = ((float)v3) / 1000.0f;
            }
            return;
        }
        if(this.g == v) {
            this.a0(1.0f);
            if(v3 > 0) {
                this.m = ((float)v3) / 1000.0f;
            }
            return;
        }
        this.g = v;
        if(v5 != -1) {
            this.R0(v5, v);
            this.a0(1.0f);
            this.o = 0.0f;
            this.W0();
            if(v3 > 0) {
                this.m = ((float)v3) / 1000.0f;
            }
            return;
        }
        this.z = false;
        this.q = 1.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0x2FD58B5BF28L;
        this.l = 0x2FD58BAB960L;
        this.r = false;
        this.b = null;
        if(v3 == -1) {
            this.m = ((float)this.a.t()) / 1000.0f;
        }
        this.e = -1;
        this.a.o0(-1, this.g);
        SparseArray sparseArray0 = new SparseArray();
        if(v3 == 0) {
            this.m = ((float)this.a.t()) / 1000.0f;
        }
        else if(v3 > 0) {
            this.m = ((float)v3) / 1000.0f;
        }
        int v7 = this.getChildCount();
        this.k.clear();
        for(int v8 = 0; v8 < v7; ++v8) {
            View view0 = this.getChildAt(v8);
            MotionController motionController0 = new MotionController(view0);
            this.k.put(view0, motionController0);
            sparseArray0.put(view0.getId(), ((MotionController)this.k.get(view0)));
        }
        this.s = true;
        this.q9.h(this.mLayoutWidget, null, this.a.o(v));
        this.M0();
        this.q9.a();
        this.h0();
        int v9 = this.getWidth();
        int v10 = this.getHeight();
        if(this.Q == null) {
            for(int v13 = 0; v13 < v7; ++v13) {
                MotionController motionController3 = (MotionController)this.k.get(this.getChildAt(v13));
                if(motionController3 != null) {
                    this.a.z(motionController3);
                    motionController3.a0(v9, v10, this.m, 0x2FD58C8F96CL);
                }
            }
        }
        else {
            for(int v11 = 0; v11 < v7; ++v11) {
                MotionController motionController1 = (MotionController)this.k.get(this.getChildAt(v11));
                if(motionController1 != null) {
                    this.a.z(motionController1);
                }
            }
            for(Object object0: this.Q) {
                ((MotionHelper)object0).b(this, this.k);
            }
            for(int v12 = 0; v12 < v7; ++v12) {
                MotionController motionController2 = (MotionController)this.k.get(this.getChildAt(v12));
                if(motionController2 != null) {
                    motionController2.a0(v9, v10, this.m, 3287139271800L);
                }
            }
        }
        float f = this.a.N();
        if(f != 0.0f) {
            float f1 = 3.402823E+38f;
            float f2 = -3.402823E+38f;
            for(int v14 = 0; v14 < v7; ++v14) {
                MotionController motionController4 = (MotionController)this.k.get(this.getChildAt(v14));
                float f3 = motionController4.u() + motionController4.t();
                f1 = Math.min(f1, f3);
                f2 = Math.max(f2, f3);
            }
            for(int v6 = 0; v6 < v7; ++v6) {
                MotionController motionController5 = (MotionController)this.k.get(this.getChildAt(v6));
                motionController5.o = 1.0f / (1.0f - f);
                motionController5.n = f - (motionController5.t() + motionController5.u() - f1) * f / (f2 - f1);
            }
        }
        this.n = 0.0f;
        this.o = 0.0f;
        this.s = true;
        this.invalidate();
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected void dispatchDraw(Canvas canvas0) {
        ArrayList arrayList0 = this.Q;
        if(arrayList0 != null) {
            Iterator iterator0 = arrayList0.iterator();
            while(iterator0.hasNext()) {
                iterator0.next();
            }
        }
        this.n0(false);
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            ViewTransitionController viewTransitionController0 = motionScene0.r;
            if(viewTransitionController0 != null) {
                viewTransitionController0.d();
            }
        }
        super.dispatchDraw(canvas0);
        if(this.a == null) {
            return;
        }
        if((this.x & 1) == 1 && !this.isInEditMode()) {
            ++this.N8;
            long v = this.O8;
            if(v == -1L) {
                this.O8 = 3287125064500L;
            }
            else if(3287125064500L - v > 200000000L) {
                this.P8 = ((float)(((int)(((float)this.N8) / (((float)(3287125064500L - v)) * 1.000000E-09f) * 100.0f)))) / 100.0f;
                this.N8 = 0;
                this.O8 = 3287125064500L;
            }
            Paint paint0 = new Paint();
            paint0.setTextSize(42.0f);
            String s = this.P8 + " fps " + Debug.l(this, this.e) + " -> " + Debug.l(this, this.g) + " (progress: " + ((float)(((int)(this.getProgress() * 1000.0f)))) / 10.0f + " ) state=" + (this.f == -1 ? "undefined" : Debug.l(this, this.f));
            paint0.setColor(0xFF000000);
            canvas0.drawText(s, 11.0f, ((float)(this.getHeight() - 29)), paint0);
            paint0.setColor(0xFF880088);
            canvas0.drawText(s, 10.0f, ((float)(this.getHeight() - 30)), paint0);
        }
        if(this.x > 1) {
            if(this.y == null) {
                this.y = new DevModeDraw(this);
            }
            this.y.a(canvas0, this.k, this.a.t(), this.x);
        }
        ArrayList arrayList1 = this.Q;
        if(arrayList1 != null) {
            Iterator iterator1 = arrayList1.iterator();
            while(iterator1.hasNext()) {
                iterator1.next();
            }
        }
    }

    private void e0(int v, ConstraintSet constraintSet0) {
        String s = Debug.i(this.getContext(), v);
        int v1 = this.getChildCount();
        for(int v3 = 0; v3 < v1; ++v3) {
            View view0 = this.getChildAt(v3);
            int v4 = view0.getId();
            if(v4 == -1) {
                Log.w("MotionLayout", "CHECK: " + s + " ALL VIEWS SHOULD HAVE ID\'s " + view0.getClass().getName() + " does not!");
            }
            if(constraintSet0.k0(v4) == null) {
                Log.w("MotionLayout", "CHECK: " + s + " NO CONSTRAINTS for " + Debug.k(view0));
            }
        }
        int[] arr_v = constraintSet0.o0();
        for(int v2 = 0; v2 < arr_v.length; ++v2) {
            int v5 = arr_v[v2];
            String s1 = Debug.i(this.getContext(), v5);
            if(this.findViewById(arr_v[v2]) == null) {
                Log.w("MotionLayout", "CHECK: " + s + " NO View matches id " + s1);
            }
            if(constraintSet0.n0(v5) == -1) {
                Log.w("MotionLayout", "CHECK: " + s + "(" + s1 + ") no LAYOUT_HEIGHT");
            }
            if(constraintSet0.v0(v5) == -1) {
                Log.w("MotionLayout", "CHECK: " + s + "(" + s1 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    public void e1() {
        this.q9.h(this.mLayoutWidget, this.a.o(this.e), this.a.o(this.g));
        this.M0();
    }

    private void f0(Transition motionScene$Transition0) {
        if(motionScene$Transition0.I() == motionScene$Transition0.B()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }

    public void f1(int v, ConstraintSet constraintSet0) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            motionScene0.k0(v, constraintSet0);
        }
        this.e1();
        if(this.f == v) {
            constraintSet0.r(this);
        }
    }

    public ConstraintSet g0(int v) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            return null;
        }
        ConstraintSet constraintSet0 = motionScene0.o(v);
        ConstraintSet constraintSet1 = new ConstraintSet();
        constraintSet1.I(constraintSet0);
        return constraintSet1;
    }

    public void g1(int v, ConstraintSet constraintSet0, int v1) {
        if(this.a == null) {
            return;
        }
        if(this.f == v) {
            ConstraintSet constraintSet1 = this.u0(v);
            this.f1(id.view_transition, constraintSet1);
            this.setState(id.view_transition, -1, -1);
            this.f1(v, constraintSet0);
            Transition motionScene$Transition0 = new Transition(-1, this.a, id.view_transition, v);
            motionScene$Transition0.O(v1);
            this.setTransition(motionScene$Transition0);
            this.W0();
        }
    }

    @IdRes
    public int[] getConstraintSetIds() {
        return this.a == null ? null : this.a.r();
    }

    public int getCurrentState() {
        return this.f;
    }

    public ArrayList getDefinedTransitions() {
        return this.a == null ? null : this.a.s();
    }

    public DesignTool getDesignTool() {
        if(this.C == null) {
            this.C = new DesignTool(this);
        }
        return this.C;
    }

    public int getEndState() {
        return this.g;
    }

    protected long getNanoTime() [...] // 潜在的解密器

    public float getProgress() {
        return this.o;
    }

    public MotionScene getScene() {
        return this.a;
    }

    public int getStartState() {
        return this.e;
    }

    public float getTargetPosition() {
        return this.q;
    }

    public Bundle getTransitionState() {
        if(this.d9 == null) {
            this.d9 = new StateCache(this);
        }
        this.d9.c();
        return this.d9.b();
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            this.m = ((float)motionScene0.t()) / 1000.0f;
        }
        return (long)(this.m * 1000.0f);
    }

    public float getVelocity() {
        return this.d;
    }

    private void h0() {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            MotionController motionController0 = (MotionController)this.k.get(view0);
            if(motionController0 != null) {
                motionController0.V(view0);
            }
        }
    }

    public void h1(int v, View[] arr_view) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            motionScene0.u0(v, arr_view);
            return;
        }
        Log.e("MotionLayout", " no motionScene");
    }

    @SuppressLint({"LogConditional"})
    private void i0() {
        for(int v = 0; v < this.getChildCount(); ++v) {
            View view0 = this.getChildAt(v);
            Log.v("MotionLayout", " .(null:-1) " + Debug.k(this) + " " + Debug.i(this.getContext(), this.f) + " " + Debug.k(view0) + view0.getLeft() + " " + view0.getTop());
        }
    }

    private static boolean i1(float f, float f1, float f2) {
        if(f > 0.0f) {
            float f3 = f / f2;
            return f1 + (f * f3 - f2 * f3 * f3 / 2.0f) > 1.0f;
        }
        float f4 = -f / f2;
        return f1 + (f * f4 + f2 * f4 * f4 / 2.0f) < 0.0f;
    }

    void j0(boolean z) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            return;
        }
        motionScene0.k(z);
    }

    public void k0(int v, boolean z) {
        Transition motionScene$Transition0 = this.y0(v);
        if(z) {
            motionScene$Transition0.P(true);
            return;
        }
        MotionScene motionScene0 = this.a;
        if(motionScene$Transition0 == motionScene0.c) {
            for(Object object0: motionScene0.R(this.f)) {
                Transition motionScene$Transition1 = (Transition)object0;
                if(motionScene$Transition1.K()) {
                    this.a.c = motionScene$Transition1;
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        motionScene$Transition0.P(false);
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void l(@NonNull View view0, int v) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            float f = this.M;
            if(f != 0.0f) {
                motionScene0.f0(this.J / f, this.K / f);
            }
        }
    }

    public void l0(int v, boolean z) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            motionScene0.l(v, z);
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int v) {
        if(v == 0) {
            this.a = null;
        }
        else {
            try {
                MotionScene motionScene0 = new MotionScene(this.getContext(), this, v);
                this.a = motionScene0;
                if(this.f == -1) {
                    this.f = motionScene0.O();
                    this.e = this.a.O();
                    this.g = this.a.u();
                }
                if(!this.isAttachedToWindow()) {
                    this.a = null;
                    return;
                }
            }
            catch(Exception exception0) {
                throw new IllegalArgumentException("unable to parse MotionScene file", exception0);
            }
            try {
                Display display0 = this.getDisplay();
                this.m9 = display0 == null ? 0 : display0.getRotation();
                MotionScene motionScene1 = this.a;
                if(motionScene1 != null) {
                    ConstraintSet constraintSet0 = motionScene1.o(this.f);
                    this.a.i0(this);
                    ArrayList arrayList0 = this.Q;
                    if(arrayList0 != null) {
                        Iterator iterator0 = arrayList0.iterator();
                        while(iterator0.hasNext()) {
                            iterator0.next();
                        }
                    }
                    if(constraintSet0 != null) {
                        constraintSet0.r(this);
                    }
                    this.e = this.f;
                }
                this.J0();
                StateCache motionLayout$StateCache0 = this.d9;
                if(motionLayout$StateCache0 != null) {
                    if(this.o9) {
                        this.post(new Runnable() {
                            final MotionLayout a;

                            @Override
                            public void run() {
                                MotionLayout.this.d9.a();
                            }
                        });
                        return;
                    }
                    motionLayout$StateCache0.a();
                    return;
                }
                if(this.a != null && (this.a.c != null && this.a.c.z() == 4)) {
                    this.W0();
                    this.setState(TransitionState.b);
                    this.setState(TransitionState.c);
                    return;
                }
                return;
            }
            catch(Exception exception1) {
            }
            throw new IllegalArgumentException("unable to parse MotionScene file", exception1);
        }
    }

    void m0(boolean z) {
        int v = this.getChildCount();
        for(int v1 = 0; v1 < v; ++v1) {
            View view0 = this.getChildAt(v1);
            MotionController motionController0 = (MotionController)this.k.get(view0);
            if(motionController0 != null) {
                motionController0.i(z);
            }
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void n(@NonNull View view0, int v, int v1, int v2, int v3, int v4) {
    }

    void n0(boolean z) {
        int v1;
        boolean z3;
        if(this.p == -1L) {
            this.p = 3288964354600L;
        }
        float f = this.o;
        if(f > 0.0f && f < 1.0f) {
            this.f = -1;
        }
        boolean z1 = true;
        boolean z2 = false;
        if(this.N || this.s && (z || this.q != f)) {
            float f1 = Math.signum(this.q - f);
            Interpolator interpolator0 = this.b;
            float f2 = interpolator0 instanceof MotionInterpolator ? 0.0f : ((float)(3288964850600L - this.p)) * f1 * 1.000000E-09f / this.m;
            float f3 = this.r ? this.q : this.o + f2;
            int v = Float.compare(f1, 0.0f);
            if((v <= 0 || f3 < this.q) && (f1 > 0.0f || f3 > this.q)) {
                z3 = false;
            }
            else {
                f3 = this.q;
                this.s = false;
                z3 = true;
            }
            this.o = f3;
            this.n = f3;
            this.p = 3288964850600L;
            if(interpolator0 == null || z3) {
                this.d = f2;
                v1 = 0;
            }
            else if(this.z) {
                float f4 = interpolator0.getInterpolation(((float)(3288964850600L - this.l)) * 1.000000E-09f);
                StopLogic stopLogic0 = this.A;
                if(this.b != stopLogic0) {
                    v1 = 0;
                }
                else if(stopLogic0.e()) {
                    v1 = 2;
                }
                else {
                    v1 = 1;
                }
                this.o = f4;
                this.p = 3288964850600L;
                Interpolator interpolator1 = this.b;
                if(interpolator1 instanceof MotionInterpolator) {
                    float f5 = ((MotionInterpolator)interpolator1).a();
                    this.d = f5;
                    if(Math.abs(f5) * this.m <= 0.00001f && v1 == 2) {
                        this.s = false;
                    }
                    if(f5 > 0.0f && f4 >= 1.0f) {
                        this.o = 1.0f;
                        this.s = false;
                        f4 = 1.0f;
                    }
                    if(f5 >= 0.0f || f4 > 0.0f) {
                        f3 = f4;
                    }
                    else {
                        this.o = 0.0f;
                        this.s = false;
                        f3 = 0.0f;
                    }
                }
                else {
                    f3 = f4;
                }
            }
            else {
                float f6 = interpolator0.getInterpolation(f3);
                Interpolator interpolator2 = this.b;
                this.d = interpolator2 instanceof MotionInterpolator ? ((MotionInterpolator)interpolator2).a() : (interpolator2.getInterpolation(f3 + f2) - f6) * f1 / f2;
                f3 = f6;
                v1 = 0;
            }
            if(Math.abs(this.d) > 0.00001f) {
                this.setState(TransitionState.c);
            }
            if(v1 != 1) {
                if(v > 0 && f3 >= this.q || f1 <= 0.0f && f3 <= this.q) {
                    f3 = this.q;
                    this.s = false;
                }
                if(f3 >= 1.0f || f3 <= 0.0f) {
                    this.s = false;
                    this.setState(TransitionState.d);
                }
            }
            int v2 = this.getChildCount();
            this.N = false;
            this.a9 = f3;
            float f7 = this.c == null ? f3 : this.c.getInterpolation(f3);
            Interpolator interpolator3 = this.c;
            if(interpolator3 != null) {
                this.d = interpolator3.getInterpolation(f1 / this.m + f3) - this.c.getInterpolation(f3);
            }
            for(int v3 = 0; v3 < v2; ++v3) {
                View view0 = this.getChildAt(v3);
                MotionController motionController0 = (MotionController)this.k.get(view0);
                if(motionController0 != null) {
                    boolean z4 = this.N;
                    this.N = motionController0.L(view0, f7, 0x2FDC59C406CL, this.b9) | z4;
                }
            }
            int v4 = (v <= 0 || f3 < this.q) && (f1 > 0.0f || f3 > this.q) ? 0 : 1;
            if(!this.N && !this.s && v4 != 0) {
                this.setState(TransitionState.d);
            }
            if(this.T8) {
                this.requestLayout();
            }
            this.N |= v4 ^ 1;
            if(f3 <= 0.0f) {
                int v5 = this.e;
                if(v5 != -1 && this.f != v5) {
                    this.f = v5;
                    this.a.o(v5).p(this);
                    this.setState(TransitionState.d);
                    z2 = true;
                }
            }
            if(((double)f3) >= 1.0) {
                int v6 = this.g;
                if(this.f != v6) {
                    this.f = v6;
                    this.a.o(v6).p(this);
                    this.setState(TransitionState.d);
                    z2 = true;
                }
            }
            if(this.N || this.s) {
                this.invalidate();
            }
            else if(v > 0 && f3 == 1.0f || f1 < 0.0f && f3 == 0.0f) {
                this.setState(TransitionState.d);
            }
            if(!this.N && !this.s && (v > 0 && f3 == 1.0f || f1 < 0.0f && f3 == 0.0f)) {
                this.J0();
            }
        }
        float f8 = this.o;
        if(f8 >= 1.0f) {
            int v7 = this.g;
            if(this.f == v7) {
                z1 = z2;
            }
            this.f = v7;
            z2 = z1;
        }
        else if(f8 <= 0.0f) {
            int v8 = this.e;
            if(this.f == v8) {
                z1 = z2;
            }
            this.f = v8;
            z2 = z1;
        }
        this.r9 |= z2;
        if(z2 && !this.c9) {
            this.requestLayout();
        }
        this.n = this.o;
    }

    private void o0() {
        boolean z;
        float f = Math.signum(this.q - this.o);
        Interpolator interpolator0 = this.b;
        float f1 = this.r ? this.q : this.o + (interpolator0 instanceof StopLogic ? 0.0f : ((float)(0x2FD180602F8L - this.p)) * f * 1.000000E-09f / this.m);
        int v1 = Float.compare(f, 0.0f);
        if((v1 <= 0 || f1 < this.q) && (f > 0.0f || f1 > this.q)) {
            z = false;
        }
        else {
            f1 = this.q;
            z = true;
        }
        if(interpolator0 != null && !z) {
            f1 = this.z ? interpolator0.getInterpolation(((float)(0x2FD180602F8L - this.l)) * 1.000000E-09f) : interpolator0.getInterpolation(f1);
        }
        if(v1 > 0 && f1 >= this.q || f <= 0.0f && f1 <= this.q) {
            f1 = this.q;
        }
        this.a9 = f1;
        int v2 = this.getChildCount();
        Interpolator interpolator1 = this.c;
        if(interpolator1 != null) {
            f1 = interpolator1.getInterpolation(f1);
        }
        for(int v = 0; v < v2; ++v) {
            View view0 = this.getChildAt(v);
            MotionController motionController0 = (MotionController)this.k.get(view0);
            if(motionController0 != null) {
                motionController0.L(view0, f1, 0x2FD180B65E0L, this.b9);
            }
        }
        if(this.T8) {
            this.requestLayout();
        }
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display0 = this.getDisplay();
        if(display0 != null) {
            this.m9 = display0.getRotation();
        }
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            int v = this.f;
            if(v != -1) {
                ConstraintSet constraintSet0 = motionScene0.o(v);
                this.a.i0(this);
                ArrayList arrayList0 = this.Q;
                if(arrayList0 != null) {
                    Iterator iterator0 = arrayList0.iterator();
                    while(iterator0.hasNext()) {
                        iterator0.next();
                    }
                }
                if(constraintSet0 != null) {
                    constraintSet0.r(this);
                }
                this.e = this.f;
            }
        }
        this.J0();
        StateCache motionLayout$StateCache0 = this.d9;
        if(motionLayout$StateCache0 != null) {
            if(this.o9) {
                this.post(new Runnable() {
                    final MotionLayout a;

                    @Override
                    public void run() {
                        MotionLayout.this.d9.a();
                    }
                });
                return;
            }
            motionLayout$StateCache0.a();
            return;
        }
        if(this.a != null && (this.a.c != null && this.a.c.z() == 4)) {
            this.W0();
            this.setState(TransitionState.b);
            this.setState(TransitionState.c);
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null && this.j) {
            ViewTransitionController viewTransitionController0 = motionScene0.r;
            if(viewTransitionController0 != null) {
                viewTransitionController0.l(motionEvent0);
            }
            Transition motionScene$Transition0 = this.a.c;
            if(motionScene$Transition0 != null && motionScene$Transition0.K()) {
                TouchResponse touchResponse0 = motionScene$Transition0.J();
                if(touchResponse0 != null) {
                    if(motionEvent0.getAction() == 0) {
                        RectF rectF0 = touchResponse0.r(this, new RectF());
                        if(rectF0 != null && !rectF0.contains(motionEvent0.getX(), motionEvent0.getY())) {
                            return false;
                        }
                    }
                    int v = touchResponse0.s();
                    if(v != -1) {
                        if(this.t9 == null || this.t9.getId() != v) {
                            this.t9 = this.findViewById(v);
                        }
                        View view0 = this.t9;
                        if(view0 != null) {
                            this.s9.set(((float)view0.getLeft()), ((float)this.t9.getTop()), ((float)this.t9.getRight()), ((float)this.t9.getBottom()));
                            return !this.s9.contains(motionEvent0.getX(), motionEvent0.getY()) || this.A0(((float)this.t9.getLeft()), ((float)this.t9.getTop()), this.t9, motionEvent0) ? false : this.onTouchEvent(motionEvent0);
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        try {
            this.c9 = true;
            if(this.a == null) {
                super.onLayout(z, v, v1, v2, v3);
                this.c9 = false;
                return;
            }
            int v4 = v2 - v;
            int v5 = v3 - v1;
            if(this.G != v4 || this.H != v5) {
                this.M0();
                this.n0(true);
            }
            this.G = v4;
            this.H = v5;
            this.E = v4;
            this.F = v5;
            this.c9 = false;
        }
        catch(Throwable throwable0) {
            this.c9 = false;
            throw throwable0;
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected void onMeasure(int v, int v1) {
        boolean z = false;
        if(this.a == null) {
            super.onMeasure(v, v1);
            return;
        }
        boolean z1 = this.h != v || this.i != v1;
        if(this.r9) {
            this.r9 = false;
            this.J0();
            this.K0();
            z1 = true;
        }
        if(this.mDirtyHierarchy) {
            z1 = true;
        }
        this.h = v;
        this.i = v1;
        int v2 = this.a.O();
        int v3 = this.a.u();
        if(!z1 && !this.q9.i(v2, v3) || this.e == -1) {
            if(z1) {
                super.onMeasure(v, v1);
            }
            z = true;
        }
        else {
            super.onMeasure(v, v1);
            this.q9.h(this.mLayoutWidget, this.a.o(v2), this.a.o(v3));
            this.q9.k();
            this.q9.l(v2, v3);
        }
        if(this.T8 || z) {
            int v4 = this.getPaddingTop();
            int v5 = this.getPaddingBottom();
            int v6 = this.getPaddingLeft();
            int v7 = this.getPaddingRight();
            int v8 = this.mLayoutWidget.m0() + (v6 + v7);
            int v9 = this.mLayoutWidget.D() + (v4 + v5);
            if(this.Y8 == 0x80000000 || this.Y8 == 0) {
                v8 = (int)(((float)this.U8) + this.a9 * ((float)(this.W8 - this.U8)));
                this.requestLayout();
            }
            if(this.Z8 == 0x80000000 || this.Z8 == 0) {
                v9 = (int)(((float)this.V8) + this.a9 * ((float)(this.X8 - this.V8)));
                this.requestLayout();
            }
            this.setMeasuredDimension(v8, v9);
        }
        this.o0();
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view0, float f, float f1, boolean z) {
        return false;
    }

    @Override  // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view0, float f, float f1) {
        return false;
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            motionScene0.n0(this.isRtl());
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        if(this.a != null && this.j && this.a.s0()) {
            Transition motionScene$Transition0 = this.a.c;
            if(motionScene$Transition0 != null && !motionScene$Transition0.K()) {
                return super.onTouchEvent(motionEvent0);
            }
            this.a.g0(motionEvent0, this.getCurrentState(), this);
            return this.a.c.L(4) ? this.a.c.J().t() : true;
        }
        return super.onTouchEvent(motionEvent0);
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewAdded(View view0) {
        super.onViewAdded(view0);
        if(view0 instanceof MotionHelper) {
            if(this.M8 == null) {
                this.M8 = new CopyOnWriteArrayList();
            }
            this.M8.add(((MotionHelper)view0));
            if(((MotionHelper)view0).d()) {
                if(this.O == null) {
                    this.O = new ArrayList();
                }
                this.O.add(((MotionHelper)view0));
            }
            if(((MotionHelper)view0).e()) {
                if(this.P == null) {
                    this.P = new ArrayList();
                }
                this.P.add(((MotionHelper)view0));
            }
            if(((MotionHelper)view0).f()) {
                if(this.Q == null) {
                    this.Q = new ArrayList();
                }
                this.Q.add(((MotionHelper)view0));
            }
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void onViewRemoved(View view0) {
        super.onViewRemoved(view0);
        ArrayList arrayList0 = this.O;
        if(arrayList0 != null) {
            arrayList0.remove(view0);
        }
        ArrayList arrayList1 = this.P;
        if(arrayList1 != null) {
            arrayList1.remove(view0);
        }
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public void p(@NonNull View view0, int v, int v1, @NonNull int[] arr_v, int v2) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            return;
        }
        int v3 = -1;
        Transition motionScene$Transition0 = motionScene0.c;
        if(motionScene$Transition0 != null && motionScene$Transition0.K()) {
            TouchResponse touchResponse0 = motionScene$Transition0.J();
            if(touchResponse0 != null) {
                int v4 = touchResponse0.s();
                if(v4 != -1 && view0.getId() != v4) {
                    return;
                }
            }
            if(motionScene0.E()) {
                TouchResponse touchResponse1 = motionScene$Transition0.J();
                if(touchResponse1 != null && (touchResponse1.f() & 4) != 0) {
                    v3 = v1;
                }
                if((this.n == 0 || this.n == 0x3F800000) && view0.canScrollVertically(v3)) {
                    return;
                }
            }
            if(motionScene$Transition0.J() != null && (motionScene$Transition0.J().f() & 1) != 0) {
                float f = motionScene0.G(((float)v), ((float)v1));
                if(this.o <= 0.0f && f < 0.0f || this.o >= 1.0f && f > 0.0f) {
                    view0.setNestedScrollingEnabled(false);
                    view0.post(new Runnable() {
                        final MotionLayout b;

                        @Override
                        public void run() {
                            view0.setNestedScrollingEnabled(true);
                        }
                    });
                    return;
                }
            }
            float f1 = this.n;
            this.J = (float)v;
            this.K = (float)v1;
            this.M = (float)(((double)(0x2FDBF8B1450L - this.L)) * 1.000000E-09);
            this.L = 0x2FDBF8B1450L;
            motionScene0.e0(((float)v), ((float)v1));
            if(f1 != this.n) {
                arr_v[0] = v;
                arr_v[1] = v1;
            }
            this.n0(false);
            if(arr_v[0] != 0 || arr_v[1] != 0) {
                this.I = true;
            }
        }
    }

    private void p0() {
        if((this.u != null || this.M8 != null && !this.M8.isEmpty()) && this.R8 != this.n) {
            if(this.Q8 != -1) {
                this.r0();
                this.S8 = true;
            }
            this.Q8 = -1;
            float f = this.n;
            this.R8 = f;
            TransitionListener motionLayout$TransitionListener0 = this.u;
            if(motionLayout$TransitionListener0 != null) {
                motionLayout$TransitionListener0.g(this, this.e, this.g, f);
            }
            CopyOnWriteArrayList copyOnWriteArrayList0 = this.M8;
            if(copyOnWriteArrayList0 != null) {
                for(Object object0: copyOnWriteArrayList0) {
                    ((TransitionListener)object0).g(this, this.e, this.g, this.n);
                }
            }
            this.S8 = true;
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    protected void parseLayoutDescription(int v) {
        this.mConstraintLayoutSpec = null;
    }

    protected void q0() {
        if((this.u != null || this.M8 != null && !this.M8.isEmpty()) && this.Q8 == -1) {
            this.Q8 = this.f;
            int v = this.v9.isEmpty() ? -1 : ((int)(((Integer)this.v9.get(this.v9.size() - 1))));
            int v1 = this.f;
            if(v != v1 && v1 != -1) {
                this.v9.add(v1);
            }
        }
        this.K0();
        Runnable runnable0 = this.e9;
        if(runnable0 != null) {
            runnable0.run();
            this.e9 = null;
        }
        int[] arr_v = this.f9;
        if(arr_v != null && this.g9 > 0) {
            this.a1(arr_v[0]);
            System.arraycopy(this.f9, 1, this.f9, 0, this.f9.length - 1);
            --this.g9;
        }
    }

    private void r0() {
        TransitionListener motionLayout$TransitionListener0 = this.u;
        if(motionLayout$TransitionListener0 != null) {
            motionLayout$TransitionListener0.j(this, this.e, this.g);
        }
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.M8;
        if(copyOnWriteArrayList0 != null) {
            for(Object object0: copyOnWriteArrayList0) {
                ((TransitionListener)object0).j(this, this.e, this.g);
            }
        }
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void requestLayout() {
        if(!this.T8 && this.f == -1) {
            MotionScene motionScene0 = this.a;
            if(motionScene0 != null) {
                Transition motionScene$Transition0 = motionScene0.c;
                if(motionScene$Transition0 != null) {
                    int v = motionScene$Transition0.E();
                    if(v == 0) {
                        return;
                    }
                    if(v == 2) {
                        int v1 = this.getChildCount();
                        for(int v2 = 0; v2 < v1; ++v2) {
                            View view0 = this.getChildAt(v2);
                            ((MotionController)this.k.get(view0)).P();
                        }
                        return;
                    }
                }
            }
        }
        super.requestLayout();
    }

    @Override  // androidx.core.view.NestedScrollingParent3
    public void s(@NonNull View view0, int v, int v1, int v2, int v3, int v4, int[] arr_v) {
        if(this.I || v != 0 || v1 != 0) {
            arr_v[0] += v2;
            arr_v[1] += v3;
        }
        this.I = false;
    }

    public void s0(int v, boolean z, float f) {
        TransitionListener motionLayout$TransitionListener0 = this.u;
        if(motionLayout$TransitionListener0 != null) {
            motionLayout$TransitionListener0.k(this, v, z, f);
        }
        CopyOnWriteArrayList copyOnWriteArrayList0 = this.M8;
        if(copyOnWriteArrayList0 != null) {
            for(Object object0: copyOnWriteArrayList0) {
                ((TransitionListener)object0).k(this, v, z, f);
            }
        }
    }

    public void setDebugMode(int v) {
        this.x = v;
        this.invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.o9 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.j = z;
    }

    public void setInterpolatedProgress(float f) {
        if(this.a != null) {
            this.setState(TransitionState.c);
            Interpolator interpolator0 = this.a.x();
            if(interpolator0 != null) {
                this.setProgress(interpolator0.getInterpolation(f));
                return;
            }
        }
        this.setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList arrayList0 = this.P;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((MotionHelper)this.P.get(v1)).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList arrayList0 = this.O;
        if(arrayList0 != null) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((MotionHelper)this.O.get(v1)).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        int v = Float.compare(f, 0.0f);
        if(v < 0 || f > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if(!this.isAttachedToWindow()) {
            if(this.d9 == null) {
                this.d9 = new StateCache(this);
            }
            this.d9.e(f);
            return;
        }
        if(v <= 0) {
            if(this.o == 1.0f && this.f == this.g) {
                this.setState(TransitionState.c);
            }
            this.f = this.e;
            if(this.o == 0.0f) {
                this.setState(TransitionState.d);
            }
        }
        else if(f >= 1.0f) {
            if(this.o == 0.0f && this.f == this.e) {
                this.setState(TransitionState.c);
            }
            this.f = this.g;
            if(this.o == 1.0f) {
                this.setState(TransitionState.d);
            }
        }
        else {
            this.f = -1;
            this.setState(TransitionState.c);
        }
        if(this.a == null) {
            return;
        }
        this.r = true;
        this.q = f;
        this.n = f;
        this.p = -1L;
        this.l = -1L;
        this.b = null;
        this.s = true;
        this.invalidate();
    }

    public void setScene(MotionScene motionScene0) {
        this.a = motionScene0;
        motionScene0.n0(this.isRtl());
        this.M0();
    }

    void setStartState(int v) {
        if(!this.isAttachedToWindow()) {
            if(this.d9 == null) {
                this.d9 = new StateCache(this);
            }
            this.d9.f(v);
            this.d9.d(v);
            return;
        }
        this.f = v;
    }

    @Override  // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int v, int v1, int v2) {
        this.setState(TransitionState.b);
        this.f = v;
        this.e = -1;
        this.g = -1;
        ConstraintLayoutStates constraintLayoutStates0 = this.mConstraintLayoutSpec;
        if(constraintLayoutStates0 != null) {
            constraintLayoutStates0.e(v, ((float)v1), ((float)v2));
            return;
        }
        MotionScene motionScene0 = this.a;
        if(motionScene0 != null) {
            motionScene0.o(v).r(this);
        }
    }

    void setState(TransitionState motionLayout$TransitionState0) {
        TransitionState motionLayout$TransitionState1 = TransitionState.d;
        if(motionLayout$TransitionState0 == motionLayout$TransitionState1 && this.f == -1) {
            return;
        }
        TransitionState motionLayout$TransitionState2 = this.p9;
        this.p9 = motionLayout$TransitionState0;
        TransitionState motionLayout$TransitionState3 = TransitionState.c;
        if(motionLayout$TransitionState2 == motionLayout$TransitionState3 && motionLayout$TransitionState0 == motionLayout$TransitionState3) {
            this.p0();
        }
        switch(motionLayout$TransitionState2.ordinal()) {
            case 0: 
            case 1: {
                if(motionLayout$TransitionState0 == motionLayout$TransitionState3) {
                    this.p0();
                }
                if(motionLayout$TransitionState0 == motionLayout$TransitionState1) {
                    this.q0();
                    return;
                }
                break;
            }
            case 2: {
                if(motionLayout$TransitionState0 == motionLayout$TransitionState1) {
                    this.q0();
                    return;
                }
                break;
            }
        }
    }

    public void setTransition(int v) {
        float f1;
        if(this.a != null) {
            Transition motionScene$Transition0 = this.y0(v);
            this.e = motionScene$Transition0.I();
            this.g = motionScene$Transition0.B();
            if(!this.isAttachedToWindow()) {
                if(this.d9 == null) {
                    this.d9 = new StateCache(this);
                }
                this.d9.f(this.e);
                this.d9.d(this.g);
                return;
            }
            int v1 = this.f;
            float f = 0.0f;
            if(v1 == this.e) {
                f1 = 0.0f;
            }
            else {
                f1 = v1 == this.g ? 1.0f : NaNf;
            }
            this.a.p0(motionScene$Transition0);
            this.q9.h(this.mLayoutWidget, this.a.o(this.e), this.a.o(this.g));
            this.M0();
            if(this.o != f1) {
                switch(f1) {
                    case 0: {
                        this.m0(true);
                        this.a.o(this.e).r(this);
                        break;
                    }
                    case 0x3F800000: {
                        this.m0(false);
                        this.a.o(this.g).r(this);
                    }
                }
            }
            if(!Float.isNaN(f1)) {
                f = f1;
            }
            this.o = f;
            if(Float.isNaN(f1)) {
                Log.v("MotionLayout", ".(null:-1) transitionToStart ");
                this.Y0();
                return;
            }
            this.setProgress(f1);
        }
    }

    protected void setTransition(Transition motionScene$Transition0) {
        this.a.p0(motionScene$Transition0);
        this.setState(TransitionState.b);
        if(this.f == this.a.u()) {
            this.o = 1.0f;
            this.n = 1.0f;
            this.q = 1.0f;
        }
        else {
            this.o = 0.0f;
            this.n = 0.0f;
            this.q = 0.0f;
        }
        this.p = motionScene$Transition0.L(1) ? -1L : 0x2FDDDB96DA0L;
        int v = this.a.O();
        int v1 = this.a.u();
        if(v == this.e && v1 == this.g) {
            return;
        }
        this.e = v;
        this.g = v1;
        this.a.o0(v, v1);
        this.q9.h(this.mLayoutWidget, this.a.o(this.e), this.a.o(this.g));
        this.q9.l(this.e, this.g);
        this.q9.k();
        this.M0();
    }

    public void setTransitionDuration(int v) {
        MotionScene motionScene0 = this.a;
        if(motionScene0 == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        motionScene0.l0(v);
    }

    public void setTransitionListener(TransitionListener motionLayout$TransitionListener0) {
        this.u = motionLayout$TransitionListener0;
    }

    public void setTransitionState(Bundle bundle0) {
        if(this.d9 == null) {
            this.d9 = new StateCache(this);
        }
        this.d9.g(bundle0);
        if(this.isAttachedToWindow()) {
            this.d9.a();
        }
    }

    void t0(int v, float f, float f1, float f2, float[] arr_f) {
        HashMap hashMap0 = this.k;
        View view0 = this.getViewById(v);
        MotionController motionController0 = (MotionController)hashMap0.get(view0);
        if(motionController0 != null) {
            motionController0.p(f, f1, f2, arr_f);
            float f3 = view0.getY();
            this.v = f;
            this.w = f3;
            return;
        }
        Log.w("MotionLayout", "WARNING could not find view id " + (view0 == null ? "" + v : view0.getContext().getResources().getResourceName(v)));
    }

    @Override  // android.view.View
    public String toString() {
        Context context0 = this.getContext();
        return Debug.i(context0, this.e) + "->" + Debug.i(context0, this.g) + " (pos:" + this.o + " Dpos/Dt:" + this.d;
    }

    @Override  // androidx.core.view.NestedScrollingParent2
    public boolean u(@NonNull View view0, @NonNull View view1, int v, int v1) {
        return this.a != null && (this.a.c != null && this.a.c.J() != null && (this.a.c.J().f() & 2) == 0);
    }

    public ConstraintSet u0(int v) {
        return this.a == null ? null : this.a.o(v);
    }

    String v0(int v) {
        return this.a == null ? null : this.a.Y(v);
    }

    public int[] w0(String[] arr_s) {
        return this.a == null ? null : this.a.B(arr_s);
    }

    MotionController x0(int v) {
        return (MotionController)this.k.get(this.findViewById(v));
    }

    public Transition y0(int v) {
        return this.a.P(v);
    }

    public void z0(View view0, float f, float f1, float[] arr_f, int v) {
        float f6;
        float f2 = this.d;
        float f3 = this.o;
        if(this.b == null) {
            f6 = f3;
        }
        else {
            float f4 = Math.signum(this.q - f3);
            float f5 = this.b.getInterpolation(this.o + 0.00001f);
            f6 = this.b.getInterpolation(this.o);
            f2 = f4 * ((f5 - f6) / 0.00001f) / this.m;
        }
        Interpolator interpolator0 = this.b;
        if(interpolator0 instanceof MotionInterpolator) {
            f2 = ((MotionInterpolator)interpolator0).a();
        }
        MotionController motionController0 = (MotionController)this.k.get(view0);
        if((v & 1) == 0) {
            motionController0.C(f6, view0.getWidth(), view0.getHeight(), f, f1, arr_f);
        }
        else {
            motionController0.p(f6, f, f1, arr_f);
        }
        if(v < 2) {
            arr_f[0] *= f2;
            arr_f[1] *= f2;
        }
    }
}

