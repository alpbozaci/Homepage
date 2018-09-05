package ch.bozaci.homepage.presentation;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import ch.bozaci.homepage.access.UserRepository;
import ch.bozaci.homepage.entity.User;

@Named("registerBean")
public class RegisterBean
{
    private Logger logger = Logger.getLogger(RegisterBean.class.getSimpleName());
    
    @Inject
    private UserRepository userRepo;
    
    public RegisterBean()
    {
    }
    
    public void register()
    {
        logger.info("YES it works");
        
        User user = new User();
        user.setFirstname("Sinan");
        user.setLastname("Bozaci");
        user.setUsername("sinan.bozaci");
        
        userRepo.persistUser(user);
    }
}
