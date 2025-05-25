package com.uber.uberApp.services.impl;

import com.uber.uberApp.entities.User;
import com.uber.uberApp.entities.Wallet;
import com.uber.uberApp.exceptions.ResourceNotFoundException;
import com.uber.uberApp.repositories.WalletRepository;
import com.uber.uberApp.repositories.WalletTransactionRepository;
import com.uber.uberApp.services.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService {
    private final WalletRepository walletRepository;


    @Override
    public Wallet addMoneyToWallet(User user, Double amount) {
        Wallet wallet = walletRepository.finByUser(user)
                .orElseThrow(() -> new ResourceNotFoundException("Wallet not found for user with id:" + user.getId()));

        wallet.setBalance(wallet.getBalance() + amount);
        return walletRepository.save(wallet);

    }

    @Override
    public void withdrawAllMyMoneyFromWallet() {

    }

    @Override
    public Wallet findWalletById(Long walletId) {
        return walletRepository.findById(walletId)
                .orElseThrow(() -> new ResourceNotFoundException("Wallet not found with id:" + walletId));
    }

    @Override
    public Wallet createNewWallet(User user) {
        Wallet wallet = new Wallet();
        wallet.setUser(user);
        return walletRepository.save(wallet);
    }
}
