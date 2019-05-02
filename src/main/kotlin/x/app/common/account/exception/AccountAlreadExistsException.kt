package x.app.common.account.exception

/**
 *   @Project: service-user
 *   @Package: x.app.common.account.exception
 *   @Author:  Iamee
 *   @Date:    2019-05-03 2:20
 */
class AccountAlreadExistsException : AbstractAccountException {

    override val code: Int = 0

    constructor()

    constructor(accountId: String) : super(accountId)

}