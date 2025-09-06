package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.TempListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@Immutable
public final class TextDecoration {
    @s0({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n108#2,3:112\n111#2,2:119\n113#2:122\n33#3,4:115\n38#3:121\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:119,2\n57#1:122\n57#1:115,4\n57#1:121\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final TextDecoration a(@l List list0) {
            L.p(list0, "decorations");
            Integer integer0 = 0;
            int v1 = list0.size();
            for(int v = 0; v < v1; ++v) {
                integer0 = (int)(integer0.intValue() | ((TextDecoration)list0.get(v)).e());
            }
            return new TextDecoration(integer0.intValue());
        }

        @l
        public final TextDecoration b() {
            return TextDecoration.f;
        }

        @Stable
        public static void c() {
        }

        @l
        public final TextDecoration d() {
            return TextDecoration.d;
        }

        @Stable
        public static void e() {
        }

        @l
        public final TextDecoration f() {
            return TextDecoration.e;
        }

        @Stable
        public static void g() {
        }
    }

    private final int a;
    @l
    public static final Companion b;
    public static final int c;
    @l
    private static final TextDecoration d;
    @l
    private static final TextDecoration e;
    @l
    private static final TextDecoration f;

    static {
        TextDecoration.b = new Companion(null);
        TextDecoration.d = new TextDecoration(0);
        TextDecoration.e = new TextDecoration(1);
        TextDecoration.f = new TextDecoration(2);
    }

    public TextDecoration(int v) {
        this.a = v;
    }

    public final boolean d(@l TextDecoration textDecoration0) {
        L.p(textDecoration0, "other");
        return (textDecoration0.a | this.a) == this.a;
    }

    public final int e() {
        return this.a;
    }

    @Override
    public boolean equals(@m Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TextDecoration ? this.a == ((TextDecoration)object0).a : false;
    }

    @l
    public final TextDecoration f(@l TextDecoration textDecoration0) {
        L.p(textDecoration0, "decoration");
        return new TextDecoration(textDecoration0.a | this.a);
    }

    @Override
    public int hashCode() {
        return this.a;
    }

    @Override
    @l
    public String toString() {
        if(this.a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList0 = new ArrayList();
        if((this.a & TextDecoration.e.a) != 0) {
            arrayList0.add("Underline");
        }
        if((this.a & TextDecoration.f.a) != 0) {
            arrayList0.add("LineThrough");
        }
        return arrayList0.size() == 1 ? "TextDecoration." + ((String)arrayList0.get(0)) : "TextDecoration[" + TempListUtilsKt.l(arrayList0, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}

