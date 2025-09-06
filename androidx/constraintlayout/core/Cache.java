package androidx.constraintlayout.core;

public class Cache {
    Pool a;
    Pool b;
    Pool c;
    SolverVariable[] d;

    public Cache() {
        this.a = new SimplePool(0x100);
        this.b = new SimplePool(0x100);
        this.c = new SimplePool(0x100);
        this.d = new SolverVariable[0x20];
    }
}

