package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RequiresApi(19)
@RestrictTo({Scope.a})
final class EmojiInputFilter implements InputFilter {
    @RequiresApi(19)
    static class InitCallbackImpl extends InitCallback {
        private final Reference a;
        private final Reference b;

        InitCallbackImpl(TextView textView0, EmojiInputFilter emojiInputFilter0) {
            this.a = new WeakReference(textView0);
            this.b = new WeakReference(emojiInputFilter0);
        }

        @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
        public void b() {
            super.b();
            TextView textView0 = (TextView)this.a.get();
            if(!this.c(textView0, ((InputFilter)this.b.get()))) {
                return;
            }
            if(textView0.isAttachedToWindow()) {
                CharSequence charSequence0 = textView0.getText();
                CharSequence charSequence1 = EmojiCompat.c().x(charSequence0);
                if(charSequence0 == charSequence1) {
                    return;
                }
                int v = Selection.getSelectionStart(charSequence1);
                int v1 = Selection.getSelectionEnd(charSequence1);
                textView0.setText(charSequence1);
                if(charSequence1 instanceof Spannable) {
                    EmojiInputFilter.b(((Spannable)charSequence1), v, v1);
                }
            }
        }

        private boolean c(@Nullable TextView textView0, @Nullable InputFilter inputFilter0) {
            if(inputFilter0 != null && textView0 != null) {
                InputFilter[] arr_inputFilter = textView0.getFilters();
                if(arr_inputFilter == null) {
                    return false;
                }
                for(int v = 0; v < arr_inputFilter.length; ++v) {
                    if(arr_inputFilter[v] == inputFilter0) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private final TextView a;
    private InitCallback b;

    EmojiInputFilter(@NonNull TextView textView0) {
        this.a = textView0;
    }

    private InitCallback a() {
        if(this.b == null) {
            this.b = new InitCallbackImpl(this.a, this);
        }
        return this.b;
    }

    static void b(Spannable spannable0, int v, int v1) {
        if(v >= 0 && v1 >= 0) {
            Selection.setSelection(spannable0, v, v1);
            return;
        }
        if(v >= 0) {
            Selection.setSelection(spannable0, v);
            return;
        }
        if(v1 >= 0) {
            Selection.setSelection(spannable0, v1);
        }
    }

    @Override  // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) {
        if(this.a.isInEditMode()) {
            return charSequence0;
        }
        switch(EmojiCompat.c().i()) {
            case 1: {
                if((v3 != 0 || v2 != 0 || spanned0.length() != 0 || charSequence0 != this.a.getText()) && charSequence0 != null) {
                    if(v != 0 || v1 != charSequence0.length()) {
                        charSequence0 = charSequence0.subSequence(v, v1);
                    }
                    return EmojiCompat.c().y(charSequence0, 0, charSequence0.length());
                }
                return charSequence0;
            }
            case 0: 
            case 3: {
                EmojiCompat.c().B(this.a());
                return charSequence0;
            }
            default: {
                return charSequence0;
            }
        }
    }
}

