package Y;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dcinside.app.image.edit.ImageEditorView;

public final class e2 implements ViewBinding {
    @NonNull
    private final ConstraintLayout a;
    @NonNull
    public final View b;
    @NonNull
    public final ImageEditorView c;
    @NonNull
    public final RecyclerView d;
    @NonNull
    public final ProgressBar e;

    private e2(@NonNull ConstraintLayout constraintLayout0, @NonNull View view0, @NonNull ImageEditorView imageEditorView0, @NonNull RecyclerView recyclerView0, @NonNull ProgressBar progressBar0) {
        this.a = constraintLayout0;
        this.b = view0;
        this.c = imageEditorView0;
        this.d = recyclerView0;
        this.e = progressBar0;
    }

    @NonNull
    public static e2 a(@NonNull View view0) {
        int v = 0x7F0B05C6;  // id:image_edit_sticker_div
        View view1 = ViewBindings.a(view0, 0x7F0B05C6);  // id:image_edit_sticker_div
        if(view1 != null) {
            v = 0x7F0B05C7;  // id:image_edit_sticker_img
            View view2 = ViewBindings.a(view0, 0x7F0B05C7);  // id:image_edit_sticker_img
            if(((ImageEditorView)view2) != null) {
                v = 0x7F0B05C9;  // id:image_edit_sticker_list
                View view3 = ViewBindings.a(view0, 0x7F0B05C9);  // id:image_edit_sticker_list
                if(((RecyclerView)view3) != null) {
                    v = 0x7F0B05CA;  // id:image_edit_sticker_progress
                    View view4 = ViewBindings.a(view0, 0x7F0B05CA);  // id:image_edit_sticker_progress
                    if(((ProgressBar)view4) != null) {
                        return new e2(((ConstraintLayout)view0), view1, ((ImageEditorView)view2), ((RecyclerView)view3), ((ProgressBar)view4));
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
    public static e2 c(@NonNull LayoutInflater layoutInflater0) {
        return e2.d(layoutInflater0, null, false);
    }

    @NonNull
    public static e2 d(@NonNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, boolean z) {
        View view0 = layoutInflater0.inflate(0x7F0E0105, viewGroup0, false);  // layout:fragment_image_edit_sticker
        if(z) {
            viewGroup0.addView(view0);
        }
        return e2.a(view0);
    }

    @Override  // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.b();
    }
}

