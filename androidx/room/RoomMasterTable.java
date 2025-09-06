package androidx.room;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

@RestrictTo({Scope.c})
public final class RoomMasterTable {
    @l
    public static final RoomMasterTable a = null;
    @l
    public static final String b = "room_master_table";
    @l
    public static final String c = "room_master_table";
    @l
    private static final String d = "id";
    @l
    private static final String e = "identity_hash";
    @l
    public static final String f = "42";
    @l
    public static final String g = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)";
    @l
    public static final String h = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1";

    static {
        RoomMasterTable.a = new RoomMasterTable();
    }

    @l
    @n
    public static final String a(@l String s) {
        L.p(s, "hash");
        return "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'" + s + "\')";
    }
}

