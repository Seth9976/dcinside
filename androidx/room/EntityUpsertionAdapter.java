package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;

@RestrictTo({Scope.c})
@s0({"SMAP\nEntityUpsertionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n13579#2,2:225\n13579#2,2:229\n1855#3,2:227\n1855#3,2:231\n*S KotlinDebug\n*F\n+ 1 EntityUpsertionAdapter.kt\nandroidx/room/EntityUpsertionAdapter\n*L\n78#1:225,2\n151#1:229,2\n89#1:227,2\n165#1:231,2\n*E\n"})
public final class EntityUpsertionAdapter {
    @l
    private final EntityInsertionAdapter a;
    @l
    private final EntityDeletionOrUpdateAdapter b;

    public EntityUpsertionAdapter(@l EntityInsertionAdapter entityInsertionAdapter0, @l EntityDeletionOrUpdateAdapter entityDeletionOrUpdateAdapter0) {
        L.p(entityInsertionAdapter0, "insertionAdapter");
        L.p(entityDeletionOrUpdateAdapter0, "updateAdapter");
        super();
        this.a = entityInsertionAdapter0;
        this.b = entityDeletionOrUpdateAdapter0;
    }

    private final void a(SQLiteConstraintException sQLiteConstraintException0) {
        String s = sQLiteConstraintException0.getMessage();
        if(s == null || !v.T2(s, "unique", true) && !v.W2(s, "2067", false, 2, null) && !v.W2(s, "1555", false, 2, null)) {
            throw sQLiteConstraintException0;
        }
    }

    public final void b(@l Iterable iterable0) {
        L.p(iterable0, "entities");
        for(Object object0: iterable0) {
            try {
                this.a.k(object0);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                this.a(sQLiteConstraintException0);
                this.b.j(object0);
            }
        }
    }

    public final void c(Object object0) {
        try {
            this.a.k(object0);
        }
        catch(SQLiteConstraintException sQLiteConstraintException0) {
            this.a(sQLiteConstraintException0);
            this.b.j(object0);
        }
    }

    public final void d(@l Object[] arr_object) {
        L.p(arr_object, "entities");
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            try {
                this.a.k(object0);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                this.a(sQLiteConstraintException0);
                this.b.j(object0);
            }
        }
    }

    public final long e(Object object0) {
        try {
            return this.a.m(object0);
        }
        catch(SQLiteConstraintException sQLiteConstraintException0) {
            this.a(sQLiteConstraintException0);
            this.b.j(object0);
            return -1L;
        }
    }

    @l
    public final long[] f(@l Collection collection0) {
        long v2;
        L.p(collection0, "entities");
        Iterator iterator0 = collection0.iterator();
        int v = collection0.size();
        long[] arr_v = new long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = iterator0.next();
            try {
                v2 = this.a.m(object0);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                this.a(sQLiteConstraintException0);
                this.b.j(object0);
                v2 = -1L;
            }
            arr_v[v1] = v2;
        }
        return arr_v;
    }

    @l
    public final long[] g(@l Object[] arr_object) {
        long v1;
        L.p(arr_object, "entities");
        long[] arr_v = new long[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            try {
                v1 = this.a.m(arr_object[v]);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                this.a(sQLiteConstraintException0);
                this.b.j(arr_object[v]);
                v1 = -1L;
            }
            arr_v[v] = v1;
        }
        return arr_v;
    }

    @l
    public final Long[] h(@l Collection collection0) {
        long v2;
        L.p(collection0, "entities");
        Iterator iterator0 = collection0.iterator();
        int v = collection0.size();
        Long[] arr_long = new Long[v];
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = iterator0.next();
            try {
                v2 = this.a.m(object0);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                this.a(sQLiteConstraintException0);
                this.b.j(object0);
                v2 = -1L;
            }
            arr_long[v1] = v2;
        }
        return arr_long;
    }

    @l
    public final Long[] i(@l Object[] arr_object) {
        long v1;
        L.p(arr_object, "entities");
        Long[] arr_long = new Long[arr_object.length];
        for(int v = 0; v < arr_object.length; ++v) {
            try {
                v1 = this.a.m(arr_object[v]);
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                this.a(sQLiteConstraintException0);
                this.b.j(arr_object[v]);
                v1 = -1L;
            }
            arr_long[v] = v1;
        }
        return arr_long;
    }

    @l
    public final List j(@l Collection collection0) {
        L.p(collection0, "entities");
        List list0 = u.i();
        for(Object object0: collection0) {
            try {
                list0.add(this.a.m(object0));
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                this.a(sQLiteConstraintException0);
                this.b.j(object0);
                list0.add(-1L);
            }
        }
        return u.a(list0);
    }

    @l
    public final List k(@l Object[] arr_object) {
        L.p(arr_object, "entities");
        List list0 = u.i();
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            try {
                list0.add(this.a.m(object0));
            }
            catch(SQLiteConstraintException sQLiteConstraintException0) {
                this.a(sQLiteConstraintException0);
                this.b.j(object0);
                list0.add(-1L);
            }
        }
        return u.a(list0);
    }
}

