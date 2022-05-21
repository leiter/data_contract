package cut.the.crap.common

import cut.the.crap.Model
import kotlinx.serialization.Serializable
import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId

@Serializable
data class ChatRoom(
    @BsonId override val _id: String = ObjectId().toString(),
    val userAccess: Map<String, Long> = hashMapOf(),  // userId and timestamp
    val allMessages: List<Message> = emptyList()
) : Model