package androidx.transition;

import androidx.core.os.CancellationSignal.OnCancelListener;

public final class a implements OnCancelListener {
    public final Runnable a;
    public final Transition b;
    public final Runnable c;

    public a(Runnable runnable0, Transition transition0, Runnable runnable1) {
        this.a = runnable0;
        this.b = transition0;
        this.c = runnable1;
    }

    @Override  // androidx.core.os.CancellationSignal$OnCancelListener
    public final void onCancel() {
        FragmentTransitionSupport.E(this.a, this.b, this.c);
    }
}

