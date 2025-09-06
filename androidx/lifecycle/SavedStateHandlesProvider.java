package androidx.lifecycle;

import A3.a;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map.Entry;
import kotlin.D;
import kotlin.E;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSavedStateHandleSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n215#2,2:226\n1#3:228\n*S KotlinDebug\n*F\n+ 1 SavedStateHandleSupport.kt\nandroidx/lifecycle/SavedStateHandlesProvider\n*L\n146#1:226,2\n*E\n"})
public final class SavedStateHandlesProvider implements SavedStateProvider {
    @l
    private final SavedStateRegistry a;
    private boolean b;
    @m
    private Bundle c;
    @l
    private final D d;

    public SavedStateHandlesProvider(@l SavedStateRegistry savedStateRegistry0, @l ViewModelStoreOwner viewModelStoreOwner0) {
        L.p(savedStateRegistry0, "savedStateRegistry");
        L.p(viewModelStoreOwner0, "viewModelStoreOwner");
        super();
        this.a = savedStateRegistry0;
        this.d = E.a(new a() {
            final ViewModelStoreOwner e;

            {
                this.e = viewModelStoreOwner0;
                super(0);
            }

            @l
            public final SavedStateHandlesVM b() {
                return SavedStateHandleSupport.e(this.e);
            }

            @Override  // A3.a
            public Object invoke() {
                return this.b();
            }
        });
    }

    @Override  // androidx.savedstate.SavedStateRegistry$SavedStateProvider
    @l
    public Bundle a() {
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = this.c;
        if(bundle1 != null) {
            bundle0.putAll(bundle1);
        }
        for(Object object0: this.c().c().entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            Bundle bundle2 = ((SavedStateHandle)((Map.Entry)object0).getValue()).o().a();
            if(!L.g(bundle2, Bundle.EMPTY)) {
                bundle0.putBundle(s, bundle2);
            }
        }
        this.b = false;
        return bundle0;
    }

    @m
    public final Bundle b(@l String s) {
        L.p(s, "key");
        this.d();
        Bundle bundle0 = this.c == null ? null : this.c.getBundle(s);
        Bundle bundle1 = this.c;
        if(bundle1 != null) {
            bundle1.remove(s);
        }
        if(this.c != null && this.c.isEmpty()) {
            this.c = null;
        }
        return bundle0;
    }

    private final SavedStateHandlesVM c() {
        return (SavedStateHandlesVM)this.d.getValue();
    }

    public final void d() {
        if(!this.b) {
            Bundle bundle0 = this.a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            Bundle bundle1 = new Bundle();
            Bundle bundle2 = this.c;
            if(bundle2 != null) {
                bundle1.putAll(bundle2);
            }
            if(bundle0 != null) {
                bundle1.putAll(bundle0);
            }
            this.c = bundle1;
            this.b = true;
            this.c();
        }
    }
}

