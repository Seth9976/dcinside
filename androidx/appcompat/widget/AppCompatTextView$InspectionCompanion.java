package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import java.util.function.IntFunction;

@RequiresApi(29)
@RestrictTo({Scope.a})
public final class AppCompatTextView.InspectionCompanion implements InspectionCompanion {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public AppCompatTextView.InspectionCompanion() {
        this.a = false;
    }

    public void a(@NonNull AppCompatTextView appCompatTextView0, @NonNull PropertyReader propertyReader0) {
        if(!this.a) {
            throw e.a();
        }
        propertyReader0.readInt(this.b, appCompatTextView0.getAutoSizeMaxTextSize());
        propertyReader0.readInt(this.c, appCompatTextView0.getAutoSizeMinTextSize());
        propertyReader0.readInt(this.d, appCompatTextView0.getAutoSizeStepGranularity());
        propertyReader0.readIntEnum(this.e, appCompatTextView0.getAutoSizeTextType());
        propertyReader0.readObject(this.f, appCompatTextView0.getBackgroundTintList());
        propertyReader0.readObject(this.g, appCompatTextView0.getBackgroundTintMode());
        propertyReader0.readObject(this.h, appCompatTextView0.getCompoundDrawableTintList());
        propertyReader0.readObject(this.i, appCompatTextView0.getCompoundDrawableTintMode());
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper0) {
        this.b = propertyMapper0.mapInt("autoSizeMaxTextSize", attr.autoSizeMaxTextSize);
        this.c = propertyMapper0.mapInt("autoSizeMinTextSize", attr.autoSizeMinTextSize);
        this.d = propertyMapper0.mapInt("autoSizeStepGranularity", attr.autoSizeStepGranularity);
        androidx.appcompat.widget.AppCompatTextView.InspectionCompanion.1 appCompatTextView$InspectionCompanion$10 = new IntFunction() {
            final AppCompatTextView.InspectionCompanion a;

            public String a(int v) {
                switch(v) {
                    case 0: {
                        return "none";
                    }
                    case 1: {
                        return "uniform";
                    }
                    default: {
                        return String.valueOf(v);
                    }
                }
            }

            @Override
            public Object apply(int v) {
                return this.a(v);
            }
        };
        this.e = propertyMapper0.mapIntEnum("autoSizeTextType", attr.autoSizeTextType, appCompatTextView$InspectionCompanion$10);
        this.f = propertyMapper0.mapObject("backgroundTint", attr.backgroundTint);
        this.g = propertyMapper0.mapObject("backgroundTintMode", attr.backgroundTintMode);
        this.h = propertyMapper0.mapObject("drawableTint", attr.drawableTint);
        this.i = propertyMapper0.mapObject("drawableTintMode", attr.drawableTintMode);
        this.a = true;
    }

    @Override  // android.view.inspector.InspectionCompanion
    public void readProperties(@NonNull Object object0, @NonNull PropertyReader propertyReader0) {
        this.a(((AppCompatTextView)object0), propertyReader0);
    }
}

