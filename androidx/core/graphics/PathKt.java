package androidx.core.graphics;

import android.graphics.Path.Op;
import android.graphics.Path;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n37#1:62\n1#2:61\n1#2:63\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n46#1:62\n46#1:63\n*E\n"})
public final class PathKt {
    @l
    public static final Path a(@l Path path0, @l Path path1) {
        Path path2 = new Path();
        path2.op(path0, path1, Path.Op.INTERSECT);
        return path2;
    }

    @RequiresApi(26)
    @l
    public static final Iterable b(@l Path path0, float f) {
        return PathUtils.b(path0, f);
    }

    public static Iterable c(Path path0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.5f;
        }
        return PathKt.b(path0, f);
    }

    @l
    public static final Path d(@l Path path0, @l Path path1) {
        Path path2 = new Path(path0);
        path2.op(path1, Path.Op.DIFFERENCE);
        return path2;
    }

    @l
    public static final Path e(@l Path path0, @l Path path1) {
        Path path2 = new Path(path0);
        path2.op(path1, Path.Op.UNION);
        return path2;
    }

    @l
    public static final Path f(@l Path path0, @l Path path1) {
        Path path2 = new Path(path0);
        path2.op(path1, Path.Op.UNION);
        return path2;
    }

    @l
    public static final Path g(@l Path path0, @l Path path1) {
        Path path2 = new Path(path0);
        path2.op(path1, Path.Op.XOR);
        return path2;
    }
}

