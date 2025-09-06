package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.List;
import kotlinx.coroutines.flow.i;
import y4.l;

@Dao
public interface RawWorkInfoDao {
    @RawQuery(observedEntities = {WorkSpec.class})
    @l
    List a(@l SupportSQLiteQuery arg1);

    @RawQuery(observedEntities = {WorkSpec.class})
    @l
    LiveData b(@l SupportSQLiteQuery arg1);

    @RawQuery(observedEntities = {WorkSpec.class})
    @l
    i c(@l SupportSQLiteQuery arg1);
}

