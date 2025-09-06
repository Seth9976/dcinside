package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

class AppCompatEmojiTextHelper {
    @NonNull
    private final TextView a;
    @NonNull
    private final EmojiTextViewHelper b;

    AppCompatEmojiTextHelper(@NonNull TextView textView0) {
        this.a = textView0;
        this.b = new EmojiTextViewHelper(textView0, false);
    }

    @NonNull
    InputFilter[] a(@NonNull InputFilter[] arr_inputFilter) {
        return this.b.a(arr_inputFilter);
    }

    public boolean b() {
        return this.b.b();
    }

    void c(@Nullable AttributeSet attributeSet0, int v) {
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
        this.e(z);
    }

    void d(boolean z) {
        this.b.c(z);
    }

    void e(boolean z) {
        this.b.d(z);
    }

    @Nullable
    public TransformationMethod f(@Nullable TransformationMethod transformationMethod0) {
        return this.b.f(transformationMethod0);
    }
}

