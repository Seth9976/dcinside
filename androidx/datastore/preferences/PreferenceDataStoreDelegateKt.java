package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.properties.e;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import y4.l;
import y4.m;

public final class PreferenceDataStoreDelegateKt {
    @l
    public static final e a(@l String s, @m ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @l Function1 function10, @l O o0) {
        L.p(s, "name");
        L.p(function10, "produceMigrations");
        L.p(o0, "scope");
        return new PreferenceDataStoreSingletonDelegate(s, replaceFileCorruptionHandler0, function10, o0);
    }

    public static e b(String s, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, Function1 function10, O o0, int v, Object object0) {
        if((v & 2) != 0) {
            replaceFileCorruptionHandler0 = null;
        }
        if((v & 4) != 0) {
            function10 = androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore.1.e;
        }
        if((v & 8) != 0) {
            o0 = P.a(h0.c().plus(j1.c(null, 1, null)));
        }
        return PreferenceDataStoreDelegateKt.a(s, replaceFileCorruptionHandler0, function10, o0);

        final class androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore.1 extends N implements Function1 {
            public static final androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore.1 e;

            static {
                androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore.1.e = new androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore.1();
            }

            androidx.datastore.preferences.PreferenceDataStoreDelegateKt.preferencesDataStore.1() {
                super(1);
            }

            @l
            public final List a(@l Context context0) {
                L.p(context0, "it");
                return u.H();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Context)object0));
            }
        }

    }
}

