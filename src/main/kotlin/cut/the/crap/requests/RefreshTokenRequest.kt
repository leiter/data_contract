package cut.the.crap.requests

import cut.the.crap.Model
import kotlinx.serialization.Serializable

@Serializable
data class RefreshTokenRequest(
    override val id: String,
    val refreshToken: String,
) : Model