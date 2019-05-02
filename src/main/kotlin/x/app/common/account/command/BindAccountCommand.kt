package x.app.common.account.command

import x.app.common.AbstractResult

/**
 *   @Project: service-user
 *   @Package: x.app.common.account.command
 *   @Author:  Iamee
 *   @Date:    2019-05-03 0:26
 */
class BindAccountCommand(
        accountId: String,
        val accountType: String,
        val userId: String
) : AbstractAccountCommand<BindAccountCommand.Result>(accountId) {

    data class Result(val accountId: String, val userId: String) : AbstractResult()

}