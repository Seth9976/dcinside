package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

@Dao
public interface SystemIdInfoDao {
    public static final class DefaultImpls {
        @Deprecated
        @m
        public static SystemIdInfo a(@l SystemIdInfoDao systemIdInfoDao0, @l WorkGenerationalId workGenerationalId0) {
            L.p(workGenerationalId0, "id");
            return c.a(systemIdInfoDao0, workGenerationalId0);
        }

        @Deprecated
        public static void b(@l SystemIdInfoDao systemIdInfoDao0, @l WorkGenerationalId workGenerationalId0) {
            L.p(workGenerationalId0, "id");
            c.b(systemIdInfoDao0, workGenerationalId0);
        }
    }

    @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    @m
    SystemIdInfo a(@l String arg1, int arg2);

    void b(@l WorkGenerationalId arg1);

    @Insert(onConflict = 1)
    void c(@l SystemIdInfo arg1);

    @m
    SystemIdInfo d(@l WorkGenerationalId arg1);

    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    @l
    List e();

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void f(@l String arg1, int arg2);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void g(@l String arg1);
}

