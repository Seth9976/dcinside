package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ViewTimeCycle extends TimeCycleSplineSet {
    static class AlphaSet extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            view0.setAlpha(this.g(f, v, view0, keyCache0));
            return this.h;
        }
    }

    public static class CustomSet extends ViewTimeCycle {
        String q;
        SparseArray r;
        SparseArray s;
        float[] t;

        public CustomSet(String s, SparseArray sparseArray0) {
            this.s = new SparseArray();
            this.q = s.split(",")[1];
            this.r = sparseArray0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void c(int v, float f, float f1, int v1, float f2) {
            throw new RuntimeException("Wrong call for custom attribute");
        }

        @Override  // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void f(int v) {
            int v1 = this.r.size();
            int v2 = ((ConstraintAttribute)this.r.valueAt(0)).p();
            double[] arr_f = new double[v1];
            this.t = new float[v2 + 2];
            this.g = new float[v2];
            double[][] arr2_f = new double[v1][v2 + 2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = this.r.keyAt(v3);
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.r.valueAt(v3);
                float[] arr_f1 = (float[])this.s.valueAt(v3);
                arr_f[v3] = ((double)v4) * 0.01;
                constraintAttribute0.l(this.t);
                for(int v5 = 0; true; ++v5) {
                    float[] arr_f2 = this.t;
                    if(v5 >= arr_f2.length) {
                        break;
                    }
                    arr2_f[v3][v5] = (double)arr_f2[v5];
                }
                double[] arr_f3 = arr2_f[v3];
                arr_f3[v2] = (double)arr_f1[0];
                arr_f3[v2 + 1] = (double)arr_f1[1];
            }
            this.a = CurveFit.a(v, arr_f, arr2_f);
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            this.a.e(((double)f), this.t);
            float[] arr_f = this.t;
            float f1 = arr_f[arr_f.length - 2];
            float f2 = arr_f[arr_f.length - 1];
            long v1 = v - this.i;
            if(Float.isNaN(this.j)) {
                float f3 = keyCache0.a(view0, this.q, 0);
                this.j = f3;
                if(Float.isNaN(f3)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float)((((double)this.j) + ((double)v1) * 1.000000E-09 * ((double)f1)) % 1.0);
            this.j = f4;
            this.i = v;
            float f5 = this.a(f4);
            this.h = false;
            for(int v2 = 0; true; ++v2) {
                float[] arr_f1 = this.g;
                if(v2 >= arr_f1.length) {
                    break;
                }
                boolean z = this.h;
                float f6 = this.t[v2];
                this.h = z | ((double)f6) != 0.0;
                arr_f1[v2] = f6 * f5 + f2;
            }
            CustomSupport.b(((ConstraintAttribute)this.r.valueAt(0)), view0, this.g);
            if(f1 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }

        public void k(int v, ConstraintAttribute constraintAttribute0, float f, int v1, float f1) {
            this.r.append(v, constraintAttribute0);
            this.s.append(v, new float[]{f, f1});
            this.b = Math.max(this.b, v1);
        }
    }

    static class ElevationSet extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            view0.setElevation(this.g(f, v, view0, keyCache0));
            return this.h;
        }
    }

    public static class PathRotate extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            return this.h;
        }

        public boolean k(View view0, KeyCache keyCache0, float f, long v, double f1, double f2) {
            view0.setRotation(this.g(f, v, view0, keyCache0) + ((float)Math.toDegrees(Math.atan2(f2, f1))));
            return this.h;
        }
    }

    static class ProgressSet extends ViewTimeCycle {
        boolean q;

        ProgressSet() {
            this.q = false;
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            Method method0;
            if(view0 instanceof MotionLayout) {
                ((MotionLayout)view0).setProgress(this.g(f, v, view0, keyCache0));
                return this.h;
            }
            if(this.q) {
                return false;
            }
            try {
                method0 = view0.getClass().getMethod("setProgress", Float.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                this.q = true;
                method0 = null;
            }
            if(method0 != null) {
                try {
                    method0.invoke(view0, this.g(f, v, view0, keyCache0));
                }
                catch(IllegalAccessException illegalAccessException0) {
                    Log.e("ViewTimeCycle", "unable to setProgress", illegalAccessException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    Log.e("ViewTimeCycle", "unable to setProgress", invocationTargetException0);
                }
                return this.h;
            }
            return this.h;
        }
    }

    static class RotationSet extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            view0.setRotation(this.g(f, v, view0, keyCache0));
            return this.h;
        }
    }

    static class RotationXset extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            view0.setRotationX(this.g(f, v, view0, keyCache0));
            return this.h;
        }
    }

    static class RotationYset extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            view0.setRotationY(this.g(f, v, view0, keyCache0));
            return this.h;
        }
    }

    static class ScaleXset extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            view0.setScaleX(this.g(f, v, view0, keyCache0));
            return this.h;
        }
    }

    static class ScaleYset extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            view0.setScaleY(this.g(f, v, view0, keyCache0));
            return this.h;
        }
    }

    static class TranslationXset extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            view0.setTranslationX(this.g(f, v, view0, keyCache0));
            return this.h;
        }
    }

    static class TranslationYset extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            view0.setTranslationY(this.g(f, v, view0, keyCache0));
            return this.h;
        }
    }

    static class TranslationZset extends ViewTimeCycle {
        @Override  // androidx.constraintlayout.motion.utils.ViewTimeCycle
        public boolean j(View view0, float f, long v, KeyCache keyCache0) {
            view0.setTranslationZ(this.g(f, v, view0, keyCache0));
            return this.h;
        }
    }

    private static final String p = "ViewTimeCycle";

    public float g(float f, long v, View view0, KeyCache keyCache0) {
        this.a.e(((double)f), this.g);
        float[] arr_f = this.g;
        float f1 = arr_f[1];
        int v1 = Float.compare(f1, 0.0f);
        if(v1 == 0) {
            this.h = false;
            return arr_f[2];
        }
        if(Float.isNaN(this.j)) {
            float f2 = keyCache0.a(view0, this.f, 0);
            this.j = f2;
            if(Float.isNaN(f2)) {
                this.j = 0.0f;
            }
        }
        float f3 = (float)((((double)this.j) + ((double)(v - this.i)) * 1.000000E-09 * ((double)f1)) % 1.0);
        this.j = f3;
        keyCache0.b(view0, this.f, 0, f3);
        this.i = v;
        float f4 = this.g[0];
        float f5 = this.a(this.j) * f4 + this.g[2];
        this.h = f4 != 0.0f || v1 != 0;
        return f5;
    }

    public static ViewTimeCycle h(String s, SparseArray sparseArray0) {
        return new CustomSet(s, sparseArray0);
    }

    public static ViewTimeCycle i(String s, long v) {
        ViewTimeCycle viewTimeCycle0;
        s.hashCode();
        switch(s) {
            case "alpha": {
                viewTimeCycle0 = new AlphaSet();
                break;
            }
            case "elevation": {
                viewTimeCycle0 = new ElevationSet();
                break;
            }
            case "progress": {
                viewTimeCycle0 = new ProgressSet();
                break;
            }
            case "rotation": {
                viewTimeCycle0 = new RotationSet();
                break;
            }
            case "rotationX": {
                viewTimeCycle0 = new RotationXset();
                break;
            }
            case "rotationY": {
                viewTimeCycle0 = new RotationYset();
                break;
            }
            case "scaleX": {
                viewTimeCycle0 = new ScaleXset();
                break;
            }
            case "scaleY": {
                viewTimeCycle0 = new ScaleYset();
                break;
            }
            case "transitionPathRotate": {
                viewTimeCycle0 = new PathRotate();
                break;
            }
            case "translationX": {
                viewTimeCycle0 = new TranslationXset();
                break;
            }
            case "translationY": {
                viewTimeCycle0 = new TranslationYset();
                break;
            }
            case "translationZ": {
                viewTimeCycle0 = new TranslationZset();
                break;
            }
            default: {
                return null;
            }
        }
        viewTimeCycle0.d(v);
        return viewTimeCycle0;
    }

    public abstract boolean j(View arg1, float arg2, long arg3, KeyCache arg4);
}

