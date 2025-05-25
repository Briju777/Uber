package com.uber.uberApp.services;

import com.uber.uberApp.dto.WalletTransactionDto;


public interface WalletTransactionService {
    void createNewWalletTransaction(WalletTransactionDto walletTransactionDtp);
}
