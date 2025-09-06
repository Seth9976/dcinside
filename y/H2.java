package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class h2 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final Barrier b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ConstraintLayout e;
    @NonNull
    public final TextView f;
    @NonNull
    public final TextView g;
    @NonNull
    public final TextView h;
    @NonNull
    public final LinearLayout i;
    @NonNull
    public final LinearLayout j;
    @NonNull
    public final LinearLayout k;
    @NonNull
    public final LinearLayout l;
    @NonNull
    public final TextView m;
    @NonNull
    public final ConstraintLayout n;

    private h2(@NonNull ConstraintLayout constraintLayout0, @NonNull Barrier barrier0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull LinearLayout linearLayout0, @NonNull LinearLayout linearLayout1, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull TextView textView5, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout0;
        this.b = barrier0;
        this.c = textView0;
        this.d = textView1;
        this.e = constraintLayout1;
        this.f = textView2;
        this.g = textView3;
        this.h = textView4;
        this.i = linearLayout0;
        this.j = linearLayout1;
        this.k = linearLayout2;
        this.l = linearLayout3;
        this.m = textView5;
        this.n = constraintLayout2;
    }

    @NonNull
    public static h2 a(@NonNull View view0) {
        int v = 0x7F0B0742;  // id:login_info_barrier
        View view1 = ViewBindings.a(view0, 0x7F0B0742);  // id:login_info_barrier
        if(((Barrier)view1) != null) {
            v = 0x7F0B0743;  // id:login_info_id_desc
            View view2 = ViewBindings.a(view0, 0x7F0B0743);  // id:login_info_id_desc
            if(((TextView)view2) != null) {
                v = 0x7F0B0744;  // id:login_info_id_text
                View view3 = ViewBindings.a(view0, 0x7F0B0744);  // id:login_info_id_text
                if(((TextView)view3) != null) {
                    v = 0x7F0B0745;  // id:login_info_logout
                    View view4 = ViewBindings.a(view0, 0x7F0B0745);  // id:login_info_logout
                    if(((ConstraintLayout)view4) != null) {
                        v = 0x7F0B0746;  // id:login_info_nick_desc
                        View view5 = ViewBindings.a(view0, 0x7F0B0746);  // id:login_info_nick_desc
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0747;  // id:login_info_nick_text
                            View view6 = ViewBindings.a(view0, 0x7F0B0747);  // id:login_info_nick_text
                            if(((TextView)view6) != null) {
                                v = 0x7F0B0748;  // id:login_info_otp_text
                                View view7 = ViewBindings.a(view0, 0x7F0B0748);  // id:login_info_otp_text
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0749;  // id:login_info_setting_normal
                                    View view8 = ViewBindings.a(view0, 0x7F0B0749);  // id:login_info_setting_normal
                                    if(((LinearLayout)view8) != null) {
                                        v = 0x7F0B074A;  // id:login_info_setting_password
                                        View view9 = ViewBindings.a(view0, 0x7F0B074A);  // id:login_info_setting_password
                                        if(((LinearLayout)view9) != null) {
                                            v = 0x7F0B074B;  // id:login_info_setting_security
                                            View view10 = ViewBindings.a(view0, 0x7F0B074B);  // id:login_info_setting_security
                                            if(((LinearLayout)view10) != null) {
                                                v = 0x7F0B074C;  // id:login_info_setting_wrap
                                                View view11 = ViewBindings.a(view0, 0x7F0B074C);  // id:login_info_setting_wrap
                                                if(((LinearLayout)view11) != null) {
                                                    v = 0x7F0B074D;  // id:login_info_withdraw
                                                    View view12 = ViewBindings.a(view0, 0x7F0B074D);  // id:login_info_withdraw
                                                    if(((TextView)view12) != null) {
                                                        v = 0x7F0B074E;  // id:login_info_wrap
                                                        View view13 = ViewBindings.a(view0, 0x7F0B074E);  // id:login_info_wrap
                                                        if(((ConstraintLayout)view13) != null) {
                                                            return new h2(((ConstraintLayout)view0), ((Barrier)view1), ((TextView)view2), ((TextView)view3), ((ConstraintLayout)view4), ((TextView)view5), ((TextView)view6), ((TextView)view7), ((LinearLayout)view8), ((LinearLayout)view9), ((LinearLayout)view10), ((LinearLayout)view11), ((TextView)view12), ((ConstraintLayout)view13));
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
    public static h2 c(@NonNull LayoutInflater layoutInflater0) {
        return h2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static h2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0108, viewGroup0, false);  // layout:fragment_login_info
        if(z) {
            viewGroup0.addView(view0);
        }
        return h2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

