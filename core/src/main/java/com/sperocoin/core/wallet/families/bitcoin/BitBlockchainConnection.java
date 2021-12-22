package com.sperocoin.core.wallet.families.bitcoin;

import com.sperocoin.core.network.AddressStatus;
import com.sperocoin.core.network.interfaces.BlockchainConnection;

/**
 * @author John L. Jegutanis
 */
public interface BitBlockchainConnection extends BlockchainConnection<BitTransaction> {
    void getUnspentTx(AddressStatus status, BitTransactionEventListener listener);
}
