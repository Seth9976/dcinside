package androidx.work.impl.model;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import kotlin.jvm.internal.L;
import y4.l;

@RestrictTo({Scope.b})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @ForeignKey(childColumns = {"prerequisite_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
public final class Dependency {
    @ColumnInfo(name = "work_spec_id")
    @l
    private final String a;
    @ColumnInfo(name = "prerequisite_id")
    @l
    private final String b;

    public Dependency(@l String s, @l String s1) {
        L.p(s, "workSpecId");
        L.p(s1, "prerequisiteId");
        super();
        this.a = s;
        this.b = s1;
    }

    @l
    public final String a() {
        return this.b;
    }

    @l
    public final String b() {
        return this.a;
    }
}

