package cut.the.crap.common

import cut.the.crap.Model
import kotlinx.serialization.Serializable

@Serializable
data class RefreshToken(
    override val id: String,
    val refreshToken: String,
    val expiresAt: Long
) : Model {
    val userId: String = id
}