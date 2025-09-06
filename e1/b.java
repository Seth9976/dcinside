package E1;

import O1.a;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListAdapter;
import androidx.annotation.ArrayRes;
import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.color.v;
import com.google.android.material.shape.k;

public class b extends Builder {
    @Nullable
    private Drawable c;
    @NonNull
    private final Rect d;
    @AttrRes
    private static final int e;
    @StyleRes
    private static final int f;
    @AttrRes
    private static final int g;

    static {
        b.e = attr.alertDialogStyle;
        b.f = style.MaterialAlertDialog_MaterialComponents;
        b.g = attr.materialAlertDialogTheme;
    }

    public b(@NonNull Context context0) {
        this(context0, 0);
    }

    public b(@NonNull Context context0, int v) {
        super(b.J(context0), b.M(context0, v));
        Context context1 = this.getContext();
        Resources.Theme resources$Theme0 = context1.getTheme();
        this.d = c.a(context1, b.e, b.f);
        String s = this.getClass().getCanonicalName();
        int v1 = v.c(context1, attr.colorSurface, s);
        TypedArray typedArray0 = context1.obtainStyledAttributes(null, styleable.MaterialAlertDialog, b.e, b.f);
        int v2 = typedArray0.getColor(styleable.MaterialAlertDialog_backgroundTint, v1);
        typedArray0.recycle();
        k k0 = new k(context1, null, b.e, b.f);
        k0.a0(context1);
        k0.p0(ColorStateList.valueOf(v2));
        if(Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue0 = new TypedValue();
            resources$Theme0.resolveAttribute(0x1010571, typedValue0, true);
            float f = typedValue0.getDimension(this.getContext().getResources().getDisplayMetrics());
            if(typedValue0.type == 5 && f >= 0.0f) {
                k0.l0(f);
            }
        }
        this.c = k0;
    }

