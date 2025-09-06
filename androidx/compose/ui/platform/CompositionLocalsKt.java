package androidx.compose.ui.platform;

import A3.o;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.input.PlatformTextInputPluginRegistry;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.S0;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import y4.l;
import y4.m;

public final class CompositionLocalsKt {
    @l
    private static final ProvidableCompositionLocal a;
    @l
    private static final ProvidableCompositionLocal b;
    @l
    private static final ProvidableCompositionLocal c;
    @l
    private static final ProvidableCompositionLocal d;
    @l
    private static final ProvidableCompositionLocal e;
    @l
    private static final ProvidableCompositionLocal f;
    @l
    private static final ProvidableCompositionLocal g;
    @l
    private static final ProvidableCompositionLocal h;
    @l
    private static final ProvidableCompositionLocal i;
    @l
    private static final ProvidableCompositionLocal j;
    @l
    private static final ProvidableCompositionLocal k;
    @l
    private static final ProvidableCompositionLocal l;
    @l
    private static final ProvidableCompositionLocal m;
    @l
    private static final ProvidableCompositionLocal n;
    @l
    private static final ProvidableCompositionLocal o;
    @l
    private static final ProvidableCompositionLocal p;
    @l
    private static final ProvidableCompositionLocal q;
    @l
    private static final ProvidableCompositionLocal r;

