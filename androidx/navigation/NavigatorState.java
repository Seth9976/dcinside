package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

public abstract class NavigatorState {
    @l
    private final ReentrantLock a;
    @l
    private final E b;
    @l
    private final E c;
    @RestrictTo({Scope.b})
    private boolean d;
    @l
    private final U e;
    @l
    private final U f;

    public NavigatorState() {
        this.a = new ReentrantLock(true);
        E e0 = W.a(u.H());
        this.b = e0;
        E e1 = W.a(k0.k());
        this.c = e1;
        this.e = k.m(e0);
        this.f = k.m(e1);
    }

    @l
    public abstract NavBackStackEntry a(@l NavDestination arg1, @m Bundle arg2);

    @l
    public final U b() {
        return this.e;
    }

    @l
    public final U c() {
        return this.f;
    }

    public final boolean d() {
        return this.d;
    }

    public void e(@l NavBackStackEntry navBackStackEntry0) {
        L.p(navBackStackEntry0, "entry");
        Set set0 = k0.y(((Set)this.c.getValue()), navBackStackEntry0);
        this.c.setValue(set0);
    }

    @CallSuper
    public void f(@l NavBackStackEntry navBackStackEntry0) {
        L.p(navBackStackEntry0, "backStackEntry");
        List list0 = u.E4(u.q4(((Iterable)this.b.getValue()), u.p3(((List)this.b.getValue()))), navBackStackEntry0);
        this.b.setValue(list0);
    }

    public void g(@l NavBackStackEntry navBackStackEntry0, boolean z) {
        L.p(navBackStackEntry0, "popUpTo");
        ReentrantLock reentrantLock0 = this.a;
        reentrantLock0.lock();
        try {
            E e0 = this.b;
            Iterable iterable0 = (Iterable)e0.getValue();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                if(L.g(((NavBackStackEntry)object0), navBackStackEntry0)) {
                    break;
                }
                arrayList0.add(object0);
            }
            e0.setValue(arrayList0);
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public void h(@l NavBackStackEntry navBackStackEntry0, boolean z) {
        Object object0 = null;
        L.p(navBackStackEntry0, "popUpTo");
        Set set0 = k0.D(((Set)this.c.getValue()), navBackStackEntry0);
        this.c.setValue(set0);
        List list0 = (List)this.e.getValue();
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            Object object1 = listIterator0.previous();
            if(!L.g(((NavBackStackEntry)object1), navBackStackEntry0) && ((List)this.e.getValue()).lastIndexOf(((NavBackStackEntry)object1)) < ((List)this.e.getValue()).lastIndexOf(navBackStackEntry0)) {
                object0 = object1;
                break;
            }
        }
        if(((NavBackStackEntry)object0) != null) {
            Set set1 = k0.D(((Set)this.c.getValue()), ((NavBackStackEntry)object0));
            this.c.setValue(set1);
        }
        this.g(navBackStackEntry0, z);
    }

    public void i(@l NavBackStackEntry navBackStackEntry0) {
        L.p(navBackStackEntry0, "backStackEntry");
        this.a.lock();
        try {
            List list0 = u.E4(((Collection)this.b.getValue()), navBackStackEntry0);
            this.b.setValue(list0);
        }
        finally {
            this.a.unlock();
        }
    }

    public void j(@l NavBackStackEntry navBackStackEntry0) {
        L.p(navBackStackEntry0, "backStackEntry");
        NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)u.v3(((List)this.e.getValue()));
        if(navBackStackEntry1 != null) {
            Set set0 = k0.D(((Set)this.c.getValue()), navBackStackEntry1);
            this.c.setValue(set0);
        }
        Set set1 = k0.D(((Set)this.c.getValue()), navBackStackEntry0);
        this.c.setValue(set1);
        this.i(navBackStackEntry0);
    }

    public final void k(boolean z) {
        this.d = z;
    }
}

