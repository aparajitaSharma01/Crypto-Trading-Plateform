package com.cryptotrading.service;

import com.cryptotrading.model.CoinDTO;
import com.cryptotrading.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
