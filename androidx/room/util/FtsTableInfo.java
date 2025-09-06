package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.k0;
import kotlin.collections.u;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

@RestrictTo({Scope.c})
public final class FtsTableInfo {
    @s0({"SMAP\nFtsTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 4 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,182:1\n145#2,7:183\n145#2,7:190\n1183#3,2:197\n1185#3:222\n107#4:199\n79#4,22:200\n766#5:223\n857#5:224\n858#5:227\n12744#6,2:225\n*S KotlinDebug\n*F\n+ 1 FtsTableInfo.kt\nandroidx/room/util/FtsTableInfo$Companion\n*L\n94#1:183,7\n108#1:190,7\n148#1:197,2\n148#1:222\n163#1:199\n163#1:200,22\n173#1:223\n173#1:224\n173#1:227\n174#1:225,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @VisibleForTesting
        @l
        @n
        public final Set a(@l String s) {
            L.p(s, "createStatement");
            if(s.length() == 0) {
                return k0.k();
            }
            String s1 = s.substring(v.r3(s, '(', 0, false, 6, null) + 1, v.G3(s, ')', 0, false, 6, null));
            L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            ArrayList arrayList0 = new ArrayList();
            ArrayDeque arrayDeque0 = new ArrayDeque();
            int v = -1;
            int v1 = 0;
            for(int v2 = 0; v1 < s1.length(); ++v2) {
                int v3 = s1.charAt(v1);
                switch(v3) {
                    case 44: {
                        if(arrayDeque0.isEmpty()) {
                            String s2 = s1.substring(v + 1, v2);
                            L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                            int v4 = s2.length() - 1;
                            int v5 = 0;
                            boolean z = false;
                            while(v5 <= v4) {
                                boolean z1 = L.t(s2.charAt((z ? v4 : v5)), 0x20) <= 0;
                                if(z) {
                                    if(!z1) {
                                        break;
                                    }
                                    --v4;
                                }
                                else if(z1) {
                                    ++v5;
                                }
                                else {
                                    z = true;
                                }
                            }
                            arrayList0.add(s2.subSequence(v5, v4 + 1).toString());
                            v = v2;
                        }
                        break;
                    }
                    case 91: {
                        if(arrayDeque0.isEmpty()) {
                            arrayDeque0.push(Character.valueOf('['));
                        }
                        break;
                    }
                    case 93: {
                        if(!arrayDeque0.isEmpty()) {
                            Character character1 = (Character)arrayDeque0.peek();
                            if(character1 != null && character1.charValue() == 91) {
                                arrayDeque0.pop();
                            }
                        }
                        break;
                    }
                    case 34: 
                    case 39: 
                    case 0x60: {
                        if(arrayDeque0.isEmpty()) {
                            arrayDeque0.push(Character.valueOf(((char)v3)));
                        }
                        else {
                            Character character0 = (Character)arrayDeque0.peek();
                            if(character0 != null && character0.charValue() == v3) {
                                arrayDeque0.pop();
                            }
                        }
                    }
                }
                ++v1;
            }
            String s3 = s1.substring(v + 1);
            L.o(s3, "this as java.lang.String).substring(startIndex)");
            arrayList0.add(v.G5(s3).toString());
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: arrayList0) {
                String s4 = (String)object0;
                String[] arr_s = FtsTableInfo.e;
                for(int v6 = 0; v6 < arr_s.length; ++v6) {
                    if(v.v2(s4, arr_s[v6], false, 2, null)) {
                        arrayList1.add(object0);
                        break;
                    }
                }
            }
            return u.a6(arrayList1);
        }

        @l
        @n
        public final FtsTableInfo b(@l SupportSQLiteDatabase supportSQLiteDatabase0, @l String s) {
            L.p(supportSQLiteDatabase0, "database");
            L.p(s, "tableName");
            return new FtsTableInfo(s, this.c(supportSQLiteDatabase0, s), this.d(supportSQLiteDatabase0, s));
        }

        private final Set c(SupportSQLiteDatabase supportSQLiteDatabase0, String s) {
            Set set0 = k0.d();
            Cursor cursor0 = supportSQLiteDatabase0.x3("PRAGMA table_info(`" + s + "`)");
            try {
                if(cursor0.getColumnCount() > 0) {
                    int v = cursor0.getColumnIndex("name");
                    while(true) {
                        if(!cursor0.moveToNext()) {
                            break;
                        }
                        String s1 = cursor0.getString(v);
                        L.o(s1, "cursor.getString(nameIndex)");
                        set0.add(s1);
                    }
                }
                goto label_14;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                c.a(cursor0, throwable0);
                throw throwable1;
            }
        label_14:
            c.a(cursor0, null);
            return k0.a(set0);
        }

        private final Set d(SupportSQLiteDatabase supportSQLiteDatabase0, String s) {
            String s1;
            Cursor cursor0 = supportSQLiteDatabase0.x3("SELECT * FROM sqlite_master WHERE `name` = \'" + s + '\'');
            try {
                s1 = cursor0.moveToFirst() ? cursor0.getString(cursor0.getColumnIndexOrThrow("sql")) : "";
                goto label_11;
            }
            catch(Throwable throwable0) {
            }
            try {
                throw throwable0;
            }
            catch(Throwable throwable1) {
                c.a(cursor0, throwable0);
                throw throwable1;
            }
        label_11:
            c.a(cursor0, null);
            L.o(s1, "sql");
            return this.a(s1);
        }
    }

    @l
    @f
    public final String a;
    @l
    @f
    public final Set b;
    @l
    @f
    public final Set c;
    @l
    public static final Companion d;
    @l
    private static final String[] e;

    static {
        FtsTableInfo.d = new Companion(null);
        FtsTableInfo.e = new String[]{"tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress="};
    }

    public FtsTableInfo(@l String s, @l Set set0, @l String s1) {
        L.p(s, "name");
        L.p(set0, "columns");
        L.p(s1, "createSql");
        this(s, set0, FtsTableInfo.d.a(s1));
    }

    public FtsTableInfo(@l String s, @l Set set0, @l Set set1) {
        L.p(s, "name");
        L.p(set0, "columns");
        L.p(set1, "options");
        super();
        this.a = s;
        this.b = set0;
        this.c = set1;
    }

    @VisibleForTesting
    @l
    @n
    public static final Set b(@l String s) {
        return FtsTableInfo.d.a(s);
    }

    @l
    @n
    public static final FtsTableInfo c(@l SupportSQLiteDatabase supportSQLiteDatabase0, @l String s) {
        return FtsTableInfo.d.b(supportSQLiteDatabase0, s);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof FtsTableInfo)) {
            return false;
        }
        if(!L.g(this.a, ((FtsTableInfo)object0).a)) {
            return false;
        }
        return L.g(this.b, ((FtsTableInfo)object0).b) ? L.g(this.c, ((FtsTableInfo)object0).c) : false;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "FtsTableInfo{name=\'" + this.a + "\', columns=" + this.b + ", options=" + this.c + "\'}";
    }
}

