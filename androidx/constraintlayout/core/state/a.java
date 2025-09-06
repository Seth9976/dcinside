package androidx.constraintlayout.core.state;

public final class a implements Interpolator {
    public final String a;

    public a(String s) {
        this.a = s;
    }

    @Override  // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float f) {
        return Transition.b0(this.a, f);
    }
}

