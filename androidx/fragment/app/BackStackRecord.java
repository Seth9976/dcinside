package androidx.fragment.app;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle.State;
import java.io.PrintWriter;
import java.util.ArrayList;

final class BackStackRecord extends FragmentTransaction implements BackStackEntry, OpGenerator {
    final FragmentManager N;
    boolean O;
    int P;
    boolean Q;
    private static final String R = "FragmentManager";

    BackStackRecord(@NonNull BackStackRecord backStackRecord0) {
        super(backStackRecord0.N.G0(), (backStackRecord0.N.J0() == null ? null : backStackRecord0.N.J0().f().getClassLoader()), backStackRecord0);
        this.N = backStackRecord0.N;
        this.O = backStackRecord0.O;
        this.P = backStackRecord0.P;
        this.Q = backStackRecord0.Q;
    }

    BackStackRecord(@NonNull FragmentManager fragmentManager0) {
        super(fragmentManager0.G0(), (fragmentManager0.J0() == null ? null : fragmentManager0.J0().f().getClassLoader()));
        this.P = -1;
        this.Q = false;
        this.N = fragmentManager0;
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public boolean A() {
        return this.c.isEmpty();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction B(@NonNull Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.N) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment Fragment{1e13c4ba} (d946e8e1-b5f6-470c-aa19-8207039d2480) is already attached to a FragmentManager.");
        }
        return super.B(fragment0);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction O(@NonNull Fragment fragment0, @NonNull State lifecycle$State0) {
        if(fragment0.mFragmentManager != this.N) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.N);
        }
        if(lifecycle$State0 == State.b && fragment0.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + lifecycle$State0 + " after the Fragment has been created");
        }
        if(lifecycle$State0 == State.a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + lifecycle$State0 + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        return super.O(fragment0, lifecycle$State0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction P(@Nullable Fragment fragment0) {
        if(fragment0 != null && (fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.N)) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment Fragment{7cff83f0} (81ff3cd6-a134-4955-8349-2751682fa532) is already attached to a FragmentManager.");
        }
        return super.P(fragment0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction T(@NonNull Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.N) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment Fragment{67b1378} (03648485-cd7a-486b-af41-56b45f40d1b5) is already attached to a FragmentManager.");
        }
        return super.T(fragment0);
    }

    void U(int v) {
        if(!this.i) {
            return;
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Bump nesting in " + this + " by " + v);
        }
        int v1 = this.c.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Op fragmentTransaction$Op0 = (Op)this.c.get(v2);
            Fragment fragment0 = fragmentTransaction$Op0.b;
            if(fragment0 != null) {
                fragment0.mBackStackNesting += v;
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "Bump nesting of " + fragmentTransaction$Op0.b + " to " + fragmentTransaction$Op0.b.mBackStackNesting);
                }
            }
        }
    }

    void V() {
        for(int v = this.c.size() - 1; v >= 0; --v) {
            Op fragmentTransaction$Op0 = (Op)this.c.get(v);
            if(fragmentTransaction$Op0.c) {
                if(fragmentTransaction$Op0.a == 8) {
                    fragmentTransaction$Op0.c = false;
                    this.c.remove(v - 1);
                    --v;
                }
                else {
                    int v1 = fragmentTransaction$Op0.b.mContainerId;
                    fragmentTransaction$Op0.a = 2;
                    fragmentTransaction$Op0.c = false;
                    for(int v2 = v - 1; v2 >= 0; --v2) {
                        Op fragmentTransaction$Op1 = (Op)this.c.get(v2);
                        if(fragmentTransaction$Op1.c && fragmentTransaction$Op1.b.mContainerId == v1) {
                            this.c.remove(v2);
                            --v;
                        }
                    }
                }
            }
        }
    }

    int W(boolean z) {
        if(this.O) {
            throw new IllegalStateException("commit already called");
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter0 = new PrintWriter(new LogWriter("FragmentManager"));
            this.X("  ", printWriter0);
            printWriter0.close();
        }
        this.O = true;
        this.P = this.i ? this.N.r() : -1;
        this.N.h0(this, z);
        return this.P;
    }

    public void X(String s, PrintWriter printWriter0) {
        this.Y(s, printWriter0, true);
    }

    public void Y(String s, PrintWriter printWriter0, boolean z) {
        String s1;
        if(z) {
            printWriter0.print(s);
            printWriter0.print("mName=");
            printWriter0.print(this.k);
            printWriter0.print(" mIndex=");
            printWriter0.print(this.P);
            printWriter0.print(" mCommitted=");
            printWriter0.println(this.O);
            if(this.h != 0) {
                printWriter0.print(s);
                printWriter0.print("mTransition=#");
                printWriter0.print(Integer.toHexString(this.h));
            }
            if(this.d != 0 || this.e != 0) {
                printWriter0.print(s);
                printWriter0.print("mEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.d));
                printWriter0.print(" mExitAnim=#");
                printWriter0.println(Integer.toHexString(this.e));
            }
            if(this.f != 0 || this.g != 0) {
                printWriter0.print(s);
                printWriter0.print("mPopEnterAnim=#");
                printWriter0.print(Integer.toHexString(this.f));
                printWriter0.print(" mPopExitAnim=#");
                printWriter0.println(Integer.toHexString(this.g));
            }
            if(this.l != 0 || this.m != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbTitleRes=#");
                printWriter0.print(Integer.toHexString(this.l));
                printWriter0.print(" mBreadCrumbTitleText=");
                printWriter0.println(this.m);
            }
            if(this.n != 0 || this.o != null) {
                printWriter0.print(s);
                printWriter0.print("mBreadCrumbShortTitleRes=#");
                printWriter0.print(Integer.toHexString(this.n));
                printWriter0.print(" mBreadCrumbShortTitleText=");
                printWriter0.println(this.o);
            }
        }
        if(!this.c.isEmpty()) {
            printWriter0.print(s);
            printWriter0.println("Operations:");
            int v = this.c.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Op fragmentTransaction$Op0 = (Op)this.c.get(v1);
                switch(fragmentTransaction$Op0.a) {
                    case 0: {
                        s1 = "NULL";
                        break;
                    }
                    case 1: {
                        s1 = "ADD";
                        break;
                    }
                    case 2: {
                        s1 = "REPLACE";
                        break;
                    }
                    case 3: {
                        s1 = "REMOVE";
                        break;
                    }
                    case 4: {
                        s1 = "HIDE";
                        break;
                    }
                    case 5: {
                        s1 = "SHOW";
                        break;
                    }
                    case 6: {
                        s1 = "DETACH";
                        break;
                    }
                    case 7: {
                        s1 = "ATTACH";
                        break;
                    }
                    case 8: {
                        s1 = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 9: {
                        s1 = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 10: {
                        s1 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    default: {
                        s1 = "cmd=" + fragmentTransaction$Op0.a;
                    }
                }
                printWriter0.print(s);
                printWriter0.print("  Op #");
                printWriter0.print(v1);
                printWriter0.print(": ");
                printWriter0.print(s1);
                printWriter0.print(" ");
                printWriter0.println(fragmentTransaction$Op0.b);
                if(z) {
                    if(fragmentTransaction$Op0.d != 0 || fragmentTransaction$Op0.e != 0) {
                        printWriter0.print(s);
                        printWriter0.print("enterAnim=#");
                        printWriter0.print(Integer.toHexString(fragmentTransaction$Op0.d));
                        printWriter0.print(" exitAnim=#");
                        printWriter0.println(Integer.toHexString(fragmentTransaction$Op0.e));
                    }
                    if(fragmentTransaction$Op0.f != 0 || fragmentTransaction$Op0.g != 0) {
                        printWriter0.print(s);
                        printWriter0.print("popEnterAnim=#");
                        printWriter0.print(Integer.toHexString(fragmentTransaction$Op0.f));
                        printWriter0.print(" popExitAnim=#");
                        printWriter0.println(Integer.toHexString(fragmentTransaction$Op0.g));
                    }
                }
            }
        }
    }

    void Z() {
        int v = this.c.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Op fragmentTransaction$Op0 = (Op)this.c.get(v1);
            Fragment fragment0 = fragmentTransaction$Op0.b;
            if(fragment0 != null) {
                fragment0.mBeingSaved = this.Q;
                fragment0.setPopDirection(false);
                fragment0.setNextTransition(this.h);
                fragment0.setSharedElementNames(this.p, this.q);
            }
            switch(fragmentTransaction$Op0.a) {
                case 1: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.V1(fragment0, false);
                    this.N.n(fragment0);
                    break;
                }
                case 3: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.C1(fragment0);
                    break;
                }
                case 4: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.T0(fragment0);
                    break;
                }
                case 5: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.V1(fragment0, false);
                    this.N.c2(fragment0);
                    break;
                }
                case 6: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.E(fragment0);
                    break;
                }
                case 7: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.V1(fragment0, false);
                    this.N.t(fragment0);
                    break;
                }
                case 8: {
                    this.N.Y1(fragment0);
                    break;
                }
                case 9: {
                    this.N.Y1(null);
                    break;
                }
                case 10: {
                    this.N.X1(fragment0, fragmentTransaction$Op0.i);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + fragmentTransaction$Op0.a);
                }
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentManager$OpGenerator
    public boolean a(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList0.add(this);
        arrayList1.add(Boolean.FALSE);
        if(this.i) {
            this.N.m(this);
        }
        return true;
    }

    void a0() {
        for(int v = this.c.size() - 1; v >= 0; --v) {
            Op fragmentTransaction$Op0 = (Op)this.c.get(v);
            Fragment fragment0 = fragmentTransaction$Op0.b;
            if(fragment0 != null) {
                fragment0.mBeingSaved = this.Q;
                fragment0.setPopDirection(true);
                fragment0.setNextTransition(FragmentManager.O1(this.h));
                fragment0.setSharedElementNames(this.q, this.p);
            }
            switch(fragmentTransaction$Op0.a) {
                case 1: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.V1(fragment0, true);
                    this.N.C1(fragment0);
                    break;
                }
                case 3: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.n(fragment0);
                    break;
                }
                case 4: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.c2(fragment0);
                    break;
                }
                case 5: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.V1(fragment0, true);
                    this.N.T0(fragment0);
                    break;
                }
                case 6: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.t(fragment0);
                    break;
                }
                case 7: {
                    fragment0.setAnimations(fragmentTransaction$Op0.d, fragmentTransaction$Op0.e, fragmentTransaction$Op0.f, fragmentTransaction$Op0.g);
                    this.N.V1(fragment0, true);
                    this.N.E(fragment0);
                    break;
                }
                case 8: {
                    this.N.Y1(null);
                    break;
                }
                case 9: {
                    this.N.Y1(fragment0);
                    break;
                }
                case 10: {
                    this.N.X1(fragment0, fragmentTransaction$Op0.h);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + fragmentTransaction$Op0.a);
                }
            }
        }
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    @Nullable
    public CharSequence b() {
        return this.n == 0 ? this.o : this.N.J0().f().getText(this.n);
    }

    Fragment b0(ArrayList arrayList0, Fragment fragment0) {
        for(int v = 0; v < this.c.size(); ++v) {
            Op fragmentTransaction$Op0 = (Op)this.c.get(v);
            int v1 = fragmentTransaction$Op0.a;
            if(v1 == 1) {
                arrayList0.add(fragmentTransaction$Op0.b);
            }
            else {
                switch(v1) {
                    case 2: {
                        Fragment fragment1 = fragmentTransaction$Op0.b;
                        int v2 = fragment1.mContainerId;
                        int v3 = arrayList0.size() - 1;
                        boolean z = false;
                        while(v3 >= 0) {
                            Fragment fragment2 = (Fragment)arrayList0.get(v3);
                            if(fragment2.mContainerId == v2) {
                                if(fragment2 == fragment1) {
                                    z = true;
                                }
                                else {
                                    if(fragment2 == fragment0) {
                                        this.c.add(v, new Op(9, fragment2, true));
                                        ++v;
                                        fragment0 = null;
                                    }
                                    Op fragmentTransaction$Op1 = new Op(3, fragment2, true);
                                    fragmentTransaction$Op1.d = fragmentTransaction$Op0.d;
                                    fragmentTransaction$Op1.f = fragmentTransaction$Op0.f;
                                    fragmentTransaction$Op1.e = fragmentTransaction$Op0.e;
                                    fragmentTransaction$Op1.g = fragmentTransaction$Op0.g;
                                    this.c.add(v, fragmentTransaction$Op1);
                                    arrayList0.remove(fragment2);
                                    ++v;
                                }
                            }
                            --v3;
                        }
                        if(z) {
                            this.c.remove(v);
                            --v;
                        }
                        else {
                            fragmentTransaction$Op0.a = 1;
                            fragmentTransaction$Op0.c = true;
                            arrayList0.add(fragment1);
                        }
                        break;
                    }
                    case 3: 
                    case 6: {
                        arrayList0.remove(fragmentTransaction$Op0.b);
                        Fragment fragment3 = fragmentTransaction$Op0.b;
                        if(fragment3 == fragment0) {
                            this.c.add(v, new Op(9, fragment3));
                            ++v;
                            fragment0 = null;
                        }
                        break;
                    }
                    case 7: {
                        arrayList0.add(fragmentTransaction$Op0.b);
                        break;
                    }
                    case 8: {
                        this.c.add(v, new Op(9, fragment0, true));
                        fragmentTransaction$Op0.c = true;
                        ++v;
                        fragment0 = fragmentTransaction$Op0.b;
                    }
                }
            }
        }
        return fragment0;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    @Nullable
    public CharSequence c() {
        return this.l == 0 ? this.m : this.N.J0().f().getText(this.l);
    }

    public void c0() {
        if(this.s != null) {
            for(int v = 0; v < this.s.size(); ++v) {
                ((Runnable)this.s.get(v)).run();
            }
            this.s = null;
        }
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public int d() {
        return this.n;
    }

    Fragment d0(ArrayList arrayList0, Fragment fragment0) {
        for(int v = this.c.size() - 1; v >= 0; --v) {
            Op fragmentTransaction$Op0 = (Op)this.c.get(v);
            switch(fragmentTransaction$Op0.a) {
                case 3: 
                case 6: {
                    arrayList0.add(fragmentTransaction$Op0.b);
                    break;
                }
                case 1: 
                case 7: {
                    arrayList0.remove(fragmentTransaction$Op0.b);
                    break;
                }
                case 8: {
                    fragment0 = null;
                    break;
                }
                case 9: {
                    fragment0 = fragmentTransaction$Op0.b;
                    break;
                }
                case 10: {
                    fragmentTransaction$Op0.i = fragmentTransaction$Op0.h;
                }
            }
        }
        return fragment0;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public int e() {
        return this.l;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    public int getId() {
        return this.P;
    }

    @Override  // androidx.fragment.app.FragmentManager$BackStackEntry
    @Nullable
    public String getName() {
        return this.k;
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public int q() {
        return this.W(false);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public int r() {
        return this.W(true);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public void s() {
        this.w();
        this.N.k0(this, false);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    public void t() {
        this.w();
        this.N.k0(this, true);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("BackStackEntry{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        if(this.P >= 0) {
            stringBuilder0.append(" #");
            stringBuilder0.append(this.P);
        }
        if(this.k != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(this.k);
        }
        stringBuilder0.append("}");
        return stringBuilder0.toString();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction v(@NonNull Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.N) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment Fragment{642e05c0} (5e4a4562-4a19-4c71-9d9a-86960a6bd0a0) is already attached to a FragmentManager.");
        }
        return super.v(fragment0);
    }

    @Override  // androidx.fragment.app.FragmentTransaction
    void x(int v, Fragment fragment0, @Nullable String s, int v1) {
        super.x(v, fragment0, s, v1);
        fragment0.mFragmentManager = this.N;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.fragment.app.FragmentTransaction
    @NonNull
    public FragmentTransaction y(@NonNull Fragment fragment0) {
        if(fragment0.mFragmentManager != null && fragment0.mFragmentManager != this.N) {
            throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment Fragment{5dbe684e} (115878a4-9053-475a-8ff6-69ace2cd852b) is already attached to a FragmentManager.");
        }
        return super.y(fragment0);
    }
}

