package androidx.compose.ui.node;

import A3.a;
import android.view.KeyEvent;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.text.input.PlatformTextInputPluginRegistry;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import y4.l;
import y4.m;

public interface Owner {
    public static final class Companion {
        static final Companion a;
        private static boolean b;

        static {
            Companion.a = new Companion();
        }

        public final boolean a() [...] // 潜在的解密器

        public final void b(boolean z) {
            Companion.b = z;
        }
    }

    public interface OnLayoutCompletedListener {
        void s();
    }

    @l
    public static final Companion q0;

    static {
        Owner.q0 = Companion.a;
    }

    void a(boolean arg1);

    void b(@l LayoutNode arg1, boolean arg2, boolean arg3);

    void c(@l LayoutNode arg1);

    void d(@l a arg1);

    void e(@l OnLayoutCompletedListener arg1);

    @l
    AccessibilityManager getAccessibilityManager();

    @ExperimentalComposeUiApi
    @m
    Autofill getAutofill();

    @ExperimentalComposeUiApi
    @l
    AutofillTree getAutofillTree();

    @l
    ClipboardManager getClipboardManager();

    @l
    Density getDensity();

    @l
    FocusOwner getFocusOwner();

    @l
    Resolver getFontFamilyResolver();

    @l
    ResourceLoader getFontLoader();

    @l
    HapticFeedback getHapticFeedBack();

    @l
    InputModeManager getInputModeManager();

    @l
    LayoutDirection getLayoutDirection();

    long getMeasureIteration();

    @l
    ModifierLocalManager getModifierLocalManager();

    @l
    PlatformTextInputPluginRegistry getPlatformTextInputPluginRegistry();

    @l
    PointerIconService getPointerIconService();

    @l
    LayoutNode getRoot();

    @l
    RootForTest getRootForTest();

    @l
    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    @l
    OwnerSnapshotObserver getSnapshotObserver();

    @l
    TextInputService getTextInputService();

    @l
    TextToolbar getTextToolbar();

    @l
    ViewConfiguration getViewConfiguration();

    @l
    WindowInfo getWindowInfo();

    @l
    OwnedLayer i(@l Function1 arg1, @l a arg2);

    void j(@l LayoutNode arg1, long arg2);

    long l(long arg1);

    void o();

    void p(@l LayoutNode arg1, boolean arg2, boolean arg3);

    long q(long arg1);

    boolean requestFocus();

    void s(@l LayoutNode arg1);

    @InternalCoreApi
    void setShowLayoutBounds(boolean arg1);

    void t(@l LayoutNode arg1);

    @m
    FocusDirection u(@l KeyEvent arg1);

    void v(@l LayoutNode arg1);

    void w(@l LayoutNode arg1);

    void z();
}

