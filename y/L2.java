package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class l2 implements ViewBinding {
    @NonNull
    private final FrameLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ProgressBar g;
    @NonNull
    public final LinearLayout h;
    @NonNull
    public final TextView i;
    @NonNull
    public final LinearLayout j;
    @NonNull
    public final TextView k;
    @NonNull
    public final TextView l;
    @NonNull
    public final TextView m;
    @NonNull
    public final TextView n;
    @NonNull
    public final TextView o;
    @NonNull
    public final TextView p;

    private l2(@NonNull FrameLayout frameLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ProgressBar progressBar0, @NonNull LinearLayout linearLayout0, @NonNull TextView textView5, @NonNull LinearLayout linearLayout1, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11) {
        this.a = frameLayout0;
        this.b = textView0;
        this.c = textView1;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = progressBar0;
        this.h = linearLayout0;
        this.i = textView5;
        this.j = linearLayout1;
        this.k = textView6;
        this.l = textView7;
        this.m = textView8;
        this.n = textView9;
        this.o = textView10;
        this.p = textView11;
    }

    @NonNull
    public static l2 a(@NonNull View view0) {
        int v = 0x7F0B076C;  // id:major_change_date_title
        View view1 = ViewBindings.a(view0, 0x7F0B076C);  // id:major_change_date_title
        if(((TextView)view1) != null) {
            v = 0x7F0B076D;  // id:major_change_date_value
            View view2 = ViewBindings.a(view0, 0x7F0B076D);  // id:major_change_date_value
            if(((TextView)view2) != null) {
                v = 0x7F0B076E;  // id:major_create_date_title
                View view3 = ViewBindings.a(view0, 0x7F0B076E);  // id:major_create_date_title
                if(((TextView)view3) != null) {
                    v = 0x7F0B076F;  // id:major_create_date_value
                    View view4 = ViewBindings.a(view0, 0x7F0B076F);  // id:major_create_date_value
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0770;  // id:major_desc
                        View view5 = ViewBindings.a(view0, 0x7F0B0770);  // id:major_desc
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0795;  // id:major_info_progress
                            View view6 = ViewBindings.a(view0, 0x7F0B0795);  // id:major_info_progress
                            if(((ProgressBar)view6) != null) {
                                v = 0x7F0B0796;  // id:major_info_views
                                View view7 = ViewBindings.a(view0, 0x7F0B0796);  // id:major_info_views
                                if(((LinearLayout)view7) != null) {
                                    v = 0x7F0B0797;  // id:major_manager_entrust
                                    View view8 = ViewBindings.a(view0, 0x7F0B0797);  // id:major_manager_entrust
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0798;  // id:major_manager_entrust_list
                                        View view9 = ViewBindings.a(view0, 0x7F0B0798);  // id:major_manager_entrust_list
                                        if(((LinearLayout)view9) != null) {
                                            v = 0x7F0B0799;  // id:major_manager_help
                                            View view10 = ViewBindings.a(view0, 0x7F0B0799);  // id:major_manager_help
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B079A;  // id:major_manager_m_desc
                                                View view11 = ViewBindings.a(view0, 0x7F0B079A);  // id:major_manager_m_desc
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B079B;  // id:major_manager_m_title
                                                    View view12 = ViewBindings.a(view0, 0x7F0B079B);  // id:major_manager_m_title
                                                    if(((TextView)view12) != null) {
                                                        v = 0x7F0B079C;  // id:major_manager_m_value
                                                        View view13 = ViewBindings.a(view0, 0x7F0B079C);  // id:major_manager_m_value
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B079D;  // id:major_manager_s_title
                                                            View view14 = ViewBindings.a(view0, 0x7F0B079D);  // id:major_manager_s_title
                                                            if(((TextView)view14) != null) {
                                                                v = 0x7F0B079E;  // id:major_manager_s_value
                                                                View view15 = ViewBindings.a(view0, 0x7F0B079E);  // id:major_manager_s_value
                                                                if(((TextView)view15) != null) {
                                                                    return new l2(((FrameLayout)view0), ((TextView)view1), ((TextView)view2), ((TextView)view3), ((TextView)view4), ((TextView)view5), ((ProgressBar)view6), ((LinearLayout)view7), ((TextView)view8), ((LinearLayout)view9), ((TextView)view10), ((TextView)view11), ((TextView)view12), ((TextView)view13), ((TextView)view14), ((TextView)view15));
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
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public FrameLayout b() {
        return this.a;
    }

    @NonNull
    public static l2 c(@NonNull LayoutInflater layoutInflater0) {
        return l2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static l2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E010C, viewGroup0, false);  // layout:fragment_major_info
        if(z) {
            viewGroup0.addView(view0);
        }
        return l2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

