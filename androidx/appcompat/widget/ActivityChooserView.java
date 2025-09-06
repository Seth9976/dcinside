package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.AccessibilityDelegate;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

@RestrictTo({Scope.c})
public class ActivityChooserView extends ViewGroup implements ActivityChooserModelClient {
    class ActivityChooserViewAdapter extends BaseAdapter {
        private ActivityChooserModel a;
        private int b;
        private boolean c;
        private boolean d;
        private boolean e;
        final ActivityChooserView f;
        public static final int g = 0x7FFFFFFF;
        public static final int h = 4;
        private static final int i = 0;
        private static final int j = 1;
        private static final int k = 3;

        ActivityChooserViewAdapter() {
            this.b = 4;
        }

        public int a() {
            return this.a.f();
        }

        public ActivityChooserModel b() {
            return this.a;
        }

        public ResolveInfo c() {
            return this.a.h();
        }

        public int d() {
            return this.a.j();
        }

        public boolean e() {
            return this.c;
        }

        public int f() {
            int v = this.b;
            this.b = 0x7FFFFFFF;
            int v2 = this.getCount();
            View view0 = null;
            int v3 = 0;
            for(int v1 = 0; v1 < v2; ++v1) {
                view0 = this.getView(v1, view0, null);
                view0.measure(0, 0);
                v3 = Math.max(v3, view0.getMeasuredWidth());
            }
            this.b = v;
            return v3;
        }

        public void g(ActivityChooserModel activityChooserModel0) {
            ActivityChooserModel activityChooserModel1 = ActivityChooserView.this.a.b();
            if(activityChooserModel1 != null && ActivityChooserView.this.isShown()) {
                activityChooserModel1.unregisterObserver(ActivityChooserView.this.k);
            }
            this.a = activityChooserModel0;
            if(activityChooserModel0 != null && ActivityChooserView.this.isShown()) {
                activityChooserModel0.registerObserver(ActivityChooserView.this.k);
            }
            this.notifyDataSetChanged();
        }

        @Override  // android.widget.Adapter
        public int getCount() {
            int v = this.a.f();
            if(!this.c && this.a.h() != null) {
                --v;
            }
            int v1 = Math.min(v, this.b);
            return this.e ? v1 + 1 : v1;
        }

