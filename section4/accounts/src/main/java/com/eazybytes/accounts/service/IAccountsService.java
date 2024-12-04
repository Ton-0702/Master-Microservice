package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountsService {


    /**
     * @param customerDto - CustomerDto Object
     */
    void createAccounts(CustomerDto customerDto);

    /**
     * @param mobileNumber - Input Mobile Number
     * @return Accounts Details based on mobileNumber
     */
    CustomerDto fetchAccountDetails(String mobileNumber);

    /**
     * @param customerDto - customerDto Object
     * @return boolean indicationg if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicatting if the deletion of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
