package androidx.profileinstaller;

public final class d implements Runnable {
    public final DiagnosticsCallback a;
    public final int b;
    public final Object c;

    public d(DiagnosticsCallback profileInstaller$DiagnosticsCallback0, int v, Object object0) {
        this.a = profileInstaller$DiagnosticsCallback0;
        this.b = v;
        this.c = object0;
    }

    @Override
    public final void run() {
        this.a.b(this.b, this.c);
    }
}

