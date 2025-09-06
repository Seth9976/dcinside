package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle.State;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class FragmentTransaction {
    static final class Op {
        int a;
        Fragment b;
        boolean c;
        int d;
        int e;
        int f;
        int g;
        State h;
        State i;

        Op() {
        }

        Op(int v, Fragment fragment0) {
            this.a = v;
            this.b = fragment0;
            this.c = false;
            this.h = State.e;
            this.i = State.e;
        }

        Op(int v, @NonNull Fragment fragment0, State lifecycle$State0) {
            this.a = v;
            this.b = fragment0;
            this.c = false;
            this.h = fragment0.mMaxState;
            this.i = lifecycle$State0;
        }

        Op(int v, Fragment fragment0, boolean z) {
            this.a = v;
            this.b = fragment0;
            this.c = z;
            this.h = State.e;
            this.i = State.e;
        }

        Op(Op fragmentTransaction$Op0) {
            this.a = fragmentTransaction$Op0.a;
            this.b = fragmentTransaction$Op0.b;
            this.c = fragmentTransaction$Op0.c;
            this.d = fragmentTransaction$Op0.d;
            this.e = fragmentTransaction$Op0.e;
            this.f = fragmentTransaction$Op0.f;
            this.g = fragmentTransaction$Op0.g;
            this.h = fragmentTransaction$Op0.h;
            this.i = fragmentTransaction$Op0.i;
        }
    }

    static final int A = 7;
    static final int B = 8;
    static final int C = 9;
    static final int D = 10;
    public static final int E = 0x1000;
    public static final int F = 0x2000;
    public static final int G = -1;
    public static final int H = 0;
    public static final int I = 0x1001;
    public static final int J = 0x2002;
    public static final int K = 0x1003;
    public static final int L = 4100;
    public static final int M = 0x2005;
    private final FragmentFactory a;
    private final ClassLoader b;
    ArrayList c;
    int d;
    int e;
    int f;
    int g;
    int h;
    boolean i;
    boolean j;
    @Nullable
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList p;
    ArrayList q;
    boolean r;
    ArrayList s;
    static final int t = 0;
    static final int u = 1;
    static final int v = 2;
    static final int w = 3;
    static final int x = 4;
    static final int y = 5;
    static final int z = 6;

    @Deprecated
    public FragmentTransaction() {
        this.c = new ArrayList();
        this.j = true;
        this.r = false;
        this.a = null;
        this.b = null;
    }

    FragmentTransaction(@NonNull FragmentFactory fragmentFactory0, @Nullable ClassLoader classLoader0) {
        this.c = new ArrayList();
        this.j = true;
        this.r = false;
        this.a = fragmentFactory0;
        this.b = classLoader0;
    }

    FragmentTransaction(@NonNull FragmentFactory fragmentFactory0, @Nullable ClassLoader classLoader0, @NonNull FragmentTransaction fragmentTransaction0) {
        this(fragmentFactory0, classLoader0);
        for(Object object0: fragmentTransaction0.c) {
            this.c.add(new Op(((Op)object0)));
        }
        this.d = fragmentTransaction0.d;
        this.e = fragmentTransaction0.e;
        this.f = fragmentTransaction0.f;
        this.g = fragmentTransaction0.g;
        this.h = fragmentTransaction0.h;
        this.i = fragmentTransaction0.i;
        this.j = fragmentTransaction0.j;
        this.k = fragmentTransaction0.k;
        this.n = fragmentTransaction0.n;
        this.o = fragmentTransaction0.o;
        this.l = fragmentTransaction0.l;
        this.m = fragmentTransaction0.m;
        if(fragmentTransaction0.p != null) {
            ArrayList arrayList0 = new ArrayList();
            this.p = arrayList0;
            arrayList0.addAll(fragmentTransaction0.p);
        }
        if(fragmentTransaction0.q != null) {
            ArrayList arrayList1 = new ArrayList();
            this.q = arrayList1;
            arrayList1.addAll(fragmentTransaction0.q);
        }
        this.r = fragmentTransaction0.r;
    }

    public boolean A() {
        return this.c.isEmpty();
    }

    @NonNull
    public FragmentTransaction B(@NonNull Fragment fragment0) {
        this.m(new Op(3, fragment0));
        return this;
    }

    @NonNull
    public FragmentTransaction C(@IdRes int v, @NonNull Fragment fragment0) {
        return this.D(v, fragment0, null);
    }

    @NonNull
    public FragmentTransaction D(@IdRes int v, @NonNull Fragment fragment0, @Nullable String s) {
        if(v == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        this.x(v, fragment0, s, 2);
        return this;
    }

    @NonNull
    public final FragmentTransaction E(@IdRes int v, @NonNull Class class0, @Nullable Bundle bundle0) {
        return this.F(v, class0, bundle0, null);
    }

    @NonNull
    public final FragmentTransaction F(@IdRes int v, @NonNull Class class0, @Nullable Bundle bundle0, @Nullable String s) {
        return this.D(v, this.u(class0, bundle0), s);
    }

    @NonNull
    public FragmentTransaction G(@NonNull Runnable runnable0) {
        this.w();
        if(this.s == null) {
            this.s = new ArrayList();
        }
        this.s.add(runnable0);
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction H(boolean z) {
        return this.Q(z);
    }

    @NonNull
    @Deprecated
    public FragmentTransaction I(@StringRes int v) {
        this.n = v;
        this.o = null;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction J(@Nullable CharSequence charSequence0) {
        this.n = 0;
        this.o = charSequence0;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction K(@StringRes int v) {
        this.l = v;
        this.m = null;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction L(@Nullable CharSequence charSequence0) {
        this.l = 0;
        this.m = charSequence0;
        return this;
    }

    @NonNull
    public FragmentTransaction M(@AnimRes @AnimatorRes int v, @AnimRes @AnimatorRes int v1) {
        return this.N(v, v1, 0, 0);
    }

    @NonNull
    public FragmentTransaction N(@AnimRes @AnimatorRes int v, @AnimRes @AnimatorRes int v1, @AnimRes @AnimatorRes int v2, @AnimRes @AnimatorRes int v3) {
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        return this;
    }

    @NonNull
    public FragmentTransaction O(@NonNull Fragment fragment0, @NonNull State lifecycle$State0) {
        this.m(new Op(10, fragment0, lifecycle$State0));
        return this;
    }

    @NonNull
    public FragmentTransaction P(@Nullable Fragment fragment0) {
        this.m(new Op(8, fragment0));
        return this;
    }

    @NonNull
    public FragmentTransaction Q(boolean z) {
        this.r = z;
        return this;
    }

    @NonNull
    public FragmentTransaction R(int v) {
        this.h = v;
        return this;
    }

    @NonNull
    @Deprecated
    public FragmentTransaction S(@StyleRes int v) {
        return this;
    }

    @NonNull
    public FragmentTransaction T(@NonNull Fragment fragment0) {
        this.m(new Op(5, fragment0));
        return this;
    }

    @NonNull
    public FragmentTransaction f(@IdRes int v, @NonNull Fragment fragment0) {
        this.x(v, fragment0, null, 1);
        return this;
    }

    @NonNull
    public FragmentTransaction g(@IdRes int v, @NonNull Fragment fragment0, @Nullable String s) {
        this.x(v, fragment0, s, 1);
        return this;
    }

    @NonNull
    public final FragmentTransaction h(@IdRes int v, @NonNull Class class0, @Nullable Bundle bundle0) {
        return this.f(v, this.u(class0, bundle0));
    }

    @NonNull
    public final FragmentTransaction i(@IdRes int v, @NonNull Class class0, @Nullable Bundle bundle0, @Nullable String s) {
        return this.g(v, this.u(class0, bundle0), s);
    }

    FragmentTransaction j(@NonNull ViewGroup viewGroup0, @NonNull Fragment fragment0, @Nullable String s) {
        fragment0.mContainer = viewGroup0;
        return this.g(viewGroup0.getId(), fragment0, s);
    }

    @NonNull
    public FragmentTransaction k(@NonNull Fragment fragment0, @Nullable String s) {
        this.x(0, fragment0, s, 1);
        return this;
    }

    @NonNull
    public final FragmentTransaction l(@NonNull Class class0, @Nullable Bundle bundle0, @Nullable String s) {
        return this.k(this.u(class0, bundle0), s);
    }

    void m(Op fragmentTransaction$Op0) {
        this.c.add(fragmentTransaction$Op0);
        fragmentTransaction$Op0.d = this.d;
        fragmentTransaction$Op0.e = this.e;
        fragmentTransaction$Op0.f = this.f;
        fragmentTransaction$Op0.g = this.g;
    }

    @NonNull
    public FragmentTransaction n(@NonNull View view0, @NonNull String s) {
        String s1 = ViewCompat.C0(view0);
        if(s1 == null) {
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        if(this.p == null) {
            this.p = new ArrayList();
            this.q = new ArrayList();
        }
        else {
            if(this.q.contains(s)) {
                throw new IllegalArgumentException("A shared element with the target name \'" + s + "\' has already been added to the transaction.");
            }
            if(this.p.contains(s1)) {
                throw new IllegalArgumentException("A shared element with the source name \'" + s1 + "\' has already been added to the transaction.");
            }
        }
        this.p.add(s1);
        this.q.add(s);
        return this;
    }

    @NonNull
    public FragmentTransaction o(@Nullable String s) {
        if(!this.j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.i = true;
        this.k = s;
        return this;
    }

    @NonNull
    public FragmentTransaction p(@NonNull Fragment fragment0) {
        this.m(new Op(7, fragment0));
        return this;
    }

    public abstract int q();

    public abstract int r();

    public abstract void s();

    public abstract void t();

    @NonNull
    private Fragment u(@NonNull Class class0, @Nullable Bundle bundle0) {
        FragmentFactory fragmentFactory0 = this.a;
        if(fragmentFactory0 == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader0 = this.b;
        if(classLoader0 == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragment0 = fragmentFactory0.a(classLoader0, class0.getName());
        if(bundle0 != null) {
            fragment0.setArguments(bundle0);
        }
        return fragment0;
    }

    @NonNull
    public FragmentTransaction v(@NonNull Fragment fragment0) {
        this.m(new Op(6, fragment0));
        return this;
    }

    @NonNull
    public FragmentTransaction w() {
        if(this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    void x(int v, Fragment fragment0, @Nullable String s, int v1) {
        String s1 = fragment0.mPreviousWho;
        if(s1 != null) {
            FragmentStrictMode.i(fragment0, s1);
        }
        Class class0 = fragment0.getClass();
        int v2 = class0.getModifiers();
        if(class0.isAnonymousClass() || !Modifier.isPublic(v2) || class0.isMemberClass() && !Modifier.isStatic(v2)) {
            throw new IllegalStateException("Fragment " + class0.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if(s != null) {
            if(fragment0.mTag != null && !s.equals(fragment0.mTag)) {
                throw new IllegalStateException("Can\'t change tag of fragment " + fragment0 + ": was " + fragment0.mTag + " now " + s);
            }
            fragment0.mTag = s;
        }
        switch(v) {
            case -1: {
                throw new IllegalArgumentException("Can\'t add fragment " + fragment0 + " with tag " + s + " to container view with no id");
            label_13:
                if(fragment0.mFragmentId != 0 && fragment0.mFragmentId != v) {
                    throw new IllegalStateException("Can\'t change container ID of fragment " + fragment0 + ": was " + fragment0.mFragmentId + " now " + v);
                }
                fragment0.mFragmentId = v;
                fragment0.mContainerId = v;
                break;
            }
            case 0: {
                break;
            }
            default: {
                goto label_13;
            }
        }
        this.m(new Op(v1, fragment0));
    }

    @NonNull
    public FragmentTransaction y(@NonNull Fragment fragment0) {
        this.m(new Op(4, fragment0));
        return this;
    }

    public boolean z() {
        return this.j;
    }
}

