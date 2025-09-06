package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ChangeScroll extends Transition {
    private static final String U8 = "android:changeScroll:x";
    private static final String V8 = "android:changeScroll:y";
    private static final String[] W8;

    static {
        ChangeScroll.W8 = new String[]{"android:changeScroll:x", "android:changeScroll:y"};
    }

    public ChangeScroll() {
    }

    public ChangeScroll(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    private void L0(TransitionValues transitionValues0) {
        Integer integer0 = transitionValues0.b.getScrollX();
        transitionValues0.a.put("android:changeScroll:x", integer0);
        Integer integer1 = transitionValues0.b.getScrollY();
        transitionValues0.a.put("android:changeScroll:y", integer1);
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public String[] Z() {
        return ChangeScroll.W8;
    }

    @Override  // androidx.transition.Transition
    public boolean c0() {
        return true;
    }

    @Override  // androidx.transition.Transition
    public void m(@NonNull TransitionValues transitionValues0) {
        this.L0(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    public void p(@NonNull TransitionValues transitionValues0) {
        this.L0(transitionValues0);
    }

    @Override  // androidx.transition.Transition
    @Nullable
    public Animator t(@NonNull ViewGroup viewGroup0, @Nullable TransitionValues transitionValues0, @Nullable TransitionValues transitionValues1) {
        ObjectAnimator objectAnimator0;
        Animator animator0 = null;
        if(transitionValues0 != null && transitionValues1 != null) {
            View view0 = transitionValues1.b;
            int v = (int)(((Integer)transitionValues0.a.get("android:changeScroll:x")));
            int v1 = (int)(((Integer)transitionValues1.a.get("android:changeScroll:x")));
            int v2 = (int)(((Integer)transitionValues0.a.get("android:changeScroll:y")));
            int v3 = (int)(((Integer)transitionValues1.a.get("android:changeScroll:y")));
            if(v == v1) {
                objectAnimator0 = null;
            }
            else {
                view0.setScrollX(v);
                objectAnimator0 = ObjectAnimator.ofInt(view0, "scrollX", new int[]{v, v1});
            }
            if(v2 != v3) {
                view0.setScrollY(v2);
                animator0 = ObjectAnimator.ofInt(view0, "scrollY", new int[]{v2, v3});
            }
            return TransitionUtils.c(objectAnimator0, animator0);
        }
        return null;
    }
}

