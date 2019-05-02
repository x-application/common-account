package x.app.common.account.command

import x.app.common.AbstractResult

/**
 *   @Project: service-user
 *   @Package: x.app.common.account.command
 *   @Author:  Iamee
 *   @Date:    2019-05-03 0:26
 */
class CreateAccountBondCommand(
        accountId: String,
        val accountType: String,
        val userId: String
) : AbstractAccountCommand<CreateAccountBondCommand.Result>(accountId) {

    data class Result(val accountId: String, val userId: String) : AbstractResult()

}