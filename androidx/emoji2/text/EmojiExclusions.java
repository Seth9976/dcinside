package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.EmojiConsistency;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Set;

class EmojiExclusions {
    @RequiresApi(34)
    static class EmojiExclusions_Api34 {
        @DoNotInline
        @NonNull
        static Set a() {
            return EmojiExclusions_Reflections.a();
        }
    }

    static class EmojiExclusions_Reflections {
        @SuppressLint({"BanUncheckedReflection"})
        @NonNull
        static Set a() {
            Set set0 = EmojiConsistency.getEmojiConsistencySet();
            if(set0 == null) {
                return Collections.emptySet();
            }
            for(Object object0: set0) {
                if(!(object0 instanceof int[])) {
                    return Collections.emptySet();
                }
                if(false) {
                    break;
                }
            }
            return set0;
        }
    }

    @NonNull
    static Set a() {
        return Build.VERSION.SDK_INT < 34 ? EmojiExclusions_Reflections.a() : EmojiExclusions_Api34.a();
    }
}

