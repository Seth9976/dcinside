package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ClearableEditText;
import com.dcinside.app.view.DcToolbar;
import com.dcinside.app.view.TouchPressConsumeView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kr.better.widget.BetterTextView;

public final class s2 implements ViewBinding {
    @NonNull
    public final TextView A;
    @NonNull
    public final ClearableEditText B;
    @NonNull
    public final ConstraintLayout C;
    @NonNull
    public final TextView D;
    @NonNull
    public final FrameLayout E;
    @NonNull
    public final DcToolbar F;
    @NonNull
    public final ConstraintLayout G;
    @NonNull
    public final ImageView H;
    @NonNull
    public final TextView I;
    @NonNull
    public final ImageView J;
    @NonNull
    public final TextView K;
    @NonNull
    public final ImageView L;
    @NonNull
    public final ConstraintLayout M;
    @NonNull
    public final TextView N;
    @NonNull
    public final ViewStub O;
    @NonNull
    public final ConstraintLayout P;
    @NonNull
    public final BetterTextView Q;
    @NonNull
    public final Guideline R;
    @NonNull
    public final ProgressBar S;
    @NonNull
    private final CoordinatorLayout a;
    @NonNull
    public final BetterTextView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final LinearLayout f;
    @NonNull
    public final AppBarLayout g;
    @NonNull
    public final TouchPressConsumeView h;
    @NonNull
    public final CollapsingToolbarLayout i;
    @NonNull
    public final CoordinatorLayout j;
    @NonNull
    public final FrameLayout k;
    @NonNull
    public final G2 l;
    @NonNull
    public final TouchPressConsumeView m;
    @NonNull
    public final RecyclerView n;
    @NonNull
    public final SwipeRefreshLayout o;
    @NonNull
    public final FrameLayout p;
    @NonNull
    public final ImageView q;
    @NonNull
    public final TextView r;
    @NonNull
    public final ImageView s;
    @NonNull
    public final ConstraintLayout t;
    @NonNull
    public final ConstraintLayout u;
    @NonNull
    public final ConstraintLayout v;
    @NonNull
    public final ImageView w;
    @NonNull
    public final ImageView x;
    @NonNull
    public final ConstraintLayout y;
    @NonNull
    public final ImageView z;

    private s2(@NonNull CoordinatorLayout coordinatorLayout0, @NonNull BetterTextView betterTextView0, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView1, @NonNull LinearLayout linearLayout0, @NonNull AppBarLayout appBarLayout0, @NonNull TouchPressConsumeView touchPressConsumeView0, @NonNull CollapsingToolbarLayout collapsingToolbarLayout0, @NonNull CoordinatorLayout coordinatorLayout1, @NonNull FrameLayout frameLayout0, @NonNull G2 g20, @NonNull TouchPressConsumeView touchPressConsumeView1, @NonNull RecyclerView recyclerView0, @NonNull SwipeRefreshLayout swipeRefreshLayout0, @NonNull FrameLayout frameLayout1, @NonNull ImageView imageView2, @NonNull TextView textView0, @NonNull ImageView imageView3, @NonNull ConstraintLayout constraintLayout1, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ConstraintLayout constraintLayout4, @NonNull ImageView imageView6, @NonNull TextView textView1, @NonNull ClearableEditText clearableEditText0, @NonNull ConstraintLayout constraintLayout5, @NonNull TextView textView2, @NonNull FrameLayout frameLayout2, @NonNull DcToolbar dcToolbar0, @NonNull ConstraintLayout constraintLayout6, @NonNull ImageView imageView7, @NonNull TextView textView3, @NonNull ImageView imageView8, @NonNull TextView textView4, @NonNull ImageView imageView9, @NonNull ConstraintLayout constraintLayout7, @NonNull TextView textView5, @NonNull ViewStub viewStub0, @NonNull ConstraintLayout constraintLayout8, @NonNull BetterTextView betterTextView1, @NonNull Guideline guideline0, @NonNull ProgressBar progressBar0) {
        this.a = coordinatorLayout0;
        this.b = betterTextView0;
        this.c = imageView0;
        this.d = constraintLayout0;
        this.e = imageView1;
        this.f = linearLayout0;
        this.g = appBarLayout0;
        this.h = touchPressConsumeView0;
        this.i = collapsingToolbarLayout0;
        this.j = coordinatorLayout1;
        this.k = frameLayout0;
        this.l = g20;
        this.m = touchPressConsumeView1;
        this.n = recyclerView0;
        this.o = swipeRefreshLayout0;
        this.p = frameLayout1;
        this.q = imageView2;
        this.r = textView0;
        this.s = imageView3;
        this.t = constraintLayout1;
        this.u = constraintLayout2;
        this.v = constraintLayout3;
        this.w = imageView4;
        this.x = imageView5;
        this.y = constraintLayout4;
        this.z = imageView6;
        this.A = textView1;
        this.B = clearableEditText0;
        this.C = constraintLayout5;
        this.D = textView2;
        this.E = frameLayout2;
        this.F = dcToolbar0;
        this.G = constraintLayout6;
        this.H = imageView7;
        this.I = textView3;
        this.J = imageView8;
        this.K = textView4;
        this.L = imageView9;
        this.M = constraintLayout7;
        this.N = textView5;
        this.O = viewStub0;
        this.P = constraintLayout8;
        this.Q = betterTextView1;
        this.R = guideline0;
        this.S = progressBar0;
    }

