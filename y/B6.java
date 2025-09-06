package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.view.DividerConstraintLayout;

public final class b6 implements ViewBinding {
    @NonNull
    private final DividerConstraintLayout a;
    @NonNull
    public final TextView b;
    @NonNull
    public final CheckBox c;
    @NonNull
    public final TextView d;
    @NonNull
    public final View e;
    @NonNull
    public final TextView f;

    private b6(@NonNull DividerConstraintLayout dividerConstraintLayout0, @NonNull TextView textView0, @NonNull CheckBox checkBox0, @NonNull TextView textView1, @NonNull View view0, @NonNull TextView textView2) {
        this.a = dividerConstraintLayout0;
        this.b = textView0;
        this.c = checkBox0;
        this.d = textView1;
        this.e = view0;
        this.f = textView2;
    }

    @NonNull
    public static b6 a(@NonNull View view0) {
        int v = 0x7F0B0A57;  // id:post_history_item_edit_archive
        View view1 = ViewBindings.a(view0, 0x7F0B0A57);  // id:post_history_item_edit_archive
        if(((TextView)view1) != null) {
            v = 0x7F0B0A58;  // id:post_history_item_edit_check
            View view2 = ViewBindings.a(view0, 0x7F0B0A58);  // id:post_history_item_edit_check
            if(((CheckBox)view2) != null) {
                v = 0x7F0B0A59;  // id:post_history_item_edit_delete
                View view3 = ViewBindings.a(view0, 0x7F0B0A59);  // id:post_history_item_edit_delete
                if(((TextView)view3) != null) {
                    v = 0x7F0B0A5A;  // id:post_history_item_edit_div
                    View view4 = ViewBindings.a(view0, 0x7F0B0A5A);  // id:post_history_item_edit_div
                    if(view4 != null) {
                        v = 0x7F0B0A5B;  // id:post_history_item_edit_title
                        View view5 = ViewBindings.a(view0, 0x7F0B0A5B);  // id:post_history_item_edit_title
                        if(((TextView)view5) != null) {
                            return new b6(((DividerConstraintLayout)view0), ((TextView)view1), ((CheckBox)view2), ((TextView)view3), view4, ((TextView)view5));
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
    public static b6 c(@NonNull LayoutInflater layoutInflater0) {
        return b6.d(layoutInflater0, null, false);
    }

    @NonNull
    public static b6 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0225, viewGroup0, false);  // layout:view_post_history_item_edit
        if(z) {
            viewGroup0.addView(view0);
        }
        return b6.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

