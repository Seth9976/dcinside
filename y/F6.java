package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DividerLinearLayout;

public final class f6 implements ViewBinding {
    @NonNull
    private final DividerLinearLayout a;
    @NonNull
    public final ImageView b;
    @NonNull
    public final ImageView c;
    @NonNull
    public final CheckBox d;
    @NonNull
    public final TextView e;
    @NonNull
    public final TextView f;

    private f6(@NonNull DividerLinearLayout dividerLinearLayout0, @NonNull ImageView imageView0, @NonNull ImageView imageView1, @NonNull CheckBox checkBox0, @NonNull TextView textView0, @NonNull TextView textView1) {
        this.a = dividerLinearLayout0;
        this.b = imageView0;
        this.c = imageView1;
        this.d = checkBox0;
        this.e = textView0;
        this.f = textView1;
    }

    @NonNull
    public static f6 a(@NonNull View view0) {
        int v = 0x7F0B0A60;  // id:post_history_item_post_archive_colored
        View view1 = ViewBindings.a(view0, 0x7F0B0A60);  // id:post_history_item_post_archive_colored
        if(((ImageView)view1) != null) {
            v = 0x7F0B0A61;  // id:post_history_item_post_archive_gray
            View view2 = ViewBindings.a(view0, 0x7F0B0A61);  // id:post_history_item_post_archive_gray
            if(((ImageView)view2) != null) {
                v = 0x7F0B0A62;  // id:post_history_item_post_check
                View view3 = ViewBindings.a(view0, 0x7F0B0A62);  // id:post_history_item_post_check
                if(((CheckBox)view3) != null) {
                    v = 0x7F0B0A63;  // id:post_history_item_post_subject
                    View view4 = ViewBindings.a(view0, 0x7F0B0A63);  // id:post_history_item_post_subject
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0A64;  // id:post_history_item_post_summary
                        View view5 = ViewBindings.a(view0, 0x7F0B0A64);  // id:post_history_item_post_summary
                        if(((TextView)view5) != null) {
                            return new f6(((DividerLinearLayout)view0), ((ImageView)view1), ((ImageView)view2), ((CheckBox)view3), ((TextView)view4), ((TextView)view5));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public DividerLinearLayout b() {
        return this.a;
    }

    @NonNull
    public static f6 c(@NonNull LayoutInflater layoutInflater0) {
        return f6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static f6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0229, viewGroup0, false);  // layout:view_post_history_item_post
        if(z) {
            viewGroup0.addView(view0);
        }
        return f6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

