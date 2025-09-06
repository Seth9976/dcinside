package androidx.datastore.preferences.core;

import A3.o;
import androidx.datastore.core.DataStore;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import y4.l;
import y4.m;

public final class PreferencesKt {
    @m
    public static final Object a(@l DataStore dataStore0, @l o o0, @l d d0) {
        return dataStore0.a(new o(o0, null) {
            int k;
            Object l;
            final o m;

            {
                this.m = o0;
                super(2, d0);
            }

            @m
            public final Object a(@l Preferences preferences0, @m d d0) {
                return ((androidx.datastore.preferences.core.PreferencesKt.edit.2)this.create(preferences0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.datastore.preferences.core.PreferencesKt.edit.2(this.m, d0);
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
                        MutablePreferences mutablePreferences0 = ((Preferences)this.l).d();
                        this.l = mutablePreferences0;
                        this.k = 1;
                        return this.m.invoke(mutablePreferences0, this) == object1 ? object1 : mutablePreferences0;
                    }
                    case 1: {
                        MutablePreferences mutablePreferences1 = (MutablePreferences)this.l;
                        f0.n(object0);
                        return mutablePreferences1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, d0);
    }
}

