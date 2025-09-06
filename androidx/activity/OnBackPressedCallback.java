package androidx.activity;

import A3.a;
import androidx.annotation.MainThread;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"})
public abstract class OnBackPressedCallback {
    private boolean a;
    @l
    private final CopyOnWriteArrayList b;
    @m
    private a c;

    public OnBackPressedCallback(boolean z) {
        this.a = z;
        this.b = new CopyOnWriteArrayList();
    }

    @i(name = "addCancellable")
    public final void d(@l Cancellable cancellable0) {
        L.p(cancellable0, "cancellable");
        this.b.add(cancellable0);
    }

    @m
    public final a e() {
        return this.c;
    }

    @MainThread
    public void f() {
    }

    @MainThread
    public abstract void g();

    @MainThread
    public void h(@l BackEventCompat backEventCompat0) {
        L.p(backEventCompat0, "backEvent");
    }

    @MainThread
    public void i(@l BackEventCompat backEventCompat0) {
        L.p(backEventCompat0, "backEvent");
    }

    @MainThread
    public final boolean j() {
        return this.a;
    }

    @MainThread
    public final void k() {
        for(Object object0: this.b) {
            ((Cancellable)object0).cancel();
        }
    }

    @i(name = "removeCancellable")
    public final void l(@l Cancellable cancellable0) {
        L.p(cancellable0, "cancellable");
        this.b.remove(cancellable0);
    }

    @MainThread
    public final void m(boolean z) {
        this.a = z;
        a a0 = this.c;
        if(a0 != null) {
            a0.invoke();
        }
    }

    public final void n(@m a a0) {
        this.c = a0;
    }
}

