package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nStringHelpers.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringHelpers.android.kt\nandroidx/compose/foundation/text/StringHelpers_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
public final class StringHelpers_androidKt {
    public static final int a(@l String s, int v) {
        L.p(s, "<this>");
        EmojiCompat emojiCompat0 = StringHelpers_androidKt.c();
        Integer integer0 = null;
        if(emojiCompat0 != null) {
            Integer integer1 = emojiCompat0.e(s, v);
            if(integer1.intValue() != -1) {
                integer0 = integer1;
            }
        }
        if(integer0 != null) {
            return (int)integer0;
        }
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.following(v);
    }

    public static final int b(@l String s, int v) {
        L.p(s, "<this>");
        EmojiCompat emojiCompat0 = StringHelpers_androidKt.c();
        Integer integer0 = null;
        if(emojiCompat0 != null) {
            Integer integer1 = emojiCompat0.h(s, Math.max(0, v - 1));
            if(integer1.intValue() != -1) {
                integer0 = integer1;
            }
        }
        if(integer0 != null) {
            return (int)integer0;
        }
        BreakIterator breakIterator0 = BreakIterator.getCharacterInstance();
        breakIterator0.setText(s);
        return breakIterator0.preceding(v);
    }

    // 去混淆评级： 低(30)
    private static final EmojiCompat c() {
        return null;
    }
}

