package androidx.datastore.preferences.core;

import A3.o;
import androidx.datastore.core.DataStore;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.i;
import y4.l;
import y4.m;

public final class PreferenceDataStore implements DataStore {
    @l
    private final DataStore a;

    public PreferenceDataStore(@l DataStore dataStore0) {
        L.p(dataStore0, "delegate");
        super();
        this.a = dataStore0;
    }

    @Override  // androidx.datastore.core.DataStore
    @m
    public Object a(@l o o0, @l d d0) {
        androidx.datastore.preferences.core.PreferenceDataStore.updateData.2 preferenceDataStore$updateData$20 = new o(null) {
            int k;
            Object l;
            final o m;

            {
                this.m = o0;
                super(2, d0);
            }

            @m
            public final Object a(@l Preferences preferences0, @m d d0) {
                return ((androidx.datastore.preferences.core.PreferenceDataStore.updateData.2)this.create(preferences0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.datastore.preferences.core.PreferenceDataStore.updateData.2(this.m, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Preferences)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        object0 = this.m.invoke(((Preferences)this.l), this);
                        if(object0 == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                ((MutablePreferences)(((Preferences)object0))).h();
                return (Preferences)object0;
            }
        };
        return this.a.a(preferenceDataStore$updateData$20, d0);
    }

    @Override  // androidx.datastore.core.DataStore
    @l
    public i getData() {
        return this.a.getData();
    }
}

