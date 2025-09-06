package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;

public final class e1 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final ConstraintLayout b;
    @NonNull
    public final TextView c;
    @NonNull
    public final TextView d;
    @NonNull
    public final AppCompatCheckBox e;
    @NonNull
    public final TextView f;
    @NonNull
    public final ConstraintLayout g;

    private e1(@NonNull ConstraintLayout constraintLayout0, @NonNull ConstraintLayout constraintLayout1, @NonNull TextView textView0, @NonNull TextView textView1, @NonNull AppCompatCheckBox appCompatCheckBox0, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout2) {
        this.a = constraintLayout0;
        this.b = constraintLayout1;
        this.c = textView0;
        this.d = textView1;
        this.e = appCompatCheckBox0;
        this.f = textView2;
        this.g = constraintLayout2;
    }

    @NonNull
    public static e1 a(@NonNull View view0) {
        int v = 0x7F0B0410;  // id:dialog_delete_all_apply
        View view1 = ViewBindings.a(view0, 0x7F0B0410);  // id:dialog_delete_all_apply
        if(((TextView)view1) != null) {
            v = 0x7F0B0411;  // id:dialog_delete_all_cancel
            View view2 = ViewBindings.a(view0, 0x7F0B0411);  // id:dialog_delete_all_cancel
            if(((TextView)view2) != null) {
                v = 0x7F0B0412;  // id:dialog_delete_all_include_pin_switch
                View view3 = ViewBindings.a(view0, 0x7F0B0412);  // id:dialog_delete_all_include_pin_switch
                if(((AppCompatCheckBox)view3) != null) {
                    v = 0x7F0B0413;  // id:dialog_delete_all_title
                    View view4 = ViewBindings.a(view0, 0x7F0B0413);  // id:dialog_delete_all_title
                    if(((TextView)view4) != null) {
                        v = 0x7F0B0414;  // id:dialog_delete_all_wrap
                        View view5 = ViewBindings.a(view0, 0x7F0B0414);  // id:dialog_delete_all_wrap
                        if(((ConstraintLayout)view5) != null) {
                            return new e1(((ConstraintLayout)view0), ((ConstraintLayout)view0), ((TextView)view1), ((TextView)view2), ((AppCompatCheckBox)view3), ((TextView)view4), ((ConstraintLayout)view5));
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
    public static e1 c(@NonNull LayoutInflater layoutInflater0) {
        return e1.d(layoutInflater0, null, false);
    }

    @NonNull
    public static e1 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E00C4, viewGroup0, false);  // layout:dialog_delete_all_gallery
        if(z) {
            viewGroup0.addView(view0);
        }
        return e1.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

