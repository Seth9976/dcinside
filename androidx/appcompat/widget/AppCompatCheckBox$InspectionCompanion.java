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
public final class AppCompatCheckBox.InspectionCompanion implements InspectionCompanion {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public AppCompatCheckBox.InspectionCompanion() {
        this.a = false;
    }

    public void a(@NonNull AppCompatCheckBox appCompatCheckBox0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw e.a();
        }
        propertyReader0.readObject(this.b, appCompatCheckBox0.getBackgroundTintList());
        propertyReader0.readObject(this.c, appCompatCheckBox0.getBackgroundTintMode());
        propertyReader0.readObject(this.d, appCompatCheckBox0.getButtonTintList());
        propertyReader0.readObject(this.e, appCompatCheckBox0.getButtonTintMode());
        propertyReader0.readObject(this.f, appCompatCheckBox0.getCompoundDrawableTintList());
        propertyReader0.readObject(this.g, appCompatCheckBox0.getCompoundDrawableTintMode());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = propertyMapper0.mapObject("backgroundTint", attr.backgroundTint);
        this.c = propertyMapper0.mapObject("backgroundTintMode", attr.backgroundTintMode);
        this.d = propertyMapper0.mapObject("buttonTint", attr.buttonTint);
        this.e = propertyMapper0.mapObject("buttonTintMode", attr.buttonTintMode);
        this.f = propertyMapper0.mapObject("drawableTint", attr.drawableTint);
        this.g = propertyMapper0.mapObject("drawableTintMode", attr.drawableTintMode);
        this.a = true;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.a(((AppCompatCheckBox)object0), propertyReader0);
    }
}

