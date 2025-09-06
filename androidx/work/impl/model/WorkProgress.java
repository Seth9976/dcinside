package androidx.work.impl.model;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.work.Data;
import kotlin.jvm.internal.L;
import y4.l;

@RestrictTo({Scope.b})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
public final class WorkProgress {
    @ColumnInfo(name = "work_spec_id")
    @PrimaryKey
    @l
    private final String a;
    @ColumnInfo(name = "progress")
    @l
    private final Data b;

    public WorkProgress(@l String s, @l Data data0) {
        L.p(s, "workSpecId");
        L.p(data0, "progress");
        super();
        this.a = s;
        this.b = data0;
    }

    @l
    public final Data a() {
        return this.b;
    }

    @l
    public final String b() {
        return this.a;
    }
}

