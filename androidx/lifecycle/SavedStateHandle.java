package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.V;
import kotlin.collections.Y;
import kotlin.collections.k0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nSavedStateHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,450:1\n361#2,3:451\n364#2,4:455\n1#3:454\n*S KotlinDebug\n*F\n+ 1 SavedStateHandle.kt\nandroidx/lifecycle/SavedStateHandle\n*L\n198#1:451,3\n198#1:455,4\n*E\n"})
public final class SavedStateHandle {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @RestrictTo({Scope.b})
        @l
        @n
        public final SavedStateHandle a(@m Bundle bundle0, @m Bundle bundle1) {
            if(bundle0 == null) {
                if(bundle1 == null) {
                    return new SavedStateHandle();
                }
                HashMap hashMap0 = new HashMap();
                for(Object object0: bundle1.keySet()) {
                    L.o(((String)object0), "key");
                    hashMap0.put(((String)object0), bundle1.get(((String)object0)));
                }
                return new SavedStateHandle(hashMap0);
            }
            ArrayList arrayList0 = bundle0.getParcelableArrayList("keys");
            ArrayList arrayList1 = bundle0.getParcelableArrayList("values");
            if(arrayList0 == null || arrayList1 == null || arrayList0.size() != arrayList1.size()) {
                throw new IllegalStateException("Invalid bundle passed as restored state");
            }
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                Object object1 = arrayList0.get(v1);
                L.n(object1, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap0.put(((String)object1), arrayList1.get(v1));
            }
            return new SavedStateHandle(linkedHashMap0);
        }

