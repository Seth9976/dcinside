package androidx.room.util;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.ColumnInfo.SQLiteTypeAffinity;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.k0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.v;
import s3.a;
import s3.e;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

@RestrictTo({Scope.c})
public final class TableInfo {
    public static final class Column {
        @s0({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,646:1\n1183#2,3:647\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n*L\n249#1:647,3\n*E\n"})
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            private final boolean a(String s) {
                if(s.length() == 0) {
                    return false;
                }
                int v = 0;
                int v1 = 0;
                for(int v2 = 0; v < s.length(); ++v2) {
                    int v3 = s.charAt(v);
                    if(v2 == 0 && v3 != 40) {
                        return false;
                    }
                    if(v3 == 40) {
                        ++v1;
                    }
                    else if(v3 == 41) {
                        --v1;
                        if(v1 == 0 && v2 != s.length() - 1) {
                            return false;
                        }
                    }
                    ++v;
                }
                return v1 == 0;
            }

            @VisibleForTesting
            @n
            public final boolean b(@l String s, @m String s1) {
                L.p(s, "current");
                if(L.g(s, s1)) {
                    return true;
                }
                if(this.a(s)) {
                    String s2 = s.substring(1, s.length() - 1);
                    L.o(s2, "this as java.lang.String…ing(startIndex, endIndex)");
                    return L.g(v.G5(s2).toString(), s1);
                }
                return false;
            }
        }

        @l
        @f
        public final String a;
        @l
        @f
        public final String b;
        @f
        public final boolean c;
        @f
        public final int d;
        @m
        @f
        public final String e;
        @f
        public final int f;
        @f
        public final int g;
        @l
        public static final Companion h;

        static {
            Column.h = new Companion(null);
        }

        @k(message = "Use {@link Column#Column(String, String, boolean, int, String, int)} instead.")
        public Column(@l String s, @l String s1, boolean z, int v) {
            L.p(s, "name");
            L.p(s1, "type");
            this(s, s1, z, v, null, 0);
        }

        public Column(@l String s, @l String s1, boolean z, int v, @m String s2, int v1) {
            L.p(s, "name");
            L.p(s1, "type");
            super();
            this.a = s;
            this.b = s1;
            this.c = z;
            this.d = v;
            this.e = s2;
            this.f = v1;
            this.g = this.b(s1);
        }

        @VisibleForTesting
        @n
        public static final boolean a(@l String s, @m String s1) {
            return Column.h.b(s, s1);
        }

        @SQLiteTypeAffinity
        private final int b(String s) {
            if(s == null) {
                return 5;
            }
            Locale locale0 = Locale.US;
            L.o(locale0, "US");
            String s1 = s.toUpperCase(locale0);
            L.o(s1, "this as java.lang.String).toUpperCase(locale)");
            if(v.W2(s1, "INT", false, 2, null)) {
                return 3;
            }
            if(!v.W2(s1, "CHAR", false, 2, null) && !v.W2(s1, "CLOB", false, 2, null) && !v.W2(s1, "TEXT", false, 2, null)) {
                if(v.W2(s1, "BLOB", false, 2, null)) {
                    return 5;
                }
                return v.W2(s1, "REAL", false, 2, null) || v.W2(s1, "FLOA", false, 2, null) || v.W2(s1, "DOUB", false, 2, null) ? 4 : 1;
            }
            return 2;
        }

        @SQLiteTypeAffinity
        public static void c() {
        }

        public final boolean d() {
            return this.d > 0;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Column)) {
                return false;
            }
            if(this.d != ((Column)object0).d) {
                return false;
            }
            if(!L.g(this.a, ((Column)object0).a)) {
                return false;
            }
            if(this.c != ((Column)object0).c) {
                return false;
            }
            if(this.f == 1 && ((Column)object0).f == 2 && (this.e != null && !Column.h.b(this.e, ((Column)object0).e))) {
                return false;
            }
            if(this.f == 2 && ((Column)object0).f == 1) {
                String s = ((Column)object0).e;
                if(s != null && !Column.h.b(s, this.e)) {
                    return false;
                }
            }
            if(this.f != 0 && this.f == ((Column)object0).f) {
                String s1 = this.e;
                if(s1 != null) {
                    return Column.h.b(s1, ((Column)object0).e) ? this.g == ((Column)object0).g : false;
                }
                return ((Column)object0).e == null ? this.g == ((Column)object0).g : false;
            }
            return this.g == ((Column)object0).g;
        }

