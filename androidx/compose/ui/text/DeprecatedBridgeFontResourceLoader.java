package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.b;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;

final class DeprecatedBridgeFontResourceLoader implements ResourceLoader {
    @s0({"SMAP\nTextLayoutResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n+ 2 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n24#2:604\n1#3:605\n*S KotlinDebug\n*F\n+ 1 TextLayoutResult.kt\nandroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion\n*L\n290#1:604\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @l
        public final ResourceLoader a(@l Resolver fontFamily$Resolver0) {
            L.p(fontFamily$Resolver0, "fontFamilyResolver");
            synchronized(this.c()) {
                Companion deprecatedBridgeFontResourceLoader$Companion0 = DeprecatedBridgeFontResourceLoader.b;
                ResourceLoader font$ResourceLoader0 = (ResourceLoader)deprecatedBridgeFontResourceLoader$Companion0.b().get(fontFamily$Resolver0);
                if(font$ResourceLoader0 != null) {
                    return font$ResourceLoader0;
                }
                ResourceLoader font$ResourceLoader1 = new DeprecatedBridgeFontResourceLoader(fontFamily$Resolver0, null);
                deprecatedBridgeFontResourceLoader$Companion0.b().put(fontFamily$Resolver0, font$ResourceLoader1);
                return font$ResourceLoader1;
            }
        }

        @l
        public final Map b() {
            return DeprecatedBridgeFontResourceLoader.c;
        }

        @l
        public final SynchronizedObject c() {
            return DeprecatedBridgeFontResourceLoader.d;
        }

        public final void d(@l Map map0) {
            L.p(map0, "<set-?>");
            DeprecatedBridgeFontResourceLoader.c = map0;
        }
    }

    @l
    private final Resolver a;
    @l
    public static final Companion b;
    @l
    private static Map c;
    @l
    private static final SynchronizedObject d;

    static {
        DeprecatedBridgeFontResourceLoader.b = new Companion(null);
        DeprecatedBridgeFontResourceLoader.c = new LinkedHashMap();
        DeprecatedBridgeFontResourceLoader.d = Synchronization_jvmKt.a();
    }

    private DeprecatedBridgeFontResourceLoader(Resolver fontFamily$Resolver0) {
        this.a = fontFamily$Resolver0;
    }

    public DeprecatedBridgeFontResourceLoader(Resolver fontFamily$Resolver0, w w0) {
        this(fontFamily$Resolver0);
    }

    @Override  // androidx.compose.ui.text.font.Font$ResourceLoader
    @k(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @c0(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    @l
    public Object a(@l Font font0) {
        L.p(font0, "font");
        FontFamily fontFamily0 = FontKt.g(font0);
        FontWeight fontWeight0 = font0.b();
        int v = font0.d();
        return b.a(this.a, fontFamily0, fontWeight0, v, 0, 8, null).getValue();
    }
}

