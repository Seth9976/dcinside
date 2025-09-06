package androidx.compose.ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
public final class FontVariation {
    @Immutable
    public interface Setting {
        @l
        String a();

        boolean b();

        float c(@m Density arg1);
    }

    @Immutable
    static final class SettingFloat implements Setting {
        @l
        private final String a;
        private final float b;
        private final boolean c;

        public SettingFloat(@l String s, float f) {
            L.p(s, "axisName");
            super();
            this.a = s;
            this.b = f;
        }

        @Override  // androidx.compose.ui.text.font.FontVariation$Setting
        @l
        public String a() {
            return this.a;
        }

        @Override  // androidx.compose.ui.text.font.FontVariation$Setting
        public boolean b() {
            return this.c;
        }

        @Override  // androidx.compose.ui.text.font.FontVariation$Setting
        public float c(@m Density density0) {
            return this.b;
        }

        public final float d() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SettingFloat)) {
                return false;
            }
            return L.g(this.a(), ((SettingFloat)object0).a()) ? this.b == ((SettingFloat)object0).b : false;
        }

        @Override
        public int hashCode() {
            return this.a().hashCode() * 0x1F + Float.floatToIntBits(this.b);
        }

        @Override
        @l
        public String toString() {
            return "FontVariation.Setting(axisName=\'" + this.a() + "\', value=" + this.b + ')';
        }
    }

    @Immutable
    static final class SettingInt implements Setting {
        @l
        private final String a;
        private final int b;
        private final boolean c;

        public SettingInt(@l String s, int v) {
            L.p(s, "axisName");
            super();
            this.a = s;
            this.b = v;
        }

        @Override  // androidx.compose.ui.text.font.FontVariation$Setting
        @l
        public String a() {
            return this.a;
        }

        @Override  // androidx.compose.ui.text.font.FontVariation$Setting
        public boolean b() {
            return this.c;
        }

        @Override  // androidx.compose.ui.text.font.FontVariation$Setting
        public float c(@m Density density0) {
            return (float)this.b;
        }

        public final int d() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SettingInt)) {
                return false;
            }
            return L.g(this.a(), ((SettingInt)object0).a()) ? this.b == ((SettingInt)object0).b : false;
        }

        @Override
        public int hashCode() {
            return this.a().hashCode() * 0x1F + this.b;
        }

        @Override
        @l
        public String toString() {
            return "FontVariation.Setting(axisName=\'" + this.a() + "\', value=" + this.b + ')';
        }
    }

    @Immutable
    @s0({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
    static final class SettingTextUnit implements Setting {
        @l
        private final String a;
        private final long b;
        private final boolean c;

        private SettingTextUnit(String s, long v) {
            this.a = s;
            this.b = v;
            this.c = true;
        }

        public SettingTextUnit(String s, long v, w w0) {
            this(s, v);
        }

        @Override  // androidx.compose.ui.text.font.FontVariation$Setting
        @l
        public String a() {
            return this.a;
        }

        @Override  // androidx.compose.ui.text.font.FontVariation$Setting
        public boolean b() {
            return this.c;
        }

        @Override  // androidx.compose.ui.text.font.FontVariation$Setting
        public float c(@m Density density0) {
            if(density0 == null) {
                throw new IllegalArgumentException("density must not be null");
            }
            float f = density0.w1();
            return TextUnit.n(this.b) * f;
        }

        public final long d() {
            return this.b;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof SettingTextUnit)) {
                return false;
            }
            return L.g(this.a(), ((SettingTextUnit)object0).a()) ? TextUnit.j(this.b, ((SettingTextUnit)object0).b) : false;
        }

        @Override
        public int hashCode() {
            return this.a().hashCode() * 0x1F + TextUnit.o(this.b);
        }

        @Override
        @l
        public String toString() {
            return "FontVariation.Setting(axisName=\'" + this.a() + "\', value=" + TextUnit.u(this.b) + ')';
        }
    }

    @Immutable
    @s0({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,372:1\n10783#2:373\n11008#2,3:374\n11011#2,3:384\n361#3,7:377\n76#4:387\n96#4,5:388\n101#5,2:393\n33#5,6:395\n103#5:401\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:373\n52#1:374,3\n52#1:384,3\n52#1:377,7\n53#1:387\n53#1:388,5\n60#1:393,2\n60#1:395,6\n60#1:401\n*E\n"})
    public static final class Settings {
        @l
        private final List a;
        private final boolean b;
        public static final int c;

        static {
        }

        public Settings(@l Setting[] arr_fontVariation$Setting) {
            L.p(arr_fontVariation$Setting, "settings");
            super();
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            boolean z = false;
            for(int v = 0; v < arr_fontVariation$Setting.length; ++v) {
                Setting fontVariation$Setting0 = arr_fontVariation$Setting[v];
                String s = fontVariation$Setting0.a();
                ArrayList arrayList0 = linkedHashMap0.get(s);
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                    linkedHashMap0.put(s, arrayList0);
                }
                arrayList0.add(fontVariation$Setting0);
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: linkedHashMap0.entrySet()) {
                String s1 = (String)((Map.Entry)object0).getKey();
                List list0 = (List)((Map.Entry)object0).getValue();
                if(list0.size() != 1) {
                    throw new IllegalArgumentException(('\'' + s1 + "\' must be unique. Actual [ [" + u.m3(list0, null, null, null, 0, null, null, 0x3F, null) + ']').toString());
                }
                u.q0(arrayList1, list0);
            }
            ArrayList arrayList2 = new ArrayList(arrayList1);
            this.a = arrayList2;
            int v1 = arrayList2.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((Setting)arrayList2.get(v2)).b()) {
                    z = true;
                    break;
                }
            }
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        @l
        public final List b() {
            return this.a;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Settings ? L.g(this.a, ((Settings)object0).a) : false;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    @l
    public static final FontVariation a;
    public static final int b;

    static {
        FontVariation.a = new FontVariation();
    }

    @l
    public final Setting a(@l String s, float f) {
        L.p(s, "name");
        if(s.length() != 4) {
            throw new IllegalArgumentException(("Name must be exactly four characters. Actual: \'" + s + '\'').toString());
        }
        return new SettingFloat(s, f);
    }

    @l
    public final Settings b(@l FontWeight fontWeight0, int v, @l Setting[] arr_fontVariation$Setting) {
        L.p(fontWeight0, "weight");
        L.p(arr_fontVariation$Setting, "settings");
        t0 t00 = new t0(3);
        t00.a(this.g(fontWeight0.w()));
        t00.a(this.d(((float)v)));
        t00.b(arr_fontVariation$Setting);
        return new Settings(((Setting[])t00.d(new Setting[t00.c()])));
    }

    @l
    public final Setting c(int v) {
        if(-1000 > v || v >= 1001) {
            throw new IllegalArgumentException("\'GRAD\' must be in -1000..1000");
        }
        return new SettingInt("GRAD", v);
    }

    @l
    public final Setting d(float f) {
        if(0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("\'ital\' must be in 0.0f..1.0f. Actual: " + f).toString());
        }
        return new SettingFloat("ital", f);
    }

    @l
    public final Setting e(long v) {
        if(!TextUnit.q(v)) {
            throw new IllegalArgumentException("\'opsz\' must be provided in sp units");
        }
        return new SettingTextUnit("opsz", v, null);
    }

    @l
    public final Setting f(float f) {
        if(-90.0f > f || f > 90.0f) {
            throw new IllegalArgumentException(("\'slnt\' must be in -90f..90f. Actual: " + f).toString());
        }
        return new SettingFloat("slnt", f);
    }

    @l
    public final Setting g(int v) {
        if(1 > v || v >= 1001) {
            throw new IllegalArgumentException(("\'wght\' value must be in [1, 1000]. Actual: " + v).toString());
        }
        return new SettingInt("wght", v);
    }

    @l
    public final Setting h(float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException(("\'wdth\' must be strictly > 0.0f. Actual: " + f).toString());
        }
        return new SettingFloat("wdth", f);
    }
}

