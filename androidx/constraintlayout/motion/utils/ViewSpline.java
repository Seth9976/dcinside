package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ViewSpline extends SplineSet {
    static class AlphaSet extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setAlpha(this.a(f));
        }
    }

    public static class CustomSet extends ViewSpline {
        String h;
        SparseArray i;
        float[] j;

        public CustomSet(String s, SparseArray sparseArray0) {
            this.h = s.split(",")[1];
            this.i = sparseArray0;
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void g(int v, float f) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override  // androidx.constraintlayout.core.motion.utils.SplineSet
        public void j(int v) {
            int v1 = this.i.size();
            int v2 = ((ConstraintAttribute)this.i.valueAt(0)).p();
            double[] arr_f = new double[v1];
            this.j = new float[v2];
            double[][] arr2_f = new double[v1][v2];
            for(int v3 = 0; v3 < v1; ++v3) {
                int v4 = this.i.keyAt(v3);
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.i.valueAt(v3);
                arr_f[v3] = ((double)v4) * 0.01;
                constraintAttribute0.l(this.j);
                for(int v5 = 0; true; ++v5) {
                    float[] arr_f1 = this.j;
                    if(v5 >= arr_f1.length) {
                        break;
                    }
                    arr2_f[v3][v5] = (double)arr_f1[v5];
                }
            }
            this.a = CurveFit.a(v, arr_f, arr2_f);
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            this.a.e(((double)f), this.j);
            CustomSupport.b(((ConstraintAttribute)this.i.valueAt(0)), view0, this.j);
        }

        public void n(int v, ConstraintAttribute constraintAttribute0) {
            this.i.append(v, constraintAttribute0);
        }
    }

    static class ElevationSet extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setElevation(this.a(f));
        }
    }

    public static class PathRotate extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
        }

        public void n(View view0, float f, double f1, double f2) {
            view0.setRotation(this.a(f) + ((float)Math.toDegrees(Math.atan2(f2, f1))));
        }
    }

    static class PivotXset extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setPivotX(this.a(f));
        }
    }

    static class PivotYset extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setPivotY(this.a(f));
        }
    }

    static class ProgressSet extends ViewSpline {
        boolean h;

        ProgressSet() {
            this.h = false;
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            Method method0;
            if(view0 instanceof MotionLayout) {
                ((MotionLayout)view0).setProgress(this.a(f));
                return;
            }
            if(this.h) {
                return;
            }
            try {
                method0 = view0.getClass().getMethod("setProgress", Float.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                this.h = true;
                method0 = null;
            }
            if(method0 != null) {
                try {
                    method0.invoke(view0, this.a(f));
                }
                catch(IllegalAccessException illegalAccessException0) {
                    Log.e("ViewSpline", "unable to setProgress", illegalAccessException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    Log.e("ViewSpline", "unable to setProgress", invocationTargetException0);
                }
            }
        }
    }

    static class RotationSet extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setRotation(this.a(f));
        }
    }

    static class RotationXset extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setRotationX(this.a(f));
        }
    }

    static class RotationYset extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setRotationY(this.a(f));
        }
    }

    static class ScaleXset extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setScaleX(this.a(f));
        }
    }

    static class ScaleYset extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setScaleY(this.a(f));
        }
    }

    static class TranslationXset extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setTranslationX(this.a(f));
        }
    }

    static class TranslationYset extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setTranslationY(this.a(f));
        }
    }

    static class TranslationZset extends ViewSpline {
        @Override  // androidx.constraintlayout.motion.utils.ViewSpline
        public void m(View view0, float f) {
            view0.setTranslationZ(this.a(f));
        }
    }

    private static final String g = "ViewSpline";

    public static ViewSpline k(String s, SparseArray sparseArray0) {
        return new CustomSet(s, sparseArray0);
    }

    public static ViewSpline l(String s) {
        s.hashCode();
        switch(s) {
            case "alpha": {
                return new AlphaSet();
            }
            case "elevation": {
                return new ElevationSet();
            }
            case "progress": {
                return new ProgressSet();
            }
            case "rotation": {
                return new RotationSet();
            }
            case "rotationX": {
                return new RotationXset();
            }
            case "rotationY": {
                return new RotationYset();
            }
            case "scaleX": {
                return new ScaleXset();
            }
            case "scaleY": {
                return new ScaleYset();
            }
            case "transformPivotX": {
                return new PivotXset();
            }
            case "transformPivotY": {
                return new PivotYset();
            }
            case "transitionPathRotate": {
                return new PathRotate();
            }
            case "translationX": {
                return new TranslationXset();
            }
            case "translationY": {
                return new TranslationYset();
            }
            case "translationZ": {
                return new TranslationZset();
            }
            case "waveOffset": {
                return new AlphaSet();
            }
            case "waveVariesBy": {
                return new AlphaSet();
            }
            default: {
                return null;
            }
        }
    }

    public abstract void m(View arg1, float arg2);
}

