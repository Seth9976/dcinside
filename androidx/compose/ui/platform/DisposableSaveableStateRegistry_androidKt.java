package androidx.compose.ui.platform;

import A3.a;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.R.id;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.v;
import y4.l;

@s0({"SMAP\nDisposableSaveableStateRegistry.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,190:1\n1855#2,2:191\n215#3,2:193\n*S KotlinDebug\n*F\n+ 1 DisposableSaveableStateRegistry.android.kt\nandroidx/compose/ui/platform/DisposableSaveableStateRegistry_androidKt\n*L\n172#1:191,2\n181#1:193,2\n*E\n"})
public final class DisposableSaveableStateRegistry_androidKt {
    @l
    private static final Class[] a;

    static {
        DisposableSaveableStateRegistry_androidKt.a = new Class[]{Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    }

    @l
    public static final DisposableSaveableStateRegistry a(@l View view0, @l SavedStateRegistryOwner savedStateRegistryOwner0) {
        L.p(view0, "view");
        L.p(savedStateRegistryOwner0, "owner");
        ViewParent viewParent0 = view0.getParent();
        L.n(viewParent0, "null cannot be cast to non-null type android.view.View");
        Object object0 = ((View)viewParent0).getTag(id.compose_view_saveable_id_tag);
        String s = object0 instanceof String ? ((String)object0) : null;
        if(s == null) {
            s = String.valueOf(((View)viewParent0).getId());
        }
        return DisposableSaveableStateRegistry_androidKt.b(s, savedStateRegistryOwner0);
    }

    @l
    public static final DisposableSaveableStateRegistry b(@l String s, @l SavedStateRegistryOwner savedStateRegistryOwner0) {
        L.p(s, "id");
        L.p(savedStateRegistryOwner0, "savedStateRegistryOwner");
        String s1 = "SaveableStateRegistry" + ':' + s;
        SavedStateRegistry savedStateRegistry0 = savedStateRegistryOwner0.getSavedStateRegistry();
        Bundle bundle0 = savedStateRegistry0.b(s1);
        SaveableStateRegistry saveableStateRegistry0 = SaveableStateRegistryKt.a((bundle0 == null ? null : DisposableSaveableStateRegistry_androidKt.g(bundle0)), androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1.e);
        try {
            savedStateRegistry0.j(s1, () -> {
                Bundle bundle0 = new Bundle();
                for(Object object0: this.a.c().entrySet()) {
                    String s = (String)((Map.Entry)object0).getKey();
                    List list0 = (List)((Map.Entry)object0).getValue();
                    bundle0.putParcelableArrayList(s, (list0 instanceof ArrayList ? ((ArrayList)list0) : new ArrayList(list0)));
                }
                return bundle0;
            });
            return new DisposableSaveableStateRegistry(saveableStateRegistry0, new a(true, savedStateRegistry0, s1) {
                final boolean e;
                final SavedStateRegistry f;
                final String g;

                {
                    this.e = z;
                    this.f = savedStateRegistry0;
                    this.g = s;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    if(this.e) {
                        this.f.m(this.g);
                    }
                }
            });
        }
        catch(IllegalArgumentException unused_ex) {
            return new DisposableSaveableStateRegistry(saveableStateRegistry0, new a(false, savedStateRegistry0, s1) {
                final boolean e;
                final SavedStateRegistry f;
                final String g;

                {
                    this.e = z;
                    this.f = savedStateRegistry0;
                    this.g = s;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    if(this.e) {
                        this.f.m(this.g);
                    }
                }
            });
        }

        final class androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.registered.1 implements SavedStateProvider {
            androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.registered.1(SaveableStateRegistry saveableStateRegistry0) {
            }

            @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
            @l
            public final Bundle a() {
                return DisposableSaveableStateRegistry_androidKt.f(this.a.c());
            }
        }


        final class androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1 extends N implements Function1 {
            public static final androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1 e;

            static {
                androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1.e = new androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1();
            }

            androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry.saveableStateRegistry.1() {
                super(1);
            }

            @l
            public final Boolean a(@l Object object0) {
                L.p(object0, "it");
                return Boolean.valueOf(DisposableSaveableStateRegistry_androidKt.e(object0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(object0);
            }
        }

    }

    private static final boolean e(Object object0) {
        if(object0 instanceof SnapshotMutableState) {
            if(((SnapshotMutableState)object0).a() != SnapshotStateKt.l() && ((SnapshotMutableState)object0).a() != SnapshotStateKt.w() && ((SnapshotMutableState)object0).a() != SnapshotStateKt.s()) {
                return false;
            }
            Object object1 = ((SnapshotMutableState)object0).getValue();
            return object1 == null ? true : DisposableSaveableStateRegistry_androidKt.e(object1);
        }
        if(object0 instanceof v && object0 instanceof Serializable) {
            return false;
        }
        Class[] arr_class = DisposableSaveableStateRegistry_androidKt.a;
        for(int v = 0; v < arr_class.length; ++v) {
            if(arr_class[v].isInstance(object0)) {
                return true;
            }
        }
        return false;
    }

    // 检测为 Lambda 实现
    private static final Bundle f(Map map0) [...]

    private static final Map g(Bundle bundle0) {
        Map map0 = new LinkedHashMap();
        Set set0 = bundle0.keySet();
        L.o(set0, "this.keySet()");
        for(Object object0: set0) {
            ArrayList arrayList0 = bundle0.getParcelableArrayList(((String)object0));
            L.n(arrayList0, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            L.o(((String)object0), "key");
            map0.put(((String)object0), arrayList0);
        }
        return map0;
    }
}

