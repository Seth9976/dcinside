package androidx.emoji2.viewsintegration;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;

public final class EmojiEditTextHelper {
    @RequiresApi(19)
    static class HelperInternal19 extends HelperInternal {
        private final EditText a;
        private final EmojiTextWatcher b;

        HelperInternal19(@NonNull EditText editText0, boolean z) {
            this.a = editText0;
            EmojiTextWatcher emojiTextWatcher0 = new EmojiTextWatcher(editText0, z);
            this.b = emojiTextWatcher0;
            editText0.addTextChangedListener(emojiTextWatcher0);
            editText0.setEditableFactory(EmojiEditableFactory.getInstance());
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal
        KeyListener a(@Nullable KeyListener keyListener0) {
            if(keyListener0 instanceof EmojiKeyListener) {
                return keyListener0;
            }
            if(keyListener0 == null) {
                return null;
            }
            return keyListener0 instanceof NumberKeyListener ? keyListener0 : new EmojiKeyListener(keyListener0);
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal
        boolean b() {
            return this.b.d();
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal
        InputConnection c(@NonNull InputConnection inputConnection0, @NonNull EditorInfo editorInfo0) {
            return inputConnection0 instanceof EmojiInputConnection ? inputConnection0 : new EmojiInputConnection(this.a, inputConnection0, editorInfo0);
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal
        void d(int v) {
            this.b.f(v);
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal
        void e(boolean z) {
            this.b.g(z);
        }

        @Override  // androidx.emoji2.viewsintegration.EmojiEditTextHelper$HelperInternal
        void f(int v) {
            this.b.h(v);
        }
    }

    static class HelperInternal {
        @Nullable
        KeyListener a(@Nullable KeyListener keyListener0) {
            return keyListener0;
        }

        boolean b() {
            return false;
        }

        InputConnection c(@NonNull InputConnection inputConnection0, @NonNull EditorInfo editorInfo0) {
            return inputConnection0;
        }

        void d(int v) {
        }

        void e(boolean z) {
        }

        void f(int v) {
        }
    }

    private final HelperInternal a;
    private int b;
    private int c;

    public EmojiEditTextHelper(@NonNull EditText editText0) {
        this(editText0, true);
    }

    public EmojiEditTextHelper(@NonNull EditText editText0, boolean z) {
        this.b = 0x7FFFFFFF;
        this.c = 0;
        Preconditions.m(editText0, "editText cannot be null");
        this.a = new HelperInternal19(editText0, z);
    }

    @RestrictTo({Scope.b})
    public int a() {
        return this.c;
    }

    @Nullable
    public KeyListener b(@Nullable KeyListener keyListener0) {
        return this.a.a(keyListener0);
    }

    public int c() {
        return this.b;
    }

    public boolean d() {
        return this.a.b();
    }

    @Nullable
    public InputConnection e(@Nullable InputConnection inputConnection0, @NonNull EditorInfo editorInfo0) {
        return inputConnection0 == null ? null : this.a.c(inputConnection0, editorInfo0);
    }

    @RestrictTo({Scope.b})
    public void f(int v) {
        this.c = v;
        this.a.d(v);
    }

    public void g(boolean z) {
        this.a.e(z);
    }

    public void h(@IntRange(from = 0L) int v) {
        Preconditions.j(v, "maxEmojiCount should be greater than 0");
        this.b = v;
        this.a.f(v);
    }
}

