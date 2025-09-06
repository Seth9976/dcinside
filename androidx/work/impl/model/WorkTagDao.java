package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@Dao
@s0({"SMAP\nWorkTagDao.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkTagDao.kt\nandroidx/work/impl/model/WorkTagDao\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1855#2,2:64\n*S KotlinDebug\n*F\n+ 1 WorkTagDao.kt\nandroidx/work/impl/model/WorkTagDao\n*L\n60#1:64,2\n*E\n"})
public interface WorkTagDao {
    public static final class DefaultImpls {
        @Deprecated
        public static void a(@l WorkTagDao workTagDao0, @l String s, @l Set set0) {
            L.p(s, "id");
            L.p(set0, "tags");
            g.a(workTagDao0, s, set0);
        }
    }

    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void a(@l String arg1);

    void b(@l String arg1, @l Set arg2);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    @l
    List c(@l String arg1);

    @Insert(onConflict = 5)
    void d(@l WorkTag arg1);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    @l
    List e(@l String arg1);
}

