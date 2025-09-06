package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        this.h1();
    }

    public AutoTransition(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.h1();
    }

    private void h1() {
        this.e1(1);
        this.Q0(new Fade(2)).Q0(new ChangeBounds()).Q0(new Fade(1));
    }
}