    static {
        CompositionLocalsKt.a = CompositionLocalKt.e(CompositionLocalsKt.LocalAccessibilityManager.1.e);
        CompositionLocalsKt.b = CompositionLocalKt.e(CompositionLocalsKt.LocalAutofill.1.e);
        CompositionLocalsKt.c = CompositionLocalKt.e(CompositionLocalsKt.LocalAutofillTree.1.e);
        CompositionLocalsKt.d = CompositionLocalKt.e(CompositionLocalsKt.LocalClipboardManager.1.e);
        CompositionLocalsKt.e = CompositionLocalKt.e(CompositionLocalsKt.LocalDensity.1.e);
        CompositionLocalsKt.f = CompositionLocalKt.e(CompositionLocalsKt.LocalFocusManager.1.e);
        CompositionLocalsKt.g = CompositionLocalKt.e(CompositionLocalsKt.LocalFontLoader.1.e);
        CompositionLocalsKt.h = CompositionLocalKt.e(CompositionLocalsKt.LocalFontFamilyResolver.1.e);
        CompositionLocalsKt.i = CompositionLocalKt.e(CompositionLocalsKt.LocalHapticFeedback.1.e);
        CompositionLocalsKt.j = CompositionLocalKt.e(CompositionLocalsKt.LocalInputModeManager.1.e);
        CompositionLocalsKt.k = CompositionLocalKt.e(CompositionLocalsKt.LocalLayoutDirection.1.e);
        CompositionLocalsKt.l = CompositionLocalKt.e(CompositionLocalsKt.LocalTextInputService.1.e);
        CompositionLocalsKt.m = CompositionLocalKt.e(CompositionLocalsKt.LocalPlatformTextInputPluginRegistry.1.e);
        CompositionLocalsKt.n = CompositionLocalKt.e(CompositionLocalsKt.LocalTextToolbar.1.e);
        CompositionLocalsKt.o = CompositionLocalKt.e(CompositionLocalsKt.LocalUriHandler.1.e);
        CompositionLocalsKt.p = CompositionLocalKt.e(CompositionLocalsKt.LocalViewConfiguration.1.e);
        CompositionLocalsKt.q = CompositionLocalKt.e(CompositionLocalsKt.LocalWindowInfo.1.e);
        CompositionLocalsKt.r = CompositionLocalKt.e(CompositionLocalsKt.LocalPointerIconService.1.e);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    @ExperimentalComposeUiApi
    public static final void a(@l Owner owner0, @l UriHandler uriHandler0, @l o o0, @m Composer composer0, int v) {
        L.p(owner0, "owner");
        L.p(uriHandler0, "uriHandler");
        L.p(o0, "content");
        Composer composer1 = composer0.G(0x34224BAD);
        int v1 = (v & 14) == 0 ? (composer1.t(owner0) ? 4 : 2) | v : v;
        if((v & 0x70) == 0) {
            v1 |= (composer1.t(uriHandler0) ? 0x20 : 16);
        }
        if((v & 0x380) == 0) {
            v1 |= (composer1.Y(o0) ? 0x100 : 0x80);
        }
        if((v1 & 731) != 0x92 || !composer1.c()) {
            if(ComposerKt.g0()) {
                ComposerKt.w0(0x34224BAD, v1, -1, "androidx.compose.ui.platform.ProvideCommonCompositionLocals (CompositionLocals.kt:188)");
            }
            AccessibilityManager accessibilityManager0 = owner0.getAccessibilityManager();
            ProvidedValue providedValue0 = CompositionLocalsKt.a.f(accessibilityManager0);
            Autofill autofill0 = owner0.getAutofill();
            ProvidedValue providedValue1 = CompositionLocalsKt.b.f(autofill0);
            AutofillTree autofillTree0 = owner0.getAutofillTree();
            ProvidedValue providedValue2 = CompositionLocalsKt.c.f(autofillTree0);
            ClipboardManager clipboardManager0 = owner0.getClipboardManager();
            ProvidedValue providedValue3 = CompositionLocalsKt.d.f(clipboardManager0);
            Density density0 = owner0.getDensity();
            ProvidedValue providedValue4 = CompositionLocalsKt.e.f(density0);
            FocusOwner focusOwner0 = owner0.getFocusOwner();
            ProvidedValue providedValue5 = CompositionLocalsKt.f.f(focusOwner0);
            ResourceLoader font$ResourceLoader0 = owner0.getFontLoader();
            ProvidedValue providedValue6 = CompositionLocalsKt.g.g(font$ResourceLoader0);
            Resolver fontFamily$Resolver0 = owner0.getFontFamilyResolver();
            ProvidedValue providedValue7 = CompositionLocalsKt.h.g(fontFamily$Resolver0);
            HapticFeedback hapticFeedback0 = owner0.getHapticFeedBack();
            ProvidedValue providedValue8 = CompositionLocalsKt.i.f(hapticFeedback0);
            InputModeManager inputModeManager0 = owner0.getInputModeManager();
            ProvidedValue providedValue9 = CompositionLocalsKt.j.f(inputModeManager0);
            LayoutDirection layoutDirection0 = owner0.getLayoutDirection();
            ProvidedValue providedValue10 = CompositionLocalsKt.k.f(layoutDirection0);
            TextInputService textInputService0 = owner0.getTextInputService();
            ProvidedValue providedValue11 = CompositionLocalsKt.l.f(textInputService0);
            PlatformTextInputPluginRegistry platformTextInputPluginRegistry0 = owner0.getPlatformTextInputPluginRegistry();
            ProvidedValue providedValue12 = CompositionLocalsKt.m.f(platformTextInputPluginRegistry0);
            TextToolbar textToolbar0 = owner0.getTextToolbar();
            ProvidedValue providedValue13 = CompositionLocalsKt.n.f(textToolbar0);
            ProvidedValue providedValue14 = CompositionLocalsKt.o.f(uriHandler0);
            ViewConfiguration viewConfiguration0 = owner0.getViewConfiguration();
            ProvidedValue providedValue15 = CompositionLocalsKt.p.f(viewConfiguration0);
            WindowInfo windowInfo0 = owner0.getWindowInfo();
            ProvidedValue providedValue16 = CompositionLocalsKt.q.f(windowInfo0);
            PointerIconService pointerIconService0 = owner0.getPointerIconService();
            CompositionLocalKt.b(new ProvidedValue[]{providedValue0, providedValue1, providedValue2, providedValue3, providedValue4, providedValue5, providedValue6, providedValue7, providedValue8, providedValue9, providedValue10, providedValue11, providedValue12, providedValue13, providedValue14, providedValue15, providedValue16, CompositionLocalsKt.r.f(pointerIconService0)}, o0, composer1, v1 >> 3 & 0x70 | 8);
            if(ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        else {
            composer1.m();
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.I();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.a(new o(owner0, uriHandler0, o0, v) {
                final Owner e;
                final UriHandler f;
                final o g;
                final int h;

                {
                    this.e = owner0;
                    this.f = uriHandler0;
                    this.g = o0;
                    this.h = v;
                    super(2);
                }

                public final void a(@m Composer composer0, int v) {
                    CompositionLocalsKt.a(this.e, this.f, this.g, composer0, (this.h | 1) & -920350135 | ((0x24924924 & (this.h | 1)) >> 1 | 306783378 & (this.h | 1)) | (306783378 & (this.h | 1)) << 1 & (0x24924924 & (this.h | 1)));
                }

                @Override  // A3.o
                public Object invoke(Object object0, Object object1) {
                    this.a(((Composer)object0), ((Number)object1).intValue());
                    return S0.a;
                }
            });
        }
    }

    @l
    public static final ProvidableCompositionLocal c() {
        return CompositionLocalsKt.a;
    }

    @ExperimentalComposeUiApi
    @l
    public static final ProvidableCompositionLocal d() {
        return CompositionLocalsKt.b;
    }

    @ExperimentalComposeUiApi
    public static void e() {
    }

    @ExperimentalComposeUiApi
    @l
    public static final ProvidableCompositionLocal f() {
        return CompositionLocalsKt.c;
    }

    @ExperimentalComposeUiApi
    public static void g() {
    }

    @l
    public static final ProvidableCompositionLocal h() {
        return CompositionLocalsKt.d;
    }

    @l
    public static final ProvidableCompositionLocal i() {
        return CompositionLocalsKt.e;
    }

    @l
    public static final ProvidableCompositionLocal j() {
        return CompositionLocalsKt.f;
    }

    @l
    public static final ProvidableCompositionLocal k() {
        return CompositionLocalsKt.h;
    }

    @l
    public static final ProvidableCompositionLocal l() {
        return CompositionLocalsKt.g;
    }

    @k(message = "LocalFontLoader is replaced with LocalFontFamilyResolver", replaceWith = @c0(expression = "LocalFontFamilyResolver", imports = {}))
    public static void m() {
    }

    @l
    public static final ProvidableCompositionLocal n() {
        return CompositionLocalsKt.i;
    }

    @l
    public static final ProvidableCompositionLocal o() {
        return CompositionLocalsKt.j;
    }

    @l
    public static final ProvidableCompositionLocal p() {
        return CompositionLocalsKt.k;
    }

    @ExperimentalTextApi
    @l
    public static final ProvidableCompositionLocal q() {
        return CompositionLocalsKt.m;
    }

    @ExperimentalTextApi
    public static void r() {
    }

    @l
    public static final ProvidableCompositionLocal s() {
        return CompositionLocalsKt.r;
    }

    @l
    public static final ProvidableCompositionLocal t() {
        return CompositionLocalsKt.l;
    }

    @l
    public static final ProvidableCompositionLocal u() {
        return CompositionLocalsKt.n;
    }

    @l
    public static final ProvidableCompositionLocal v() {
        return CompositionLocalsKt.o;
    }

    @l
    public static final ProvidableCompositionLocal w() {
        return CompositionLocalsKt.p;
    }

    @l
    public static final ProvidableCompositionLocal x() {
        return CompositionLocalsKt.q;
    }

    private static final Void y(String s) {
        throw new IllegalStateException(("CompositionLocal " + s + " not present").toString());
    }
}

