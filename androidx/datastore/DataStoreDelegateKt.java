package androidx.datastore;

import android.content.Context;
import androidx.datastore.core.Serializer;
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

public final class DataStoreDelegateKt {
    @l
    public static final e a(@l String s, @l Serializer serializer0, @m ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, @l Function1 function10, @l O o0) {
        L.p(s, "fileName");
        L.p(serializer0, "serializer");
        L.p(function10, "produceMigrations");
        L.p(o0, "scope");
        return new DataStoreSingletonDelegate(s, serializer0, replaceFileCorruptionHandler0, function10, o0);
    }

    public static e b(String s, Serializer serializer0, ReplaceFileCorruptionHandler replaceFileCorruptionHandler0, Function1 function10, O o0, int v, Object object0) {
        if((v & 4) != 0) {
            replaceFileCorruptionHandler0 = null;
        }
        if((v & 8) != 0) {
            function10 = androidx.datastore.DataStoreDelegateKt.dataStore.1.e;
        }
        if((v & 16) != 0) {
            o0 = P.a(h0.c().plus(j1.c(null, 1, null)));
        }
        return DataStoreDelegateKt.a(s, serializer0, replaceFileCorruptionHandler0, function10, o0);

        final class androidx.datastore.DataStoreDelegateKt.dataStore.1 extends N implements Function1 {
            public static final androidx.datastore.DataStoreDelegateKt.dataStore.1 e;

            static {
                androidx.datastore.DataStoreDelegateKt.dataStore.1.e = new androidx.datastore.DataStoreDelegateKt.dataStore.1();
            }

            androidx.datastore.DataStoreDelegateKt.dataStore.1() {
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

