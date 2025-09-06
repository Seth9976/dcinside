package androidx.room;

import androidx.annotation.RequiresApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import s3.a;
import s3.b;
import s3.e;
import s3.f;
import y4.l;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD})
@e(a.b)
@f(allowedTargets = {b.e, b.i})
public @interface ColumnInfo {
    @RequiresApi(21)
    @Retention(RetentionPolicy.CLASS)
    @e(a.b)
    public @interface Collate {
    }

    public static final class Companion {
        static final Companion a = null;
        @l
        public static final String b = "[field-name]";
        public static final int c = 1;
        public static final int d = 2;
        public static final int e = 3;
        public static final int f = 4;
        public static final int g = 5;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
        public static final int k = 4;
        @RequiresApi(21)
        public static final int l = 5;
        @RequiresApi(21)
        public static final int m = 6;
        @l
        public static final String n = "[value-unspecified]";

        static {
            Companion.a = new Companion();
        }
    }

    @Retention(RetentionPolicy.CLASS)
    @e(a.b)
    public @interface SQLiteTypeAffinity {
    }

    @l
    public static final Companion j = null;
    @l
    public static final String k = "[field-name]";
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 3;
    public static final int o = 4;
    public static final int p = 5;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    public static final int t = 4;
    @RequiresApi(21)
    public static final int u = 5;
    @RequiresApi(21)
    public static final int v = 6;
    @l
    public static final String w = "[value-unspecified]";

    static {
        ColumnInfo.j = Companion.a;
    }

    @Collate
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @SQLiteTypeAffinity
    int typeAffinity() default 1;
}

