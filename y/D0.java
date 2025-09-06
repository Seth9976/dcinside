package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcToolbar;
import com.lsjwzh.widget.recyclerviewpager.RecyclerViewPager;

public final class d0 implements ViewBinding {
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final LinearLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final RecyclerViewPager g;
    @NonNull
    public final ImageView h;
    @NonNull
    public final TextView i;
    @NonNull
    public final LinearLayout j;
    @NonNull
    public final TextView k;
    @NonNull
    public final TextView l;
    @NonNull
    public final ImageView m;
    @NonNull
    public final TextView n;
    @NonNull
    public final RecyclerViewPager o;
    @NonNull
    public final ImageView p;
    @NonNull
    public final TextView q;
    @NonNull
    public final ProgressBar r;
    @NonNull
    public final ScrollView s;
    @NonNull
    public final DcToolbar t;

    private d0(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull LinearLayout linearLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull ImageView imageView0, @NonNull TextView textView2, @NonNull RecyclerViewPager recyclerViewPager0, @NonNull ImageView imageView1, @NonNull TextView textView3, @NonNull LinearLayout linearLayout1, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull ImageView imageView2, @NonNull TextView textView6, @NonNull RecyclerViewPager recyclerViewPager1, @NonNull ImageView imageView3, @NonNull TextView textView7, @NonNull ProgressBar progressBar0, @NonNull ScrollView scrollView0, @NonNull DcToolbar dcToolbar0) {
        this.a = coordinatorLayout0;
        this.b = linearLayout0;
        this.c = textView0;
        this.d = textView1;
        this.e = imageView0;
        this.f = textView2;
        this.g = recyclerViewPager0;
        this.h = imageView1;
        this.i = textView3;
        this.j = linearLayout1;
        this.k = textView4;
        this.l = textView5;
        this.m = imageView2;
        this.n = textView6;
        this.o = recyclerViewPager1;
        this.p = imageView3;
        this.q = textView7;
        this.r = progressBar0;
        this.s = scrollView0;
        this.t = dcToolbar0;
    }

    @NonNull
    public static d0 a(@NonNull View view0) {
        int v = 0x7F0B0CE9;  // id:relation_gallery_follow_controls
        View view1 = ViewBindings.a(view0, 0x7F0B0CE9);  // id:relation_gallery_follow_controls
        if(((LinearLayout)view1) != null) {
            v = 0x7F0B0CEA;  // id:relation_gallery_follow_desc
            View view2 = ViewBindings.a(view0, 0x7F0B0CEA);  // id:relation_gallery_follow_desc
            if(((TextView)view2) != null) {
                v = 0x7F0B0CEB;  // id:relation_gallery_follow_empty
                View view3 = ViewBindings.a(view0, 0x7F0B0CEB);  // id:relation_gallery_follow_empty
                if(((TextView)view3) != null) {
                    v = 0x7F0B0CEC;  // id:relation_gallery_follow_next
                    View view4 = ViewBindings.a(view0, 0x7F0B0CEC);  // id:relation_gallery_follow_next
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0CED;  // id:relation_gallery_follow_page
                        View view5 = ViewBindings.a(view0, 0x7F0B0CED);  // id:relation_gallery_follow_page
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0CEE;  // id:relation_gallery_follow_pager
                            View view6 = ViewBindings.a(view0, 0x7F0B0CEE);  // id:relation_gallery_follow_pager
                            if(((RecyclerViewPager)view6) != null) {
                                v = 0x7F0B0CEF;  // id:relation_gallery_follow_prev
                                View view7 = ViewBindings.a(view0, 0x7F0B0CEF);  // id:relation_gallery_follow_prev
                                if(((ImageView)view7) != null) {
                                    v = 0x7F0B0CF0;  // id:relation_gallery_follow_title
                                    View view8 = ViewBindings.a(view0, 0x7F0B0CF0);  // id:relation_gallery_follow_title
                                    if(((TextView)view8) != null) {
                                        v = 0x7F0B0CF1;  // id:relation_gallery_following_controls
                                        View view9 = ViewBindings.a(view0, 0x7F0B0CF1);  // id:relation_gallery_following_controls
                                        if(((LinearLayout)view9) != null) {
                                            v = 0x7F0B0CF2;  // id:relation_gallery_following_desc
                                            View view10 = ViewBindings.a(view0, 0x7F0B0CF2);  // id:relation_gallery_following_desc
                                            if(((TextView)view10) != null) {
                                                v = 0x7F0B0CF3;  // id:relation_gallery_following_empty
                                                View view11 = ViewBindings.a(view0, 0x7F0B0CF3);  // id:relation_gallery_following_empty
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B0CF4;  // id:relation_gallery_following_next
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0CF4);  // id:relation_gallery_following_next
                                                    if(((ImageView)view12) != null) {
                                                        v = 0x7F0B0CF5;  // id:relation_gallery_following_page
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0CF5);  // id:relation_gallery_following_page
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B0CF6;  // id:relation_gallery_following_pager
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0CF6);  // id:relation_gallery_following_pager
                                                            if(((RecyclerViewPager)view14) != null) {
                                                                v = 0x7F0B0CF7;  // id:relation_gallery_following_prev
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0CF7);  // id:relation_gallery_following_prev
                                                                if(((ImageView)view15) != null) {
                                                                    v = 0x7F0B0CF8;  // id:relation_gallery_following_title
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B0CF8);  // id:relation_gallery_following_title
                                                                    if(((TextView)view16) != null) {
                                                                        v = 0x7F0B0D17;  // id:relation_gallery_progress
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B0D17);  // id:relation_gallery_progress
                                                                        if(((ProgressBar)view17) != null) {
                                                                            v = 0x7F0B0D18;  // id:relation_gallery_scroll
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B0D18);  // id:relation_gallery_scroll
                                                                            if(((ScrollView)view18) != null) {
                                                                                v = 0x7F0B0D19;  // id:relation_gallery_toolbar
                                                                                View view19 = ViewBindings.a(view0, 0x7F0B0D19);  // id:relation_gallery_toolbar
                                                                                if(((DcToolbar)view19) != null) {
                                                                                    return new d0(((CoordinatorLayout)view0), ((LinearLayout)view1), ((TextView)view2), ((TextView)view3), ((ImageView)view4), ((TextView)view5), ((RecyclerViewPager)view6), ((ImageView)view7), ((TextView)view8), ((LinearLayout)view9), ((TextView)view10), ((TextView)view11), ((ImageView)view12), ((TextView)view13), ((RecyclerViewPager)view14), ((ImageView)view15), ((TextView)view16), ((ProgressBar)view17), ((ScrollView)view18), ((DcToolbar)view19));
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
    public static d0 c(@NonNull LayoutInflater layoutInflater0) {
        return d0.d(layoutInflater0, null, false);
    }

    @NonNull
    public static d0 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0054, viewGroup0, false);  // layout:activity_relation_gallery
        if(z) {
            viewGroup0.addView(view0);
        }
        return d0.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