        @Override
        public int hashCode() {
            int v = (this.a.hashCode() * 0x1F + this.g) * 0x1F;
            return this.c ? (v + 0x4CF) * 0x1F + this.d : (v + 0x4D5) * 0x1F + this.d;
        }

        @Override
        @l
        public String toString() {
            return "Column{name=\'" + this.a + "\', type=\'" + this.b + "\', affinity=\'" + this.g + "\', notNull=" + this.c + ", primaryKeyPosition=" + this.d + ", defaultValue=\'" + (this.e == null ? "undefined" : this.e) + "\'}";
        }
    }

    public static final class androidx.room.util.TableInfo.Companion {
        private androidx.room.util.TableInfo.Companion() {
        }

        public androidx.room.util.TableInfo.Companion(w w0) {
        }

        @l
        @n
        public final TableInfo a(@l SupportSQLiteDatabase supportSQLiteDatabase0, @l String s) {
            L.p(supportSQLiteDatabase0, "database");
            L.p(s, "tableName");
            return TableInfoKt.f(supportSQLiteDatabase0, s);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @e(a.a)
    public @interface CreatedFrom {
    }

    @RestrictTo({Scope.c})
    public static final class ForeignKey {
        @l
        @f
        public final String a;
        @l
        @f
        public final String b;
        @l
        @f
        public final String c;
        @l
        @f
        public final List d;
        @l
        @f
        public final List e;

        public ForeignKey(@l String s, @l String s1, @l String s2, @l List list0, @l List list1) {
            L.p(s, "referenceTable");
            L.p(s1, "onDelete");
            L.p(s2, "onUpdate");
            L.p(list0, "columnNames");
            L.p(list1, "referenceColumnNames");
            super();
            this.a = s;
            this.b = s1;
            this.c = s2;
            this.d = list0;
            this.e = list1;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ForeignKey)) {
                return false;
            }
            if(!L.g(this.a, ((ForeignKey)object0).a)) {
                return false;
            }
            if(!L.g(this.b, ((ForeignKey)object0).b)) {
                return false;
            }
            if(!L.g(this.c, ((ForeignKey)object0).c)) {
                return false;
            }
            return L.g(this.d, ((ForeignKey)object0).d) ? L.g(this.e, ((ForeignKey)object0).e) : false;
        }

        @Override
        public int hashCode() {
            return (((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode()) * 0x1F + this.e.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "ForeignKey{referenceTable=\'" + this.a + "\', onDelete=\'" + this.b + " +\', onUpdate=\'" + this.c + "\', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
        }
    }

    public static final class ForeignKeyWithSequence implements Comparable {
        private final int a;
        private final int b;
        @l
        private final String c;
        @l
        private final String d;

        public ForeignKeyWithSequence(int v, int v1, @l String s, @l String s1) {
            L.p(s, "from");
            L.p(s1, "to");
            super();
            this.a = v;
            this.b = v1;
            this.c = s;
            this.d = s1;
        }

        public int a(@l ForeignKeyWithSequence tableInfo$ForeignKeyWithSequence0) {
            L.p(tableInfo$ForeignKeyWithSequence0, "other");
            int v = this.a - tableInfo$ForeignKeyWithSequence0.a;
            return v == 0 ? this.b - tableInfo$ForeignKeyWithSequence0.b : v;
        }

        @l
        public final String b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }

        @Override
        public int compareTo(Object object0) {
            return this.a(((ForeignKeyWithSequence)object0));
        }

        public final int d() {
            return this.b;
        }

        @l
        public final String e() {
            return this.d;
        }
    }

    @RestrictTo({Scope.c})
    @s0({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Index\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1#2:647\n*E\n"})
    public static final class Index {
        public static final class androidx.room.util.TableInfo.Index.Companion {
            private androidx.room.util.TableInfo.Index.Companion() {
            }

            public androidx.room.util.TableInfo.Index.Companion(w w0) {
            }
        }

        @l
        @f
        public final String a;
        @f
        public final boolean b;
        @l
        @f
        public final List c;
        @l
        @f
        public List d;
        @l
        public static final androidx.room.util.TableInfo.Index.Companion e = null;
        @l
        public static final String f = "index_";

        static {
            Index.e = new androidx.room.util.TableInfo.Index.Companion(null);
        }

        @k(message = "Use {@link #Index(String, boolean, List, List)}")
        public Index(@l String s, boolean z, @l List list0) {
            L.p(s, "name");
            L.p(list0, "columns");
            int v = list0.size();
            ArrayList arrayList0 = new ArrayList(v);
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add("ASC");
            }
            this(s, z, list0, arrayList0);
        }

        public Index(@l String s, boolean z, @l List list0, @l List list1) {
            L.p(s, "name");
            L.p(list0, "columns");
            L.p(list1, "orders");
            super();
            this.a = s;
            this.b = z;
            this.c = list0;
            this.d = list1;
            Collection collection0 = list1;
            if(collection0.isEmpty()) {
                int v = list0.size();
                collection0 = new ArrayList(v);
                for(int v1 = 0; v1 < v; ++v1) {
                    ((ArrayList)collection0).add("ASC");
                }
            }
            this.d = (List)collection0;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof Index)) {
                return false;
            }
            if(this.b != ((Index)object0).b) {
                return false;
            }
            if(!L.g(this.c, ((Index)object0).c)) {
                return false;
            }
            if(!L.g(this.d, ((Index)object0).d)) {
                return false;
            }
            return v.v2(this.a, "index_", false, 2, null) ? v.v2(((Index)object0).a, "index_", false, 2, null) : L.g(this.a, ((Index)object0).a);
        }

        // 去混淆评级： 低(20)
        @Override
        public int hashCode() {
            return v.v2(this.a, "index_", false, 2, null) ? ((this.b + 0x73D447D3) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode() : ((this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c.hashCode()) * 0x1F + this.d.hashCode();
        }

        @Override
        @l
        public String toString() {
            return "Index{name=\'" + this.a + "\', unique=" + this.b + ", columns=" + this.c + ", orders=" + this.d + "\'}";
        }
    }

    @l
    @f
    public final String a;
    @l
    @f
    public final Map b;
    @l
    @f
    public final Set c;
    @m
    @f
    public final Set d;
    @l
    public static final androidx.room.util.TableInfo.Companion e = null;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;

    static {
        TableInfo.e = new androidx.room.util.TableInfo.Companion(null);
    }

    public TableInfo(@l String s, @l Map map0, @l Set set0) {
        L.p(s, "name");
        L.p(map0, "columns");
        L.p(set0, "foreignKeys");
        this(s, map0, set0, k0.k());
    }

    public TableInfo(@l String s, @l Map map0, @l Set set0, @m Set set1) {
        L.p(s, "name");
        L.p(map0, "columns");
        L.p(set0, "foreignKeys");
        super();
        this.a = s;
        this.b = map0;
        this.c = set0;
        this.d = set1;
    }

    public TableInfo(String s, Map map0, Set set0, Set set1, int v, w w0) {
        if((v & 8) != 0) {
            set1 = null;
        }
        this(s, map0, set0, set1);
    }

    @l
    @n
    public static final TableInfo a(@l SupportSQLiteDatabase supportSQLiteDatabase0, @l String s) {
        return TableInfo.e.a(supportSQLiteDatabase0, s);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TableInfo)) {
            return false;
        }
        if(!L.g(this.a, ((TableInfo)object0).a)) {
            return false;
        }
        if(!L.g(this.b, ((TableInfo)object0).b)) {
            return false;
        }
        if(!L.g(this.c, ((TableInfo)object0).c)) {
            return false;
        }
        Set set0 = this.d;
        if(set0 != null) {
            Set set1 = ((TableInfo)object0).d;
            return set1 == null ? true : L.g(set0, set1);
        }
        return true;
    }

    @Override
    public int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "TableInfo{name=\'" + this.a + "\', columns=" + this.b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}

