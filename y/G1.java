package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class g1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final Group d;
    @NonNull
    public final TextView e;
    @NonNull
    public final ConstraintLayout f;
    @NonNull
    public final TextView g;
    @NonNull
    public final TextView h;
    @NonNull
    public final Group i;
    @NonNull
    public final TextView j;
    @NonNull
    public final ImageView k;
    @NonNull
    public final ConstraintLayout l;

    private g1(@NonNull ConstraintLayout constraintLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull Group group0, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull Group group1, @NonNull TextView textView5, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = group0;
        this.e = textView2;
        this.f = constraintLayout1;
        this.g = textView3;
        this.h = textView4;
        this.i = group1;
        this.j = textView5;
        this.k = imageView0;
        this.l = constraintLayout2;
    }

    @NonNull
    public static g1 a(@NonNull View view0) {
        int v = 0x7F0B01B6;  // id:big_dccon_active_desc_expire
        View view1 = ViewBindings.a(view0, 0x7F0B01B6);  // id:big_dccon_active_desc_expire
        if(((TextView)view1) != null) {
            v = 0x7F0B01B7;  // id:big_dccon_active_desc_info
            View view2 = ViewBindings.a(view0, 0x7F0B01B7);  // id:big_dccon_active_desc_info
            if(((TextView)view2) != null) {
                v = 0x7F0B01B8;  // id:big_dccon_active_group
                View view3 = ViewBindings.a(view0, 0x7F0B01B8);  // id:big_dccon_active_group
                if(((Group)view3) != null) {
                    v = 0x7F0B01B9;  // id:big_dccon_active_title
                    View view4 = ViewBindings.a(view0, 0x7F0B01B9);  // id:big_dccon_active_title
                    if(((TextView)view4) != null) {
                        v = 0x7F0B01BB;  // id:big_dccon_inactive_current_status
                        View view5 = ViewBindings.a(view0, 0x7F0B01BB);  // id:big_dccon_inactive_current_status
                        if(((TextView)view5) != null) {
                            v = 0x7F0B01BC;  // id:big_dccon_inactive_desc
                            View view6 = ViewBindings.a(view0, 0x7F0B01BC);  // id:big_dccon_inactive_desc
                            if(((TextView)view6) != null) {
                                v = 0x7F0B01BD;  // id:big_dccon_inactive_group
                                View view7 = ViewBindings.a(view0, 0x7F0B01BD);  // id:big_dccon_inactive_group
                                if(((Group)view7) != null) {
                                    v = 0x7F0B01BE;  // id:big_dccon_inactive_title
                                    View view8 = ViewBindings.a(view0, 0x7F0B01BE);  // id:big_dccon_inactive_title
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0408;  // id:dialog_big_dccon_close
                                        View view9 = ViewBindings.a(view0, 0x7F0B0408);  // id:dialog_big_dccon_close
                                        if(((ImageView)view9) != null) {
                                            v = 0x7F0B0409;  // id:dialog_big_dccon_wrap
                                            View view10 = ViewBindings.a(view0, 0x7F0B0409);  // id:dialog_big_dccon_wrap
                                            if(((ConstraintLayout)view10) != null) {
                                                return new g1(((ConstraintLayout)view0), ((TextView)view1), ((TextView)view2), ((Group)view3), ((TextView)view4), ((ConstraintLayout)view0), ((TextView)view5), ((TextView)view6), ((Group)view7), ((TextView)view8), ((ImageView)view9), ((ConstraintLayout)view10));
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
    public static g1 c(@NonNull LayoutInflater layoutInflater0) {
        return g1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static g1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00C6, viewGroup0, false);  // layout:dialog_fragment_big_dccon
        if(z) {
            viewGroup0.addView(view0);
        }
        return g1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

