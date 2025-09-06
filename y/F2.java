package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.image.edit.ImageEditorView;

public final class f2 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final FrameLayout b;
    @NonNull
    public final View c;
    @NonNull
    public final ImageEditorView d;
    @NonNull
    public final RecyclerView e;
    @NonNull
    public final ProgressBar f;

    private f2(@NonNull ConstraintLayout constraintLayout0, @NonNull FrameLayout frameLayout0, @NonNull View view0, @NonNull ImageEditorView imageEditorView0, @NonNull RecyclerView recyclerView0, @NonNull ProgressBar progressBar0) {
        this.a = constraintLayout0;
        this.b = frameLayout0;
        this.c = view0;
        this.d = imageEditorView0;
        this.e = recyclerView0;
        this.f = progressBar0;
    }

    @NonNull
    public static f2 a(@NonNull View view0) {
        int v = 0x7F0B05CB;  // id:image_edit_text_additional
        View view1 = ViewBindings.a(view0, 0x7F0B05CB);  // id:image_edit_text_additional
        if(((FrameLayout)view1) != null) {
            v = 0x7F0B05CD;  // id:image_edit_text_div
            View view2 = ViewBindings.a(view0, 0x7F0B05CD);  // id:image_edit_text_div
            if(view2 != null) {
                v = 0x7F0B05CE;  // id:image_edit_text_img
                View view3 = ViewBindings.a(view0, 0x7F0B05CE);  // id:image_edit_text_img
                if(((ImageEditorView)view3) != null) {
                    v = 0x7F0B05CF;  // id:image_edit_text_list
                    View view4 = ViewBindings.a(view0, 0x7F0B05CF);  // id:image_edit_text_list
                    if(((RecyclerView)view4) != null) {
                        v = 0x7F0B05D0;  // id:image_edit_text_progress
                        View view5 = ViewBindings.a(view0, 0x7F0B05D0);  // id:image_edit_text_progress
                        if(((ProgressBar)view5) != null) {
                            return new f2(((ConstraintLayout)view0), ((FrameLayout)view1), view2, ((ImageEditorView)view3), ((RecyclerView)view4), ((ProgressBar)view5));
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
    public static f2 c(@NonNull LayoutInflater layoutInflater0) {
        return f2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static f2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0106, viewGroup0, false);  // layout:fragment_image_edit_text
        if(z) {
            viewGroup0.addView(view0);
        }
        return f2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

