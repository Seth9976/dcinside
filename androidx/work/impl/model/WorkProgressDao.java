package androidx.work.impl.model;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.work.Data;
import y4.l;
import y4.m;

@RestrictTo({Scope.b})
@Dao
public interface WorkProgressDao {
    @Query("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void b(@l String arg1);

    @Query("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    @m
    Data c(@l String arg1);

    @Query("DELETE FROM WorkProgress")
    void d();

    @Insert(onConflict = 1)
    void e(@l WorkProgress arg1);
}

