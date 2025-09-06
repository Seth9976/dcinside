package androidx.activity.result;

import A3.a;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.os.BundleCompat;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.w;
import kotlin.random.f;
import kotlin.sequences.p;
import y4.l;
import y4.m;

@s0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,447:1\n123#2,2:448\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry\n*L\n401#1:448,2\n*E\n"})
public abstract class ActivityResultRegistry {
    static final class CallbackAndContract {
        @l
        private final ActivityResultCallback a;
        @l
        private final ActivityResultContract b;

        public CallbackAndContract(@l ActivityResultCallback activityResultCallback0, @l ActivityResultContract activityResultContract0) {
            L.p(activityResultCallback0, "callback");
            L.p(activityResultContract0, "contract");
            super();
            this.a = activityResultCallback0;
            this.b = activityResultContract0;
        }

        @l
        public final ActivityResultCallback a() {
            return this.a;
        }

        @l
        public final ActivityResultContract b() {
            return this.b;
        }
    }

    static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @s0({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,447:1\n1855#2,2:448\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/result/ActivityResultRegistry$LifecycleContainer\n*L\n425#1:448,2\n*E\n"})
    static final class LifecycleContainer {
        @l
        private final Lifecycle a;
        @l
        private final List b;

        public LifecycleContainer(@l Lifecycle lifecycle0) {
            L.p(lifecycle0, "lifecycle");
            super();
            this.a = lifecycle0;
            this.b = new ArrayList();
        }

        public final void a(@l LifecycleEventObserver lifecycleEventObserver0) {
            L.p(lifecycleEventObserver0, "observer");
            this.a.a(lifecycleEventObserver0);
            this.b.add(lifecycleEventObserver0);
        }

        public final void b() {
            for(Object object0: this.b) {
                this.a.d(((LifecycleEventObserver)object0));
            }
            this.b.clear();
        }

        @l
        public final Lifecycle c() {
            return this.a;
        }
    }

    @l
    private final Map a;
    @l
    private final Map b;
    @l
    private final Map c;
    @l
    private final List d;
    @l
    private final transient Map e;
    @l
    private final Map f;
    @l
    private final Bundle g;
    @l
    private static final Companion h = null;
    @l
    private static final String i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";
    @l
    private static final String j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";
    @l
    private static final String k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";
    @l
    private static final String l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";
    @l
    private static final String m = "ActivityResultRegistry";
    private static final int n = 0x10000;

    static {
        ActivityResultRegistry.h = new Companion(null);
    }

    public ActivityResultRegistry() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashMap();
        this.g = new Bundle();
    }

    private final void d(int v, String s) {
        this.a.put(v, s);
        this.b.put(s, v);
    }

    @MainThread
    public final boolean e(int v, int v1, @m Intent intent0) {
        String s = (String)this.a.get(v);
        if(s == null) {
            return false;
        }
        this.g(s, v1, intent0, ((CallbackAndContract)this.e.get(s)));
        return true;
    }

    @MainThread
    public final boolean f(int v, Object object0) {
        String s = (String)this.a.get(v);
        if(s == null) {
            return false;
        }
        CallbackAndContract activityResultRegistry$CallbackAndContract0 = (CallbackAndContract)this.e.get(s);
        if((activityResultRegistry$CallbackAndContract0 == null ? null : activityResultRegistry$CallbackAndContract0.a()) == null) {
            this.g.remove(s);
            this.f.put(s, object0);
            return true;
        }
        ActivityResultCallback activityResultCallback0 = activityResultRegistry$CallbackAndContract0.a();
        L.n(activityResultCallback0, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if(this.d.remove(s)) {
            activityResultCallback0.a(object0);
        }
        return true;
    }

    private final void g(String s, int v, Intent intent0, CallbackAndContract activityResultRegistry$CallbackAndContract0) {
        if((activityResultRegistry$CallbackAndContract0 == null ? null : activityResultRegistry$CallbackAndContract0.a()) != null && this.d.contains(s)) {
            activityResultRegistry$CallbackAndContract0.a().a(activityResultRegistry$CallbackAndContract0.b().c(v, intent0));
            this.d.remove(s);
            return;
        }
        this.f.remove(s);
        ActivityResult activityResult0 = new ActivityResult(v, intent0);
        this.g.putParcelable(s, activityResult0);
    }

    private final int h() {
        for(Object object0: p.l(androidx.activity.result.ActivityResultRegistry.generateRandomNumber.1.e)) {
            Number number0 = (Number)object0;
            if(!this.a.containsKey(number0.intValue())) {
                return number0.intValue();
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");

        final class androidx.activity.result.ActivityResultRegistry.generateRandomNumber.1 extends N implements a {
            public static final androidx.activity.result.ActivityResultRegistry.generateRandomNumber.1 e;

            static {
                androidx.activity.result.ActivityResultRegistry.generateRandomNumber.1.e = new androidx.activity.result.ActivityResultRegistry.generateRandomNumber.1();
            }

            androidx.activity.result.ActivityResultRegistry.generateRandomNumber.1() {
                super(0);
            }

            @m
            public final Integer b() {
                return (int)(f.a.m(0x7FFF0000) + 0x10000);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        }

    }

    @MainThread
    public abstract void i(int arg1, @l ActivityResultContract arg2, Object arg3, @m ActivityOptionsCompat arg4);

    public final void j(@m Bundle bundle0) {
        if(bundle0 == null) {
            return;
        }
        ArrayList arrayList0 = bundle0.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList arrayList1 = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if(arrayList1 != null && arrayList0 != null) {
            ArrayList arrayList2 = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if(arrayList2 != null) {
                this.d.addAll(arrayList2);
            }
            Bundle bundle1 = bundle0.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if(bundle1 != null) {
                this.g.putAll(bundle1);
            }
            int v = arrayList1.size();
            for(int v1 = 0; v1 < v; ++v1) {
                String s = (String)arrayList1.get(v1);
                if(this.b.containsKey(s)) {
                    Integer integer0 = (Integer)this.b.remove(s);
                    if(!this.g.containsKey(s)) {
                        v0.k(this.a).remove(integer0);
                    }
                }
                Object object0 = arrayList0.get(v1);
                L.o(object0, "rcs[i]");
                Object object1 = arrayList1.get(v1);
                L.o(object1, "keys[i]");
                this.d(((Number)object0).intValue(), ((String)object1));
            }
        }
    }

    public final void k(@l Bundle bundle0) {
        L.p(bundle0, "outState");
        bundle0.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.b.values()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.b.keySet()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.d));
        bundle0.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.g));
    }

    @l
    public final ActivityResultLauncher l(@l String s, @l ActivityResultContract activityResultContract0, @l ActivityResultCallback activityResultCallback0) {
        L.p(s, "key");
        L.p(activityResultContract0, "contract");
        L.p(activityResultCallback0, "callback");
        this.o(s);
        CallbackAndContract activityResultRegistry$CallbackAndContract0 = new CallbackAndContract(activityResultCallback0, activityResultContract0);
        this.e.put(s, activityResultRegistry$CallbackAndContract0);
        if(this.f.containsKey(s)) {
            Object object0 = this.f.get(s);
            this.f.remove(s);
            activityResultCallback0.a(object0);
        }
        ActivityResult activityResult0 = (ActivityResult)BundleCompat.b(this.g, s, ActivityResult.class);
        if(activityResult0 != null) {
            this.g.remove(s);
            activityResultCallback0.a(activityResultContract0.c(activityResult0.c(), activityResult0.a()));
        }
        return new ActivityResultLauncher() {
            @Override  // androidx.activity.result.ActivityResultLauncher
            @l
            public ActivityResultContract a() {
                return this.c;
            }

            @Override  // androidx.activity.result.ActivityResultLauncher
            public void c(Object object0, @m ActivityOptionsCompat activityOptionsCompat0) {
                Object object1 = s.b.get(activityResultContract0);
                ActivityResultContract activityResultContract0 = this.c;
                if(object1 != null) {
                    int v = ((Number)object1).intValue();
                    s.d.add(activityResultContract0);
                    try {
                        s.i(v, this.c, object0, activityOptionsCompat0);
                        return;
                    }
                    catch(Exception exception0) {
                        s.d.remove(activityResultContract0);
                        throw exception0;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract0 + " and input " + object0 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }

            @Override  // androidx.activity.result.ActivityResultLauncher
            public void d() {
                s.p(activityResultContract0);
            }
        };
    }

    @l
    public final ActivityResultLauncher m(@l String s, @l LifecycleOwner lifecycleOwner0, @l ActivityResultContract activityResultContract0, @l ActivityResultCallback activityResultCallback0) {
        L.p(s, "key");
        L.p(lifecycleOwner0, "lifecycleOwner");
        L.p(activityResultContract0, "contract");
        L.p(activityResultCallback0, "callback");
        Lifecycle lifecycle0 = lifecycleOwner0.getLifecycle();
        if(lifecycle0.b().b(State.d)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner0 + " is attempting to register while current state is " + lifecycle0.b() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        this.o(s);
        LifecycleContainer activityResultRegistry$LifecycleContainer0 = (LifecycleContainer)this.c.get(s);
        if(activityResultRegistry$LifecycleContainer0 == null) {
            activityResultRegistry$LifecycleContainer0 = new LifecycleContainer(lifecycle0);
        }
        activityResultRegistry$LifecycleContainer0.a((LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) -> {
            L.p(this, "this$0");
            L.p(s, "$key");
            L.p(activityResultCallback0, "$callback");
            L.p(activityResultContract0, "$contract");
            L.p(lifecycleOwner0, "<anonymous parameter 0>");
            L.p(lifecycle$Event0, "event");
            if(Event.ON_START == lifecycle$Event0) {
                CallbackAndContract activityResultRegistry$CallbackAndContract0 = new CallbackAndContract(activityResultCallback0, activityResultContract0);
                this.e.put(s, activityResultRegistry$CallbackAndContract0);
                if(this.f.containsKey(s)) {
                    Object object0 = this.f.get(s);
                    this.f.remove(s);
                    activityResultCallback0.a(object0);
                }
                ActivityResult activityResult0 = (ActivityResult)BundleCompat.b(this.g, s, ActivityResult.class);
                if(activityResult0 != null) {
                    this.g.remove(s);
                    activityResultCallback0.a(activityResultContract0.c(activityResult0.c(), activityResult0.a()));
                }
            }
            else {
                if(Event.ON_STOP == lifecycle$Event0) {
                    this.e.remove(s);
                    return;
                }
                if(Event.ON_DESTROY == lifecycle$Event0) {
                    this.p(s);
                }
            }
        });
        this.c.put(s, activityResultRegistry$LifecycleContainer0);
        return new ActivityResultLauncher() {
            @Override  // androidx.activity.result.ActivityResultLauncher
            @l
            public ActivityResultContract a() {
                return this.c;
            }

            @Override  // androidx.activity.result.ActivityResultLauncher
            public void c(Object object0, @m ActivityOptionsCompat activityOptionsCompat0) {
                Object object1 = s.b.get(activityResultContract0);
                ActivityResultContract activityResultContract0 = this.c;
                if(object1 != null) {
                    int v = ((Number)object1).intValue();
                    s.d.add(activityResultContract0);
                    try {
                        s.i(v, this.c, object0, activityOptionsCompat0);
                        return;
                    }
                    catch(Exception exception0) {
                        s.d.remove(activityResultContract0);
                        throw exception0;
                    }
                }
                throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract0 + " and input " + object0 + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
            }

            @Override  // androidx.activity.result.ActivityResultLauncher
            public void d() {
                s.p(activityResultContract0);
            }
        };
    }

    // 检测为 Lambda 实现
    private static final void n(ActivityResultRegistry activityResultRegistry0, String s, ActivityResultCallback activityResultCallback0, ActivityResultContract activityResultContract0, LifecycleOwner lifecycleOwner0, Event lifecycle$Event0) [...]

    private final void o(String s) {
        if(((Integer)this.b.get(s)) != null) {
            return;
        }
        this.d(this.h(), s);
    }

    @MainThread
    public final void p(@l String s) {
        L.p(s, "key");
        if(!this.d.contains(s)) {
            Integer integer0 = (Integer)this.b.remove(s);
            if(integer0 != null) {
                this.a.remove(integer0);
            }
        }
        this.e.remove(s);
        if(this.f.containsKey(s)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + s + ": " + this.f.get(s));
            this.f.remove(s);
        }
        if(this.g.containsKey(s)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + s + ": " + ((ActivityResult)BundleCompat.b(this.g, s, ActivityResult.class)));
            this.g.remove(s);
        }
        LifecycleContainer activityResultRegistry$LifecycleContainer0 = (LifecycleContainer)this.c.get(s);
        if(activityResultRegistry$LifecycleContainer0 != null) {
            activityResultRegistry$LifecycleContainer0.b();
            this.c.remove(s);
        }
    }
}

