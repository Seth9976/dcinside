package androidx.datastore;

import A3.a;
import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.properties.e;
import kotlin.reflect.o;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class DataStoreSingletonDelegate implements e {
    @l
    private final String a;
    @l
    private final Serializer b;
    @m
    private final ReplaceFileCorruptionHandler c;
    @l
    private final Function1 d;
    @l
    private final O e;
    @l
    private final Object f;
    @GuardedBy("lock")
    @m
    private volatile DataStore g;

    public DataStoreSingletonDelegate(@l String s, @l Serializer serializer0, @m ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @l Function1 function10, @l O o0) {
        L.p(s, "fileName");
        L.p(serializer0, "serializer");
        L.p(function10, "produceMigrations");
        L.p(o0, "scope");
        super();
        this.a = s;
        this.b = serializer0;
        this.c = replaceFileCorruptionHandler0;
        this.d = function10;
        this.e = o0;
        this.f = new Object();
    }

    @l
    public DataStore b(@l Context context0, @l o o0) {
        L.p(context0, "thisRef");
        L.p(o0, "property");
        DataStore dataStore0 = this.g;
        if(dataStore0 == null) {
            synchronized(this.f) {
                if(this.g == null) {
                    Context context1 = context0.getApplicationContext();
                    L.o(context1, "applicationContext");
                    Object object1 = this.d.invoke(context1);
                    androidx.datastore.DataStoreSingletonDelegate.getValue.1.1 dataStoreSingletonDelegate$getValue$1$10 = new a(this) {
                        final Context e;
                        final DataStoreSingletonDelegate f;

                        {
                            this.e = context0;
                            this.f = dataStoreSingletonDelegate0;
                            super(0);
                        }

                        @l
                        public final File invoke() {
                            L.o(this.e, "applicationContext");
                            String s = this.f.a;
                            return DataStoreFile.a(this.e, s);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            return this.invoke();
                        }
                    };
                    this.g = DataStoreFactory.a.d(this.b, this.c, ((List)object1), this.e, dataStoreSingletonDelegate$getValue$1$10);
                }
                DataStore dataStore1 = this.g;
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

