package androidx.fragment.app.strictmode;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.collections.Y;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

public final class FragmentStrictMode {
    public static enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER;

        private static final Flag[] a() [...] // Inlined contents
    }

    public interface OnViolationListener {
        void a(@l Violation arg1);
    }

    public static final class Policy {
        public static final class Builder {
            @l
            private final Set a;
            @m
            private OnViolationListener b;
            @l
            private final Map c;

            public Builder() {
                this.a = new LinkedHashSet();
                this.c = new LinkedHashMap();
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder a(@l Class class0, @l Class class1) {
                L.p(class0, "fragmentClass");
                L.p(class1, "violationClass");
                String s = class0.getName();
                L.o(s, "fragmentClassString");
                return this.b(s, class1);
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder b(@l String s, @l Class class0) {
                L.p(s, "fragmentClass");
                L.p(class0, "violationClass");
                Set set0 = (Set)this.c.get(s);
                if(set0 == null) {
                    set0 = new LinkedHashSet();
                }
                set0.add(class0);
                this.c.put(s, set0);
                return this;
            }

            @l
            public final Policy c() {
                if(this.b == null && !this.a.contains(Flag.b)) {
                    this.l();
                }
                return new Policy(this.a, this.b, this.c);
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder d() {
                this.a.add(Flag.c);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder e() {
                this.a.add(Flag.d);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder f() {
                this.a.add(Flag.e);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder g() {
                this.a.add(Flag.f);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder h() {
                this.a.add(Flag.g);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder i() {
                this.a.add(Flag.h);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder j() {
                this.a.add(Flag.b);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder k(@l OnViolationListener fragmentStrictMode$OnViolationListener0) {
                L.p(fragmentStrictMode$OnViolationListener0, "listener");
                this.b = fragmentStrictMode$OnViolationListener0;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @l
            public final Builder l() {
                this.a.add(Flag.a);
                return this;
            }
        }

        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }
        }

        @l
        private final Set a;
        @m
        private final OnViolationListener b;
        @l
        private final Map c;
        @l
        public static final Companion d;
        @l
        @f
        public static final Policy e;

        static {
            Policy.d = new Companion(null);
            Policy.e = new Policy(k0.k(), null, Y.z());
        }

        public Policy(@l Set set0, @m OnViolationListener fragmentStrictMode$OnViolationListener0, @l Map map0) {
            L.p(set0, "flags");
            L.p(map0, "allowedViolations");
            super();
            this.a = set0;
            this.b = fragmentStrictMode$OnViolationListener0;
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object0: map0.entrySet()) {
                linkedHashMap0.put(((String)((Map.Entry)object0).getKey()), ((Set)((Map.Entry)object0).getValue()));
            }
            this.c = linkedHashMap0;
        }

        @l
        public final Set a() {
            return this.a;
        }

        @m
        public final OnViolationListener b() {
            return this.b;
        }

        @l
        public final Map c() {
            return this.c;
        }
    }

    @l
    public static final FragmentStrictMode a = null;
    @l
    private static final String b = "FragmentStrictMode";
    @l
    private static Policy c;

    static {
        FragmentStrictMode.a = new FragmentStrictMode();
        FragmentStrictMode.c = Policy.e;
    }

    @l
    public final Policy c() {
        return FragmentStrictMode.c;
    }

    private final Policy d(Fragment fragment0) {
        while(fragment0 != null) {
            if(fragment0.isAdded()) {
                FragmentManager fragmentManager0 = fragment0.getParentFragmentManager();
                L.o(fragmentManager0, "declaringFragment.parentFragmentManager");
                if(fragmentManager0.P0() != null) {
                    Policy fragmentStrictMode$Policy0 = fragmentManager0.P0();
                    L.m(fragmentStrictMode$Policy0);
                    return fragmentStrictMode$Policy0;
                }
            }
            fragment0 = fragment0.getParentFragment();
        }
        return FragmentStrictMode.c;
    }

    private final void e(Policy fragmentStrictMode$Policy0, Violation violation0) {
        Fragment fragment0 = violation0.a();
        String s = fragment0.getClass().getName();
        if(fragmentStrictMode$Policy0.a().contains(Flag.a)) {
            Log.d("FragmentStrictMode", "Policy violation in " + s, violation0);
        }
        if(fragmentStrictMode$Policy0.b() != null) {
            this.s(fragment0, () -> {
                L.p(fragmentStrictMode$Policy0, "$policy");
                L.p(violation0, "$violation");
                fragmentStrictMode$Policy0.b().a(violation0);
            });
        }
        if(fragmentStrictMode$Policy0.a().contains(Flag.b)) {
            this.s(fragment0, () -> {
                L.p(violation0, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + s, violation0);
                throw violation0;
            });
        }
    }

    // 检测为 Lambda 实现
    private static final void f(Policy fragmentStrictMode$Policy0, Violation violation0) [...]

    // 检测为 Lambda 实现
    private static final void g(String s, Violation violation0) [...]

    private final void h(Violation violation0) {
        if(FragmentManager.W0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation0.a().getClass().getName(), violation0);
        }
    }

    @RestrictTo({Scope.a})
    @n
    public static final void i(@l Fragment fragment0, @l String s) {
        L.p(fragment0, "fragment");
        L.p(s, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation0 = new FragmentReuseViolation(fragment0, s);
        FragmentStrictMode fragmentStrictMode0 = FragmentStrictMode.a;
        fragmentStrictMode0.h(fragmentReuseViolation0);
        Policy fragmentStrictMode$Policy0 = fragmentStrictMode0.d(fragment0);
        if(fragmentStrictMode$Policy0.a().contains(Flag.c) && fragmentStrictMode0.u(fragmentStrictMode$Policy0, fragment0.getClass(), fragmentReuseViolation0.getClass())) {
            fragmentStrictMode0.e(fragmentStrictMode$Policy0, fragmentReuseViolation0);
        }
    }

    @RestrictTo({Scope.a})
    @n
    public static final void j(@l Fragment fragment0, @m ViewGroup viewGroup0) {
        L.p(fragment0, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation0 = new FragmentTagUsageViolation(fragment0, viewGroup0);
        FragmentStrictMode fragmentStrictMode0 = FragmentStrictMode.a;
        fragmentStrictMode0.h(fragmentTagUsageViolation0);
        Policy fragmentStrictMode$Policy0 = fragmentStrictMode0.d(fragment0);
        if(fragmentStrictMode$Policy0.a().contains(Flag.d) && fragmentStrictMode0.u(fragmentStrictMode$Policy0, fragment0.getClass(), fragmentTagUsageViolation0.getClass())) {
            fragmentStrictMode0.e(fragmentStrictMode$Policy0, fragmentTagUsageViolation0);
        }
    }

    @RestrictTo({Scope.a})
    @n
    public static final void k(@l Fragment fragment0) {
        L.p(fragment0, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation0 = new GetRetainInstanceUsageViolation(fragment0);
        FragmentStrictMode fragmentStrictMode0 = FragmentStrictMode.a;
        fragmentStrictMode0.h(getRetainInstanceUsageViolation0);
        Policy fragmentStrictMode$Policy0 = fragmentStrictMode0.d(fragment0);
        if(fragmentStrictMode$Policy0.a().contains(Flag.e) && fragmentStrictMode0.u(fragmentStrictMode$Policy0, fragment0.getClass(), getRetainInstanceUsageViolation0.getClass())) {
            fragmentStrictMode0.e(fragmentStrictMode$Policy0, getRetainInstanceUsageViolation0);
        }
    }

    @RestrictTo({Scope.a})
    @n
    public static final void l(@l Fragment fragment0) {
        L.p(fragment0, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation0 = new GetTargetFragmentRequestCodeUsageViolation(fragment0);
        FragmentStrictMode fragmentStrictMode0 = FragmentStrictMode.a;
        fragmentStrictMode0.h(getTargetFragmentRequestCodeUsageViolation0);
        Policy fragmentStrictMode$Policy0 = fragmentStrictMode0.d(fragment0);
        if(fragmentStrictMode$Policy0.a().contains(Flag.g) && fragmentStrictMode0.u(fragmentStrictMode$Policy0, fragment0.getClass(), getTargetFragmentRequestCodeUsageViolation0.getClass())) {
            fragmentStrictMode0.e(fragmentStrictMode$Policy0, getTargetFragmentRequestCodeUsageViolation0);
        }
    }

    @RestrictTo({Scope.a})
    @n
    public static final void m(@l Fragment fragment0) {
        L.p(fragment0, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation0 = new GetTargetFragmentUsageViolation(fragment0);
        FragmentStrictMode fragmentStrictMode0 = FragmentStrictMode.a;
        fragmentStrictMode0.h(getTargetFragmentUsageViolation0);
        Policy fragmentStrictMode$Policy0 = fragmentStrictMode0.d(fragment0);
        if(fragmentStrictMode$Policy0.a().contains(Flag.g) && fragmentStrictMode0.u(fragmentStrictMode$Policy0, fragment0.getClass(), getTargetFragmentUsageViolation0.getClass())) {
            fragmentStrictMode0.e(fragmentStrictMode$Policy0, getTargetFragmentUsageViolation0);
        }
    }

    @VisibleForTesting
    public final void n(@l Violation violation0) {
        L.p(violation0, "violation");
        this.h(violation0);
        Fragment fragment0 = violation0.a();
        Policy fragmentStrictMode$Policy0 = this.d(fragment0);
        if(this.u(fragmentStrictMode$Policy0, fragment0.getClass(), violation0.getClass())) {
            this.e(fragmentStrictMode$Policy0, violation0);
        }
    }

    @RestrictTo({Scope.a})
    @n
    public static final void o(@l Fragment fragment0) {
        L.p(fragment0, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation0 = new SetRetainInstanceUsageViolation(fragment0);
        FragmentStrictMode fragmentStrictMode0 = FragmentStrictMode.a;
        fragmentStrictMode0.h(setRetainInstanceUsageViolation0);
        Policy fragmentStrictMode$Policy0 = fragmentStrictMode0.d(fragment0);
        if(fragmentStrictMode$Policy0.a().contains(Flag.e) && fragmentStrictMode0.u(fragmentStrictMode$Policy0, fragment0.getClass(), setRetainInstanceUsageViolation0.getClass())) {
            fragmentStrictMode0.e(fragmentStrictMode$Policy0, setRetainInstanceUsageViolation0);
        }
    }

    @RestrictTo({Scope.a})
    @n
    public static final void p(@l Fragment fragment0, @l Fragment fragment1, int v) {
        L.p(fragment0, "violatingFragment");
        L.p(fragment1, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation0 = new SetTargetFragmentUsageViolation(fragment0, fragment1, v);
        FragmentStrictMode fragmentStrictMode0 = FragmentStrictMode.a;
        fragmentStrictMode0.h(setTargetFragmentUsageViolation0);
        Policy fragmentStrictMode$Policy0 = fragmentStrictMode0.d(fragment0);
        if(fragmentStrictMode$Policy0.a().contains(Flag.g) && fragmentStrictMode0.u(fragmentStrictMode$Policy0, fragment0.getClass(), setTargetFragmentUsageViolation0.getClass())) {
            fragmentStrictMode0.e(fragmentStrictMode$Policy0, setTargetFragmentUsageViolation0);
        }
    }

    @RestrictTo({Scope.a})
    @n
    public static final void q(@l Fragment fragment0, boolean z) {
        L.p(fragment0, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation0 = new SetUserVisibleHintViolation(fragment0, z);
        FragmentStrictMode fragmentStrictMode0 = FragmentStrictMode.a;
        fragmentStrictMode0.h(setUserVisibleHintViolation0);
        Policy fragmentStrictMode$Policy0 = fragmentStrictMode0.d(fragment0);
        if(fragmentStrictMode$Policy0.a().contains(Flag.f) && fragmentStrictMode0.u(fragmentStrictMode$Policy0, fragment0.getClass(), setUserVisibleHintViolation0.getClass())) {
            fragmentStrictMode0.e(fragmentStrictMode$Policy0, setUserVisibleHintViolation0);
        }
    }

    @RestrictTo({Scope.a})
    @n
    public static final void r(@l Fragment fragment0, @l ViewGroup viewGroup0) {
        L.p(fragment0, "fragment");
        L.p(viewGroup0, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation0 = new WrongFragmentContainerViolation(fragment0, viewGroup0);
        FragmentStrictMode fragmentStrictMode0 = FragmentStrictMode.a;
        fragmentStrictMode0.h(wrongFragmentContainerViolation0);
        Policy fragmentStrictMode$Policy0 = fragmentStrictMode0.d(fragment0);
        if(fragmentStrictMode$Policy0.a().contains(Flag.h) && fragmentStrictMode0.u(fragmentStrictMode$Policy0, fragment0.getClass(), wrongFragmentContainerViolation0.getClass())) {
            fragmentStrictMode0.e(fragmentStrictMode$Policy0, wrongFragmentContainerViolation0);
        }
    }

    private final void s(Fragment fragment0, Runnable runnable0) {
        if(fragment0.isAdded()) {
            Handler handler0 = fragment0.getParentFragmentManager().J0().g();
            L.o(handler0, "fragment.parentFragmentManager.host.handler");
            if(L.g(handler0.getLooper(), Looper.myLooper())) {
                runnable0.run();
                return;
            }
            handler0.post(runnable0);
            return;
        }
        runnable0.run();
    }

    public final void t(@l Policy fragmentStrictMode$Policy0) {
        L.p(fragmentStrictMode$Policy0, "<set-?>");
        FragmentStrictMode.c = fragmentStrictMode$Policy0;
    }

    private final boolean u(Policy fragmentStrictMode$Policy0, Class class0, Class class1) {
        Set set0 = (Set)fragmentStrictMode$Policy0.c().get(class0.getName());
        if(set0 == null) {
            return true;
        }
        return L.g(class1.getSuperclass(), Violation.class) || !u.W1(set0, class1.getSuperclass()) ? !set0.contains(class1) : false;
    }
}

