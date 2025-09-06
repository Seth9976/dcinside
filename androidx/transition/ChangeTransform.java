package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import org.xmlpull.v1.XmlPullParser;

public class ChangeTransform extends Transition {
    static class GhostListener extends TransitionListenerAdapter {
        private View a;
        private GhostView b;

        GhostListener(View view0, GhostView ghostView0) {
            this.a = view0;
            this.b = ghostView0;
        }

        @Override  // androidx.transition.TransitionListenerAdapter
        public void a(@NonNull Transition transition0) {
            this.b.setVisibility(0);
        }

        @Override  // androidx.transition.TransitionListenerAdapter
        public void l(@NonNull Transition transition0) {
            this.b.setVisibility(4);
        }

        @Override  // androidx.transition.TransitionListenerAdapter
        public void p(@NonNull Transition transition0) {
            transition0.s0(this);
            GhostViewUtils.b(this.a);
            this.a.setTag(id.transition_transform, null);
            this.a.setTag(id.parent_matrix, null);
        }
    }

    static class Listener extends AnimatorListenerAdapter {
        private boolean a;
        private final Matrix b;
        private final boolean c;
        private final boolean d;
        private final View e;
        private final Transforms f;
        private final PathAnimatorMatrix g;
        private final Matrix h;

        Listener(View view0, Transforms changeTransform$Transforms0, PathAnimatorMatrix changeTransform$PathAnimatorMatrix0, Matrix matrix0, boolean z, boolean z1) {
            this.b = new Matrix();
            this.c = z;
            this.d = z1;
            this.e = view0;
            this.f = changeTransform$Transforms0;
            this.g = changeTransform$PathAnimatorMatrix0;
            this.h = matrix0;
        }

