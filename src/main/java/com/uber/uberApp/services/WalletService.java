package com.uber.uberApp.services;

import com.uber.uberApp.entities.User;
import com.uber.uberApp.entities.Wallet;

public interface WalletService {

    Wallet addMoneyToWallet(User user, Double amount);

    void withdrawAllMyMoneyFromWallet();

    Wallet findWalletById(Long walledId);

    Wallet createNewWallet(User user);

}
