package androidx.datastore.preferences.core;

import A3.a;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.j1;
import y4.l;
import y4.m;
import z3.j;

public final class PreferenceDataStoreFactory {
    @l
    public static final PreferenceDataStoreFactory a;

    static {
        PreferenceDataStoreFactory.a = new PreferenceDataStoreFactory();
    }

    @l
    @j
    public final DataStore a(@l a a0) {
        L.p(a0, "produceFile");
        return PreferenceDataStoreFactory.e(this, null, null, null, a0, 7, null);
    }

    @l
    @j
    public final DataStore b(@m ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @l a a0) {
        L.p(a0, "produceFile");
        return PreferenceDataStoreFactory.e(this, replaceFileCorruptionHandler0, null, null, a0, 6, null);
    }

    @l
    @j
    public final DataStore c(@m ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @l List list0, @l a a0) {
        L.p(list0, "migrations");
        L.p(a0, "produceFile");
        return PreferenceDataStoreFactory.e(this, replaceFileCorruptionHandler0, list0, null, a0, 4, null);
    }

    @l
    @j
    public final DataStore d(@m ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @l List list0, @l O o0, @l a a0) {
        L.p(list0, "migrations");
        L.p(o0, "scope");
        L.p(a0, "produceFile");
        androidx.datastore.preferences.core.PreferenceDataStoreFactory.create.delegate.1 preferenceDataStoreFactory$create$delegate$10 = new a() {
            final a e;

            {
                this.e = a0;
                super(0);
            }

            @l
            public final File invoke() {
                File file0 = (File)this.e.invoke();
                if(!L.g(kotlin.io.m.b0(file0), "preferences_pb")) {
                    throw new IllegalStateException(("File extension for file: " + file0 + " does not match required extension for Preferences file: " + "preferences_pb").toString());
                }
                return file0;
            }

            @Override  // A3.a
            public Object invoke() {
                return this.invoke();
            }
        };
        return new PreferenceDataStore(DataStoreFactory.a.d(PreferencesSerializer.a, replaceFileCorruptionHandler0, list0, o0, preferenceDataStoreFactory$create$delegate$10));
    }

    public static DataStore e(PreferenceDataStoreFactory preferenceDataStoreFactory0, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, List list0, O o0, a a0, int v, Object object0) {
        if((v & 1) != 0) {
            replaceFileCorruptionHandler0 = null;
        }
        if((v & 2) != 0) {
            list0 = u.H();
        }
        if((v & 4) != 0) {
            o0 = P.a(h0.c().plus(j1.c(null, 1, null)));
        }
        return preferenceDataStoreFactory0.d(replaceFileCorruptionHandler0, list0, o0, a0);
    }
}

