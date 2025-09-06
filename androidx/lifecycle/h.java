package androidx.lifecycle;

public final class h implements Runnable {
    public final ProcessLifecycleOwner a;

    public h(ProcessLifecycleOwner processLifecycleOwner0) {
        this.a = processLifecycleOwner0;
    }

    @Override
    public final void run() {
        ProcessLifecycleOwner.i(this.a);
    }
}

