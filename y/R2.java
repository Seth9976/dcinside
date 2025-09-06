package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DcListToolbar;
import com.dcinside.app.view.SwipeHandleTabLayout;
import com.dcinside.app.view.TouchPressConsumeView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kr.better.widget.BetterTextView;

public final class r2 implements ViewBinding {
    @NonNull
    public final ViewStub A;
    @NonNull
    public final ViewStub B;
    @NonNull
    public final ViewStub C;
    @NonNull
    public final DcListToolbar D;
    @NonNull
    public final TextView E;
    @NonNull
    public final View F;
    @NonNull
    public final Barrier G;
    @NonNull
    public final Guideline H;
    @NonNull
    public final View I;
    @NonNull
    public final ConstraintLayout J;
    @NonNull
    public final ViewStub K;
    @NonNull
    public final ProgressBar L;
    @NonNull
    public final ConstraintLayout M;
    @NonNull
    public final View N;
    @NonNull
    public final ConstraintLayout O;
    @NonNull
    public final u6 P;
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final AppBarLayout c;
    @NonNull
    public final CollapsingToolbarLayout d;
    @NonNull
    public final CoordinatorLayout e;
    @NonNull
    public final ImageView f;
    @NonNull
    public final SwipeHandleTabLayout g;
    @NonNull
    public final TextView h;
    @NonNull
    public final TextView i;
    @NonNull
    public final Barrier j;
    @NonNull
    public final ConstraintLayout k;
    @NonNull
    public final ImageView l;
    @NonNull
    public final TextView m;
    @NonNull
    public final ProgressBar n;
    @NonNull
    public final TextView o;
    @NonNull
    public final BetterTextView p;
    @NonNull
    public final Barrier q;
    @NonNull
    public final RecyclerView r;
    @NonNull
    public final BetterTextView s;
    @NonNull
    public final Guideline t;
    @NonNull
    public final FrameLayout u;
    @NonNull
    public final FrameLayout v;
    @NonNull
    public final View w;
    @NonNull
    public final TouchPressConsumeView x;
    @NonNull
    public final RecyclerView y;
    @NonNull
    public final SwipeRefreshLayout z;

    private r2(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull FrameLayout frameLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull CollapsingToolbarLayout collapsingToolbarLayout0, @NonNull CoordinatorLayout coordinatorLayout1, @NonNull ImageView imageView0, @NonNull SwipeHandleTabLayout swipeHandleTabLayout0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull Barrier barrier0, @NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView1, @NonNull TextView textView2, @NonNull ProgressBar progressBar0, @NonNull TextView textView3, @NonNull BetterTextView betterTextView0, @NonNull Barrier barrier1, @NonNull RecyclerView recyclerView0, @NonNull BetterTextView betterTextView1, @NonNull Guideline guideline0, @NonNull FrameLayout frameLayout1, @NonNull FrameLayout frameLayout2, @NonNull View view0, @NonNull TouchPressConsumeView touchPressConsumeView0, @NonNull RecyclerView recyclerView1, @NonNull SwipeRefreshLayout swipeRefreshLayout0, @NonNull ViewStub viewStub0, @NonNull ViewStub viewStub1, @NonNull ViewStub viewStub2, @NonNull DcListToolbar dcListToolbar0, @NonNull TextView textView4, @NonNull View view1, @NonNull Barrier barrier2, @NonNull Guideline guideline1, @NonNull View view2, @NonNull ConstraintLayout constraintLayout1, @NonNull ViewStub viewStub3, @NonNull ProgressBar progressBar1, @NonNull ConstraintLayout constraintLayout2, @NonNull View view3, @NonNull ConstraintLayout constraintLayout3, @NonNull u6 u60) {
        this.a = coordinatorLayout0;
        this.b = frameLayout0;
        this.c = appBarLayout0;
        this.d = collapsingToolbarLayout0;
        this.e = coordinatorLayout1;
        this.f = imageView0;
        this.g = swipeHandleTabLayout0;
        this.h = textView0;
        this.i = textView1;
        this.j = barrier0;
        this.k = constraintLayout0;
        this.l = imageView1;
        this.m = textView2;
        this.n = progressBar0;
        this.o = textView3;
        this.p = betterTextView0;
        this.q = barrier1;
        this.r = recyclerView0;
        this.s = betterTextView1;
        this.t = guideline0;
        this.u = frameLayout1;
        this.v = frameLayout2;
        this.w = view0;
        this.x = touchPressConsumeView0;
        this.y = recyclerView1;
        this.z = swipeRefreshLayout0;
        this.A = viewStub0;
        this.B = viewStub1;
        this.C = viewStub2;
        this.D = dcListToolbar0;
        this.E = textView4;
        this.F = view1;
        this.G = barrier2;
        this.H = guideline1;
        this.I = view2;
        this.J = constraintLayout1;
        this.K = viewStub3;
        this.L = progressBar1;
        this.M = constraintLayout2;
        this.N = view3;
        this.O = constraintLayout3;
        this.P = u60;
    }

