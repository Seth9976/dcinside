package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import y4.l;

@Dao
public interface DependencyDao {
    @Insert(onConflict = 5)
    void a(@l Dependency arg1);

    @Query("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    @l
    List b(@l String arg1);

    @Query("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean c(@l String arg1);

    @Query("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    @l
    List d(@l String arg1);

    @Query("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean e(@l String arg1);
}

