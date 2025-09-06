package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nImageVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 2 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,768:1\n53#2,4:769\n*S KotlinDebug\n*F\n+ 1 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n*L\n707#1:769,4\n*E\n"})
public final class ImageVectorKt {
    @l
    public static final Builder d(@l Builder imageVector$Builder0, @l String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, @l List list0, @l Function1 function10) {
        L.p(imageVector$Builder0, "<this>");
        L.p(s, "name");
        L.p(list0, "clipPathData");
        L.p(function10, "block");
        imageVector$Builder0.a(s, f, f1, f2, f3, f4, f5, f6, list0);
        function10.invoke(imageVector$Builder0);
        imageVector$Builder0.g();
        return imageVector$Builder0;
    }

    public static Builder e(Builder imageVector$Builder0, String s, float f, float f1, float f2, float f3, float f4, float f5, float f6, List list0, Function1 function10, int v, Object object0) {
        String s1 = (v & 1) == 0 ? s : "";
        List list1 = (v & 0x100) == 0 ? list0 : VectorKt.h();
        L.p(imageVector$Builder0, "<this>");
        L.p(s1, "name");
        L.p(list1, "clipPathData");
        L.p(function10, "block");
        imageVector$Builder0.a(s1, ((v & 2) == 0 ? f : 0.0f), ((v & 4) == 0 ? f1 : 0.0f), ((v & 8) == 0 ? f2 : 0.0f), ((v & 16) == 0 ? f3 : 1.0f), ((v & 0x20) == 0 ? f4 : 1.0f), ((v & 0x40) == 0 ? f5 : 0.0f), ((v & 0x80) == 0 ? f6 : 0.0f), list1);
        function10.invoke(imageVector$Builder0);
        imageVector$Builder0.g();
        return imageVector$Builder0;
    }

    @l
    public static final Builder f(@l Builder imageVector$Builder0, @l String s, @m Brush brush0, float f, @m Brush brush1, float f1, float f2, int v, int v1, float f3, int v2, @l Function1 function10) {
        L.p(imageVector$Builder0, "$this$path");
        L.p(s, "name");
        L.p(function10, "pathBuilder");
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return Builder.d(imageVector$Builder0, pathBuilder0.g(), v2, s, brush0, f, brush1, f1, f2, v, v1, f3, 0.0f, 0.0f, 0.0f, 0x3800, null);
    }

    public static Builder g(Builder imageVector$Builder0, String s, Brush brush0, float f, Brush brush1, float f1, float f2, int v, int v1, float f3, int v2, Function1 function10, int v3, Object object0) {
        String s1 = (v3 & 1) == 0 ? s : "";
        L.p(imageVector$Builder0, "$this$path");
        L.p(s1, "name");
        L.p(function10, "pathBuilder");
        PathBuilder pathBuilder0 = new PathBuilder();
        function10.invoke(pathBuilder0);
        return Builder.d(imageVector$Builder0, pathBuilder0.g(), ((v3 & 0x200) == 0 ? v2 : 0), s1, ((v3 & 2) == 0 ? brush0 : null), ((v3 & 4) == 0 ? f : 1.0f), ((v3 & 8) == 0 ? brush1 : null), ((v3 & 16) == 0 ? f1 : 1.0f), ((v3 & 0x20) == 0 ? f2 : 0.0f), ((v3 & 0x40) == 0 ? v : 0), ((v3 & 0x80) == 0 ? v1 : 0), ((v3 & 0x100) == 0 ? f3 : 4.0f), 0.0f, 0.0f, 0.0f, 0x3800, null);
    }

    private static final Object h(ArrayList arrayList0) {
        return arrayList0.get(arrayList0.size() - 1);
    }

    private static final Object i(ArrayList arrayList0) {
        return arrayList0.remove(arrayList0.size() - 1);
    }

    private static final boolean j(ArrayList arrayList0, Object object0) {
        return arrayList0.add(object0);
    }
}

