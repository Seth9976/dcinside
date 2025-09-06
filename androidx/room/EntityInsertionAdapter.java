package androidx.room;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s0;
import y4.l;

@RestrictTo({Scope.c})
@s0({"SMAP\nEntityInsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityInsertionAdapter.kt\nandroidx/room/EntityInsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n13579#2,2:230\n13644#2,3:237\n13579#2,2:240\n1855#3,2:232\n1864#3,3:234\n1855#3,2:242\n*S KotlinDebug\n*F\n+ 1 EntityInsertionAdapter.kt\nandroidx/room/EntityInsertionAdapter\n*L\n65#1:230,2\n137#1:237,3\n199#1:240,2\n82#1:232,2\n117#1:234,3\n219#1:242,2\n*E\n"})
public abstract class EntityInsertionAdapter extends SharedSQLiteStatement {
    public EntityInsertionAdapter(@l RoomDatabase roomDatabase0) {
        L.p(roomDatabase0, "database");
        super(roomDatabase0);
    }

    protected abstract void i(@l SupportSQLiteStatement arg1, Object arg2);

    public final void j(@l Iterable iterable0) {
        L.p(iterable0, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            for(Object object0: iterable0) {
                this.i(supportSQLiteStatement0, object0);
                supportSQLiteStatement0.Z2();
            }
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    public final void k(Object object0) {
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            this.i(supportSQLiteStatement0, object0);
            supportSQLiteStatement0.Z2();
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    public final void l(@l Object[] arr_object) {
        L.p(arr_object, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                this.i(supportSQLiteStatement0, arr_object[v1]);
                supportSQLiteStatement0.Z2();
            }
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    public final long m(Object object0) {
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            this.i(supportSQLiteStatement0, object0);
            return supportSQLiteStatement0.Z2();
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    @l
    public final long[] n(@l Collection collection0) {
        L.p(collection0, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            long[] arr_v = new long[collection0.size()];
            int v1 = 0;
            for(Object object0: collection0) {
                if(v1 < 0) {
                    u.Z();
                }
                this.i(supportSQLiteStatement0, object0);
                arr_v[v1] = supportSQLiteStatement0.Z2();
                ++v1;
            }
            return arr_v;
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    @l
    public final long[] o(@l Object[] arr_object) {
        L.p(arr_object, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            long[] arr_v = new long[arr_object.length];
            int v1 = 0;
            for(int v2 = 0; v1 < arr_object.length; ++v2) {
                this.i(supportSQLiteStatement0, arr_object[v1]);
                arr_v[v2] = supportSQLiteStatement0.Z2();
                ++v1;
            }
            return arr_v;
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    @l
    public final Long[] p(@l Collection collection0) {
        L.p(collection0, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        Iterator iterator0 = collection0.iterator();
        try {
            int v1 = collection0.size();
            Long[] arr_long = new Long[v1];
            for(int v2 = 0; v2 < v1; ++v2) {
                Object object0 = iterator0.next();
                this.i(supportSQLiteStatement0, object0);
                arr_long[v2] = supportSQLiteStatement0.Z2();
            }
            return arr_long;
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    @l
    public final Long[] q(@l Object[] arr_object) {
        L.p(arr_object, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        Iterator iterator0 = i.a(arr_object);
        try {
            Long[] arr_long = new Long[arr_object.length];
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                Object object0 = iterator0.next();
                this.i(supportSQLiteStatement0, object0);
                arr_long[v1] = supportSQLiteStatement0.Z2();
            }
            return arr_long;
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    @l
    public final List r(@l Collection collection0) {
        L.p(collection0, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            List list0 = u.i();
            for(Object object0: collection0) {
                this.i(supportSQLiteStatement0, object0);
                list0.add(supportSQLiteStatement0.Z2());
            }
            return u.a(list0);
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    @l
    public final List s(@l Object[] arr_object) {
        L.p(arr_object, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            List list0 = u.i();
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                this.i(supportSQLiteStatement0, arr_object[v1]);
                list0.add(supportSQLiteStatement0.Z2());
            }
            return u.a(list0);
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }
}

