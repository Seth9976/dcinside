package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;

public final class m0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final ProgressBar b;
    @NonNull
    public final LinearLayout c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ProgressBar e;
    @NonNull
    public final TextView f;
    @NonNull
    public final View g;
    @NonNull
    public final Group h;
    @NonNull
    public final SwitchCompat i;
    @NonNull
    public final TextView j;
    @NonNull
    public final TextView k;
    @NonNull
    public final ImageView l;
    @NonNull
    public final TextView m;
    @NonNull
    public final RecyclerView n;
    @NonNull
    public final DcToolbar o;

    private m0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull ProgressBar progressBar0, @NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull ProgressBar progressBar1, @NonNull TextView textView1, @NonNull View view0, @NonNull Group group0, @NonNull SwitchCompat switchCompat0, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView0, @NonNull TextView textView4, @NonNull RecyclerView recyclerView0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = progressBar0;
        this.c = linearLayout0;
        this.d = textView0;
        this.e = progressBar1;
        this.f = textView1;
        this.g = view0;
        this.h = group0;
        this.i = switchCompat0;
        this.j = textView2;
        this.k = textView3;
        this.l = imageView0;
        this.m = textView4;
        this.n = recyclerView0;
        this.o = dcToolbar0;
    }

    @NonNull
    public static m0 a(@NonNull View view0) {
        int v = 0x7F0B039C;  // id:def_img_progress
        View view1 = ViewBindings.a(view0, 0x7F0B039C);  // id:def_img_progress
        if(((ProgressBar)view1) != null) {
            v = 0x7F0B039D;  // id:def_img_progress_container
            View view2 = ViewBindings.a(view0, 0x7F0B039D);  // id:def_img_progress_container
            if(((LinearLayout)view2) != null) {
                v = 0x7F0B039E;  // id:def_img_progress_text
                View view3 = ViewBindings.a(view0, 0x7F0B039E);  // id:def_img_progress_text
                if(((TextView)view3) != null) {
                    v = 0x7F0B039F;  // id:def_img_progress_upload
                    View view4 = ViewBindings.a(view0, 0x7F0B039F);  // id:def_img_progress_upload
                    if(((ProgressBar)view4) != null) {
                        v = 0x7F0B03AA;  // id:def_img_setting_gallery_desc
                        View view5 = ViewBindings.a(view0, 0x7F0B03AA);  // id:def_img_setting_gallery_desc
                        if(((TextView)view5) != null) {
                            v = 0x7F0B03AB;  // id:def_img_setting_gallery_divider
                            View view6 = ViewBindings.a(view0, 0x7F0B03AB);  // id:def_img_setting_gallery_divider
                            if(view6 != null) {
                                v = 0x7F0B03AC;  // id:def_img_setting_gallery_group
                                View view7 = ViewBindings.a(view0, 0x7F0B03AC);  // id:def_img_setting_gallery_group
                                if(((Group)view7) != null) {
                                    v = 0x7F0B03AD;  // id:def_img_setting_gallery_switch
                                    View view8 = ViewBindings.a(view0, 0x7F0B03AD);  // id:def_img_setting_gallery_switch
                                    if(((SwitchCompat)view8) != null) {
                                        v = 0x7F0B03AE;  // id:def_img_setting_gallery_title
                                        View view9 = ViewBindings.a(view0, 0x7F0B03AE);  // id:def_img_setting_gallery_title
                                        if(((TextView)view9) != null) {
                                            v = 0x7F0B03B0;  // id:def_img_setting_my_auto_image
                                            View view10 = ViewBindings.a(view0, 0x7F0B03B0);  // id:def_img_setting_my_auto_image
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B03B9;  // id:def_img_setting_profile_icon
                                                View view11 = ViewBindings.a(view0, 0x7F0B03B9);  // id:def_img_setting_profile_icon
                                                if(((ImageView)view11) != null) {
                                                    v = 0x7F0B03BA;  // id:def_img_setting_profile_name
                                                    View view12 = ViewBindings.a(view0, 0x7F0B03BA);  // id:def_img_setting_profile_name
                                                    if(((TextView)view12) != null) {
                                                        v = 0x7F0B03BE;  // id:def_img_setting_recycler
                                                        View view13 = ViewBindings.a(view0, 0x7F0B03BE);  // id:def_img_setting_recycler
                                                        if(((RecyclerView)view13) != null) {
                                                            v = 0x7F0B03BF;  // id:def_img_setting_toolbar
                                                            View view14 = ViewBindings.a(view0, 0x7F0B03BF);  // id:def_img_setting_toolbar
                                                            if(((DcToolbar)view14) != null) {
                                                                return new m0(((CoordinatorLayout)view0), ((ProgressBar)view1), ((LinearLayout)view2), ((TextView)view3), ((ProgressBar)view4), ((TextView)view5), view6, ((Group)view7), ((SwitchCompat)view8), ((TextView)view9), ((TextView)view10), ((ImageView)view11), ((TextView)view12), ((RecyclerView)view13), ((DcToolbar)view14));
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
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static m0 c(@NonNull LayoutInflater layoutInflater0) {
        return m0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static m0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E005D, viewGroup0, false);  // layout:activity_setting_def_img
        if(z) {
            viewGroup0.addView(view0);
        }
        return m0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

