package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.TextInputSession;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class KeyboardActionRunner implements KeyboardActionScope {
    public KeyboardActions a;
    public FocusManager b;
    @m
    private TextInputSession c;

    // 去混淆评级： 低(22)
    @Override  // androidx.compose.foundation.text.KeyboardActionScope
    public void a(int v) {
        if(ImeAction.l(v, 6)) {
            this.b().i(1);
            return;
        }
        if(ImeAction.l(v, 5)) {
            this.b().i(2);
            return;
        }
        if(ImeAction.l(v, 7)) {
            TextInputSession textInputSession0 = this.c;
            if(textInputSession0 != null) {
                textInputSession0.c();
            }
        }
    }

    @l
    public final FocusManager b() {
        FocusManager focusManager0 = this.b;
        if(focusManager0 != null) {
            return focusManager0;
        }
        L.S("focusManager");
        return null;
    }

    @m
    public final TextInputSession c() {
        return this.c;
    }

    @l
    public final KeyboardActions d() {
        KeyboardActions keyboardActions0 = this.a;
        if(keyboardActions0 != null) {
            return keyboardActions0;
        }
        L.S("keyboardActions");
        return null;
    }

    public final void e(int v) {
        Function1 function10;
        S0 s00 = null;
        if(ImeAction.l(v, 7)) {
            function10 = this.d().b();
        }
        else {
            if(ImeAction.l(v, 2)) {
                function10 = this.d().c();
                goto label_21;
            }
            if(ImeAction.l(v, 6)) {
                function10 = this.d().d();
                goto label_21;
            }
            if(ImeAction.l(v, 5)) {
                function10 = this.d().e();
                goto label_21;
            }
            if(ImeAction.l(v, 3)) {
                function10 = this.d().f();
                goto label_21;
            }
            if(ImeAction.l(v, 4)) {
                function10 = this.d().g();
            }
            else if((ImeAction.l(v, 1) ? true : ImeAction.l(v, 0))) {
                function10 = null;
            }
            else {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
    label_21:
        if(function10 != null) {
            function10.invoke(this);
            s00 = S0.a;
        }
        if(s00 == null) {
            this.a(v);
        }
    }

    public final void f(@l FocusManager focusManager0) {
        L.p(focusManager0, "<set-?>");
        this.b = focusManager0;
    }

    public final void g(@m TextInputSession textInputSession0) {
        this.c = textInputSession0;
    }

    public final void h(@l KeyboardActions keyboardActions0) {
        L.p(keyboardActions0, "<set-?>");
        this.a = keyboardActions0;
    }
}

