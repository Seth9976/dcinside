package androidx.core.view.accessibility;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

public interface AccessibilityViewCommand {
    public static abstract class CommandArguments {
        Bundle a;

        @RestrictTo({Scope.c})
        public void a(Bundle bundle0) {
            this.a = bundle0;
        }
    }

    public static final class MoveAtGranularityArguments extends CommandArguments {
        public boolean b() {
            return this.a.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        }

        public int c() {
            return this.a.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        }
    }

    public static final class MoveHtmlArguments extends CommandArguments {
        public String b() {
            return this.a.getString("ACTION_ARGUMENT_HTML_ELEMENT_STRING");
        }
    }

    public static final class MoveWindowArguments extends CommandArguments {
        public int b() {
            return this.a.getInt("ACTION_ARGUMENT_MOVE_WINDOW_X");
        }

        public int c() {
            return this.a.getInt("ACTION_ARGUMENT_MOVE_WINDOW_Y");
        }
    }

    public static final class ScrollToPositionArguments extends CommandArguments {
        public int b() {
            return this.a.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT");
        }

        public int c() {
            return this.a.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT");
        }
    }

    public static final class SetProgressArguments extends CommandArguments {
        public float b() {
            return this.a.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
        }
    }

    public static final class SetSelectionArguments extends CommandArguments {
        public int b() {
            return this.a.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
        }

        public int c() {
            return this.a.getInt("ACTION_ARGUMENT_SELECTION_START_INT");
        }
    }

    public static final class SetTextArguments extends CommandArguments {
        public CharSequence b() {
            return this.a.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        }
    }

    boolean a(View arg1, CommandArguments arg2);
}

