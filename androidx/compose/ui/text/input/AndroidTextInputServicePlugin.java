package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidComposeView_androidKt;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidTextInputServicePlugin implements PlatformTextInputPlugin {
    @StabilityInferred(parameters = 0)
    public static final class Adapter implements PlatformTextInputAdapter {
        @l
        private final TextInputService a;
        @l
        private final TextInputServiceAndroid b;
        public static final int c = 8;

        static {
        }

        public Adapter(@l TextInputService textInputService0, @l TextInputServiceAndroid textInputServiceAndroid0) {
            L.p(textInputService0, "service");
            L.p(textInputServiceAndroid0, "androidService");
            super();
            this.a = textInputService0;
            this.b = textInputServiceAndroid0;
        }

        @Override  // androidx.compose.ui.text.input.PlatformTextInputAdapter
        @l
        public TextInputForTests a() {
            TextInputForTests textInputForTests0 = this.a instanceof TextInputForTests ? ((TextInputForTests)this.a) : null;
            if(textInputForTests0 == null) {
                throw new IllegalStateException("Text input service wrapper not set up! Did you use ComposeTestRule?");
            }
            return textInputForTests0;
        }

        @Override  // androidx.compose.ui.text.input.PlatformTextInputAdapter
        public void b() {
        }

        @Override  // androidx.compose.ui.text.input.PlatformTextInputAdapter
        @l
        public InputConnection c(@l EditorInfo editorInfo0) {
            L.p(editorInfo0, "outAttrs");
            return this.b.l(editorInfo0);
        }

        @l
        public final TextInputService d() {
            return this.a;
        }
    }

    @l
    public static final AndroidTextInputServicePlugin a;

    static {
        AndroidTextInputServicePlugin.a = new AndroidTextInputServicePlugin();
    }

    // 检测为 Lambda 实现
    @Override  // androidx.compose.ui.text.input.PlatformTextInputPlugin
    public PlatformTextInputAdapter a(PlatformTextInput platformTextInput0, View view0) [...]

    @l
    public Adapter b(@l PlatformTextInput platformTextInput0, @l View view0) {
        L.p(platformTextInput0, "platformTextInput");
        L.p(view0, "view");
        TextInputServiceAndroid textInputServiceAndroid0 = new TextInputServiceAndroid(view0, platformTextInput0);
        return new Adapter(((TextInputService)AndroidComposeView_androidKt.e().invoke(textInputServiceAndroid0)), textInputServiceAndroid0);
    }
}

