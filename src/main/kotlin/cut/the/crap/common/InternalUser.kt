package cut.the.crap.common

import cut.the.crap.Model
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class InternalUser(
    @BsonId
    override val _id: String = ObjectId().toString(),
    val email: String = "",
    val hashedPassword: String,
    val exposedId: String
) : Model