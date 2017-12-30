package com.laibao.spring5.springintroductionandpatterns.repository;

import com.laibao.spring5.springintroductionandpatterns.domain.Account;

/**
 * @author laibao wang
 * @date 2017-12-30
 * @version 1.0
 */
public interface AccountRepository {
    Account findByAccountId(long id);
}
