package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi(19)
@RestrictTo({Scope.a})
final class EmojiKeyListener implements KeyListener {
    public static class EmojiCompatHandleKeyDownHelper {
        public boolean a(@NonNull Editable editable0, int v, @NonNull KeyEvent keyEvent0) {
            return EmojiCompat.k(editable0, v, keyEvent0);
        }
    }

    private final KeyListener a;
    private final EmojiCompatHandleKeyDownHelper b;

    EmojiKeyListener(KeyListener keyListener0) {
        this(keyListener0, new EmojiCompatHandleKeyDownHelper());
    }

    EmojiKeyListener(KeyListener keyListener0, EmojiCompatHandleKeyDownHelper emojiKeyListener$EmojiCompatHandleKeyDownHelper0) {
        this.a = keyListener0;
        this.b = emojiKeyListener$EmojiCompatHandleKeyDownHelper0;
    }

    @Override  // android.text.method.KeyListener
    public void clearMetaKeyState(View view0, Editable editable0, int v) {
        this.a.clearMetaKeyState(view0, editable0, v);
    }

    @Override  // android.text.method.KeyListener
    public int getInputType() {
        return this.a.getInputType();
    }

    // 去混淆评级： 低(20)
    @Override  // android.text.method.KeyListener
    public boolean onKeyDown(View view0, Editable editable0, int v, KeyEvent keyEvent0) {
        return this.b.a(editable0, v, keyEvent0) || this.a.onKeyDown(view0, editable0, v, keyEvent0);
    }

    @Override  // android.text.method.KeyListener
    public boolean onKeyOther(View view0, Editable editable0, KeyEvent keyEvent0) {
        return this.a.onKeyOther(view0, editable0, keyEvent0);
    }

    @Override  // android.text.method.KeyListener
    public boolean onKeyUp(View view0, Editable editable0, int v, KeyEvent keyEvent0) {
        return this.a.onKeyUp(view0, editable0, v, keyEvent0);
    }
}

