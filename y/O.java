package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class o implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final Barrier b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final LinearLayout g;
    @NonNull
    public final LinearLayout h;
    @NonNull
    public final TextView i;
    @NonNull
    public final TextView j;
    @NonNull
    public final TextView k;
    @NonNull
    public final LinearLayout l;
    @NonNull
    public final DcToolbar m;

    private o(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull Barrier barrier0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull LinearLayout linearLayout0, @NonNull LinearLayout linearLayout1, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull LinearLayout linearLayout2, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = barrier0;
        this.c = textView0;
        this.d = textView1;
        this.e = textView2;
        this.f = textView3;
        this.g = linearLayout0;
        this.h = linearLayout1;
        this.i = textView4;
        this.j = textView5;
        this.k = textView6;
        this.l = linearLayout2;
        this.m = dcToolbar0;
    }

    @NonNull
    public static o a(@NonNull View view0) {
        int v = 0x7F0B026E;  // id:campaign_barrier
        View view1 = ViewBindings.a(view0, 0x7F0B026E);  // id:campaign_barrier
        if(((Barrier)view1) != null) {
            v = 0x7F0B026F;  // id:campaign_change
            View view2 = ViewBindings.a(view0, 0x7F0B026F);  // id:campaign_change
            if(((TextView)view2) != null) {
                v = 0x7F0B0270;  // id:campaign_desc_1
                View view3 = ViewBindings.a(view0, 0x7F0B0270);  // id:campaign_desc_1
                if(((TextView)view3) != null) {
                    v = 0x7F0B0271;  // id:campaign_desc_2
                    View view4 = ViewBindings.a(view0, 0x7F0B0271);  // id:campaign_desc_2
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0272;  // id:campaign_expire
                        View view5 = ViewBindings.a(view0, 0x7F0B0272);  // id:campaign_expire
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0273;  // id:campaign_expire_parent
                            View view6 = ViewBindings.a(view0, 0x7F0B0273);  // id:campaign_expire_parent
                            if(((LinearLayout)view6) != null) {
                                v = 0x7F0B0274;  // id:campaign_icon_parent
                                View view7 = ViewBindings.a(view0, 0x7F0B0274);  // id:campaign_icon_parent
                                if(((LinearLayout)view7) != null) {
                                    v = 0x7F0B0275;  // id:campaign_later
                                    View view8 = ViewBindings.a(view0, 0x7F0B0275);  // id:campaign_later
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0276;  // id:campaign_next
                                        View view9 = ViewBindings.a(view0, 0x7F0B0276);  // id:campaign_next
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B0277;  // id:campaign_pattern
                                            View view10 = ViewBindings.a(view0, 0x7F0B0277);  // id:campaign_pattern
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B0278;  // id:campaign_pattern_parent
                                                View view11 = ViewBindings.a(view0, 0x7F0B0278);  // id:campaign_pattern_parent
                                                if(((LinearLayout)view11) != null) {
                                                    v = 0x7F0B0279;  // id:campaign_toolbar
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0279);  // id:campaign_toolbar
                                                    if(((DcToolbar)view12) != null) {
                                                        return new o(((CoordinatorLayout)view0), ((Barrier)view1), ((TextView)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((LinearLayout)view6), ((LinearLayout)view7), ((TextView)view8), ((TextView)view9), ((TextView)view10), ((LinearLayout)view11), ((DcToolbar)view12));
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
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static o c(@NonNull LayoutInflater layoutInflater0) {
        return o.d(layoutInflater0, null, false);
    }

    @NonNull
    public static o d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E002A, viewGroup0, false);  // layout:activity_campaign
        if(z) {
            viewGroup0.addView(view0);
        }
        return o.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

