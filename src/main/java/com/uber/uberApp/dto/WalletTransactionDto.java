package com.uber.uberApp.dto;

import com.uber.uberApp.entities.Ride;
import com.uber.uberApp.entities.Wallet;
import com.uber.uberApp.entities.enums.TransactionMethod;
import com.uber.uberApp.entities.enums.TransactionType;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Data
public class WalletTransactionDto {

    private long id;

    private TransactionType transactionType;

    private TransactionMethod transactionMethod;

    private RideDto ride;

    private String transactionId;

    private WalletDto wallet;

    private LocalDateTime timeStamp;
}
