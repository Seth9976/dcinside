package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest.Builder;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.R.id;
import androidx.fragment.app.strictmode.FragmentStrictMode.Policy;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import j..util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import jeb.synthetic.FIN;

public abstract class FragmentManager implements FragmentResultOwner {
    public interface BackStackEntry {
        @Nullable
        @Deprecated
        CharSequence b();

        @Nullable
        @Deprecated
        CharSequence c();

        @StringRes
        @Deprecated
        int d();

        @StringRes
        @Deprecated
        int e();

        int getId();

        @Nullable
        String getName();
    }

    class ClearBackStackState implements OpGenerator {
        private final String a;
        final FragmentManager b;

        ClearBackStackState(@NonNull String s) {
            this.a = s;
        }

        @Override  // androidx.fragment.app.FragmentManager$OpGenerator
        public boolean a(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1) {
            return FragmentManager.this.z(arrayList0, arrayList1, this.a);
        }
    }

    static class FragmentIntentSenderContract extends ActivityResultContract {
        @Override  // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Intent a(@NonNull Context context0, Object object0) {
            return this.d(context0, ((IntentSenderRequest)object0));
        }

        @Override  // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public Object c(int v, @Nullable Intent intent0) {
            return this.e(v, intent0);
        }

        @NonNull
        public Intent d(@NonNull Context context0, IntentSenderRequest intentSenderRequest0) {
            Intent intent0 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent1 = intentSenderRequest0.a();
            if(intent1 != null) {
                Bundle bundle0 = intent1.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if(bundle0 != null) {
                    intent0.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
                    intent1.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if(intent1.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        intentSenderRequest0 = new Builder(intentSenderRequest0.e()).b(null).c(intentSenderRequest0.d(), intentSenderRequest0.c()).a();
                    }
                }
            }
            intent0.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest0);
            if(FragmentManager.W0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent0);
            }
            return intent0;
        }

        @NonNull
        public ActivityResult e(int v, @Nullable Intent intent0) {
            return new ActivityResult(v, intent0);
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
        @Deprecated
        public void a(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @Nullable Bundle bundle0) {
        }

        public void b(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @NonNull Context context0) {
        }

        public void c(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @Nullable Bundle bundle0) {
        }

        public void d(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void e(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void f(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void g(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @NonNull Context context0) {
        }

        public void h(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @Nullable Bundle bundle0) {
        }

        public void i(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void j(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @NonNull Bundle bundle0) {
        }

        public void k(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void l(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }

        public void m(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0, @NonNull View view0, @Nullable Bundle bundle0) {
        }

        public void n(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator CREATOR;
        String a;
        int b;

        static {
            LaunchedFragmentInfo.CREATOR = new Parcelable.Creator() {
                public LaunchedFragmentInfo a(Parcel parcel0) {
                    return new LaunchedFragmentInfo(parcel0);
                }

                public LaunchedFragmentInfo[] b(int v) {
                    return new LaunchedFragmentInfo[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.a(parcel0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.b(v);
                }
            };
        }

        LaunchedFragmentInfo(@NonNull Parcel parcel0) {
            this.a = parcel0.readString();
            this.b = parcel0.readInt();
        }

        LaunchedFragmentInfo(@NonNull String s, int v) {
            this.a = s;
            this.b = v;
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(Parcel parcel0, int v) {
            parcel0.writeString(this.a);
            parcel0.writeInt(this.b);
        }
    }

    static class LifecycleAwareResultListener implements FragmentResultListener {
        private final Lifecycle a;
        private final FragmentResultListener b;
        private final LifecycleEventObserver c;

        LifecycleAwareResultListener(@NonNull Lifecycle lifecycle0, @NonNull FragmentResultListener fragmentResultListener0, @NonNull LifecycleEventObserver lifecycleEventObserver0) {
            this.a = lifecycle0;
            this.b = fragmentResultListener0;
            this.c = lifecycleEventObserver0;
        }

        public boolean a(State lifecycle$State0) {
            return this.a.b().b(lifecycle$State0);
        }

        public void b() {
            this.a.d(this.c);
        }

        @Override  // androidx.fragment.app.FragmentResultListener
        public void e(@NonNull String s, @NonNull Bundle bundle0) {
            this.b.e(s, bundle0);
        }
    }

    public interface OnBackStackChangedListener {
        @MainThread
        void a();
    }

    interface OpGenerator {
        boolean a(@NonNull ArrayList arg1, @NonNull ArrayList arg2);
    }

    class PopBackStackState implements OpGenerator {
        final String a;
        final int b;
        final int c;
        final FragmentManager d;

        PopBackStackState(@Nullable String s, int v, int v1) {
            this.a = s;
            this.b = v;
            this.c = v1;
        }

        @Override  // androidx.fragment.app.FragmentManager$OpGenerator
        public boolean a(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1) {
            Fragment fragment0 = FragmentManager.this.y;
            return fragment0 == null || this.b >= 0 || this.a != null || !fragment0.getChildFragmentManager().v1() ? FragmentManager.this.z1(arrayList0, arrayList1, this.a, this.b, this.c) : false;
        }
    }

    class RestoreBackStackState implements OpGenerator {
        private final String a;
        final FragmentManager b;

        RestoreBackStackState(@NonNull String s) {
            this.a = s;
        }

        @Override  // androidx.fragment.app.FragmentManager$OpGenerator
        public boolean a(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1) {
            return FragmentManager.this.K1(arrayList0, arrayList1, this.a);
        }
    }

    class SaveBackStackState implements OpGenerator {
        private final String a;
        final FragmentManager b;

        SaveBackStackState(@NonNull String s) {
            this.a = s;
        }

        @Override  // androidx.fragment.app.FragmentManager$OpGenerator
        public boolean a(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1) {
            return FragmentManager.this.S1(arrayList0, arrayList1, this.a);
        }
    }

    private FragmentFactory A;
    private SpecialEffectsControllerFactory B;
    private SpecialEffectsControllerFactory C;
    private ActivityResultLauncher D;
    private ActivityResultLauncher E;
    private ActivityResultLauncher F;
    ArrayDeque G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private ArrayList M;
    private ArrayList N;
    private ArrayList O;
    private FragmentManagerViewModel P;
    private Policy Q;
    private Runnable R;
    static final String S = "android:support:fragments";
    static final String T = "state";
    static final String U = "result_";
    static final String V = "state";
    static final String W = "fragment_";
    private static boolean X = false;
    @RestrictTo({Scope.a})
    public static final String Y = "FragmentManager";
    public static final int Z = 1;
    private final ArrayList a;
    private static final String a0 = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    private boolean b;
    private final FragmentStore c;
    ArrayList d;
    private ArrayList e;
    private final FragmentLayoutInflaterFactory f;
    private OnBackPressedDispatcher g;
    private final OnBackPressedCallback h;
    private final AtomicInteger i;
    private final Map j;
    private final Map k;
    private final Map l;
    private ArrayList m;
    private final FragmentLifecycleCallbacksDispatcher n;
    private final CopyOnWriteArrayList o;
    private final Consumer p;
    private final Consumer q;
    private final Consumer r;
    private final Consumer s;
    private final MenuProvider t;
    int u;
    private FragmentHostCallback v;
    private FragmentContainer w;
    private Fragment x;
    @Nullable
    Fragment y;
    private FragmentFactory z;

    static {
    }

    public FragmentManager() {
        this.a = new ArrayList();
        this.c = new FragmentStore();
        this.f = new FragmentLayoutInflaterFactory(this);
        this.h = new OnBackPressedCallback(false) {
            final FragmentManager d;

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                FragmentManager.this.S0();
            }
        };
        this.i = new AtomicInteger();
        this.j = DesugarCollections.synchronizedMap(new HashMap());
        this.k = DesugarCollections.synchronizedMap(new HashMap());
        this.l = DesugarCollections.synchronizedMap(new HashMap());
        this.n = new FragmentLifecycleCallbacksDispatcher(this);
        this.o = new CopyOnWriteArrayList();
        this.p = (Configuration configuration0) -> if(this.Y0()) {
            this.H(configuration0, false);
        };
        this.q = (Integer integer0) -> if(this.Y0() && ((int)integer0) == 80) {
            this.N(false);
        };
        this.r = (MultiWindowModeChangedInfo multiWindowModeChangedInfo0) -> if(this.Y0()) {
            this.O(multiWindowModeChangedInfo0.b(), false);
        };
        this.s = (PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo0) -> if(this.Y0()) {
            this.V(pictureInPictureModeChangedInfo0.b(), false);
        };
        this.t = new MenuProvider() {
            final FragmentManager a;

            @Override  // androidx.core.view.MenuProvider
            public void a(@NonNull Menu menu0, @NonNull MenuInflater menuInflater0) {
                FragmentManager.this.K(menu0, menuInflater0);
            }

            @Override  // androidx.core.view.MenuProvider
            public void b(@NonNull Menu menu0) {
                FragmentManager.this.S(menu0);
            }

            @Override  // androidx.core.view.MenuProvider
            public void c(@NonNull Menu menu0) {
                FragmentManager.this.W(menu0);
            }

            @Override  // androidx.core.view.MenuProvider
            public boolean d(@NonNull MenuItem menuItem0) {
                return FragmentManager.this.R(menuItem0);
            }
        };
        this.u = -1;
        this.z = null;
        this.A = new FragmentFactory() {
            final FragmentManager b;

            @Override  // androidx.fragment.app.FragmentFactory
            @NonNull
            public Fragment a(@NonNull ClassLoader classLoader0, @NonNull String s) {
                return FragmentManager.this.J0().b(FragmentManager.this.J0().f(), s, null);
            }
        };
        this.B = null;
        this.C = new SpecialEffectsControllerFactory() {
            final FragmentManager a;

            @Override  // androidx.fragment.app.SpecialEffectsControllerFactory
            @NonNull
            public SpecialEffectsController a(@NonNull ViewGroup viewGroup0) {
                return new DefaultSpecialEffectsController(viewGroup0);
            }
        };
        this.G = new ArrayDeque();
        this.R = () -> {
            FragmentManager.this.i0(true);
            boolean z1 = false;
            while(FragmentManager.this.x0(FragmentManager.this.M, FragmentManager.this.N)) {
                try {
                    z1 = true;
                    FragmentManager.this.b = true;
                    FragmentManager.this.F1(FragmentManager.this.M, FragmentManager.this.N);
                }
                finally {
                    FragmentManager.this.x();
                }
            }
            FragmentManager.this.g2();
            FragmentManager.this.d0();
            FragmentManager.this.c.b();
            return z1;
        };
    }

    private void A() {
        boolean z;
        FragmentHostCallback fragmentHostCallback0 = this.v;
        if(fragmentHostCallback0 instanceof ViewModelStoreOwner) {
            z = this.c.q().m();
        }
        else {
            z = fragmentHostCallback0.f() instanceof Activity ? !((Activity)this.v.f()).isChangingConfigurations() : true;
        }
        if(z) {
            for(Object object0: this.j.values()) {
                for(Object object1: ((BackStackState)object0).a) {
                    this.c.q().e(((String)object1));
                }
            }
        }
    }

    @NonNull
    public BackStackEntry A0(int v) {
        return (BackStackEntry)this.d.get(v);
    }

    public void A1(@NonNull Bundle bundle0, @NonNull String s, @NonNull Fragment fragment0) {
        if(fragment0.mFragmentManager != this) {
            this.e2(new IllegalStateException("Fragment " + fragment0 + " is not currently in the FragmentManager"));
        }
        bundle0.putString(s, fragment0.mWho);
    }

    private Set B() {
        Set set0 = new HashSet();
        for(Object object0: this.c.l()) {
            ViewGroup viewGroup0 = ((FragmentStateManager)object0).k().mContainer;
            if(viewGroup0 != null) {
                set0.add(SpecialEffectsController.o(viewGroup0, this.O0()));
            }
        }
        return set0;
    }

    public int B0() {
        return this.d == null ? 0 : this.d.size();
    }

    public void B1(@NonNull FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks0, boolean z) {
        this.n.o(fragmentManager$FragmentLifecycleCallbacks0, z);
    }

    private Set C(@NonNull ArrayList arrayList0, int v, int v1) {
        Set set0 = new HashSet();
        while(v < v1) {
            for(Object object0: ((BackStackRecord)arrayList0.get(v)).c) {
                Fragment fragment0 = ((Op)object0).b;
                if(fragment0 != null) {
                    ViewGroup viewGroup0 = fragment0.mContainer;
                    if(viewGroup0 != null) {
                        set0.add(SpecialEffectsController.n(viewGroup0, this));
                    }
                }
            }
            ++v;
        }
        return set0;
    }

    @NonNull
    private FragmentManagerViewModel C0(@NonNull Fragment fragment0) {
        return this.P.h(fragment0);
    }

    void C1(@NonNull Fragment fragment0) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "remove: " + fragment0 + " nesting=" + fragment0.mBackStackNesting);
        }
        boolean z = fragment0.isInBackStack();
        if(!fragment0.mDetached || !z) {
            this.c.v(fragment0);
            if(this.X0(fragment0)) {
                this.H = true;
            }
            fragment0.mRemoving = true;
            this.b2(fragment0);
        }
    }

    @NonNull
    FragmentStateManager D(@NonNull Fragment fragment0) {
        FragmentStateManager fragmentStateManager0 = this.c.o(fragment0.mWho);
        if(fragmentStateManager0 != null) {
            return fragmentStateManager0;
        }
        FragmentStateManager fragmentStateManager1 = new FragmentStateManager(this.n, this.c, fragment0);
        fragmentStateManager1.o(this.v.f().getClassLoader());
        fragmentStateManager1.u(this.u);
        return fragmentStateManager1;
    }

    @NonNull
    FragmentContainer D0() {
        return this.w;
    }

    public void D1(@NonNull FragmentOnAttachListener fragmentOnAttachListener0) {
        this.o.remove(fragmentOnAttachListener0);
    }

    void E(@NonNull Fragment fragment0) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "detach: " + fragment0);
        }
        if(!fragment0.mDetached) {
            fragment0.mDetached = true;
            if(fragment0.mAdded) {
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment0);
                }
                this.c.v(fragment0);
                if(this.X0(fragment0)) {
                    this.H = true;
                }
                this.b2(fragment0);
            }
        }
    }

    @Nullable
    public Fragment E0(@NonNull Bundle bundle0, @NonNull String s) {
        String s1 = bundle0.getString(s);
        if(s1 == null) {
            return null;
        }
        Fragment fragment0 = this.o0(s1);
        if(fragment0 == null) {
            this.e2(new IllegalStateException("Fragment no longer exists for key " + s + ": unique id " + s1));
        }
        return fragment0;
    }

    public void E1(@NonNull OnBackStackChangedListener fragmentManager$OnBackStackChangedListener0) {
        ArrayList arrayList0 = this.m;
        if(arrayList0 != null) {
            arrayList0.remove(fragmentManager$OnBackStackChangedListener0);
        }
    }

    void F() {
        this.I = false;
        this.J = false;
        this.P.p(false);
        this.a0(4);
    }

    private ViewGroup F0(@NonNull Fragment fragment0) {
        ViewGroup viewGroup0 = fragment0.mContainer;
        if(viewGroup0 != null) {
            return viewGroup0;
        }
        if(fragment0.mContainerId <= 0) {
            return null;
        }
        if(this.w.d()) {
            View view0 = this.w.c(fragment0.mContainerId);
            return view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
        }
        return null;
    }

    private void F1(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1) {
        if(arrayList0.isEmpty()) {
            return;
        }
        if(arrayList0.size() != arrayList1.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int v = arrayList0.size();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((BackStackRecord)arrayList0.get(v1)).r) {
                if(v2 != v1) {
                    this.m0(arrayList0, arrayList1, v2, v1);
                }
                v2 = v1 + 1;
                if(((Boolean)arrayList1.get(v1)).booleanValue()) {
                    while(v2 < v && ((Boolean)arrayList1.get(v2)).booleanValue() && !((BackStackRecord)arrayList0.get(v2)).r) {
                        ++v2;
                    }
                }
                this.m0(arrayList0, arrayList1, v1, v2);
                v1 = v2 - 1;
            }
        }
        if(v2 != v) {
            this.m0(arrayList0, arrayList1, v2, v);
        }
    }

    void G() {
        this.I = false;
        this.J = false;
        this.P.p(false);
        this.a0(0);
    }

    @NonNull
    public FragmentFactory G0() {
        FragmentFactory fragmentFactory0 = this.z;
        if(fragmentFactory0 != null) {
            return fragmentFactory0;
        }
        return this.x == null ? this.A : this.x.mFragmentManager.G0();
    }

    void G1(@NonNull Fragment fragment0) {
        this.P.n(fragment0);
    }

    void H(@NonNull Configuration configuration0, boolean z) {
        if(z && this.v instanceof OnConfigurationChangedProvider) {
            this.e2(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for(Object object0: this.c.p()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.performConfigurationChanged(configuration0);
                if(z) {
                    fragment0.mChildFragmentManager.H(configuration0, true);
                }
            }
        }
    }

    @NonNull
    FragmentStore H0() {
        return this.c;
    }

    private void H1() {
        if(this.m != null) {
            for(int v = 0; v < this.m.size(); ++v) {
                ((OnBackStackChangedListener)this.m.get(v)).a();
            }
        }
    }

    boolean I(@NonNull MenuItem menuItem0) {
        if(this.u < 1) {
            return false;
        }
        for(Object object0: this.c.p()) {
            if(((Fragment)object0) != null && ((Fragment)object0).performContextItemSelected(menuItem0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @NonNull
    public List I0() {
        return this.c.p();
    }

    void I1(@Nullable Parcelable parcelable0, @Nullable FragmentManagerNonConfig fragmentManagerNonConfig0) {
        if(this.v instanceof ViewModelStoreOwner) {
            this.e2(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.P.o(fragmentManagerNonConfig0);
        this.M1(parcelable0);
    }

    void J() {
        this.I = false;
        this.J = false;
        this.P.p(false);
        this.a0(1);
    }

    @NonNull
    @RestrictTo({Scope.a})
    public FragmentHostCallback J0() {
        return this.v;
    }

    public void J1(@NonNull String s) {
        this.h0((ArrayList arrayList0, ArrayList arrayList1) -> {
            boolean z;
            BackStackState backStackState0 = (BackStackState)FragmentManager.this.j.remove(s);
            if(backStackState0 == null) {
                return false;
            }
            HashMap hashMap0 = new HashMap();
            for(Object object0: arrayList0) {
                BackStackRecord backStackRecord0 = (BackStackRecord)object0;
                if(backStackRecord0.Q) {
                    for(Object object1: backStackRecord0.c) {
                        Fragment fragment0 = ((Op)object1).b;
                        if(fragment0 != null) {
                            hashMap0.put(fragment0.mWho, fragment0);
                        }
                    }
                }
            }
            Iterator iterator2 = backStackState0.a(FragmentManager.this, hashMap0).iterator();
        alab1:
            while(true) {
                for(z = false; true; z = true) {
                    if(!iterator2.hasNext()) {
                        break alab1;
                    }
                    Object object2 = iterator2.next();
                    if(!((BackStackRecord)object2).a(arrayList0, arrayList1) && !z) {
                        break;
                    }
                }
            }
            return z;
        }, false);
    }

    boolean K(@NonNull Menu menu0, @NonNull MenuInflater menuInflater0) {
        if(this.u < 1) {
            return false;
        }
        ArrayList arrayList0 = null;
        boolean z = false;
        for(Object object0: this.c.p()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && this.a1(fragment0) && fragment0.performCreateOptionsMenu(menu0, menuInflater0)) {
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                }
                arrayList0.add(fragment0);
                z = true;
            }
        }
        if(this.e != null) {
            for(int v = 0; v < this.e.size(); ++v) {
                boolean z1 = arrayList0 != null && arrayList0.contains(((Fragment)this.e.get(v)));
            }
        }
        this.e = arrayList0;
        return z;
    }

    @NonNull
    LayoutInflater.Factory2 K0() {
        return this.f;
    }

    // 检测为 Lambda 实现
    boolean K1(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1, @NonNull String s) [...]

    void L() {
        this.K = true;
        this.j0(true);
        this.g0();
        this.A();
        this.a0(-1);
        FragmentHostCallback fragmentHostCallback0 = this.v;
        if(fragmentHostCallback0 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider)fragmentHostCallback0).removeOnTrimMemoryListener(this.q);
        }
        FragmentHostCallback fragmentHostCallback1 = this.v;
        if(fragmentHostCallback1 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider)fragmentHostCallback1).removeOnConfigurationChangedListener(this.p);
        }
        FragmentHostCallback fragmentHostCallback2 = this.v;
        if(fragmentHostCallback2 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider)fragmentHostCallback2).removeOnMultiWindowModeChangedListener(this.r);
        }
        FragmentHostCallback fragmentHostCallback3 = this.v;
        if(fragmentHostCallback3 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider)fragmentHostCallback3).removeOnPictureInPictureModeChangedListener(this.s);
        }
        FragmentHostCallback fragmentHostCallback4 = this.v;
        if(fragmentHostCallback4 instanceof MenuHost) {
            ((MenuHost)fragmentHostCallback4).removeMenuProvider(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if(this.g != null) {
            this.h.k();
            this.g = null;
        }
        ActivityResultLauncher activityResultLauncher0 = this.D;
        if(activityResultLauncher0 != null) {
            activityResultLauncher0.d();
            this.E.d();
            this.F.d();
        }
    }

    @NonNull
    FragmentLifecycleCallbacksDispatcher L0() {
        return this.n;
    }

    void L1(@Nullable Parcelable parcelable0) {
        if(this.v instanceof SavedStateRegistryOwner) {
            this.e2(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        this.M1(parcelable0);
    }

    void M() {
        this.a0(1);
    }

    @Nullable
    Fragment M0() {
        return this.x;
    }

    void M1(@Nullable Parcelable parcelable0) {
        FragmentStateManager fragmentStateManager0;
        if(parcelable0 == null) {
            return;
        }
        for(Object object0: ((Bundle)parcelable0).keySet()) {
            String s = (String)object0;
            if(s.startsWith("result_")) {
                Bundle bundle0 = ((Bundle)parcelable0).getBundle(s);
                if(bundle0 != null) {
                    bundle0.setClassLoader(this.v.f().getClassLoader());
                    this.k.put(s.substring(7), bundle0);
                }
            }
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((Bundle)parcelable0).keySet()) {
            String s1 = (String)object1;
            if(s1.startsWith("fragment_")) {
                Bundle bundle1 = ((Bundle)parcelable0).getBundle(s1);
                if(bundle1 != null) {
                    bundle1.setClassLoader(this.v.f().getClassLoader());
                    arrayList0.add(((FragmentState)bundle1.getParcelable("state")));
                }
            }
        }
        this.c.y(arrayList0);
        FragmentManagerState fragmentManagerState0 = (FragmentManagerState)((Bundle)parcelable0).getParcelable("state");
        if(fragmentManagerState0 == null) {
            return;
        }
        this.c.w();
        for(Object object2: fragmentManagerState0.a) {
            FragmentState fragmentState0 = this.c.C(((String)object2), null);
            if(fragmentState0 != null) {
                Fragment fragment0 = this.P.g(fragmentState0.b);
                if(fragment0 == null) {
                    ClassLoader classLoader0 = this.v.f().getClassLoader();
                    FragmentFactory fragmentFactory0 = this.G0();
                    fragmentStateManager0 = new FragmentStateManager(this.n, this.c, classLoader0, fragmentFactory0, fragmentState0);
                }
                else {
                    if(FragmentManager.W0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment0);
                    }
                    fragmentStateManager0 = new FragmentStateManager(this.n, this.c, fragment0, fragmentState0);
                }
                Fragment fragment1 = fragmentStateManager0.k();
                fragment1.mFragmentManager = this;
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragment1.mWho + "): " + fragment1);
                }
                fragmentStateManager0.o(this.v.f().getClassLoader());
                this.c.s(fragmentStateManager0);
                fragmentStateManager0.u(this.u);
            }
        }
        for(Object object3: this.P.j()) {
            Fragment fragment2 = (Fragment)object3;
            if(!this.c.c(fragment2.mWho)) {
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment2 + " that was not found in the set of active Fragments " + fragmentManagerState0.a);
                }
                this.P.n(fragment2);
                fragment2.mFragmentManager = this;
                FragmentStateManager fragmentStateManager1 = new FragmentStateManager(this.n, this.c, fragment2);
                fragmentStateManager1.u(1);
                fragmentStateManager1.m();
                fragment2.mRemoving = true;
                fragmentStateManager1.m();
            }
        }
        this.c.x(fragmentManagerState0.b);
        if(fragmentManagerState0.c == null) {
            this.d = null;
        }
        else {
            this.d = new ArrayList(fragmentManagerState0.c.length);
            for(int v1 = 0; true; ++v1) {
                BackStackRecordState[] arr_backStackRecordState = fragmentManagerState0.c;
                if(v1 >= arr_backStackRecordState.length) {
                    break;
                }
                BackStackRecord backStackRecord0 = arr_backStackRecordState[v1].c(this);
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + v1 + " (index " + backStackRecord0.P + "): " + backStackRecord0);
                    PrintWriter printWriter0 = new PrintWriter(new LogWriter("FragmentManager"));
                    backStackRecord0.Y("  ", printWriter0, false);
                    printWriter0.close();
                }
                this.d.add(backStackRecord0);
            }
        }
        this.i.set(fragmentManagerState0.d);
        String s2 = fragmentManagerState0.e;
        if(s2 != null) {
            Fragment fragment3 = this.o0(s2);
            this.y = fragment3;
            this.T(fragment3);
        }
        ArrayList arrayList1 = fragmentManagerState0.f;
        if(arrayList1 != null) {
            for(int v = 0; v < arrayList1.size(); ++v) {
                String s3 = (String)arrayList1.get(v);
                BackStackState backStackState0 = (BackStackState)fragmentManagerState0.g.get(v);
                this.j.put(s3, backStackState0);
            }
        }
        this.G = new ArrayDeque(fragmentManagerState0.h);
    }

    void N(boolean z) {
        if(z && this.v instanceof OnTrimMemoryProvider) {
            this.e2(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for(Object object0: this.c.p()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.performLowMemory();
                if(z) {
                    fragment0.mChildFragmentManager.N(true);
                }
            }
        }
    }

    @Nullable
    public Fragment N0() {
        return this.y;
    }

    @Deprecated
    FragmentManagerNonConfig N1() {
        if(this.v instanceof ViewModelStoreOwner) {
            this.e2(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.P.k();
    }

    void O(boolean z, boolean z1) {
        if(z1 && this.v instanceof OnMultiWindowModeChangedProvider) {
            this.e2(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for(Object object0: this.c.p()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && z1) {
                fragment0.mChildFragmentManager.O(z, true);
            }
        }
    }

    @NonNull
    SpecialEffectsControllerFactory O0() {
        SpecialEffectsControllerFactory specialEffectsControllerFactory0 = this.B;
        if(specialEffectsControllerFactory0 != null) {
            return specialEffectsControllerFactory0;
        }
        return this.x == null ? this.C : this.x.mFragmentManager.O0();
    }

    static int O1(int v) {
        switch(v) {
            case 0x1003: {
                return 0x1003;
            }
            case 4100: {
                return 0x2005;
            }
            case 0x2002: {
                return 0x1001;
            }
            case 0x1001: 
            case 0x2005: {
                return 0x2002;
            }
            default: {
                return 0;
            }
        }
    }

    void P(@NonNull Fragment fragment0) {
        for(Object object0: this.o) {
            ((FragmentOnAttachListener)object0).a(this, fragment0);
        }
    }

    @Nullable
    public Policy P0() {
        return this.Q;
    }

    Parcelable P1() {
        if(this.v instanceof SavedStateRegistryOwner) {
            this.e2(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Parcelable parcelable0 = this.Q1();
        return ((BaseBundle)parcelable0).isEmpty() ? null : parcelable0;
    }

    void Q() {
        for(Object object0: this.c.m()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.onHiddenChanged(fragment0.isHidden());
                fragment0.mChildFragmentManager.Q();
            }
        }
    }

    @Nullable
    static Fragment Q0(@NonNull View view0) {
        Object object0 = view0.getTag(id.fragment_container_view_tag);
        return object0 instanceof Fragment ? ((Fragment)object0) : null;
    }

    @NonNull
    Bundle Q1() {
        BackStackRecordState[] arr_backStackRecordState;
        Bundle bundle0 = new Bundle();
        this.w0();
        this.g0();
        this.j0(true);
        this.I = true;
        this.P.p(true);
        ArrayList arrayList0 = this.c.z();
        ArrayList arrayList1 = this.c.n();
        if(!arrayList1.isEmpty()) {
            ArrayList arrayList2 = this.c.A();
            ArrayList arrayList3 = this.d;
            if(arrayList3 == null) {
                arr_backStackRecordState = null;
            }
            else {
                int v = arrayList3.size();
                if(v > 0) {
                    arr_backStackRecordState = new BackStackRecordState[v];
                    for(int v1 = 0; v1 < v; ++v1) {
                        arr_backStackRecordState[v1] = new BackStackRecordState(((BackStackRecord)this.d.get(v1)));
                        if(FragmentManager.W0(2)) {
                            Log.v("FragmentManager", "saveAllState: adding back stack #" + v1 + ": " + this.d.get(v1));
                        }
                    }
                }
                else {
                    arr_backStackRecordState = null;
                }
            }
            FragmentManagerState fragmentManagerState0 = new FragmentManagerState();
            fragmentManagerState0.a = arrayList0;
            fragmentManagerState0.b = arrayList2;
            fragmentManagerState0.c = arr_backStackRecordState;
            fragmentManagerState0.d = this.i.get();
            Fragment fragment0 = this.y;
            if(fragment0 != null) {
                fragmentManagerState0.e = fragment0.mWho;
            }
            fragmentManagerState0.f.addAll(this.j.keySet());
            fragmentManagerState0.g.addAll(this.j.values());
            fragmentManagerState0.h = new ArrayList(this.G);
            bundle0.putParcelable("state", fragmentManagerState0);
            for(Object object0: this.k.keySet()) {
                bundle0.putBundle("result_" + ((String)object0), ((Bundle)this.k.get(((String)object0))));
            }
            for(Object object1: arrayList1) {
                Bundle bundle1 = new Bundle();
                bundle1.putParcelable("state", ((FragmentState)object1));
                bundle0.putBundle("fragment_" + ((FragmentState)object1).b, bundle1);
            }
        }
        else if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle0;
        }
        return bundle0;
    }

    boolean R(@NonNull MenuItem menuItem0) {
        if(this.u < 1) {
            return false;
        }
        for(Object object0: this.c.p()) {
            if(((Fragment)object0) != null && ((Fragment)object0).performOptionsItemSelected(menuItem0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @NonNull
    ViewModelStore R0(@NonNull Fragment fragment0) {
        return this.P.l(fragment0);
    }

    public void R1(@NonNull String s) {
        this.h0((ArrayList arrayList0, ArrayList arrayList1) -> {
            String s1;
            int v = FragmentManager.this.p0(s, -1, true);
            if(v < 0) {
                return false;
            }
            for(int v1 = v; v1 < FragmentManager.this.d.size(); ++v1) {
                BackStackRecord backStackRecord0 = (BackStackRecord)FragmentManager.this.d.get(v1);
                if(!backStackRecord0.r) {
                    FragmentManager.this.e2(new IllegalArgumentException("saveBackStack(\"" + s + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + backStackRecord0 + " that did not use setReorderingAllowed(true)."));
                }
            }
            HashSet hashSet0 = new HashSet();
            for(int v2 = v; v2 < FragmentManager.this.d.size(); ++v2) {
                BackStackRecord backStackRecord1 = (BackStackRecord)FragmentManager.this.d.get(v2);
                HashSet hashSet1 = new HashSet();
                HashSet hashSet2 = new HashSet();
                for(Object object0: backStackRecord1.c) {
                    Op fragmentTransaction$Op0 = (Op)object0;
                    Fragment fragment0 = fragmentTransaction$Op0.b;
                    if(fragment0 != null) {
                        if(!fragmentTransaction$Op0.c || (fragmentTransaction$Op0.a == 1 || fragmentTransaction$Op0.a == 2 || fragmentTransaction$Op0.a == 8)) {
                            hashSet0.add(fragment0);
                            hashSet1.add(fragment0);
                        }
                        if(fragmentTransaction$Op0.a == 1 || fragmentTransaction$Op0.a == 2) {
                            hashSet2.add(fragment0);
                        }
                    }
                }
                hashSet1.removeAll(hashSet2);
                if(!hashSet1.isEmpty()) {
                    StringBuilder stringBuilder0 = new StringBuilder();
                    stringBuilder0.append("saveBackStack(\"");
                    stringBuilder0.append(s);
                    stringBuilder0.append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                    if(hashSet1.size() == 1) {
                        Object object1 = hashSet1.iterator().next();
                        s1 = " " + object1;
                    }
                    else {
                        s1 = "s " + hashSet1;
                    }
                    stringBuilder0.append(s1);
                    stringBuilder0.append(" in ");
                    stringBuilder0.append(backStackRecord1);
                    stringBuilder0.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                    FragmentManager.this.e2(new IllegalArgumentException(stringBuilder0.toString()));
                }
            }
            ArrayDeque arrayDeque0 = new ArrayDeque(hashSet0);
            while(!arrayDeque0.isEmpty()) {
                Fragment fragment1 = (Fragment)arrayDeque0.removeFirst();
                if(fragment1.mRetainInstance) {
                    FragmentManager.this.e2(new IllegalArgumentException("saveBackStack(\"" + s + "\") must not contain retained fragments. Found " + (hashSet0.contains(fragment1) ? "direct reference to retained " : "retained child ") + "fragment " + fragment1));
                }
                for(Object object2: fragment1.mChildFragmentManager.z0()) {
                    Fragment fragment2 = (Fragment)object2;
                    if(fragment2 != null) {
                        arrayDeque0.addLast(fragment2);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object3: hashSet0) {
                arrayList2.add(((Fragment)object3).mWho);
            }
            ArrayList arrayList3 = new ArrayList(FragmentManager.this.d.size() - v);
            for(int v3 = v; v3 < FragmentManager.this.d.size(); ++v3) {
                arrayList3.add(null);
            }
            BackStackState backStackState0 = new BackStackState(arrayList2, arrayList3);
            for(int v4 = FragmentManager.this.d.size() - 1; v4 >= v; --v4) {
                BackStackRecord backStackRecord2 = (BackStackRecord)FragmentManager.this.d.remove(v4);
                BackStackRecord backStackRecord3 = new BackStackRecord(backStackRecord2);
                backStackRecord3.V();
                arrayList3.set(v4 - v, new BackStackRecordState(backStackRecord3));
                backStackRecord2.Q = true;
                arrayList0.add(backStackRecord2);
                arrayList1.add(Boolean.TRUE);
            }
            FragmentManager.this.j.put(s, backStackState0);
            return true;
        }, false);
    }

    void S(@NonNull Menu menu0) {
        if(this.u < 1) {
            return;
        }
        for(Object object0: this.c.p()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.performOptionsMenuClosed(menu0);
            }
        }
    }

    void S0() {
        this.j0(true);
        if(this.h.j()) {
            this.v1();
            return;
        }
        this.g.p();
    }

    // 检测为 Lambda 实现
    boolean S1(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1, @NonNull String s) [...]

    private void T(@Nullable Fragment fragment0) {
        if(fragment0 != null && fragment0.equals(this.o0(fragment0.mWho))) {
            fragment0.performPrimaryNavigationFragmentChanged();
        }
    }

    void T0(@NonNull Fragment fragment0) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "hide: " + fragment0);
        }
        if(!fragment0.mHidden) {
            fragment0.mHidden = true;
            fragment0.mHiddenChanged ^= true;
            this.b2(fragment0);
        }
    }

    @Nullable
    public SavedState T1(@NonNull Fragment fragment0) {
        FragmentStateManager fragmentStateManager0 = this.c.o(fragment0.mWho);
        if(fragmentStateManager0 == null || !fragmentStateManager0.k().equals(fragment0)) {
            this.e2(new IllegalStateException("Fragment " + fragment0 + " is not currently in the FragmentManager"));
        }
        return fragmentStateManager0.r();
    }

    void U() {
        this.a0(5);
    }

    void U0(@NonNull Fragment fragment0) {
        if(fragment0.mAdded && this.X0(fragment0)) {
            this.H = true;
        }
    }

    void U1() {
        synchronized(this.a) {
            if(this.a.size() == 1) {
                this.v.g().removeCallbacks(this.R);
                this.v.g().post(this.R);
                this.g2();
            }
        }
    }

    void V(boolean z, boolean z1) {
        if(z1 && this.v instanceof OnPictureInPictureModeChangedProvider) {
            this.e2(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for(Object object0: this.c.p()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && z1) {
                fragment0.mChildFragmentManager.V(z, true);
            }
        }
    }

    public boolean V0() {
        return this.K;
    }

    void V1(@NonNull Fragment fragment0, boolean z) {
        ViewGroup viewGroup0 = this.F0(fragment0);
        if(viewGroup0 != null && viewGroup0 instanceof FragmentContainerView) {
            ((FragmentContainerView)viewGroup0).setDrawDisappearingViewsLast(!z);
        }
    }

    boolean W(@NonNull Menu menu0) {
        boolean z = false;
        if(this.u < 1) {
            return false;
        }
        for(Object object0: this.c.p()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null && this.a1(fragment0) && fragment0.performPrepareOptionsMenu(menu0)) {
                z = true;
            }
        }
        return z;
    }

    // 去混淆评级： 低(20)
    @RestrictTo({Scope.a})
    public static boolean W0(int v) {
        return FragmentManager.X || Log.isLoggable("FragmentManager", v);
    }

    public void W1(@NonNull FragmentFactory fragmentFactory0) {
        this.z = fragmentFactory0;
    }

    void X() {
        this.g2();
        this.T(this.y);
    }

    // 去混淆评级： 低(30)
    private boolean X0(@NonNull Fragment fragment0) {
        return fragment0.mHasMenu && fragment0.mMenuVisible || fragment0.mChildFragmentManager.v();
    }

    void X1(@NonNull Fragment fragment0, @NonNull State lifecycle$State0) {
        if(!fragment0.equals(this.o0(fragment0.mWho)) || fragment0.mHost != null && fragment0.mFragmentManager != this) {
            throw new IllegalArgumentException("Fragment " + fragment0 + " is not an active fragment of FragmentManager " + this);
        }
        fragment0.mMaxState = lifecycle$State0;
    }

    void Y() {
        this.I = false;
        this.J = false;
        this.P.p(false);
        this.a0(7);
    }

    // 去混淆评级： 低(30)
    private boolean Y0() {
        return this.x == null ? true : this.x.isAdded() && this.x.getParentFragmentManager().Y0();
    }

    void Y1(@Nullable Fragment fragment0) {
        if(fragment0 != null && (!fragment0.equals(this.o0(fragment0.mWho)) || fragment0.mHost != null && fragment0.mFragmentManager != this)) {
            throw new IllegalArgumentException("Fragment " + fragment0 + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment1 = this.y;
        this.y = fragment0;
        this.T(fragment1);
        this.T(this.y);
    }

    void Z() {
        this.I = false;
        this.J = false;
        this.P.p(false);
        this.a0(5);
    }

    boolean Z0(@Nullable Fragment fragment0) {
        return fragment0 == null ? false : fragment0.isHidden();
    }

    void Z1(@NonNull SpecialEffectsControllerFactory specialEffectsControllerFactory0) {
        this.B = specialEffectsControllerFactory0;
    }

    @Override  // androidx.fragment.app.FragmentResultOwner
    public final void a(@NonNull String s, @NonNull Bundle bundle0) {
        LifecycleAwareResultListener fragmentManager$LifecycleAwareResultListener0 = (LifecycleAwareResultListener)this.l.get(s);
        if(fragmentManager$LifecycleAwareResultListener0 == null || !fragmentManager$LifecycleAwareResultListener0.a(State.d)) {
            this.k.put(s, bundle0);
        }
        else {
            fragmentManager$LifecycleAwareResultListener0.e(s, bundle0);
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + s + " and result " + bundle0);
        }
    }

    private void a0(int v) {
        try {
            this.b = true;
            this.c.d(v);
            this.m1(v, false);
            for(Object object0: this.B()) {
                ((SpecialEffectsController)object0).j();
            }
        }
        finally {
            this.b = false;
        }
        this.j0(true);
    }

    boolean a1(@Nullable Fragment fragment0) {
        return fragment0 == null ? true : fragment0.isMenuVisible();
    }

    public void a2(@Nullable Policy fragmentStrictMode$Policy0) {
        this.Q = fragmentStrictMode$Policy0;
    }

    @Override  // androidx.fragment.app.FragmentResultOwner
    public final void b(@NonNull String s) {
        LifecycleAwareResultListener fragmentManager$LifecycleAwareResultListener0 = (LifecycleAwareResultListener)this.l.remove(s);
        if(fragmentManager$LifecycleAwareResultListener0 != null) {
            fragmentManager$LifecycleAwareResultListener0.b();
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Clearing FragmentResultListener for key " + s);
        }
    }

    void b0() {
        this.J = true;
        this.P.p(true);
        this.a0(4);
    }

    boolean b1(@Nullable Fragment fragment0) {
        if(fragment0 == null) {
            return true;
        }
        FragmentManager fragmentManager0 = fragment0.mFragmentManager;
        return fragment0.equals(fragmentManager0.N0()) && this.b1(fragmentManager0.x);
    }

    private void b2(@NonNull Fragment fragment0) {
        ViewGroup viewGroup0 = this.F0(fragment0);
        if(viewGroup0 != null && fragment0.getEnterAnim() + fragment0.getExitAnim() + fragment0.getPopEnterAnim() + fragment0.getPopExitAnim() > 0) {
            if(viewGroup0.getTag(id.visible_removing_fragment_view_tag) == null) {
                viewGroup0.setTag(0x7F0B108E, fragment0);  // id:visible_removing_fragment_view_tag
            }
            ((Fragment)viewGroup0.getTag(0x7F0B108E)).setPopDirection(fragment0.getPopDirection());  // id:visible_removing_fragment_view_tag
        }
    }

    @Override  // androidx.fragment.app.FragmentResultOwner
    @SuppressLint({"SyntheticAccessor"})
    public final void c(@NonNull String s, @NonNull LifecycleOwner lifecycleOwner0, @NonNull FragmentResultListener fragmentResultListener0) {
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        if(lifecycle0.b() == State.a) {
            return;
        }
        androidx.fragment.app.FragmentManager.6 fragmentManager$60 = new LifecycleEventObserver() {
            final FragmentManager d;

            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NonNull LifecycleOwner lifecycleOwner0, @NonNull Event lifecycle$Event0) {
                if(lifecycle$Event0 == Event.ON_START) {
                    Bundle bundle0 = (Bundle)FragmentManager.this.k.get(s);
                    if(bundle0 != null) {
                        fragmentResultListener0.e(s, bundle0);
                        FragmentManager.this.d(s);
                    }
                }
                if(lifecycle$Event0 == Event.ON_DESTROY) {
                    lifecycle0.d(this);
                    FragmentManager.this.l.remove(s);
                }
            }
        };
        lifecycle0.a(fragmentManager$60);
        LifecycleAwareResultListener fragmentManager$LifecycleAwareResultListener0 = new LifecycleAwareResultListener(lifecycle0, fragmentResultListener0, fragmentManager$60);
        LifecycleAwareResultListener fragmentManager$LifecycleAwareResultListener1 = (LifecycleAwareResultListener)this.l.put(s, fragmentManager$LifecycleAwareResultListener0);
        if(fragmentManager$LifecycleAwareResultListener1 != null) {
            fragmentManager$LifecycleAwareResultListener1.b();
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + s + " lifecycleOwner " + lifecycle0 + " and listener " + fragmentResultListener0);
        }
    }

    void c0() {
        this.a0(2);
    }

    boolean c1(int v) {
        return this.u >= v;
    }

    void c2(@NonNull Fragment fragment0) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "show: " + fragment0);
        }
        if(fragment0.mHidden) {
            fragment0.mHidden = false;
            fragment0.mHiddenChanged = !fragment0.mHiddenChanged;
        }
    }

    @Override  // androidx.fragment.app.FragmentResultOwner
    public final void d(@NonNull String s) {
        this.k.remove(s);
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "Clearing fragment result with key " + s);
        }
    }

    private void d0() {
        if(this.L) {
            this.L = false;
            this.d2();
        }
    }

    // 去混淆评级： 低(20)
    public boolean d1() {
        return this.I || this.J;
    }

    private void d2() {
        for(Object object0: this.c.l()) {
            this.q1(((FragmentStateManager)object0));
        }
    }

    public void e0(@NonNull String s, @Nullable FileDescriptor fileDescriptor0, @NonNull PrintWriter printWriter0, @Nullable String[] arr_s) {
        this.c.e(s, fileDescriptor0, printWriter0, arr_s);
        ArrayList arrayList0 = this.e;
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            if(v1 > 0) {
                printWriter0.print(s);
                printWriter0.println("Fragments Created Menus:");
                for(int v2 = 0; v2 < v1; ++v2) {
                    Fragment fragment0 = (Fragment)this.e.get(v2);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v2);
                    printWriter0.print(": ");
                    printWriter0.println("Fragment{410d554e} (77b91c2b-12d3-4220-913c-73409870b5e4)");
                }
            }
        }
        ArrayList arrayList1 = this.d;
        if(arrayList1 != null) {
            int v3 = arrayList1.size();
            if(v3 > 0) {
                printWriter0.print(s);
                printWriter0.println("Back Stack:");
                for(int v4 = 0; v4 < v3; ++v4) {
                    BackStackRecord backStackRecord0 = (BackStackRecord)this.d.get(v4);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v4);
                    printWriter0.print(": ");
                    printWriter0.println(backStackRecord0.toString());
                    backStackRecord0.X(s + "    ", printWriter0);
                }
            }
        }
        printWriter0.print(s);
        printWriter0.println("Back Stack Index: " + this.i.get());
        synchronized(this.a) {
            int v6 = this.a.size();
            if(v6 > 0) {
                printWriter0.print(s);
                printWriter0.println("Pending Actions:");
                for(int v = 0; v < v6; ++v) {
                    OpGenerator fragmentManager$OpGenerator0 = (OpGenerator)this.a.get(v);
                    printWriter0.print(s);
                    printWriter0.print("  #");
                    printWriter0.print(v);
                    printWriter0.print(": ");
                    printWriter0.println(fragmentManager$OpGenerator0);
                }
            }
        }
        printWriter0.print(s);
        printWriter0.println("FragmentManager misc state:");
        printWriter0.print(s);
        printWriter0.print("  mHost=");
        printWriter0.println(this.v);
        printWriter0.print(s);
        printWriter0.print("  mContainer=");
        printWriter0.println(this.w);
        if(this.x != null) {
            printWriter0.print(s);
            printWriter0.print("  mParent=");
            printWriter0.println(this.x);
        }
        printWriter0.print(s);
        printWriter0.print("  mCurState=");
        printWriter0.print(this.u);
        printWriter0.print(" mStateSaved=");
        printWriter0.print(this.I);
        printWriter0.print(" mStopped=");
        printWriter0.print(this.J);
        printWriter0.print(" mDestroyed=");
        printWriter0.println(this.K);
        if(this.H) {
            printWriter0.print(s);
            printWriter0.print("  mNeedMenuInvalidate=");
            printWriter0.println(this.H);
        }
    }

    // 检测为 Lambda 实现
    private Bundle e1() [...]

    private void e2(RuntimeException runtimeException0) {
        Log.e("FragmentManager", runtimeException0.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter0 = new PrintWriter(new LogWriter("FragmentManager"));
        FragmentHostCallback fragmentHostCallback0 = this.v;
        if(fragmentHostCallback0 == null) {
            try {
                this.e0("  ", null, printWriter0, new String[0]);
            }
            catch(Exception exception1) {
                Log.e("FragmentManager", "Failed dumping state", exception1);
            }
        }
        else {
            try {
                fragmentHostCallback0.h("  ", null, printWriter0, new String[0]);
            }
            catch(Exception exception0) {
                Log.e("FragmentManager", "Failed dumping state", exception0);
            }
        }
        throw runtimeException0;
    }

    @Deprecated
    public static void f0(boolean z) {
        FragmentManager.X = z;
    }

    // 检测为 Lambda 实现
    private void f1(Configuration configuration0) [...]

    public void f2(@NonNull FragmentLifecycleCallbacks fragmentManager$FragmentLifecycleCallbacks0) {
        this.n.p(fragmentManager$FragmentLifecycleCallbacks0);
    }

    private void g0() {
        for(Object object0: this.B()) {
            ((SpecialEffectsController)object0).j();
        }
    }

    // 检测为 Lambda 实现
    private void g1(Integer integer0) [...]

    private void g2() {
        boolean z = true;
        synchronized(this.a) {
            if(!this.a.isEmpty()) {
                this.h.m(true);
                return;
            }
        }
        OnBackPressedCallback onBackPressedCallback0 = this.h;
        if(this.B0() <= 0 || !this.b1(this.x)) {
            z = false;
        }
        onBackPressedCallback0.m(z);
    }

    void h0(@NonNull OpGenerator fragmentManager$OpGenerator0, boolean z) {
        if(!z) {
            if(this.v == null) {
                throw this.K ? new IllegalStateException("FragmentManager has been destroyed") : new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            this.w();
        }
        synchronized(this.a) {
            if(this.v == null) {
                if(!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                return;
            }
            this.a.add(fragmentManager$OpGenerator0);
            this.U1();
        }
    }

    // 检测为 Lambda 实现
    private void h1(MultiWindowModeChangedInfo multiWindowModeChangedInfo0) [...]

    private void i0(boolean z) {
        if(this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if(this.v == null) {
            throw this.K ? new IllegalStateException("FragmentManager has been destroyed") : new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        if(Looper.myLooper() != this.v.g().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if(!z) {
            this.w();
        }
        if(this.M == null) {
            this.M = new ArrayList();
            this.N = new ArrayList();
        }
    }

    // 检测为 Lambda 实现
    private void i1(PictureInPictureModeChangedInfo pictureInPictureModeChangedInfo0) [...]

    // 检测为 Lambda 实现
    boolean j0(boolean z) [...]

    void j1(@NonNull Fragment fragment0, @NonNull String[] arr_s, int v) {
        if(this.F != null) {
            LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = new LaunchedFragmentInfo(fragment0.mWho, v);
            this.G.addLast(fragmentManager$LaunchedFragmentInfo0);
            this.F.b(arr_s);
            return;
        }
        this.v.m(fragment0, arr_s, v);
    }

    void k0(@NonNull OpGenerator fragmentManager$OpGenerator0, boolean z) {
        if(z && (this.v == null || this.K)) {
            return;
        }
        this.i0(z);
        if(fragmentManager$OpGenerator0.a(this.M, this.N)) {
            try {
                this.b = true;
                this.F1(this.M, this.N);
            }
            finally {
                this.x();
            }
        }
        this.g2();
        this.d0();
        this.c.b();
    }

    void k1(@NonNull Fragment fragment0, @SuppressLint({"UnknownNullness"}) Intent intent0, int v, @Nullable Bundle bundle0) {
        if(this.D != null) {
            LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = new LaunchedFragmentInfo(fragment0.mWho, v);
            this.G.addLast(fragmentManager$LaunchedFragmentInfo0);
            if(intent0 != null && bundle0 != null) {
                intent0.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
            }
            this.D.b(intent0);
            return;
        }
        this.v.q(fragment0, intent0, v, bundle0);
    }

    private static void l0(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1, int v, int v1) {
        while(v < v1) {
            BackStackRecord backStackRecord0 = (BackStackRecord)arrayList0.get(v);
            if(((Boolean)arrayList1.get(v)).booleanValue()) {
                backStackRecord0.U(-1);
                backStackRecord0.a0();
            }
            else {
                backStackRecord0.U(1);
                backStackRecord0.Z();
            }
            ++v;
        }
    }

    void l1(@NonNull Fragment fragment0, @SuppressLint({"UnknownNullness"}) IntentSender intentSender0, int v, @Nullable Intent intent0, int v1, int v2, int v3, @Nullable Bundle bundle0) throws IntentSender.SendIntentException {
        Intent intent1;
        if(this.E != null) {
            if(bundle0 == null) {
                intent1 = intent0;
            }
            else {
                if(intent0 == null) {
                    intent1 = new Intent();
                    intent1.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                else {
                    intent1 = intent0;
                }
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle0 + " were added to fillInIntent " + intent1 + " for fragment " + fragment0);
                }
                intent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle0);
            }
            IntentSenderRequest intentSenderRequest0 = new Builder(intentSender0).b(intent1).c(v2, v1).a();
            LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = new LaunchedFragmentInfo(fragment0.mWho, v);
            this.G.addLast(fragmentManager$LaunchedFragmentInfo0);
            if(FragmentManager.W0(2)) {
                Log.v("FragmentManager", "Fragment " + fragment0 + "is launching an IntentSender for result ");
            }
            this.E.b(intentSenderRequest0);
            return;
        }
        this.v.r(fragment0, intentSender0, v, intent0, v1, v2, v3, bundle0);
    }

    void m(BackStackRecord backStackRecord0) {
        if(this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(backStackRecord0);
    }

    private void m0(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1, int v, int v1) {
        boolean z = ((BackStackRecord)arrayList0.get(v)).r;
        ArrayList arrayList2 = this.O;
        if(arrayList2 == null) {
            this.O = new ArrayList();
        }
        else {
            arrayList2.clear();
        }
        this.O.addAll(this.c.p());
        Fragment fragment0 = this.N0();
        int v2 = v;
        boolean z1 = false;
        while(v2 < v1) {
            BackStackRecord backStackRecord0 = (BackStackRecord)arrayList0.get(v2);
            fragment0 = ((Boolean)arrayList1.get(v2)).booleanValue() ? backStackRecord0.d0(this.O, fragment0) : backStackRecord0.b0(this.O, fragment0);
            z1 = z1 || backStackRecord0.i;
            ++v2;
        }
        this.O.clear();
        if(!z && this.u >= 1) {
            for(int v3 = v; v3 < v1; ++v3) {
                for(Object object0: ((BackStackRecord)arrayList0.get(v3)).c) {
                    Fragment fragment1 = ((Op)object0).b;
                    if(fragment1 != null && fragment1.mFragmentManager != null) {
                        FragmentStateManager fragmentStateManager0 = this.D(fragment1);
                        this.c.s(fragmentStateManager0);
                    }
                }
            }
        }
        FragmentManager.l0(arrayList0, arrayList1, v, v1);
        boolean z2 = ((Boolean)arrayList1.get(v1 - 1)).booleanValue();
        for(int v4 = v; v4 < v1; ++v4) {
            BackStackRecord backStackRecord1 = (BackStackRecord)arrayList0.get(v4);
            if(z2) {
                for(int v5 = backStackRecord1.c.size() - 1; v5 >= 0; --v5) {
                    Fragment fragment2 = ((Op)backStackRecord1.c.get(v5)).b;
                    if(fragment2 != null) {
                        this.D(fragment2).m();
                    }
                }
            }
            else {
                for(Object object1: backStackRecord1.c) {
                    Fragment fragment3 = ((Op)object1).b;
                    if(fragment3 != null) {
                        this.D(fragment3).m();
                    }
                }
            }
        }
        this.m1(this.u, true);
        for(Object object2: this.C(arrayList0, v, v1)) {
            ((SpecialEffectsController)object2).r(z2);
            ((SpecialEffectsController)object2).p();
            ((SpecialEffectsController)object2).g();
        }
        while(v < v1) {
            BackStackRecord backStackRecord2 = (BackStackRecord)arrayList0.get(v);
            if(((Boolean)arrayList1.get(v)).booleanValue() && backStackRecord2.P >= 0) {
                backStackRecord2.P = -1;
            }
            backStackRecord2.c0();
            ++v;
        }
        if(z1) {
            this.H1();
        }
    }

    void m1(int v, boolean z) {
        if(this.v == null && v != -1) {
            throw new IllegalStateException("No activity");
        }
        if(!z && v == this.u) {
            return;
        }
        this.u = v;
        this.c.u();
        this.d2();
        if(this.H) {
            FragmentHostCallback fragmentHostCallback0 = this.v;
            if(fragmentHostCallback0 != null && this.u == 7) {
                fragmentHostCallback0.s();
                this.H = false;
            }
        }
    }

    FragmentStateManager n(@NonNull Fragment fragment0) {
        String s = fragment0.mPreviousWho;
        if(s != null) {
            FragmentStrictMode.i(fragment0, s);
        }
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "add: " + fragment0);
        }
        FragmentStateManager fragmentStateManager0 = this.D(fragment0);
        fragment0.mFragmentManager = this;
        this.c.s(fragmentStateManager0);
        if(!fragment0.mDetached) {
            this.c.a(fragment0);
            fragment0.mRemoving = false;
            if(fragment0.mView == null) {
                fragment0.mHiddenChanged = false;
            }
            if(this.X0(fragment0)) {
                this.H = true;
            }
        }
        return fragmentStateManager0;
    }

    public boolean n0() {
        boolean z = this.j0(true);
        this.w0();
        return z;
    }

    void n1() {
        if(this.v == null) {
            return;
        }
        this.I = false;
        this.J = false;
        this.P.p(false);
        for(Object object0: this.c.p()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                fragment0.noteStateNotSaved();
            }
        }
    }

    public void o(@NonNull FragmentOnAttachListener fragmentOnAttachListener0) {
        this.o.add(fragmentOnAttachListener0);
    }

    @Nullable
    Fragment o0(@NonNull String s) {
        return this.c.f(s);
    }

    void o1(@NonNull FragmentContainerView fragmentContainerView0) {
        for(Object object0: this.c.l()) {
            FragmentStateManager fragmentStateManager0 = (FragmentStateManager)object0;
            Fragment fragment0 = fragmentStateManager0.k();
            if(fragment0.mContainerId == fragmentContainerView0.getId() && (fragment0.mView != null && fragment0.mView.getParent() == null)) {
                fragment0.mContainer = fragmentContainerView0;
                fragmentStateManager0.b();
            }
        }
    }

    public void p(@NonNull OnBackStackChangedListener fragmentManager$OnBackStackChangedListener0) {
        if(this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(fragmentManager$OnBackStackChangedListener0);
    }

    private int p0(@Nullable String s, int v, boolean z) {
        if(this.d != null && !this.d.isEmpty()) {
            if(s == null && v < 0) {
                return z ? 0 : this.d.size() - 1;
            }
            int v1;
            for(v1 = this.d.size() - 1; v1 >= 0; --v1) {
                BackStackRecord backStackRecord0 = (BackStackRecord)this.d.get(v1);
                if(s != null && s.equals(backStackRecord0.getName()) || v >= 0 && v == backStackRecord0.P) {
                    break;
                }
            }
            if(v1 < 0) {
                return v1;
            }
            if(z) {
                while(v1 > 0) {
                    BackStackRecord backStackRecord1 = (BackStackRecord)this.d.get(v1 - 1);
                    if((s == null || !s.equals(backStackRecord1.getName())) && (v < 0 || v != backStackRecord1.P)) {
                        break;
                    }
                    --v1;
                }
                return v1;
            }
            return v1 == this.d.size() - 1 ? -1 : v1 + 1;
        }
        return -1;
    }

    @NonNull
    @RestrictTo({Scope.c})
    @Deprecated
    public FragmentTransaction p1() {
        return this.u();
    }

    void q(@NonNull Fragment fragment0) {
        this.P.c(fragment0);
    }

    @NonNull
    public static Fragment q0(@NonNull View view0) {
        Fragment fragment0 = FragmentManager.v0(view0);
        if(fragment0 == null) {
            throw new IllegalStateException("View " + view0 + " does not have a Fragment set");
        }
        return fragment0;
    }

    void q1(@NonNull FragmentStateManager fragmentStateManager0) {
        Fragment fragment0 = fragmentStateManager0.k();
        if(fragment0.mDeferStart) {
            if(this.b) {
                this.L = true;
                return;
            }
            fragment0.mDeferStart = false;
            fragmentStateManager0.m();
        }
    }

    int r() {
        return this.i.getAndIncrement();
    }

    @Nullable
    public Fragment r0(@IdRes int v) {
        return this.c.g(v);
    }

    public void r1() {
        this.h0(new PopBackStackState(this, null, -1, 0), false);
    }

    @SuppressLint({"SyntheticAccessor"})
    void s(@NonNull FragmentHostCallback fragmentHostCallback0, @NonNull FragmentContainer fragmentContainer0, @Nullable Fragment fragment0) {
        if(this.v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.v = fragmentHostCallback0;
        this.w = fragmentContainer0;
        this.x = fragment0;
        if(fragment0 != null) {
            this.o(new FragmentOnAttachListener() {
                final FragmentManager b;

                @Override  // androidx.fragment.app.FragmentOnAttachListener
                public void a(@NonNull FragmentManager fragmentManager0, @NonNull Fragment fragment0) {
                }
            });
        }
        else if(fragmentHostCallback0 instanceof FragmentOnAttachListener) {
            this.o(((FragmentOnAttachListener)fragmentHostCallback0));
        }
        if(this.x != null) {
            this.g2();
        }
        if(fragmentHostCallback0 instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner0 = (OnBackPressedDispatcherOwner)fragmentHostCallback0;
            OnBackPressedDispatcher onBackPressedDispatcher0 = onBackPressedDispatcherOwner0.getOnBackPressedDispatcher();
            this.g = onBackPressedDispatcher0;
            if(fragment0 != null) {
                onBackPressedDispatcherOwner0 = fragment0;
            }
            onBackPressedDispatcher0.i(onBackPressedDispatcherOwner0, this.h);
        }
        if(fragment0 != null) {
            this.P = fragment0.mFragmentManager.C0(fragment0);
        }
        else if(fragmentHostCallback0 instanceof ViewModelStoreOwner) {
            this.P = FragmentManagerViewModel.i(((ViewModelStoreOwner)fragmentHostCallback0).getViewModelStore());
        }
        else {
            this.P = new FragmentManagerViewModel(false);
        }
        this.P.p(this.d1());
        this.c.B(this.P);
        FragmentHostCallback fragmentHostCallback1 = this.v;
        if(fragmentHostCallback1 instanceof SavedStateRegistryOwner && fragment0 == null) {
            SavedStateRegistry savedStateRegistry0 = ((SavedStateRegistryOwner)fragmentHostCallback1).getSavedStateRegistry();
            savedStateRegistry0.j("android:support:fragments", () -> this.Q1());
            Bundle bundle0 = savedStateRegistry0.b("android:support:fragments");
            if(bundle0 != null) {
                this.M1(bundle0);
            }
        }
        FragmentHostCallback fragmentHostCallback2 = this.v;
        if(fragmentHostCallback2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry0 = ((ActivityResultRegistryOwner)fragmentHostCallback2).getActivityResultRegistry();
            String s = fragment0 == null ? "" : fragment0.mWho + ":";
            this.D = activityResultRegistry0.l("FragmentManager:" + s + "StartActivityForResult", new StartActivityForResult(), new ActivityResultCallback() {
                final FragmentManager a;

                @Override  // androidx.activity.result.ActivityResultCallback
                public void a(Object object0) {
                    this.b(((ActivityResult)object0));
                }

                public void b(ActivityResult activityResult0) {
                    LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = (LaunchedFragmentInfo)FragmentManager.this.G.pollFirst();
                    if(fragmentManager$LaunchedFragmentInfo0 == null) {
                        Log.w("FragmentManager", "No Activities were started for result for " + this);
                        return;
                    }
                    String s = fragmentManager$LaunchedFragmentInfo0.a;
                    int v = fragmentManager$LaunchedFragmentInfo0.b;
                    Fragment fragment0 = FragmentManager.this.c.i(s);
                    if(fragment0 == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + s);
                        return;
                    }
                    fragment0.onActivityResult(v, activityResult0.c(), activityResult0.a());
                }
            });
            this.E = activityResultRegistry0.l("FragmentManager:" + s + "StartIntentSenderForResult", new FragmentIntentSenderContract(), new ActivityResultCallback() {
                final FragmentManager a;

                @Override  // androidx.activity.result.ActivityResultCallback
                public void a(Object object0) {
                    this.b(((ActivityResult)object0));
                }

                public void b(ActivityResult activityResult0) {
                    LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = (LaunchedFragmentInfo)FragmentManager.this.G.pollFirst();
                    if(fragmentManager$LaunchedFragmentInfo0 == null) {
                        Log.w("FragmentManager", "No IntentSenders were started for " + this);
                        return;
                    }
                    String s = fragmentManager$LaunchedFragmentInfo0.a;
                    int v = fragmentManager$LaunchedFragmentInfo0.b;
                    Fragment fragment0 = FragmentManager.this.c.i(s);
                    if(fragment0 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + s);
                        return;
                    }
                    fragment0.onActivityResult(v, activityResult0.c(), activityResult0.a());
                }
            });
            this.F = activityResultRegistry0.l("FragmentManager:" + s + "RequestPermissions", new RequestMultiplePermissions(), new ActivityResultCallback() {
                final FragmentManager a;

                @Override  // androidx.activity.result.ActivityResultCallback
                @SuppressLint({"SyntheticAccessor"})
                public void a(Object object0) {
                    this.b(((Map)object0));
                }

                @SuppressLint({"SyntheticAccessor"})
                public void b(Map map0) {
                    String[] arr_s = (String[])map0.keySet().toArray(new String[0]);
                    ArrayList arrayList0 = new ArrayList(map0.values());
                    int[] arr_v = new int[arrayList0.size()];
                    for(int v = 0; v < arrayList0.size(); ++v) {
                        arr_v[v] = ((Boolean)arrayList0.get(v)).booleanValue() ? 0 : -1;
                    }
                    LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo0 = (LaunchedFragmentInfo)FragmentManager.this.G.pollFirst();
                    if(fragmentManager$LaunchedFragmentInfo0 == null) {
                        Log.w("FragmentManager", "No permissions were requested for " + this);
                        return;
                    }
                    String s = fragmentManager$LaunchedFragmentInfo0.a;
                    int v1 = fragmentManager$LaunchedFragmentInfo0.b;
                    Fragment fragment0 = FragmentManager.this.c.i(s);
                    if(fragment0 == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + s);
                        return;
                    }
                    fragment0.onRequestPermissionsResult(v1, arr_s, arr_v);
                }
            });
        }
        FragmentHostCallback fragmentHostCallback3 = this.v;
        if(fragmentHostCallback3 instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider)fragmentHostCallback3).addOnConfigurationChangedListener(this.p);
        }
        FragmentHostCallback fragmentHostCallback4 = this.v;
        if(fragmentHostCallback4 instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider)fragmentHostCallback4).addOnTrimMemoryListener(this.q);
        }
        FragmentHostCallback fragmentHostCallback5 = this.v;
        if(fragmentHostCallback5 instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider)fragmentHostCallback5).addOnMultiWindowModeChangedListener(this.r);
        }
        FragmentHostCallback fragmentHostCallback6 = this.v;
        if(fragmentHostCallback6 instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider)fragmentHostCallback6).addOnPictureInPictureModeChangedListener(this.s);
        }
        FragmentHostCallback fragmentHostCallback7 = this.v;
        if(fragmentHostCallback7 instanceof MenuHost && fragment0 == null) {
            ((MenuHost)fragmentHostCallback7).addMenuProvider(this.t);
        }
    }

    @Nullable
    public Fragment s0(@Nullable String s) {
        return this.c.h(s);
    }

    public void s1(int v, int v1) {
        this.t1(v, v1, false);
    }

    void t(@NonNull Fragment fragment0) {
        if(FragmentManager.W0(2)) {
            Log.v("FragmentManager", "attach: " + fragment0);
        }
        if(fragment0.mDetached) {
            fragment0.mDetached = false;
            if(!fragment0.mAdded) {
                this.c.a(fragment0);
                if(FragmentManager.W0(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment0);
                }
                if(this.X0(fragment0)) {
                    this.H = true;
                }
            }
        }
    }

    Fragment t0(@NonNull String s) {
        return this.c.i(s);
    }

    void t1(int v, int v1, boolean z) {
        if(v < 0) {
            throw new IllegalArgumentException("Bad id: " + v);
        }
        this.h0(new PopBackStackState(this, null, v, v1), z);
    }

    @Override
    @NonNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(0x80);
        stringBuilder0.append("FragmentManager{");
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append(" in ");
        Fragment fragment0 = this.x;
        if(fragment0 == null) {
            FragmentHostCallback fragmentHostCallback0 = this.v;
            if(fragmentHostCallback0 == null) {
                stringBuilder0.append("null");
            }
            else {
                stringBuilder0.append(fragmentHostCallback0.getClass().getSimpleName());
                stringBuilder0.append("{");
                stringBuilder0.append(Integer.toHexString(System.identityHashCode(this.v)));
                stringBuilder0.append("}");
            }
        }
        else {
            stringBuilder0.append(fragment0.getClass().getSimpleName());
            stringBuilder0.append("{");
            stringBuilder0.append(Integer.toHexString(System.identityHashCode(this.x)));
            stringBuilder0.append("}");
        }
        stringBuilder0.append("}}");
        return stringBuilder0.toString();
    }

    @NonNull
    public FragmentTransaction u() {
        return new BackStackRecord(this);
    }

    @NonNull
    static FragmentManager u0(@NonNull View view0) {
        FragmentActivity fragmentActivity0;
        Fragment fragment0 = FragmentManager.v0(view0);
        if(fragment0 != null) {
            if(!fragment0.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragment0 + " that owns View " + view0 + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            return fragment0.getChildFragmentManager();
        }
        for(Context context0 = view0.getContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
            fragmentActivity0 = null;
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            if(context0 instanceof FragmentActivity) {
                fragmentActivity0 = (FragmentActivity)context0;
                break;
            }
        }
        if(fragmentActivity0 == null) {
            throw new IllegalStateException("View " + view0 + " is not within a subclass of FragmentActivity.");
        }
        return fragmentActivity0.getSupportFragmentManager();
    }

    public void u1(@Nullable String s, int v) {
        this.h0(new PopBackStackState(this, s, -1, v), false);
    }

    boolean v() {
        boolean z = false;
        for(Object object0: this.c.m()) {
            Fragment fragment0 = (Fragment)object0;
            if(fragment0 != null) {
                z = this.X0(fragment0);
            }
            if(z) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Nullable
    private static Fragment v0(@NonNull View view0) {
        while(view0 != null) {
            Fragment fragment0 = FragmentManager.Q0(view0);
            if(fragment0 != null) {
                return fragment0;
            }
            ViewParent viewParent0 = view0.getParent();
            view0 = viewParent0 instanceof View ? ((View)viewParent0) : null;
        }
        return null;
    }

    public boolean v1() {
        return this.y1(null, -1, 0);
    }

    private void w() {
        if(this.d1()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void w0() {
        for(Object object0: this.B()) {
            ((SpecialEffectsController)object0).k();
        }
    }

    public boolean w1(int v, int v1) {
        if(v < 0) {
            throw new IllegalArgumentException("Bad id: " + v);
        }
        return this.y1(null, v, v1);
    }

    private void x() {
        this.b = false;
        this.N.clear();
        this.M.clear();
    }

    private boolean x0(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1) {
        boolean z;
        int v2;
        synchronized(this.a) {
            if(this.a.isEmpty()) {
                return false;
            }
            v2 = FIN.finallyOpen$NT();
            int v3 = this.a.size();
            z = false;
            for(int v = 0; v < v3; ++v) {
                z |= ((OpGenerator)this.a.get(v)).a(arrayList0, arrayList1);
            }
            FIN.finallyCodeBegin$NT(v2);
            this.a.clear();
            this.v.g().removeCallbacks(this.R);
        }
        FIN.finallyCodeEnd$NT(v2);
        return z;
    }

    public boolean x1(@Nullable String s, int v) {
        return this.y1(s, -1, v);
    }

    public void y(@NonNull String s) {
        this.h0((ArrayList arrayList0, ArrayList arrayList1) -> (FragmentManager.this.K1(arrayList0, arrayList1, s) ? FragmentManager.this.z1(arrayList0, arrayList1, s, -1, 1) : false), false);
    }

    int y0() {
        return this.c.k();
    }

    private boolean y1(@Nullable String s, int v, int v1) {
        this.j0(false);
        this.i0(true);
        if(this.y != null && v < 0 && s == null && this.y.getChildFragmentManager().v1()) {
            return true;
        }
        boolean z = this.z1(this.M, this.N, s, v, v1);
        if(z) {
            try {
                this.b = true;
                this.F1(this.M, this.N);
            }
            finally {
                this.x();
            }
        }
        this.g2();
        this.d0();
        this.c.b();
        return z;
    }

    // 检测为 Lambda 实现
    boolean z(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1, @NonNull String s) [...]

    @NonNull
    List z0() {
        return this.c.m();
    }

    boolean z1(@NonNull ArrayList arrayList0, @NonNull ArrayList arrayList1, @Nullable String s, int v, int v1) {
        int v2 = this.p0(s, v, (v1 & 1) != 0);
        if(v2 < 0) {
            return false;
        }
        for(int v3 = this.d.size() - 1; v3 >= v2; --v3) {
            arrayList0.add(((BackStackRecord)this.d.remove(v3)));
            arrayList1.add(Boolean.TRUE);
        }
        return true;
    }

    class androidx.fragment.app.FragmentManager.5 implements Runnable {
        final FragmentManager a;

        @Override
        public void run() {
            FragmentManager.this.j0(true);
        }
    }

}

