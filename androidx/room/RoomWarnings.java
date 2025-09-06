package androidx.room;

import kotlin.jvm.internal.w;
import y4.l;

public class RoomWarnings {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }
    }

    @l
    public static final Companion a = null;
    @l
    public static final String b = "ROOM_CURSOR_MISMATCH";
    @l
    public static final String c = "ROOM_TYPE_DOES_NOT_IMPLEMENT_EQUALS_HASHCODE";
    @l
    public static final String d = "ROOM_MISSING_JAVA_TMP_DIR";
    @l
    public static final String e = "ROOM_CANNOT_CREATE_VERIFICATION_DATABASE";
    @l
    public static final String f = "ROOM_EMBEDDED_PRIMARY_KEY_IS_DROPPED";
    @l
    public static final String g = "ROOM_EMBEDDED_INDEX_IS_DROPPED";
    @l
    public static final String h = "ROOM_EMBEDDED_ENTITY_INDEX_IS_DROPPED";
    @l
    public static final String i = "ROOM_PARENT_INDEX_IS_DROPPED";
    @l
    public static final String j = "ROOM_PARENT_FIELD_INDEX_IS_DROPPED";
    @l
    public static final String k = "ROOM_RELATION_TYPE_MISMATCH";
    @l
    public static final String l = "ROOM_MISSING_SCHEMA_LOCATION";
    @l
    public static final String m = "ROOM_MISSING_FOREIGN_KEY_CHILD_INDEX";
    @l
    public static final String n = "MISSING_INDEX_ON_JUNCTION";
    @l
    public static final String o = "ROOM_DEFAULT_CONSTRUCTOR";
    @l
    public static final String p = "ROOM_RELATION_QUERY_WITHOUT_TRANSACTION";
    @l
    public static final String q = "ROOM_MISMATCHED_GETTER_TYPE";
    @l
    public static final String r = "ROOM_MISMATCHED_SETTER_TYPE";
    @l
    public static final String s = "ROOM_AMBIGUOUS_COLUMN_IN_RESULT";
    @l
    public static final String t = "ROOM_UNNECESSARY_NULLABILITY_IN_DAO_RETURN_TYPE";

    static {
        RoomWarnings.a = new Companion(null);
    }
}