        @RestrictTo({Scope.b})
        public final boolean b(@m Object object0) {
            if(object0 == null) {
                return true;
            }
            Class[] arr_class = SavedStateHandle.i;
            for(int v = 0; v < arr_class.length; ++v) {
                Class class0 = arr_class[v];
                L.m(class0);
                if(class0.isInstance(object0)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final class SavingStateLiveData extends MutableLiveData {
        @l
        private String m;
        @m
        private SavedStateHandle n;

        public SavingStateLiveData(@m SavedStateHandle savedStateHandle0, @l String s) {
            L.p(s, "key");
            super();
            this.m = s;
            this.n = savedStateHandle0;
        }

        public SavingStateLiveData(@m SavedStateHandle savedStateHandle0, @l String s, Object object0) {
            L.p(s, "key");
            super(object0);
            this.m = s;
            this.n = savedStateHandle0;
        }

        @Override  // androidx.lifecycle.MutableLiveData
        public void r(Object object0) {
            SavedStateHandle savedStateHandle0 = this.n;
            if(savedStateHandle0 != null) {
                savedStateHandle0.a.put(this.m, object0);
                E e0 = (E)savedStateHandle0.d.get(this.m);
                if(e0 != null) {
                    e0.setValue(object0);
                }
            }
            super.r(object0);
        }

        public final void s() {
            this.n = null;
        }
    }

    @l
    private final Map a;
    @l
    private final Map b;
    @l
    private final Map c;
    @l
    private final Map d;
    @l
    private final SavedStateProvider e;
    @l
    public static final Companion f = null;
    @l
    private static final String g = "values";
    @l
    private static final String h = "keys";
    @l
    private static final Class[] i;

    static {
        SavedStateHandle.f = new Companion(null);
        SavedStateHandle.i = new Class[]{Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    }

    public SavedStateHandle() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = () -> {
            L.p(this, "this$0");
            for(Object object0: Y.D0(this.b).entrySet()) {
                this.q(((String)((Map.Entry)object0).getKey()), ((SavedStateProvider)((Map.Entry)object0).getValue()).a());
            }
            Set set0 = this.a.keySet();
            ArrayList arrayList0 = new ArrayList(set0.size());
            ArrayList arrayList1 = new ArrayList(arrayList0.size());
            for(Object object1: set0) {
                arrayList0.add(((String)object1));
                arrayList1.add(this.a.get(((String)object1)));
            }
            return BundleKt.b(new V[]{r0.a("keys", arrayList0), r0.a("values", arrayList1)});
        };
    }

    public SavedStateHandle(@l Map map0) {
        L.p(map0, "initialState");
        super();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        this.a = linkedHashMap0;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = () -> {
            L.p(this, "this$0");
            for(Object object0: Y.D0(this.b).entrySet()) {
                this.q(((String)((Map.Entry)object0).getKey()), ((SavedStateProvider)((Map.Entry)object0).getValue()).a());
            }
            Set set0 = this.a.keySet();
            ArrayList arrayList0 = new ArrayList(set0.size());
            ArrayList arrayList1 = new ArrayList(arrayList0.size());
            for(Object object1: set0) {
                arrayList0.add(((String)object1));
                arrayList1.add(this.a.get(((String)object1)));
            }
            return BundleKt.b(new V[]{r0.a("keys", arrayList0), r0.a("values", arrayList1)});
        };
        linkedHashMap0.putAll(map0);
    }

    @MainThread
    public final void e(@l String s) {
        L.p(s, "key");
        this.b.remove(s);
    }

    @MainThread
    public final boolean f(@l String s) {
        L.p(s, "key");
        return this.a.containsKey(s);
    }

    @RestrictTo({Scope.b})
    @l
    @n
    public static final SavedStateHandle g(@m Bundle bundle0, @m Bundle bundle1) {
        return SavedStateHandle.f.a(bundle0, bundle1);
    }

    @MainThread
    @m
    public final Object h(@l String s) {
        L.p(s, "key");
        try {
            return this.a.get(s);
        }
        catch(ClassCastException unused_ex) {
            this.n(s);
            return null;
        }
    }

    @MainThread
    @l
    public final MutableLiveData i(@l String s) {
        L.p(s, "key");
        MutableLiveData mutableLiveData0 = this.k(s, false, null);
        L.n(mutableLiveData0, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        return mutableLiveData0;
    }

    @MainThread
    @l
    public final MutableLiveData j(@l String s, Object object0) {
        L.p(s, "key");
        return this.k(s, true, object0);
    }

    private final MutableLiveData k(String s, boolean z, Object object0) {
        MutableLiveData mutableLiveData1;
        Object object1 = this.c.get(s);
        MutableLiveData mutableLiveData0 = object1 instanceof MutableLiveData ? ((MutableLiveData)object1) : null;
        if(mutableLiveData0 != null) {
            return mutableLiveData0;
        }
        if(this.a.containsKey(s)) {
            mutableLiveData1 = new SavingStateLiveData(this, s, this.a.get(s));
        }
        else if(z) {
            this.a.put(s, object0);
            mutableLiveData1 = new SavingStateLiveData(this, s, object0);
        }
        else {
            mutableLiveData1 = new SavingStateLiveData(this, s);
        }
        this.c.put(s, mutableLiveData1);
        return mutableLiveData1;
    }

    @MainThread
    @l
    public final U l(@l String s, Object object0) {
        L.p(s, "key");
        Map map0 = this.d;
        E e0 = map0.get(s);
        if(e0 == null) {
            if(!this.a.containsKey(s)) {
                this.a.put(s, object0);
            }
            e0 = W.a(this.a.get(s));
            this.d.put(s, e0);
            map0.put(s, e0);
        }
        U u0 = k.m(e0);
        L.n(u0, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<T of androidx.lifecycle.SavedStateHandle.getStateFlow>");
        return u0;
    }

    @MainThread
    @l
    public final Set m() {
        return k0.C(k0.C(this.a.keySet(), this.b.keySet()), this.c.keySet());
    }

    @MainThread
    @m
    public final Object n(@l String s) {
        L.p(s, "key");
        Object object0 = this.a.remove(s);
        SavingStateLiveData savedStateHandle$SavingStateLiveData0 = (SavingStateLiveData)this.c.remove(s);
        if(savedStateHandle$SavingStateLiveData0 != null) {
            savedStateHandle$SavingStateLiveData0.s();
        }
        this.d.remove(s);
        return object0;
    }

    @RestrictTo({Scope.b})
    @l
    public final SavedStateProvider o() {
        return this.e;
    }

    // 检测为 Lambda 实现
    private static final Bundle p(SavedStateHandle savedStateHandle0) [...]

    @MainThread
    public final void q(@l String s, @m Object object0) {
        L.p(s, "key");
        if(SavedStateHandle.f.b(object0)) {
            Object object1 = this.c.get(s);
            MutableLiveData mutableLiveData0 = object1 instanceof MutableLiveData ? ((MutableLiveData)object1) : null;
            if(mutableLiveData0 == null) {
                this.a.put(s, object0);
            }
            else {
                mutableLiveData0.r(object0);
            }
            E e0 = (E)this.d.get(s);
            if(e0 != null) {
                e0.setValue(object0);
            }
            return;
        }
        L.m(object0);
        throw new IllegalArgumentException("Can\'t put value with type " + object0.getClass() + " into saved state");
    }

    @MainThread
    public final void r(@l String s, @l SavedStateProvider savedStateRegistry$SavedStateProvider0) {
        L.p(s, "key");
        L.p(savedStateRegistry$SavedStateProvider0, "provider");
        this.b.put(s, savedStateRegistry$SavedStateProvider0);
    }
}

