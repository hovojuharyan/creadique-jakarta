package just.fun.creadique.mapper;

public class MapperFactory {

    private static final CritiqueMapper CRITIQUE_MAPPER = new CritiqueMapper();
    private static final CommentMapper COMMENT_MAPPER = new CommentMapper();
    private static final TopicMapper TOPIC_MAPPER = new TopicMapper();
    private static final UserMapper USER_MAPPER = new UserMapper();

    public static CritiqueMapper critiqueMapperInstance() {
        return CRITIQUE_MAPPER;
    }

    public static CommentMapper commentMapperInstance() {
        return COMMENT_MAPPER;
    }

    public static TopicMapper topicMapperInstance() {
        return TOPIC_MAPPER;
    }

    public static UserMapper userMapperInstance() {
        return USER_MAPPER;
    }
}
