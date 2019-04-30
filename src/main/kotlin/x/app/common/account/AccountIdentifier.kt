package x.app.common.account

import x.app.common.Identifiable


/**
 *   @Project: account
 *   @Package: x.app.common.account
 *   @Author:  Iamee
 *   @Date:    2019-04-27 23:38
 */
interface AccountIdentifier : Identifiable {

    val accountId: String

    override fun getIdentifier(): String {
        return "Account(id=$accountId)"
    }

}