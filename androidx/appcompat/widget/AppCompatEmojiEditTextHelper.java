package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

class AppCompatEmojiEditTextHelper {
    @NonNull
    private final EditText a;
    @NonNull
    private final EmojiEditTextHelper b;

    AppCompatEmojiEditTextHelper(@NonNull EditText editText0) {
        this.a = editText0;
        this.b = new EmojiEditTextHelper(editText0, false);
    }

    // 去混淆评级： 低(20)
    @Nullable
    KeyListener a(@Nullable KeyListener keyListener0) {
        return this.b(keyListener0) ? this.b.b(keyListener0) : keyListener0;
    }

    boolean b(KeyListener keyListener0) {
        return !(keyListener0 instanceof NumberKeyListener);
    }

    boolean c() {
        return this.b.d();
    }

    void d(@Nullable AttributeSet attributeSet0, int v) {
        boolean z = true;
        TypedArray typedArray0 = this.a.getContext().obtainStyledAttributes(attributeSet0, styleable.AppCompatTextView, v, 0);
        try {
            if(typedArray0.hasValue(styleable.AppCompatTextView_emojiCompatEnabled)) {
                z = typedArray0.getBoolean(14, true);
            }
        }
        finally {
            typedArray0.recycle();
        }
        this.f(z);
    }

    @Nullable
    InputConnection e(@Nullable InputConnection inputConnection0, @NonNull EditorInfo editorInfo0) {
        return this.b.e(inputConnection0, editorInfo0);
    }

    void f(boolean z) {
        this.b.g(z);
    }
}

