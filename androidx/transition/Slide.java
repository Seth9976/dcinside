package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.xmlpull.v1.XmlPullParser;

public class Slide extends Visibility {
    interface CalculateSlide {
        float a(ViewGroup arg1, View arg2);

        float b(ViewGroup arg1, View arg2);
    }

    static abstract class CalculateSlideHorizontal implements CalculateSlide {
        private CalculateSlideHorizontal() {
        }

        CalculateSlideHorizontal(androidx.transition.Slide.1 slide$10) {
        }

        @Override  // androidx.transition.Slide$CalculateSlide
        public float a(ViewGroup viewGroup0, View view0) {
            return view0.getTranslationY();
        }
    }

    static abstract class CalculateSlideVertical implements CalculateSlide {
        private CalculateSlideVertical() {
        }

        CalculateSlideVertical(androidx.transition.Slide.1 slide$10) {
        }

        @Override  // androidx.transition.Slide$CalculateSlide
        public float b(ViewGroup viewGroup0, View view0) {
            return view0.getTranslationX();
        }
    }

    @RestrictTo({Scope.c})
    @Retention(RetentionPolicy.SOURCE)
    public @interface GravityFlag {
    }

    private CalculateSlide b9;
    private int c9;
    private static final TimeInterpolator d9 = null;
    private static final TimeInterpolator e9 = null;
    private static final String f9 = "android:slide:screenPosition";
    private static final CalculateSlide g9;
    private static final CalculateSlide h9;
    private static final CalculateSlide i9;
    private static final CalculateSlide j9;
    private static final CalculateSlide k9;
    private static final CalculateSlide l9;

    static {
        Slide.d9 = new DecelerateInterpolator();
        Slide.e9 = new AccelerateInterpolator();
        Slide.g9 = new CalculateSlideHorizontal() {
            {
                super(null);
            }

            @Override  // androidx.transition.Slide$CalculateSlide
            public float b(ViewGroup viewGroup0, View view0) {
                return view0.getTranslationX() - ((float)viewGroup0.getWidth());
            }
        };
        Slide.h9 = new CalculateSlideHorizontal() {
            {
                super(null);
            }

            @Override  // androidx.transition.Slide$CalculateSlide
            public float b(ViewGroup viewGroup0, View view0) {
                return viewGroup0.getLayoutDirection() == 1 ? view0.getTranslationX() + ((float)viewGroup0.getWidth()) : view0.getTranslationX() - ((float)viewGroup0.getWidth());
            }
        };
        Slide.i9 = new CalculateSlideVertical() {
            {
                super(null);
            }

            @Override  // androidx.transition.Slide$CalculateSlide
            public float a(ViewGroup viewGroup0, View view0) {
                return view0.getTranslationY() - ((float)viewGroup0.getHeight());
            }
        };
        Slide.j9 = new CalculateSlideHorizontal() {
            {
                super(null);
            }

            @Override  // androidx.transition.Slide$CalculateSlide
            public float b(ViewGroup viewGroup0, View view0) {
                return view0.getTranslationX() + ((float)viewGroup0.getWidth());
            }
        };
        Slide.k9 = new CalculateSlideHorizontal() {
            {
                super(null);
            }

            @Override  // androidx.transition.Slide$CalculateSlide
            public float b(ViewGroup viewGroup0, View view0) {
                return viewGroup0.getLayoutDirection() == 1 ? view0.getTranslationX() - ((float)viewGroup0.getWidth()) : view0.getTranslationX() + ((float)viewGroup0.getWidth());
            }
        };
        Slide.l9 = new CalculateSlideVertical() {
            {
                super(null);
            }

            @Override  // androidx.transition.Slide$CalculateSlide
            public float a(ViewGroup viewGroup0, View view0) {
                return view0.getTranslationY() + ((float)viewGroup0.getHeight());
            }
        };
    }

    public Slide() {
        this.b9 = Slide.l9;
        this.c9 = 80;
        this.V0(80);
    }

    public Slide(int v) {
        this.b9 = Slide.l9;
        this.c9 = 80;
        this.V0(v);
    }

    public Slide(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b9 = Slide.l9;
        this.c9 = 80;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, Styleable.h);
        int v = TypedArrayUtils.k(typedArray0, ((XmlPullParser)attributeSet0), "slideEdge", 0, 80);
        typedArray0.recycle();
        this.V0(v);
    }

    private void L0(TransitionValues transitionValues0) {
        int[] arr_v = new int[2];
        transitionValues0.b.getLocationOnScreen(arr_v);
        transitionValues0.a.put("android:slide:screenPosition", arr_v);
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator P0(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        if(transitionValues1 == null) {
            return null;
        }
        int[] arr_v = (int[])transitionValues1.a.get("android:slide:screenPosition");
        float f = view0.getTranslationX();
        float f1 = view0.getTranslationY();
        float f2 = this.b9.b(viewGroup0, view0);
        float f3 = this.b9.a(viewGroup0, view0);
        return TranslationAnimationCreator.a(view0, transitionValues1, arr_v[0], arr_v[1], f2, f3, f, f1, Slide.d9, this);
    }

    @Override  // androidx.transition.Visibility
    @Nullable
    public Animator R0(@NonNull ViewGroup viewGroup0, @NonNull View view0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        if(transitionValues0 == null) {
            return null;
        }
        int[] arr_v = (int[])transitionValues0.a.get("android:slide:screenPosition");
        float f = view0.getTranslationX();
        float f1 = view0.getTranslationY();
        float f2 = this.b9.b(viewGroup0, view0);
        float f3 = this.b9.a(viewGroup0, view0);
        return TranslationAnimationCreator.a(view0, transitionValues0, arr_v[0], arr_v[1], f, f1, f2, f3, Slide.e9, this);
    }

    public int U0() {
        return this.c9;
    }

    public void V0(int v) {
        switch(v) {
            case 3: {
                this.b9 = Slide.g9;
                break;
            }
            case 5: {
                this.b9 = Slide.j9;
                break;
            }
            case 0x30: {
                this.b9 = Slide.i9;
                break;
            }
            case 80: {
                this.b9 = Slide.l9;
                break;
            }
            case 0x800003: {
                this.b9 = Slide.h9;
                break;
            }
            case 0x800005: {
                this.b9 = Slide.k9;
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid slide direction");
            }
        }
        this.c9 = v;
        SidePropagation sidePropagation0 = new SidePropagation();
        sidePropagation0.k(v);
        this.H0(sidePropagation0);
    }

    @Override  // androidx.transition.Transition
    public boolean c0() {
        return true;
    }

    @Override  // androidx.transition.Visibility
    public void m(@NonNull TransitionValues transitionValues0) {
        super.m(transitionValues0);
        this.L0(transitionValues0);
    }

    @Override  // androidx.transition.Visibility
    public void p(@NonNull TransitionValues transitionValues0) {
        super.p(transitionValues0);
        this.L0(transitionValues0);
    }
}

