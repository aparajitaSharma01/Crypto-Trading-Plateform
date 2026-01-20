package com.cryptotrading.service;

import com.cryptotrading.domain.VerificationType;
import com.cryptotrading.model.ForgotPasswordToken;
import com.cryptotrading.model.User;

public interface ForgotPasswordService {

    ForgotPasswordToken createToken(User user, String id, String otp,
                                    VerificationType verificationType,String sendTo);

    ForgotPasswordToken findById(String id);

    ForgotPasswordToken findByUser(Long userId);

    void deleteToken(ForgotPasswordToken token);

    boolean verifyToken(ForgotPasswordToken token,String otp);
}
