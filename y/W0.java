package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class w0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final DcToolbar f;

    private w0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = linearLayout0;
        this.c = textView0;
        this.d = textView1;
        this.e = textView2;
        this.f = dcToolbar0;
    }

    @NonNull
    public static w0 a(@NonNull View view0) {
        int v = 0x7F0B0E8D;  // id:setting_list_log_option
        View view1 = ViewBindings.a(view0, 0x7F0B0E8D);  // id:setting_list_log_option
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B0E8E;  // id:setting_list_log_option_desc
            View view2 = ViewBindings.a(view0, 0x7F0B0E8E);  // id:setting_list_log_option_desc
            if(((TextView)view2) != null) {
                v = 0x7F0B0E8F;  // id:setting_list_log_option_title
                View view3 = ViewBindings.a(view0, 0x7F0B0E8F);  // id:setting_list_log_option_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B0E90;  // id:setting_list_log_option_value
                    View view4 = ViewBindings.a(view0, 0x7F0B0E90);  // id:setting_list_log_option_value
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0E91;  // id:setting_list_toolbar
                        View view5 = ViewBindings.a(view0, 0x7F0B0E91);  // id:setting_list_toolbar
                        if(((DcToolbar)view5) != null) {
                            return new w0(((CoordinatorLayout)view0), ((LinearLayout)view1), ((TextView)view2), ((TextView)view3), ((TextView)view4), ((DcToolbar)view5));
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
    public static w0 c(@NonNull LayoutInflater layoutInflater0) {
        return w0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static w0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0067, viewGroup0, false);  // layout:activity_setting_list
        if(z) {
            viewGroup0.addView(view0);
        }
        return w0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

