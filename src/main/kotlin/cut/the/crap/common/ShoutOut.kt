package cut.the.crap.common

import cut.the.crap.Model
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class ShoutOut(
    @BsonId override val _id: String = ObjectId().toString(),
    val text: String,
    val username: String = "",
    val timestamp: Long = System.currentTimeMillis(),

    ) : Model