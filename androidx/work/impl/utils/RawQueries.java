package androidx.work.impl.utils;

import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.WorkInfo.State;
import androidx.work.WorkQuery;
import androidx.work.impl.model.WorkTypeConverters;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import z3.i;

@s0({"SMAP\nRawQueries.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RawQueries.kt\nandroidx/work/impl/utils/RawQueries\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1549#2:74\n1620#2,3:75\n1549#2:78\n1620#2,3:79\n37#3,2:82\n1#4:84\n*S KotlinDebug\n*F\n+ 1 RawQueries.kt\nandroidx/work/impl/utils/RawQueries\n*L\n35#1:74\n35#1:75,3\n43#1:78\n43#1:79,3\n64#1:82,2\n*E\n"})
@i(name = "RawQueries")
public final class RawQueries {
    private static final void a(StringBuilder stringBuilder0, int v) {
        if(v <= 0) {
            return;
        }
        ArrayList arrayList0 = new ArrayList(v);
        for(int v1 = 0; v1 < v; ++v1) {
            arrayList0.add("?");
        }
        stringBuilder0.append(u.m3(arrayList0, ",", null, null, 0, null, null, 62, null));
    }

    @l
    public static final SupportSQLiteQuery b(@l WorkQuery workQuery0) {
        L.p(workQuery0, "<this>");
        ArrayList arrayList0 = new ArrayList();
        StringBuilder stringBuilder0 = new StringBuilder("SELECT * FROM workspec");
        String s = " AND";
        String s1 = " WHERE";
        if(!workQuery0.j().isEmpty()) {
            Iterable iterable0 = workQuery0.j();
            ArrayList arrayList1 = new ArrayList(u.b0(iterable0, 10));
            for(Object object0: iterable0) {
                arrayList1.add(WorkTypeConverters.k(((State)object0)));
            }
            stringBuilder0.append(" WHERE state IN (");
            RawQueries.a(stringBuilder0, arrayList1.size());
            stringBuilder0.append(")");
            arrayList0.addAll(arrayList1);
            s1 = " AND";
        }
        if(!workQuery0.i().isEmpty()) {
            Iterable iterable1 = workQuery0.i();
            ArrayList arrayList2 = new ArrayList(u.b0(iterable1, 10));
            for(Object object1: iterable1) {
                arrayList2.add(((UUID)object1).toString());
            }
            stringBuilder0.append(s1 + " id IN (");
            RawQueries.a(stringBuilder0, workQuery0.i().size());
            stringBuilder0.append(")");
            arrayList0.addAll(arrayList2);
            s1 = " AND";
        }
        if(workQuery0.k().isEmpty()) {
            s = s1;
        }
        else {
            stringBuilder0.append(s1 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            RawQueries.a(stringBuilder0, workQuery0.k().size());
            stringBuilder0.append("))");
            arrayList0.addAll(workQuery0.k());
        }
        if(!workQuery0.l().isEmpty()) {
            stringBuilder0.append(s + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            RawQueries.a(stringBuilder0, workQuery0.l().size());
            stringBuilder0.append("))");
            arrayList0.addAll(workQuery0.l());
        }
        stringBuilder0.append(";");
        String s2 = stringBuilder0.toString();
        L.o(s2, "builder.toString()");
        return new SimpleSQLiteQuery(s2, arrayList0.toArray(new Object[0]));
    }
}

