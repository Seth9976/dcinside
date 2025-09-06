package androidx.datastore.preferences;

import A3.a;
import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.properties.e;
import kotlin.reflect.o;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class PreferenceDataStoreSingletonDelegate implements e {
    @l
    private final String a;
    @m
    private final ReplaceFileCorruptionHandler b;
    @l
    private final Function1 c;
    @l
    private final O d;
    @l
    private final Object e;
    @GuardedBy("lock")
    @m
    private volatile DataStore f;

    public PreferenceDataStoreSingletonDelegate(@l String s, @m ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @l Function1 function10, @l O o0) {
        L.p(s, "name");
        L.p(function10, "produceMigrations");
        L.p(o0, "scope");
        super();
        this.a = s;
        this.b = replaceFileCorruptionHandler0;
        this.c = function10;
        this.d = o0;
        this.e = new Object();
    }

    @l
    public DataStore b(@l Context context0, @l o o0) {
        L.p(context0, "thisRef");
        L.p(o0, "property");
        DataStore dataStore0 = this.f;
        if(dataStore0 == null) {
            synchronized(this.e) {
                if(this.f == null) {
                    Context context1 = context0.getApplicationContext();
                    L.o(context1, "applicationContext");
                    List list0 = (List)this.c.invoke(context1);
                    androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate.getValue.1.1 preferenceDataStoreSingletonDelegate$getValue$1$10 = new a(this) {
                        final Context e;
                        final PreferenceDataStoreSingletonDelegate f;

                        {
                            this.e = context0;
                            this.f = preferenceDataStoreSingletonDelegate0;
                            super(0);
                        }

                        @l
                        public final File invoke() {
                            L.o(this.e, "applicationContext");
                            String s = this.f.a;
                            return PreferenceDataStoreFile.a(this.e, s);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.invoke();
                        }
                    };
                    this.f = PreferenceDataStoreFactory.a.d(this.b, list0, this.d, preferenceDataStoreSingletonDelegate$getValue$1$10);
                }
                DataStore dataStore1 = this.f;
                L.m(dataStore1);
                return dataStore1;
            }
        }
        return dataStore0;
    }

    @Override  // kotlin.properties.e
    public Object getValue(Object object0, o o0) {
        return this.b(((Context)object0), o0);
    }
}

