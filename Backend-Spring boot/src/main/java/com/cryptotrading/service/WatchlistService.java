package com.cryptotrading.service;

import com.cryptotrading.model.Coin;
import com.cryptotrading.model.User;
import com.cryptotrading.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
