package io.reactivex.disposables;

final class g extends f {
    private static final long b = 0x8DEDA7D87411765FL;

    g(Runnable runnable0) {
        super(runnable0);
    }

    @Override  // io.reactivex.disposables.f
    protected void b(@d3.f Object object0) {
        this.c(((Runnable)object0));
    }

    protected void c(@d3.f Runnable runnable0) {
        runnable0.run();
    }

    @Override
    public String toString() {
        return "RunnableDisposable(disposed=" + this.a() + ", " + this.get() + ")";
    }
}

