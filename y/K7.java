package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DividerConstraintLayout;
import com.dcinside.app.view.ResizeTextView;

public final class k7 implements ViewBinding {
    @NonNull
    private final DividerConstraintLayout a;
    @NonNull
    public final ResizeTextView b;
    @NonNull
    public final TextView c;
    @NonNull
    public final AppCompatImageView d;

    private k7(@NonNull DividerConstraintLayout dividerConstraintLayout0, @NonNull ResizeTextView resizeTextView0, @NonNull TextView textView0, @NonNull AppCompatImageView appCompatImageView0) {
        this.a = dividerConstraintLayout0;
        this.b = resizeTextView0;
        this.c = textView0;
        this.d = appCompatImageView0;
    }

    @NonNull
    public static k7 a(@NonNull View view0) {
        int v = 0x7F0B0D29;  // id:reply_delete_flag
        ResizeTextView resizeTextView0 = (ResizeTextView)ViewBindings.a(view0, 0x7F0B0D29);  // id:reply_delete_flag
        if(resizeTextView0 != null) {
            v = 0x7F0B0D2D;  // id:reply_first_icon
            TextView textView0 = (TextView)ViewBindings.a(view0, 0x7F0B0D2D);  // id:reply_first_icon
            if(textView0 != null) {
                v = 0x7F0B0D73;  // id:reply_under_icon
                AppCompatImageView appCompatImageView0 = (AppCompatImageView)ViewBindings.a(view0, 0x7F0B0D73);  // id:reply_under_icon
                if(appCompatImageView0 != null) {
                    return new k7(((DividerConstraintLayout)view0), resizeTextView0, textView0, appCompatImageView0);
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
    public static k7 c(@NonNull LayoutInflater layoutInflater0) {
        return k7.d(layoutInflater0, null, false);
    }

    @NonNull
    public static k7 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0262, viewGroup0, false);  // layout:view_reply_item_deleted
        if(z) {
            viewGroup0.addView(view0);
        }
        return k7.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

