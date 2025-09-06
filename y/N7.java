package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DividerConstraintLayout;
import com.dcinside.app.view.ResizeTextView;

public final class n7 implements ViewBinding {
    @NonNull
    private final DividerConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final ResizeTextView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final ResizeTextView e;
    @NonNull
    public final ResizeTextView f;
    @NonNull
    public final AppCompatImageView g;
    @NonNull
    public final ResizeTextView h;
    @NonNull
    public final ResizeTextView i;
    @NonNull
    public final AppCompatImageView j;
    @NonNull
    public final ResizeTextView k;

    private n7(@NonNull DividerConstraintLayout dividerConstraintLayout0, @NonNull TextView textView0, @NonNull ResizeTextView resizeTextView0, @NonNull ImageView imageView0, @NonNull ResizeTextView resizeTextView1, @NonNull ResizeTextView resizeTextView2, @NonNull AppCompatImageView appCompatImageView0, @NonNull ResizeTextView resizeTextView3, @NonNull ResizeTextView resizeTextView4, @NonNull AppCompatImageView appCompatImageView1, @NonNull ResizeTextView resizeTextView5) {
        this.a = dividerConstraintLayout0;
        this.b = textView0;
        this.c = resizeTextView0;
        this.d = imageView0;
        this.e = resizeTextView1;
        this.f = resizeTextView2;
        this.g = appCompatImageView0;
        this.h = resizeTextView3;
        this.i = resizeTextView4;
        this.j = appCompatImageView1;
        this.k = resizeTextView5;
    }

    @NonNull
    public static n7 a(@NonNull View view0) {
        int v = 0x7F0B0D2D;  // id:reply_first_icon
        View view1 = ViewBindings.a(view0, 0x7F0B0D2D);  // id:reply_first_icon
        if(((TextView)view1) != null) {
            v = 0x7F0B0D2E;  // id:reply_ip
            View view2 = ViewBindings.a(view0, 0x7F0B0D2E);  // id:reply_ip
            if(((ResizeTextView)view2) != null) {
                v = 0x7F0B0D30;  // id:reply_member_ic
                View view3 = ViewBindings.a(view0, 0x7F0B0D30);  // id:reply_member_ic
                if(((ImageView)view3) != null) {
                    v = 0x7F0B0D31;  // id:reply_memo
                    View view4 = ViewBindings.a(view0, 0x7F0B0D31);  // id:reply_memo
                    if(((ResizeTextView)view4) != null) {
                        v = 0x7F0B0D32;  // id:reply_mention
                        View view5 = ViewBindings.a(view0, 0x7F0B0D32);  // id:reply_mention
                        if(((ResizeTextView)view5) != null) {
                            v = 0x7F0B0D33;  // id:reply_more
                            View view6 = ViewBindings.a(view0, 0x7F0B0D33);  // id:reply_more
                            if(((AppCompatImageView)view6) != null) {
                                v = 0x7F0B0D65;  // id:reply_name
                                View view7 = ViewBindings.a(view0, 0x7F0B0D65);  // id:reply_name
                                if(((ResizeTextView)view7) != null) {
                                    v = 0x7F0B0D70;  // id:reply_time
                                    View view8 = ViewBindings.a(view0, 0x7F0B0D70);  // id:reply_time
                                    if(((ResizeTextView)view8) != null) {
                                        v = 0x7F0B0D73;  // id:reply_under_icon
                                        View view9 = ViewBindings.a(view0, 0x7F0B0D73);  // id:reply_under_icon
                                        if(((AppCompatImageView)view9) != null) {
                                            v = 0x7F0B0D74;  // id:reply_user_memo
                                            View view10 = ViewBindings.a(view0, 0x7F0B0D74);  // id:reply_user_memo
                                            if(((ResizeTextView)view10) != null) {
                                                return new n7(((DividerConstraintLayout)view0), ((TextView)view1), ((ResizeTextView)view2), ((ImageView)view3), ((ResizeTextView)view4), ((ResizeTextView)view5), ((AppCompatImageView)view6), ((ResizeTextView)view7), ((ResizeTextView)view8), ((AppCompatImageView)view9), ((ResizeTextView)view10));
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
    public DividerConstraintLayout b() {
        return this.a;
    }

    @NonNull
    public static n7 c(@NonNull LayoutInflater layoutInflater0) {
        return n7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static n7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0265, viewGroup0, false);  // layout:view_reply_item_text
        if(z) {
            viewGroup0.addView(view0);
        }
        return n7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

