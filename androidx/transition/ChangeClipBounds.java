package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ChangeClipBounds extends Transition {
    static class Listener extends AnimatorListenerAdapter implements TransitionListener {
        private final Rect a;
        private final Rect b;
        private final View c;

        Listener(View view0, Rect rect0, Rect rect1) {
            this.c = view0;
            this.a = rect0;
            this.b = rect1;
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void a(@NonNull Transition transition0) {
            Rect rect0 = (Rect)this.c.getTag(id.transition_clip);
            this.c.setClipBounds(rect0);
            this.c.setTag(id.transition_clip, null);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void k(@NonNull Transition transition0) {
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void l(@NonNull Transition transition0) {
            Rect rect0 = this.c.getClipBounds();
            if(rect0 == null) {
                rect0 = ChangeClipBounds.X8;
            }
            this.c.setTag(id.transition_clip, rect0);
            this.c.setClipBounds(this.b);
        }

        @Override  // androidx.transition.Transition$TransitionListener
        public void n(Transition transition0, boolean z) {
            e.a(this, transition0, z);
        }

        @Override  // android.animation.AnimatorListenerAdapter
        public void onAnimationEnd(Animator animator0) {
            this.onAnimationEnd(animator0, false);
        }

        @Override  // android.animation.Animator$AnimatorListener
        public void onAnimationEnd(Animator animator0, boolean z) {
            if(!z) {
                this.c.setClipBounds(this.b);
                return;
            }
            this.c.setClipBounds(this.a);
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

    private static final String U8 = "android:clipBounds:clip";
    private static final String V8 = "android:clipBounds:bounds";
    private static final String[] W8;
    static final Rect X8;

    static {
        ChangeClipBounds.W8 = new String[]{"android:clipBounds:clip"};
        ChangeClipBounds.X8 = new Rect();
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    private void L0(TransitionValues transitionValues0, boolean z) {
        Rect rect0 = null;
        View view0 = transitionValues0.b;
        if(view0.getVisibility() == 8) {
            return;
        }
        Rect rect1 = z ? ((Rect)view0.getTag(id.transition_clip)) : null;
        if(rect1 == null) {
            rect1 = view0.getClipBounds();
        }
        if(rect1 != ChangeClipBounds.X8) {
            rect0 = rect1;
        }
        transitionValues0.a.put("android:clipBounds:clip", rect0);
        if(rect0 == null) {
            Rect rect2 = new Rect(0, 0, view0.getWidth(), view0.getHeight());
            transitionValues0.a.put("android:clipBounds:bounds", rect2);
        }
    }

    @Override  // androidx.transition.Transition
    @NonNull
    public String[] Z() {
        return ChangeClipBounds.W8;
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
        Animator animator0 = null;
        if(transitionValues0 != null && transitionValues1 != null && transitionValues0.a.containsKey("android:clipBounds:clip") && transitionValues1.a.containsKey("android:clipBounds:clip")) {
            Rect rect0 = (Rect)transitionValues0.a.get("android:clipBounds:clip");
            Rect rect1 = (Rect)transitionValues1.a.get("android:clipBounds:clip");
            if(rect0 == null && rect1 == null) {
                return null;
            }
            Rect rect2 = rect0 == null ? ((Rect)transitionValues0.a.get("android:clipBounds:bounds")) : rect0;
            Rect rect3 = rect1 == null ? ((Rect)transitionValues1.a.get("android:clipBounds:bounds")) : rect1;
            if(rect2.equals(rect3)) {
                return null;
            }
            transitionValues1.b.setClipBounds(rect0);
            RectEvaluator rectEvaluator0 = new RectEvaluator(new Rect());
            animator0 = ObjectAnimator.ofObject(transitionValues1.b, ViewUtils.d, rectEvaluator0, new Rect[]{rect2, rect3});
            Listener changeClipBounds$Listener0 = new Listener(transitionValues1.b, rect0, rect1);
            animator0.addListener(changeClipBounds$Listener0);
            this.c(changeClipBounds$Listener0);
        }
        return animator0;
    }
}

