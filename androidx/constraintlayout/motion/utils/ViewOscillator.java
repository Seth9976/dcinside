package androidx.constraintlayout.motion.utils;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class ViewOscillator extends KeyCycleOscillator {
    static class AlphaSet extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            view0.setAlpha(this.a(f));
        }
    }

    static class CustomSet extends ViewOscillator {
        float[] j;
        protected ConstraintAttribute k;

        CustomSet() {
            this.j = new float[1];
        }

        @Override  // androidx.constraintlayout.core.motion.utils.KeyCycleOscillator
        protected void e(Object object0) {
            this.k = (ConstraintAttribute)object0;
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            float[] arr_f = this.j;
            arr_f[0] = this.a(f);
            CustomSupport.b(this.k, view0, this.j);
        }
    }

    static class ElevationSet extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            view0.setElevation(this.a(f));
        }
    }

    public static class PathRotateSet extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
        }

        public void n(View view0, float f, double f1, double f2) {
            view0.setRotation(this.a(f) + ((float)Math.toDegrees(Math.atan2(f2, f1))));
        }
    }

    static class ProgressSet extends ViewOscillator {
        boolean j;

        ProgressSet() {
            this.j = false;
        }

        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            Method method0;
            if(view0 instanceof MotionLayout) {
                ((MotionLayout)view0).setProgress(this.a(f));
                return;
            }
            if(this.j) {
                return;
            }
            try {
                method0 = view0.getClass().getMethod("setProgress", Float.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                this.j = true;
                method0 = null;
            }
            if(method0 != null) {
                try {
                    method0.invoke(view0, this.a(f));
                }
                catch(IllegalAccessException illegalAccessException0) {
                    Log.e("ViewOscillator", "unable to setProgress", illegalAccessException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    Log.e("ViewOscillator", "unable to setProgress", invocationTargetException0);
                }
            }
        }
    }

    static class RotationSet extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            view0.setRotation(this.a(f));
        }
    }

    static class RotationXset extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            view0.setRotationX(this.a(f));
        }
    }

    static class RotationYset extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            view0.setRotationY(this.a(f));
        }
    }

    static class ScaleXset extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            view0.setScaleX(this.a(f));
        }
    }

    static class ScaleYset extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            view0.setScaleY(this.a(f));
        }
    }

    static class TranslationXset extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            view0.setTranslationX(this.a(f));
        }
    }

    static class TranslationYset extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            view0.setTranslationY(this.a(f));
        }
    }

    static class TranslationZset extends ViewOscillator {
        @Override  // androidx.constraintlayout.motion.utils.ViewOscillator
        public void m(View view0, float f) {
            view0.setTranslationZ(this.a(f));
        }
    }

    private static final String i = "ViewOscillator";

    public static ViewOscillator l(String s) {
        if(s.startsWith("CUSTOM")) {
            return new CustomSet();
        }
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
            case "transitionPathRotate": {
                return new PathRotateSet();
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

