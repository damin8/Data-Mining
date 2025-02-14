package mustra.musicprediction.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@ToString
@AllArgsConstructor
@Document(collection = "feeds")
public class Feed {
    @Setter
    @Id
    private int _id;
    private String rank;
    private String artistName;
    private String songName;
    private String comment;
    private String date;
    @Setter
    private int likeCount = 0;
}
