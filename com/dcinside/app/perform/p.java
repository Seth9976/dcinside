package com.dcinside.app.perform;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.k;
import y4.l;
import y4.m;
import z3.j;

public class p extends AppCompatDialog implements DialogInterface {
    public static class a {
        @l
        private final f a;
        private final int b;

        @j
        public a(@l Context context0) {
            L.p(context0, "context");
            this(context0, 0, 2, null);
        }

        @j
        public a(@l Context context0, @StyleRes int v) {
            L.p(context0, "context");
            super();
            this.a = new f(new ContextThemeWrapper(context0, p.h.a(context0, v)));
            this.b = v;
        }

        public a(Context context0, int v, int v1, w w0) {
            if((v1 & 2) != 0) {
                v = p.h.a(context0, 0);
            }
            this(context0, v);
        }

        @l
        public a A(@m DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
            this.a.u = dialogInterface$OnKeyListener0;
            return this;
        }

        @l
        public a B(@StringRes int v, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.i = this.a.a.getText(v);
            this.a.k = dialogInterface$OnClickListener0;
            return this;
        }

        @l
        public a C(@m CharSequence charSequence0, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.i = charSequence0;
            this.a.k = dialogInterface$OnClickListener0;
            return this;
        }

        @l
        public a D(@m Drawable drawable0) {
            this.a.j = drawable0;
            return this;
        }

        @RestrictTo({Scope.c})
        @l
        public final a E(boolean z) {
            this.a.Q = z;
            return this;
        }

        @l
        public a F(@ArrayRes int v, int v1, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.v = this.a.a.getResources().getTextArray(v);
            this.a.x = dialogInterface$OnClickListener0;
            this.a.I = v1;
            this.a.H = true;
            return this;
        }

        @l
        public a G(@m Cursor cursor0, int v, @m String s, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.K = cursor0;
            this.a.x = dialogInterface$OnClickListener0;
            this.a.I = v;
            this.a.L = s;
            this.a.H = true;
            return this;
        }

        @l
        public a H(@m ListAdapter listAdapter0, int v, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.w = listAdapter0;
            this.a.x = dialogInterface$OnClickListener0;
            this.a.I = v;
            this.a.H = true;
            return this;
        }

        @l
        public a I(@m CharSequence[] arr_charSequence, int v, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.v = arr_charSequence;
            this.a.x = dialogInterface$OnClickListener0;
            this.a.I = v;
            this.a.H = true;
            return this;
        }

        @l
        public a J(@StringRes int v) {
            this.a.f = this.a.a.getText(v);
            return this;
        }

        @l
        public a K(@m CharSequence charSequence0) {
            this.a.f = charSequence0;
            return this;
        }

        @l
        public a L(int v) {
            this.a.z = null;
            this.a.y = v;
            this.a.E = false;
            return this;
        }

        @l
        public a M(@m View view0) {
            this.a.z = view0;
            this.a.y = 0;
            this.a.E = false;
            return this;
        }

        @RestrictTo({Scope.c})
        @k(message = "This method has been deprecated.")
        @l
        public final a N(@m View view0, int v, int v1, int v2, int v3) {
            this.a.z = view0;
            this.a.y = 0;
            this.a.E = true;
            this.a.A = v;
            this.a.B = v1;
            this.a.C = v2;
            this.a.D = v3;
            return this;
        }

        @l
        public final p O() {
            p p0 = this.a();
            p0.show();
            return p0;
        }

        @l
        public p a() {
            L.o(this.a.a, "mContext");
            p p0 = new p(this.a.a, this.b);
            this.a.a(p0.f);
            p0.setCancelable(this.a.r);
            if(this.a.r) {
                p0.setCanceledOnTouchOutside(true);
            }
            p0.setOnCancelListener(this.a.s);
            p0.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener dialogInterface$OnKeyListener0 = this.a.u;
            if(dialogInterface$OnKeyListener0 != null) {
                p0.setOnKeyListener(dialogInterface$OnKeyListener0);
            }
            return p0;
        }

        @l
        public final Context b() {
            L.o(this.a.a, "mContext");
            return this.a.a;
        }

        @l
        public a c(@m ListAdapter listAdapter0, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.w = listAdapter0;
            this.a.x = dialogInterface$OnClickListener0;
            return this;
        }

        @l
        public a d(boolean z) {
            this.a.r = z;
            return this;
        }

        @l
        public a e(@m Cursor cursor0, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0, @m String s) {
            this.a.K = cursor0;
            this.a.L = s;
            this.a.x = dialogInterface$OnClickListener0;
            return this;
        }

        @l
        public a f(@m View view0) {
            this.a.g = view0;
            return this;
        }

        @l
        public a g(@DrawableRes int v) {
            this.a.c = v;
            return this;
        }

        @l
        public a h(@m Drawable drawable0) {
            this.a.d = drawable0;
            return this;
        }

        @l
        public a i(@AttrRes int v) {
            TypedValue typedValue0 = new TypedValue();
            this.a.a.getTheme().resolveAttribute(v, typedValue0, true);
            this.a.c = typedValue0.resourceId;
            return this;
        }

        @k(message = "This flag is only used for pre-Material themes. Instead,\n                      specify the window background using on the alert dialog\n                      theme.")
        @l
        public final a j(boolean z) {
            this.a.N = z;
            return this;
        }

        @l
        public a k(@ArrayRes int v, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.v = this.a.a.getResources().getTextArray(v);
            this.a.x = dialogInterface$OnClickListener0;
            return this;
        }

        @l
        public a l(@m CharSequence[] arr_charSequence, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.v = arr_charSequence;
            this.a.x = dialogInterface$OnClickListener0;
            return this;
        }

