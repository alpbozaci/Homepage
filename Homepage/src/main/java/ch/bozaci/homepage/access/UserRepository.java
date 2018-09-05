package ch.bozaci.homepage.access;

import java.util.logging.Logger;

import javax.transaction.Transactional;

import ch.bozaci.homepage.entity.User;

public class UserRepository extends AbstractRepository 
{
    private static final long serialVersionUID = 1L;
    
    private Logger logger = Logger.getLogger(UserRepository.class.getSimpleName());
    
    
    @Transactional
    public void persistUser (User user)
    {
        logger.info("persisting user: " + user);
        persist(user);
    }

}
