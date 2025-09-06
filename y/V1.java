package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class v1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final SwitchCompat g;
    @NonNull
    public final TextView h;
    @NonNull
    public final ImageView i;
    @NonNull
    public final ConstraintLayout j;
    @NonNull
    public final EditText k;
    @NonNull
    public final TextView l;
    @NonNull
    public final ConstraintLayout m;
    @NonNull
    public final ConstraintLayout n;

    private v1(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull ImageView imageView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SwitchCompat switchCompat0, @NonNull TextView textView4, @NonNull ImageView imageView1, @NonNull ConstraintLayout constraintLayout1, @NonNull EditText editText0, @NonNull TextView textView5, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = imageView0;
        this.d = textView1;
        this.e = textView2;
        this.f = textView3;
        this.g = switchCompat0;
        this.h = textView4;
        this.i = imageView1;
        this.j = constraintLayout1;
        this.k = editText0;
        this.l = textView5;
        this.m = constraintLayout2;
        this.n = constraintLayout3;
    }

    @NonNull
    public static v1 a(@NonNull View view0) {
        int v = 0x7F0B016E;  // id:auto_refresh_setting_apply
        View view1 = ViewBindings.a(view0, 0x7F0B016E);  // id:auto_refresh_setting_apply
        if(((TextView)view1) != null) {
            v = 0x7F0B016F;  // id:auto_refresh_setting_close
            View view2 = ViewBindings.a(view0, 0x7F0B016F);  // id:auto_refresh_setting_close
            if(((ImageView)view2) != null) {
                v = 0x7F0B0170;  // id:auto_refresh_setting_current
                View view3 = ViewBindings.a(view0, 0x7F0B0170);  // id:auto_refresh_setting_current
                if(((TextView)view3) != null) {
                    v = 0x7F0B0171;  // id:auto_refresh_setting_dash
                    View view4 = ViewBindings.a(view0, 0x7F0B0171);  // id:auto_refresh_setting_dash
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0172;  // id:auto_refresh_setting_desc
                        View view5 = ViewBindings.a(view0, 0x7F0B0172);  // id:auto_refresh_setting_desc
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0173;  // id:auto_refresh_setting_enable
                            View view6 = ViewBindings.a(view0, 0x7F0B0173);  // id:auto_refresh_setting_enable
                            if(((SwitchCompat)view6) != null) {
                                v = 0x7F0B0174;  // id:auto_refresh_setting_gallery
                                View view7 = ViewBindings.a(view0, 0x7F0B0174);  // id:auto_refresh_setting_gallery
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0175;  // id:auto_refresh_setting_icon
                                    View view8 = ViewBindings.a(view0, 0x7F0B0175);  // id:auto_refresh_setting_icon
                                    if(((ImageView)view8) != null) {
                                        v = 0x7F0B0176;  // id:auto_refresh_setting_info
                                        View view9 = ViewBindings.a(view0, 0x7F0B0176);  // id:auto_refresh_setting_info
                                        if(((ConstraintLayout)view9) != null) {
                                            v = 0x7F0B0177;  // id:auto_refresh_setting_time
                                            View view10 = ViewBindings.a(view0, 0x7F0B0177);  // id:auto_refresh_setting_time
                                            if(((EditText)view10) != null) {
                                                v = 0x7F0B0178;  // id:auto_refresh_setting_time_title
                                                View view11 = ViewBindings.a(view0, 0x7F0B0178);  // id:auto_refresh_setting_time_title
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B0179;  // id:auto_refresh_setting_title
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0179);  // id:auto_refresh_setting_title
                                                    if(((ConstraintLayout)view12) != null) {
                                                        v = 0x7F0B017A;  // id:auto_refresh_setting_wrap
                                                        View view13 = ViewBindings.a(view0, 0x7F0B017A);  // id:auto_refresh_setting_wrap
                                                        if(((ConstraintLayout)view13) != null) {
                                                            return new v1(((ConstraintLayout)view0), ((TextView)view1), ((ImageView)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((SwitchCompat)view6), ((TextView)view7), ((ImageView)view8), ((ConstraintLayout)view9), ((EditText)view10), ((TextView)view11), ((ConstraintLayout)view12), ((ConstraintLayout)view13));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public ConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static v1 c(@NonNull LayoutInflater layoutInflater0) {
        return v1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static v1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00D5, viewGroup0, false);  // layout:dialog_fragment_setting_auto_refresh
        if(z) {
            viewGroup0.addView(view0);
        }
        return v1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

