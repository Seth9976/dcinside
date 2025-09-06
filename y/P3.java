package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class p3 implements ViewBinding {
    @NonNull
    private final LinearLayout a;
    @NonNull
    public final AppCompatCheckBox b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final TextView e;

    private p3(@NonNull LinearLayout linearLayout0, @NonNull AppCompatCheckBox appCompatCheckBox0, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull TextView textView2) {
        this.a = linearLayout0;
        this.b = appCompatCheckBox0;
        this.c = textView0;
        this.d = textView1;
        this.e = textView2;
    }

    @NonNull
    public static p3 a(@NonNull View view0) {
        int v = 0x7F0B0132;  // id:archive_edit_item_check
        View view1 = ViewBindings.a(view0, 0x7F0B0132);  // id:archive_edit_item_check
        if(((AppCompatCheckBox)view1) != null) {
            v = 0x7F0B0133;  // id:archive_edit_item_folder
            View view2 = ViewBindings.a(view0, 0x7F0B0133);  // id:archive_edit_item_folder
            if(((TextView)view2) != null) {
                v = 0x7F0B0134;  // id:archive_edit_item_subject
                View view3 = ViewBindings.a(view0, 0x7F0B0134);  // id:archive_edit_item_subject
                if(((TextView)view3) != null) {
                    v = 0x7F0B0135;  // id:archive_edit_item_summary
                    View view4 = ViewBindings.a(view0, 0x7F0B0135);  // id:archive_edit_item_summary
                    if(((TextView)view4) != null) {
                        return new p3(((LinearLayout)view0), ((AppCompatCheckBox)view1), ((TextView)view2), ((TextView)view3), ((TextView)view4));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @NonNull
    public LinearLayout b() {
        return this.a;
    }

    @NonNull
    public static p3 c(@NonNull LayoutInflater layoutInflater0) {
        return p3.d(layoutInflater0, null, false);
    }

    @NonNull
    public static p3 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0197, viewGroup0, false);  // layout:view_archive_edit_item
        if(z) {
            viewGroup0.addView(view0);
        }
        return p3.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

