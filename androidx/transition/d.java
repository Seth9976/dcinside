package androidx.transition;

import androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationEndListener;
import androidx.dynamicanimation.animation.DynamicAnimation;

public final class d implements OnAnimationEndListener {
    public final SeekController a;

    public d(SeekController transition$SeekController0) {
        this.a = transition$SeekController0;
    }

    @Override  // androidx.dynamicanimation.animation.DynamicAnimation$OnAnimationEndListener
    public final void a(DynamicAnimation dynamicAnimation0, boolean z, float f, float f1) {
        this.a.x(dynamicAnimation0, z, f, f1);
    }
}

