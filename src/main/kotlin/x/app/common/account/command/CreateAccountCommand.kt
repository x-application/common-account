package x.app.common.account.command

/**
 *   @Project: account
 *   @Package: x.app.common.account.command
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:43
 */
class CreateAccountCommand(
        accountId: String = "",
        accountType: String = "",
        password: String = ""
) : AbstractAccountCommand(accountId)