package x.app.common.account.exception

/**
 *   @Project: service-user
 *   @Package: x.app.common.account.exception
 *   @Author:  Iamee
 *   @Date:    2019-05-03 2:31
 */
class AccountAlreadyBondException : AbstractAccountException {

    override val code: Int = 1

    constructor()

    constructor(accountId: String) : super(accountId = accountId)

}