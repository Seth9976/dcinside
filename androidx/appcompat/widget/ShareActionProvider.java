package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.string;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ActionProvider;

public class ShareActionProvider extends ActionProvider {
    public interface OnShareTargetSelectedListener {
        boolean a(ShareActionProvider arg1, Intent arg2);
    }

    class ShareActivityChooserModelPolicy implements OnChooseActivityListener {
        final ShareActionProvider a;

        @Override  // androidx.appcompat.widget.ActivityChooserModel$OnChooseActivityListener
        public boolean a(ActivityChooserModel activityChooserModel0, Intent intent0) {
            ShareActionProvider shareActionProvider0 = ShareActionProvider.this;
            OnShareTargetSelectedListener shareActionProvider$OnShareTargetSelectedListener0 = shareActionProvider0.i;
            if(shareActionProvider$OnShareTargetSelectedListener0 != null) {
                shareActionProvider$OnShareTargetSelectedListener0.a(shareActionProvider0, intent0);
            }
            return false;
        }
    }

    class ShareMenuItemOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        final ShareActionProvider a;

        @Override  // android.view.MenuItem$OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem0) {
            Intent intent0 = ActivityChooserModel.d(ShareActionProvider.this.g, ShareActionProvider.this.h).b(menuItem0.getItemId());
            if(intent0 != null) {
                String s = intent0.getAction();
                if("android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s)) {
                    ShareActionProvider.this.r(intent0);
                }
                ShareActionProvider.this.g.startActivity(intent0);
            }
            return true;
        }
    }

    private int e;
    private final ShareMenuItemOnMenuItemClickListener f;
    final Context g;
    String h;
    OnShareTargetSelectedListener i;
    private OnChooseActivityListener j;
    private static final int k = 4;
    public static final String l = "share_history.xml";

    public ShareActionProvider(Context context0) {
        super(context0);
        this.e = 4;
        this.f = new ShareMenuItemOnMenuItemClickListener(this);
        this.h = "share_history.xml";
        this.g = context0;
    }

    @Override  // androidx.core.view.ActionProvider
    public boolean b() {
        return true;
    }

    @Override  // androidx.core.view.ActionProvider
    public View d() {
        View view0 = new ActivityChooserView(this.g);
        if(!view0.isInEditMode()) {
            ((ActivityChooserView)view0).setActivityChooserModel(ActivityChooserModel.d(this.g, this.h));
        }
        TypedValue typedValue0 = new TypedValue();
        this.g.getTheme().resolveAttribute(attr.actionModeShareDrawable, typedValue0, true);
        ((ActivityChooserView)view0).setExpandActivityOverflowButtonDrawable(AppCompatResources.b(this.g, typedValue0.resourceId));
        ((ActivityChooserView)view0).setProvider(this);
        ((ActivityChooserView)view0).setDefaultActionButtonContentDescription(string.abc_shareactionprovider_share_with_application);
        ((ActivityChooserView)view0).setExpandActivityOverflowButtonContentDescription(string.abc_shareactionprovider_share_with);
        return view0;
    }

    @Override  // androidx.core.view.ActionProvider
    public void g(SubMenu subMenu0) {
        subMenu0.clear();
        ActivityChooserModel activityChooserModel0 = ActivityChooserModel.d(this.g, this.h);
        PackageManager packageManager0 = this.g.getPackageManager();
        int v = activityChooserModel0.f();
        int v1 = Math.min(v, this.e);
        for(int v2 = 0; v2 < v1; ++v2) {
            ResolveInfo resolveInfo0 = activityChooserModel0.e(v2);
            subMenu0.add(0, v2, v2, resolveInfo0.loadLabel(packageManager0)).setIcon(resolveInfo0.loadIcon(packageManager0)).setOnMenuItemClickListener(this.f);
        }
        if(v1 < v) {
            SubMenu subMenu1 = subMenu0.addSubMenu(0, v1, v1, this.g.getString(string.abc_activity_chooser_view_see_all));
            for(int v3 = 0; v3 < v; ++v3) {
                ResolveInfo resolveInfo1 = activityChooserModel0.e(v3);
                subMenu1.add(0, v3, v3, resolveInfo1.loadLabel(packageManager0)).setIcon(resolveInfo1.loadIcon(packageManager0)).setOnMenuItemClickListener(this.f);
            }
        }
    }

    private void n() {
        if(this.i == null) {
            return;
        }
        if(this.j == null) {
            this.j = new ShareActivityChooserModelPolicy(this);
        }
        ActivityChooserModel.d(this.g, this.h).u(this.j);
    }

    public void o(OnShareTargetSelectedListener shareActionProvider$OnShareTargetSelectedListener0) {
        this.i = shareActionProvider$OnShareTargetSelectedListener0;
        this.n();
    }

    public void p(String s) {
        this.h = s;
        this.n();
    }

    public void q(Intent intent0) {
        if(intent0 != null) {
            String s = intent0.getAction();
            if("android.intent.action.SEND".equals(s) || "android.intent.action.SEND_MULTIPLE".equals(s)) {
                this.r(intent0);
            }
        }
        ActivityChooserModel.d(this.g, this.h).t(intent0);
    }

    void r(Intent intent0) {
        intent0.addFlags(0x8080000);
    }
}

