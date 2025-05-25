package com.uber.uberApp.dto;

import com.uber.uberApp.entities.User;
import com.uber.uberApp.entities.WalletTransaction;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
public class WalletDto {
    private long id;


    private User user;

    private Double balance;

    private List<WalletTransaction> transactions;
}
