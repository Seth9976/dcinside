package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.id;
import androidx.appcompat.R.layout;
import androidx.appcompat.R.style;

@RestrictTo({Scope.c})
class TooltipPopup {
    private final Context a;
    private final View b;
    private final TextView c;
    private final WindowManager.LayoutParams d;
    private final Rect e;
    private final int[] f;
    private final int[] g;
    private static final String h = "TooltipPopup";

    TooltipPopup(@NonNull Context context0) {
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
        this.d = windowManager$LayoutParams0;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = context0;
        View view0 = LayoutInflater.from(context0).inflate(layout.abc_tooltip, null);
        this.b = view0;
        this.c = (TextView)view0.findViewById(id.message);
        windowManager$LayoutParams0.setTitle(this.getClass().getSimpleName());
        windowManager$LayoutParams0.packageName = "com.dcinside.app.android";
        windowManager$LayoutParams0.type = 1002;
        windowManager$LayoutParams0.width = -2;
        windowManager$LayoutParams0.height = -2;
        windowManager$LayoutParams0.format = -3;
        windowManager$LayoutParams0.windowAnimations = style.Animation_AppCompat_Tooltip;
        windowManager$LayoutParams0.flags = 24;
    }

    private void a(View view0, int v, int v1, boolean z, WindowManager.LayoutParams windowManager$LayoutParams0) {
        int v5;
        int v4;
        windowManager$LayoutParams0.token = view0.getApplicationWindowToken();
        int v2 = this.a.getResources().getDimensionPixelOffset(dimen.tooltip_precise_anchor_threshold);
        if(view0.getWidth() < v2) {
            v = view0.getWidth() / 2;
        }
        if(view0.getHeight() >= v2) {
            int v3 = this.a.getResources().getDimensionPixelOffset(dimen.tooltip_precise_anchor_extra_offset);
            v4 = v1 + v3;
            v5 = v1 - v3;
        }
        else {
            v4 = view0.getHeight();
            v5 = 0;
        }
        windowManager$LayoutParams0.gravity = 49;
        int v6 = this.a.getResources().getDimensionPixelOffset((z ? dimen.tooltip_y_offset_touch : dimen.tooltip_y_offset_non_touch));
        View view1 = TooltipPopup.b(view0);
        if(view1 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        view1.getWindowVisibleDisplayFrame(this.e);
        if(this.e.left < 0 && this.e.top < 0) {
            Resources resources0 = this.a.getResources();
            int v7 = resources0.getIdentifier("status_bar_height", "dimen", "android");
            int v8 = v7 == 0 ? 0 : resources0.getDimensionPixelSize(v7);
            DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
            this.e.set(0, v8, displayMetrics0.widthPixels, displayMetrics0.heightPixels);
        }
        view1.getLocationOnScreen(this.g);
        view0.getLocationOnScreen(this.f);
        int v9 = this.f[0] - this.g[0];
        this.f[0] = v9;
        this.f[1] -= this.g[1];
        windowManager$LayoutParams0.x = v9 + v - view1.getWidth() / 2;
        this.b.measure(0, 0);
        int v10 = this.b.getMeasuredHeight();
        int v11 = v5 + this.f[1] - v6 - v10;
        int v12 = this.f[1] + v4 + v6;
        if(z) {
            if(v11 >= 0) {
                windowManager$LayoutParams0.y = v11;
                return;
            }
            windowManager$LayoutParams0.y = v12;
            return;
        }
        if(v10 + v12 <= this.e.height()) {
            windowManager$LayoutParams0.y = v12;
            return;
        }
        windowManager$LayoutParams0.y = v11;
    }

    private static View b(View view0) {
        View view1 = view0.getRootView();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof WindowManager.LayoutParams && ((WindowManager.LayoutParams)viewGroup$LayoutParams0).type == 2) {
            return view1;
        }
        for(Context context0 = view0.getContext(); context0 instanceof ContextWrapper; context0 = ((ContextWrapper)context0).getBaseContext()) {
            if(context0 instanceof Activity) {
                return ((Activity)context0).getWindow().getDecorView();
            }
        }
        return view1;
    }

    void c() {
        if(!this.d()) {
            return;
        }
        ((WindowManager)this.a.getSystemService("window")).removeView(this.b);
    }

    boolean d() {
        return this.b.getParent() != null;
    }

    void e(View view0, int v, int v1, boolean z, CharSequence charSequence0) {
        if(this.d()) {
            this.c();
        }
        this.c.setText(charSequence0);
        this.a(view0, v, v1, z, this.d);
        ((WindowManager)this.a.getSystemService("window")).addView(this.b, this.d);
    }
}