    @NonNull
    public static r2 a(@NonNull View view0) {
        int v = 0x7F0B007D;  // id:ad_container_view
        View view1 = ViewBindings.a(view0, 0x7F0B007D);  // id:ad_container_view
        if(((FrameLayout)view1) != null) {
            v = 0x7F0B06F2;  // id:list_appbar
            View view2 = ViewBindings.a(view0, 0x7F0B06F2);  // id:list_appbar
            if(((AppBarLayout)view2) != null) {
                v = 0x7F0B06F8;  // id:list_collapsing
                View view3 = ViewBindings.a(view0, 0x7F0B06F8);  // id:list_collapsing
                if(((CollapsingToolbarLayout)view3) != null) {
                    v = 0x7F0B06FA;  // id:list_cover_modify
                    View view4 = ViewBindings.a(view0, 0x7F0B06FA);  // id:list_cover_modify
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0701;  // id:list_head_tab
                        View view5 = ViewBindings.a(view0, 0x7F0B0701);  // id:list_head_tab
                        if(((SwipeHandleTabLayout)view5) != null) {
                            v = 0x7F0B0703;  // id:list_menu_guide
                            View view6 = ViewBindings.a(view0, 0x7F0B0703);  // id:list_menu_guide
                            if(((TextView)view6) != null) {
                                v = 0x7F0B0704;  // id:list_mini_anonymous
                                View view7 = ViewBindings.a(view0, 0x7F0B0704);  // id:list_mini_anonymous
                                if(((TextView)view7) != null) {
                                    v = 0x7F0B0705;  // id:list_mini_barrier
                                    View view8 = ViewBindings.a(view0, 0x7F0B0705);  // id:list_mini_barrier
                                    if(((Barrier)view8) != null) {
                                        v = 0x7F0B0706;  // id:list_mini_container
                                        View view9 = ViewBindings.a(view0, 0x7F0B0706);  // id:list_mini_container
                                        if(((ConstraintLayout)view9) != null) {
                                            v = 0x7F0B0707;  // id:list_mini_cover_image
                                            View view10 = ViewBindings.a(view0, 0x7F0B0707);  // id:list_mini_cover_image
                                            if(((ImageView)view10) != null) {
                                                v = 0x7F0B0709;  // id:list_mini_join_button
                                                View view11 = ViewBindings.a(view0, 0x7F0B0709);  // id:list_mini_join_button
                                                if(((TextView)view11) != null) {
                                                    v = 0x7F0B070A;  // id:list_mini_join_progress
                                                    View view12 = ViewBindings.a(view0, 0x7F0B070A);  // id:list_mini_join_progress
                                                    if(((ProgressBar)view12) != null) {
                                                        v = 0x7F0B070B;  // id:list_mini_join_time_out
                                                        View view13 = ViewBindings.a(view0, 0x7F0B070B);  // id:list_mini_join_time_out
                                                        if(((TextView)view13) != null) {
                                                            v = 0x7F0B070C;  // id:list_mini_member_amount
                                                            View view14 = ViewBindings.a(view0, 0x7F0B070C);  // id:list_mini_member_amount
                                                            if(((BetterTextView)view14) != null) {
                                                                v = 0x7F0B070D;  // id:list_mini_member_barrier
                                                                View view15 = ViewBindings.a(view0, 0x7F0B070D);  // id:list_mini_member_barrier
                                                                if(((Barrier)view15) != null) {
                                                                    v = 0x7F0B070E;  // id:list_mini_notice_list
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B070E);  // id:list_mini_notice_list
                                                                    if(((RecyclerView)view16) != null) {
                                                                        v = 0x7F0B070F;  // id:list_mini_private
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B070F);  // id:list_mini_private
                                                                        if(((BetterTextView)view17) != null) {
                                                                            v = 0x7F0B0712;  // id:list_mini_private_guideline
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B0712);  // id:list_mini_private_guideline
                                                                            if(((Guideline)view18) != null) {
                                                                                v = 0x7F0B0717;  // id:list_quick_ad_wrap
                                                                                View view19 = ViewBindings.a(view0, 0x7F0B0717);  // id:list_quick_ad_wrap
                                                                                if(((FrameLayout)view19) != null) {
                                                                                    v = 0x7F0B0718;  // id:list_quick_ad_wrap_bg
                                                                                    View view20 = ViewBindings.a(view0, 0x7F0B0718);  // id:list_quick_ad_wrap_bg
                                                                                    if(((FrameLayout)view20) != null) {
                                                                                        v = 0x7F0B0719;  // id:list_quick_ad_wrap_divider
                                                                                        View view21 = ViewBindings.a(view0, 0x7F0B0719);  // id:list_quick_ad_wrap_divider
                                                                                        if(view21 != null) {
                                                                                            v = 0x7F0B071A;  // id:list_quick_container
                                                                                            View view22 = ViewBindings.a(view0, 0x7F0B071A);  // id:list_quick_container
                                                                                            if(((TouchPressConsumeView)view22) != null) {
                                                                                                v = 0x7F0B071C;  // id:list_recycler
                                                                                                View view23 = ViewBindings.a(view0, 0x7F0B071C);  // id:list_recycler
                                                                                                if(((RecyclerView)view23) != null) {
                                                                                                    v = 0x7F0B071D;  // id:list_refresh
                                                                                                    View view24 = ViewBindings.a(view0, 0x7F0B071D);  // id:list_refresh
                                                                                                    if(((SwipeRefreshLayout)view24) != null) {
                                                                                                        v = 0x7F0B071F;  // id:list_stub_error_state
                                                                                                        View view25 = ViewBindings.a(view0, 0x7F0B071F);  // id:list_stub_error_state
                                                                                                        if(((ViewStub)view25) != null) {
                                                                                                            v = 0x7F0B0720;  // id:list_stub_filter
                                                                                                            View view26 = ViewBindings.a(view0, 0x7F0B0720);  // id:list_stub_filter
                                                                                                            if(((ViewStub)view26) != null) {
                                                                                                                v = 0x7F0B0721;  // id:list_stub_manager_situation
                                                                                                                View view27 = ViewBindings.a(view0, 0x7F0B0721);  // id:list_stub_manager_situation
                                                                                                                if(((ViewStub)view27) != null) {
                                                                                                                    v = 0x7F0B0724;  // id:list_toolbar
                                                                                                                    View view28 = ViewBindings.a(view0, 0x7F0B0724);  // id:list_toolbar
                                                                                                                    if(((DcListToolbar)view28) != null) {
                                                                                                                        v = 0x7F0B07FB;  // id:membership_gallery_balloon
                                                                                                                        View view29 = ViewBindings.a(view0, 0x7F0B07FB);  // id:membership_gallery_balloon
                                                                                                                        if(((TextView)view29) != null) {
                                                                                                                            v = 0x7F0B07FC;  // id:membership_gallery_balloon_guide
                                                                                                                            View view30 = ViewBindings.a(view0, 0x7F0B07FC);  // id:membership_gallery_balloon_guide
                                                                                                                            if(view30 != null) {
                                                                                                                                v = 0x7F0B07FD;  // id:membership_gallery_balloon_guide_barrier
                                                                                                                                View view31 = ViewBindings.a(view0, 0x7F0B07FD);  // id:membership_gallery_balloon_guide_barrier
                                                                                                                                if(((Barrier)view31) != null) {
                                                                                                                                    v = 0x7F0B07FE;  // id:membership_gallery_balloon_line
                                                                                                                                    View view32 = ViewBindings.a(view0, 0x7F0B07FE);  // id:membership_gallery_balloon_line
                                                                                                                                    if(((Guideline)view32) != null) {
                                                                                                                                        v = 0x7F0B07FF;  // id:membership_gallery_balloon_margin
                                                                                                                                        View view33 = ViewBindings.a(view0, 0x7F0B07FF);  // id:membership_gallery_balloon_margin
                                                                                                                                        if(view33 != null) {
                                                                                                                                            v = 0x7F0B0800;  // id:membership_gallery_balloon_parent
                                                                                                                                            View view34 = ViewBindings.a(view0, 0x7F0B0800);  // id:membership_gallery_balloon_parent
                                                                                                                                            if(((ConstraintLayout)view34) != null) {
                                                                                                                                                v = 0x7F0B09AC;  // id:person_header_stub
                                                                                                                                                View view35 = ViewBindings.a(view0, 0x7F0B09AC);  // id:person_header_stub
                                                                                                                                                if(((ViewStub)view35) != null) {
                                                                                                                                                    v = 0x7F0B0A8F;  // id:post_list_progress
                                                                                                                                                    View view36 = ViewBindings.a(view0, 0x7F0B0A8F);  // id:post_list_progress
                                                                                                                                                    if(((ProgressBar)view36) != null) {
                                                                                                                                                        v = 0x7F0B0A90;  // id:post_list_quick_write
                                                                                                                                                        View view37 = ViewBindings.a(view0, 0x7F0B0A90);  // id:post_list_quick_write
                                                                                                                                                        if(((ConstraintLayout)view37) != null) {
                                                                                                                                                            v = 0x7F0B0A91;  // id:post_list_quick_write_icon_guide
                                                                                                                                                            View view38 = ViewBindings.a(view0, 0x7F0B0A91);  // id:post_list_quick_write_icon_guide
                                                                                                                                                            if(view38 != null) {
                                                                                                                                                                v = 0x7F0B0A95;  // id:post_list_refresh
                                                                                                                                                                View view39 = ViewBindings.a(view0, 0x7F0B0A95);  // id:post_list_refresh
                                                                                                                                                                if(((ConstraintLayout)view39) != null) {
                                                                                                                                                                    v = 0x7F0B0BFE;  // id:quick
                                                                                                                                                                    View view40 = ViewBindings.a(view0, 0x7F0B0BFE);  // id:quick
                                                                                                                                                                    if(view40 != null) {
                                                                                                                                                                        return new r2(((CoordinatorLayout)view0), ((FrameLayout)view1), ((AppBarLayout)view2), ((CollapsingToolbarLayout)view3), ((CoordinatorLayout)view0), ((ImageView)view4), ((SwipeHandleTabLayout)view5), ((TextView)view6), ((TextView)view7), ((Barrier)view8), ((ConstraintLayout)view9), ((ImageView)view10), ((TextView)view11), ((ProgressBar)view12), ((TextView)view13), ((BetterTextView)view14), ((Barrier)view15), ((RecyclerView)view16), ((BetterTextView)view17), ((Guideline)view18), ((FrameLayout)view19), ((FrameLayout)view20), view21, ((TouchPressConsumeView)view22), ((RecyclerView)view23), ((SwipeRefreshLayout)view24), ((ViewStub)view25), ((ViewStub)view26), ((ViewStub)view27), ((DcListToolbar)view28), ((TextView)view29), view30, ((Barrier)view31), ((Guideline)view32), view33, ((ConstraintLayout)view34), ((ViewStub)view35), ((ProgressBar)view36), ((ConstraintLayout)view37), view38, ((ConstraintLayout)view39), u6.a(view40));
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
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public CoordinatorLayout b() {
        return this.a;
    }

    @NonNull
    public static r2 c(@NonNull LayoutInflater layoutInflater0) {
        return r2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static r2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0112, viewGroup0, false);  // layout:fragment_post_list
        if(z) {
            viewGroup0.addView(view0);
        }
        return r2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

