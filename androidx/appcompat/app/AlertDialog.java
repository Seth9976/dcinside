package androidx.appcompat.app;

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
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.attr;

public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public static class Builder {
        private final AlertParams a;
        private final int b;

        public Builder(@NonNull Context context0) {
            this(context0, AlertDialog.n(context0, 0));
        }

        public Builder(@NonNull Context context0, @StyleRes int v) {
            this.a = new AlertParams(new ContextThemeWrapper(context0, AlertDialog.n(context0, v)));
            this.b = v;
        }

        @RestrictTo({Scope.c})
        public Builder A(boolean z) {
            this.a.Q = z;
            return this;
        }

        public Builder B(@ArrayRes int v, int v1, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.v = this.a.a.getResources().getTextArray(v);
            this.a.x = dialogInterface$OnClickListener0;
            this.a.I = v1;
            this.a.H = true;
            return this;
        }

        public Builder C(Cursor cursor0, int v, String s, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.K = cursor0;
            this.a.x = dialogInterface$OnClickListener0;
            this.a.I = v;
            this.a.L = s;
            this.a.H = true;
            return this;
        }

        public Builder D(ListAdapter listAdapter0, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.w = listAdapter0;
            this.a.x = dialogInterface$OnClickListener0;
            this.a.I = v;
            this.a.H = true;
            return this;
        }

        public Builder E(CharSequence[] arr_charSequence, int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.v = arr_charSequence;
            this.a.x = dialogInterface$OnClickListener0;
            this.a.I = v;
            this.a.H = true;
            return this;
        }

        public Builder F(@StringRes int v) {
            this.a.f = this.a.a.getText(v);
            return this;
        }

        public Builder G(int v) {
            this.a.z = null;
            this.a.y = v;
            this.a.E = false;
            return this;
        }

        @RestrictTo({Scope.c})
        @Deprecated
        public Builder H(View view0, int v, int v1, int v2, int v3) {
            this.a.z = view0;
            this.a.y = 0;
            this.a.E = true;
            this.a.A = v;
            this.a.B = v1;
            this.a.C = v2;
            this.a.D = v3;
            return this;
        }

        public AlertDialog I() {
            AlertDialog alertDialog0 = this.create();
            alertDialog0.show();
            return alertDialog0;
        }

        public Builder a(ListAdapter listAdapter0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.w = listAdapter0;
            this.a.x = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder b(boolean z) {
            this.a.r = z;
            return this;
        }

        public Builder c(Cursor cursor0, DialogInterface.OnClickListener dialogInterface$OnClickListener0, String s) {
            this.a.K = cursor0;
            this.a.L = s;
            this.a.x = dialogInterface$OnClickListener0;
            return this;
        }

        @NonNull
        public AlertDialog create() {
            AlertDialog alertDialog0 = new AlertDialog(this.a.a, this.b);
            this.a.a(alertDialog0.f);
            alertDialog0.setCancelable(this.a.r);
            if(this.a.r) {
                alertDialog0.setCanceledOnTouchOutside(true);
            }
            alertDialog0.setOnCancelListener(this.a.s);
            alertDialog0.setOnDismissListener(this.a.t);
            DialogInterface.OnKeyListener dialogInterface$OnKeyListener0 = this.a.u;
            if(dialogInterface$OnKeyListener0 != null) {
                alertDialog0.setOnKeyListener(dialogInterface$OnKeyListener0);
            }
            return alertDialog0;
        }

        public Builder d(@Nullable View view0) {
            this.a.g = view0;
            return this;
        }

        public Builder e(@DrawableRes int v) {
            this.a.c = v;
            return this;
        }

        public Builder f(@Nullable Drawable drawable0) {
            this.a.d = drawable0;
            return this;
        }

        public Builder g(@AttrRes int v) {
            TypedValue typedValue0 = new TypedValue();
            this.a.a.getTheme().resolveAttribute(v, typedValue0, true);
            this.a.c = typedValue0.resourceId;
            return this;
        }

        @NonNull
        public Context getContext() {
            return this.a.a;
        }

        @Deprecated
        public Builder h(boolean z) {
            this.a.N = z;
            return this;
        }

        public Builder i(@ArrayRes int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.v = this.a.a.getResources().getTextArray(v);
            this.a.x = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder j(CharSequence[] arr_charSequence, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.v = arr_charSequence;
            this.a.x = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder k(@StringRes int v) {
            this.a.h = this.a.a.getText(v);
            return this;
        }

        public Builder l(@Nullable CharSequence charSequence0) {
            this.a.h = charSequence0;
            return this;
        }

        public Builder m(@ArrayRes int v, boolean[] arr_z, DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
            this.a.v = this.a.a.getResources().getTextArray(v);
            this.a.J = dialogInterface$OnMultiChoiceClickListener0;
            this.a.F = arr_z;
            this.a.G = true;
            return this;
        }

        public Builder n(Cursor cursor0, String s, String s1, DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
            this.a.K = cursor0;
            this.a.J = dialogInterface$OnMultiChoiceClickListener0;
            this.a.M = s;
            this.a.L = s1;
            this.a.G = true;
            return this;
        }

        public Builder o(CharSequence[] arr_charSequence, boolean[] arr_z, DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
            this.a.v = arr_charSequence;
            this.a.J = dialogInterface$OnMultiChoiceClickListener0;
            this.a.F = arr_z;
            this.a.G = true;
            return this;
        }

        public Builder p(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.l = charSequence0;
            this.a.n = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder q(Drawable drawable0) {
            this.a.m = drawable0;
            return this;
        }

        public Builder r(@StringRes int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.o = this.a.a.getText(v);
            this.a.q = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder s(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.o = charSequence0;
            this.a.q = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setNegativeButton(@StringRes int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.l = this.a.a.getText(v);
            this.a.n = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setPositiveButton(@StringRes int v, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.i = this.a.a.getText(v);
            this.a.k = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence0) {
            this.a.f = charSequence0;
            return this;
        }

        public Builder setView(View view0) {
            this.a.z = view0;
            this.a.y = 0;
            this.a.E = false;
            return this;
        }

        public Builder t(Drawable drawable0) {
            this.a.p = drawable0;
            return this;
        }

        public Builder u(DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
            this.a.s = dialogInterface$OnCancelListener0;
            return this;
        }

        public Builder v(DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
            this.a.t = dialogInterface$OnDismissListener0;
            return this;
        }

        public Builder w(AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
            this.a.O = adapterView$OnItemSelectedListener0;
            return this;
        }

        public Builder x(DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
            this.a.u = dialogInterface$OnKeyListener0;
            return this;
        }

        public Builder y(CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
            this.a.i = charSequence0;
            this.a.k = dialogInterface$OnClickListener0;
            return this;
        }

        public Builder z(Drawable drawable0) {
            this.a.j = drawable0;
            return this;
        }
    }

    final AlertController f;
    static final int g = 0;
    static final int h = 1;

    protected AlertDialog(@NonNull Context context0) {
        this(context0, 0);
    }

    protected AlertDialog(@NonNull Context context0, @StyleRes int v) {
        super(context0, AlertDialog.n(context0, v));
        this.f = new AlertController(this.getContext(), this, this.getWindow());
    }

    protected AlertDialog(@NonNull Context context0, boolean z, @Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        this(context0, 0);
        this.setCancelable(z);
        this.setOnCancelListener(dialogInterface$OnCancelListener0);
    }

    public void A(View view0, int v, int v1, int v2, int v3) {
        this.f.v(view0, v, v1, v2, v3);
    }

    public Button l(int v) {
        return this.f.c(v);
    }

    public ListView m() {
        return this.f.e();
    }

    static int n(@NonNull Context context0, @StyleRes int v) {
        if((v >>> 24 & 0xFF) >= 1) {
            return v;
        }
        TypedValue typedValue0 = new TypedValue();
        context0.getTheme().resolveAttribute(attr.alertDialogTheme, typedValue0, true);
        return typedValue0.resourceId;
    }

    public void o(int v, CharSequence charSequence0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.f.l(v, charSequence0, dialogInterface$OnClickListener0, null, null);
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    protected void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.f.f();
    }

    // 去混淆评级： 低(20)
    @Override  // android.app.Dialog
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return this.f.h(v, keyEvent0) ? true : super.onKeyDown(v, keyEvent0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.app.Dialog
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        return this.f.i(v, keyEvent0) ? true : super.onKeyUp(v, keyEvent0);
    }

    public void p(int v, CharSequence charSequence0, Drawable drawable0, DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        this.f.l(v, charSequence0, dialogInterface$OnClickListener0, null, drawable0);
    }

    public void q(int v, CharSequence charSequence0, Message message0) {
        this.f.l(v, charSequence0, null, message0, null);
    }

    @Override  // androidx.appcompat.app.AppCompatDialog
    public void setTitle(CharSequence charSequence0) {
        super.setTitle(charSequence0);
        this.f.s(charSequence0);
    }

    @RestrictTo({Scope.c})
    void t(int v) {
        this.f.m(v);
    }

    public void u(View view0) {
        this.f.n(view0);
    }

    public void v(int v) {
        this.f.o(v);
    }

    public void w(Drawable drawable0) {
        this.f.p(drawable0);
    }

    public void x(int v) {
        TypedValue typedValue0 = new TypedValue();
        this.getContext().getTheme().resolveAttribute(v, typedValue0, true);
        this.f.o(typedValue0.resourceId);
    }

    public void y(CharSequence charSequence0) {
        this.f.q(charSequence0);
    }

    public void z(View view0) {
        this.f.u(view0);
    }
}

