package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import y4.l;

@Dao
public interface WorkNameDao {
    @Insert(onConflict = 5)
    void a(@l WorkName arg1);

    @Query("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    @l
    List b(@l String arg1);

    @Query("SELECT work_spec_id FROM workname WHERE name=:name")
    @l
    List c(@l String arg1);
}

