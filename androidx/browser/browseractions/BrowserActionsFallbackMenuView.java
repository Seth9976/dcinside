package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.browser.R.dimen;

@RestrictTo({Scope.c})
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {
    private final int a;
    private final int b;

    public BrowserActionsFallbackMenuView(@NonNull Context context0, @NonNull AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = this.getResources().getDimensionPixelOffset(dimen.browser_actions_context_menu_min_padding);
        this.b = this.getResources().getDimensionPixelOffset(dimen.browser_actions_context_menu_max_width);
    }

    @Override  // android.widget.LinearLayout
    protected void onMeasure(int v, int v1) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(this.getResources().getDisplayMetrics().widthPixels - this.a * 2, this.b), 0x40000000), v1);
    }
}

