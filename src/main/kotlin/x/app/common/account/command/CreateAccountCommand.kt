package x.app.common.account.command

import x.app.common.AbstractResult

/**
 *   @Project: account
 *   @Package: x.app.common.account.command
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:43
 */
class CreateAccountCommand(
        accountId: String = "",
        val accountType: String = "",
        val password: String = ""
) : AbstractAccountCommand<CreateAccountCommand.Result>(accountId) {
    data class Result(val accountId: String) : AbstractResult()
}