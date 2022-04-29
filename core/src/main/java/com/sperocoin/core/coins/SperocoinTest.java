package com.sperocoin.core.coins;

/**
 * Created by Kleber on 14/01/2018.
 */
import com.sperocoin.core.coins.families.PeerFamily;

public class SperocoinTest extends PeerFamily {

    private SperocoinTest() {
        id = "spero.test";

        addressHeader = 125;
        p2shHeader = 196;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 5;
        dumpedPrivateKeyHeader = 253;

        name = "Sperocoin";
        symbol = "SPEROt";
        uriScheme = "SperoCoin";
        bip44Index = 130;
        unitExponent = 8;
        feeValue = value(10000); // 0.00001SPERO
        minNonDust = value(10000); // 0.00001SPERO
        softDustLimit = minNonDust;//value(100000);
        softDustPolicy = SoftDustPolicy.NO_POLICY;
        signedMessageHeader = toBytes("SperoTestnet Signed Message:\n");
    }

    private static SperocoinTest instance = new SperocoinTest();
    public static synchronized CoinType get() {
        return instance;
    }
}
