package androidx.room;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@RestrictTo({Scope.c})
@s0({"SMAP\nEntityDeletionOrUpdateAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,107:1\n1855#2,2:108\n13579#3,2:110\n*S KotlinDebug\n*F\n+ 1 EntityDeletionOrUpdateAdapter.kt\nandroidx/room/EntityDeletionOrUpdateAdapter\n*L\n77#1:108,2\n97#1:110,2\n*E\n"})
public abstract class EntityDeletionOrUpdateAdapter extends SharedSQLiteStatement {
    public EntityDeletionOrUpdateAdapter(@l RoomDatabase roomDatabase0) {
        L.p(roomDatabase0, "database");
        super(roomDatabase0);
    }

    @Override  // androidx.room.SharedSQLiteStatement
    @l
    protected abstract String e();

    protected abstract void i(@l SupportSQLiteStatement arg1, Object arg2);

    public final int j(Object object0) {
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            this.i(supportSQLiteStatement0, object0);
            return supportSQLiteStatement0.O();
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    public final int k(@l Iterable iterable0) {
        L.p(iterable0, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            int v1 = 0;
            for(Object object0: iterable0) {
                this.i(supportSQLiteStatement0, object0);
                v1 += supportSQLiteStatement0.O();
            }
            return v1;
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }

    public final int l(@l Object[] arr_object) {
        L.p(arr_object, "entities");
        SupportSQLiteStatement supportSQLiteStatement0 = this.b();
        try {
            int v2 = 0;
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                this.i(supportSQLiteStatement0, arr_object[v1]);
                v2 += supportSQLiteStatement0.O();
            }
            return v2;
        }
        finally {
            this.h(supportSQLiteStatement0);
        }
    }
}