        @Override  // android.widget.Adapter
        public Object getItem(int v) {
            switch(this.getItemViewType(v)) {
                case 0: {
                    if(!this.c && this.a.h() != null) {
                        ++v;
                    }
                    return this.a.e(v);
                }
                case 1: {
                    return null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }

        @Override  // android.widget.Adapter
        public long getItemId(int v) {
            return (long)v;
        }

        @Override  // android.widget.BaseAdapter
        public int getItemViewType(int v) {
            return !this.e || v != this.getCount() - 1 ? 0 : 1;
        }

        @Override  // android.widget.Adapter
        public View getView(int v, View view0, ViewGroup viewGroup0) {
            switch(this.getItemViewType(v)) {
                case 0: {
                    if(view0 == null || view0.getId() != id.list_item) {
                        view0 = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(layout.abc_activity_chooser_view_list_item, viewGroup0, false);
                    }
                    PackageManager packageManager0 = ActivityChooserView.this.getContext().getPackageManager();
                    ImageView imageView0 = (ImageView)view0.findViewById(id.icon);
                    ResolveInfo resolveInfo0 = (ResolveInfo)this.getItem(v);
                    imageView0.setImageDrawable(resolveInfo0.loadIcon(packageManager0));
                    ((TextView)view0.findViewById(id.title)).setText(resolveInfo0.loadLabel(packageManager0));
                    if(this.c && v == 0 && this.d) {
                        view0.setActivated(true);
                        return view0;
                    }
                    view0.setActivated(false);
                    return view0;
                }
                case 1: {
                    if(view0 == null || view0.getId() != 1) {
                        view0 = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(layout.abc_activity_chooser_view_list_item, viewGroup0, false);
                        view0.setId(1);
                        ((TextView)view0.findViewById(id.title)).setText(ActivityChooserView.this.getContext().getString(string.abc_activity_chooser_view_see_all));
                    }
                    return view0;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }

        @Override  // android.widget.BaseAdapter
        public int getViewTypeCount() {
            return 3;
        }

        public void h(int v) {
            if(this.b != v) {
                this.b = v;
                this.notifyDataSetChanged();
            }
        }

        public void i(boolean z, boolean z1) {
            if(this.c != z || this.d != z1) {
                this.c = z;
                this.d = z1;
                this.notifyDataSetChanged();
            }
        }

        public void j(boolean z) {
            if(this.e != z) {
                this.e = z;
                this.notifyDataSetChanged();
            }
        }
    }

    class Callbacks implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
        final ActivityChooserView a;

        private void a() {
            PopupWindow.OnDismissListener popupWindow$OnDismissListener0 = ActivityChooserView.this.n;
            if(popupWindow$OnDismissListener0 != null) {
                popupWindow$OnDismissListener0.onDismiss();
            }
        }

        @Override  // android.view.View$OnClickListener
        public void onClick(View view0) {
            ActivityChooserView activityChooserView0 = ActivityChooserView.this;
            if(view0 == activityChooserView0.g) {
                activityChooserView0.a();
                ResolveInfo resolveInfo0 = ActivityChooserView.this.a.c();
                int v = ActivityChooserView.this.a.b().g(resolveInfo0);
                Intent intent0 = ActivityChooserView.this.a.b().b(v);
                if(intent0 == null) {
                    return;
                }
                intent0.addFlags(0x80000);
                ActivityChooserView.this.getContext().startActivity(intent0);
                return;
            }
            if(view0 != activityChooserView0.e) {
                throw new IllegalArgumentException();
            }
            activityChooserView0.o = false;
            activityChooserView0.d(activityChooserView0.p);
        }

        @Override  // android.widget.PopupWindow$OnDismissListener
        public void onDismiss() {
            this.a();
            ActionProvider actionProvider0 = ActivityChooserView.this.j;
            if(actionProvider0 != null) {
                actionProvider0.m(false);
            }
        }

        @Override  // android.widget.AdapterView$OnItemClickListener
        public void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
            switch(((ActivityChooserViewAdapter)adapterView0.getAdapter()).getItemViewType(v)) {
                case 0: {
                    ActivityChooserView.this.a();
                    ActivityChooserView activityChooserView0 = ActivityChooserView.this;
                    if(!activityChooserView0.o) {
                        if(!activityChooserView0.a.e()) {
                            ++v;
                        }
                        Intent intent0 = ActivityChooserView.this.a.b().b(v);
                        if(intent0 != null) {
                            intent0.addFlags(0x80000);
                            ActivityChooserView.this.getContext().startActivity(intent0);
                        }
                    }
                    else if(v > 0) {
                        activityChooserView0.a.b().r(v);
                        return;
                    }
                    return;
                }
                case 1: {
                    ActivityChooserView.this.d(0x7FFFFFFF);
                    return;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }

        @Override  // android.view.View$OnLongClickListener
        public boolean onLongClick(View view0) {
            ActivityChooserView activityChooserView0 = ActivityChooserView.this;
            if(view0 != activityChooserView0.g) {
                throw new IllegalArgumentException();
            }
            if(activityChooserView0.a.getCount() > 0) {
                ActivityChooserView.this.o = true;
                ActivityChooserView.this.d(ActivityChooserView.this.p);
            }
            return true;
        }
    }

    @RestrictTo({Scope.c})
    public static class InnerLayout extends LinearLayout {
        private static final int[] a;

        static {
            InnerLayout.a = new int[]{0x10100D4};
        }

        public InnerLayout(Context context0, AttributeSet attributeSet0) {
            super(context0, attributeSet0);
            TintTypedArray tintTypedArray0 = TintTypedArray.F(context0, attributeSet0, InnerLayout.a);
            this.setBackgroundDrawable(tintTypedArray0.h(0));
            tintTypedArray0.I();
        }
    }

    final ActivityChooserViewAdapter a;
    private final Callbacks b;
    private final View c;
    private final Drawable d;
    final FrameLayout e;
    private final ImageView f;
    final FrameLayout g;
    private final ImageView h;
    private final int i;
    ActionProvider j;
    final DataSetObserver k;
    private final ViewTreeObserver.OnGlobalLayoutListener l;
    private ListPopupWindow m;
    PopupWindow.OnDismissListener n;
    boolean o;
    int p;
    private boolean q;
    private int r;

    public ActivityChooserView(@NonNull Context context0) {
        this(context0, null);
    }

    public ActivityChooserView(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public ActivityChooserView(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.k = new DataSetObserver() {
            final ActivityChooserView a;

            @Override  // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.a.notifyDataSetChanged();
            }

            @Override  // android.database.DataSetObserver
            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.a.notifyDataSetInvalidated();
            }
        };
        this.l = new ViewTreeObserver.OnGlobalLayoutListener() {
            final ActivityChooserView a;

            @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
            public void onGlobalLayout() {
                if(ActivityChooserView.this.b()) {
                    if(!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().dismiss();
                        return;
                    }
                    ActivityChooserView.this.getListPopupWindow().show();
                    ActionProvider actionProvider0 = ActivityChooserView.this.j;
                    if(actionProvider0 != null) {
                        actionProvider0.m(true);
                    }
                }
            }
        };
        this.p = 4;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.ActivityChooserView, v, 0);
        ViewCompat.H1(this, context0, styleable.ActivityChooserView, attributeSet0, typedArray0, v, 0);
        this.p = typedArray0.getInt(styleable.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable0 = typedArray0.getDrawable(styleable.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArray0.recycle();
        LayoutInflater.from(this.getContext()).inflate(layout.abc_activity_chooser_view, this, true);
        Callbacks activityChooserView$Callbacks0 = new Callbacks(this);
        this.b = activityChooserView$Callbacks0;
        View view0 = this.findViewById(id.activity_chooser_view_content);
        this.c = view0;
        this.d = view0.getBackground();
        FrameLayout frameLayout0 = (FrameLayout)this.findViewById(id.default_activity_button);
        this.g = frameLayout0;
        frameLayout0.setOnClickListener(activityChooserView$Callbacks0);
        frameLayout0.setOnLongClickListener(activityChooserView$Callbacks0);
        this.h = (ImageView)frameLayout0.findViewById(id.image);
        FrameLayout frameLayout1 = (FrameLayout)this.findViewById(id.expand_activities_button);
        frameLayout1.setOnClickListener(activityChooserView$Callbacks0);
        frameLayout1.setAccessibilityDelegate(new View.AccessibilityDelegate() {
            final ActivityChooserView a;

            @Override  // android.view.View$AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View view0, AccessibilityNodeInfo accessibilityNodeInfo0) {
                super.onInitializeAccessibilityNodeInfo(view0, accessibilityNodeInfo0);
                AccessibilityNodeInfoCompat.t2(accessibilityNodeInfo0).h1(true);
            }
        });
        frameLayout1.setOnTouchListener(new ForwardingListener(frameLayout1) {
            final ActivityChooserView j;

            @Override  // androidx.appcompat.widget.ForwardingListener
            public ShowableListMenu b() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            @Override  // androidx.appcompat.widget.ForwardingListener
            protected boolean c() {
                ActivityChooserView.this.c();
                return true;
            }

            @Override  // androidx.appcompat.widget.ForwardingListener
            protected boolean d() {
                ActivityChooserView.this.a();
                return true;
            }
        });
        this.e = frameLayout1;
        ImageView imageView0 = (ImageView)frameLayout1.findViewById(id.image);
        this.f = imageView0;
        imageView0.setImageDrawable(drawable0);
        ActivityChooserViewAdapter activityChooserView$ActivityChooserViewAdapter0 = new ActivityChooserViewAdapter(this);
        this.a = activityChooserView$ActivityChooserViewAdapter0;
        activityChooserView$ActivityChooserViewAdapter0.registerDataSetObserver(new DataSetObserver() {
            final ActivityChooserView a;

            @Override  // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.e();
            }
        });
        Resources resources0 = context0.getResources();
        this.i = Math.max(resources0.getDisplayMetrics().widthPixels / 2, resources0.getDimensionPixelSize(dimen.abc_config_prefDialogWidth));
    }

    public boolean a() {
        if(this.b()) {
            this.getListPopupWindow().dismiss();
            ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
            if(viewTreeObserver0.isAlive()) {
                viewTreeObserver0.removeGlobalOnLayoutListener(this.l);
            }
        }
        return true;
    }

    public boolean b() {
        return this.getListPopupWindow().b();
    }

    public boolean c() {
        if(!this.b() && this.q) {
            this.o = false;
            this.d(this.p);
            return true;
        }
        return false;
    }

    void d(int v) {
        if(this.a.b() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        this.getViewTreeObserver().addOnGlobalLayoutListener(this.l);
        int v1 = this.g.getVisibility() == 0 ? 1 : 0;
        if(v == 0x7FFFFFFF || this.a.a() <= v + v1) {
            this.a.j(false);
            this.a.h(v);
        }
        else {
            this.a.j(true);
            this.a.h(v - 1);
        }
        ListPopupWindow listPopupWindow0 = this.getListPopupWindow();
        if(!listPopupWindow0.b()) {
            if(this.o || v1 == 0) {
                this.a.i(true, ((boolean)v1));
            }
            else {
                this.a.i(false, false);
            }
            listPopupWindow0.T(Math.min(this.a.f(), this.i));
            listPopupWindow0.show();
            ActionProvider actionProvider0 = this.j;
            if(actionProvider0 != null) {
                actionProvider0.m(true);
            }
            listPopupWindow0.j().setContentDescription(this.getContext().getString(string.abc_activitychooserview_choose_application));
            listPopupWindow0.j().setSelector(new ColorDrawable(0));
        }
    }

    void e() {
        if(this.a.getCount() > 0) {
            this.e.setEnabled(true);
        }
        else {
            this.e.setEnabled(false);
        }
        int v = this.a.a();
        if(v == 1 || v > 1 && this.a.d() > 0) {
            this.g.setVisibility(0);
            ResolveInfo resolveInfo0 = this.a.c();
            PackageManager packageManager0 = this.getContext().getPackageManager();
            Drawable drawable0 = resolveInfo0.loadIcon(packageManager0);
            this.h.setImageDrawable(drawable0);
            if(this.r != 0) {
                CharSequence charSequence0 = resolveInfo0.loadLabel(packageManager0);
                String s = this.getContext().getString(this.r, new Object[]{charSequence0});
                this.g.setContentDescription(s);
            }
        }
        else {
            this.g.setVisibility(8);
        }
        if(this.g.getVisibility() == 0) {
            this.c.setBackgroundDrawable(this.d);
            return;
        }
        this.c.setBackgroundDrawable(null);
    }

    @RestrictTo({Scope.a})
    public ActivityChooserModel getDataModel() {
        return this.a.b();
    }

    ListPopupWindow getListPopupWindow() {
        if(this.m == null) {
            ListPopupWindow listPopupWindow0 = new ListPopupWindow(this.getContext());
            this.m = listPopupWindow0;
            listPopupWindow0.p(this.a);
            this.m.R(this);
            this.m.c0(true);
            this.m.e0(this.b);
            this.m.d0(this.b);
        }
        return this.m;
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ActivityChooserModel activityChooserModel0 = this.a.b();
        if(activityChooserModel0 != null) {
            activityChooserModel0.registerObserver(this.k);
        }
        this.q = true;
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActivityChooserModel activityChooserModel0 = this.a.b();
        if(activityChooserModel0 != null) {
            activityChooserModel0.unregisterObserver(this.k);
        }
        ViewTreeObserver viewTreeObserver0 = this.getViewTreeObserver();
        if(viewTreeObserver0.isAlive()) {
            viewTreeObserver0.removeGlobalOnLayoutListener(this.l);
        }
        if(this.b()) {
            this.a();
        }
        this.q = false;
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.c.layout(0, 0, v2 - v, v3 - v1);
        if(!this.b()) {
            this.a();
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        View view0 = this.c;
        if(this.g.getVisibility() != 0) {
            v1 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(v1), 0x40000000);
        }
        this.measureChild(view0, v, v1);
        this.setMeasuredDimension(view0.getMeasuredWidth(), view0.getMeasuredHeight());
    }

    @Override  // androidx.appcompat.widget.ActivityChooserModel$ActivityChooserModelClient
    @RestrictTo({Scope.a})
    public void setActivityChooserModel(ActivityChooserModel activityChooserModel0) {
        this.a.g(activityChooserModel0);
        if(this.b()) {
            this.a();
            this.c();
        }
    }

    public void setDefaultActionButtonContentDescription(int v) {
        this.r = v;
    }

    public void setExpandActivityOverflowButtonContentDescription(int v) {
        String s = this.getContext().getString(v);
        this.f.setContentDescription(s);
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable0) {
        this.f.setImageDrawable(drawable0);
    }

    public void setInitialActivityCount(int v) {
        this.p = v;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener popupWindow$OnDismissListener0) {
        this.n = popupWindow$OnDismissListener0;
    }

    @RestrictTo({Scope.c})
    public void setProvider(ActionProvider actionProvider0) {
        this.j = actionProvider0;
    }
}

