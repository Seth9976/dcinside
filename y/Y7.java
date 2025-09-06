package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ResizeTextView;
import kr.better.widget.BetterTextView;

public final class y7 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final BetterTextView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final AppCompatImageView e;
    @NonNull
    public final ResizeTextView f;
    @NonNull
    public final AppCompatImageView g;
    @NonNull
    public final ProgressBar h;
    @NonNull
    public final ConstraintLayout i;
    @NonNull
    public final BetterTextView j;

    private y7(@NonNull ConstraintLayout constraintLayout0, @NonNull BetterTextView betterTextView0, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout1, @NonNull AppCompatImageView appCompatImageView0, @NonNull ResizeTextView resizeTextView0, @NonNull AppCompatImageView appCompatImageView1, @NonNull ProgressBar progressBar0, @NonNull ConstraintLayout constraintLayout2, @NonNull BetterTextView betterTextView1) {
        this.a = constraintLayout0;
        this.b = betterTextView0;
        this.c = imageView0;
        this.d = constraintLayout1;
        this.e = appCompatImageView0;
        this.f = resizeTextView0;
        this.g = appCompatImageView1;
        this.h = progressBar0;
        this.i = constraintLayout2;
        this.j = betterTextView1;
    }

    @NonNull
    public static y7 a(@NonNull View view0) {
        int v = 0x7F0B0D1C;  // id:reply_count
        View view1 = ViewBindings.a(view0, 0x7F0B0D1C);  // id:reply_count
        if(((BetterTextView)view1) != null) {
            v = 0x7F0B0D1D;  // id:reply_count_refresh
            View view2 = ViewBindings.a(view0, 0x7F0B0D1D);  // id:reply_count_refresh
            if(((ImageView)view2) != null) {
                v = 0x7F0B0D1E;  // id:reply_count_wrap
                View view3 = ViewBindings.a(view0, 0x7F0B0D1E);  // id:reply_count_wrap
                if(((ConstraintLayout)view3) != null) {
                    v = 0x7F0B0D66;  // id:reply_next
                    View view4 = ViewBindings.a(view0, 0x7F0B0D66);  // id:reply_next
                    if(((AppCompatImageView)view4) != null) {
                        v = 0x7F0B0D67;  // id:reply_page
                        View view5 = ViewBindings.a(view0, 0x7F0B0D67);  // id:reply_page
                        if(((ResizeTextView)view5) != null) {
                            v = 0x7F0B0D68;  // id:reply_prev
                            View view6 = ViewBindings.a(view0, 0x7F0B0D68);  // id:reply_prev
                            if(((AppCompatImageView)view6) != null) {
                                v = 0x7F0B0D69;  // id:reply_progress
                                View view7 = ViewBindings.a(view0, 0x7F0B0D69);  // id:reply_progress
                                if(((ProgressBar)view7) != null) {
                                    v = 0x7F0B0D71;  // id:reply_to_top
                                    View view8 = ViewBindings.a(view0, 0x7F0B0D71);  // id:reply_to_top
                                    if(((ConstraintLayout)view8) != null) {
                                        v = 0x7F0B0D72;  // id:reply_to_top_text
                                        View view9 = ViewBindings.a(view0, 0x7F0B0D72);  // id:reply_to_top_text
                                        if(((BetterTextView)view9) != null) {
                                            return new y7(((ConstraintLayout)view0), ((BetterTextView)view1), ((ImageView)view2), ((ConstraintLayout)view3), ((AppCompatImageView)view4), ((ResizeTextView)view5), ((AppCompatImageView)view6), ((ProgressBar)view7), ((ConstraintLayout)view8), ((BetterTextView)view9));
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
    public static y7 c(@NonNull LayoutInflater layoutInflater0) {
        return y7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static y7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0270, viewGroup0, false);  // layout:view_reply_page_bot
        if(z) {
            viewGroup0.addView(view0);
        }
        return y7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

