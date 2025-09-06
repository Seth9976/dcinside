package androidx.work;

import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class NoOpInputMergerFactory extends InputMergerFactory {
    @l
    public static final NoOpInputMergerFactory a;

    static {
        NoOpInputMergerFactory.a = new NoOpInputMergerFactory();
    }

    @Override  // androidx.work.InputMergerFactory
    public InputMerger a(String s) {
        return (InputMerger)this.c(s);
    }

    @m
    public Void c(@l String s) {
        L.p(s, "className");
        return null;
    }
}

