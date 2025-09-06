package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;

@RequiresApi(29)
@RestrictTo({Scope.a})
public final class AppCompatImageButton.InspectionCompanion implements InspectionCompanion {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;

    public AppCompatImageButton.InspectionCompanion() {
        this.a = false;
    }

    public void a(@NonNull AppCompatImageButton appCompatImageButton0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw e.a();
        }
        propertyReader0.readObject(this.b, appCompatImageButton0.getBackgroundTintList());
        propertyReader0.readObject(this.c, appCompatImageButton0.getBackgroundTintMode());
        propertyReader0.readObject(this.d, appCompatImageButton0.getImageTintList());
        propertyReader0.readObject(this.e, appCompatImageButton0.getImageTintMode());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = propertyMapper0.mapObject("backgroundTint", attr.backgroundTint);
        this.c = propertyMapper0.mapObject("backgroundTintMode", attr.backgroundTintMode);
        this.d = propertyMapper0.mapObject("tint", attr.tint);
        this.e = propertyMapper0.mapObject("tintMode", attr.tintMode);
        this.a = true;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.a(((AppCompatImageButton)object0), propertyReader0);
    }
}

