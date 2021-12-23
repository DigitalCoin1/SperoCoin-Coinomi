package com.sperocoin.core.network.interfaces;

import com.sperocoin.core.network.ScriptStatus;
import com.sperocoin.core.network.BlockHeader;
import com.sperocoin.core.network.ServerClient.HistoryTx;

import java.util.List;

/**
 * @author John L. Jegutanis
 */
public interface TransactionEventListener<T> {
    void onNewBlock(BlockHeader header);

    void onBlockUpdate(BlockHeader header);

    void onScriptStatusUpdate(ScriptStatus status);

    void onTransactionHistory(ScriptStatus status, List<HistoryTx> historyTxes);

    void onTransactionUpdate(T transaction);

    void onTransactionBroadcast(T transaction);

    void onTransactionBroadcastError(T transaction);
}
