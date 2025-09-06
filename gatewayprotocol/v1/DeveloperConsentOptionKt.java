package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class DeveloperConsentOptionKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder developerConsentOuterClass$DeveloperConsentOption$Builder0) {
                L.p(developerConsentOuterClass$DeveloperConsentOption$Builder0, "builder");
                return new Dsl(developerConsentOuterClass$DeveloperConsentOption$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder developerConsentOuterClass$DeveloperConsentOption$Builder0) {
            this._builder = developerConsentOuterClass$DeveloperConsentOption$Builder0;
        }

        public Dsl(Builder developerConsentOuterClass$DeveloperConsentOption$Builder0, w w0) {
            this(developerConsentOuterClass$DeveloperConsentOption$Builder0);
        }

        @b0
        public final DeveloperConsentOption _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (DeveloperConsentOption)generatedMessageLite0;
        }

        public final void clearCustomType() {
            this._builder.clearCustomType();
        }

        public final void clearType() {
            this._builder.clearType();
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @l
        @i(name = "getCustomType")
        public final String getCustomType() {
            String s = this._builder.getCustomType();
            L.o(s, "_builder.getCustomType()");
            return s;
        }

        @l
        @i(name = "getType")
        public final DeveloperConsentType getType() {
            DeveloperConsentType developerConsentOuterClass$DeveloperConsentType0 = this._builder.getType();
            L.o(developerConsentOuterClass$DeveloperConsentType0, "_builder.getType()");
            return developerConsentOuterClass$DeveloperConsentType0;
        }

        @i(name = "getTypeValue")
        public final int getTypeValue() {
            return this._builder.getTypeValue();
        }

        @l
        @i(name = "getValue")
        public final DeveloperConsentChoice getValue() {
            DeveloperConsentChoice developerConsentOuterClass$DeveloperConsentChoice0 = this._builder.getValue();
            L.o(developerConsentOuterClass$DeveloperConsentChoice0, "_builder.getValue()");
            return developerConsentOuterClass$DeveloperConsentChoice0;
        }

        @i(name = "getValueValue")
        public final int getValueValue() {
            return this._builder.getValueValue();
        }

        public final boolean hasCustomType() {
            return this._builder.hasCustomType();
        }

        @i(name = "setCustomType")
        public final void setCustomType(@l String s) {
            L.p(s, "value");
            this._builder.setCustomType(s);
        }

        @i(name = "setType")
        public final void setType(@l DeveloperConsentType developerConsentOuterClass$DeveloperConsentType0) {
            L.p(developerConsentOuterClass$DeveloperConsentType0, "value");
            this._builder.setType(developerConsentOuterClass$DeveloperConsentType0);
        }

        @i(name = "setTypeValue")
        public final void setTypeValue(int v) {
            this._builder.setTypeValue(v);
        }

        @i(name = "setValue")
        public final void setValue(@l DeveloperConsentChoice developerConsentOuterClass$DeveloperConsentChoice0) {
            L.p(developerConsentOuterClass$DeveloperConsentChoice0, "value");
            this._builder.setValue(developerConsentOuterClass$DeveloperConsentChoice0);
        }

        @i(name = "setValueValue")
        public final void setValueValue(int v) {
            this._builder.setValueValue(v);
        }
    }

    @l
    public static final DeveloperConsentOptionKt INSTANCE;

    static {
        DeveloperConsentOptionKt.INSTANCE = new DeveloperConsentOptionKt();
    }
}

