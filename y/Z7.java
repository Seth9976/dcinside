package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ResizeTextView;
import kr.better.widget.BetterTextView;

public final class z7 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final BetterTextView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final ConstraintLayout d;
    @NonNull
    public final ImageView e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ProgressBar g;
    @NonNull
    public final AppCompatImageView h;
    @NonNull
    public final ResizeTextView i;
    @NonNull
    public final AppCompatImageView j;
    @NonNull
    public final ProgressBar k;

    private z7(@NonNull ConstraintLayout constraintLayout0, @NonNull BetterTextView betterTextView0, @NonNull ImageView imageView0, @NonNull ConstraintLayout constraintLayout1, @NonNull ImageView imageView1, @NonNull TextView textView0, @NonNull ProgressBar progressBar0, @NonNull AppCompatImageView appCompatImageView0, @NonNull ResizeTextView resizeTextView0, @NonNull AppCompatImageView appCompatImageView1, @NonNull ProgressBar progressBar1) {
        this.a = constraintLayout0;
        this.b = betterTextView0;
        this.c = imageView0;
        this.d = constraintLayout1;
        this.e = imageView1;
        this.f = textView0;
        this.g = progressBar0;
        this.h = appCompatImageView0;
        this.i = resizeTextView0;
        this.j = appCompatImageView1;
        this.k = progressBar1;
    }

    @NonNull
    public static z7 a(@NonNull View view0) {
        int v = 0x7F0B0D1C;  // id:reply_count
        View view1 = ViewBindings.a(view0, 0x7F0B0D1C);  // id:reply_count
        if(((BetterTextView)view1) != null) {
            v = 0x7F0B0D1D;  // id:reply_count_refresh
            View view2 = ViewBindings.a(view0, 0x7F0B0D1D);  // id:reply_count_refresh
            if(((ImageView)view2) != null) {
                v = 0x7F0B0D1E;  // id:reply_count_wrap
                View view3 = ViewBindings.a(view0, 0x7F0B0D1E);  // id:reply_count_wrap
                if(((ConstraintLayout)view3) != null) {
                    v = 0x7F0B0D2A;  // id:reply_filter_button
                    View view4 = ViewBindings.a(view0, 0x7F0B0D2A);  // id:reply_filter_button
                    if(((ImageView)view4) != null) {
                        v = 0x7F0B0D2B;  // id:reply_filter_loading
                        View view5 = ViewBindings.a(view0, 0x7F0B0D2B);  // id:reply_filter_loading
                        if(((TextView)view5) != null) {
                            v = 0x7F0B0D2C;  // id:reply_filter_progress
                            View view6 = ViewBindings.a(view0, 0x7F0B0D2C);  // id:reply_filter_progress
                            if(((ProgressBar)view6) != null) {
                                v = 0x7F0B0D66;  // id:reply_next
                                View view7 = ViewBindings.a(view0, 0x7F0B0D66);  // id:reply_next
                                if(((AppCompatImageView)view7) != null) {
                                    v = 0x7F0B0D67;  // id:reply_page
                                    View view8 = ViewBindings.a(view0, 0x7F0B0D67);  // id:reply_page
                                    if(((ResizeTextView)view8) != null) {
                                        v = 0x7F0B0D68;  // id:reply_prev
                                        View view9 = ViewBindings.a(view0, 0x7F0B0D68);  // id:reply_prev
                                        if(((AppCompatImageView)view9) != null) {
                                            v = 0x7F0B0D69;  // id:reply_progress
                                            View view10 = ViewBindings.a(view0, 0x7F0B0D69);  // id:reply_progress
                                            if(((ProgressBar)view10) != null) {
                                                return new z7(((ConstraintLayout)view0), ((BetterTextView)view1), ((ImageView)view2), ((ConstraintLayout)view3), ((ImageView)view4), ((TextView)view5), ((ProgressBar)view6), ((AppCompatImageView)view7), ((ResizeTextView)view8), ((AppCompatImageView)view9), ((ProgressBar)view10));
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
    public static z7 c(@NonNull LayoutInflater layoutInflater0) {
        return z7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static z7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0271, viewGroup0, false);  // layout:view_reply_page_top
        if(z) {
            viewGroup0.addView(view0);
        }
        return z7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

