package androidx.compose.ui.text.input;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.window.DialogWindowProvider;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@RequiresApi(30)
@s0({"SMAP\nInputMethodManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InputMethodManager.kt\nandroidx/compose/ui/text/input/ImmHelper30\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
final class ImmHelper30 implements ImmHelper {
    @l
    private final View a;
    @m
    private ImmHelper21 b;

    public ImmHelper30(@l View view0) {
        L.p(view0, "view");
        super();
        this.a = view0;
    }

    @Override  // androidx.compose.ui.text.input.ImmHelper
    @DoNotInline
    public void a(@l InputMethodManager inputMethodManager0) {
        L.p(inputMethodManager0, "imm");
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = this.f();
        if(windowInsetsControllerCompat0 != null) {
            windowInsetsControllerCompat0.d(8);
            return;
        }
        this.e().a(inputMethodManager0);
    }

    @Override  // androidx.compose.ui.text.input.ImmHelper
    @DoNotInline
    public void b(@l InputMethodManager inputMethodManager0) {
        L.p(inputMethodManager0, "imm");
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = this.f();
        if(windowInsetsControllerCompat0 != null) {
            windowInsetsControllerCompat0.k(8);
            return;
        }
        this.e().b(inputMethodManager0);
    }

    private final Window c(Context context0) {
        while(true) {
            if(context0 instanceof Activity) {
                return ((Activity)context0).getWindow();
            }
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            context0 = ((ContextWrapper)context0).getBaseContext();
            L.o(context0, "baseContext");
        }
        return null;
    }

    private final Window d(View view0) {
        ViewParent viewParent0 = view0.getParent();
        DialogWindowProvider dialogWindowProvider0 = viewParent0 instanceof DialogWindowProvider ? ((DialogWindowProvider)viewParent0) : null;
        if(dialogWindowProvider0 != null) {
            Window window0 = dialogWindowProvider0.getWindow();
            if(window0 != null) {
                return window0;
            }
        }
        Context context0 = view0.getContext();
        L.o(context0, "context");
        return this.c(context0);
    }

    private final ImmHelper21 e() {
        ImmHelper21 immHelper210 = this.b;
        if(immHelper210 == null) {
            immHelper210 = new ImmHelper21(this.a);
            this.b = immHelper210;
        }
        return immHelper210;
    }

    private final WindowInsetsControllerCompat f() {
        Window window0 = this.d(this.a);
        return window0 == null ? null : new WindowInsetsControllerCompat(window0, this.a);
    }
}

