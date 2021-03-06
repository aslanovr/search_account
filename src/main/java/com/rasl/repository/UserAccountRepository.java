package com.rasl.repository;

import com.rasl.pojo.UserAccount;

public interface UserAccountRepository {
    UserAccount findByLogin(String login);
    int updateLastName (int id, String lastName);
    int updateLastName (String login, String lastName);
}
