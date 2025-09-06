package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.b0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import z3.i;

public final class TestDataKt {
    @ProtoDslMarker
    public static final class Dsl {
        public static final class Companion {
            private Companion() {
            }

            public Companion(w w0) {
            }

            @b0
            public final Dsl _create(Builder testDataOuterClass$TestData$Builder0) {
                L.p(testDataOuterClass$TestData$Builder0, "builder");
                return new Dsl(testDataOuterClass$TestData$Builder0, null);
            }
        }

        @l
        public static final Companion Companion;
        @l
        private final Builder _builder;

        static {
            Dsl.Companion = new Companion(null);
        }

        private Dsl(Builder testDataOuterClass$TestData$Builder0) {
            this._builder = testDataOuterClass$TestData$Builder0;
        }

        public Dsl(Builder testDataOuterClass$TestData$Builder0, w w0) {
            this(testDataOuterClass$TestData$Builder0);
        }

        @b0
        public final TestData _build() {
            GeneratedMessageLite generatedMessageLite0 = this._builder.build();
            L.o(generatedMessageLite0, "_builder.build()");
            return (TestData)generatedMessageLite0;
        }

        public final void clearForceCampaignId() {
            this._builder.clearForceCampaignId();
        }

        public final void clearForceCountry() {
            this._builder.clearForceCountry();
        }

        public final void clearForceCountrySubdivision() {
            this._builder.clearForceCountrySubdivision();
        }

        public final void clearForceExchangeTestMode() {
            this._builder.clearForceExchangeTestMode();
        }

        @l
        @i(name = "getForceCampaignId")
        public final String getForceCampaignId() {
            String s = this._builder.getForceCampaignId();
            L.o(s, "_builder.getForceCampaignId()");
            return s;
        }

        @l
        @i(name = "getForceCountry")
        public final String getForceCountry() {
            String s = this._builder.getForceCountry();
            L.o(s, "_builder.getForceCountry()");
            return s;
        }

        @l
        @i(name = "getForceCountrySubdivision")
        public final String getForceCountrySubdivision() {
            String s = this._builder.getForceCountrySubdivision();
            L.o(s, "_builder.getForceCountrySubdivision()");
            return s;
        }

        @i(name = "getForceExchangeTestMode")
        public final int getForceExchangeTestMode() {
            return this._builder.getForceExchangeTestMode();
        }

        public final boolean hasForceCampaignId() {
            return this._builder.hasForceCampaignId();
        }

        public final boolean hasForceCountry() {
            return this._builder.hasForceCountry();
        }

        public final boolean hasForceCountrySubdivision() {
            return this._builder.hasForceCountrySubdivision();
        }

        public final boolean hasForceExchangeTestMode() {
            return this._builder.hasForceExchangeTestMode();
        }

        @i(name = "setForceCampaignId")
        public final void setForceCampaignId(@l String s) {
            L.p(s, "value");
            this._builder.setForceCampaignId(s);
        }

        @i(name = "setForceCountry")
        public final void setForceCountry(@l String s) {
            L.p(s, "value");
            this._builder.setForceCountry(s);
        }

        @i(name = "setForceCountrySubdivision")
        public final void setForceCountrySubdivision(@l String s) {
            L.p(s, "value");
            this._builder.setForceCountrySubdivision(s);
        }

        @i(name = "setForceExchangeTestMode")
        public final void setForceExchangeTestMode(int v) {
            this._builder.setForceExchangeTestMode(v);
        }
    }

    @l
    public static final TestDataKt INSTANCE;

    static {
        TestDataKt.INSTANCE = new TestDataKt();
    }
}

