package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
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
final class EmojiTextWatcher implements TextWatcher {
    @RequiresApi(19)
    static class InitCallbackImpl extends InitCallback {
        private final Reference a;

        InitCallbackImpl(EditText editText0) {
            this.a = new WeakReference(editText0);
        }

        @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
        public void b() {
            super.b();
            EmojiTextWatcher.e(((EditText)this.a.get()), 1);
        }
    }

    private final EditText a;
    private final boolean b;
    private InitCallback c;
    private int d;
    private int e;
    private boolean f;

    EmojiTextWatcher(EditText editText0, boolean z) {
        this.d = 0x7FFFFFFF;
        this.e = 0;
        this.a = editText0;
        this.b = z;
        this.f = true;
    }

    int a() {
        return this.e;
    }

    @Override  // android.text.TextWatcher
    public void afterTextChanged(Editable editable0) {
    }

    private InitCallback b() {
        if(this.c == null) {
            this.c = new InitCallbackImpl(this.a);
        }
        return this.c;
    }

    @Override  // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
    }

    int c() {
        return this.d;
    }

    public boolean d() {
        return this.f;
    }

    static void e(@Nullable EditText editText0, int v) {
        if(v == 1 && editText0 != null && editText0.isAttachedToWindow()) {
            Editable editable0 = editText0.getEditableText();
            int v1 = Selection.getSelectionStart(editable0);
            int v2 = Selection.getSelectionEnd(editable0);
            EmojiCompat.c().x(editable0);
            EmojiInputFilter.b(editable0, v1, v2);
        }
    }

    void f(int v) {
        this.e = v;
    }

    public void g(boolean z) {
        if(this.f != z) {
            if(this.c != null) {
                EmojiCompat.c().F(this.c);
            }
            this.f = z;
            if(z) {
                int v = EmojiCompat.c().i();
                EmojiTextWatcher.e(this.a, v);
            }
        }
    }

    void h(int v) {
        this.d = v;
    }

    // 去混淆评级： 中等(50)
    private boolean i() {
        return !this.f || !this.b;
    }

    @Override  // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        if(!this.a.isInEditMode() && !this.i() && v1 <= v2 && charSequence0 instanceof Spannable) {
            switch(EmojiCompat.c().i()) {
                case 1: {
                    EmojiCompat.c().A(((Spannable)charSequence0), v, v + v2, this.d, this.e);
                    return;
                }
                case 0: 
                case 3: {
                    EmojiCompat.c().B(this.b());
                    break;
                }
            }
        }
    }
}