    @a
    @NonNull
    public b A0(@Nullable View view0) {
        return (b)super.setView(view0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder B(@ArrayRes int v, int v1, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.t0(v, v1, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder C(@Nullable Cursor cursor0, int v, @NonNull String s, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.u0(cursor0, v, s, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder D(@Nullable ListAdapter listAdapter0, int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.v0(listAdapter0, v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder E(@Nullable CharSequence[] arr_charSequence, int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.w0(arr_charSequence, v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder F(@StringRes int v) {
        return this.x0(v);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder G(int v) {
        return this.z0(v);
    }

    private static Context J(@NonNull Context context0) {
        int v = b.L(context0);
        Context context1 = I1.a.c(context0, null, b.e, b.f);
        return v == 0 ? context1 : new ContextThemeWrapper(context1, v);
    }

    @Nullable
    public Drawable K() {
        return this.c;
    }

    private static int L(@NonNull Context context0) {
        TypedValue typedValue0 = com.google.android.material.resources.b.a(context0, b.g);
        return typedValue0 == null ? 0 : typedValue0.data;
    }

    private static int M(@NonNull Context context0, int v) {
        return v == 0 ? b.L(context0) : v;
    }

    @a
    @NonNull
    public b N(@Nullable ListAdapter listAdapter0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.a(listAdapter0, dialogInterface$OnClickListener0);
    }

    @a
    @NonNull
    public b O(@Nullable Drawable drawable0) {
        this.c = drawable0;
        return this;
    }

    @a
    @NonNull
    public b P(@Px int v) {
        this.d.bottom = v;
        return this;
    }

    @a
    @NonNull
    public b Q(@Px int v) {
        if(this.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.d.left = v;
            return this;
        }
        this.d.right = v;
        return this;
    }

    @a
    @NonNull
    public b R(@Px int v) {
        if(this.getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.d.right = v;
            return this;
        }
        this.d.left = v;
        return this;
    }

    @a
    @NonNull
    public b S(@Px int v) {
        this.d.top = v;
        return this;
    }

    @a
    @NonNull
    public b T(boolean z) {
        return (b)super.b(z);
    }

    @a
    @NonNull
    public b U(@Nullable Cursor cursor0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0, @NonNull String s) {
        return (b)super.c(cursor0, dialogInterface$OnClickListener0, s);
    }

    @a
    @NonNull
    public b V(@Nullable View view0) {
        return (b)super.d(view0);
    }

    @a
    @NonNull
    public b W(@DrawableRes int v) {
        return (b)super.e(v);
    }

    @a
    @NonNull
    public b X(@Nullable Drawable drawable0) {
        return (b)super.f(drawable0);
    }

    @a
    @NonNull
    public b Y(@AttrRes int v) {
        return (b)super.g(v);
    }

    @a
    @NonNull
    public b Z(@ArrayRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.i(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder a(@Nullable ListAdapter listAdapter0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.N(listAdapter0, dialogInterface$OnClickListener0);
    }

    @a
    @NonNull
    public b a0(@Nullable CharSequence[] arr_charSequence, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.j(arr_charSequence, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder b(boolean z) {
        return this.T(z);
    }

    @a
    @NonNull
    public b b0(@StringRes int v) {
        return (b)super.k(v);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder c(@Nullable Cursor cursor0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0, @NonNull String s) {
        return this.U(cursor0, dialogInterface$OnClickListener0, s);
    }

    @a
    @NonNull
    public b c0(@Nullable CharSequence charSequence0) {
        return (b)super.l(charSequence0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @NonNull
    public AlertDialog create() {
        AlertDialog alertDialog0 = super.create();
        Window window0 = alertDialog0.getWindow();
        View view0 = window0.getDecorView();
        Drawable drawable0 = this.c;
        if(drawable0 instanceof k) {
            ((k)drawable0).o0(ViewCompat.V(view0));
        }
        window0.setBackgroundDrawable(c.b(this.c, this.d));
        view0.setOnTouchListener(new E1.a(alertDialog0, this.d));
        return alertDialog0;
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder d(@Nullable View view0) {
        return this.V(view0);
    }

    @a
    @NonNull
    public b d0(@ArrayRes int v, @Nullable boolean[] arr_z, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return (b)super.m(v, arr_z, dialogInterface$OnMultiChoiceClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder e(@DrawableRes int v) {
        return this.W(v);
    }

    @a
    @NonNull
    public b e0(@Nullable Cursor cursor0, @NonNull String s, @NonNull String s1, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return (b)super.n(cursor0, s, s1, dialogInterface$OnMultiChoiceClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder f(@Nullable Drawable drawable0) {
        return this.X(drawable0);
    }

    @a
    @NonNull
    public b f0(@Nullable CharSequence[] arr_charSequence, @Nullable boolean[] arr_z, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return (b)super.o(arr_charSequence, arr_z, dialogInterface$OnMultiChoiceClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder g(@AttrRes int v) {
        return this.Y(v);
    }

    @a
    @NonNull
    public b g0(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.setNegativeButton(v, dialogInterface$OnClickListener0);
    }

    @a
    @NonNull
    public b h0(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.p(charSequence0, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder i(@ArrayRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.Z(v, dialogInterface$OnClickListener0);
    }

    @a
    @NonNull
    public b i0(@Nullable Drawable drawable0) {
        return (b)super.q(drawable0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder j(@Nullable CharSequence[] arr_charSequence, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.a0(arr_charSequence, dialogInterface$OnClickListener0);
    }

    @a
    @NonNull
    public b j0(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.r(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder k(@StringRes int v) {
        return this.b0(v);
    }

    @a
    @NonNull
    public b k0(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.s(charSequence0, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder l(@Nullable CharSequence charSequence0) {
        return this.c0(charSequence0);
    }

    @a
    @NonNull
    public b l0(@Nullable Drawable drawable0) {
        return (b)super.t(drawable0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder m(@ArrayRes int v, @Nullable boolean[] arr_z, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return this.d0(v, arr_z, dialogInterface$OnMultiChoiceClickListener0);
    }

    @a
    @NonNull
    public b m0(@Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return (b)super.u(dialogInterface$OnCancelListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder n(@Nullable Cursor cursor0, @NonNull String s, @NonNull String s1, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return this.e0(cursor0, s, s1, dialogInterface$OnMultiChoiceClickListener0);
    }

    @a
    @NonNull
    public b n0(@Nullable DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return (b)super.v(dialogInterface$OnDismissListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder o(@Nullable CharSequence[] arr_charSequence, @Nullable boolean[] arr_z, @Nullable DialogInterface.OnMultiChoiceClickListener dialogInterface$OnMultiChoiceClickListener0) {
        return this.f0(arr_charSequence, arr_z, dialogInterface$OnMultiChoiceClickListener0);
    }

    @a
    @NonNull
    public b o0(@Nullable AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        return (b)super.w(adapterView$OnItemSelectedListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder p(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.h0(charSequence0, dialogInterface$OnClickListener0);
    }

    @a
    @NonNull
    public b p0(@Nullable DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
        return (b)super.x(dialogInterface$OnKeyListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder q(@Nullable Drawable drawable0) {
        return this.i0(drawable0);
    }

    @a
    @NonNull
    public b q0(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.setPositiveButton(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder r(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.j0(v, dialogInterface$OnClickListener0);
    }

    @a
    @NonNull
    public b r0(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.y(charSequence0, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder s(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.k0(charSequence0, dialogInterface$OnClickListener0);
    }

    @a
    @NonNull
    public b s0(@Nullable Drawable drawable0) {
        return (b)super.z(drawable0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder setNegativeButton(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.g0(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder setPositiveButton(@StringRes int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.q0(v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder setTitle(@Nullable CharSequence charSequence0) {
        return this.y0(charSequence0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder setView(@Nullable View view0) {
        return this.A0(view0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder t(@Nullable Drawable drawable0) {
        return this.l0(drawable0);
    }

    @a
    @NonNull
    public b t0(@ArrayRes int v, int v1, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.B(v, v1, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder u(@Nullable DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        return this.m0(dialogInterface$OnCancelListener0);
    }

    @a
    @NonNull
    public b u0(@Nullable Cursor cursor0, int v, @NonNull String s, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.C(cursor0, v, s, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder v(@Nullable DialogInterface.OnDismissListener dialogInterface$OnDismissListener0) {
        return this.n0(dialogInterface$OnDismissListener0);
    }

    @a
    @NonNull
    public b v0(@Nullable ListAdapter listAdapter0, int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.D(listAdapter0, v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder w(@Nullable AdapterView.OnItemSelectedListener adapterView$OnItemSelectedListener0) {
        return this.o0(adapterView$OnItemSelectedListener0);
    }

    @a
    @NonNull
    public b w0(@Nullable CharSequence[] arr_charSequence, int v, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return (b)super.E(arr_charSequence, v, dialogInterface$OnClickListener0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder x(@Nullable DialogInterface.OnKeyListener dialogInterface$OnKeyListener0) {
        return this.p0(dialogInterface$OnKeyListener0);
    }

    @a
    @NonNull
    public b x0(@StringRes int v) {
        return (b)super.F(v);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder y(@Nullable CharSequence charSequence0, @Nullable DialogInterface.OnClickListener dialogInterface$OnClickListener0) {
        return this.r0(charSequence0, dialogInterface$OnClickListener0);
    }

    @a
    @NonNull
    public b y0(@Nullable CharSequence charSequence0) {
        return (b)super.setTitle(charSequence0);
    }

    @Override  // androidx.appcompat.app.AlertDialog$Builder
    @a
    @NonNull
    public Builder z(@Nullable Drawable drawable0) {
        return this.s0(drawable0);
    }

    @a
    @NonNull
    public b z0(int v) {
        return (b)super.G(v);
    }
}

