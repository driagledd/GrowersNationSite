package org.growersnation.site.repository.mongo;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.inject.Inject;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBObject;
import org.growersnation.site.model.security.User;
import org.growersnation.site.repository.UserRepository;
import org.mongojack.JacksonDBCollection;

import java.util.UUID;

/**
 * <p>Repository to provide MongoDB-based persistence to {@link UserRepository}:</p>
 *
 * @since 0.0.1
 *
 */
public class MongoUserRepository extends BaseMongoRepository<User, String> implements UserRepository {

  @Inject
  public MongoUserRepository(DB mongoDb) {
    super(mongoDb,
      JacksonDBCollection.wrap(
        mongoDb.getCollection("users"),
        User.class,
        String.class));
  }

  @Override
  public Optional<User> getBySessionToken(UUID sessionToken) {

    Preconditions.checkNotNull(sessionToken);

    // Configure the query
    DBObject query = new BasicDBObject("sessionToken",sessionToken);

    return Optional.fromNullable(entitiesCollection.findOne(query));
  }

  @Override
  public void hardDelete(User entity) {

    Preconditions.checkNotNull(entity);

    entitiesCollection.remove(entity);

  }
}
