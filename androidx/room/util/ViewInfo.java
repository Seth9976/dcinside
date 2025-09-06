package androidx.room.util;

import android.database.Cursor;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.io.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;
import z3.n;

@RestrictTo({Scope.c})
public final class ViewInfo {
    @s0({"SMAP\nViewInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInfo.kt\nandroidx/room/util/ViewInfo$Companion\n+ 2 CursorUtil.kt\nandroidx/room/util/CursorUtil\n*L\n1#1,83:1\n145#2,7:84\n*S KotlinDebug\n*F\n+ 1 ViewInfo.kt\nandroidx/room/util/ViewInfo$Companion\n*L\n73#1:84,7\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        @n
        public final ViewInfo a(@l SupportSQLiteDatabase supportSQLiteDatabase0, @l String s) {
            ViewInfo viewInfo0;
            L.p(supportSQLiteDatabase0, "database");
            L.p(s, "viewName");
            Cursor cursor0 = supportSQLiteDatabase0.x3("SELECT name, sql FROM sqlite_master WHERE type = \'view\' AND name = \'" + s + '\'');
            try {
                if(cursor0.moveToFirst()) {
                    String s1 = cursor0.getString(0);
                    L.o(s1, "cursor.getString(0)");
                    viewInfo0 = new ViewInfo(s1, cursor0.getString(1));
                }
                else {
                    viewInfo0 = new ViewInfo(s, null);
                }
                goto label_15;
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
        label_15:
            c.a(cursor0, null);
            return viewInfo0;
        }
    }

    @l
    @f
    public final String a;
    @m
    @f
    public final String b;
    @l
    public static final Companion c;

    static {
        ViewInfo.c = new Companion(null);
    }

    public ViewInfo(@l String s, @m String s1) {
        L.p(s, "name");
        super();
        this.a = s;
        this.b = s1;
    }

    @l
    @n
    public static final ViewInfo a(@l SupportSQLiteDatabase supportSQLiteDatabase0, @l String s) {
        return ViewInfo.c.a(supportSQLiteDatabase0, s);
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ViewInfo)) {
            return false;
        }
        if(L.g(this.a, ((ViewInfo)object0).a)) {
            String s = ((ViewInfo)object0).b;
            return this.b == null ? s == null : L.g(this.b, s);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    @l
    public String toString() {
        return "ViewInfo{name=\'" + this.a + "\', sql=\'" + this.b + "\'}";
    }
}

