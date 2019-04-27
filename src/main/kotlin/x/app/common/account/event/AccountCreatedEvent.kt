package x.app.common.account.event

/**
 *   @Project: account
 *   @Package: x.app.common.account.event
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:45
 */
class AccountCreatedEvent(
        accountId: String = "",
        val accountType: String = "",
        val password: String = "",
        time: Long = 0L
) : AbstractAccountEvent(accountId, time)