        private void a(Matrix matrix0) {
            this.b.set(matrix0);
            this.e.setTag(id.transition_transform, this.b);
            this.f.a(this.e);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationCancel(Animator animator0) {
            this.a = true;
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            if(!this.a) {
                if(!this.c || !this.d) {
                    this.e.setTag(id.transition_transform, null);
                    this.e.setTag(id.parent_matrix, null);
                }
                else {
                    this.a(this.h);
                }
            }
            ViewUtils.d(this.e, null);
            this.f.a(this.e);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationPause(Animator animator0) {
            this.a(this.g.a());
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationResume(Animator animator0) {
            ChangeTransform.R0(this.e);
        }
    }

    static class PathAnimatorMatrix {
        private final Matrix a;
        private final View b;
        private final float[] c;
        private float d;
        private float e;

        PathAnimatorMatrix(View view0, float[] arr_f) {
            this.a = new Matrix();
            this.b = view0;
            float[] arr_f1 = (float[])arr_f.clone();
            this.c = arr_f1;
            this.d = arr_f1[2];
            this.e = arr_f1[5];
            this.b();
        }

        Matrix a() {
            return this.a;
        }

        private void b() {
            this.c[2] = this.d;
            this.c[5] = this.e;
            this.a.setValues(this.c);
            ViewUtils.d(this.b, this.a);
        }

        void c(PointF pointF0) {
            this.d = pointF0.x;
            this.e = pointF0.y;
            this.b();
        }

        void d(float[] arr_f) {
            System.arraycopy(arr_f, 0, this.c, 0, arr_f.length);
            this.b();
        }
    }

    static class Transforms {
        final float a;
        final float b;
        final float c;
        final float d;
        final float e;
        final float f;
        final float g;
        final float h;

        Transforms(View view0) {
            this.a = view0.getTranslationX();
            this.b = view0.getTranslationY();
            this.c = ViewCompat.F0(view0);
            this.d = view0.getScaleX();
            this.e = view0.getScaleY();
            this.f = view0.getRotationX();
            this.g = view0.getRotationY();
            this.h = view0.getRotation();
        }

        public void a(View view0) {
            ChangeTransform.V0(view0, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }

        @Override
        public boolean equals(Object object0) {
            return object0 instanceof Transforms ? ((Transforms)object0).a == this.a && ((Transforms)object0).b == this.b && ((Transforms)object0).c == this.c && ((Transforms)object0).d == this.d && ((Transforms)object0).e == this.e && ((Transforms)object0).f == this.f && ((Transforms)object0).g == this.g && ((Transforms)object0).h == this.h : false;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == 0.0f ? 0 : Float.floatToIntBits(this.a);
            int v2 = this.b == 0.0f ? 0 : Float.floatToIntBits(this.b);
            int v3 = this.c == 0.0f ? 0 : Float.floatToIntBits(this.c);
            int v4 = this.d == 0.0f ? 0 : Float.floatToIntBits(this.d);
            int v5 = this.e == 0.0f ? 0 : Float.floatToIntBits(this.e);
            int v6 = this.f == 0.0f ? 0 : Float.floatToIntBits(this.f);
            int v7 = this.g == 0.0f ? 0 : Float.floatToIntBits(this.g);
            float f = this.h;
            if(f != 0.0f) {
                v = Float.floatToIntBits(f);
            }
            return ((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v;
        }
    }

    boolean U8;
    private boolean V8;
    private Matrix W8;
    private static final String X8 = "android:changeTransform:matrix";
    private static final String Y8 = "android:changeTransform:transforms";
    private static final String Z8 = "android:changeTransform:parent";
    private static final String a9 = "android:changeTransform:parentMatrix";
    private static final String b9 = "android:changeTransform:intermediateParentMatrix";
    private static final String c9 = "android:changeTransform:intermediateMatrix";
    private static final String[] d9;
    private static final Property e9;
    private static final Property f9;
    private static final boolean g9;

    static {
        ChangeTransform.d9 = new String[]{"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
        ChangeTransform.e9 = new Property(float[].class, "nonTranslations") {
            public float[] a(PathAnimatorMatrix changeTransform$PathAnimatorMatrix0) {
                return null;
            }

            public void b(PathAnimatorMatrix changeTransform$PathAnimatorMatrix0, float[] arr_f) {
                changeTransform$PathAnimatorMatrix0.d(arr_f);
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((PathAnimatorMatrix)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((PathAnimatorMatrix)object0), ((float[])object1));
            }
        };
        ChangeTransform.f9 = new Property(PointF.class, "translations") {
            public PointF a(PathAnimatorMatrix changeTransform$PathAnimatorMatrix0) {
                return null;
            }

            public void b(PathAnimatorMatrix changeTransform$PathAnimatorMatrix0, PointF pointF0) {
                changeTransform$PathAnimatorMatrix0.c(pointF0);
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((PathAnimatorMatrix)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((PathAnimatorMatrix)object0), ((PointF)object1));
            }
        };
        ChangeTransform.g9 = true;
    }

    public ChangeTransform() {
        this.U8 = true;
        this.V8 = true;
        this.W8 = new Matrix();
    }

    public ChangeTransform(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.U8 = true;
        this.V8 = true;
        this.W8 = new Matrix();
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, Styleable.g);
        this.U8 = TypedArrayUtils.e(typedArray0, ((XmlPullParser)attributeSet0), "reparentWithOverlay", 1, true);
        this.V8 = TypedArrayUtils.e(typedArray0, ((XmlPullParser)attributeSet0), "reparent", 0, true);
        typedArray0.recycle();
    }

    private void L0(TransitionValues transitionValues0) {
        View view0 = transitionValues0.b;
        if(view0.getVisibility() == 8) {
            return;
        }
        ViewParent viewParent0 = view0.getParent();
        transitionValues0.a.put("android:changeTransform:parent", viewParent0);
        Transforms changeTransform$Transforms0 = new Transforms(view0);
        transitionValues0.a.put("android:changeTransform:transforms", changeTransform$Transforms0);
        Matrix matrix0 = view0.getMatrix();
        Matrix matrix1 = matrix0 == null || matrix0.isIdentity() ? null : new Matrix(matrix0);
        transitionValues0.a.put("android:changeTransform:matrix", matrix1);
        if(this.V8) {
            Matrix matrix2 = new Matrix();
            ViewGroup viewGroup0 = (ViewGroup)view0.getParent();
            ViewUtils.h(viewGroup0, matrix2);
            matrix2.preTranslate(((float)(-viewGroup0.getScrollX())), ((float)(-viewGroup0.getScrollY())));
            transitionValues0.a.put("android:changeTransform:parentMatrix", matrix2);
            Object object0 = view0.getTag(id.transition_transform);
            transitionValues0.a.put("android:changeTransform:intermediateMatrix", object0);
            Object object1 = view0.getTag(id.parent_matrix);
            transitionValues0.a.put("android:changeTransform:intermediateParentMatrix", object1);
        }
    }

    private void M0(ViewGroup viewGroup0, TransitionValues transitionValues0, TransitionValues transitionValues1) {
        View view0 = transitionValues1.b;
        Matrix matrix0 = new Matrix(((Matrix)transitionValues1.a.get("android:changeTransform:parentMatrix")));
        ViewUtils.i(viewGroup0, matrix0);
        GhostView ghostView0 = GhostViewUtils.a(view0, viewGroup0, matrix0);
        if(ghostView0 == null) {
            return;
        }
        ghostView0.a(((ViewGroup)transitionValues0.a.get("android:changeTransform:parent")), transitionValues0.b);
        ChangeTransform changeTransform0 = this;
        TransitionSet transitionSet0;
        while((transitionSet0 = changeTransform0.r) != null) {
            changeTransform0 = transitionSet0;
        }
        changeTransform0.c(new GhostListener(view0, ghostView0));
        if(ChangeTransform.g9) {
            View view1 = transitionValues0.b;
            if(view1 != transitionValues1.b) {
                ViewUtils.f(view1, 0.0f);
            }
            ViewUtils.f(view0, 1.0f);
        }
    }

    private ObjectAnimator N0(TransitionValues transitionValues0, TransitionValues transitionValues1, boolean z) {
        Matrix matrix0 = (Matrix)transitionValues0.a.get("android:changeTransform:matrix");
        Matrix matrix1 = (Matrix)transitionValues1.a.get("android:changeTransform:matrix");
        if(matrix0 == null) {
            matrix0 = MatrixUtils.a;
        }
        if(matrix1 == null) {
            matrix1 = MatrixUtils.a;
        }
        if(matrix0.equals(matrix1)) {
            return null;
        }
        Object object0 = transitionValues1.a.get("android:changeTransform:transforms");
        View view0 = transitionValues1.b;
        ChangeTransform.R0(view0);
        float[] arr_f = new float[9];
        matrix0.getValues(arr_f);
        float[] arr_f1 = new float[9];
        matrix1.getValues(arr_f1);
        PathAnimatorMatrix changeTransform$PathAnimatorMatrix0 = new PathAnimatorMatrix(view0, arr_f);
        FloatArrayEvaluator floatArrayEvaluator0 = new FloatArrayEvaluator(new float[9]);
        PropertyValuesHolder propertyValuesHolder0 = PropertyValuesHolder.ofObject(ChangeTransform.e9, floatArrayEvaluator0, new float[][]{arr_f, arr_f1});
        Path path0 = this.P().a(arr_f[2], arr_f[5], arr_f1[2], arr_f1[5]);
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofPropertyValuesHolder(changeTransform$PathAnimatorMatrix0, new PropertyValuesHolder[]{propertyValuesHolder0, PropertyValuesHolderUtils.a(ChangeTransform.f9, path0)});
        Listener changeTransform$Listener0 = new Listener(view0, ((Transforms)object0), changeTransform$PathAnimatorMatrix0, matrix1, z, this.U8);
        objectAnimator0.addListener(changeTransform$Listener0);
        objectAnimator0.addPauseListener(changeTransform$Listener0);
        return objectAnimator0;
    }

    public boolean O0() {
        return this.V8;
    }

    public boolean P0() {
        return this.U8;
    }

    private boolean Q0(ViewGroup viewGroup0, ViewGroup viewGroup1) {
        if(this.f0(viewGroup0) && this.f0(viewGroup1)) {
            TransitionValues transitionValues0 = this.N(viewGroup0, true);
            return transitionValues0 != null && viewGroup1 == transitionValues0.b;
        }
        return viewGroup0 == viewGroup1;
    }

    static void R0(View view0) {
        ChangeTransform.V0(view0, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    private void S0(TransitionValues transitionValues0, TransitionValues transitionValues1) {
        Matrix matrix0 = (Matrix)transitionValues1.a.get("android:changeTransform:parentMatrix");
        transitionValues1.b.setTag(id.parent_matrix, matrix0);
        Matrix matrix1 = this.W8;
        matrix1.reset();
        matrix0.invert(matrix1);
        Matrix matrix2 = (Matrix)transitionValues0.a.get("android:changeTransform:matrix");
        if(matrix2 == null) {
            matrix2 = new Matrix();
            transitionValues0.a.put("android:changeTransform:matrix", matrix2);
        }
        matrix2.postConcat(((Matrix)transitionValues0.a.get("android:changeTransform:parentMatrix")));
        matrix2.postConcat(matrix1);
    }

    public void T0(boolean z) {
        this.V8 = z;
    }

    public void U0(boolean z) {
        this.U8 = z;
    }

    static void V0(View view0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
        view0.setTranslationX(f);
        view0.setTranslationY(f1);
        ViewCompat.I2(view0, f2);
        view0.setScaleX(f3);
        view0.setScaleY(f4);
        view0.setRotationX(f5);
        view0.setRotationY(f6);
        view0.setRotation(f7);
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public String[] Z() {
        return ChangeTransform.d9;
    }

    @Override  // androidx.transition.Transition
    public void m(@NonNull TransitionValues transitionValues0) {
        this.L0(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    public void p(@NonNull TransitionValues transitionValues0) {
        this.L0(transitionValues0);
        if(!ChangeTransform.g9) {
            ((ViewGroup)transitionValues0.b.getParent()).startViewTransition(transitionValues0.b);
        }
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator t(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        if(transitionValues0 != null && transitionValues1 != null && transitionValues0.a.containsKey("android:changeTransform:parent") && transitionValues1.a.containsKey("android:changeTransform:parent")) {
            ViewGroup viewGroup1 = (ViewGroup)transitionValues0.a.get("android:changeTransform:parent");
            ViewGroup viewGroup2 = (ViewGroup)transitionValues1.a.get("android:changeTransform:parent");
            boolean z = this.V8 && !this.Q0(viewGroup1, viewGroup2);
            Matrix matrix0 = (Matrix)transitionValues0.a.get("android:changeTransform:intermediateMatrix");
            if(matrix0 != null) {
                transitionValues0.a.put("android:changeTransform:matrix", matrix0);
            }
            Matrix matrix1 = (Matrix)transitionValues0.a.get("android:changeTransform:intermediateParentMatrix");
            if(matrix1 != null) {
                transitionValues0.a.put("android:changeTransform:parentMatrix", matrix1);
            }
            if(z) {
                this.S0(transitionValues0, transitionValues1);
            }
            Animator animator0 = this.N0(transitionValues0, transitionValues1, z);
            if(z && animator0 != null && this.U8) {
                this.M0(viewGroup0, transitionValues0, transitionValues1);
                return animator0;
            }
            if(!ChangeTransform.g9) {
                viewGroup1.endViewTransition(transitionValues0.b);
            }
            return animator0;
        }
        return null;
    }
}

