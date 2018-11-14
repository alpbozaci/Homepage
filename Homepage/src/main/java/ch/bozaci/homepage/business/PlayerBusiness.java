package ch.bozaci.homepage.business;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;

import ch.bozaci.homepage.access.PlayerRepository;
import ch.bozaci.homepage.entity.Player;

@SessionScoped
public class PlayerBusiness implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private Logger logger = Logger.getLogger(PlayerBusiness.class.getSimpleName());
    
    @Inject
    private PlayerRepository playerRepository;
    
    
    public List<Player> getPlayerList()
    {
        logger.info("getPlayerList");
        return playerRepository.getPlayerList();
    }
}
