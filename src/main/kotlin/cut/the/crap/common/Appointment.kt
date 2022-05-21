package cut.the.crap.common

import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class Appointment(
    val location: Place,
    val username: String,
    val userId: Long,
    @BsonId
    val id: String = ObjectId().toString()
)
