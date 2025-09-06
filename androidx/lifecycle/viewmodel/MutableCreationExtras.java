package androidx.lifecycle.viewmodel;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras() {
        this(null, 1, null);
    }

    public MutableCreationExtras(@l CreationExtras creationExtras0) {
        L.p(creationExtras0, "initialExtras");
        super();
        this.b().putAll(creationExtras0.b());
    }

    public MutableCreationExtras(CreationExtras creationExtras0, int v, w w0) {
        if((v & 1) != 0) {
            creationExtras0 = Empty.b;
        }
        this(creationExtras0);
    }

    @Override  // androidx.lifecycle.viewmodel.CreationExtras
    @m
    public Object a(@l Key creationExtras$Key0) {
        L.p(creationExtras$Key0, "key");
        return this.b().get(creationExtras$Key0);
    }

    public final void c(@l Key creationExtras$Key0, Object object0) {
        L.p(creationExtras$Key0, "key");
        this.b().put(creationExtras$Key0, object0);
    }
}

