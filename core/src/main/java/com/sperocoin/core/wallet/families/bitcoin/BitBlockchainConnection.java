package com.sperocoin.core.wallet.families.bitcoin;

import com.sperocoin.core.network.ScriptStatus;
import com.sperocoin.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(ScriptStatus status, BitTransactionEventListener listener);
}