        @l
        public a m(@StringRes int v) {
            this.a.h = this.a.a.getText(v);
            return this;
        }

        @l
        public a n(@m CharSequence charSequence0) {
            this.a.h = charSequence0;
            return this;
        }

        @l
        public a o(@ArrayRes int v, @m boolean[] arr_z, @m DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
            this.a.v = this.a.a.getResources().getTextArray(v);
            this.a.J = dialogInterface$OnMultiChoiceClickListener0;
            this.a.F = arr_z;
            this.a.G = true;
            return this;
        }

        @l
        public a p(@m Cursor cursor0, @m String s, @m String s1, @m DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
            this.a.K = cursor0;
            this.a.J = dialogInterface$OnMultiChoiceClickListener0;
            this.a.M = s;
            this.a.L = s1;
            this.a.G = true;
            return this;
        }

        @l
        public a q(@m CharSequence[] arr_charSequence, @m boolean[] arr_z, @m DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
            this.a.v = arr_charSequence;
            this.a.J = dialogInterface$OnMultiChoiceClickListener0;
            this.a.F = arr_z;
            this.a.G = true;
            return this;
        }

        @l
        public a r(@StringRes int v, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.l = this.a.a.getText(v);
            this.a.n = dialogInterface$OnClickListener0;
            return this;
        }

        @l
        public a s(@m CharSequence charSequence0, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.l = charSequence0;
            this.a.n = dialogInterface$OnClickListener0;
            return this;
        }

        @l
        public a t(@m Drawable drawable0) {
            this.a.m = drawable0;
            return this;
        }

        @l
        public a u(@StringRes int v, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.o = this.a.a.getText(v);
            this.a.q = dialogInterface$OnClickListener0;
            return this;
        }

        @l
        public a v(@m CharSequence charSequence0, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.o = charSequence0;
            this.a.q = dialogInterface$OnClickListener0;
            return this;
        }

        @l
        public a w(@m Drawable drawable0) {
            this.a.p = drawable0;
            return this;
        }

        @l
        public a x(@m DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
            this.a.s = dialogInterface$OnCancelListener0;
            return this;
        }

        @l
        public a y(@m DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
            this.a.t = dialogInterface$OnDismissListener0;
            return this;
        }

        @l
        public a z(@m AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
            this.a.O = adapterView$OnItemSelectedListener0;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public b(w w0) {
        }

        public final int a(@l Context context0, @StyleRes int v) {
            L.p(context0, "context");
            if((v >>> 24 & 0xFF) < 1) {
                TypedValue typedValue0 = new TypedValue();
                context0.getTheme().resolveAttribute(0x7F04003F, typedValue0, true);  // attr:alertDialogTheme
                return typedValue0.resourceId;
            }
            return v;
        }
    }

    @l
    private final o f;
    private boolean g;
    @l
    public static final b h = null;
    public static final int i = 0;
    public static final int j = 1;

    static {
        p.h = new b(null);
    }

    public p(@l Context context0, @StyleRes int v) {
        L.p(context0, "context");
        super(context0, p.h.a(context0, v));
        this.f = new o(this.getContext(), this, this.getWindow());
    }

    public p(Context context0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        this(context0, v);
    }

    public p(@l Context context0, boolean z, @m DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        L.p(context0, "context");
        this(context0, 0);
        this.setCancelable(z);
        this.setOnCancelListener(dialogInterface$OnCancelListener0);
    }

    public final void A(@m View view0, int v, int v1, int v2, int v3) {
        this.f.v(view0, v, v1, v2, v3);
    }

    @l
    public final Button m(int v) {
        Button button0 = this.f.c(v);
        L.o(button0, "getButton(...)");
        return button0;
    }

    @l
    public final ListView n() {
        ListView listView0 = this.f.e();
        L.o(listView0, "getListView(...)");
        return listView0;
    }

    public final void o(int v, @m CharSequence charSequence0, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.f.l(v, charSequence0, dialogInterface$OnClickListener0, null, null);
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        this.f.f();
    }

    @Override  // android.app.Dialog
    public boolean onKeyDown(int v, @l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        return this.f.h(v, keyEvent0) ? true : super.onKeyDown(v, keyEvent0);
    }

    @Override  // android.app.Dialog
    public boolean onKeyUp(int v, @l KeyEvent keyEvent0) {
        L.p(keyEvent0, "event");
        return this.f.i(v, keyEvent0) ? true : super.onKeyUp(v, keyEvent0);
    }

    @Override  // androidx.activity.ComponentDialog
    protected void onStart() {
        super.onStart();
        this.g = true;
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    protected void onStop() {
        if(this.g) {
            super.onStop();
            this.g = false;
        }
    }

    public final void p(int v, @m CharSequence charSequence0, @m Drawable drawable0, @m DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.f.l(v, charSequence0, dialogInterface$OnClickListener0, null, drawable0);
    }

    public final void q(int v, @m CharSequence charSequence0, @m Message message0) {
        this.f.l(v, charSequence0, null, message0, null);
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setTitle(@m CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.f.s(charSequence0);
    }

    @RestrictTo({Scope.c})
    public final void t(int v) {
        this.f.m(v);
    }

    public final void u(@m View view0) {
        this.f.n(view0);
    }

    public final void v(int v) {
        this.f.o(v);
    }

    public final void w(@m Drawable drawable0) {
        this.f.p(drawable0);
    }

    public final void x(int v) {
        TypedValue typedValue0 = new TypedValue();
        this.getContext().getTheme().resolveAttribute(v, typedValue0, true);
        this.f.o(typedValue0.resourceId);
    }

    public final void y(@m CharSequence charSequence0) {
        this.f.q(charSequence0);
    }

    public final void z(@m View view0) {
        this.f.u(view0);
    }
}