    @NonNull
    public static s2 a(@NonNull View view0) {
        int v = 0x7F0B0A2F;  // id:post_container_content_full_guide
        View view1 = ViewBindings.a(view0, 0x7F0B0A2F);  // id:post_container_content_full_guide
        if(((BetterTextView)view1) != null) {
            v = 0x7F0B0A30;  // id:post_container_content_full_guide_tip
            View view2 = ViewBindings.a(view0, 0x7F0B0A30);  // id:post_container_content_full_guide_tip
            if(((ImageView)view2) != null) {
                v = 0x7F0B0A31;  // id:post_container_content_full_guide_wrap
                View view3 = ViewBindings.a(view0, 0x7F0B0A31);  // id:post_container_content_full_guide_wrap
                if(((ConstraintLayout)view3) != null) {
                    v = 0x7F0B0A32;  // id:post_container_content_full_icon
                    View view4 = ViewBindings.a(view0, 0x7F0B0A32);  // id:post_container_content_full_icon
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0A33;  // id:post_container_content_full_wrap
                        View view5 = ViewBindings.a(view0, 0x7F0B0A33);  // id:post_container_content_full_wrap
                        if(((LinearLayout)view5) != null) {
                            v = 0x7F0B0AD2;  // id:post_read_appbar
                            View view6 = ViewBindings.a(view0, 0x7F0B0AD2);  // id:post_read_appbar
                            if(((AppBarLayout)view6) != null) {
                                v = 0x7F0B0AD3;  // id:post_read_click_hijack
                                View view7 = ViewBindings.a(view0, 0x7F0B0AD3);  // id:post_read_click_hijack
                                if(((TouchPressConsumeView)view7) != null) {
                                    v = 0x7F0B0AD4;  // id:post_read_collapsing
                                    View view8 = ViewBindings.a(view0, 0x7F0B0AD4);  // id:post_read_collapsing
                                    if(((CollapsingToolbarLayout)view8) != null) {
                                        v = 0x7F0B0AD6;  // id:post_read_image_note
                                        View view9 = ViewBindings.a(view0, 0x7F0B0AD6);  // id:post_read_image_note
                                        if(((FrameLayout)view9) != null) {
                                            v = 0x7F0B0AD7;  // id:post_read_input_replies
                                            View view10 = ViewBindings.a(view0, 0x7F0B0AD7);  // id:post_read_input_replies
                                            if(view10 != null) {
                                                G2 g20 = G2.a(view10);
                                                v = 0x7F0B0AD8;  // id:post_read_input_replies_parent
                                                View view11 = ViewBindings.a(view0, 0x7F0B0AD8);  // id:post_read_input_replies_parent
                                                if(((TouchPressConsumeView)view11) != null) {
                                                    v = 0x7F0B0AD9;  // id:post_read_recycler
                                                    View view12 = ViewBindings.a(view0, 0x7F0B0AD9);  // id:post_read_recycler
                                                    if(((RecyclerView)view12) != null) {
                                                        v = 0x7F0B0ADA;  // id:post_read_refresh
                                                        View view13 = ViewBindings.a(view0, 0x7F0B0ADA);  // id:post_read_refresh
                                                        if(((SwipeRefreshLayout)view13) != null) {
                                                            v = 0x7F0B0ADB;  // id:post_read_replies_bottom_container
                                                            View view14 = ViewBindings.a(view0, 0x7F0B0ADB);  // id:post_read_replies_bottom_container
                                                            if(((FrameLayout)view14) != null) {
                                                                v = 0x7F0B0ADC;  // id:post_read_reply_back
                                                                View view15 = ViewBindings.a(view0, 0x7F0B0ADC);  // id:post_read_reply_back
                                                                if(((ImageView)view15) != null) {
                                                                    v = 0x7F0B0ADD;  // id:post_read_reply_count
                                                                    View view16 = ViewBindings.a(view0, 0x7F0B0ADD);  // id:post_read_reply_count
                                                                    if(((TextView)view16) != null) {
                                                                        v = 0x7F0B0ADE;  // id:post_read_reply_icon
                                                                        View view17 = ViewBindings.a(view0, 0x7F0B0ADE);  // id:post_read_reply_icon
                                                                        if(((ImageView)view17) != null) {
                                                                            v = 0x7F0B0ADF;  // id:post_read_reply_only_title_wrap
                                                                            View view18 = ViewBindings.a(view0, 0x7F0B0ADF);  // id:post_read_reply_only_title_wrap
                                                                            if(((ConstraintLayout)view18) != null) {
                                                                                v = 0x7F0B0AE0;  // id:post_read_reply_only_wrap
                                                                                View view19 = ViewBindings.a(view0, 0x7F0B0AE0);  // id:post_read_reply_only_wrap
                                                                                if(((ConstraintLayout)view19) != null) {
                                                                                    v = 0x7F0B0AE1;  // id:post_read_reply_refresh
                                                                                    View view20 = ViewBindings.a(view0, 0x7F0B0AE1);  // id:post_read_reply_refresh
                                                                                    if(((ConstraintLayout)view20) != null) {
                                                                                        v = 0x7F0B0AE2;  // id:post_read_reply_search
                                                                                        View view21 = ViewBindings.a(view0, 0x7F0B0AE2);  // id:post_read_reply_search
                                                                                        if(((ImageView)view21) != null) {
                                                                                            v = 0x7F0B0AE3;  // id:post_read_reply_search_confirm
                                                                                            View view22 = ViewBindings.a(view0, 0x7F0B0AE3);  // id:post_read_reply_search_confirm
                                                                                            if(((ImageView)view22) != null) {
                                                                                                v = 0x7F0B0AE4;  // id:post_read_reply_search_my_reply
                                                                                                View view23 = ViewBindings.a(view0, 0x7F0B0AE4);  // id:post_read_reply_search_my_reply
                                                                                                if(((ConstraintLayout)view23) != null) {
                                                                                                    v = 0x7F0B0AE5;  // id:post_read_reply_search_my_reply_icon
                                                                                                    View view24 = ViewBindings.a(view0, 0x7F0B0AE5);  // id:post_read_reply_search_my_reply_icon
                                                                                                    if(((ImageView)view24) != null) {
                                                                                                        v = 0x7F0B0AE6;  // id:post_read_reply_search_my_reply_text
                                                                                                        View view25 = ViewBindings.a(view0, 0x7F0B0AE6);  // id:post_read_reply_search_my_reply_text
                                                                                                        if(((TextView)view25) != null) {
                                                                                                            v = 0x7F0B0AE7;  // id:post_read_reply_search_text
                                                                                                            View view26 = ViewBindings.a(view0, 0x7F0B0AE7);  // id:post_read_reply_search_text
                                                                                                            if(((ClearableEditText)view26) != null) {
                                                                                                                v = 0x7F0B0AE8;  // id:post_read_reply_search_wrap
                                                                                                                View view27 = ViewBindings.a(view0, 0x7F0B0AE8);  // id:post_read_reply_search_wrap
                                                                                                                if(((ConstraintLayout)view27) != null) {
                                                                                                                    v = 0x7F0B0AE9;  // id:post_read_reply_subject
                                                                                                                    View view28 = ViewBindings.a(view0, 0x7F0B0AE9);  // id:post_read_reply_subject
                                                                                                                    if(((TextView)view28) != null) {
                                                                                                                        v = 0x7F0B0AEA;  // id:post_read_to_top
                                                                                                                        View view29 = ViewBindings.a(view0, 0x7F0B0AEA);  // id:post_read_to_top
                                                                                                                        if(((FrameLayout)view29) != null) {
                                                                                                                            v = 0x7F0B0AEB;  // id:post_read_toolbar
                                                                                                                            View view30 = ViewBindings.a(view0, 0x7F0B0AEB);  // id:post_read_toolbar
                                                                                                                            if(((DcToolbar)view30) != null) {
                                                                                                                                v = 0x7F0B0AEC;  // id:post_reply_search_block
                                                                                                                                View view31 = ViewBindings.a(view0, 0x7F0B0AEC);  // id:post_reply_search_block
                                                                                                                                if(((ConstraintLayout)view31) != null) {
                                                                                                                                    v = 0x7F0B0AED;  // id:post_reply_search_block_ico
                                                                                                                                    View view32 = ViewBindings.a(view0, 0x7F0B0AED);  // id:post_reply_search_block_ico
                                                                                                                                    if(((ImageView)view32) != null) {
                                                                                                                                        v = 0x7F0B0AEE;  // id:post_reply_search_block_text
                                                                                                                                        View view33 = ViewBindings.a(view0, 0x7F0B0AEE);  // id:post_reply_search_block_text
                                                                                                                                        if(((TextView)view33) != null) {
                                                                                                                                            v = 0x7F0B0AEF;  // id:post_reply_search_next
                                                                                                                                            View view34 = ViewBindings.a(view0, 0x7F0B0AEF);  // id:post_reply_search_next
                                                                                                                                            if(((ImageView)view34) != null) {
                                                                                                                                                v = 0x7F0B0AF0;  // id:post_reply_search_position_text
                                                                                                                                                View view35 = ViewBindings.a(view0, 0x7F0B0AF0);  // id:post_reply_search_position_text
                                                                                                                                                if(((TextView)view35) != null) {
                                                                                                                                                    v = 0x7F0B0AF1;  // id:post_reply_search_prev
                                                                                                                                                    View view36 = ViewBindings.a(view0, 0x7F0B0AF1);  // id:post_reply_search_prev
                                                                                                                                                    if(((ImageView)view36) != null) {
                                                                                                                                                        v = 0x7F0B0AF2;  // id:post_reply_search_result_wrap
                                                                                                                                                        View view37 = ViewBindings.a(view0, 0x7F0B0AF2);  // id:post_reply_search_result_wrap
                                                                                                                                                        if(((ConstraintLayout)view37) != null) {
                                                                                                                                                            v = 0x7F0B0C1F;  // id:read_best_reply_filter_guide
                                                                                                                                                            View view38 = ViewBindings.a(view0, 0x7F0B0C1F);  // id:read_best_reply_filter_guide
                                                                                                                                                            if(((TextView)view38) != null) {
                                                                                                                                                                v = 0x7F0B0C26;  // id:read_error_state
                                                                                                                                                                View view39 = ViewBindings.a(view0, 0x7F0B0C26);  // id:read_error_state
                                                                                                                                                                if(((ViewStub)view39) != null) {
                                                                                                                                                                    v = 0x7F0B0C6B;  // id:read_like_push_guide
                                                                                                                                                                    View view40 = ViewBindings.a(view0, 0x7F0B0C6B);  // id:read_like_push_guide
                                                                                                                                                                    if(((ConstraintLayout)view40) != null) {
                                                                                                                                                                        v = 0x7F0B0C6C;  // id:read_like_push_guide_content
                                                                                                                                                                        View view41 = ViewBindings.a(view0, 0x7F0B0C6C);  // id:read_like_push_guide_content
                                                                                                                                                                        if(((BetterTextView)view41) != null) {
                                                                                                                                                                            v = 0x7F0B0C6D;  // id:read_like_push_guide_guideline
                                                                                                                                                                            View view42 = ViewBindings.a(view0, 0x7F0B0C6D);  // id:read_like_push_guide_guideline
                                                                                                                                                                            if(((Guideline)view42) != null) {
                                                                                                                                                                                v = 0x7F0B0C99;  // id:read_voice_progress
                                                                                                                                                                                View view43 = ViewBindings.a(view0, 0x7F0B0C99);  // id:read_voice_progress
                                                                                                                                                                                if(((ProgressBar)view43) != null) {
                                                                                                                                                                                    return new s2(((CoordinatorLayout)view0), ((BetterTextView)view1), ((ImageView)view2), ((ConstraintLayout)view3), ((ImageView)view4), ((LinearLayout)view5), ((AppBarLayout)view6), ((TouchPressConsumeView)view7), ((CollapsingToolbarLayout)view8), ((CoordinatorLayout)view0), ((FrameLayout)view9), g20, ((TouchPressConsumeView)view11), ((RecyclerView)view12), ((SwipeRefreshLayout)view13), ((FrameLayout)view14), ((ImageView)view15), ((TextView)view16), ((ImageView)view17), ((ConstraintLayout)view18), ((ConstraintLayout)view19), ((ConstraintLayout)view20), ((ImageView)view21), ((ImageView)view22), ((ConstraintLayout)view23), ((ImageView)view24), ((TextView)view25), ((ClearableEditText)view26), ((ConstraintLayout)view27), ((TextView)view28), ((FrameLayout)view29), ((DcToolbar)view30), ((ConstraintLayout)view31), ((ImageView)view32), ((TextView)view33), ((ImageView)view34), ((TextView)view35), ((ImageView)view36), ((ConstraintLayout)view37), ((TextView)view38), ((ViewStub)view39), ((ConstraintLayout)view40), ((BetterTextView)view41), ((Guideline)view42), ((ProgressBar)view43));
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
    public static s2 c(@NonNull LayoutInflater layoutInflater0) {
        return s2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static s2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0113, viewGroup0, false);  // layout:fragment_post_read
        if(z) {
            viewGroup0.addView(view0);
        }
        return s2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

