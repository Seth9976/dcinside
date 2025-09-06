package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import y4.l;
import y4.m;

@Dao
public interface PreferenceDao {
    @Query("SELECT long_value FROM Preference where `key`=:key")
    @l
    LiveData a(@l String arg1);

    @Insert(onConflict = 1)
    void b(@l Preference arg1);

    @Query("SELECT long_value FROM Preference where `key`=:key")
    @m
    Long c(@l String arg1);
}

