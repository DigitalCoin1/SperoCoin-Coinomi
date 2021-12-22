package com.sperocoin.core.coins;

/**
 * Created by Kleber on 14/01/2018.
 */
import com.sperocoin.core.coins.families.PeerFamily;

public class SperocoinMain extends PeerFamily {

    private SperocoinMain() {
        id = "spero.main";

        addressHeader = 63;
        p2shHeader = 5;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 5;
        //dumpedPrivateKeyHeader = 178;

        name = "Sperocoin";
        symbol = "SPERO";
        uriScheme = "SperoCoin";
        bip44Index = 130;
        unitExponent = 8;
        feeValue = value(10000); // 0.00001SPERO
        minNonDust = value(10000); // 0.00001SPERO
        softDustLimit = minNonDust;//value(100000);
        softDustPolicy = SoftDustPolicy.NO_POLICY;
        signedMessageHeader = toBytes("Spero Signed Message:\n");
    }

    private static SperocoinMain instance = new SperocoinMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
