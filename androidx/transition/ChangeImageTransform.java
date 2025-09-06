package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

public class ChangeImageTransform extends Transition {
    static class Listener extends AnimatorListenerAdapter implements TransitionListener {
        private final ImageView a;
        private final Matrix b;
        private final Matrix c;
        private boolean d;

        Listener(ImageView imageView0, Matrix matrix0, Matrix matrix1) {
            this.d = true;
            this.a = imageView0;
            this.b = matrix0;
            this.c = matrix1;
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void a(@NonNull Transition transition0) {
            this.b();
        }

        private void b() {
            Matrix matrix0 = (Matrix)this.a.getTag(id.transition_image_transform);
            if(matrix0 != null) {
                ImageViewUtils.a(this.a, matrix0);
                this.a.setTag(0x7F0B0FE4, null);  // id:transition_image_transform
            }
        }

        private void c(Matrix matrix0) {
            this.a.setTag(id.transition_image_transform, matrix0);
            ImageViewUtils.a(this.a, this.c);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void k(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void l(@NonNull Transition transition0) {
            if(this.d) {
                this.c(this.b);
            }
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void n(Transition transition0, boolean z) {
            e.a(this, transition0, z);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            this.d = false;
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationEnd(@NonNull Animator animator0, boolean z) {
            this.d = z;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationPause(Animator animator0) {
            this.c(((Matrix)((ObjectAnimator)animator0).getAnimatedValue()));
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationResume(Animator animator0) {
            this.b();
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationStart(Animator animator0) {
            this.d = false;
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationStart(@NonNull Animator animator0, boolean z) {
            this.d = false;
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void p(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void r(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void s(Transition transition0, boolean z) {
            e.b(this, transition0, z);
        }
    }

    private static final String U8 = "android:changeImageTransform:matrix";
    private static final String V8 = "android:changeImageTransform:bounds";
    private static final String[] W8;
    private static final TypeEvaluator X8;
    private static final Property Y8;

    static {
        ChangeImageTransform.W8 = new String[]{"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
        ChangeImageTransform.X8 = new TypeEvaluator() {
            public Matrix a(float f, Matrix matrix0, Matrix matrix1) {
                return null;
            }

            @Override  // android.animation.TypeEvaluator
            public Object evaluate(float f, Object object0, Object object1) {
                return this.a(f, ((Matrix)object0), ((Matrix)object1));
            }
        };
        ChangeImageTransform.Y8 = new Property(Matrix.class, "animatedTransform") {
            public Matrix a(ImageView imageView0) {
                return null;
            }

            public void b(ImageView imageView0, Matrix matrix0) {
                ImageViewUtils.a(imageView0, matrix0);
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((ImageView)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((ImageView)object0), ((Matrix)object1));
            }
        };
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    private void L0(TransitionValues transitionValues0, boolean z) {
        View view0 = transitionValues0.b;
        if(!(view0 instanceof ImageView) || view0.getVisibility() != 0 || ((ImageView)view0).getDrawable() == null) {
            return;
        }
        Map map0 = transitionValues0.a;
        map0.put("android:changeImageTransform:bounds", new Rect(view0.getLeft(), view0.getTop(), view0.getRight(), view0.getBottom()));
        Matrix matrix0 = z ? ((Matrix)((ImageView)view0).getTag(id.transition_image_transform)) : null;
        if(matrix0 == null) {
            matrix0 = ChangeImageTransform.N0(((ImageView)view0));
        }
        map0.put("android:changeImageTransform:matrix", matrix0);
    }

    private static Matrix M0(ImageView imageView0) {
        Drawable drawable0 = imageView0.getDrawable();
        int v = drawable0.getIntrinsicWidth();
        float f = (float)imageView0.getWidth();
        int v1 = drawable0.getIntrinsicHeight();
        float f1 = (float)imageView0.getHeight();
        float f2 = Math.max(f / ((float)v), f1 / ((float)v1));
        Matrix matrix0 = new Matrix();
        matrix0.postScale(f2, f2);
        matrix0.postTranslate(((float)Math.round((f - ((float)v) * f2) / 2.0f)), ((float)Math.round((f1 - ((float)v1) * f2) / 2.0f)));
        return matrix0;
    }

    @NonNull
    private static Matrix N0(@NonNull ImageView imageView0) {
        Drawable drawable0 = imageView0.getDrawable();
        if(drawable0.getIntrinsicWidth() > 0 && drawable0.getIntrinsicHeight() > 0) {
            switch(androidx.transition.ChangeImageTransform.3.a[imageView0.getScaleType().ordinal()]) {
                case 1: {
                    return ChangeImageTransform.Q0(imageView0);
                }
                case 2: {
                    return ChangeImageTransform.M0(imageView0);
                }
                default: {
                    return new Matrix(imageView0.getImageMatrix());
                }
            }
        }
        return new Matrix(imageView0.getImageMatrix());
    }

    private ObjectAnimator O0(ImageView imageView0, Matrix matrix0, Matrix matrix1) {
        MatrixEvaluator transitionUtils$MatrixEvaluator0 = new MatrixEvaluator();
        return ObjectAnimator.ofObject(imageView0, ChangeImageTransform.Y8, transitionUtils$MatrixEvaluator0, new Matrix[]{matrix0, matrix1});
    }

    @NonNull
    private ObjectAnimator P0(@NonNull ImageView imageView0) {
        return ObjectAnimator.ofObject(imageView0, ChangeImageTransform.Y8, ChangeImageTransform.X8, new Matrix[]{MatrixUtils.a, MatrixUtils.a});
    }

    private static Matrix Q0(ImageView imageView0) {
        Drawable drawable0 = imageView0.getDrawable();
        Matrix matrix0 = new Matrix();
        matrix0.postScale(((float)imageView0.getWidth()) / ((float)drawable0.getIntrinsicWidth()), ((float)imageView0.getHeight()) / ((float)drawable0.getIntrinsicHeight()));
        return matrix0;
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public String[] Z() {
        return ChangeImageTransform.W8;
    }

    @Override  // androidx.transition.Transition
    public boolean c0() {
        return true;
    }

    @Override  // androidx.transition.Transition
    public void m(@NonNull TransitionValues transitionValues0) {
        this.L0(transitionValues0, false);
    }

    @Override  // androidx.transition.Transition
    public void p(@NonNull TransitionValues transitionValues0) {
        this.L0(transitionValues0, true);
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator t(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        if(transitionValues0 != null && transitionValues1 != null) {
            Rect rect0 = (Rect)transitionValues0.a.get("android:changeImageTransform:bounds");
            Rect rect1 = (Rect)transitionValues1.a.get("android:changeImageTransform:bounds");
            if(rect0 != null && rect1 != null) {
                Matrix matrix0 = (Matrix)transitionValues0.a.get("android:changeImageTransform:matrix");
                Matrix matrix1 = (Matrix)transitionValues1.a.get("android:changeImageTransform:matrix");
                boolean z = matrix0 == null && matrix1 == null || matrix0 != null && matrix0.equals(matrix1);
                if(rect0.equals(rect1) && z) {
                    return null;
                }
                ImageView imageView0 = (ImageView)transitionValues1.b;
                Drawable drawable0 = imageView0.getDrawable();
                if(drawable0.getIntrinsicWidth() > 0 && drawable0.getIntrinsicHeight() > 0) {
                    if(matrix0 == null) {
                        matrix0 = MatrixUtils.a;
                    }
                    if(matrix1 == null) {
                        matrix1 = MatrixUtils.a;
                    }
                    ChangeImageTransform.Y8.set(imageView0, matrix0);
                    Animator animator0 = this.O0(imageView0, matrix0, matrix1);
                    Listener changeImageTransform$Listener0 = new Listener(imageView0, matrix0, matrix1);
                    animator0.addListener(changeImageTransform$Listener0);
                    animator0.addPauseListener(changeImageTransform$Listener0);
                    this.c(changeImageTransform$Listener0);
                    return animator0;
                }
                return this.P0(imageView0);
            }
        }
        return null;
    }

    class androidx.transition.ChangeImageTransform.3 {
        static final int[] a;

        static {
            int[] arr_v = new int[ImageView.ScaleType.values().length];
            androidx.transition.ChangeImageTransform.3.a = arr_v;
            try {
                arr_v[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                androidx.transition.ChangeImageTransform.3.a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

