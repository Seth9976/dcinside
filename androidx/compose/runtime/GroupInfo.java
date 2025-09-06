package androidx.compose.runtime;

final class GroupInfo {
    private int a;
    private int b;
    private int c;

    public GroupInfo(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final void d(int v) {
        this.c = v;
    }

    public final void e(int v) {
        this.b = v;
    }

    public final void f(int v) {
        this.a = v;
    }
}

