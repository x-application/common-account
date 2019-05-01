package x.app.common.account.command

import x.app.common.AbstractResult

/**
 *   @Project: service-user
 *   @Package: x.app.common.account.command
 *   @Author:  Iamee
 *   @Date:    2019-05-01 23:34
 */
class ValidateAccountCommand(
        accountId: String,
        val password: String
) : AbstractAccountCommand<ValidateAccountCommand.Result>(accountId) {

    data class Result(val userId: String, val password: String) : AbstractResult()

}