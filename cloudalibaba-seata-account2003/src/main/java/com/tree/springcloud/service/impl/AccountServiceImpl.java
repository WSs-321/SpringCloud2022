package com.tree.springcloud.service.impl;

import com.tree.springcloud.dao.AccountsDao;
import com.tree.springcloud.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @BelongsProject: SpringCloud2022
 * @BelongsPackage: com.tree.springcloud.service.impl
 * @Author: WSs_321
 * @CreateTime: 2022-09-14  18:36
 * @Description: TODO
 */
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Resource
    AccountsDao accountsDao;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");
        accountsDao.decrease(userId,money);
        LOGGER.info("------->account-service中扣减账户余额结束");
    }
}
