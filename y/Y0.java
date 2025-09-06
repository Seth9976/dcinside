package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class y0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final LinearLayout d;
    @NonNull
    public final SwitchCompat e;
    @NonNull
    public final TextView f;
    @NonNull
    public final DcToolbar g;

    private y0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull LinearLayout linearLayout1, @NonNull SwitchCompat switchCompat0, @NonNull TextView textView1, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = linearLayout0;
        this.c = textView0;
        this.d = linearLayout1;
        this.e = switchCompat0;
        this.f = textView1;
        this.g = dcToolbar0;
    }

    @NonNull
    public static y0 a(@NonNull View view0) {
        int v = 0x7F0B0E98;  // id:setting_post_history_clear
        View view1 = ViewBindings.a(view0, 0x7F0B0E98);  // id:setting_post_history_clear
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B0E99;  // id:setting_post_history_clear_title
            View view2 = ViewBindings.a(view0, 0x7F0B0E99);  // id:setting_post_history_clear_title
            if(((TextView)view2) != null) {
                v = 0x7F0B0E9A;  // id:setting_post_history_enable
                View view3 = ViewBindings.a(view0, 0x7F0B0E9A);  // id:setting_post_history_enable
                if(((LinearLayout)view3) != null) {
                    v = 0x7F0B0E9B;  // id:setting_post_history_enable_switch
                    View view4 = ViewBindings.a(view0, 0x7F0B0E9B);  // id:setting_post_history_enable_switch
                    if(((SwitchCompat)view4) != null) {
                        v = 0x7F0B0E9C;  // id:setting_post_history_enable_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0E9C);  // id:setting_post_history_enable_title
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0E9D;  // id:setting_post_history_toolbar
                            View view6 = ViewBindings.a(view0, 0x7F0B0E9D);  // id:setting_post_history_toolbar
                            if(((DcToolbar)view6) != null) {
                                return new y0(((CoordinatorLayout)view0), ((LinearLayout)view1), ((TextView)view2), ((LinearLayout)view3), ((SwitchCompat)view4), ((TextView)view5), ((DcToolbar)view6));
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static y0 c(@NonNull LayoutInflater layoutInflater0) {
        return y0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static y0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0069, viewGroup0, false);  // layout:activity_setting_post_history
        if(z) {
            viewGroup0.addView(view0);
        }
        return y0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

