package com.uber.uberApp.services.impl;

import com.uber.uberApp.dto.WalletTransactionDto;
import com.uber.uberApp.entities.WalletTransaction;
import com.uber.uberApp.repositories.WalletTransactionRepository;
import com.uber.uberApp.services.WalletTransactionService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletTransactionServiceImpl implements WalletTransactionService {
    private final WalletTransactionRepository walletTransactionRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createNewWalletTransaction(WalletTransactionDto walletTransactionDtp) {
        WalletTransaction walletTransaction = modelMapper.map(walletTransactionDtp, WalletTransaction.class);
        walletTransactionRepository.save(walletTransaction);

    }
}
