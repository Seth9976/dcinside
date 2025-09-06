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
import kr.better.widget.BetterTextView;

public final class i6 implements ViewBinding {
    @NonNull
    private final DividerConstraintLayout a;
    @NonNull
    public final AppCompatImageView b;
    @NonNull
    public final BetterTextView c;
    @NonNull
    public final ImageView d;
    @NonNull
    public final TextView e;
    @NonNull
    public final View f;

    private i6(@NonNull DividerConstraintLayout dividerConstraintLayout0, @NonNull AppCompatImageView appCompatImageView0, @NonNull BetterTextView betterTextView0, @NonNull ImageView imageView0, @NonNull TextView textView0, @NonNull View view0) {
        this.a = dividerConstraintLayout0;
        this.b = appCompatImageView0;
        this.c = betterTextView0;
        this.d = imageView0;
        this.e = textView0;
        this.f = view0;
    }

    @NonNull
    public static i6 a(@NonNull View view0) {
        int v = 0x7F0B06FB;  // id:list_filter_close
        View view1 = ViewBindings.a(view0, 0x7F0B06FB);  // id:list_filter_close
        if(((AppCompatImageView)view1) != null) {
            v = 0x7F0B06FC;  // id:list_filter_config
            View view2 = ViewBindings.a(view0, 0x7F0B06FC);  // id:list_filter_config
            if(((BetterTextView)view2) != null) {
                v = 0x7F0B06FD;  // id:list_filter_config_icon
                View view3 = ViewBindings.a(view0, 0x7F0B06FD);  // id:list_filter_config_icon
                if(((ImageView)view3) != null) {
                    v = 0x7F0B06FE;  // id:list_filter_text
                    View view4 = ViewBindings.a(view0, 0x7F0B06FE);  // id:list_filter_text
                    if(((TextView)view4) != null) {
                        v = 0x7F0B06FF;  // id:list_filter_underline
                        View view5 = ViewBindings.a(view0, 0x7F0B06FF);  // id:list_filter_underline
                        if(view5 != null) {
                            return new i6(((DividerConstraintLayout)view0), ((AppCompatImageView)view1), ((BetterTextView)view2), ((ImageView)view3), ((TextView)view4), view5);
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
    public static i6 c(@NonNull LayoutInflater layoutInflater0) {
        return i6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static i6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E022C, viewGroup0, false);  // layout:view_post_list_filter
        if(z) {
            viewGroup0.addView(view0);
        }
        return i6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

