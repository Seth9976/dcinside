package androidx.compose.ui.text.platform;

import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.State;
import y4.l;
import y4.m;

public final class EmojiCompatStatus implements EmojiCompatStatusDelegate {
    @l
    public static final EmojiCompatStatus a;
    @l
    private static EmojiCompatStatusDelegate b;

    static {
        EmojiCompatStatus.a = new EmojiCompatStatus();
        EmojiCompatStatus.b = new DefaultImpl();
    }

    // 检测为 Lambda 实现
    @Override  // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    @l
    public State a() [...]

    @VisibleForTesting
    public final void b(@m EmojiCompatStatusDelegate emojiCompatStatusDelegate0) {
        if(emojiCompatStatusDelegate0 == null) {
            emojiCompatStatusDelegate0 = new DefaultImpl();
        }
        EmojiCompatStatus.b = emojiCompatStatusDelegate0;
    }
}

