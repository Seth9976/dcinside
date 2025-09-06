package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.styleable;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.TintableBackgroundView;

public class AppCompatSpinner extends Spinner implements TintableBackgroundView {
    @RequiresApi(23)
    static final class Api23Impl {
        @DoNotInline
        static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter0, @Nullable Resources.Theme resources$Theme0) {
            if(!ObjectsCompat.a(themedSpinnerAdapter0.getDropDownViewTheme(), resources$Theme0)) {
                themedSpinnerAdapter0.setDropDownViewTheme(resources$Theme0);
            }
        }
    }

    @VisibleForTesting
    class DialogPopup implements DialogInterface.OnClickListener, SpinnerPopup {
        @VisibleForTesting
        AlertDialog a;
        private ListAdapter b;
        private CharSequence c;
        final AppCompatSpinner d;

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void a(Drawable drawable0) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public boolean b() {
            return this.a == null ? false : this.a.isShowing();
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public Drawable d() {
            return null;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void dismiss() {
            AlertDialog alertDialog0 = this.a;
            if(alertDialog0 != null) {
                alertDialog0.dismiss();
                this.a = null;
            }
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void e(int v) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void f(int v) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void g(int v, int v1) {
            if(this.b == null) {
                return;
            }
            Builder alertDialog$Builder0 = new Builder(AppCompatSpinner.this.getPopupContext());
            CharSequence charSequence0 = this.c;
            if(charSequence0 != null) {
                alertDialog$Builder0.setTitle(charSequence0);
            }
            AlertDialog alertDialog0 = alertDialog$Builder0.D(this.b, AppCompatSpinner.this.getSelectedItemPosition(), this).create();
            this.a = alertDialog0;
            ListView listView0 = alertDialog0.m();
            listView0.setTextDirection(v);
            listView0.setTextAlignment(v1);
            this.a.show();
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public int h() {
            return 0;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public int k() {
            return 0;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void l(int v) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public CharSequence m() {
            return this.c;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void n(CharSequence charSequence0) {
            this.c = charSequence0;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public int o() {
            return 0;
        }

        @Override  // android.content.DialogInterface$OnClickListener
        public void onClick(DialogInterface dialogInterface0, int v) {
            AppCompatSpinner.this.setSelection(v);
            if(AppCompatSpinner.this.getOnItemClickListener() != null) {
                long v1 = this.b.getItemId(v);
                AppCompatSpinner.this.performItemClick(null, v, v1);
            }
            this.dismiss();
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void p(ListAdapter listAdapter0) {
            this.b = listAdapter0;
        }
    }

    static class DropDownAdapter implements ListAdapter, SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        public DropDownAdapter(@Nullable SpinnerAdapter spinnerAdapter0, @Nullable Resources.Theme resources$Theme0) {
            this.a = spinnerAdapter0;
            if(spinnerAdapter0 instanceof ListAdapter) {
                this.b = (ListAdapter)spinnerAdapter0;
            }
            if(resources$Theme0 != null) {
                if(Build.VERSION.SDK_INT >= 23 && v.a(spinnerAdapter0)) {
                    Api23Impl.a(((ThemedSpinnerAdapter)spinnerAdapter0), resources$Theme0);
                    return;
                }
                if(spinnerAdapter0 instanceof androidx.appcompat.widget.ThemedSpinnerAdapter && ((androidx.appcompat.widget.ThemedSpinnerAdapter)spinnerAdapter0).getDropDownViewTheme() == null) {
                    ((androidx.appcompat.widget.ThemedSpinnerAdapter)spinnerAdapter0).setDropDownViewTheme(resources$Theme0);
                }
            }
        }

        @Override  // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return this.b == null ? true : this.b.areAllItemsEnabled();
        }

        @Override  // android.widget.Adapter
        public int getCount() {
            return this.a == null ? 0 : this.a.getCount();
        }

        @Override  // android.widget.SpinnerAdapter
        public View getDropDownView(int v, View view0, ViewGroup viewGroup0) {
            return this.a == null ? null : this.a.getDropDownView(v, view0, viewGroup0);
        }

        @Override  // android.widget.Adapter
        public Object getItem(int v) {
            return this.a == null ? null : this.a.getItem(v);
        }

        @Override  // android.widget.Adapter
        public long getItemId(int v) {
            return this.a == null ? -1L : this.a.getItemId(v);
        }

        @Override  // android.widget.Adapter
        public int getItemViewType(int v) {
            return 0;
        }

        @Override  // android.widget.Adapter
        public View getView(int v, View view0, ViewGroup viewGroup0) {
            return this.getDropDownView(v, view0, viewGroup0);
        }

        @Override  // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override  // android.widget.Adapter
        public boolean hasStableIds() {
            return this.a != null && this.a.hasStableIds();
        }

        @Override  // android.widget.Adapter
        public boolean isEmpty() {
            return this.getCount() == 0;
        }

        @Override  // android.widget.ListAdapter
        public boolean isEnabled(int v) {
            return this.b == null ? true : this.b.isEnabled(v);
        }

        @Override  // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver0) {
            SpinnerAdapter spinnerAdapter0 = this.a;
            if(spinnerAdapter0 != null) {
                spinnerAdapter0.registerDataSetObserver(dataSetObserver0);
            }
        }

        @Override  // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver0) {
            SpinnerAdapter spinnerAdapter0 = this.a;
            if(spinnerAdapter0 != null) {
                spinnerAdapter0.unregisterDataSetObserver(dataSetObserver0);
            }
        }
    }

    @VisibleForTesting
    class DropdownPopup extends ListPopupWindow implements SpinnerPopup {
        ListAdapter M8;
        private final Rect N8;
        private int O8;
        final AppCompatSpinner P8;
        private CharSequence Z;

        public DropdownPopup(Context context0, AttributeSet attributeSet0, int v) {
            super(context0, attributeSet0, v);
            this.N8 = new Rect();
            this.R(appCompatSpinner0);
            this.c0(true);
            this.i0(0);
            this.e0(new AdapterView.OnItemClickListener() {
                final DropdownPopup b;

                @Override  // android.widget.AdapterView$OnItemClickListener
                public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
                    AppCompatSpinner.this.setSelection(v);
                    if(AppCompatSpinner.this.getOnItemClickListener() != null) {
                        long v2 = DropdownPopup.this.M8.getItemId(v);
                        AppCompatSpinner.this.performItemClick(view0, v, v2);
                    }
                    DropdownPopup.this.dismiss();
                }
            });
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void f(int v) {
            this.O8 = v;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void g(int v, int v1) {
            boolean z = this.b();
            this.p0();
            this.Z(2);
            super.show();
            ListView listView0 = this.j();
            listView0.setChoiceMode(1);
            listView0.setTextDirection(v);
            listView0.setTextAlignment(v1);
            this.k0(AppCompatSpinner.this.getSelectedItemPosition());
            if(z) {
                return;
            }
            ViewTreeObserver viewTreeObserver0 = AppCompatSpinner.this.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                androidx.appcompat.widget.AppCompatSpinner.DropdownPopup.2 appCompatSpinner$DropdownPopup$20 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    final DropdownPopup a;

                    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if(!DropdownPopup.this.q0(AppCompatSpinner.this)) {
                            DropdownPopup.this.dismiss();
                            return;
                        }
                        DropdownPopup.this.p0();
                        DropdownPopup.this.super.show();
                    }
                };
                viewTreeObserver0.addOnGlobalLayoutListener(appCompatSpinner$DropdownPopup$20);
                this.d0(new PopupWindow.OnDismissListener() {
                    final DropdownPopup b;

                    @Override  // android.widget.PopupWindow$OnDismissListener
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver0 = AppCompatSpinner.this.getViewTreeObserver();
                        if(viewTreeObserver0 != null) {
                            viewTreeObserver0.removeGlobalOnLayoutListener(appCompatSpinner$DropdownPopup$20);
                        }
                    }
                });
            }
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public CharSequence m() {
            return this.Z;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void n(CharSequence charSequence0) {
            this.Z = charSequence0;
        }

        @Override  // androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public int o() {
            return this.O8;
        }

        @Override  // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner$SpinnerPopup
        public void p(ListAdapter listAdapter0) {
            super.p(listAdapter0);
            this.M8 = listAdapter0;
        }

        void p0() {
            int v;
            Drawable drawable0 = this.d();
            if(drawable0 == null) {
                AppCompatSpinner.this.h.right = 0;
                AppCompatSpinner.this.h.left = 0;
                v = 0;
            }
            else {
                drawable0.getPadding(AppCompatSpinner.this.h);
                v = ViewUtils.b(AppCompatSpinner.this) ? AppCompatSpinner.this.h.right : -AppCompatSpinner.this.h.left;
            }
            int v1 = AppCompatSpinner.this.getPaddingLeft();
            int v2 = AppCompatSpinner.this.getPaddingRight();
            int v3 = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner0 = AppCompatSpinner.this;
            int v4 = appCompatSpinner0.g;
            if(v4 == -2) {
                int v5 = appCompatSpinner0.a(((SpinnerAdapter)this.M8), this.d());
                int v6 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.h.left - AppCompatSpinner.this.h.right;
                if(v5 > v6) {
                    v5 = v6;
                }
                this.T(Math.max(v5, v3 - v1 - v2));
            }
            else if(v4 == -1) {
                this.T(v3 - v1 - v2);
            }
            else {
                this.T(v4);
            }
            this.l((ViewUtils.b(AppCompatSpinner.this) ? v + (v3 - v2 - this.G() - this.o()) : v + (v1 + this.o())));
        }

        // 去混淆评级： 低(20)
        boolean q0(View view0) {
            return view0.isAttachedToWindow() && view0.getGlobalVisibleRect(this.N8);
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR;
        boolean a;

        static {
            SavedState.CREATOR = new Parcelable.Creator() {
                public SavedState a(Parcel parcel0) {
                    return new SavedState(parcel0);
                }

                public SavedState[] b(int v) {
                    return new SavedState[v];
                }

                @Override  // android.os.Parcelable$Creator
                public Object createFromParcel(Parcel parcel0) {
                    return this.a(parcel0);
                }

                @Override  // android.os.Parcelable$Creator
                public Object[] newArray(int v) {
                    return this.b(v);
                }
            };
        }

        SavedState(Parcel parcel0) {
            super(parcel0);
            this.a = parcel0.readByte() != 0;
        }

        SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        @Override  // android.view.View$BaseSavedState
        public void writeToParcel(Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeByte(((byte)this.a));
        }
    }

    @VisibleForTesting
    interface SpinnerPopup {
        void a(Drawable arg1);

        boolean b();

        Drawable d();

        void dismiss();

        void e(int arg1);

        void f(int arg1);

        void g(int arg1, int arg2);

        int h();

        int k();

        void l(int arg1);

        CharSequence m();

        void n(CharSequence arg1);

        int o();

        void p(ListAdapter arg1);
    }

    private final AppCompatBackgroundHelper a;
    private final Context b;
    private ForwardingListener c;
    private SpinnerAdapter d;
    private final boolean e;
    private SpinnerPopup f;
    int g;
    final Rect h;
    @SuppressLint({"ResourceType"})
    @StyleableRes
    private static final int[] i = null;
    private static final int j = 15;
    private static final String k = "AppCompatSpinner";
    private static final int l = 0;
    private static final int m = 1;
    private static final int n = -1;

    static {
        AppCompatSpinner.i = new int[]{0x10102F1};
    }

    public AppCompatSpinner(@NonNull Context context0) {
        this(context0, null);
    }

    public AppCompatSpinner(@NonNull Context context0, int v) {
        this(context0, null, attr.spinnerStyle, v);
    }

    public AppCompatSpinner(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.spinnerStyle);
    }

    public AppCompatSpinner(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        this(context0, attributeSet0, v, -1);
    }

    public AppCompatSpinner(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        this(context0, attributeSet0, v, v1, null);
    }

    public AppCompatSpinner(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1, Resources.Theme resources$Theme0) {
        super(context0, attributeSet0, v);
        TypedArray typedArray1;
        this.h = new Rect();
        ThemeUtils.a(this, this.getContext());
        TintTypedArray tintTypedArray0 = TintTypedArray.G(context0, attributeSet0, styleable.Spinner, v, 0);
        this.a = new AppCompatBackgroundHelper(this);
        if(resources$Theme0 == null) {
            int v2 = tintTypedArray0.u(styleable.Spinner_popupTheme, 0);
            this.b = v2 == 0 ? context0 : new ContextThemeWrapper(context0, v2);
        }
        else {
            this.b = new ContextThemeWrapper(context0, resources$Theme0);
        }
        TypedArray typedArray0 = null;
        if(v1 == -1) {
            try {
                typedArray1 = null;
                typedArray1 = context0.obtainStyledAttributes(attributeSet0, AppCompatSpinner.i, v, 0);
                goto label_20;
            }
            catch(Exception exception0) {
                goto label_24;
            }
            catch(Throwable throwable0) {
            }
            goto label_29;
            try {
                try {
                label_20:
                    if(typedArray1.hasValue(0)) {
                        v1 = typedArray1.getInt(0, 0);
                        goto label_32;
                    }
                    else {
                        goto label_34;
                    }
                }
                catch(Exception exception0) {
                label_24:
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", exception0);
                    if(typedArray1 != null) {
                        goto label_32;
                    }
                }
                goto label_35;
            }
            catch(Throwable throwable0) {
                typedArray0 = typedArray1;
            }
        label_29:
            if(typedArray0 != null) {
                typedArray0.recycle();
            }
            throw throwable0;
        label_32:
            typedArray1.recycle();
            goto label_35;
        label_34:
            typedArray1.recycle();
        }
    label_35:
        switch(v1) {
            case 0: {
                DialogPopup appCompatSpinner$DialogPopup0 = new DialogPopup(this);
                this.f = appCompatSpinner$DialogPopup0;
                appCompatSpinner$DialogPopup0.n(tintTypedArray0.w(styleable.Spinner_android_prompt));
                break;
            }
            case 1: {
                DropdownPopup appCompatSpinner$DropdownPopup0 = new DropdownPopup(this, this.b, attributeSet0, v);
                TintTypedArray tintTypedArray1 = TintTypedArray.G(this.b, attributeSet0, styleable.Spinner, v, 0);
                this.g = tintTypedArray1.q(styleable.Spinner_android_dropDownWidth, -2);
                appCompatSpinner$DropdownPopup0.a(tintTypedArray1.h(styleable.Spinner_android_popupBackground));
                appCompatSpinner$DropdownPopup0.n(tintTypedArray0.w(styleable.Spinner_android_prompt));
                tintTypedArray1.I();
                this.f = appCompatSpinner$DropdownPopup0;
                this.c = new ForwardingListener(this) {
                    final AppCompatSpinner k;

                    @Override  // androidx.appcompat.widget.ForwardingListener
                    public ShowableListMenu b() {
                        return appCompatSpinner$DropdownPopup0;
                    }

                    @Override  // androidx.appcompat.widget.ForwardingListener
                    public boolean c() {
                        if(!AppCompatSpinner.this.getInternalPopup().b()) {
                            AppCompatSpinner.this.b();
                        }
                        return true;
                    }
                };
            }
        }
        CharSequence[] arr_charSequence = tintTypedArray0.y(styleable.Spinner_android_entries);
        if(arr_charSequence != null) {
            ArrayAdapter arrayAdapter0 = new ArrayAdapter(context0, 0x1090008, arr_charSequence);
            arrayAdapter0.setDropDownViewResource(layout.support_simple_spinner_dropdown_item);
            this.setAdapter(arrayAdapter0);
        }
        tintTypedArray0.I();
        this.e = true;
        SpinnerAdapter spinnerAdapter0 = this.d;
        if(spinnerAdapter0 != null) {
            this.setAdapter(spinnerAdapter0);
            this.d = null;
        }
        this.a.e(attributeSet0, v);
    }

    int a(SpinnerAdapter spinnerAdapter0, Drawable drawable0) {
        int v = 0;
        if(spinnerAdapter0 == null) {
            return 0;
        }
        int v1 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
        int v2 = View.MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
        int v3 = Math.max(0, this.getSelectedItemPosition());
        int v4 = Math.min(spinnerAdapter0.getCount(), v3 + 15);
        int v5 = Math.max(0, v4 - 15);
        View view0 = null;
        int v6 = 0;
        while(v5 < v4) {
            int v7 = spinnerAdapter0.getItemViewType(v5);
            if(v7 != v) {
                view0 = null;
                v = v7;
            }
            view0 = spinnerAdapter0.getView(v5, view0, this);
            if(view0.getLayoutParams() == null) {
                view0.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view0.measure(v1, v2);
            v6 = Math.max(v6, view0.getMeasuredWidth());
            ++v5;
        }
        if(drawable0 != null) {
            drawable0.getPadding(this.h);
            return v6 + (this.h.left + this.h.right);
        }
        return v6;
    }

    void b() {
        this.f.g(this.getTextDirection(), this.getTextAlignment());
    }

    @Override  // android.view.ViewGroup
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.b();
        }
    }

    @Override  // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        return appCompatSpinner$SpinnerPopup0 == null ? super.getDropDownHorizontalOffset() : appCompatSpinner$SpinnerPopup0.k();
    }

    @Override  // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        return appCompatSpinner$SpinnerPopup0 == null ? super.getDropDownVerticalOffset() : appCompatSpinner$SpinnerPopup0.h();
    }

    @Override  // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f == null ? super.getDropDownWidth() : this.g;
    }

    @VisibleForTesting
    final SpinnerPopup getInternalPopup() {
        return this.f;
    }

    @Override  // android.widget.Spinner
    public Drawable getPopupBackground() {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        return appCompatSpinner$SpinnerPopup0 == null ? super.getPopupBackground() : appCompatSpinner$SpinnerPopup0.d();
    }

    @Override  // android.widget.Spinner
    public Context getPopupContext() {
        return this.b;
    }

    @Override  // android.widget.Spinner
    public CharSequence getPrompt() {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        return appCompatSpinner$SpinnerPopup0 == null ? super.getPrompt() : appCompatSpinner$SpinnerPopup0.m();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.c})
    public ColorStateList getSupportBackgroundTintList() {
        return this.a == null ? null : this.a.c();
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({Scope.c})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.a == null ? null : this.a.d();
    }

    @Override  // android.widget.Spinner
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if(this.f != null && this.f.b()) {
            this.f.dismiss();
        }
    }

    @Override  // android.widget.Spinner
    protected void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        if(this.f != null && View.MeasureSpec.getMode(v) == 0x80000000) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View.MeasureSpec.getSize(v)), this.getMeasuredHeight());
        }
    }

    @Override  // android.widget.Spinner
    public void onRestoreInstanceState(Parcelable parcelable0) {
        super.onRestoreInstanceState(((SavedState)parcelable0).getSuperState());
        if(((SavedState)parcelable0).a) {
            ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                viewTreeObserver0.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    final AppCompatSpinner a;

                    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if(!AppCompatSpinner.this.getInternalPopup().b()) {
                            AppCompatSpinner.this.b();
                        }
                        ViewTreeObserver viewTreeObserver0 = AppCompatSpinner.this.getViewTreeObserver();
                        if(viewTreeObserver0 != null) {
                            viewTreeObserver0.removeOnGlobalLayoutListener(this);
                        }
                    }
                });
            }
        }
    }

    @Override  // android.widget.Spinner
    public Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.a = this.f != null && this.f.b();
        return parcelable0;
    }

    @Override  // android.widget.Spinner
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.c == null || !this.c.onTouch(this, motionEvent0) ? super.onTouchEvent(motionEvent0) : true;
    }

    @Override  // android.widget.Spinner
    public boolean performClick() {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            if(!appCompatSpinner$SpinnerPopup0.b()) {
                this.b();
            }
            return true;
        }
        return super.performClick();
    }

    @Override  // android.widget.Spinner
    public void setAdapter(Adapter adapter0) {
        this.setAdapter(((SpinnerAdapter)adapter0));
    }

    @Override  // android.widget.Spinner
    public void setAdapter(SpinnerAdapter spinnerAdapter0) {
        if(!this.e) {
            this.d = spinnerAdapter0;
            return;
        }
        super.setAdapter(spinnerAdapter0);
        if(this.f != null) {
            Context context0 = this.b == null ? this.getContext() : this.b;
            this.f.p(new DropDownAdapter(spinnerAdapter0, context0.getTheme()));
        }
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.f(drawable0);
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(@DrawableRes int v) {
        super.setBackgroundResource(v);
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.g(v);
        }
    }

    @Override  // android.widget.Spinner
    public void setDropDownHorizontalOffset(int v) {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            appCompatSpinner$SpinnerPopup0.f(v);
            this.f.l(v);
            return;
        }
        super.setDropDownHorizontalOffset(v);
    }

    @Override  // android.widget.Spinner
    public void setDropDownVerticalOffset(int v) {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            appCompatSpinner$SpinnerPopup0.e(v);
            return;
        }
        super.setDropDownVerticalOffset(v);
    }

    @Override  // android.widget.Spinner
    public void setDropDownWidth(int v) {
        if(this.f != null) {
            this.g = v;
            return;
        }
        super.setDropDownWidth(v);
    }

    @Override  // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable0) {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            appCompatSpinner$SpinnerPopup0.a(drawable0);
            return;
        }
        super.setPopupBackgroundDrawable(drawable0);
    }

    @Override  // android.widget.Spinner
    public void setPopupBackgroundResource(@DrawableRes int v) {
        this.setPopupBackgroundDrawable(AppCompatResources.b(this.getPopupContext(), v));
    }

    @Override  // android.widget.Spinner
    public void setPrompt(CharSequence charSequence0) {
        SpinnerPopup appCompatSpinner$SpinnerPopup0 = this.f;
        if(appCompatSpinner$SpinnerPopup0 != null) {
            appCompatSpinner$SpinnerPopup0.n(charSequence0);
            return;
        }
        super.setPrompt(charSequence0);
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.c})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList0) {
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.i(colorStateList0);
        }
    }

    @Override  // androidx.core.view.TintableBackgroundView
    @RestrictTo({Scope.c})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        AppCompatBackgroundHelper appCompatBackgroundHelper0 = this.a;
        if(appCompatBackgroundHelper0 != null) {
            appCompatBackgroundHelper0.j(porterDuff$Mode0);
        }
    }
}

