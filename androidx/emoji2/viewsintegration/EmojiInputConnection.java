package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({Scope.a})
final class EmojiInputConnection extends InputConnectionWrapper {
    public static class EmojiCompatDeleteHelper {
        public boolean a(@NonNull InputConnection inputConnection0, @NonNull Editable editable0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, boolean z) {
            return EmojiCompat.j(inputConnection0, editable0, v, v1, z);
        }

        // 去混淆评级： 低(30)
        public void b(@NonNull EditorInfo editorInfo0) {
        }
    }

    private final TextView a;
    private final EmojiCompatDeleteHelper b;

    EmojiInputConnection(@NonNull TextView textView0, @NonNull InputConnection inputConnection0, @NonNull EditorInfo editorInfo0) {
        this(textView0, inputConnection0, editorInfo0, new EmojiCompatDeleteHelper());
    }

    EmojiInputConnection(@NonNull TextView textView0, @NonNull InputConnection inputConnection0, @NonNull EditorInfo editorInfo0, @NonNull EmojiCompatDeleteHelper emojiInputConnection$EmojiCompatDeleteHelper0) {
        super(inputConnection0, false);
        this.a = textView0;
        this.b = emojiInputConnection$EmojiCompatDeleteHelper0;
        emojiInputConnection$EmojiCompatDeleteHelper0.b(editorInfo0);
    }

    private Editable a() {
        return this.a.getEditableText();
    }

    @Override  // android.view.inputmethod.InputConnectionWrapper
    public boolean deleteSurroundingText(int v, int v1) {
        Editable editable0 = this.a();
        return this.b.a(this, editable0, v, v1, false) || super.deleteSurroundingText(v, v1);
    }

    @Override  // android.view.inputmethod.InputConnectionWrapper
    public boolean deleteSurroundingTextInCodePoints(int v, int v1) {
        Editable editable0 = this.a();
        return this.b.a(this, editable0, v, v1, true) || super.deleteSurroundingTextInCodePoints(v, v1);
    }
}

