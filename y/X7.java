package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.ResizeTextView;

public final class x7 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final LinearLayout c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final AppCompatImageView e;
    @NonNull
    public final ResizeTextView f;
    @NonNull
    public final ResizeTextView g;
    @NonNull
    public final ResizeTextView h;

    private x7(@NonNull ConstraintLayout constraintLayout0, @NonNull ImageView imageView0, @NonNull LinearLayout linearLayout0, @NonNull ImageView imageView1, @NonNull AppCompatImageView appCompatImageView0, @NonNull ResizeTextView resizeTextView0, @NonNull ResizeTextView resizeTextView1, @NonNull ResizeTextView resizeTextView2) {
        this.a = constraintLayout0;
        this.b = imageView0;
        this.c = linearLayout0;
        this.d = imageView1;
        this.e = appCompatImageView0;
        this.f = resizeTextView0;
        this.g = resizeTextView1;
        this.h = resizeTextView2;
    }

    @NonNull
    public static x7 a(@NonNull View view0) {
        int v = 0x7F0B0D55;  // id:reply_more_gallog_ic
        View view1 = ViewBindings.a(view0, 0x7F0B0D55);  // id:reply_more_gallog_ic
        if(((ImageView)view1) != null) {
            v = 0x7F0B0D56;  // id:reply_more_gallog_wrap
            View view2 = ViewBindings.a(view0, 0x7F0B0D56);  // id:reply_more_gallog_wrap
            if(((LinearLayout)view2) != null) {
                v = 0x7F0B0D59;  // id:reply_more_member_ic
                View view3 = ViewBindings.a(view0, 0x7F0B0D59);  // id:reply_more_member_ic
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0D5E;  // id:reply_more_under_ic
                    View view4 = ViewBindings.a(view0, 0x7F0B0D5E);  // id:reply_more_under_ic
                    if(((AppCompatImageView)view4) != null) {
                        v = 0x7F0B0D5F;  // id:reply_more_user_ip
                        View view5 = ViewBindings.a(view0, 0x7F0B0D5F);  // id:reply_more_user_ip
                        if(((ResizeTextView)view5) != null) {
                            v = 0x7F0B0D60;  // id:reply_more_user_name
                            View view6 = ViewBindings.a(view0, 0x7F0B0D60);  // id:reply_more_user_name
                            if(((ResizeTextView)view6) != null) {
                                v = 0x7F0B0D61;  // id:reply_more_user_write_info
                                View view7 = ViewBindings.a(view0, 0x7F0B0D61);  // id:reply_more_user_write_info
                                if(((ResizeTextView)view7) != null) {
                                    return new x7(((ConstraintLayout)view0), ((ImageView)view1), ((LinearLayout)view2), ((ImageView)view3), ((AppCompatImageView)view4), ((ResizeTextView)view5), ((ResizeTextView)view6), ((ResizeTextView)view7));
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
    public static x7 c(@NonNull LayoutInflater layoutInflater0) {
        return x7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static x7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E026F, viewGroup0, false);  // layout:view_reply_more_user
        if(z) {
            viewGroup0.addView(view0);
        }
        return x7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

