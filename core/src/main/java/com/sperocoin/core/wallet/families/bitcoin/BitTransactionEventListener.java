package com.sperocoin.core.wallet.families.bitcoin;

import com.sperocoin.core.network.ScriptStatus;
import com.sperocoin.core.network.ServerClient.UnspentTx;
import com.sperocoin.core.network.interfaces.TransactionEventListener;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface BitTransactionEventListener extends TransactionEventListener<BitTransaction> {
    void onUnspentTransactionUpdate(ScriptStatus status, List<UnspentTx> UnspentTxes);
}
