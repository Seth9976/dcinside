package androidx.compose.ui.text.platform;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import androidx.emoji2.text.EmojiCompat;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

final class DefaultImpl implements EmojiCompatStatusDelegate {
    @m
    private State a;

    public DefaultImpl() {
        this.a = null;
    }

    @Override  // androidx.compose.ui.text.platform.EmojiCompatStatusDelegate
    @l
    public State a() {
        State state0 = this.a;
        if(state0 != null) {
            L.m(state0);
            return state0;
        }
        return EmojiCompatStatusKt.a;
    }

    private final State c() {
        EmojiCompat emojiCompat0 = EmojiCompat.c();
        L.o(emojiCompat0, "get()");
        if(emojiCompat0.i() == 1) {
            return new ImmutableBool(true);
        }
        MutableState mutableState0 = SnapshotStateKt__SnapshotStateKt.g(Boolean.FALSE, null, 2, null);
        emojiCompat0.B(new InitCallback() {
            @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
            public void a(@m Throwable throwable0) {
                ImmutableBool immutableBool0 = EmojiCompatStatusKt.a;
                this.b.a = immutableBool0;
            }

            @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
            public void b() {
                this.setValue(Boolean.TRUE);
                ImmutableBool immutableBool0 = new ImmutableBool(true);
                this.b.a = immutableBool0;
            }
        });
        return mutableState0;
    }
}

